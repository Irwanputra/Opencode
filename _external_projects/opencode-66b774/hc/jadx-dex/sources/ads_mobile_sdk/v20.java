package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class v20 extends dev.epro.r0.K14749510448791472029 {
    public ads_mobile_sdk.w20 a;
    public org.chromium.net.CronetEngine.Builder b;
    public java.lang.Long c;
    public org.chromium.net.CronetEngine.Builder d;
    public /* synthetic */ java.lang.Object e;
    public final /* synthetic */ ads_mobile_sdk.w20 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(ads_mobile_sdk.w20 w20Var, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.f = w20Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ads_mobile_sdk.w20.a(this.f, (org.chromium.net.CronetEngine.Builder) null, (java.lang.Long) null, this);
    }
}
