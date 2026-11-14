package dev.epro.r0;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class R16659805086402753450 implements SupportSQLiteProgram {
    public final SQLiteProgram a;

    public R16659805086402753450(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindBlob(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindDouble(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindLong(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindNull(int i) {
        this.a.bindNull(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void bindString(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public final void clearBindings() {
        this.a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
