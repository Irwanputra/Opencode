package dev.epro.r0;

import ads_mobile_sdk.b03;
import ads_mobile_sdk.iz2;
import ads_mobile_sdk.ui1;
import ads_mobile_sdk.xh;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final /* synthetic */ class B1228614762446439716 implements F354011078084083645 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b03 b;
    public final /* synthetic */ T13262009518181969142 c;

    public /* synthetic */ B1228614762446439716(b03 b03Var, T13262009518181969142 t13262009518181969142, byte b) {
        this.a = b;
        this.b = b03Var;
        this.c = t13262009518181969142;
    }

    @Override // dev.epro.r0.F354011078084083645
    public final void a() {
        switch (this.a) {
            case 0:
                b03 b03Var = this.b;
                iz2 iz2Var = (iz2) this.c;
                Object b = iz2Var.e.b();
                if (b == null) {
                    b = iz2Var.d;
                }
                b.getClass();
                synchronized (b03Var) {
                    S10823041268949770285.b0("rewardedAd");
                    throw null;
                }
            case 1:
                b03 b03Var2 = this.b;
                ui1 ui1Var = (ui1) this.c;
                Object b2 = ui1Var.d.b();
                if (b2 == null) {
                    b2 = ui1Var.c;
                }
                b2.getClass();
                synchronized (b03Var2) {
                    S10823041268949770285.b0("interstitialAd");
                    throw null;
                }
            default:
                b03 b03Var3 = this.b;
                xh xhVar = (xh) this.c;
                Object b3 = xhVar.d.b();
                if (b3 == null) {
                    b3 = xhVar.c;
                }
                b3.getClass();
                synchronized (b03Var3) {
                    S10823041268949770285.b0("appOpenAd");
                    throw null;
                }
        }
    }
}
