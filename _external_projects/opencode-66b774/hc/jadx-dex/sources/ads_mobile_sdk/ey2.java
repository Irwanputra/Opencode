package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ey2 implements dev.epro.r0.T13262009518181969142 {
    public final ads_mobile_sdk.qw2 a;
    public final dev.epro.r0.U4857089234315512256 b;
    public final ads_mobile_sdk.sv2 c;
    public final android.content.Context d;
    public final ads_mobile_sdk.g0 e;
    public final ads_mobile_sdk.kh0 f;
    public final dev.epro.r0.V2597580950516131749 g;

    public ey2(ads_mobile_sdk.qw2 qw2Var, dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.sv2 sv2Var, android.content.Context context, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.kh0 kh0Var, ads_mobile_sdk.bb0 bb0Var) {
        qw2Var.getClass();
        u4857089234315512256.getClass();
        sv2Var.getClass();
        context.getClass();
        g0Var.getClass();
        kh0Var.getClass();
        bb0Var.getClass();
        this.a = qw2Var;
        this.b = u4857089234315512256;
        this.c = sv2Var;
        this.d = context;
        this.e = g0Var;
        this.f = kh0Var;
        this.g = bb0Var;
    }

    public final void a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517, ads_mobile_sdk.f01 f01Var) {
        ads_mobile_sdk.ko1 ko1Var = (ads_mobile_sdk.ko1) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = z1Var.c;
        ko1Var.getClass();
        dev.epro.r0.R1776126100510317963 r1776126100510317963 = ko1Var.a;
        ads_mobile_sdk.qw2 qw2Var = this.a;
        ads_mobile_sdk.qw2 qw2Var2 = ads_mobile_sdk.qw2.k;
        ads_mobile_sdk.kh0 kh0Var = this.f;
        ads_mobile_sdk.sv2 sv2Var = this.c;
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.b;
        android.content.Context context = this.d;
        if (qw2Var == qw2Var2) {
            dev.epro.r0.E4916761685899363666 e4916761685899363666A = sv2Var.a();
            context.getClass();
            u4857089234315512256.getClass();
            e4916761685899363666A.getClass();
            i16631908410500040363.getClass();
            kh0Var.getClass();
            dev.epro.r0.U8836654130139556418.c(i16631908410500040363);
            dev.epro.r0.U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
            e4916761685899363666A.a(context);
            dev.epro.r0.U8836654130139556418.e(i16631908410500040363, e4916761685899363666A);
            r1776126100510317963.loadRewardedInterstitialAd(new dev.epro.r0.S10317395539156355983(), new ads_mobile_sdk.ap1(f01Var, (byte) 5));
            return;
        }
        android.app.Activity activityB = this.e.b();
        if (activityB != null) {
            context = activityB;
        }
        dev.epro.r0.E4916761685899363666 e4916761685899363666A2 = sv2Var.a();
        context.getClass();
        u4857089234315512256.getClass();
        e4916761685899363666A2.getClass();
        i16631908410500040363.getClass();
        kh0Var.getClass();
        dev.epro.r0.U8836654130139556418.c(i16631908410500040363);
        dev.epro.r0.U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
        e4916761685899363666A2.a(context);
        dev.epro.r0.U8836654130139556418.e(i16631908410500040363, e4916761685899363666A2);
        r1776126100510317963.loadRewardedAd(new dev.epro.r0.S10317395539156355983(), new ads_mobile_sdk.ap1(f01Var, (byte) 5));
    }

    public final dev.epro.r0.B12201883445749953452 a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        ads_mobile_sdk.ne0 ne0Var = (ads_mobile_sdk.ne0) this.g.get();
        dev.epro.r0.Y12698379553221984179 y12698379553221984179 = new dev.epro.r0.Y12698379553221984179((ads_mobile_sdk.ko1) q16898486116126855517, this, (byte) 1);
        ne0Var.getClass();
        ne0Var.p = y12698379553221984179;
        return ne0Var;
    }
}
