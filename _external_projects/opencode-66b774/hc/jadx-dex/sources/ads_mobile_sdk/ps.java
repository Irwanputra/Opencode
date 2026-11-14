package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ps implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final ads_mobile_sdk.rg0 b;
    public final dev.epro.r0.V2597580950516131749 c;
    public final dev.epro.r0.V2597580950516131749 d;
    public final ads_mobile_sdk.hb1 e;
    public final /* synthetic */ byte f;

    public ps(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v25975809505161317492, dev.epro.r0.V2597580950516131749 v25975809505161317493) {
        this.f = (byte) 1;
        this.e = hb1Var;
        this.a = v2597580950516131749;
        this.b = rg0Var;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
    }

    public final java.lang.Object get() {
        byte b = this.f;
        ads_mobile_sdk.hb1 hb1Var = this.e;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.d;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.c;
        ads_mobile_sdk.rg0 rg0Var = this.b;
        dev.epro.r0.V2597580950516131749 v25975809505161317493 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.os((ads_mobile_sdk.k8) v25975809505161317493.get(), (ads_mobile_sdk.y2) rg0Var.get(), (ads_mobile_sdk.kx2) v25975809505161317492.get(), (ads_mobile_sdk.zm0) v2597580950516131749.get(), (ads_mobile_sdk.z1) hb1Var.a);
            case 1:
                return new ads_mobile_sdk.zm1((android.content.Context) hb1Var.a, (java.lang.String) v25975809505161317493.get(), (ads_mobile_sdk.fz) rg0Var.get(), (ads_mobile_sdk.rw0) v25975809505161317492.get(), (ads_mobile_sdk.jr0) v2597580950516131749.get());
            default:
                return new ads_mobile_sdk.fa2((ads_mobile_sdk.ca2) v25975809505161317493.get(), (ads_mobile_sdk.ci3) rg0Var.get(), (ads_mobile_sdk.jr0) v25975809505161317492.get(), (dev.epro.r0.F14240031463097426304) dev.epro.r0.O5354877807466160604.g.get(), (ads_mobile_sdk.zv1) v2597580950516131749.get(), (android.content.Context) hb1Var.a);
        }
    }

    public /* synthetic */ ps(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v25975809505161317492, dev.epro.r0.V2597580950516131749 v25975809505161317493, ads_mobile_sdk.hb1 hb1Var, byte b) {
        this.f = b;
        this.a = v2597580950516131749;
        this.b = rg0Var;
        this.c = v25975809505161317492;
        this.d = v25975809505161317493;
        this.e = hb1Var;
    }
}
