package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qg implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final ads_mobile_sdk.hb1 c;
    public final dev.epro.r0.V2597580950516131749 d;
    public final /* synthetic */ byte e;

    public qg(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, ads_mobile_sdk.hb1 hb1Var2) {
        this.e = (byte) 2;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.d = v25975809505161317492;
        this.c = hb1Var2;
    }

    public final java.lang.Object get() {
        byte b = this.e;
        ads_mobile_sdk.hb1 hb1Var = this.c;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.d;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.b;
        ads_mobile_sdk.hb1 hb1Var2 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.pg((android.content.Context) hb1Var2.a, (ads_mobile_sdk.vi3) v25975809505161317492.get(), (ads_mobile_sdk.j7) hb1Var.a, (dev.epro.r0.F7878618420024429111) v2597580950516131749.get());
            case 1:
                return new ads_mobile_sdk.qj0((dev.epro.r0.V5431423861497278836) hb1Var2.a, (ads_mobile_sdk.rp1) v25975809505161317492.get(), (android.content.Context) hb1Var.a, (ads_mobile_sdk.vi3) v2597580950516131749.get(), (byte) 0);
            default:
                return new ads_mobile_sdk.up1((android.content.Context) hb1Var2.a, (ads_mobile_sdk.vi3) v25975809505161317492.get(), (ads_mobile_sdk.a) v2597580950516131749.get(), (ads_mobile_sdk.j7) hb1Var.a);
        }
    }

    public /* synthetic */ qg(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.hb1 hb1Var2, dev.epro.r0.V2597580950516131749 v25975809505161317492, byte b) {
        this.e = b;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = hb1Var2;
        this.d = v25975809505161317492;
    }
}
