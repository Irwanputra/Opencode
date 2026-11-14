package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class c43 implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final dev.epro.r0.V2597580950516131749 b;
    public final dev.epro.r0.V2597580950516131749 c;
    public final ads_mobile_sdk.rg0 d;
    public final /* synthetic */ byte e;

    public c43(ads_mobile_sdk.hb1 hb1Var, ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492) {
        this.e = (byte) 4;
        this.a = hb1Var;
        this.d = rg0Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
    }

    public final java.lang.Object get() {
        byte b = this.e;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.c;
        dev.epro.r0.V2597580950516131749 v25975809505161317492 = this.b;
        ads_mobile_sdk.rg0 rg0Var = this.d;
        ads_mobile_sdk.hb1 hb1Var = this.a;
        switch (b) {
            case 0:
                return new ads_mobile_sdk.b43((android.content.Context) hb1Var.a, (ads_mobile_sdk.jr0) v25975809505161317492.get(), (dev.epro.r0.O16637889491137121389) v2597580950516131749.get(), (dev.epro.r0.W5797197595347441198) rg0Var.get());
            case 1:
                dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) rg0Var.get();
                ads_mobile_sdk.xj xjVar = (ads_mobile_sdk.xj) v25975809505161317492.get();
                ads_mobile_sdk.n53 n53Var = (ads_mobile_sdk.n53) v2597580950516131749.get();
                ads_mobile_sdk.xn2 xn2Var = (ads_mobile_sdk.xn2) hb1Var.a;
                w5797197595347441198.getClass();
                xjVar.getClass();
                n53Var.getClass();
                xn2Var.getClass();
                return new ads_mobile_sdk.d62();
            case 2:
                return new ads_mobile_sdk.nr0((android.content.Context) hb1Var.a, (ads_mobile_sdk.jr0) v25975809505161317492.get(), (dev.epro.r0.O16637889491137121389) v2597580950516131749.get(), (dev.epro.r0.W5797197595347441198) rg0Var.get());
            case 3:
                return new ads_mobile_sdk.pm0((dev.epro.r0.U4857089234315512256) v25975809505161317492.get(), (ads_mobile_sdk.um0) v2597580950516131749.get(), (ads_mobile_sdk.z1) hb1Var.a, (dev.epro.r0.W5797197595347441198) rg0Var.get());
            default:
                return new ads_mobile_sdk.um0((android.content.Context) hb1Var.a, (ads_mobile_sdk.ci3) rg0Var.get(), (ads_mobile_sdk.kz2) v25975809505161317492.get(), (ads_mobile_sdk.jr0) v2597580950516131749.get());
        }
    }

    public /* synthetic */ c43(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, ads_mobile_sdk.rg0 rg0Var, byte b) {
        this.e = b;
        this.a = hb1Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.d = rg0Var;
    }

    public c43(ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, ads_mobile_sdk.hb1 hb1Var) {
        this.e = (byte) 1;
        this.d = rg0Var;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.a = hb1Var;
    }

    public c43(dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492, ads_mobile_sdk.hb1 hb1Var, ads_mobile_sdk.rg0 rg0Var) {
        this.e = (byte) 3;
        this.b = v2597580950516131749;
        this.c = v25975809505161317492;
        this.a = hb1Var;
        this.d = rg0Var;
    }
}
