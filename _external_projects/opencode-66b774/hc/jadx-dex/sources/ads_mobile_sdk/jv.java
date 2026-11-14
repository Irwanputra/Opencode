package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jv implements dev.epro.r0.B8427392651679410143 {
    public final dev.epro.r0.V2597580950516131749 a;
    public final ads_mobile_sdk.v80 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ jv(dev.epro.r0.V2597580950516131749 v2597580950516131749, ads_mobile_sdk.v80 v80Var, byte b) {
        this.c = b;
        this.a = v2597580950516131749;
        this.b = v80Var;
    }

    public final java.lang.Object get() {
        byte b = this.c;
        ads_mobile_sdk.v80 v80Var = this.b;
        dev.epro.r0.V2597580950516131749 v2597580950516131749 = this.a;
        switch (b) {
            case 0:
                java.util.Optional optional = (java.util.Optional) v2597580950516131749.get();
                java.util.Optional optional2 = (java.util.Optional) v80Var.get();
                optional.getClass();
                optional2.getClass();
                return new ads_mobile_sdk.mi3((ads_mobile_sdk.ur2) dev.epro.r0.M18113111391818111737.G(optional, new ads_mobile_sdk.ur2()), (ads_mobile_sdk.fh1) dev.epro.r0.M18113111391818111737.G(optional2, new ads_mobile_sdk.fh1()), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
            default:
                return new ads_mobile_sdk.os3((dev.epro.r0.W5797197595347441198) v2597580950516131749.get(), (java.util.Optional) v80Var.get());
        }
    }
}
