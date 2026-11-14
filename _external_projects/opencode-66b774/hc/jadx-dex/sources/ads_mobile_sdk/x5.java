package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class x5 implements dev.epro.r0.K4548097313143615345 {
    public final dev.epro.r0.O16637889491137121389 a;
    public final dev.epro.r0.U4857089234315512256 b;
    public final java.util.Optional c;
    public final ads_mobile_sdk.sv2 d;
    public final android.content.Context e;
    public final ads_mobile_sdk.qw2 f;
    public final boolean g;
    public final ads_mobile_sdk.jr0 h;
    public final long i;
    public final boolean j;
    public final java.util.Optional k;

    public x5(dev.epro.r0.O16637889491137121389 o16637889491137121389, dev.epro.r0.U4857089234315512256 u4857089234315512256, java.util.Optional optional, ads_mobile_sdk.sv2 sv2Var, android.content.Context context, ads_mobile_sdk.qw2 qw2Var, boolean z, ads_mobile_sdk.jr0 jr0Var, long j, boolean z2, java.util.Optional optional2) {
        o16637889491137121389.getClass();
        u4857089234315512256.getClass();
        optional.getClass();
        sv2Var.getClass();
        context.getClass();
        qw2Var.getClass();
        jr0Var.getClass();
        optional2.getClass();
        this.a = o16637889491137121389;
        this.b = u4857089234315512256;
        this.c = optional;
        this.d = sv2Var;
        this.e = context;
        this.f = qw2Var;
        this.g = z;
        this.h = jr0Var;
        this.i = j;
        this.j = z2;
        this.k = optional2;
    }

    public final ads_mobile_sdk.cw0 a() {
        return ads_mobile_sdk.cw0.AD_REQUEST;
    }

    public final java.lang.Object d(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        dev.epro.r0.E4916761685899363666 e4916761685899363666A = this.d.a();
        dev.epro.r0.P5733283974459951585 p5733283974459951585 = ads_mobile_sdk.rw0.f;
        boolean zA = (dev.epro.r0.Y2666402291564931474.f() && this.b.d.getBoolean("_emulatorLiveAds", false)) ? false : e4916761685899363666A.a(this.e);
        this.a.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        e4916761685899363666A.getClass();
        dev.epro.r0.P14363171583196137821 p14363171583196137821 = e4916761685899363666A.a;
        byte b = e4916761685899363666A.c.a;
        dev.epro.r0.S17468460685202108735 s17468460685202108735 = (dev.epro.r0.S17468460685202108735) dev.epro.r0.M18113111391818111737.H(this.c);
        boolean zD = s17468460685202108735 != null ? s17468460685202108735.d() : false;
        long j = jElapsedRealtime - this.i;
        java.lang.Boolean bool = (java.lang.Boolean) dev.epro.r0.M18113111391818111737.H(this.k);
        return new ads_mobile_sdk.xu0(new ads_mobile_sdk.w5(this.b, jElapsedRealtime, p14363171583196137821, zA, this.f, b, zD, this.g, this.h, j, this.j, bool != null ? bool.booleanValue() : false));
    }
}
