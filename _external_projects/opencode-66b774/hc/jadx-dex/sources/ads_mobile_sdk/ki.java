package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ki implements dev.epro.r0.B8427392651679410143 {
    public final ads_mobile_sdk.hb1 a;
    public final ads_mobile_sdk.rg0 b;
    public final dev.epro.r0.V2597580950516131749 c;
    public final /* synthetic */ byte d;

    public ki(ads_mobile_sdk.hb1 hb1Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.rg0 rg0Var) {
        this.d = (byte) 1;
        this.a = hb1Var;
        this.c = v2597580950516131749;
        this.b = rg0Var;
    }

    public final java.lang.Object get() {
        switch (this.d) {
            case 0:
                return new ads_mobile_sdk.ji((android.content.Context) this.a.a, (ads_mobile_sdk.ci3) this.b.get(), (dev.epro.r0.O16637889491137121389) this.c.get());
            case 1:
                return new ads_mobile_sdk.zv1((android.content.Context) this.a.a, (ads_mobile_sdk.jr0) this.c.get(), (ads_mobile_sdk.ci3) this.b.get());
            default:
                return new ads_mobile_sdk.i80((android.content.Context) this.a.a, (dev.epro.r0.W5797197595347441198) this.b.get(), (ads_mobile_sdk.kz2) this.c.get());
        }
    }

    public /* synthetic */ ki(ads_mobile_sdk.hb1 hb1Var, ads_mobile_sdk.rg0 rg0Var, dev.epro.r0.V2597580950516131749 v2597580950516131749, byte b) {
        this.d = b;
        this.a = hb1Var;
        this.b = rg0Var;
        this.c = v2597580950516131749;
    }
}
