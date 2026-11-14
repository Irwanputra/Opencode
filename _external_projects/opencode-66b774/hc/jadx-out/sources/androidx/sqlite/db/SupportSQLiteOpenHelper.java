package androidx.sqlite.db;

import android.content.Context;
import dev.epro.r0.T17032536773975598836;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class Configuration {
        public final Context a;
        public final String b;
        public final T17032536773975598836 c;
        public final boolean d;
        public final boolean e;

        public Configuration(Context context, String str, T17032536773975598836 t17032536773975598836, boolean z, boolean z2) {
            t17032536773975598836.getClass();
            this.a = context;
            this.b = str;
            this.c = t17032536773975598836;
            this.d = z;
            this.e = z2;
        }
    }

    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
