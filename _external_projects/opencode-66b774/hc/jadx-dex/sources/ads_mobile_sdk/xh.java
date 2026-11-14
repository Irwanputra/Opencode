package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xh implements dev.epro.r0.T13262009518181969142 {
    public final dev.epro.r0.U4857089234315512256 a;
    public final ads_mobile_sdk.sv2 b;
    public final android.content.Context c;
    public final ads_mobile_sdk.g0 d;
    public final ads_mobile_sdk.kh0 e;
    public final dev.epro.r0.V2597580950516131749 f;

    public xh(dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.sv2 sv2Var, android.content.Context context, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.kh0 kh0Var, ads_mobile_sdk.bb0 bb0Var) {
        u4857089234315512256.getClass();
        sv2Var.getClass();
        context.getClass();
        g0Var.getClass();
        kh0Var.getClass();
        bb0Var.getClass();
        this.a = u4857089234315512256;
        this.b = sv2Var;
        this.c = context;
        this.d = g0Var;
        this.e = kh0Var;
        this.f = bb0Var;
    }

    public final void a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517, ads_mobile_sdk.f01 f01Var) {
        ads_mobile_sdk.b03 b03Var = (ads_mobile_sdk.b03) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = z1Var.c;
        b03Var.getClass();
        android.content.Context contextB = this.d.b();
        if (contextB == null) {
            contextB = this.c;
        }
        dev.epro.r0.E4916761685899363666 e4916761685899363666A = this.b.a();
        contextB.getClass();
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        e4916761685899363666A.getClass();
        this.e.getClass();
        com.google.android.gms.ads.mediation.rtb.RtbAdapter rtbAdapter = b03Var.b;
        dev.epro.r0.U8836654130139556418.c(i16631908410500040363);
        dev.epro.r0.U8836654130139556418.b(u4857089234315512256, b03Var.a);
        e4916761685899363666A.a(contextB);
        dev.epro.r0.U8836654130139556418.e(i16631908410500040363, e4916761685899363666A);
        rtbAdapter.loadRtbAppOpenAd(new dev.epro.r0.J12760179507758704697(), new ads_mobile_sdk.ap1(f01Var, (byte) 1));
    }

    public final dev.epro.r0.B12201883445749953452 a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        ads_mobile_sdk.fe0 fe0Var = (ads_mobile_sdk.fe0) this.f.get();
        dev.epro.r0.B1228614762446439716 b1228614762446439716 = new dev.epro.r0.B1228614762446439716((ads_mobile_sdk.b03) q16898486116126855517, this, (byte) 2);
        fe0Var.getClass();
        fe0Var.p = b1228614762446439716;
        return fe0Var;
    }
}
