package dev.epro.r0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.Closeable;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K4208957213304427756 implements SupportSQLiteDatabase {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final K7493131619793429513 d;
    public static final K7493131619793429513 e;
    public final SQLiteDatabase a;

    static {
        U1207462583958712397 u1207462583958712397 = new U1207462583958712397((byte) 21);
        G14718160286012243331 g14718160286012243331 = G14718160286012243331.b;
        d = M9216324016624295870.L(g14718160286012243331, u1207462583958712397);
        e = M9216324016624295870.L(g14718160286012243331, new U1207462583958712397((byte) 22));
    }

    public K4208957213304427756(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        this.a.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionReadOnly() {
        K7493131619793429513 k7493131619793429513 = e;
        if (((Method) k7493131619793429513.getValue()) != null) {
            K7493131619793429513 k74931316197934295132 = d;
            if (((Method) k74931316197934295132.getValue()) != null) {
                Method method = (Method) k7493131619793429513.getValue();
                method.getClass();
                Method method2 = (Method) k74931316197934295132.getValue();
                method2.getClass();
                Object invoke = method2.invoke(this.a, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    S10973172697741180971.m("Required value was null.");
                    return;
                }
            }
        }
        beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.a.compileStatement(str);
        compileStatement.getClass();
        return new E1376717277420298225(compileStatement);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void disableWriteAheadLogging() {
        this.a.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean enableWriteAheadLogging() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void endTransaction() {
        this.a.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str, Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.a.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        M9197813449740923653 m9197813449740923653 = (M9197813449740923653) supportSQLiteQuery;
        final L14660234597990339555 l14660234597990339555 = new L14660234597990339555(m9197813449740923653, (byte) 1);
        Cursor rawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: dev.epro.r0.J9087614422508600858
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) L14660234597990339555.this.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ((N282309437460792485) m9197813449740923653.b).b, c, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        this.a.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int i2 = 0;
        if (contentValues.size() == 0) {
            S10973172697741180971.j("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[3]);
        sb.append("WorkSpec SET ");
        int i3 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i3 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i3] = contentValues.get(str3);
            sb.append("=?");
            i3++;
        }
        for (int i4 = size; i4 < length; i4++) {
            objArr2[i4] = objArr[i4 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        Closeable compileStatement = compileStatement(sb.toString());
        while (i2 < length) {
            Object obj = objArr2[i2];
            i2++;
            if (obj == null) {
                ((R16659805086402753450) compileStatement).bindNull(i2);
            } else if (obj instanceof byte[]) {
                ((R16659805086402753450) compileStatement).a.bindBlob(i2, (byte[]) obj);
            } else if (obj instanceof Float) {
                ((R16659805086402753450) compileStatement).bindDouble(i2, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                ((R16659805086402753450) compileStatement).bindDouble(i2, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                ((R16659805086402753450) compileStatement).bindLong(i2, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ((R16659805086402753450) compileStatement).bindLong(i2, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ((R16659805086402753450) compileStatement).bindLong(i2, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ((R16659805086402753450) compileStatement).bindLong(i2, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                ((R16659805086402753450) compileStatement).a.bindString(i2, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ((R16659805086402753450) compileStatement).bindLong(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((E1376717277420298225) compileStatement).b.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str) {
        this.a.execSQL(str);
    }
}
