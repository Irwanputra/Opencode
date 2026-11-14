package dev.epro.r0;

import ads_mobile_sdk.ai1;
import ads_mobile_sdk.ey2;
import ads_mobile_sdk.fh;
import ads_mobile_sdk.ko1;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
                Object b2 = ai1Var.d.b();
                if (b2 == null) {
                    b2 = ai1Var.c;
                }
                b2.getClass();
                S10823041268949770285.b0("interstitialAd");
                throw null;
            case 1:
                ey2 ey2Var = (ey2) t13262009518181969142;
                Object b3 = ey2Var.e.b();
                if (b3 == null) {
                    b3 = ey2Var.d;
                }
                b3.getClass();
                S10823041268949770285.b0("rewardedAd");
                throw null;
            default:
                fh fhVar = (fh) t13262009518181969142;
                Object b4 = fhVar.d.b();
                if (b4 == null) {
                    b4 = fhVar.c;
                }
                b4.getClass();
                S10823041268949770285.b0("appOpenAd");
                throw null;
        }
    }
}
