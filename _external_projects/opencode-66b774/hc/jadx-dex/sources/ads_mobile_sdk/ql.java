package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ql implements dev.epro.r0.T13262009518181969142 {
    public final dev.epro.r0.U4857089234315512256 a;
    public final dev.epro.r0.S17468460685202108735 b;
    public final ads_mobile_sdk.sv2 c;
    public final android.content.Context d;
    public final ads_mobile_sdk.g0 e;
    public final ads_mobile_sdk.kh0 f;
    public final dev.epro.r0.V2597580950516131749 g;

    public ql(dev.epro.r0.U4857089234315512256 u4857089234315512256, dev.epro.r0.S17468460685202108735 s17468460685202108735, ads_mobile_sdk.sv2 sv2Var, android.content.Context context, ads_mobile_sdk.g0 g0Var, ads_mobile_sdk.kh0 kh0Var, ads_mobile_sdk.bb0 bb0Var, dev.epro.r0.G16864365537574524285 g16864365537574524285) {
        u4857089234315512256.getClass();
        s17468460685202108735.getClass();
        sv2Var.getClass();
        context.getClass();
        g0Var.getClass();
        kh0Var.getClass();
        bb0Var.getClass();
        g16864365537574524285.getClass();
        this.a = u4857089234315512256;
        this.b = s17468460685202108735;
        this.c = sv2Var;
        this.d = context;
        this.e = g0Var;
        this.f = kh0Var;
        this.g = bb0Var;
    }

    public final void a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517, ads_mobile_sdk.f01 f01Var) {
        ads_mobile_sdk.e52 e52Var = (ads_mobile_sdk.e52) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        e52Var.getClass();
        dev.epro.r0.H7219028874700587498 h7219028874700587498 = f01Var.a;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f01Var.b;
        dev.epro.r0.E6758797890281795541 e6758797890281795541C = this.b.c();
        if (e6758797890281795541C == null) {
            if (atomicBoolean.getAndSet(true)) {
                return;
            }
            h7219028874700587498.resumeWith(new ads_mobile_sdk.su0(new dev.epro.r0.S12306309242770307923(0, "No AdSize available for banner mediation. This may happen when a server-to-server ad response triggers mediation but no AdSize was provided in the signal request.", "com.google.android.libraries.ads.mobile.sdk")));
            return;
        }
        android.content.Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        android.content.Context context = contextB;
        dev.epro.r0.E4916761685899363666 e4916761685899363666A = this.c.a();
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = z1Var.c;
        context.getClass();
        dev.epro.r0.U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        e4916761685899363666A.getClass();
        i16631908410500040363.getClass();
        this.f.getClass();
        dev.epro.r0.J2562139256184902546 j2562139256184902546 = e52Var.a;
        if (!(j2562139256184902546 instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter)) {
            java.lang.String canonicalName = j2562139256184902546.getClass().getCanonicalName();
            java.lang.String canonicalName2 = com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName();
            java.lang.String strW = dev.epro.r0.G6547577305291411977.w(dev.epro.r0.G6547577305291411977.y("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), j2562139256184902546.getClass().getCanonicalName(), " implement ", com.google.android.gms.ads.mediation.MediationBannerAdapter.class.getCanonicalName(), "?");
            if (atomicBoolean.getAndSet(true)) {
                return;
            }
            h7219028874700587498.resumeWith(new ads_mobile_sdk.su0(new dev.epro.r0.S12306309242770307923(0, strW, "com.google.android.libraries.ads.mobile.sdk")));
            return;
        }
        e4916761685899363666A.a(context);
        dev.epro.r0.U8836654130139556418.e(i16631908410500040363, e4916761685899363666A);
        ads_mobile_sdk.d62 d62Var = new ads_mobile_sdk.d62();
        ads_mobile_sdk.d62 d62Var2 = new ads_mobile_sdk.d62();
        android.os.Bundle bundleC = dev.epro.r0.U8836654130139556418.c(i16631908410500040363);
        int i = e6758797890281795541C.a;
        int i2 = e6758797890281795541C.b;
        java.lang.String str = e6758797890281795541C.f;
        boolean z = e6758797890281795541C.c;
        boolean z2 = e6758797890281795541C.d;
        str.getClass();
        ((com.google.android.gms.ads.mediation.MediationBannerAdapter) j2562139256184902546).requestBannerAd(context, d62Var2, bundleC, new dev.epro.r0.U6672801493511051432(i, i2, str, z, z2), d62Var, dev.epro.r0.U8836654130139556418.b(u4857089234315512256, j2562139256184902546));
    }

    public final void a(dev.epro.r0.X185389555398500543 x185389555398500543) {
        ((dev.epro.r0.H6169554751849586340) ((ads_mobile_sdk.ie0) x185389555398500543).P.get()).getClass();
    }

    public final dev.epro.r0.B12201883445749953452 a(ads_mobile_sdk.d33 d33Var, ads_mobile_sdk.z1 z1Var, dev.epro.r0.Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        dev.epro.r0.S10823041268949770285.b0("view");
        throw null;
    }
}
