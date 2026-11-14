package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
abstract class qe {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.Class<?> c;
    private static final boolean d;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        c = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        d = cls2 != null;
    }

    public static java.lang.Class<?> a() {
        return c;
    }

    public static boolean b() {
        return (c == null || d) ? false : true;
    }
}
