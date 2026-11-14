package ads_mobile_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.CookieManager;
import dev.epro.r0.C1290752467339106930;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F14240031463097426304;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H16432513849385007664;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K15572083692188606544;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.N5829968851568792302;
import dev.epro.r0.O11899788901879362309;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O5354877807466160604;
import dev.epro.r0.P10813970601447104553;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.Q1304841290039450495;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R5692663580087387669;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.S12091007627917879797;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class fz extends c61 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final Pattern P = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public static final I16631908410500040363 Q;
    public static final I16631908410500040363 R;
    public static final Bundle S;
    public final ft1 A;
    public final R5692663580087387669 B;
    public CookieManager C;
    public SharedPreferences D;
    public final ft1 E;
    public final H15186625828076266306 F;
    public X7175349259954592591 G;
    public boolean H;
    public final H15186625828076266306 I;
    public uq J;
    public O11899788901879362309 K;
    public final H15186625828076266306 L;
    public String M;
    public O11899788901879362309 N;
    public long O;
    public final Context c;
    public final W5797197595347441198 d;
    public final zj1 e;
    public final ci3 f;
    public final F14240031463097426304 g;
    public final jr0 h;
    public final rw0 i;
    public final H16432513849385007664 j;
    public final ji k;
    public final pa2 l;
    public final um0 m;
    public final O16637889491137121389 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kz2 f38o;
    public final V2597580950516131749 q;
    public final P10813970601447104553 r;
    public final zq0 s;
    public final qq0 t;
    public final h70 u;
    public final pe2 v;
    public final H15186625828076266306 w;
    public Bundle x;
    public final H15186625828076266306 y;
    public I16631908410500040363 z;

    static {
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        Boolean bool = Boolean.TRUE;
        i16631908410500040363.r("gad_idless", bool);
        Boolean bool2 = Boolean.FALSE;
        i16631908410500040363.r("has_special_purposes", bool2);
        Q = i16631908410500040363;
        I16631908410500040363 i166319084105000403632 = new I16631908410500040363();
        i166319084105000403632.r("gad_idless", bool2);
        i166319084105000403632.r("has_special_purposes", bool);
        R = i166319084105000403632;
        S = O5354877807466160604.z(new H9390398899829886498("fake_key", "fake_val"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(Context context, W5797197595347441198 w5797197595347441198, zj1 zj1Var, ci3 ci3Var, F14240031463097426304 f14240031463097426304, jr0 jr0Var, rw0 rw0Var, H16432513849385007664 h16432513849385007664, ji jiVar, pa2 pa2Var, um0 um0Var, O16637889491137121389 o16637889491137121389, kz2 kz2Var, Q1304841290039450495 q1304841290039450495, z2 z2Var, P10813970601447104553 p10813970601447104553, zq0 zq0Var, qq0 qq0Var, h70 h70Var, pe2 pe2Var) {
        super(wv0.CUI_NAME_SDKINIT_INIT_CONSENT_STATE, 2);
        context.getClass();
        w5797197595347441198.getClass();
        zj1Var.getClass();
        ci3Var.getClass();
        jr0Var.getClass();
        rw0Var.getClass();
        h16432513849385007664.getClass();
        jiVar.getClass();
        pa2Var.getClass();
        um0Var.getClass();
        o16637889491137121389.getClass();
        kz2Var.getClass();
        q1304841290039450495.getClass();
        z2Var.getClass();
        p10813970601447104553.getClass();
        zq0Var.getClass();
        qq0Var.getClass();
        h70Var.getClass();
        pe2Var.getClass();
        this.c = context;
        this.d = w5797197595347441198;
        this.e = zj1Var;
        this.f = ci3Var;
        this.g = f14240031463097426304;
        this.h = jr0Var;
        this.i = rw0Var;
        this.j = h16432513849385007664;
        this.k = jiVar;
        this.l = pa2Var;
        this.m = um0Var;
        this.n = o16637889491137121389;
        this.f38o = kz2Var;
        this.q = z2Var;
        this.r = p10813970601447104553;
        this.s = zq0Var;
        this.t = qq0Var;
        this.u = h70Var;
        this.v = pe2Var;
        this.w = new H15186625828076266306();
        this.x = S;
        this.y = new H15186625828076266306();
        this.z = Q;
        N5829968851568792302 n5829968851568792302S = ax.s();
        n5829968851568792302S.getClass();
        this.A = new ft1((ax) n5829968851568792302S.a());
        this.B = J8045362843799184672.k();
        this.E = new ft1(String.valueOf(C1290752467339106930.b.k(Integer.MAX_VALUE)));
        this.F = new H15186625828076266306();
        this.I = new H15186625828076266306();
        this.L = new H15186625828076266306();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.O = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r8.v(r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.fz r7, boolean r8, boolean r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.qy
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.qy r0 = (ads_mobile_sdk.qy) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.qy r0 = new ads_mobile_sdk.qy
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L40
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L93
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L32:
            boolean r9 = r0.d
            boolean r8 = r0.c
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            r10 = r7
            r7 = r1
            goto L56
        L40:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.H15186625828076266306 r10 = r7.F
            r0.a = r7
            r0.b = r10
            r0.c = r8
            r0.d = r9
            r0.g = r3
            java.lang.Object r1 = r10.c(r0)
            if (r1 != r5) goto L56
            goto L92
        L56:
            dev.epro.r0.X7175349259954592591 r1 = r7.G     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L60
            r1.c(r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r7 = move-exception
            goto L96
        L60:
            boolean r1 = r7.H     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L69
            if (r8 == 0) goto L67
            goto L69
        L67:
            r8 = 0
            goto L6a
        L69:
            r8 = r3
        L6a:
            r7.H = r8     // Catch: java.lang.Throwable -> L5e
            dev.epro.r0.W5797197595347441198 r1 = r7.d     // Catch: java.lang.Throwable -> L5e
            ads_mobile_sdk.ry r6 = new ads_mobile_sdk.ry     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r7, r8, r9, r4)     // Catch: java.lang.Throwable -> L5e
            dev.epro.r0.I3826119971291161142 r8 = dev.epro.r0.I3826119971291161142.a     // Catch: java.lang.Throwable -> L5e
            r1.getClass()     // Catch: java.lang.Throwable -> L5e
            dev.epro.r0.P7598478828797568949 r9 = new dev.epro.r0.P7598478828797568949     // Catch: java.lang.Throwable -> L5e
            r9.<init>(r6, r4, r3)     // Catch: java.lang.Throwable -> L5e
            dev.epro.r0.X7175349259954592591 r8 = dev.epro.r0.R7033599853981556291.E(r1, r8, r4, r9, r2)     // Catch: java.lang.Throwable -> L5e
            r7.G = r8     // Catch: java.lang.Throwable -> L5e
            r10.b(r4)
            r0.a = r4
            r0.b = r4
            r0.g = r2
            java.lang.Object r7 = r8.v(r0)
            if (r7 != r5) goto L93
        L92:
            return r5
        L93:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        L96:
            r10.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.b(ads_mobile_sdk.fz, boolean, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.fz r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.vx
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.vx r0 = (ads_mobile_sdk.vx) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.vx r0 = new ads_mobile_sdk.vx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.e
            int r1 = r0.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            dev.epro.r0.F14240031463097426304 r4 = r0.d
            dev.epro.r0.F14240031463097426304 r1 = r0.c
            dev.epro.r0.H15186625828076266306 r2 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L52
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.F14240031463097426304 r5 = r4.g
            dev.epro.r0.H15186625828076266306 r1 = r4.w
            r0.a = r4
            r0.b = r1
            r0.c = r5
            r0.d = r5
            r0.g = r2
            java.lang.Object r0 = r1.c(r0)
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r2) goto L4e
            return r2
        L4e:
            r0 = r4
            r4 = r5
            r2 = r1
            r1 = r4
        L52:
            android.os.Bundle r5 = r0.x     // Catch: java.lang.Throwable -> L62
            r2.b(r3)
            java.lang.String r4 = r4.g(r5)
            java.lang.Class<dev.epro.r0.I16631908410500040363> r5 = dev.epro.r0.I16631908410500040363.class
            java.lang.Object r4 = r1.b(r5, r4)
            return r4
        L62:
            r4 = move-exception
            r2.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.d(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        if (r9 != r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[PHI: r7 r10
      0x00bc: PHI (r7v4 ads_mobile_sdk.fz) = (r7v2 ads_mobile_sdk.fz), (r7v5 ads_mobile_sdk.fz) binds: [B:23:0x00b8, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:23:0x00b8, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e A[PHI: r1 r2 r9
      0x013e: PHI (r1v17 ads_mobile_sdk.iz) = (r1v14 ads_mobile_sdk.iz), (r1v20 ads_mobile_sdk.iz) binds: [B:49:0x013b, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r2v4 ads_mobile_sdk.fz) = (r2v2 ads_mobile_sdk.fz), (r2v5 ads_mobile_sdk.fz) binds: [B:49:0x013b, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x013e: PHI (r9v21 ads_mobile_sdk.a70) = (r9v18 ads_mobile_sdk.a70), (r9v26 ads_mobile_sdk.a70) binds: [B:49:0x013b, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.fz r9, dev.epro.r0.K14749510448791472029 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.e(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(ads_mobile_sdk.fz r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.dy
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.dy r0 = (ads_mobile_sdk.dy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.dy r0 = new ads_mobile_sdk.dy
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L31:
            ads_mobile_sdk.yw r7 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L50
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.ft1 r8 = r7.A
            r0.a = r7
            ads_mobile_sdk.yw r1 = ads_mobile_sdk.yw.API_READ_PERSISTENT_SDK_CORE_DATA
            r0.b = r1
            r0.e = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r5) goto L4d
            goto L6d
        L4d:
            r6 = r1
            r1 = r7
            r7 = r6
        L50:
            ads_mobile_sdk.ax r8 = (ads_mobile_sdk.ax) r8
            ads_mobile_sdk.ob1 r8 = r8.p()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L71
            ads_mobile_sdk.qq0 r7 = r1.t
            r0.a = r4
            r0.b = r4
            r0.e = r2
            r7.getClass()
            java.lang.Object r8 = ads_mobile_sdk.qq0.c(r7, r0)
            if (r8 != r5) goto L6e
        L6d:
            return r5
        L6e:
            java.util.Map r8 = (java.util.Map) r8
            return r8
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.f(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(ads_mobile_sdk.fz r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.ey
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.ey r0 = (ads_mobile_sdk.ey) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ey r0 = new ads_mobile_sdk.ey
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L6b
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L31:
            ads_mobile_sdk.yw r7 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L50
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.ft1 r8 = r7.A
            r0.a = r7
            ads_mobile_sdk.yw r1 = ads_mobile_sdk.yw.API_READ_SESSION_ID
            r0.b = r1
            r0.e = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r5) goto L4d
            goto L6a
        L4d:
            r6 = r1
            r1 = r7
            r7 = r6
        L50:
            ads_mobile_sdk.ax r8 = (ads_mobile_sdk.ax) r8
            ads_mobile_sdk.ob1 r8 = r8.p()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L6e
            ads_mobile_sdk.ft1 r7 = r1.E
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r5) goto L6b
        L6a:
            return r5
        L6b:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.g(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002f, B:31:0x008a, B:33:0x0090), top: B:69:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[Catch: all -> 0x00b6, TryCatch #2 {all -> 0x00b6, blocks: (B:39:0x00a3, B:41:0x00aa, B:43:0x00ae, B:45:0x00b2, B:48:0x00b8, B:50:0x00bc, B:52:0x00c0, B:54:0x00c4, B:55:0x00c5, B:56:0x00ca, B:57:0x00cb, B:58:0x00d2, B:59:0x00d3, B:60:0x00da, B:61:0x00db), top: B:71:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #2 {all -> 0x00b6, blocks: (B:39:0x00a3, B:41:0x00aa, B:43:0x00ae, B:45:0x00b2, B:48:0x00b8, B:50:0x00bc, B:52:0x00c0, B:54:0x00c4, B:55:0x00c5, B:56:0x00ca, B:57:0x00cb, B:58:0x00d2, B:59:0x00d3, B:60:0x00da, B:61:0x00db), top: B:71:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(ads_mobile_sdk.fz r7, dev.epro.r0.K14749510448791472029 r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.h(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r1 == r8) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:27:0x0085, B:29:0x009e, B:32:0x00ab, B:34:0x00af, B:36:0x00ea, B:37:0x00f9, B:39:0x00fd, B:41:0x0103, B:43:0x0109), top: B:55:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:27:0x0085, B:29:0x009e, B:32:0x00ab, B:34:0x00af, B:36:0x00ea, B:37:0x00f9, B:39:0x00fd, B:41:0x0103, B:43:0x0109), top: B:55:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(ads_mobile_sdk.fz r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.i(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object j(ads_mobile_sdk.fz r11, dev.epro.r0.K14749510448791472029 r12) {
        /*
            boolean r0 = r12 instanceof ads_mobile_sdk.iy
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.iy r0 = (ads_mobile_sdk.iy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.iy r0 = new ads_mobile_sdk.iy
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.yw r11 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r12)
            goto L48
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r12)
            ads_mobile_sdk.ft1 r12 = r11.A
            r0.a = r11
            ads_mobile_sdk.yw r1 = ads_mobile_sdk.yw.API_GET_WEBVIEW_COOKIE
            r0.b = r1
            r0.e = r3
            java.lang.Object r12 = r12.a(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r12 != r0) goto L46
            return r0
        L46:
            r0 = r11
            r11 = r1
        L48:
            ads_mobile_sdk.ax r12 = (ads_mobile_sdk.ax) r12
            ads_mobile_sdk.ob1 r12 = r12.p()
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto Lad
            android.webkit.CookieManager r11 = r0.C
            if (r11 == 0) goto L6b
            ads_mobile_sdk.jr0 r12 = r0.h
            java.lang.String r0 = "https://googleads.g.doubleclick.net"
            ads_mobile_sdk.ao r1 = ads_mobile_sdk.ao.a$6
            java.lang.String r4 = "gads:webview_cookie_url"
            java.lang.Object r12 = r12.a(r4, r0, r1)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r11 = r11.getCookie(r12)
            goto L6c
        L6b:
            r11 = r2
        L6c:
            if (r11 == 0) goto Lad
            int r12 = r11.length()
            if (r12 != 0) goto L75
            goto Lad
        L75:
            java.util.regex.Pattern r12 = ads_mobile_sdk.fz.P
            java.util.regex.Matcher r11 = r12.matcher(r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L80:
            boolean r12 = r11.find()
            if (r12 == 0) goto La0
            java.lang.String r12 = r11.group(r3)
            if (r12 == 0) goto L80
            java.lang.String r0 = "id="
            boolean r0 = dev.epro.r0.Z13168519540281190457.F(r12, r0, r3)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "ide="
            boolean r0 = dev.epro.r0.Z13168519540281190457.F(r12, r0, r3)
            if (r0 == 0) goto L80
        L9c:
            r4.add(r12)
            goto L80
        La0:
            r9 = 0
            r10 = 62
            java.lang.String r5 = "; "
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r11 = dev.epro.r0.R9411874267597469228.J0(r4, r5, r6, r7, r8, r9, r10)
            return r11
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.j(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        if (b(r12, false, true, r0) != r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object l(ads_mobile_sdk.fz r12, dev.epro.r0.K14749510448791472029 r13) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.l(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r8 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(dev.epro.r0.K14749510448791472029 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.yx
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.yx r0 = (ads_mobile_sdk.yx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.yx r0 = new ads_mobile_sdk.yx
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L6f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L31:
            ads_mobile_sdk.yw r7 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L51
        L39:
            dev.epro.r0.E17665849472693074628.k(r8)
            r0.a = r7
            ads_mobile_sdk.yw r8 = ads_mobile_sdk.yw.API_READ_FIREBASE_APP_ID
            r0.b = r8
            r0.e = r3
            ads_mobile_sdk.ft1 r1 = r7.A
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r5) goto L4d
            goto L6e
        L4d:
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L51:
            ads_mobile_sdk.ax r8 = (ads_mobile_sdk.ax) r8
            ads_mobile_sdk.ob1 r8 = r8.p()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L72
            ads_mobile_sdk.um0 r7 = r1.m
            r0.a = r4
            r0.b = r4
            r0.e = r2
            r7.getClass()
            java.lang.Object r8 = ads_mobile_sdk.um0.a(r7, r0)
            if (r8 != r5) goto L6f
        L6e:
            return r5
        L6f:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L72:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.A(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.zx
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.zx r0 = (ads_mobile_sdk.zx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.zx r0 = new ads_mobile_sdk.zx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.yw r5 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            ads_mobile_sdk.yw r6 = ads_mobile_sdk.yw.API_READ_FIREBASE_APP_INSTANCE_ID
            r0.b = r6
            r0.e = r3
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            ads_mobile_sdk.ob1 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L65
            ads_mobile_sdk.um0 r5 = r0.m
            java.lang.String r6 = "getAppInstanceId"
            java.lang.Object r5 = r5.a(r6)
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.toString()
            return r5
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.B(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.ay
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.ay r0 = (ads_mobile_sdk.ay) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ay r0 = new ads_mobile_sdk.ay
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            ads_mobile_sdk.yw r6 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L4a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L32:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.yw r7 = ads_mobile_sdk.yw.API_PER_APP_ID_V1
            ads_mobile_sdk.ft1 r2 = r6.A
            r0.a = r6
            r0.b = r7
            r0.e = r3
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L4a:
            ads_mobile_sdk.ax r7 = (ads_mobile_sdk.ax) r7
            ads_mobile_sdk.ob1 r7 = r7.p()
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto Lae
            ads_mobile_sdk.pa2 r6 = r0.l
            r6.getClass()
            dev.epro.r0.O12494175665883759871 r7 = r6.c     // Catch: java.lang.Exception -> L9b
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Exception -> L9b
            r7.getClass()     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.sa2 r7 = (ads_mobile_sdk.sa2) r7     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.jr0 r6 = r6.a     // Catch: java.lang.Exception -> L9b
            dev.epro.r0.S12091007627917879797 r6 = r6.r     // Catch: java.lang.Exception -> L9b
            r6.getClass()     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = "gads:signal:paid_v1_ttl"
            dev.epro.r0.E17149812035295265804 r1 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Exception -> L9b
            dev.epro.r0.N13798149404328803870 r1 = dev.epro.r0.N13798149404328803870.DAYS     // Catch: java.lang.Exception -> L9b
            r2 = 182(0xb6, float:2.55E-43)
            long r1 = dev.epro.r0.M9216324016624295870.Z(r2, r1)     // Catch: java.lang.Exception -> L9b
            long r1 = dev.epro.r0.E17093345031926825464.e(r1)     // Catch: java.lang.Exception -> L9b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.ao r2 = ads_mobile_sdk.ao.a$26     // Catch: java.lang.Exception -> L9b
            java.lang.Object r6 = r6.a(r0, r1, r2)     // Catch: java.lang.Exception -> L9b
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Exception -> L9b
            long r0 = r6.longValue()     // Catch: java.lang.Exception -> L9b
            java.lang.Class<ads_mobile_sdk.sa2> r6 = ads_mobile_sdk.sa2.class
            monitor-enter(r6)     // Catch: java.lang.Exception -> L9b
            ads_mobile_sdk.wy0 r7 = r7.a(r0)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
            ads_mobile_sdk.xu0 r6 = new ads_mobile_sdk.xu0     // Catch: java.lang.Exception -> L9b
            r6.<init>(r7)     // Catch: java.lang.Exception -> L9b
            return r6
        L9b:
            r6 = move-exception
            goto La0
        L9d:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9d
            throw r7     // Catch: java.lang.Exception -> L9b
        La0:
            java.lang.String r7 = "Exception while getting PAIDV1"
            r0 = 4
            ads_mobile_sdk.zi3.a(r0, r7, r6)
            ads_mobile_sdk.qu0 r7 = new ads_mobile_sdk.qu0
            r0 = 6
            r1 = 0
            r7.<init>(r6, r1, r4, r0)
            return r7
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.C(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(dev.epro.r0.K14749510448791472029 r9) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.D(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(4:(1:(1:(5:15|134|16|91|92)(2:20|21))(8:22|138|23|140|86|87|(3:90|91|92)|89))(5:25|145|26|91|92)|139|101|(4:103|(1:107)|110|(2:112|(2:114|(1:116)(2:117|118))(2:119|120))(2:121|122))(1:123))(7:32|144|33|136|59|60|(2:62|89)(3:63|91|92))|128|82|(5:85|140|86|87|(0))|89) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e2, code lost:
    
        r2 = r3;
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ed A[Catch: all -> 0x01f9, TryCatch #15 {all -> 0x01f9, blocks: (B:101:0x01e6, B:103:0x01ed, B:105:0x01f1, B:107:0x01f5, B:110:0x01fc, B:112:0x0200, B:114:0x0204, B:116:0x0208, B:117:0x0209, B:118:0x020e, B:119:0x020f, B:120:0x0216, B:121:0x0217, B:122:0x021e, B:123:0x021f), top: B:139:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021f A[Catch: all -> 0x01f9, TRY_LEAVE, TryCatch #15 {all -> 0x01f9, blocks: (B:101:0x01e6, B:103:0x01ed, B:105:0x01f1, B:107:0x01f5, B:110:0x01fc, B:112:0x0200, B:114:0x0204, B:116:0x0208, B:117:0x0209, B:118:0x020e, B:119:0x020f, B:120:0x0216, B:121:0x0217, B:122:0x021e, B:123:0x021f), top: B:139:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d3  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(dev.epro.r0.K14749510448791472029 r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.E(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.ny
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ny r0 = (ads_mobile_sdk.ny) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ny r0 = new ads_mobile_sdk.ny
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.yw r5 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            ads_mobile_sdk.yw r6 = ads_mobile_sdk.yw.API_READ_AMAZON_FIRE_AD_ID
            r0.b = r6
            r0.e = r3
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            ads_mobile_sdk.ob1 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L6f
            android.content.Context r5 = r0.c
            android.content.ContentResolver r5 = r5.getContentResolver()
            if (r5 != 0) goto L5f
            goto L6f
        L5f:
            java.lang.String r6 = "limit_ad_tracking"
            r0 = 0
            int r5 = android.provider.Settings.Secure.getInt(r5, r6, r0)
            if (r5 != r3) goto L69
            goto L6a
        L69:
            r3 = r0
        L6a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.F(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
    
        if (r2.H(r0) == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(dev.epro.r0.K14749510448791472029 r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.G(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7.a(r6, r0) == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.uy
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.uy r0 = (ads_mobile_sdk.uy) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.uy r0 = new ads_mobile_sdk.uy
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L67
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r4
        L31:
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r6
            r6 = r1
            goto L4d
        L3b:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r6
            dev.epro.r0.H15186625828076266306 r7 = r6.y
            r0.b = r7
            r0.e = r3
            java.lang.Object r1 = r7.c(r0)
            if (r1 != r5) goto L4d
            goto L66
        L4d:
            dev.epro.r0.I16631908410500040363 r1 = ads_mobile_sdk.fz.Q     // Catch: java.lang.Throwable -> L6a
            r6.z = r1     // Catch: java.lang.Throwable -> L6a
            r7.b(r4)
            ads_mobile_sdk.ft1 r7 = r6.A
            ads_mobile_sdk.ax r6 = r6.c()
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r5) goto L67
        L66:
            return r5
        L67:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        L6a:
            r6 = move-exception
            r7.b(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.H(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x016d, code lost:
    
        if (r10.a(r9, r0) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(dev.epro.r0.K14749510448791472029 r10) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.I(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0252 A[Catch: all -> 0x025e, TryCatch #22 {all -> 0x025e, blocks: (B:123:0x024b, B:125:0x0252, B:127:0x0256, B:129:0x025a, B:132:0x0261, B:134:0x0265, B:136:0x0269, B:138:0x026d, B:139:0x026e, B:140:0x0273, B:141:0x0274, B:142:0x027b, B:143:0x027c, B:144:0x0283, B:145:0x0284), top: B:270:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0284 A[Catch: all -> 0x025e, TRY_LEAVE, TryCatch #22 {all -> 0x025e, blocks: (B:123:0x024b, B:125:0x0252, B:127:0x0256, B:129:0x025a, B:132:0x0261, B:134:0x0265, B:136:0x0269, B:138:0x026d, B:139:0x026e, B:140:0x0273, B:141:0x0274, B:142:0x027b, B:143:0x027c, B:144:0x0283, B:145:0x0284), top: B:270:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b2 A[Catch: all -> 0x02cc, TRY_LEAVE, TryCatch #10 {all -> 0x02cc, blocks: (B:155:0x02ac, B:157:0x02b2, B:165:0x02cf, B:166:0x02d8, B:167:0x02ec, B:196:0x0352), top: B:254:0x02ac, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02cf A[Catch: all -> 0x02cc, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x02cc, blocks: (B:155:0x02ac, B:157:0x02b2, B:165:0x02cf, B:166:0x02d8, B:167:0x02ec, B:196:0x0352), top: B:254:0x02ac, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x037d A[Catch: all -> 0x0389, TryCatch #7 {all -> 0x0389, blocks: (B:207:0x0376, B:209:0x037d, B:211:0x0381, B:213:0x0385, B:216:0x038c, B:218:0x0390, B:220:0x0394, B:222:0x0398, B:223:0x0399, B:224:0x039e, B:225:0x039f, B:226:0x03a6, B:227:0x03a7, B:228:0x03ae, B:229:0x03af), top: B:249:0x0376 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03af A[Catch: all -> 0x0389, TRY_LEAVE, TryCatch #7 {all -> 0x0389, blocks: (B:207:0x0376, B:209:0x037d, B:211:0x0381, B:213:0x0385, B:216:0x038c, B:218:0x0390, B:220:0x0394, B:222:0x0398, B:223:0x0399, B:224:0x039e, B:225:0x039f, B:226:0x03a6, B:227:0x03a7, B:228:0x03ae, B:229:0x03af), top: B:249:0x0376 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188 A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #0 {all -> 0x01a1, blocks: (B:71:0x0182, B:73:0x0188, B:81:0x01a4, B:82:0x01ad, B:83:0x01c1, B:112:0x0227), top: B:235:0x0182, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4 A[Catch: all -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01a1, blocks: (B:71:0x0182, B:73:0x0188, B:81:0x01a4, B:82:0x01ad, B:83:0x01c1, B:112:0x0227), top: B:235:0x0182, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f0  */
    /* JADX WARN: Type inference failed for: r10v3, types: [dev.epro.r0.F14240031463097426304] */
    /* JADX WARN: Type inference failed for: r10v5, types: [dev.epro.r0.F14240031463097426304] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r5v0, types: [dev.epro.r0.Z3437138737604933638, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v23, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v34, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.os.Bundle r18, dev.epro.r0.R4833348786910499294 r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(android.os.Bundle, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final ax c() {
        N5829968851568792302 n5829968851568792302S = ax.s();
        n5829968851568792302S.getClass();
        n5829968851568792302S.d();
        S12091007627917879797 s12091007627917879797 = this.h.r;
        s12091007627917879797.getClass();
        N5829968851568792302 n5829968851568792302S2 = ax.s();
        n5829968851568792302S2.getClass();
        c7 c7Var = new c7((Object) n5829968851568792302S2, (byte) 2);
        c7Var.a(c7Var.b(), yw.API_READ_SHARED_PREFERENCES_CONSENT_DATA);
        c7Var.a(c7Var.b(), yw.API_READ_FLAG_VALUES);
        c7Var.a(c7Var.b(), yw.API_WRITE_FLAG_VALUES);
        c7Var.a(c7Var.b(), yw.API_READ_CLD_RESPONSE);
        c7Var.a(c7Var.b(), yw.API_CLEAR_WEBVIEW_COOKIE);
        c7Var.a(c7Var.b(), yw.API_READ_ANDROID_ID);
        c7Var.a(c7Var.b(), yw.API_READ_ADVERTISING_ID);
        c7Var.a(c7Var.b(), yw.API_READ_APP_SET_ID);
        c7Var.a(c7Var.b(), yw.API_CLEAR_PER_APP_ID_V1);
        c7Var.a(c7Var.b(), yw.API_CLEAR_PER_APP_ID_V2);
        c7Var.a(c7Var.b(), yw.API_READ_FIREBASE_APP_ID);
        c7Var.a(c7Var.b(), yw.API_READ_FIREBASE_APP_INSTANCE_ID);
        c7Var.a(c7Var.b(), yw.API_READ_FIREBASE_AD_EVENT_ID);
        c7Var.a(c7Var.b(), yw.API_CLEAR_PERSISTENT_CACHE);
        R17185427375111049466 r17185427375111049466Q = ((ax) n5829968851568792302S2.a()).q();
        r17185427375111049466Q.getClass();
        List list = (List) s12091007627917879797.a("gads:consent_allowlist_default:string", r17185427375111049466Q, ao.a$19);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yw ywVarA = yw.a(((Number) it.next()).intValue());
            if (ywVarA != null) {
                arrayList.add(ywVarA);
            }
        }
        n5829968851568792302S.c(arrayList);
        return (ax) n5829968851568792302S.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075 A[Catch: X13554947934760653097 -> 0x009d, TRY_LEAVE, TryCatch #0 {X13554947934760653097 -> 0x009d, blocks: (B:30:0x006f, B:32:0x0075), top: B:51:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x008d -> B:37:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(dev.epro.r0.R4833348786910499294 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.fx
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.fx r0 = (ads_mobile_sdk.fx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.fx r0 = new ads_mobile_sdk.fx
            dev.epro.r0.K14749510448791472029 r7 = (dev.epro.r0.K14749510448791472029) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L32
            java.util.Iterator r6 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)     // Catch: dev.epro.r0.X13554947934760653097 -> L2d
            goto L90
        L2d:
            r6 = move-exception
        L2e:
            r7 = r6
            r6 = r1
            goto Lac
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            r6 = 0
            return r6
        L39:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.F14240031463097426304 r7 = new dev.epro.r0.F14240031463097426304     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            r7.<init>()     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            ads_mobile_sdk.jr0 r1 = r6.h     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            dev.epro.r0.S12091007627917879797 r1 = r1.r     // Catch: dev.epro.r0.X13554947934760653097 -> Lab
            java.lang.String r1 = r1.o()     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            java.lang.Class<dev.epro.r0.P16422848101170923038> r4 = dev.epro.r0.P16422848101170923038.class
            java.lang.Object r7 = r7.b(r4, r1)     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            dev.epro.r0.P16422848101170923038 r7 = (dev.epro.r0.P16422848101170923038) r7     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            r7.getClass()     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            boolean r1 = r7 instanceof java.util.Collection     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            if (r1 == 0) goto L66
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            boolean r1 = r1.isEmpty()     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            if (r1 == 0) goto L66
            goto La0
        L62:
            r7 = move-exception
            r1 = r6
            r6 = r7
            goto L2e
        L66:
            java.util.ArrayList r7 = r7.a     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            java.util.Iterator r7 = r7.iterator()     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            r5 = r7
            r7 = r6
            r6 = r5
        L6f:
            boolean r1 = r6.hasNext()     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r6.next()     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            dev.epro.r0.K15572083692188606544 r1 = (dev.epro.r0.K15572083692188606544) r1     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            r1.getClass()     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            r0.a = r7     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            r0.b = r6     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            r0.e = r3     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            java.lang.Object r1 = r7.a(r1, r0)     // Catch: dev.epro.r0.X13554947934760653097 -> L9d
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 != r4) goto L8d
            return r4
        L8d:
            r5 = r1
            r1 = r7
            r7 = r5
        L90:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: dev.epro.r0.X13554947934760653097 -> L2d
            boolean r7 = r7.booleanValue()     // Catch: dev.epro.r0.X13554947934760653097 -> L2d
            if (r7 == 0) goto L9b
            r6 = r1
            r2 = r3
            goto La0
        L9b:
            r7 = r1
            goto L6f
        L9d:
            r6 = move-exception
            goto La7
        L9f:
            r6 = r7
        La0:
            r7 = r2 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)     // Catch: dev.epro.r0.X13554947934760653097 -> L62
            return r6
        La7:
            r5 = r7
            r7 = r6
            r6 = r5
            goto Lac
        Lab:
            r7 = move-exception
        Lac:
            ads_mobile_sdk.ci3 r6 = r6.f
            java.lang.String r0 = "JSON fallback consent keys set parsing failure"
            r6.a(r0, r7)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.k(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        S12091007627917879797 s12091007627917879797 = this.h.r;
        s12091007627917879797.getClass();
        if (R9411874267597469228.v0((List) s12091007627917879797.a("gads:sp:consent_keys_list", K5751602218013079365.V("IABTCF_AddtlConsent", "IABConsent_CMPPresent", "IABTCF_CmpSdkID", "IABConsent_ConsentString", "IABTCF_gdprApplies", "IABGPP_HDR_GppString", "IABGPP_GppSID", "gad_has_consent_for_cookies", "IABConsent_ParsedPurposeConsents", "personalized_ad_status", "IABTCF_PolicyVersion", "IABUSPrivacy_String", "IABTCF_PurposeConsents", "gad_rdp", "IABConsent_SubjectToGDPR", "IABTCF_TCString", "IABConsent_ParsedVendorConsents", "UMP_eids"), ao.a$23), str)) {
            R4833348786910499294 r4833348786910499294 = null;
            hx hxVar = new hx(this, r4833348786910499294, (byte) 2);
            W5797197595347441198 w5797197595347441198 = this.d;
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(hxVar, r4833348786910499294, (byte) 1), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.ix
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ix r0 = (ads_mobile_sdk.ix) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ix r0 = new ads_mobile_sdk.ix
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.yw r5 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            ads_mobile_sdk.yw r6 = ads_mobile_sdk.yw.API_CLEAR_PERSISTENT_CACHE
            r0.b = r6
            r0.e = r3
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            ads_mobile_sdk.ob1 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L6b
            dev.epro.r0.W5797197595347441198 r5 = r0.d
            ads_mobile_sdk.hx r6 = new ads_mobile_sdk.hx
            r6.<init>(r0, r2, r3)
            r5.getClass()
            dev.epro.r0.P7598478828797568949 r0 = new dev.epro.r0.P7598478828797568949
            r0.<init>(r6, r2, r3)
            r6 = 2
            dev.epro.r0.I3826119971291161142 r1 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r5, r1, r2, r0, r6)
        L6b:
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.r(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.kx
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.kx r0 = (ads_mobile_sdk.kx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.kx r0 = new ads_mobile_sdk.kx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ads_mobile_sdk.yw r5 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4a
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            ads_mobile_sdk.yw r6 = ads_mobile_sdk.yw.API_CLEAR_PER_APP_ID_V1
            r0.b = r6
            r0.e = r2
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            ads_mobile_sdk.ob1 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L5b
            ads_mobile_sdk.pa2 r5 = r0.l
            r5.a()
        L5b:
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.s(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.lx
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.lx r0 = (ads_mobile_sdk.lx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.lx r0 = new ads_mobile_sdk.lx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ads_mobile_sdk.yw r5 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4a
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            ads_mobile_sdk.yw r6 = ads_mobile_sdk.yw.API_CLEAR_PER_APP_ID_V2
            r0.b = r6
            r0.e = r2
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            ads_mobile_sdk.ob1 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L5b
            ads_mobile_sdk.pa2 r5 = r0.l
            r5.b()
        L5b:
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.t(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r8.r(r0) != r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[PHI: r8
      0x006d: PHI (r8v3 'this' ads_mobile_sdk.fz) = (r8v2 'this' ads_mobile_sdk.fz), (r8v8 'this' ads_mobile_sdk.fz) binds: [B:27:0x006a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.mx
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.mx r0 = (ads_mobile_sdk.mx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.mx r0 = new ads_mobile_sdk.mx
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L49
            if (r1 == r6) goto L43
            if (r1 == r5) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L78
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L37:
            ads_mobile_sdk.fz r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L6d
        L3d:
            ads_mobile_sdk.fz r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L62
        L43:
            ads_mobile_sdk.fz r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L57
        L49:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r8
            r0.d = r6
            java.lang.Object r9 = r8.v(r0)
            if (r9 != r7) goto L57
            goto L77
        L57:
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = r8.s(r0)
            if (r9 != r7) goto L62
            goto L77
        L62:
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r8.t(r0)
            if (r9 != r7) goto L6d
            goto L77
        L6d:
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.r(r0)
            if (r8 != r7) goto L78
        L77:
            return r7
        L78:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.u(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(dev.epro.r0.K14749510448791472029 r11) {
        /*
            r10 = this;
            ads_mobile_sdk.ao r0 = ads_mobile_sdk.ao.a$6
            boolean r1 = r11 instanceof ads_mobile_sdk.nx
            if (r1 == 0) goto L15
            r1 = r11
            ads_mobile_sdk.nx r1 = (ads_mobile_sdk.nx) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            ads_mobile_sdk.nx r1 = new ads_mobile_sdk.nx
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.c
            int r2 = r1.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ads_mobile_sdk.yw r10 = r1.b
            ads_mobile_sdk.fz r1 = r1.a
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L4c
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r11)
            r1.a = r10
            ads_mobile_sdk.yw r11 = ads_mobile_sdk.yw.API_CLEAR_WEBVIEW_COOKIE
            r1.b = r11
            r1.e = r4
            ads_mobile_sdk.ft1 r2 = r10.A
            java.lang.Object r1 = r2.a(r1)
            dev.epro.r0.Z3437138737604933638 r2 = dev.epro.r0.Z3437138737604933638.a
            if (r1 != r2) goto L48
            return r2
        L48:
            r9 = r1
            r1 = r10
            r10 = r11
            r11 = r9
        L4c:
            ads_mobile_sdk.ax r11 = (ads_mobile_sdk.ax) r11
            ads_mobile_sdk.ob1 r11 = r11.p()
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto Lc3
            android.webkit.CookieManager r10 = r1.C
            ads_mobile_sdk.jr0 r11 = r1.h
            java.lang.String r2 = "https://googleads.g.doubleclick.net"
            java.lang.String r4 = "gads:webview_cookie_url"
            if (r10 == 0) goto L6c
            java.lang.Object r3 = r11.a(r4, r2, r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r10.getCookie(r3)
        L6c:
            if (r3 != 0) goto L6f
            goto Lc3
        L6f:
            java.lang.String r10 = ";"
            java.lang.String[] r10 = new java.lang.String[]{r10}
            r5 = 6
            java.util.List r10 = dev.epro.r0.M8927913404651150384.p0(r3, r10, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r10 = r10.iterator()
        L83:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r10.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = dev.epro.r0.M8927913404651150384.Y(r6)
            if (r6 != 0) goto L83
            r3.add(r5)
            goto L83
        L9a:
            int r10 = r3.size()
            r5 = 0
        L9f:
            if (r5 >= r10) goto Lc3
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "="
            java.lang.String r6 = dev.epro.r0.M8927913404651150384.x0(r6, r7, r6)
            java.lang.String r7 = "=; Max-Age=-1; path=/; domain=.doubleclick.net"
            java.lang.String r6 = r6.concat(r7)
            android.webkit.CookieManager r7 = r1.C
            if (r7 == 0) goto L9f
            java.lang.Object r8 = r11.a(r4, r2, r0)
            java.lang.String r8 = (java.lang.String) r8
            r7.setCookie(r8, r6)
            goto L9f
        Lc3:
            dev.epro.r0.O9245300239821758723 r10 = dev.epro.r0.O9245300239821758723.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.v(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r10 != r5) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(dev.epro.r0.K14749510448791472029 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.px
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.px r0 = (ads_mobile_sdk.px) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.px r0 = new ads_mobile_sdk.px
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 2
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L32
            if (r1 != r3) goto L2c
            dev.epro.r0.E17665849472693074628.k(r10)
            goto La6
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r4
        L32:
            ads_mobile_sdk.yw r9 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L52
        L3a:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r9
            ads_mobile_sdk.yw r10 = ads_mobile_sdk.yw.API_READ_ADVERTISING_ID
            r0.b = r10
            r0.e = r2
            ads_mobile_sdk.ft1 r1 = r9.A
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r5) goto L4e
            goto La5
        L4e:
            r8 = r1
            r1 = r9
            r9 = r10
            r10 = r8
        L52:
            ads_mobile_sdk.ax r10 = (ads_mobile_sdk.ax) r10
            ads_mobile_sdk.ob1 r10 = r10.p()
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto La9
            dev.epro.r0.H16432513849385007664 r9 = r1.j
            android.content.Context r10 = r1.c
            r0.a = r4
            r0.b = r4
            r0.e = r3
            r9.getClass()
            ads_mobile_sdk.xu0 r9 = new ads_mobile_sdk.xu0     // Catch: java.lang.Exception -> L8d
            dev.epro.r0.M13065320725254807008 r0 = new dev.epro.r0.M13065320725254807008     // Catch: java.lang.Exception -> L8d
            r0.<init>(r10)     // Catch: java.lang.Exception -> L8d
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L8f
            r0.b()     // Catch: java.lang.Throwable -> L8f
            dev.epro.r0.F6124250193528699243 r10 = r0.d()     // Catch: java.lang.Throwable -> L8f
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L8f
            long r6 = r6 - r1
            dev.epro.r0.M13065320725254807008.c(r10, r6, r4)     // Catch: java.lang.Throwable -> L8f
            r0.a()     // Catch: java.lang.Exception -> L8d
            r9.<init>(r10)     // Catch: java.lang.Exception -> L8d
            r10 = r9
            goto La3
        L8d:
            r9 = move-exception
            goto L9b
        L8f:
            r9 = move-exception
            r1 = -1
            dev.epro.r0.M13065320725254807008.c(r4, r1, r9)     // Catch: java.lang.Throwable -> L96
            throw r9     // Catch: java.lang.Throwable -> L96
        L96:
            r9 = move-exception
            r0.a()     // Catch: java.lang.Exception -> L8d
            throw r9     // Catch: java.lang.Exception -> L8d
        L9b:
            ads_mobile_sdk.qu0 r10 = new ads_mobile_sdk.qu0
            java.lang.String r0 = "Exception caught fetching Ad ID"
            r1 = 0
            r10.<init>(r9, r1, r0, r3)
        La3:
            if (r10 != r5) goto La6
        La5:
            return r5
        La6:
            dev.epro.r0.M16184408391440927034 r10 = (dev.epro.r0.M16184408391440927034) r10
            return r10
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.w(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.qx
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.qx r0 = (ads_mobile_sdk.qx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qx r0 = new ads_mobile_sdk.qx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.yw r5 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            ads_mobile_sdk.yw r6 = ads_mobile_sdk.yw.API_READ_AMAZON_FIRE_AD_ID
            r0.b = r6
            r0.e = r3
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            ads_mobile_sdk.ob1 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L66
            android.content.Context r5 = r0.c
            android.content.ContentResolver r5 = r5.getContentResolver()
            if (r5 != 0) goto L5f
            goto L66
        L5f:
            java.lang.String r6 = "advertising_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r6)
            return r5
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.x(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0118, code lost:
    
        if (r1 == r8) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[Catch: all -> 0x00d9, TryCatch #0 {all -> 0x00d9, blocks: (B:27:0x0086, B:29:0x008a, B:31:0x00ca, B:34:0x00db, B:36:0x00df, B:38:0x00e5, B:40:0x00eb), top: B:52:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.y(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.xx
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.xx r0 = (ads_mobile_sdk.xx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.xx r0 = new ads_mobile_sdk.xx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.yw r5 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L4a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            ads_mobile_sdk.yw r6 = ads_mobile_sdk.yw.API_READ_FIREBASE_AD_EVENT_ID
            r0.b = r6
            r0.e = r3
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L4a:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            ads_mobile_sdk.ob1 r6 = r6.p()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L65
            ads_mobile_sdk.um0 r5 = r0.m
            java.lang.String r6 = "generateEventId"
            java.lang.Object r5 = r5.a(r6)
            if (r5 == 0) goto L65
            java.lang.String r5 = r5.toString()
            return r5
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.z(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.fz r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.tx
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.tx r0 = (ads_mobile_sdk.tx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.tx r0 = new ads_mobile_sdk.tx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.y
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            dev.epro.r0.I16631908410500040363 r4 = r4.z     // Catch: java.lang.Throwable -> L4c
            r5.b(r3)
            return r4
        L4c:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.b(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.ax r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof ads_mobile_sdk.zy
            if (r3 == 0) goto L19
            r3 = r2
            ads_mobile_sdk.zy r3 = (ads_mobile_sdk.zy) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.d = r4
            goto L1e
        L19:
            ads_mobile_sdk.zy r3 = new ads_mobile_sdk.zy
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.b
            int r4 = r3.d
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            dev.epro.r0.Z3437138737604933638 r11 = dev.epro.r0.Z3437138737604933638.a
            if (r4 == 0) goto L4f
            if (r4 == r10) goto L49
            if (r4 == r9) goto L45
            if (r4 == r8) goto L3f
            if (r4 != r7) goto L39
            dev.epro.r0.E17665849472693074628.k(r2)
            return r5
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r0)
            return r6
        L3f:
            ads_mobile_sdk.fz r0 = r3.a
            dev.epro.r0.E17665849472693074628.k(r2)
            goto L6e
        L45:
            dev.epro.r0.E17665849472693074628.k(r2)
            return r5
        L49:
            ads_mobile_sdk.fz r0 = r3.a
            dev.epro.r0.E17665849472693074628.k(r2)
            goto L84
        L4f:
            dev.epro.r0.E17665849472693074628.k(r2)
            ads_mobile_sdk.jr0 r2 = r0.h
            boolean r4 = r2.w
            ads_mobile_sdk.ft1 r12 = r0.A
            if (r4 != 0) goto L79
            double r13 = r2.x
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L63
            goto L79
        L63:
            r3.a = r0
            r3.d = r8
            java.lang.Object r1 = r12.a(r1, r3)
            if (r1 != r11) goto L6e
            goto L92
        L6e:
            r3.a = r6
            r3.d = r7
            java.lang.Object r0 = r0.u(r3)
            if (r0 != r11) goto L93
            goto L92
        L79:
            r3.a = r0
            r3.d = r10
            java.lang.Object r1 = r12.a(r1, r3)
            if (r1 != r11) goto L84
            goto L92
        L84:
            r3.a = r6
            r3.d = r9
            r0.getClass()
            r1 = 0
            java.lang.Object r0 = b(r0, r10, r1, r3)
            if (r0 != r11) goto L93
        L92:
            return r11
        L93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.b(ads_mobile_sdk.ax, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.az
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.az r0 = (ads_mobile_sdk.az) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.az r0 = new ads_mobile_sdk.az
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            ads_mobile_sdk.yw r5 = r0.c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L4e
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L32:
            dev.epro.r0.E17665849472693074628.k(r7)
            r0.a = r5
            r0.b = r6
            ads_mobile_sdk.yw r7 = ads_mobile_sdk.yw.API_SET_WEBVIEW_COOKIE
            r0.c = r7
            r0.f = r2
            ads_mobile_sdk.ft1 r1 = r5.A
            java.lang.Object r0 = r1.a(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r4 = r0
            r0 = r5
            r5 = r7
            r7 = r4
        L4e:
            ads_mobile_sdk.ax r7 = (ads_mobile_sdk.ax) r7
            ads_mobile_sdk.ob1 r7 = r7.p()
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L6f
            android.webkit.CookieManager r5 = r0.C
            if (r5 == 0) goto L6f
            ads_mobile_sdk.jr0 r7 = r0.h
            java.lang.String r0 = "https://googleads.g.doubleclick.net"
            ads_mobile_sdk.ao r1 = ads_mobile_sdk.ao.a$6
            java.lang.String r2 = "gads:webview_cookie_url"
            java.lang.Object r7 = r7.a(r2, r0, r1)
            java.lang.String r7 = (java.lang.String) r7
            r5.setCookie(r7, r6)
        L6f:
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.b(java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(ads_mobile_sdk.fz r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.ly
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.ly r0 = (ads_mobile_sdk.ly) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.ly r0 = new ads_mobile_sdk.ly
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2c:
            dev.epro.r0.E17665849472693074628.k(r5)
            ads_mobile_sdk.ft1 r4 = r4.A
            r0.c = r2
            java.lang.Object r5 = r4.a(r0)
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r4) goto L3c
            return r4
        L3c:
            ads_mobile_sdk.ax r5 = (ads_mobile_sdk.ax) r5
            ads_mobile_sdk.ob1 r4 = r5.p()
            ads_mobile_sdk.yw r5 = ads_mobile_sdk.yw.API_READ_TRUSTLESS_TOKEN
            boolean r4 = r4.contains(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.k(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.fz r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.ux
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.ux r0 = (ads_mobile_sdk.ux) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ux r0 = new ads_mobile_sdk.ux
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r4 = r0.b
            ads_mobile_sdk.fz r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            r5 = r4
            r4 = r0
            goto L46
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r5)
            dev.epro.r0.H15186625828076266306 r5 = r4.w
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r0 = r5.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            android.os.Bundle r4 = r4.x     // Catch: java.lang.Throwable -> L4c
            r5.b(r3)
            return r4
        L4c:
            r4 = move-exception
            r5.b(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.c(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return l(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01da A[Catch: all -> 0x01b5, TRY_LEAVE, TryCatch #11 {all -> 0x01b5, blocks: (B:95:0x01a2, B:97:0x01a9, B:99:0x01ad, B:101:0x01b1, B:104:0x01b7, B:106:0x01bb, B:108:0x01bf, B:110:0x01c3, B:111:0x01c4, B:112:0x01c9, B:113:0x01ca, B:114:0x01d1, B:115:0x01d2, B:116:0x01d9, B:117:0x01da), top: B:208:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0200 A[Catch: all -> 0x0211, TryCatch #9 {all -> 0x0211, blocks: (B:28:0x006c, B:127:0x01fa, B:129:0x0200, B:134:0x0214, B:136:0x0218), top: B:205:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0214 A[Catch: all -> 0x0211, TryCatch #9 {all -> 0x0211, blocks: (B:28:0x006c, B:127:0x01fa, B:129:0x0200, B:134:0x0214, B:136:0x0218), top: B:205:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0229 A[PHI: r3 r4 r14
      0x0229: PHI (r3v32 ads_mobile_sdk.th3) = (r3v46 ads_mobile_sdk.th3), (r3v47 ads_mobile_sdk.th3), (r3v48 ads_mobile_sdk.th3), (r3v49 ads_mobile_sdk.th3) binds: [B:135:0x0216, B:137:0x0226, B:130:0x020e, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r4v18 ads_mobile_sdk.fz) = (r4v15 ads_mobile_sdk.fz), (r4v15 ads_mobile_sdk.fz), (r4v15 ads_mobile_sdk.fz), (r4v23 ads_mobile_sdk.fz) binds: [B:135:0x0216, B:137:0x0226, B:130:0x020e, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0229: PHI (r14v32 java.io.Closeable) = (r14v51 java.io.Closeable), (r14v52 java.io.Closeable), (r14v53 java.io.Closeable), (r14v54 java.io.Closeable) binds: [B:135:0x0216, B:137:0x0226, B:130:0x020e, B:23:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0278 A[Catch: all -> 0x0284, TryCatch #3 {all -> 0x0284, blocks: (B:164:0x0271, B:166:0x0278, B:168:0x027c, B:170:0x0280, B:173:0x0286, B:175:0x028a, B:177:0x028e, B:179:0x0292, B:180:0x0293, B:181:0x0298, B:182:0x0299, B:183:0x02a0, B:184:0x02a1, B:185:0x02a8, B:186:0x02a9), top: B:196:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a9 A[Catch: all -> 0x0284, TRY_LEAVE, TryCatch #3 {all -> 0x0284, blocks: (B:164:0x0271, B:166:0x0278, B:168:0x027c, B:170:0x0280, B:173:0x0286, B:175:0x028a, B:177:0x028e, B:179:0x0292, B:180:0x0293, B:181:0x0298, B:182:0x0299, B:183:0x02a0, B:184:0x02a1, B:185:0x02a8, B:186:0x02a9), top: B:196:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132 A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:46:0x00b0, B:59:0x012c, B:61:0x0132, B:66:0x0146, B:68:0x014a), top: B:193:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146 A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:46:0x00b0, B:59:0x012c, B:61:0x0132, B:66:0x0146, B:68:0x014a), top: B:193:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b A[Catch: all -> 0x00a2, PHI: r3 r4 r14
      0x015b: PHI (r3v17 ads_mobile_sdk.th3) = (r3v54 ads_mobile_sdk.th3), (r3v55 ads_mobile_sdk.th3), (r3v56 ads_mobile_sdk.th3), (r3v57 ads_mobile_sdk.th3) binds: [B:67:0x0148, B:69:0x0157, B:62:0x013f, B:41:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r4v6 ads_mobile_sdk.fz) = (r4v3 ads_mobile_sdk.fz), (r4v3 ads_mobile_sdk.fz), (r4v3 ads_mobile_sdk.fz), (r4v9 ads_mobile_sdk.fz) binds: [B:67:0x0148, B:69:0x0157, B:62:0x013f, B:41:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x015b: PHI (r14v13 java.io.Closeable) = (r14v60 java.io.Closeable), (r14v61 java.io.Closeable), (r14v62 java.io.Closeable), (r14v63 java.io.Closeable) binds: [B:67:0x0148, B:69:0x0157, B:62:0x013f, B:41:0x009d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:41:0x009d, B:71:0x015b), top: B:191:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a9 A[Catch: all -> 0x01b5, TryCatch #11 {all -> 0x01b5, blocks: (B:95:0x01a2, B:97:0x01a9, B:99:0x01ad, B:101:0x01b1, B:104:0x01b7, B:106:0x01bb, B:108:0x01bf, B:110:0x01c3, B:111:0x01c4, B:112:0x01c9, B:113:0x01ca, B:114:0x01d1, B:115:0x01d2, B:116:0x01d9, B:117:0x01da), top: B:208:0x01a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.fz r14, dev.epro.r0.K14749510448791472029 r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(ads_mobile_sdk.fz, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        bundle.getClass();
        bundle2.getClass();
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> setKeySet = bundle.keySet();
        Set<String> setKeySet2 = bundle2.keySet();
        setKeySet2.getClass();
        if (!setKeySet.containsAll(setKeySet2)) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                if (!a((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            } else if (!S10823041268949770285.t(obj, obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.ax r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.gx
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.gx r0 = (ads_mobile_sdk.gx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.gx r0 = new ads_mobile_sdk.gx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.ax r5 = r0.b
            ads_mobile_sdk.fz r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L44
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r4
            r0.b = r5
            r0.e = r3
            ads_mobile_sdk.ft1 r6 = r4.A
            java.lang.Object r6 = r6.a(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r0) goto L44
            return r0
        L44:
            ads_mobile_sdk.ax r6 = (ads_mobile_sdk.ax) r6
            int r0 = r6.o()
            if (r0 <= 0) goto L68
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L68
            dev.epro.r0.W5797197595347441198 r5 = r4.d
            ads_mobile_sdk.hx r6 = new ads_mobile_sdk.hx
            r0 = 0
            r6.<init>(r4, r2, r0)
            r5.getClass()
            dev.epro.r0.P7598478828797568949 r4 = new dev.epro.r0.P7598478828797568949
            r4.<init>(r6, r2, r3)
            r6 = 2
            dev.epro.r0.I3826119971291161142 r0 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r5, r0, r2, r4, r6)
        L68:
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(ads_mobile_sdk.ax, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [ads_mobile_sdk.ox, dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [ads_mobile_sdk.fz] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dev.epro.r0.H15186625828076266306] */
    /* JADX WARN: Type inference failed for: r6v2, types: [dev.epro.r0.H15186625828076266306] */
    /* JADX WARN: Type inference failed for: r6v3, types: [dev.epro.r0.H15186625828076266306] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ads_mobile_sdk.fz] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [ads_mobile_sdk.fz] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ads_mobile_sdk.fz] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [dev.epro.r0.H15186625828076266306] */
    /* JADX WARN: Type inference failed for: r8v9, types: [ads_mobile_sdk.fz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K15572083692188606544 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(dev.epro.r0.K15572083692188606544, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void a(Map map, K15572083692188606544 k15572083692188606544, Bundle bundle) {
        ci3 ci3Var = this.f;
        try {
            I16631908410500040363 i16631908410500040363L = k15572083692188606544.l();
            K15572083692188606544 k15572083692188606544W = i16631908410500040363L.w("bk");
            String strP = k15572083692188606544W != null ? k15572083692188606544W.p() : null;
            K15572083692188606544 k15572083692188606544W2 = i16631908410500040363L.w("sk");
            String strP2 = k15572083692188606544W2 != null ? k15572083692188606544W2.p() : null;
            K15572083692188606544 k15572083692188606544W3 = i16631908410500040363L.w("type");
            Integer numValueOf = k15572083692188606544W3 != null ? Integer.valueOf(k15572083692188606544W3.j()) : null;
            Object obj = map.get(strP2);
            if (numValueOf != null && numValueOf.intValue() == 0) {
                if (obj instanceof String) {
                    bundle.putString(strP, (String) obj);
                    return;
                }
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                if (obj instanceof Integer) {
                    bundle.putInt(strP, ((Number) obj).intValue());
                    return;
                } else if (obj instanceof Long) {
                    bundle.putLong(strP, ((Number) obj).longValue());
                    return;
                } else {
                    if (obj instanceof Float) {
                        bundle.putFloat(strP, ((Number) obj).floatValue());
                        return;
                    }
                    return;
                }
            }
            if (numValueOf != null && numValueOf.intValue() == 2 && (obj instanceof Boolean)) {
                bundle.putBoolean(strP, ((Boolean) obj).booleanValue());
            }
        } catch (IllegalStateException e) {
            ci3Var.a("JSON shared preference consent key object parsing failure", (Throwable) e);
        } catch (NumberFormatException e2) {
            ci3Var.a("JSON shared preference consent key object parsing failure", (Throwable) e2);
        } catch (UnsupportedOperationException e3) {
            ci3Var.a("JSON shared preference consent key object parsing failure", (Throwable) e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Exception r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.jy
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.jy r0 = (ads_mobile_sdk.jy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.jy r0 = new ads_mobile_sdk.jy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.Exception r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L42
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2e:
            dev.epro.r0.E17665849472693074628.k(r6)
            ads_mobile_sdk.ax r6 = r4.c()
            r0.a = r5
            r0.d = r2
            java.lang.Object r4 = r4.b(r6, r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r6) goto L42
            return r6
        L42:
            r5.getClass()
            ads_mobile_sdk.th3 r4 = ads_mobile_sdk.ji3.a()
            ads_mobile_sdk.cc2 r6 = r4.e()
            r0 = 0
            r6.m = r0
            r4.a(r5)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(java.lang.Exception, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.pu0 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.ky
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ky r0 = (ads_mobile_sdk.ky) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ky r0 = new ads_mobile_sdk.ky
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L29
            ads_mobile_sdk.pu0 r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L52
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            boolean r6 = r5 instanceof ads_mobile_sdk.qu0
            if (r6 == 0) goto L41
            r6 = r5
            ads_mobile_sdk.qu0 r6 = (ads_mobile_sdk.qu0) r6
            java.lang.Throwable r6 = r6.c
            boolean r6 = r6 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L41
            return r2
        L41:
            ads_mobile_sdk.ax r6 = r4.c()
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = r4.b(r6, r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r6) goto L52
            return r6
        L52:
            r4 = 0
            ads_mobile_sdk.zi3.a(r5, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(ads_mobile_sdk.pu0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (ads_mobile_sdk.qq0.a(r7, r8, r9, r0) == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.fz r7, java.lang.String r8, java.lang.String r9, dev.epro.r0.R4833348786910499294 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.bz
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.bz r0 = (ads_mobile_sdk.bz) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.bz r0 = new ads_mobile_sdk.bz
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L7a
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L31:
            ads_mobile_sdk.yw r7 = r0.d
            java.lang.String r9 = r0.c
            java.lang.String r8 = r0.b
            ads_mobile_sdk.fz r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L58
        L3d:
            dev.epro.r0.E17665849472693074628.k(r10)
            ads_mobile_sdk.ft1 r10 = r7.A
            r0.a = r7
            r0.b = r8
            r0.c = r9
            ads_mobile_sdk.yw r1 = ads_mobile_sdk.yw.API_WRITE_PERSISTENT_SDK_CORE_DATA
            r0.d = r1
            r0.g = r3
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r5) goto L55
            goto L79
        L55:
            r6 = r1
            r1 = r7
            r7 = r6
        L58:
            ads_mobile_sdk.ax r10 = (ads_mobile_sdk.ax) r10
            ads_mobile_sdk.ob1 r10 = r10.p()
            boolean r7 = r10.contains(r7)
            if (r7 == 0) goto L7a
            ads_mobile_sdk.qq0 r7 = r1.t
            r0.a = r4
            r0.b = r4
            r0.c = r4
            r0.d = r4
            r0.g = r2
            r7.getClass()
            java.lang.Object r7 = ads_mobile_sdk.qq0.a(r7, r8, r9, r0)
            if (r7 != r5) goto L7a
        L79:
            return r5
        L7a:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(ads_mobile_sdk.fz, java.lang.String, java.lang.String, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b9 A[PHI: r1
      0x02b9: PHI (r1v38 ads_mobile_sdk.fz) = (r1v30 ads_mobile_sdk.fz), (r1v35 ads_mobile_sdk.fz), (r1v36 ads_mobile_sdk.fz), (r1v40 ads_mobile_sdk.fz) binds: [B:138:0x02b8, B:136:0x02b5, B:132:0x02a4, B:15:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0262 A[EXC_TOP_SPLITTER, PHI: r1 r5 r10 r11
      0x0262: PHI (r1v29 boolean) = (r1v27 boolean), (r1v34 boolean) binds: [B:118:0x025f, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r5v11 dev.epro.r0.H15186625828076266306) = (r5v9 dev.epro.r0.H15186625828076266306), (r5v13 dev.epro.r0.H15186625828076266306) binds: [B:118:0x025f, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r10v15 android.os.Bundle) = (r10v12 android.os.Bundle), (r10v17 android.os.Bundle) binds: [B:118:0x025f, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x0262: PHI (r11v13 ads_mobile_sdk.fz) = (r11v11 ads_mobile_sdk.fz), (r11v14 ads_mobile_sdk.fz) binds: [B:118:0x025f, B:17:0x005d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.fz r18, boolean r19, boolean r20, dev.epro.r0.K14749510448791472029 r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fz.a(ads_mobile_sdk.fz, boolean, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
