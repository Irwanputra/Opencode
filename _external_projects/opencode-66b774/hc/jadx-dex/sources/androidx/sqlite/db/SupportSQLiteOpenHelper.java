package androidx.sqlite.db;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public interface SupportSQLiteOpenHelper extends java.io.Closeable {

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Configuration {
        public final android.content.Context a;
        public final java.lang.String b;
        public final dev.epro.r0.T17032536773975598836 c;
        public final boolean d;
        public final boolean e;

        public Configuration(android.content.Context context, java.lang.String str, dev.epro.r0.T17032536773975598836 t17032536773975598836, boolean z, boolean z2) {
            t17032536773975598836.getClass();
            this.a = context;
            this.b = str;
            this.c = t17032536773975598836;
            this.d = z;
            this.e = z2;
        }
    }

    java.lang.String getDatabaseName();

    androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
