package dev.epro.r0;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F6585841228995144384 extends S4654969512817416603 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6585841228995144384(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.e = supportSQLiteDatabase.compileStatement(str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindBlob(int i, byte[] bArr) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                bArr.getClass();
                ((N282309437460792485) obj).bindBlob(i, bArr);
                return;
            case 1:
                bArr.getClass();
                b();
                ((SupportSQLiteStatement) obj).bindBlob(i, bArr);
                return;
            default:
                bArr.getClass();
                b();
                S12227320117525376577.w(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindDouble(int i, double d) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((N282309437460792485) obj).bindDouble(i, d);
                return;
            case 1:
                b();
                ((SupportSQLiteStatement) obj).bindDouble(i, d);
                return;
            default:
                b();
                S12227320117525376577.w(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindLong(int i, long j) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((N282309437460792485) obj).bindLong(i, j);
                return;
            case 1:
                b();
                ((SupportSQLiteStatement) obj).bindLong(i, j);
                return;
            default:
                b();
                S12227320117525376577.w(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindNull(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((N282309437460792485) obj).bindNull(i);
                return;
            case 1:
                b();
                ((SupportSQLiteStatement) obj).bindNull(i);
                return;
            default:
                b();
                S12227320117525376577.w(25, "column index out of range");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final void bindText(int i, String str) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                str.getClass();
                ((N282309437460792485) obj).bindText(i, str);
                return;
            case 1:
                str.getClass();
                b();
                ((SupportSQLiteStatement) obj).bindString(i, str);
                return;
            default:
                str.getClass();
                b();
                S12227320117525376577.w(25, "column index out of range");
                throw null;
        }
    }

    @Override // dev.epro.r0.S4654969512817416603, androidx.sqlite.SQLiteStatement
    public void clearBindings() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((N282309437460792485) obj).clearBindings();
                break;
            case 1:
                b();
                ((SupportSQLiteStatement) obj).clearBindings();
                break;
            default:
                super.clearBindings();
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((N282309437460792485) obj).close();
                break;
            case 1:
                ((SupportSQLiteStatement) obj).close();
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final byte[] getBlob(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).getBlob(i);
            case 1:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
            default:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public boolean getBoolean(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).getBoolean(0);
            default:
                return super.getBoolean(i);
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnCount() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                b();
                break;
            default:
                b();
                break;
        }
        return 0;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getColumnName(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).getColumnName(i);
            case 1:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
            default:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final int getColumnType(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).getColumnType(i);
            case 1:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
            default:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final double getDouble(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).getDouble(i);
            case 1:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
            default:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final long getLong(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).getLong(i);
            case 1:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
            default:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final String getText(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).getText(i);
            case 1:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
            default:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean isNull(int i) {
        switch (this.d) {
            case 0:
                return ((N282309437460792485) this.e).isNull(i);
            case 1:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
            default:
                b();
                S12227320117525376577.w(21, "no row");
                throw null;
        }
    }

    @Override // dev.epro.r0.S4654969512817416603, androidx.sqlite.SQLiteStatement
    public void reset() {
        switch (this.d) {
            case 0:
                ((N282309437460792485) this.e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // androidx.sqlite.SQLiteStatement
    public final boolean step() {
        byte b = this.d;
        SupportSQLiteDatabase supportSQLiteDatabase = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                N282309437460792485 n282309437460792485 = (N282309437460792485) obj;
                boolean zStep = n282309437460792485.step();
                if (!n282309437460792485.getText(0).equalsIgnoreCase("wal")) {
                    supportSQLiteDatabase.disableWriteAheadLogging();
                } else {
                    supportSQLiteDatabase.enableWriteAheadLogging();
                }
                break;
            case 1:
                b();
                ((SupportSQLiteStatement) obj).execute();
                break;
            default:
                int iOrdinal = ((T6036787474301749574) obj).ordinal();
                if (iOrdinal == 0) {
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                } else if (iOrdinal == 1) {
                    supportSQLiteDatabase.endTransaction();
                } else if (iOrdinal == 2) {
                    supportSQLiteDatabase.beginTransaction();
                } else if (iOrdinal == 3) {
                    supportSQLiteDatabase.beginTransactionNonExclusive();
                } else if (iOrdinal != 4) {
                    Z3383101362411723454.g();
                } else {
                    supportSQLiteDatabase.beginTransactionReadOnly();
                }
                break;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6585841228995144384(SupportSQLiteDatabase supportSQLiteDatabase, String str, T6036787474301749574 t6036787474301749574) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.e = t6036787474301749574;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6585841228995144384(SupportSQLiteDatabase supportSQLiteDatabase, String str, N282309437460792485 n282309437460792485) {
        super(supportSQLiteDatabase, str);
        supportSQLiteDatabase.getClass();
        str.getClass();
        this.e = n282309437460792485;
    }
}
