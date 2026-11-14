package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class B1228614762446439716 implements dev.epro.r0.F354011078084083645 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ads_mobile_sdk.b03 b;
    public final /* synthetic */ dev.epro.r0.T13262009518181969142 c;

    public /* synthetic */ B1228614762446439716(ads_mobile_sdk.b03 b03Var, dev.epro.r0.T13262009518181969142 t13262009518181969142, byte b) {
        this.a = b;
        this.b = b03Var;
        this.c = t13262009518181969142;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ads_mobile_sdk.b03 b03Var = this.b;
                ads_mobile_sdk.iz2 iz2Var = (ads_mobile_sdk.iz2) this.c;
                java.lang.Object objB = iz2Var.e.b();
                if (objB == null) {
                    objB = iz2Var.d;
                }
                objB.getClass();
                synchronized (b03Var) {
                    dev.epro.r0.S10823041268949770285.b0("rewardedAd");
                    throw null;
                }
            case 1:
                ads_mobile_sdk.b03 b03Var2 = this.b;
                ads_mobile_sdk.ui1 ui1Var = (ads_mobile_sdk.ui1) this.c;
                java.lang.Object objB2 = ui1Var.d.b();
                if (objB2 == null) {
                    objB2 = ui1Var.c;
                }
                objB2.getClass();
                synchronized (b03Var2) {
                    dev.epro.r0.S10823041268949770285.b0("interstitialAd");
                    throw null;
                }
            default:
                ads_mobile_sdk.b03 b03Var3 = this.b;
                ads_mobile_sdk.xh xhVar = (ads_mobile_sdk.xh) this.c;
                java.lang.Object objB3 = xhVar.d.b();
                if (objB3 == null) {
                    objB3 = xhVar.c;
                }
                objB3.getClass();
                synchronized (b03Var3) {
                    dev.epro.r0.S10823041268949770285.b0("appOpenAd");
                    throw null;
                }
        }
    }
}
