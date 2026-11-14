package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class n43 extends dev.epro.r0.P9893650590651797888 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n43(int i) {
        super(1);
        this.a = i;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        ads_mobile_sdk.s43 s43Var = (ads_mobile_sdk.s43) obj;
        s43Var.getClass();
        dev.epro.r0.J8109720887967463919 j8109720887967463919 = s43Var.a;
        j8109720887967463919.b();
        ads_mobile_sdk.k43 k43Var = (ads_mobile_sdk.k43) j8109720887967463919.b;
        k43Var.bitField0_ |= 2;
        k43Var.totalInflightAdLimit_ = this.a;
        return dev.epro.r0.O9245300239821758723.a;
    }
}
