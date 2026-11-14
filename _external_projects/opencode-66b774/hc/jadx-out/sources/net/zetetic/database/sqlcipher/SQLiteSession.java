package net.zetetic.database.sqlcipher;

import android.database.DatabaseUtils;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import dev.epro.r0.S10973172697741180971;
import net.zetetic.database.CursorWindow;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class SQLiteSession {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private Transaction mTransactionPool;
    private Transaction mTransactionStack;

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool != null) {
            this.mConnectionPool = sQLiteConnectionPool;
        } else {
            S10973172697741180971.j("connectionPool must not be null");
            throw null;
        }
    }

    private void acquireConnection(String str, int i, CancellationSignal cancellationSignal) {
        if (this.mConnection == null) {
            this.mConnection = this.mConnectionPool.acquireConnection(str, i, cancellationSignal);
            this.mConnectionFlags = i;
        }
        this.mConnectionUseCount++;
    }

    private void beginTransactionUnchecked(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (this.mTransactionStack == null) {
            acquireConnection(null, i2, cancellationSignal);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i != 1) {
                    SQLiteConnection sQLiteConnection = this.mConnection;
                    if (i != 2) {
                        sQLiteConnection.execute("BEGIN;", null, cancellationSignal);
                    } else {
                        sQLiteConnection.execute("BEGIN EXCLUSIVE;", null, cancellationSignal);
                    }
                } else {
                    this.mConnection.execute("BEGIN IMMEDIATE;", null, cancellationSignal);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (RuntimeException e) {
                    if (this.mTransactionStack == null) {
                        this.mConnection.execute("ROLLBACK;", null, cancellationSignal);
                    }
                    throw e;
                }
            }
            Transaction transactionObtainTransaction = obtainTransaction(i, sQLiteTransactionListener);
            transactionObtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = transactionObtainTransaction;
        } catch (Throwable th) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th;
        }
    }

    private void endTransactionUnchecked(CancellationSignal cancellationSignal, boolean z) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        Transaction transaction = this.mTransactionStack;
        boolean z2 = transaction.mMarkedSuccessful;
        boolean z3 = $assertionsDisabled;
        boolean z4 = (z2 || z) && !transaction.mChildFailed;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            try {
                if (z4) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
                z3 = z4;
                e = null;
            } catch (RuntimeException e) {
                e = e;
            }
        } else {
            z3 = z4;
            e = null;
        }
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        Transaction transaction2 = this.mTransactionStack;
        if (transaction2 == null) {
            SQLiteConnection sQLiteConnection = this.mConnection;
            try {
                if (z3) {
                    sQLiteConnection.execute("COMMIT;", null, cancellationSignal);
                } else {
                    sQLiteConnection.execute("ROLLBACK;", null, cancellationSignal);
                }
                releaseConnection();
            } catch (Throwable th) {
                releaseConnection();
                throw th;
            }
        } else if (!z3) {
            transaction2.mChildFailed = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean executeSpecial(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        int sqlStatementType = DatabaseUtils.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, null, i, cancellationSignal);
            return true;
        }
        if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(cancellationSignal);
            return true;
        }
        if (sqlStatementType != 6) {
            return $assertionsDisabled;
        }
        endTransaction(cancellationSignal);
        return true;
    }

    private Transaction obtainTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.mTransactionPool;
        int i2 = 0;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = $assertionsDisabled;
            transaction.mChildFailed = $assertionsDisabled;
        } else {
            transaction = new Transaction(i2);
        }
        transaction.mMode = i;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    private void recycleTransaction(Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    private void releaseConnection() {
        int i = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i;
        if (i == 0) {
            try {
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            S10973172697741180971.m("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack != null) {
            return;
        }
        S10973172697741180971.m("Cannot perform this operation because there is no current transaction.");
    }

    private void throwIfTransactionMarkedSuccessful() {
        Transaction transaction = this.mTransactionStack;
        if (transaction == null || !transaction.mMarkedSuccessful) {
            return;
        }
        S10973172697741180971.m("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
    }

    private boolean yieldTransactionUnchecked(long j, CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return $assertionsDisabled;
        }
        Transaction transaction = this.mTransactionStack;
        int i = transaction.mMode;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(cancellationSignal, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
        return true;
    }

    public void beginTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, CancellationSignal cancellationSignal) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, cancellationSignal);
    }

    public void endTransaction(CancellationSignal cancellationSignal) {
        throwIfNoTransaction();
        endTransactionUnchecked(cancellationSignal, $assertionsDisabled);
    }

    public void execute(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
        } else {
            if (executeSpecial(str, objArr, i, cancellationSignal)) {
                return;
            }
            acquireConnection(str, i, cancellationSignal);
            try {
                this.mConnection.execute(str, objArr, cancellationSignal);
            } finally {
                releaseConnection();
            }
        }
    }

    public ParcelFileDescriptor executeForBlobFileDescriptor(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return null;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return null;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForBlobFileDescriptor(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return 0;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForChangedRowCount(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return 0;
        }
        if (cursorWindow == null) {
            S10973172697741180971.j("window must not be null.");
            return 0;
        }
        if (executeSpecial(str, objArr, i3, cancellationSignal)) {
            cursorWindow.clear();
            return 0;
        }
        acquireConnection(str, i3, cancellationSignal);
        try {
            return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return 0L;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForLastInsertedRowId(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLong(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return 0L;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return 0L;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForLong(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public String executeForString(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return null;
        }
        if (executeSpecial(str, objArr, i, cancellationSignal)) {
            return null;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            return this.mConnection.executeForString(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public void executeRaw(String str, Object[] objArr, int i, CancellationSignal cancellationSignal) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return;
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            this.mConnection.executeRaw(str, objArr, cancellationSignal);
        } finally {
            releaseConnection();
        }
    }

    public boolean hasConnection() {
        if (this.mConnection != null) {
            return true;
        }
        return $assertionsDisabled;
    }

    public boolean hasNestedTransaction() {
        Transaction transaction = this.mTransactionStack;
        if (transaction == null || transaction.mParent == null) {
            return $assertionsDisabled;
        }
        return true;
    }

    public boolean hasTransaction() {
        if (this.mTransactionStack != null) {
            return true;
        }
        return $assertionsDisabled;
    }

    public void prepare(String str, int i, CancellationSignal cancellationSignal, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            S10973172697741180971.j("sql must not be null.");
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        acquireConnection(str, i, cancellationSignal);
        try {
            this.mConnection.prepare(str, sQLiteStatementInfo);
        } finally {
            releaseConnection();
        }
    }

    public void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public boolean yieldTransaction(long j, boolean z, CancellationSignal cancellationSignal) {
        if (z) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else {
            Transaction transaction = this.mTransactionStack;
            if (transaction == null || transaction.mMarkedSuccessful || transaction.mParent != null) {
                return $assertionsDisabled;
            }
        }
        return this.mTransactionStack.mChildFailed ? $assertionsDisabled : yieldTransactionUnchecked(j, cancellationSignal);
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Transaction {
        public boolean mChildFailed;
        public SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public Transaction mParent;

        public /* synthetic */ Transaction(int i) {
            this();
        }

        private Transaction() {
        }
    }
}
