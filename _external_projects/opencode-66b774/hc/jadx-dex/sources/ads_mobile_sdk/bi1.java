package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class bi1 implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final ads_mobile_sdk.hb1 c;
    public final dev.epro.r0.V2597580950516131749 d;
    public final dev.epro.r0.V2597580950516131749 e;
    public final ads_mobile_sdk.bb0 f;
    public final /* synthetic */ byte g;

    public /* synthetic */ bi1(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.hb1 hb1Var2, dev.epro.r0.V2597580950516131749 v25975809505161317492, dev.epro.r0.V2597580950516131749 v25975809505161317493, ads_mobile_sdk.bb0 bb0Var, byte b) {
        this.g = b;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = hb1Var2;
        this.d = v25975809505161317492;
        this.e = v25975809505161317493;
        this.f = bb0Var;
    }

    public final java.lang.Object get() {
        byte b = this.g;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.e;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.d;
        ads_mobile_sdk.hb1 hb1Var = this.c;
        dev.epro.r0.V2597580950516131749 v25975809505161317493 = this.b;
        ads_mobile_sdk.hb1 hb1Var2 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.ai1((dev.epro.r0.U4857089234315512256) hb1Var2.a, (ads_mobile_sdk.sv2) v25975809505161317493.get(), (android.content.Context) hb1Var.a, (ads_mobile_sdk.g0) v25975809505161317492.get(), (ads_mobile_sdk.kh0) v2597580950516131749.get(), this.f);
            case 1:
                return new ads_mobile_sdk.ci1((dev.epro.r0.U4857089234315512256) hb1Var2.a, (ads_mobile_sdk.sv2) v25975809505161317493.get(), (android.content.Context) hb1Var.a, (ads_mobile_sdk.g0) v25975809505161317492.get(), (ads_mobile_sdk.kh0) v2597580950516131749.get(), this.f);
            default:
                return new ads_mobile_sdk.ui1((dev.epro.r0.U4857089234315512256) hb1Var2.a, (ads_mobile_sdk.sv2) v25975809505161317493.get(), (android.content.Context) hb1Var.a, (ads_mobile_sdk.g0) v25975809505161317492.get(), (ads_mobile_sdk.kh0) v2597580950516131749.get(), this.f);
        }
    }
}
