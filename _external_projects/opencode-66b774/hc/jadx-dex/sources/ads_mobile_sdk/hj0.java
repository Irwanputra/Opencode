package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hj0 implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final ads_mobile_sdk.hb1 b;
    public final dev.epro.r0.V2597580950516131749 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ hj0(ads_mobile_sdk.hb1 hb1Var, ads_mobile_sdk.hb1 hb1Var2, dev.epro.r0.V2597580950516131749 v2597580950516131749, byte b) {
        this.d = b;
        this.a = hb1Var;
        this.b = hb1Var2;
        this.c = v2597580950516131749;
    }

    public final java.lang.Object get() {
        switch (this.d) {
            case 0:
                return new ads_mobile_sdk.v6((ads_mobile_sdk.qm1) this.c.get());
            default:
                return new ads_mobile_sdk.wi0((android.content.Context) this.a.a, (ads_mobile_sdk.j7) this.b.a, (ads_mobile_sdk.ub3) this.c.get());
        }
    }
}
