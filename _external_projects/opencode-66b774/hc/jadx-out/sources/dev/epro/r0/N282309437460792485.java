package dev.epro.r0;

import android.database.Cursor;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N282309437460792485 extends S4654969512817416603 {
    public int[] d;
    public long[] e;
    public double[] f;
    public String[] g;
    public byte[][] h;
    public Cursor i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N282309437460792485(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    public static void e(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            S12227320117525376577.w(25, "column index out of range");
            throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        b();
        c(4, i);
        this.d[i] = 4;
        this.h[i] = bArr;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindDouble(int i, double d) {
        b();
        c(2, i);
        this.d[i] = 2;
        this.f[i] = d;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindLong(int i, long j) {
        b();
        c(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindNull(int i) {
        b();
        c(5, i);
        this.d[i] = 5;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindText(int i, String str) {
        str.getClass();
        b();
        c(3, i);
        this.d[i] = 3;
        this.g[i] = str;
    }

    public final void c(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i3) {
                this.e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f;
            if (dArr.length < i3) {
                this.f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.g;
            if (strArr.length < i3) {
                this.g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.h;
        if (bArr.length < i3) {
            this.h = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // dev.epro.r0.S4654969512817416603, androidx.sqlite.SQLiteStatement
    public final void clearBindings() {
        b();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.h = new byte[0][];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            clearBindings();
            reset();
        }
        this.c = true;
    }

    public final void d() {
        if (this.i == null) {
            this.i = this.a.query(new M9197813449740923653(this, (byte) 17));
        }
    }

    public final Cursor g() {
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor;
        }
        S12227320117525376577.w(21, "no row");
        throw null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final byte[] getBlob(int i) {
        b();
        Cursor cursorG = g();
        e(cursorG, i);
        byte[] blob = cursorG.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnCount() {
        b();
        d();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getColumnName(int i) {
        b();
        d();
        Cursor cursor = this.i;
        if (cursor == null) {
            S10973172697741180971.m("Required value was null.");
            return null;
        }
        e(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnType(int i) {
        b();
        d();
        Cursor cursor = this.i;
        if (cursor == null) {
            S10973172697741180971.m("Required value was null.");
            return 0;
        }
        e(cursor, i);
        int type = cursor.getType(i);
        int type2 = cursor.getType(i);
        if (type2 == 0) {
            return 5;
        }
        int i2 = 1;
        if (type2 != 1) {
            i2 = 2;
            if (type2 != 2) {
                i2 = 3;
                if (type2 != 3) {
                    if (type2 == 4) {
                        return 4;
                    }
                    D11988991656201568495.h(type, "Unknown field type: ");
                    return 0;
                }
            }
        }
        return i2;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final double getDouble(int i) {
        b();
        Cursor cursorG = g();
        e(cursorG, i);
        return cursorG.getDouble(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final long getLong(int i) {
        b();
        Cursor cursorG = g();
        e(cursorG, i);
        return cursorG.getLong(i);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getText(int i) {
        b();
        Cursor cursorG = g();
        e(cursorG, i);
        String string = cursorG.getString(i);
        string.getClass();
        return string;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean isNull(int i) {
        b();
        Cursor cursorG = g();
        e(cursorG, i);
        return cursorG.isNull(i);
    }

    @Override // dev.epro.r0.S4654969512817416603, androidx.sqlite.SQLiteStatement
    public final void reset() {
        b();
        Cursor cursor = this.i;
        if (cursor != null) {
            cursor.close();
        }
        this.i = null;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean step() {
        b();
        d();
        Cursor cursor = this.i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        S10973172697741180971.m("Required value was null.");
        return false;
    }
}
