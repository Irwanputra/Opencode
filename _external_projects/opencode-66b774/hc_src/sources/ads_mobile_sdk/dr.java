package ads_mobile_sdk;

import android.os.SystemClock;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F3485194578516100457;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O14838623545224379975;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P12919425594506621964;
import dev.epro.r0.R18140250564721702687;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X15965119713728731855;
import dev.epro.r0.X7175349259954592591;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class dr extends R18140250564721702687 implements K4548097313143615345 {
    public final O16637889491137121389 c;
    public final W5797197595347441198 d;
    public final kz2 e;
    public final jr0 f;
    public final g0 g;
    public final H15186625828076266306 h;
    public wq i;
    public xq j;
    public X7175349259954592591 k;

    public dr(O16637889491137121389 o16637889491137121389, W5797197595347441198 w5797197595347441198, kz2 kz2Var, jr0 jr0Var, g0 g0Var) {
        o16637889491137121389.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        jr0Var.getClass();
        g0Var.getClass();
        this.c = o16637889491137121389;
        this.d = w5797197595347441198;
        this.e = kz2Var;
        this.f = jr0Var;
        this.g = g0Var;
        this.h = new H15186625828076266306();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:156|157|(7:180|(5:185|165|166|167|(6:169|111|112|(0)|116|24)(2:170|(3:172|(8:174|109|110|111|112|(0)|116|24)|53)(2:175|176)))|186|165|166|167|(0)(0))|164|165|166|167|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:35|36|(7:60|(5:65|44|45|46|(6:48|18|19|(0)|23|24)(2:49|(3:51|(8:54|16|17|18|19|(0)|23|24)|53)(2:55|56)))|66|44|45|46|(0)(0))|43|44|45|46|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x014f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x017d, code lost:
    
        r3 = r4;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0287, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02b5, code lost:
    
        r3 = r4;
        r2 = r8;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019c A[Catch: all -> 0x0178, TRY_LEAVE, TryCatch #14 {all -> 0x0178, blocks: (B:108:0x006a, B:109:0x0171, B:112:0x0198, B:114:0x019c, B:119:0x0186), top: B:107:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b7 A[Catch: all -> 0x01c3, TryCatch #5 {all -> 0x01c3, blocks: (B:123:0x01b0, B:125:0x01b7, B:127:0x01bb, B:129:0x01bf, B:130:0x01c6, B:132:0x01ca, B:134:0x01ce, B:136:0x01d2, B:137:0x01d3, B:138:0x01d8, B:139:0x01d9, B:140:0x01e0, B:141:0x01e1, B:142:0x01e8, B:143:0x01e9), top: B:122:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e9 A[Catch: all -> 0x01c3, TRY_LEAVE, TryCatch #5 {all -> 0x01c3, blocks: (B:123:0x01b0, B:125:0x01b7, B:127:0x01bb, B:129:0x01bf, B:130:0x01c6, B:132:0x01ca, B:134:0x01ce, B:136:0x01d2, B:137:0x01d3, B:138:0x01d8, B:139:0x01d9, B:140:0x01e0, B:141:0x01e1, B:142:0x01e8, B:143:0x01e9), top: B:122:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0143 A[Catch: all -> 0x014d, Exception -> 0x014f, TryCatch #1 {Exception -> 0x014f, blocks: (B:167:0x013f, B:169:0x0143, B:170:0x0151, B:172:0x0155, B:175:0x0180, B:176:0x0185), top: B:166:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0151 A[Catch: all -> 0x014d, Exception -> 0x014f, TryCatch #1 {Exception -> 0x014f, blocks: (B:167:0x013f, B:169:0x0143, B:170:0x0151, B:172:0x0155, B:175:0x0180, B:176:0x0185), top: B:166:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d4 A[Catch: all -> 0x02b0, TRY_LEAVE, TryCatch #12 {all -> 0x02b0, blocks: (B:15:0x003a, B:16:0x02a9, B:19:0x02d0, B:21:0x02d4, B:28:0x02be), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027b A[Catch: all -> 0x0285, Exception -> 0x0287, TryCatch #7 {all -> 0x0285, blocks: (B:44:0x0255, B:46:0x0277, B:48:0x027b, B:49:0x0289, B:51:0x028d, B:55:0x02b8, B:56:0x02bd, B:102:0x02e1, B:103:0x02e4, B:36:0x0219, B:38:0x022a, B:40:0x0230, B:43:0x023c, B:60:0x023f, B:62:0x0243, B:65:0x024a, B:66:0x024d), top: B:35:0x0219, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0289 A[Catch: all -> 0x0285, Exception -> 0x0287, TryCatch #7 {all -> 0x0285, blocks: (B:44:0x0255, B:46:0x0277, B:48:0x027b, B:49:0x0289, B:51:0x028d, B:55:0x02b8, B:56:0x02bd, B:102:0x02e1, B:103:0x02e4, B:36:0x0219, B:38:0x022a, B:40:0x0230, B:43:0x023c, B:60:0x023f, B:62:0x0243, B:65:0x024a, B:66:0x024d), top: B:35:0x0219, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ee A[Catch: all -> 0x02fa, TryCatch #17 {all -> 0x02fa, blocks: (B:71:0x02e7, B:73:0x02ee, B:75:0x02f2, B:77:0x02f6, B:78:0x02fd, B:80:0x0301, B:82:0x0305, B:84:0x0309, B:85:0x030a, B:86:0x030f, B:87:0x0310, B:88:0x0317, B:89:0x0318, B:90:0x031f, B:91:0x0320), top: B:70:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0320 A[Catch: all -> 0x02fa, TRY_LEAVE, TryCatch #17 {all -> 0x02fa, blocks: (B:71:0x02e7, B:73:0x02ee, B:75:0x02f2, B:77:0x02f6, B:78:0x02fd, B:80:0x0301, B:82:0x0305, B:84:0x0309, B:85:0x030a, B:86:0x030f, B:87:0x0310, B:88:0x0317, B:89:0x0318, B:90:0x031f, B:91:0x0320), top: B:70:0x02e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v22, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r3v0, types: [dev.epro.r0.Z3437138737604933638, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r9v22, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.dr r16, dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dr.a(ads_mobile_sdk.dr, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.dr r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dr.b(ads_mobile_sdk.dr, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final fr c() {
        cw0 mo19a = mo19a();
        jr0 jr0Var = this.f;
        jr0Var.getClass();
        I16631908410500040363 i16631908410500040363 = jr0.G;
        i16631908410500040363.getClass();
        ao aoVar = ao.a$22;
        I16631908410500040363 i166319084105000403632 = (I16631908410500040363) jr0Var.a("gads:caching_signal_source_ttls_ms", i16631908410500040363, aoVar);
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        long g = O14838623545224379975.g(i166319084105000403632, i16631908410500040363, mo19a, ((E17093345031926825464) jr0Var.a("gads:default_signal_ttl", new E17093345031926825464(M9216324016624295870.Z(30, N13798149404328803870.SECONDS)), ao.a)).a);
        I16631908410500040363 i166319084105000403633 = jr0.D;
        i166319084105000403633.getClass();
        boolean i = O14838623545224379975.i((I16631908410500040363) jr0Var.a("gads:caching_signal_source_automatic_refreshes", i166319084105000403633, aoVar), i166319084105000403633, mo19a);
        I16631908410500040363 i166319084105000403634 = jr0.F;
        i166319084105000403634.getClass();
        long g2 = O14838623545224379975.g((I16631908410500040363) jr0Var.a("gads:caching_signal_source_refresh_buffers_ms", i166319084105000403634, aoVar), i166319084105000403634, mo19a, M9216324016624295870.Z(0, N13798149404328803870.MILLISECONDS));
        I16631908410500040363 i166319084105000403635 = jr0.E;
        i166319084105000403635.getClass();
        boolean i2 = O14838623545224379975.i((I16631908410500040363) jr0Var.a("gads:caching_signal_source_stale_results_enabled", i166319084105000403635, aoVar), i166319084105000403635, mo19a);
        I16631908410500040363 i166319084105000403636 = jr0.H;
        i166319084105000403636.getClass();
        boolean i3 = O14838623545224379975.i((I16631908410500040363) jr0Var.a("gads:caching_signal_source_initialization_enabled", i166319084105000403636, aoVar), i166319084105000403636, mo19a);
        I16631908410500040363 i166319084105000403637 = jr0.I;
        i166319084105000403637.getClass();
        return new fr(g, i, g2, i2, i3, O14838623545224379975.i((I16631908410500040363) jr0Var.a("gads:caching_signal_source_background_refresh_enabled", i166319084105000403637, aoVar), i166319084105000403637, mo19a));
    }

    public final u53 d() {
        P12919425594506621964 o2 = u53.o();
        o2.getClass();
        boolean z = c().b;
        o2.b();
        ((u53) o2.b).automaticRefresh_ = z;
        boolean z2 = c().d;
        o2.b();
        ((u53) o2.b).staleResultAllowed_ = z2;
        return (u53) o2.a();
    }

    public final void g() {
        boolean z;
        long j;
        g0 g0Var = this.g;
        synchronized (g0Var) {
            z = g0Var.f39o;
        }
        if ((!z || c().f) && c().b && this.k == null) {
            wq wqVar = this.i;
            if (wqVar != null) {
                long j2 = wqVar.b;
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                this.c.getClass();
                j = E17093345031926825464.g(j2, M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS));
            } else {
                j = c().a;
            }
            this.k = R7033599853981556291.E(this.d, null, null, new F3485194578516100457((byte) 1, E17093345031926825464.g(j, c().c), (R4833348786910499294) null, (Object) this), 3);
        }
    }

    @Override // ads_mobile_sdk.c61
    public Object h(R4833348786910499294 r4833348786910499294) {
        return c(this, (K14749510448791472029) r4833348786910499294);
    }

    public Object k(R4833348786910499294 r4833348786910499294) {
        return b(this, (K14749510448791472029) r4833348786910499294);
    }

    @Override // dev.epro.r0.K4548097313143615345
    public final Object c(R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.dr r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.cr
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.cr r0 = (ads_mobile_sdk.cr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.cr r0 = new ads_mobile_sdk.cr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L42
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2c:
            dev.epro.r0.E17665849472693074628.k(r5)
            ads_mobile_sdk.fr r5 = r4.c()
            boolean r5 = r5.e
            if (r5 == 0) goto L42
            r0.c = r2
            java.lang.Object r4 = r4.k(r0)
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L42
            return r5
        L42:
            ads_mobile_sdk.xu0 r4 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.dr.c(ads_mobile_sdk.dr, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final xq b() {
        yq yqVar = new yq(this, null);
        W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        return new xq(R7033599853981556291.l(w5797197595347441198, I3826119971291161142.a, new X15965119713728731855(yqVar, null, (byte) 3), 2), this.c, E17093345031926825464.c);
    }

    public final uv0 a(wq wqVar, xq xqVar) {
        if (wqVar != null && !wqVar.a()) {
            return uv0.CACHED;
        }
        if (wqVar != null && wqVar.a() && c().d) {
            return uv0.STALE;
        }
        if (xqVar != null) {
            return uv0.UPDATING;
        }
        return uv0.EXPIRED;
    }
}
