package dev.epro.r0;

import ads_mobile_sdk.ai1;
import ads_mobile_sdk.ey2;
import ads_mobile_sdk.fh;
import ads_mobile_sdk.ko1;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y12698379553221984179 implements F354011078084083645 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ T13262009518181969142 b;

    public /* synthetic */ Y12698379553221984179(ko1 ko1Var, T13262009518181969142 t13262009518181969142, byte b) {
        this.a = b;
        this.b = t13262009518181969142;
    }

    @Override // dev.epro.r0.F354011078084083645
    public final void a() {
        byte b = this.a;
        T13262009518181969142 t13262009518181969142 = this.b;
        switch (b) {
            case 0:
                ai1 ai1Var = (ai1) t13262009518181969142;
                Object objB = ai1Var.d.b();
                if (objB == null) {
                    objB = ai1Var.c;
                }
                objB.getClass();
                S10823041268949770285.b0("interstitialAd");
                throw null;
            case 1:
                ey2 ey2Var = (ey2) t13262009518181969142;
                Object objB2 = ey2Var.e.b();
                if (objB2 == null) {
                    objB2 = ey2Var.d;
                }
                objB2.getClass();
                S10823041268949770285.b0("rewardedAd");
                throw null;
            default:
                fh fhVar = (fh) t13262009518181969142;
                Object objB3 = fhVar.d.b();
                if (objB3 == null) {
                    objB3 = fhVar.c;
                }
                objB3.getClass();
                S10823041268949770285.b0("appOpenAd");
                throw null;
        }
    }
}
