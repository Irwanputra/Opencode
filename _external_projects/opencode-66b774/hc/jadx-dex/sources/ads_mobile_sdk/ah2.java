package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ah2 implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final ads_mobile_sdk.hb1 c;
    public final ads_mobile_sdk.rg0 d;
    public final dev.epro.r0.V2597580950516131749 e;
    public final /* synthetic */ byte f = 1;

    public ah2(ads_mobile_sdk.hb1 hb1Var, ads_mobile_sdk.hb1 hb1Var2, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, ads_mobile_sdk.rg0 rg0Var) {
        this.a = hb1Var;
        this.c = hb1Var2;
        this.b = v2597580950516131749;
        this.e = v25975809505161317492;
        this.d = rg0Var;
    }

    public final java.lang.Object get() {
        byte b = this.f;
        ads_mobile_sdk.rg0 rg0Var = this.d;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.e;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.b;
        ads_mobile_sdk.hb1 hb1Var = this.c;
        ads_mobile_sdk.hb1 hb1Var2 = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.zg2((ads_mobile_sdk.z1) hb1Var2.a, (dev.epro.r0.O16637889491137121389) v25975809505161317492.get(), (ads_mobile_sdk.hv) hb1Var.a, (dev.epro.r0.W5797197595347441198) rg0Var.get(), (ads_mobile_sdk.kz2) v2597580950516131749.get());
            default:
                dev.epro.r0.S4967920478913205567 s4967920478913205567 = (dev.epro.r0.U4857089234315512256) hb1Var2.a;
                ads_mobile_sdk.qw2 qw2Var = (ads_mobile_sdk.qw2) hb1Var.a;
                ads_mobile_sdk.pe2 pe2Var = (ads_mobile_sdk.pe2) rg0Var.get();
                s4967920478913205567.getClass();
                qw2Var.getClass();
                v25975809505161317492.getClass();
                v2597580950516131749.getClass();
                pe2Var.getClass();
                dev.epro.r0.S4967920478913205567 s49679204789132055672 = s4967920478913205567 instanceof dev.epro.r0.S4967920478913205567 ? s4967920478913205567 : null;
                if (s49679204789132055672 != null) {
                    if (((pe2Var.b(s49679204789132055672, qw2Var) && pe2Var.a(s49679204789132055672, qw2Var) == 0) ? new ads_mobile_sdk.xu0(dev.epro.r0.O9245300239821758723.a) : new ads_mobile_sdk.tu0("Persistent cache is disabled.", 1)) instanceof ads_mobile_sdk.xu0) {
                        java.lang.Object obj = v2597580950516131749.get();
                        obj.getClass();
                        return (dev.epro.r0.Z888930033515493246) obj;
                    }
                }
                java.lang.Object obj2 = v25975809505161317492.get();
                obj2.getClass();
                return (dev.epro.r0.Z888930033515493246) obj2;
        }
    }

    public ah2(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.hb1 hb1Var2, ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v25975809505161317492) {
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = hb1Var2;
        this.d = rg0Var;
        this.e = v25975809505161317492;
    }
}
