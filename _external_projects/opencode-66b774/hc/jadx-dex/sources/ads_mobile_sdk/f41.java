package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class f41 implements dev.epro.r0.D1753571785825534567 {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ byte c;

    public /* synthetic */ f41(ads_mobile_sdk.w81 w81Var, java.lang.Object obj, byte b) {
        this.c = b;
        this.a = obj;
        this.b = w81Var;
    }

    @Override // dev.epro.r0.D1753571785825534567
    public final void a() {
        switch (this.c) {
            case 0:
                ((ads_mobile_sdk.zj1) this.a).p = (ads_mobile_sdk.fz) this.b;
                return;
            case 1:
                ads_mobile_sdk.g0 g0Var = (ads_mobile_sdk.g0) this.a;
                java.util.Set set = (java.util.Set) this.b;
                synchronized (g0Var) {
                    g0Var.h.addAll(set);
                }
                return;
            case 2:
                ((dev.epro.r0.O12043144740933444288) this.a).a((ads_mobile_sdk.w81) this.b);
                return;
            case 3:
                ((dev.epro.r0.O12043144740933444288) this.a).a((ads_mobile_sdk.hs) this.b);
                return;
            case 4:
                ((ads_mobile_sdk.nd2) this.a).g = (ads_mobile_sdk.pe2) this.b;
                return;
            default:
                ((ads_mobile_sdk.yp3) this.a).r = (ads_mobile_sdk.w81) this.b;
                return;
        }
    }

    public /* synthetic */ f41(java.lang.Object obj, java.lang.Object obj2, byte b) {
        this.c = b;
        this.a = obj;
        this.b = obj2;
    }
}
