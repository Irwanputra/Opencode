package ads_mobile_sdk;

import android.net.Uri;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.E4951175994894594588;
import dev.epro.r0.F7878618420024429111;
import dev.epro.r0.H12843822278061842084;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.J15730374346044043770;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K5458285210510848811;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N11198609108095032895;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O12043144740933444288;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.W5797197595347441198;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class h11 implements O12043144740933444288 {
    public final jr0 a;
    public final K12714355155332733186 b;
    public final W5797197595347441198 c;
    public final F7878618420024429111 d;
    public hs e;
    public w81 f;
    public final H15186625828076266306 g;
    public volatile K5458285210510848811 h;
    public K5458285210510848811 i;

    public h11(jr0 jr0Var, aw awVar, K12714355155332733186 k12714355155332733186, W5797197595347441198 w5797197595347441198) {
        awVar.getClass();
        k12714355155332733186.getClass();
        w5797197595347441198.getClass();
        this.a = jr0Var;
        this.b = k12714355155332733186;
        this.c = w5797197595347441198;
        this.d = awVar.d;
        this.g = new H15186625828076266306();
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0170, code lost:
    
        if (r1 == r14) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0395 A[Catch: Exception -> 0x039a, TRY_ENTER, TryCatch #0 {Exception -> 0x039a, blocks: (B:60:0x0395, B:63:0x039d), top: B:58:0x0393 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x039d A[Catch: Exception -> 0x039a, TRY_LEAVE, TryCatch #0 {Exception -> 0x039a, blocks: (B:60:0x0395, B:63:0x039d), top: B:58:0x0393 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.G842859980338292746 r20, dev.epro.r0.K5458285210510848811 r21, boolean r22, ads_mobile_sdk.y11 r23, boolean r24, dev.epro.r0.K14749510448791472029 r25) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(dev.epro.r0.G842859980338292746, dev.epro.r0.K5458285210510848811, boolean, ads_mobile_sdk.y11, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.O12043144740933444288
    public final Object a(ef1 ef1Var) {
        long Z;
        N11198609108095032895 n11198609108095032895 = new N11198609108095032895();
        n11198609108095032895.a = new J15730374346044043770(this.d);
        jr0 jr0Var = this.a;
        if (jr0Var != null) {
            Z = jr0Var.D();
        } else {
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            Z = M9216324016624295870.Z(20, N13798149404328803870.SECONDS);
        }
        n11198609108095032895.a(E17093345031926825464.e(Z), TimeUnit.MILLISECONDS);
        this.h = new K5458285210510848811(n11198609108095032895);
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.O12043144740933444288
    public final Object a(int i, long j, l5 l5Var) {
        long Z;
        N11198609108095032895 n11198609108095032895 = new N11198609108095032895();
        n11198609108095032895.a = new J15730374346044043770(this.d);
        jr0 jr0Var = this.a;
        if (jr0Var != null) {
            Z = jr0Var.D();
        } else {
            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
            Z = M9216324016624295870.Z(20, N13798149404328803870.SECONDS);
        }
        n11198609108095032895.a(E17093345031926825464.e(Z), TimeUnit.MILLISECONDS);
        n11198609108095032895.b = new H12843822278061842084(i, j);
        this.i = new K5458285210510848811(n11198609108095032895);
        return O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.util.UUID r8, dev.epro.r0.I16631908410500040363 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.u01
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.u01 r0 = (ads_mobile_sdk.u01) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.u01 r0 = new ads_mobile_sdk.u01
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            dev.epro.r0.I16631908410500040363 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L7d
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L30:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.I16631908410500040363 r10 = new dev.epro.r0.I16631908410500040363
            r10.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            java.lang.String r4 = "timestamp"
            r10.s(r4, r1)
            java.lang.String r1 = "event"
            r10.t(r1, r7)
            dev.epro.r0.P16422848101170923038 r7 = new dev.epro.r0.P16422848101170923038
            r7.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "network_request_"
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.r(r8)
            java.lang.String r8 = "components"
            r10.q(r8, r7)
            java.lang.String r7 = "params"
            r10.q(r7, r9)
            r0.a = r10
            dev.epro.r0.H15186625828076266306 r6 = r6.g
            r0.b = r6
            r0.e = r2
            java.lang.Object r7 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r8) goto L7c
            return r8
        L7c:
            r7 = r10
        L7d:
            java.util.Objects.toString(r7)     // Catch: java.lang.Throwable -> L86
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L86
            r6.b(r3)
            return r7
        L86:
            r7 = move-exception
            r6.b(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(java.lang.String, java.util.UUID, dev.epro.r0.I16631908410500040363, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x012d, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ef, code lost:
    
        if (r0.a("onNetworkRequestError", r2, r3, r4) != r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c6, code lost:
    
        if (r0.a("onNetworkResponse", r2, r3, r4) == r11) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.P10917817599008460069 r18, java.util.UUID r19, dev.epro.r0.K14749510448791472029 r20) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(dev.epro.r0.P10917817599008460069, java.util.UUID, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // dev.epro.r0.O12043144740933444288
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, java.util.Map r11, dev.epro.r0.R4833348786910499294 r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(java.lang.String, java.util.Map, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // dev.epro.r0.O12043144740933444288
    public final Object a(y11 y11Var, E17093345031926825464 e17093345031926825464, x22 x22Var) {
        return O12043144740933444288.b(this, y11Var, e17093345031926825464, x22Var, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x011b, code lost:
    
        if (r1 != r2) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // dev.epro.r0.O12043144740933444288
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.net.URL r19, ads_mobile_sdk.bn0 r20, dev.epro.r0.R4833348786910499294 r21) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(java.net.URL, ads_mobile_sdk.bn0, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // dev.epro.r0.O12043144740933444288
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.net.URL r10, dev.epro.r0.R4833348786910499294 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.a11
            if (r0 == 0) goto L14
            r0 = r11
            ads_mobile_sdk.a11 r0 = (ads_mobile_sdk.a11) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r7 = r0
            goto L1c
        L14:
            ads_mobile_sdk.a11 r0 = new ads_mobile_sdk.a11
            dev.epro.r0.K14749510448791472029 r11 = (dev.epro.r0.K14749510448791472029) r11
            r0.<init>(r9, r11)
            goto L12
        L1c:
            java.lang.Object r11 = r7.d
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            int r1 = r7.f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            dev.epro.r0.E17665849472693074628.k(r11)
            return r11
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r4
        L35:
            java.lang.String r9 = r7.c
            dev.epro.r0.I1581330382723795749 r10 = r7.b
            ads_mobile_sdk.h11 r1 = r7.a
            dev.epro.r0.E17665849472693074628.k(r11)
            goto L79
        L3f:
            dev.epro.r0.E17665849472693074628.k(r11)
            dev.epro.r0.I1581330382723795749 r11 = new dev.epro.r0.I1581330382723795749
            r1 = 5
            r11.<init>(r1)
            r10.getClass()
            java.lang.String r10 = r10.toString()
            r10.getClass()
            dev.epro.r0.Z17877815202129479382 r1 = new dev.epro.r0.Z17877815202129479382
            r1.<init>()
            r1.c(r4, r10)
            dev.epro.r0.P10208541982779414550 r10 = r1.a()
            r11.a = r10
            dev.epro.r0.K12714355155332733186 r10 = r9.b
            r7.a = r9
            r7.b = r11
            java.lang.String r1 = "User-Agent"
            r7.c = r1
            r7.f = r3
            java.lang.Object r10 = r10.a(r7)
            if (r10 != r0) goto L73
            goto Lc0
        L73:
            r8 = r1
            r1 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r8
        L79:
            java.lang.String r11 = (java.lang.String) r11
            r10.getClass()
            r9.getClass()
            r11.getClass()
            java.lang.Object r3 = r10.c
            dev.epro.r0.V14323974914327418545 r3 = (dev.epro.r0.V14323974914327418545) r3
            r3.getClass()
            dev.epro.r0.X7410747940286448830.k(r9)
            dev.epro.r0.X7410747940286448830.l(r11, r9)
            dev.epro.r0.X7410747940286448830.c(r3, r9, r11)
            java.lang.String r9 = "HEAD"
            r10.n(r9, r4)
            r9 = r2
            dev.epro.r0.G842859980338292746 r2 = new dev.epro.r0.G842859980338292746
            r2.<init>(r10)
            dev.epro.r0.K5458285210510848811 r10 = r1.i
            if (r10 != 0) goto La7
            dev.epro.r0.K5458285210510848811 r10 = r1.h
            if (r10 == 0) goto La9
        La7:
            r3 = r10
            goto Laf
        La9:
            java.lang.String r9 = "okHttpClient"
            dev.epro.r0.S10823041268949770285.b0(r9)
            throw r4
        Laf:
            r7.a = r4
            r7.b = r4
            r7.c = r4
            r7.f = r9
            r4 = 0
            r6 = 1
            r5 = 0
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto Lc1
        Lc0:
            return r0
        Lc1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(java.net.URL, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (r0 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r0 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // dev.epro.r0.O12043144740933444288
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.y11 r9, dev.epro.r0.E17093345031926825464 r10, java.util.Map r11, boolean r12, boolean r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(ads_mobile_sdk.y11, dev.epro.r0.E17093345031926825464, java.util.Map, boolean, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.O12043144740933444288
    public final Object a(URL url, Map map, boolean z, K14749510448791472029 k14749510448791472029) {
        URL url2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            url2 = url;
        } else {
            String url3 = url.toString();
            url3.getClass();
            Uri.Builder buildUpon = Uri.parse(url3).buildUpon();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                H9390398899829886498 h9390398899829886498 = (H9390398899829886498) obj;
                buildUpon.appendQueryParameter((String) h9390398899829886498.a, (String) h9390398899829886498.b);
            }
            url2 = new URL(buildUpon.build().toString());
        }
        return a(new y11(url2, "GET", E4951175994894594588.z0(linkedHashMap), null, null, null), (E17093345031926825464) null, map, false, z, k14749510448791472029);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.y11 r6, java.util.Map r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.t01
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.t01 r0 = (ads_mobile_sdk.t01) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.t01 r0 = new ads_mobile_sdk.t01
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L36
            if (r1 != r3) goto L30
            java.lang.String r5 = r0.d
            ads_mobile_sdk.x11 r6 = r0.c
            java.util.Map r7 = r0.b
            java.util.Map r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r2 = r7
            r7 = r0
            goto L71
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L36:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.hs r8 = r5.e
            if (r8 == 0) goto L4e
            java.net.URL r1 = r6.a
            java.lang.String r1 = r1.toString()
            r1.getClass()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.util.Map r2 = r8.a(r1)
        L4e:
            r6.getClass()
            ads_mobile_sdk.x11 r8 = new ads_mobile_sdk.x11
            r8.<init>(r6)
            r0.a = r7
            r0.b = r2
            r0.c = r8
            java.lang.String r6 = "User-Agent"
            r0.d = r6
            r0.g = r3
            dev.epro.r0.K12714355155332733186 r5 = r5.b
            java.lang.Object r5 = r5.a(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L6d
            return r0
        L6d:
            r4 = r8
            r8 = r5
            r5 = r6
            r6 = r4
        L71:
            java.lang.String r8 = (java.lang.String) r8
            r6.a(r5, r8)
            if (r7 == 0) goto L9c
            java.util.Set r5 = r7.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L80:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9c
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r6.a(r8, r7)
            goto L80
        L9c:
            if (r2 == 0) goto Lc2
            java.util.Set r5 = r2.entrySet()
            java.util.Iterator r5 = r5.iterator()
        La6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lc2
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r6.a(r8, r7)
            goto La6
        Lc2:
            ads_mobile_sdk.y11 r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h11.a(ads_mobile_sdk.y11, java.util.Map, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.O12043144740933444288
    public final void a(hs hsVar) {
        hsVar.getClass();
        this.e = hsVar;
    }

    @Override // dev.epro.r0.O12043144740933444288
    public final void a(w81 w81Var) {
        w81Var.getClass();
        this.f = w81Var;
    }
}
