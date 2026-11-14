package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class v12 implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final ads_mobile_sdk.v80 b;
    public final dev.epro.r0.V2597580950516131749 c;
    public final /* synthetic */ byte d = 1;

    public v12(ads_mobile_sdk.v80 v80Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, dev.epro.r0.V2597580950516131749 v25975809505161317492) {
        this.b = v80Var;
        this.a = v2597580950516131749;
        this.c = v25975809505161317492;
    }

    public final java.lang.Object get() {
        switch (this.d) {
            case 0:
                return new ads_mobile_sdk.u12((ads_mobile_sdk.bq1) this.a.get(), (java.util.Optional) this.b.get(), (dev.epro.r0.W5797197595347441198) this.c.get());
            default:
                return new ads_mobile_sdk.vq3((java.util.Optional) this.b.get(), (dev.epro.r0.W5797197595347441198) this.a.get(), (ads_mobile_sdk.jr0) this.c.get());
        }
    }

    public v12(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.v80 v80Var, dev.epro.r0.V2597580950516131749 v25975809505161317492) {
        this.a = v2597580950516131749;
        this.b = v80Var;
        this.c = v25975809505161317492;
    }
}
