package ads_mobile_sdk;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class ml0 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }

    public static final nl0 a(String str) {
        Class cls = a;
        if (cls != null) {
            try {
                return (nl0) cls.getDeclaredMethod(str, null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
