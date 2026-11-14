package ads_mobile_sdk;

import dev.epro.r0.A5459349068949265291;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.P16188089657974175786;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R6320827706769103704;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class su1 extends e2 {
    public final x60 l;
    public final V2597580950516131749 m;
    public final V2597580950516131749 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final R6320827706769103704 f109o;
    public final wt1 p;
    public final P16188089657974175786 q;
    public final A5459349068949265291 r;
    public final kz2 s;
    public final W5797197595347441198 t;
    public final int u;
    public final dm v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su1(x60 x60Var, bb0 bb0Var, bb0 bb0Var2, R6320827706769103704 r6320827706769103704, wt1 wt1Var, P16188089657974175786 p16188089657974175786, A5459349068949265291 a5459349068949265291, kz2 kz2Var, mi3 mi3Var, U4857089234315512256 u4857089234315512256, qw2 qw2Var, long j, int i, z1 z1Var, hv hvVar, d33 d33Var, String str, W5797197595347441198 w5797197595347441198, int i2, dm dmVar) {
        super(mi3Var, u4857089234315512256, qw2Var, j, i, z1Var, hvVar, d33Var, str, (eg2) dmVar.get());
        x60Var.getClass();
        bb0Var.getClass();
        bb0Var2.getClass();
        r6320827706769103704.getClass();
        wt1Var.getClass();
        p16188089657974175786.getClass();
        a5459349068949265291.getClass();
        kz2Var.getClass();
        mi3Var.getClass();
        u4857089234315512256.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        hvVar.getClass();
        d33Var.getClass();
        str.getClass();
        w5797197595347441198.getClass();
        this.l = x60Var;
        this.m = bb0Var;
        this.n = bb0Var2;
        this.f109o = r6320827706769103704;
        this.p = wt1Var;
        this.q = p16188089657974175786;
        this.r = a5459349068949265291;
        this.s = kz2Var;
        this.t = w5797197595347441198;
        this.u = i2;
        this.v = dmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0245, code lost:
    
        if (r4.a(r2, r3) != r10) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.I16631908410500040363 r19, dev.epro.r0.X16599180054040010357 r20, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext r21, dev.epro.r0.K14749510448791472029 r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su1.a(dev.epro.r0.I16631908410500040363, dev.epro.r0.X16599180054040010357, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.U10184268024341301528
    public final boolean b() {
        k61 k61Var = this.f.I;
        return (k61Var != null ? k61Var.d : null) != null;
    }

    @Override // ads_mobile_sdk.e2
    public final Object a(boolean z, R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        if (r1 == r10) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[PHI: r0 r1 r3 r7
      0x00b4: PHI (r0v4 com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext) = 
      (r0v3 com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext)
      (r0v11 com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext)
     binds: [B:34:0x00b1, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r1v12 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:34:0x00b1, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r3v6 dev.epro.r0.X16599180054040010357) = (r3v5 dev.epro.r0.X16599180054040010357), (r3v8 dev.epro.r0.X16599180054040010357) binds: [B:34:0x00b1, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r7v4 ads_mobile_sdk.su1) = (r7v3 ads_mobile_sdk.su1), (r7v6 ads_mobile_sdk.su1) binds: [B:34:0x00b1, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.su1 r18, dev.epro.r0.K14749510448791472029 r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su1.a(ads_mobile_sdk.su1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.X16599180054040010357 r6, ads_mobile_sdk.z1 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.nu1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.nu1 r0 = (ads_mobile_sdk.nu1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.nu1 r0 = new ads_mobile_sdk.nu1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r5 = r0.a
            int r8 = r0.c
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L2c
            if (r8 != r1) goto L26
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L70
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L2c:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.I16631908410500040363 r5 = new dev.epro.r0.I16631908410500040363
            r5.<init>()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.String r3 = "isNonagon"
            r5.r(r3, r8)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 30
            if (r3 < r4) goto L46
            java.lang.String r3 = "skipDeepLinkValidation"
            r5.r(r3, r8)
        L46:
            dev.epro.r0.I16631908410500040363 r8 = new dev.epro.r0.I16631908410500040363
            r8.<init>()
            ads_mobile_sdk.k61 r7 = r7.I
            r7.getClass()
            dev.epro.r0.I16631908410500040363 r7 = r7.d
            java.lang.String r3 = "response"
            r8.q(r3, r7)
            java.lang.String r7 = "sdk_params"
            r8.q(r7, r5)
            r0.c = r1
            r6.getClass()
            java.lang.String r5 = r8.toString()
            java.lang.String r7 = "google.afma.nativeAds.preProcessJson"
            java.lang.Object r5 = r6.a(r7, r5, r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r6) goto L70
            return r6
        L70:
            dev.epro.r0.M16184408391440927034 r5 = (dev.epro.r0.M16184408391440927034) r5
            boolean r6 = r5 instanceof ads_mobile_sdk.pu0
            if (r6 == 0) goto L79
            ads_mobile_sdk.pu0 r5 = (ads_mobile_sdk.pu0) r5
            return r5
        L79:
            r5.getClass()
            ads_mobile_sdk.xu0 r5 = (ads_mobile_sdk.xu0) r5
            java.lang.Object r5 = r5.b
            dev.epro.r0.I16631908410500040363 r5 = (dev.epro.r0.I16631908410500040363) r5
            java.lang.String r6 = "success"
            r7 = 0
            boolean r6 = ads_mobile_sdk.d62.a(r5, r6, r7)
            if (r6 != 0) goto L93
            ads_mobile_sdk.tu0 r5 = new ads_mobile_sdk.tu0
            java.lang.String r6 = "Process native ad json failed"
            r5.<init>(r6, r1)
            return r5
        L93:
            java.lang.String r6 = "json"
            if (r5 != 0) goto L99
        L97:
            r5 = r2
            goto L9d
        L99:
            dev.epro.r0.I16631908410500040363 r5 = r5.y(r6)     // Catch: java.lang.Exception -> L97
        L9d:
            if (r5 == 0) goto Lbd
            java.lang.String r6 = "ads"
            dev.epro.r0.P16422848101170923038 r5 = ads_mobile_sdk.d62.e(r5, r6)
            if (r5 != 0) goto La8
            goto Lbd
        La8:
            java.util.ArrayList r6 = r5.a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto Lb7
            ads_mobile_sdk.uu0 r5 = new ads_mobile_sdk.uu0
            r6 = 3
            r5.<init>(r2, r6)
            return r5
        Lb7:
            ads_mobile_sdk.xu0 r6 = new ads_mobile_sdk.xu0
            r6.<init>(r5)
            return r6
        Lbd:
            ads_mobile_sdk.tu0 r5 = new ads_mobile_sdk.tu0
            java.lang.String r6 = "Invalid processed native ad json"
            r5.<init>(r6, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su1.a(dev.epro.r0.X16599180054040010357, ads_mobile_sdk.z1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
