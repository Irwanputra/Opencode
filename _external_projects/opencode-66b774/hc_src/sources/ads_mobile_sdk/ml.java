package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B12201883445749953452;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.E6758797890281795541;
import dev.epro.r0.F12798470039159117444;
import dev.epro.r0.G16864365537574524285;
import dev.epro.r0.H6169554751849586340;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.Q16898486116126855517;
import dev.epro.r0.R1776126100510317963;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S12306309242770307923;
import dev.epro.r0.S17468460685202108735;
import dev.epro.r0.T13262009518181969142;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.U6672801493511051432;
import dev.epro.r0.U8836654130139556418;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.X185389555398500543;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ml implements T13262009518181969142 {
    public final U4857089234315512256 a;
    public final S17468460685202108735 b;
    public final sv2 c;
    public final Context d;
    public final g0 e;
    public final kh0 f;
    public final V2597580950516131749 g;
    public final G16864365537574524285 h;

    public ml(U4857089234315512256 u4857089234315512256, S17468460685202108735 s17468460685202108735, sv2 sv2Var, Context context, g0 g0Var, kh0 kh0Var, bb0 bb0Var, G16864365537574524285 g16864365537574524285) {
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
        this.h = g16864365537574524285;
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final void a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517, f01 f01Var) {
        ko1 ko1Var = (ko1) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        ko1Var.getClass();
        R1776126100510317963 r1776126100510317963 = ko1Var.a;
        E6758797890281795541 c = this.b.c();
        if (c == null) {
            if (f01Var.b.getAndSet(true)) {
                return;
            }
            f01Var.a.resumeWith(new su0(new S12306309242770307923(0, "No AdSize available for banner mediation. This may happen when a server-to-server ad response triggers mediation but no AdSize was provided in the signal request.", "com.google.android.libraries.ads.mobile.sdk")));
            return;
        }
        Context b = this.e.b();
        if (b == null) {
            b = this.d;
        }
        E4916761685899363666 a = this.c.a();
        I16631908410500040363 i16631908410500040363 = z1Var.c;
        b.getClass();
        U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        a.getClass();
        i16631908410500040363.getClass();
        this.f.getClass();
        U8836654130139556418.c(i16631908410500040363);
        U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
        a.a(b);
        U8836654130139556418.e(i16631908410500040363, a);
        int i = c.a;
        int i2 = c.b;
        String str = c.f;
        boolean z = c.c;
        boolean z2 = c.d;
        str.getClass();
        new U6672801493511051432(i, i2, str, z, z2);
        r1776126100510317963.loadBannerAd(new F12798470039159117444(), new ap1(f01Var, (byte) 2));
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final void a(X185389555398500543 x185389555398500543) {
        ((H6169554751849586340) ((ie0) x185389555398500543).P.get()).getClass();
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final B12201883445749953452 a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        S10823041268949770285.b0("view");
        throw null;
    }
}
