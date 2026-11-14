package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class ml0 {
    public static final java.lang.Class a;

    static {
        java.lang.Class<?> cls;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }

    public static final ads_mobile_sdk.nl0 a(java.lang.String str) {
        java.lang.Class cls = a;
        if (cls != null) {
            try {
                return (ads_mobile_sdk.nl0) cls.getDeclaredMethod(str, null).invoke(null, null);
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }
}
