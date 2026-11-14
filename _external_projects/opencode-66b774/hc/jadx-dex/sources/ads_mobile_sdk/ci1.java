package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ci1 implements dev.epro.r0.T13262009518181969142 {
    public final dev.epro.r0.U4857089234315512256 a;
    public final ads_mobile_sdk.sv2 b;
    public final android.content.Context c;
    public final ads_mobile_sdk.g0 d;
    public final ads_mobile_sdk.kh0 e;
    public final dev.epro.r0.V2597580950516131749 f;

    public ci1(dev.epro.r0.U4857089234315512256 u4857089234315512256, ads_mobile_sdk.sv2 sv2Var, android.content.Context context, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.kh0 kh0Var, ads_mobile_sdk.bb0 bb0Var) {
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
        ads_mobile_sdk.e52 e52Var = (ads_mobile_sdk.e52) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        e52Var.getClass();
        android.content.Context contextB = this.d.b();
        if (contextB == null) {
            contextB = this.c;
        }
        android.content.Context context = contextB;
        dev.epro.r0.E4916761685899363666 e4916761685899363666A = this.b.a();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = z1Var.c;
        context.getClass();
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        e4916761685899363666A.getClass();
        i16631908410500040363.getClass();
        this.e.getClass();
        dev.epro.r0.J2562139256184902546 j2562139256184902546 = e52Var.a;
        if (j2562139256184902546 instanceof com.google.android.gms.ads.mediation.MediationInterstitialAdapter) {
            e4916761685899363666A.a(context);
            dev.epro.r0.U8836654130139556418.e(i16631908410500040363, e4916761685899363666A);
            ((com.google.android.gms.ads.mediation.MediationInterstitialAdapter) j2562139256184902546).requestInterstitialAd(context, new ads_mobile_sdk.d62(), dev.epro.r0.U8836654130139556418.c(i16631908410500040363), new ads_mobile_sdk.d62(), dev.epro.r0.U8836654130139556418.b(u4857089234315512256, j2562139256184902546));
            return;
        }
        java.lang.String canonicalName = j2562139256184902546.getClass().getCanonicalName();
        java.lang.String canonicalName2 = com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName();
        java.lang.String strW = dev.epro.r0.G6547577305291411977.w(dev.epro.r0.G6547577305291411977.y("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), j2562139256184902546.getClass().getCanonicalName(), " implement ", com.google.android.gms.ads.mediation.MediationInterstitialAdapter.class.getCanonicalName(), "?");
        if (f01Var.b.getAndSet(true)) {
            return;
        }
        f01Var.a.resumeWith(new ads_mobile_sdk.su0(new dev.epro.r0.S12306309242770307923(0, strW, "com.google.android.libraries.ads.mobile.sdk")));
    }

    public final dev.epro.r0.B12201883445749953452 a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        ads_mobile_sdk.je0 je0Var = (ads_mobile_sdk.je0) this.f.get();
        dev.epro.r0.E3639529706575692568 e3639529706575692568 = new dev.epro.r0.E3639529706575692568();
        je0Var.getClass();
        je0Var.p = e3639529706575692568;
        return je0Var;
    }
}
