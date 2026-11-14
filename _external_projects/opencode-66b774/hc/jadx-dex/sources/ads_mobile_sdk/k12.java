package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class k12 implements dev.epro.r0.T13262009518181969142 {
    public final dev.epro.r0.U4857089234315512256 a;
    public final dev.epro.r0.P16188089657974175786 b;
    public final ads_mobile_sdk.sv2 c;
    public final android.content.Context d;
    public final ads_mobile_sdk.g0 e;
    public final ads_mobile_sdk.kh0 f;
    public final dev.epro.r0.V2597580950516131749 g;

    public k12(dev.epro.r0.U4857089234315512256 u4857089234315512256, dev.epro.r0.P16188089657974175786 p16188089657974175786, ads_mobile_sdk.sv2 sv2Var, android.content.Context context, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.kh0 kh0Var, ads_mobile_sdk.bb0 bb0Var) {
        u4857089234315512256.getClass();
        p16188089657974175786.getClass();
        sv2Var.getClass();
        context.getClass();
        g0Var.getClass();
        kh0Var.getClass();
        bb0Var.getClass();
        this.a = u4857089234315512256;
        this.b = p16188089657974175786;
        this.c = sv2Var;
        this.d = context;
        this.e = g0Var;
        this.f = kh0Var;
        this.g = bb0Var;
    }

    public final void a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517, ads_mobile_sdk.f01 f01Var) {
        ads_mobile_sdk.b03 b03Var = (ads_mobile_sdk.b03) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = z1Var.c;
        b03Var.getClass();
        dev.epro.r0.R1776126100510317963 r1776126100510317963 = b03Var.a;
        com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter = b03Var.b;
        android.content.Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        dev.epro.r0.E4916761685899363666 e4916761685899363666A = this.c.a();
        contextB.getClass();
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        dev.epro.r0.P16188089657974175786 p16188089657974175786 = this.b;
        p16188089657974175786.getClass();
        e4916761685899363666A.getClass();
        this.f.getClass();
        try {
            dev.epro.r0.U8836654130139556418.c(i16631908410500040363);
            dev.epro.r0.U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
            e4916761685899363666A.a(contextB);
            dev.epro.r0.U8836654130139556418.e(i16631908410500040363, e4916761685899363666A);
            dev.epro.r0.U8836654130139556418.d(p16188089657974175786);
            rtbAdapter.loadRtbNativeAdMapper(new dev.epro.r0.X5135118043192612771(), new ads_mobile_sdk.ap1(f01Var, (byte) 4));
        } catch (java.lang.IllegalStateException e) {
            if (!dev.epro.r0.Z13168519540281190457.A(e.getMessage(), "Method is not found", false)) {
                throw e;
            }
            dev.epro.r0.U8836654130139556418.c(i16631908410500040363);
            dev.epro.r0.U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
            e4916761685899363666A.a(contextB);
            dev.epro.r0.U8836654130139556418.e(i16631908410500040363, e4916761685899363666A);
            dev.epro.r0.U8836654130139556418.d(p16188089657974175786);
            rtbAdapter.loadRtbNativeAd(new dev.epro.r0.X5135118043192612771(), new ads_mobile_sdk.ap1(f01Var, (byte) 0));
        }
    }

    public final dev.epro.r0.B12201883445749953452 a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        dev.epro.r0.S10823041268949770285.b0("nativeAdMapper");
        throw null;
    }
}
