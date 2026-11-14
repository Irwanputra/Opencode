package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B12201883445749953452;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.P16188089657974175786;
import dev.epro.r0.Q16898486116126855517;
import dev.epro.r0.R1776126100510317963;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T13262009518181969142;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.U8836654130139556418;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.X5135118043192612771;
import dev.epro.r0.Z13168519540281190457;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class sw1 implements T13262009518181969142 {
    public final U4857089234315512256 a;
    public final P16188089657974175786 b;
    public final sv2 c;
    public final Context d;
    public final g0 e;
    public final kh0 f;
    public final V2597580950516131749 g;

    public sw1(U4857089234315512256 u4857089234315512256, P16188089657974175786 p16188089657974175786, sv2 sv2Var, Context context, g0 g0Var, kh0 kh0Var, bb0 bb0Var) {
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

    @Override // dev.epro.r0.T13262009518181969142
    public final void a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517, f01 f01Var) {
        ko1 ko1Var = (ko1) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        ko1Var.getClass();
        R1776126100510317963 r1776126100510317963 = ko1Var.a;
        Context b = this.e.b();
        if (b == null) {
            b = this.d;
        }
        E4916761685899363666 a = this.c.a();
        I16631908410500040363 i16631908410500040363 = z1Var.c;
        b.getClass();
        U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        P16188089657974175786 p16188089657974175786 = this.b;
        p16188089657974175786.getClass();
        a.getClass();
        i16631908410500040363.getClass();
        this.f.getClass();
        try {
            U8836654130139556418.c(i16631908410500040363);
            U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
            a.a(b);
            U8836654130139556418.e(i16631908410500040363, a);
            U8836654130139556418.d(p16188089657974175786);
            r1776126100510317963.loadNativeAdMapper(new X5135118043192612771(), new ap1(f01Var, (byte) 4));
        } catch (IllegalStateException e) {
            if (!Z13168519540281190457.A(e.getMessage(), R1776126100510317963.ERROR_MESSAGE_METHOD_NOT_FOUND, false)) {
                throw e;
            }
            U8836654130139556418.c(i16631908410500040363);
            U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
            a.a(b);
            U8836654130139556418.e(i16631908410500040363, a);
            U8836654130139556418.d(p16188089657974175786);
            r1776126100510317963.loadNativeAd(new X5135118043192612771(), new ap1(f01Var, (byte) 0));
        }
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final B12201883445749953452 a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        S10823041268949770285.b0("nativeAdMapper");
        throw null;
    }
}
