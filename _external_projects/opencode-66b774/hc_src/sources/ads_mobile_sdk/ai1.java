package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B12201883445749953452;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.Q16898486116126855517;
import dev.epro.r0.R1776126100510317963;
import dev.epro.r0.T13262009518181969142;
import dev.epro.r0.U18131546301104314177;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.U8836654130139556418;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.Y12698379553221984179;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ai1 implements T13262009518181969142 {
    public final U4857089234315512256 a;
    public final sv2 b;
    public final Context c;
    public final g0 d;
    public final kh0 e;
    public final V2597580950516131749 f;

    public ai1(U4857089234315512256 u4857089234315512256, sv2 sv2Var, Context context, g0 g0Var, kh0 kh0Var, bb0 bb0Var) {
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

    @Override // dev.epro.r0.T13262009518181969142
    public final void a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517, f01 f01Var) {
        ko1 ko1Var = (ko1) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        ko1Var.getClass();
        R1776126100510317963 r1776126100510317963 = ko1Var.a;
        Context b = this.d.b();
        if (b == null) {
            b = this.c;
        }
        E4916761685899363666 a = this.b.a();
        I16631908410500040363 i16631908410500040363 = z1Var.c;
        b.getClass();
        U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        a.getClass();
        i16631908410500040363.getClass();
        this.e.getClass();
        U8836654130139556418.c(i16631908410500040363);
        U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
        a.a(b);
        U8836654130139556418.e(i16631908410500040363, a);
        r1776126100510317963.loadInterstitialAd(new U18131546301104314177(), new ap1(f01Var, (byte) 3));
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final B12201883445749953452 a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        je0 je0Var = (je0) this.f.get();
        Y12698379553221984179 y12698379553221984179 = new Y12698379553221984179((ko1) q16898486116126855517, this, (byte) 0);
        je0Var.getClass();
        je0Var.p = y12698379553221984179;
        return je0Var;
    }
}
