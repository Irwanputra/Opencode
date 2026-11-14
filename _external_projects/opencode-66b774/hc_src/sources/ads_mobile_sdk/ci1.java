package ads_mobile_sdk;

import android.content.Context;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import dev.epro.r0.B12201883445749953452;
import dev.epro.r0.E3639529706575692568;
import dev.epro.r0.E4916761685899363666;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.J2562139256184902546;
import dev.epro.r0.Q16898486116126855517;
import dev.epro.r0.S12306309242770307923;
import dev.epro.r0.T13262009518181969142;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.U8836654130139556418;
import dev.epro.r0.V2597580950516131749;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ci1 implements T13262009518181969142 {
    public final U4857089234315512256 a;
    public final sv2 b;
    public final Context c;
    public final g0 d;
    public final kh0 e;
    public final V2597580950516131749 f;

    public ci1(U4857089234315512256 u4857089234315512256, sv2 sv2Var, Context context, g0 g0Var, kh0 kh0Var, bb0 bb0Var) {
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
        e52 e52Var = (e52) q16898486116126855517;
        d33Var.getClass();
        z1Var.getClass();
        e52Var.getClass();
        Context b = this.d.b();
        if (b == null) {
            b = this.c;
        }
        Context context = b;
        E4916761685899363666 a = this.b.a();
        I16631908410500040363 i16631908410500040363 = z1Var.c;
        context.getClass();
        U4857089234315512256 u4857089234315512256 = this.a;
        u4857089234315512256.getClass();
        a.getClass();
        i16631908410500040363.getClass();
        this.e.getClass();
        J2562139256184902546 j2562139256184902546 = e52Var.a;
        if (j2562139256184902546 instanceof MediationInterstitialAdapter) {
            a.a(context);
            U8836654130139556418.e(i16631908410500040363, a);
            ((MediationInterstitialAdapter) j2562139256184902546).requestInterstitialAd(context, new d62(), U8836654130139556418.c(i16631908410500040363), new d62(), U8836654130139556418.b(u4857089234315512256, j2562139256184902546));
            return;
        }
        String canonicalName = j2562139256184902546.getClass().getCanonicalName();
        String canonicalName2 = MediationInterstitialAdapter.class.getCanonicalName();
        String w = G6547577305291411977.w(G6547577305291411977.y("Failed to cast ", canonicalName, " to ", canonicalName2, ". Does "), j2562139256184902546.getClass().getCanonicalName(), " implement ", MediationInterstitialAdapter.class.getCanonicalName(), "?");
        if (f01Var.b.getAndSet(true)) {
            return;
        }
        f01Var.a.resumeWith(new su0(new S12306309242770307923(0, w, "com.google.android.libraries.ads.mobile.sdk")));
    }

    @Override // dev.epro.r0.T13262009518181969142
    public final B12201883445749953452 a(d33 d33Var, z1 z1Var, Q16898486116126855517 q16898486116126855517) {
        d33Var.getClass();
        z1Var.getClass();
        je0 je0Var = (je0) this.f.get();
        E3639529706575692568 e3639529706575692568 = new E3639529706575692568();
        je0Var.getClass();
        je0Var.p = e3639529706575692568;
        return je0Var;
    }
}
