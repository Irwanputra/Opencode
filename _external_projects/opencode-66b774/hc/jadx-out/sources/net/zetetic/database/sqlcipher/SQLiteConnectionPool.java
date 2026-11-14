package net.zetetic.database.sqlcipher;

import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;
import android.util.Printer;
import dev.epro.r0.S10973172697741180971;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import net.zetetic.database.Logger;
import net.zetetic.database.sqlcipher.SQLiteDebug;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class SQLiteConnectionPool implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 30000;
    private static final String TAG = "SQLiteConnectionPool";
    private SQLiteConnection mAvailablePrimaryConnection;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private boolean mIsOpen;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private final CloseGuard mCloseGuard = CloseGuard.get();
    private final Object mLock = new Object();
    private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections = new ArrayList<>();
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections = new WeakHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    private SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.mConnectionWaiterQueue; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.mNext) {
                connectionWaiter2 = connectionWaiter3;
            }
            ConnectionWaiter connectionWaiter4 = connectionWaiter.mNext;
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter4;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter4;
            }
            connectionWaiter.mException = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (true) {
            ArrayList<SQLiteConnection> arrayList = this.mAvailableNonPrimaryConnections;
            if (i >= size) {
                arrayList.clear();
                return;
            } else {
                closeConnectionAndLogExceptionsLocked(arrayList.get(i));
                i++;
            }
        }
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (RuntimeException e) {
            Logger.e(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection, e);
        }
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size <= this.mMaxConnectionPoolSize - 1) {
                return;
            }
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
            size = i;
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    }

    private void dispose(boolean z) {
        CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (z) {
            return;
        }
        synchronized (this.mLock) {
            try {
                throwIfClosedLocked();
                this.mIsOpen = $assertionsDisabled;
                closeAvailableConnectionsAndLogExceptionsLocked();
                int size = this.mAcquiredConnections.size();
                if (size != 0) {
                    Logger.i(TAG, "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + size + " connections in use.  They will be closed as they are released back to the pool.");
                }
                wakeConnectionWaitersLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations((i & 1) != 0 ? true : $assertionsDisabled);
            this.mAcquiredConnections.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e) {
            Logger.e(TAG, "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i);
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e;
        }
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return $assertionsDisabled;
        }
        int priority = getPriority(i);
        while (priority <= connectionWaiter.mPriority) {
            if (z || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return $assertionsDisabled;
            }
        }
        return $assertionsDisabled;
    }

    private void logConnectionPoolBusyLocked(long j, int i) {
        int i2;
        int i3;
        Thread threadCurrentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder("The connection pool for database '");
        sb.append(this.mConfiguration.label);
        sb.append("' has been unable to grant a connection to thread ");
        sb.append(threadCurrentThread.getId());
        sb.append(" (");
        sb.append(threadCurrentThread.getName());
        sb.append(") with flags 0x");
        sb.append(Integer.toHexString(i));
        sb.append(" for ");
        sb.append(j * 0.001f);
        sb.append(" seconds.\n");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        if (this.mAcquiredConnections.isEmpty()) {
            i2 = 0;
            i3 = 0;
        } else {
            Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
            i2 = 0;
            i3 = 0;
            while (it.hasNext()) {
                String strDescribeCurrentOperationUnsafe = it.next().describeCurrentOperationUnsafe();
                if (strDescribeCurrentOperationUnsafe != null) {
                    arrayList.add(strDescribeCurrentOperationUnsafe);
                    i2++;
                } else {
                    i3++;
                }
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size++;
        }
        sb.append("Connections: ");
        sb.append(i2);
        sb.append(" active, ");
        sb.append(i3);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            int size2 = arrayList.size();
            while (i4 < size2) {
                Object obj = arrayList.get(i4);
                i4++;
                sb.append("  ");
                sb.append((String) obj);
                sb.append("\n");
            }
        }
        Logger.w(TAG, sb.toString());
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.mAcquiredConnections.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.mAcquiredConnections.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.mAcquiredConnections.put((SQLiteConnection) arrayList.get(i), acquiredConnectionStatus);
        }
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new ConnectionWaiter(0);
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mIsOpen = true;
        this.mCloseGuard.open("close");
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z);
    }

    private void reconfigureAllConnectionsLocked() {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                Logger.e(TAG, "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection, e);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                Logger.e(TAG, "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection2, e2);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i);
                size--;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                Logger.e(TAG, "Failed to reconfigure released connection, closing it: " + sQLiteConnection, e);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return $assertionsDisabled;
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    private void setMaxConnectionPoolSizeLocked() {
        if ((this.mConfiguration.openFlags & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
            this.mMaxConnectionPoolSize = SQLiteGlobal.getWALConnectionPoolSize();
        } else {
            this.mMaxConnectionPoolSize = 1;
        }
    }

    private void throwIfClosedLocked() {
        if (this.mIsOpen) {
            return;
        }
        S10973172697741180971.m("Cannot perform this operation because the connection pool has been closed.");
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection sQLiteConnectionRemove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(sQLiteConnectionRemove, i);
            return sQLiteConnectionRemove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(this.mConfiguration, $assertionsDisabled);
        finishAcquireConnectionLocked(sQLiteConnectionOpenConnectionLocked, i);
        return sQLiteConnectionOpenConnectionLocked;
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i) {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().isPrimaryConnection()) {
                return null;
            }
        }
        SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(sQLiteConnectionOpenConnectionLocked, i);
        return sQLiteConnectionOpenConnectionLocked;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private net.zetetic.database.sqlcipher.SQLiteConnection waitForConnection(java.lang.String r19, int r20, android.os.CancellationSignal r21) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.zetetic.database.sqlcipher.SQLiteConnectionPool.waitForConnection(java.lang.String, int, android.os.CancellationSignal):net.zetetic.database.sqlcipher.SQLiteConnection");
    }

    private void wakeConnectionWaitersLocked() {
        SQLiteConnection sQLiteConnectionTryAcquirePrimaryConnectionLocked;
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnectionTryAcquirePrimaryConnectionLocked = null;
                    } else {
                        sQLiteConnectionTryAcquirePrimaryConnectionLocked = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnectionTryAcquirePrimaryConnectionLocked == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnectionTryAcquirePrimaryConnectionLocked == null && !z2 && (sQLiteConnectionTryAcquirePrimaryConnectionLocked = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags)) == null) {
                        z2 = true;
                    }
                    if (sQLiteConnectionTryAcquirePrimaryConnectionLocked != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnectionTryAcquirePrimaryConnectionLocked;
                    } else if (z && z2) {
                        return;
                    } else {
                        z3 = false;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.mException = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public SQLiteConnection acquireConnection(String str, int i, CancellationSignal cancellationSignal) {
        return waitForConnection(str, i, cancellationSignal);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dispose($assertionsDisabled);
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            try {
                SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
                if (sQLiteConnection != null) {
                    sQLiteConnection.collectDbStats(arrayList);
                }
                ArrayList<SQLiteConnection> arrayList2 = this.mAvailableNonPrimaryConnections;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    SQLiteConnection sQLiteConnection2 = arrayList2.get(i);
                    i++;
                    sQLiteConnection2.collectDbStats(arrayList);
                }
                Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
                while (it.hasNext()) {
                    it.next().collectDbStatsUnsafe(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            try {
                printer.println("Connection pool for " + this.mConfiguration.path + ":");
                StringBuilder sb = new StringBuilder("  Open: ");
                sb.append(this.mIsOpen);
                printer.println(sb.toString());
                printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
                printer.println("  Available primary connection:");
                SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
                if (sQLiteConnection != null) {
                    sQLiteConnection.dump(printer, z);
                } else {
                    printer.println("<none>");
                }
                printer.println("  Available non-primary connections:");
                int i = 0;
                if (this.mAvailableNonPrimaryConnections.isEmpty()) {
                    printer.println("<none>");
                } else {
                    int size = this.mAvailableNonPrimaryConnections.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.mAvailableNonPrimaryConnections.get(i2).dump(printer, z);
                    }
                }
                printer.println("  Acquired connections:");
                if (this.mAcquiredConnections.isEmpty()) {
                    printer.println("<none>");
                } else {
                    for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                        entry.getKey().dumpUnsafe(printer, z);
                        printer.println("  Status: " + entry.getValue());
                    }
                }
                printer.println("  Connection waiters:");
                if (this.mConnectionWaiterQueue != null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                    while (connectionWaiter != null) {
                        printer.println(i + ": waited for " + ((jUptimeMillis - connectionWaiter.mStartTime) * 0.001f) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                        connectionWaiter = connectionWaiter.mNext;
                        i++;
                    }
                } else {
                    printer.println("<none>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void enableLocalizedCollators() {
        SQLiteConnection sQLiteConnection;
        synchronized (this.mLock) {
            try {
                if (!this.mAcquiredConnections.isEmpty() || (sQLiteConnection = this.mAvailablePrimaryConnection) == null) {
                    throw new IllegalStateException("Cannot enable localized collators while database is in use");
                }
                sQLiteConnection.enableLocalizedCollators();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public void onConnectionLeaked() {
        Logger.w(TAG, "A SQLiteConnection object for database '" + this.mConfiguration.label + "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
        this.mConnectionLeaked.set(true);
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            S10973172697741180971.j("configuration must not be null.");
            return;
        }
        synchronized (this.mLock) {
            try {
                throwIfClosedLocked();
                boolean z = ((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? true : $assertionsDisabled;
                if (z) {
                    if (!this.mAcquiredConnections.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                }
                if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled && !this.mAcquiredConnections.isEmpty()) {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                if (!Arrays.equals(sQLiteDatabaseConfiguration.password, this.mConfiguration.password)) {
                    this.mAvailablePrimaryConnection.changePassword(sQLiteDatabaseConfiguration.password);
                    this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                    reconfigureAllConnectionsLocked();
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
                if (sQLiteDatabaseConfiguration2.openFlags != sQLiteDatabaseConfiguration.openFlags) {
                    if (z) {
                        closeAvailableConnectionsAndLogExceptionsLocked();
                    }
                    SQLiteConnection sQLiteConnectionOpenConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                    closeAvailableConnectionsAndLogExceptionsLocked();
                    discardAcquiredConnectionsLocked();
                    this.mAvailablePrimaryConnection = sQLiteConnectionOpenConnectionLocked;
                    this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked();
                } else {
                    sQLiteDatabaseConfiguration2.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked();
                    closeExcessConnectionsAndLogExceptionsLocked();
                    reconfigureAllConnectionsLocked();
                }
                wakeConnectionWaitersLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releaseConnection(SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            try {
                AcquiredConnectionStatus acquiredConnectionStatusRemove = this.mAcquiredConnections.remove(sQLiteConnection);
                if (acquiredConnectionStatusRemove == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.mIsOpen) {
                    closeConnectionAndLogExceptionsLocked(sQLiteConnection);
                } else if (sQLiteConnection.isPrimaryConnection()) {
                    if (recycleConnectionLocked(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.mAvailablePrimaryConnection = sQLiteConnection;
                    }
                    wakeConnectionWaitersLocked();
                } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                    closeConnectionAndLogExceptionsLocked(sQLiteConnection);
                } else {
                    if (recycleConnectionLocked(sQLiteConnection, acquiredConnectionStatusRemove)) {
                        this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                    }
                    wakeConnectionWaitersLocked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            try {
                if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.mIsOpen) {
                    return $assertionsDisabled;
                }
                return isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.mConfiguration.path;
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        public /* synthetic */ ConnectionWaiter(int i) {
            this();
        }

        private ConnectionWaiter() {
        }
    }

    public static SQLiteConnectionPool open(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration != null) {
            SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
            sQLiteConnectionPool.open();
            return sQLiteConnectionPool;
        }
        S10973172697741180971.j("configuration must not be null.");
        return null;
    }
}
