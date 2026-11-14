package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.Logger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class SQLiteQuery extends SQLiteProgram implements SupportSQLiteQuery {
    private static final String TAG = "SQLiteQuery";
    private final CancellationSignal mCancellationSignal;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.mCancellationSignal = cancellationSignal;
    }

    private void bindArgumentToProgram(SupportSQLiteProgram supportSQLiteProgram, int i, Object obj) {
        if (obj == null) {
            supportSQLiteProgram.bindNull(i);
            return;
        }
        if (obj instanceof byte[]) {
            supportSQLiteProgram.bindBlob(i, (byte[]) obj);
            return;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            supportSQLiteProgram.bindDouble(i, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            supportSQLiteProgram.bindLong(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
            supportSQLiteProgram.bindLong(i, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            supportSQLiteProgram.bindString(i, (String) obj);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " supported types: null, byte[], float, double, int, long, boolean, String");
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        Object[] bindArgs = getBindArgs();
        if (bindArgs == null) {
            return;
        }
        int i = 0;
        while (i < bindArgs.length) {
            int i2 = i + 1;
            bindArgumentToProgram(supportSQLiteProgram, i2, bindArgs[i]);
            i = i2;
        }
    }

    public int fillWindow(CursorWindow cursorWindow, int i, int i2, boolean z) {
        acquireReference();
        try {
            try {
                cursorWindow.acquireReference();
            } catch (Throwable th) {
                releaseReference();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
        } catch (SQLiteDatabaseCorruptException e) {
            e = e;
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            cursorWindow.releaseReference();
            throw th4;
        }
        try {
            int executeForCursorWindow = getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
            cursorWindow.releaseReference();
            releaseReference();
            return executeForCursorWindow;
        } catch (SQLiteDatabaseCorruptException e3) {
            e = e3;
            SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
            onCorruption(sQLiteDatabaseCorruptException);
            throw sQLiteDatabaseCorruptException;
        } catch (SQLiteException e4) {
            e = e4;
            SQLiteException sQLiteException = e;
            Logger.e(TAG, "exception: " + sQLiteException.getMessage() + "; query: " + getSql());
            throw sQLiteException;
        }
    }

    public int getArgCount() {
        Object[] bindArgs = getBindArgs();
        if (bindArgs == null) {
            return 0;
        }
        return bindArgs.length;
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteProgram, androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return super.getSql();
    }

    public String toString() {
        return "SQLiteQuery: " + getSql();
    }
}
