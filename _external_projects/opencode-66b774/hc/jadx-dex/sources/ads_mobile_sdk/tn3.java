package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tn3 extends dev.epro.r0.O17574792317020433029 {
    public static final java.lang.reflect.Method a;

    static {
        java.lang.reflect.Method method;
        try {
            method = java.lang.String.class.getMethod("encodedLength", java.nio.charset.Charset.class);
        } catch (java.lang.ReflectiveOperationException unused) {
            method = null;
        }
        a = method;
    }

    public final int a(java.lang.String str) {
        try {
            return ((java.lang.Integer) a.invoke(str, java.nio.charset.StandardCharsets.UTF_8)).intValue();
        } catch (java.lang.ReflectiveOperationException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }
}
