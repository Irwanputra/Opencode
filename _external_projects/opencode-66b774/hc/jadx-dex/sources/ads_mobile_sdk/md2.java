package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class md2 extends dev.epro.r0.K14749510448791472029 {
    public java.lang.Object a;
    public java.io.Closeable b;
    public java.io.Closeable c;
    public /* synthetic */ java.lang.Object d;
    public final /* synthetic */ ads_mobile_sdk.nd2 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md2(ads_mobile_sdk.nd2 nd2Var, dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        super(k14749510448791472029);
        this.e = nd2Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ads_mobile_sdk.nd2.b(this.e, this);
    }
}
