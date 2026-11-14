package ads_mobile_sdk;

import android.content.Context;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import dev.epro.r0.B12201883445749953452;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.J2562139256184902546;
import dev.epro.r0.P16188089657974175786;
import dev.epro.r0.Q16898486116126855517;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S12306309242770307923;
import dev.epro.r0.T13262009518181969142;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.U8836654130139556418;
import dev.epro.r0.V2597580950516131749;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class pz1 implements T13262009518181969142 {
    public final U4857089234315512256 a;
    public final P16188089657974175786 b;
    public final sv2 c;
    public final Context d;
    public final g0 e;
    public final kh0 f;
    public final V2597580950516131749 g;

    public pz1(U4857089234315512256 u4857089234315512256, P16188089657974175786 p16188089657974175786, sv2 sv2Var, Context context, g0 g0Var, kh0 kh0Var, bb0 bb0Var) {
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
        e52 e52Var = (e52) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        e52Var.getClass();
        Context contextB = this.e.b();
        if (contextB == null) {
            contextB = this.d;
        }
        Context context = contextB;
        E4916761685899363666 e4916761685899363666A = this.c.a();
        I16631908410500040363 i16631908410500040363 = z1Var.c;
        context.getClass();
        U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        P16188089657974175786 p16188089657974175786 = this.b;
        p16188089657974175786.getClass();
        e4916761685899363666A.getClass();
        i16631908410500040363.getClass();
        this.f.getClass();
        J2562139256184902546 j2562139256184902546 = e52Var.a;
        if (j2562139256184902546 instanceof MediationNativeAdapter) {
            e4916761685899363666A.a(context);
            U8836654130139556418.e(i16631908410500040363, e4916761685899363666A);
            U8836654130139556418.d(p16188089657974175786);
            ((MediationNativeAdapter) j2562139256184902546).requestNativeAd(context, new d62(), U8836654130139556418.c(i16631908410500040363), new d62(), U8836654130139556418.b(u4857089234315512256, j2562139256184902546));
            return;
        }
        String canonicalName = j2562139256184902546.getClass().getCanonicalName();
        String canonicalName2 = MediationNativeAdapter.class.getCanonicalName();
        String strW = G6547577305291411977.w(G6547577305291411977.y("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), j2562139256184902546.getClass().getCanonicalName(), " implement ", MediationNativeAdapter.class.getCanonicalName(), "?");
        if (f01Var.b.getAndSet(true)) {
            return;
        }
        f01Var.a.resumeWith(new su0(new S12306309242770307923(0, strW, "com.google.android.libraries.ads.mobile.sdk")));
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final B12201883445749953452 a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        S10823041268949770285.b0("nativeAdMapper");
        throw null;
    }
}
