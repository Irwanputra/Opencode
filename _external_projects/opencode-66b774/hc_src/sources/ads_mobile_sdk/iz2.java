package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import dev.epro.r0.B12201883445749953452;
import dev.epro.r0.B1228614762446439716;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.Q16898486116126855517;
import dev.epro.r0.R1776126100510317963;
import dev.epro.r0.S10317395539156355983;
import dev.epro.r0.T13262009518181969142;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.U8836654130139556418;
import dev.epro.r0.V2597580950516131749;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class iz2 implements T13262009518181969142 {
    public final qw2 a;
    public final U4857089234315512256 b;
    public final sv2 c;
    public final Context d;
    public final g0 e;
    public final kh0 f;
    public final V2597580950516131749 g;

    public iz2(qw2 qw2Var, U4857089234315512256 u4857089234315512256, sv2 sv2Var, Context context, g0 g0Var, kh0 kh0Var, bb0 bb0Var) {
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

    @Override // dev.epro.r0.T13262009518181969142
    public final void a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517, f01 f01Var) {
        b03 b03Var = (b03) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        I16631908410500040363 i16631908410500040363 = z1Var.c;
        b03Var.getClass();
        R1776126100510317963 r1776126100510317963 = b03Var.a;
        RtbAdapter rtbAdapter = b03Var.b;
        qw2 qw2Var = this.a;
        qw2 qw2Var2 = qw2.k;
        kh0 kh0Var = this.f;
        sv2 sv2Var = this.c;
        U4857089234315512256 u4857089234315512256 = this.b;
        Context context = this.d;
        if (qw2Var == qw2Var2) {
            E4916761685899363666 a = sv2Var.a();
            context.getClass();
            u4857089234315512256.getClass();
            a.getClass();
            kh0Var.getClass();
            U8836654130139556418.c(i16631908410500040363);
            U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
            a.a(context);
            U8836654130139556418.e(i16631908410500040363, a);
            rtbAdapter.loadRtbRewardedInterstitialAd(new S10317395539156355983(), new ap1(f01Var, (byte) 5));
            return;
        }
        Activity b = this.e.b();
        if (b != null) {
            context = b;
        }
        E4916761685899363666 a2 = sv2Var.a();
        context.getClass();
        u4857089234315512256.getClass();
        a2.getClass();
        kh0Var.getClass();
        U8836654130139556418.c(i16631908410500040363);
        U8836654130139556418.b(u4857089234315512256, r1776126100510317963);
        a2.a(context);
        U8836654130139556418.e(i16631908410500040363, a2);
        rtbAdapter.loadRtbRewardedAd(new S10317395539156355983(), new ap1(f01Var, (byte) 5));
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final B12201883445749953452 a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        ne0 ne0Var = (ne0) this.g.get();
        B1228614762446439716 b1228614762446439716 = new B1228614762446439716((b03) q16898486116126855517, this, (byte) 0);
        ne0Var.getClass();
        ne0Var.p = b1228614762446439716;
        return ne0Var;
    }
}
