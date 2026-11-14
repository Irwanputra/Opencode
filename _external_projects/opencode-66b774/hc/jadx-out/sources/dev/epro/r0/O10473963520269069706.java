package dev.epro.r0;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O10473963520269069706 implements SupportSQLiteOpenHelper {
    public final Context a;
    public final String b;
    public final T17032536773975598836 c;
    public final boolean d;
    public final boolean e;
    public final O12494175665883759871 f;
    public boolean g;

    public O10473963520269069706(Context context, String str, T17032536773975598836 t17032536773975598836, boolean z, boolean z2) {
        t17032536773975598836.getClass();
        this.a = context;
        this.b = str;
        this.c = t17032536773975598836;
        this.d = z;
        this.e = z2;
        this.f = new O12494175665883759871(new S464754454553842217(this, (byte) 28));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        O12494175665883759871 o12494175665883759871 = this.f;
        if (o12494175665883759871.a()) {
            ((Y10303107381558964979) o12494175665883759871.getValue()).close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return ((Y10303107381558964979) this.f.getValue()).b(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        O12494175665883759871 o12494175665883759871 = this.f;
        if (o12494175665883759871.a()) {
            ((Y10303107381558964979) o12494175665883759871.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
