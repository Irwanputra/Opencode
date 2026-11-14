package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hb1 implements dev.epro.r0.B8427392651679410143, dev.epro.r0.A8094652504661216977 {
    public static final ads_mobile_sdk.hb1 b = new ads_mobile_sdk.hb1(null);
    public final java.lang.Object a;

    public hb1(java.lang.Object obj) {
        this.a = obj;
    }

    public static ads_mobile_sdk.hb1 a(java.lang.Object obj) {
        if (obj != null) {
            return new ads_mobile_sdk.hb1(obj);
        }
        dev.epro.r0.Z3383101362411723454.k("instance cannot be null");
        return null;
    }

    @Override // dev.epro.r0.A8094652504661216977
    public final java.lang.Object get() {
        return this.a;
    }
}
