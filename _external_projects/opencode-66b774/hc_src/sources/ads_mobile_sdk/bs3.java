package ads_mobile_sdk;

import android.content.Context;
import androidx.webkit.Profile;
import androidx.webkit.WebViewFeature;
import dev.epro.r0.G2741561934039219051;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.H2607093550274855851;
import dev.epro.r0.I14592051721515255272;
import dev.epro.r0.K12714355155332733186;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.O12494175665883759871;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.Q6344330807969154194;
import dev.epro.r0.R18140250564721702687;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;
import dev.epro.r0.Z3437138737604933638;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class bs3 extends R18140250564721702687 {
    public final jr0 c;
    public final G8001132634698687269 d;
    public final W5797197595347441198 e;
    public final kz2 f;
    public final aw g;
    public final V2597580950516131749 h;
    public final G2741561934039219051 i;
    public final I14592051721515255272 j;
    public final O16637889491137121389 k;
    public final rg0 l;
    public Profile m;
    public final H15186625828076266306 n;

    /* renamed from: o, reason: collision with root package name */
    public final H15186625828076266306 f12o;
    public X7175349259954592591 p;
    public long q;
    public X7175349259954592591 r;
    public final O12494175665883759871 s;

    public bs3(Context context, jr0 jr0Var, G8001132634698687269 g8001132634698687269, W5797197595347441198 w5797197595347441198, kz2 kz2Var, K12714355155332733186 k12714355155332733186, aw awVar, V2597580950516131749 v2597580950516131749, G2741561934039219051 g2741561934039219051, I14592051721515255272 i14592051721515255272, O16637889491137121389 o16637889491137121389, rg0 rg0Var) {
        context.getClass();
        jr0Var.getClass();
        g8001132634698687269.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        k12714355155332733186.getClass();
        awVar.getClass();
        g2741561934039219051.getClass();
        i14592051721515255272.getClass();
        o16637889491137121389.getClass();
        this.c = jr0Var;
        this.d = g8001132634698687269;
        this.e = w5797197595347441198;
        this.f = kz2Var;
        this.g = awVar;
        this.h = v2597580950516131749;
        this.i = g2741561934039219051;
        this.j = i14592051721515255272;
        this.k = o16637889491137121389;
        this.l = rg0Var;
        this.n = new H15186625828076266306();
        this.f12o = new H15186625828076266306();
        this.s = new O12494175665883759871(new H2607093550274855851(this, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x011c, code lost:
    
        if (r0.a(r1, r6) == r7) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ba, code lost:
    
        if (r0.a(r1, r6) == r7) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0097, code lost:
    
        if (r1.a(r6) == r7) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cc A[Catch: all -> 0x01d8, TryCatch #4 {all -> 0x01d8, blocks: (B:25:0x01c5, B:27:0x01cc, B:29:0x01d0, B:31:0x01d4, B:32:0x01db, B:34:0x01df, B:36:0x01e3, B:38:0x01e7, B:39:0x01e8, B:40:0x01ed, B:41:0x01ee, B:42:0x01f5, B:43:0x01f6, B:44:0x01fd, B:45:0x01fe), top: B:24:0x01c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fe A[Catch: all -> 0x01d8, TRY_LEAVE, TryCatch #4 {all -> 0x01d8, blocks: (B:25:0x01c5, B:27:0x01cc, B:29:0x01d0, B:31:0x01d4, B:32:0x01db, B:34:0x01df, B:36:0x01e3, B:38:0x01e7, B:39:0x01e8, B:40:0x01ed, B:41:0x01ee, B:42:0x01f5, B:43:0x01f6, B:44:0x01fd, B:45:0x01fe), top: B:24:0x01c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012f A[Catch: all -> 0x013b, TryCatch #5 {all -> 0x013b, blocks: (B:63:0x0128, B:65:0x012f, B:67:0x0133, B:69:0x0137, B:70:0x013e, B:72:0x0142, B:74:0x0146, B:76:0x014a, B:77:0x014b, B:78:0x0150, B:79:0x0151, B:80:0x0158, B:81:0x0159, B:82:0x0160, B:83:0x0161), top: B:62:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0161 A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #5 {all -> 0x013b, blocks: (B:63:0x0128, B:65:0x012f, B:67:0x0133, B:69:0x0137, B:70:0x013e, B:72:0x0142, B:74:0x0146, B:76:0x014a, B:77:0x014b, B:78:0x0150, B:79:0x0151, B:80:0x0158, B:81:0x0159, B:82:0x0160, B:83:0x0161), top: B:62:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009f  */
    /* JADX WARN: Type inference failed for: r0v21, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r2v20, types: [ads_mobile_sdk.th3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(ads_mobile_sdk.bs3 r16, dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.c(ads_mobile_sdk.bs3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.bs3 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.mr3
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.mr3 r0 = (ads_mobile_sdk.mr3) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.mr3 r0 = new ads_mobile_sdk.mr3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 1
            dev.epro.r0.O9245300239821758723 r3 = dev.epro.r0.O9245300239821758723.a
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            ads_mobile_sdk.bs3 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r0
            goto L60
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L34:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.jr0 r8 = r7.c
            r8.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$11
            java.lang.String r6 = "gads:webview_profile:enabled"
            java.lang.Object r8 = r8.a(r6, r1, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L4f
            return r3
        L4f:
            dev.epro.r0.H15186625828076266306 r8 = r7.n
            r0.a = r7
            r0.b = r8
            r0.e = r2
            java.lang.Object r0 = r8.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L60
            return r1
        L60:
            androidx.webkit.Profile r0 = r7.m     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L7d
            dev.epro.r0.X7175349259954592591 r0 = r7.p     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L69
            goto L7d
        L69:
            dev.epro.r0.W5797197595347441198 r0 = r7.e     // Catch: java.lang.Throwable -> L7b
            ads_mobile_sdk.lr3 r1 = new ads_mobile_sdk.lr3     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r7, r4, r2)     // Catch: java.lang.Throwable -> L7b
            r2 = 3
            dev.epro.r0.X7175349259954592591 r0 = dev.epro.r0.R7033599853981556291.E(r0, r4, r4, r1, r2)     // Catch: java.lang.Throwable -> L7b
            r7.p = r0     // Catch: java.lang.Throwable -> L7b
            r8.b(r4)
            return r3
        L7b:
            r7 = move-exception
            goto L81
        L7d:
            r8.b(r4)
            return r3
        L81:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.d(ads_mobile_sdk.bs3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.bs3 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.xr3
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.xr3 r0 = (ads_mobile_sdk.xr3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.xr3 r0 = new ads_mobile_sdk.xr3
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L51
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            r5 = 0
            return r5
        L2c:
            dev.epro.r0.E17665849472693074628.k(r6)
            ads_mobile_sdk.jr0 r6 = r5.c
            r6.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            ads_mobile_sdk.ao r3 = ads_mobile_sdk.ao.a$11
            java.lang.String r4 = "init_profile_in_post_init_task:enabled"
            java.lang.Object r6 = r6.a(r4, r1, r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L51
            r0.c = r2
            java.lang.Object r5 = d(r5, r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r6) goto L51
            return r6
        L51:
            ads_mobile_sdk.xu0 r5 = new ads_mobile_sdk.xu0
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.e(ads_mobile_sdk.bs3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r12v2, types: [dev.epro.r0.L856869997670741194, dev.epro.r0.R4833348786910499294] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.a(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0100 A[Catch: all -> 0x0152, TryCatch #4 {all -> 0x0152, blocks: (B:125:0x00f8, B:127:0x0100, B:130:0x0107, B:134:0x0124, B:135:0x012d, B:142:0x011e, B:139:0x0118), top: B:124:0x00f8, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0107 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #4 {all -> 0x0152, blocks: (B:125:0x00f8, B:127:0x0100, B:130:0x0107, B:134:0x0124, B:135:0x012d, B:142:0x011e, B:139:0x0118), top: B:124:0x00f8, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0124 A[Catch: all -> 0x0152, TRY_LEAVE, TryCatch #4 {all -> 0x0152, blocks: (B:125:0x00f8, B:127:0x0100, B:130:0x0107, B:134:0x0124, B:135:0x012d, B:142:0x011e, B:139:0x0118), top: B:124:0x00f8, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x012d A[Catch: all -> 0x0152, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0152, blocks: (B:125:0x00f8, B:127:0x0100, B:130:0x0107, B:134:0x0124, B:135:0x012d, B:142:0x011e, B:139:0x0118), top: B:124:0x00f8, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1 A[Catch: all -> 0x0212, TryCatch #5 {all -> 0x0212, blocks: (B:58:0x01b9, B:60:0x01c1, B:63:0x01c8, B:67:0x01e5, B:68:0x01ee, B:76:0x01df, B:73:0x01d9), top: B:57:0x01b9, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c8 A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #5 {all -> 0x0212, blocks: (B:58:0x01b9, B:60:0x01c1, B:63:0x01c8, B:67:0x01e5, B:68:0x01ee, B:76:0x01df, B:73:0x01d9), top: B:57:0x01b9, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v17, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v7, types: [ads_mobile_sdk.th3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.b(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return e(this, (K14749510448791472029) r4833348786910499294);
    }

    public final Object a(Profile profile, K14749510448791472029 k14749510448791472029) {
        AtomicBoolean atomicBoolean = lp3.a;
        this.i.getClass();
        boolean z = lp3.c.get();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R4833348786910499294 r4833348786910499294 = null;
        if (z) {
            try {
                if (Q6344330807969154194.b(WebViewFeature.PRECONNECT)) {
                    Object d0 = R7033599853981556291.d0(this.d, new hr3(profile, this, r4833348786910499294, (byte) 1), k14749510448791472029);
                    return d0 == Z3437138737604933638.a ? d0 : o9245300239821758723;
                }
            } catch (Throwable unused) {
                lp3.c.set(false);
            }
        }
        zi3.a(6, "Preconnect is not supported", null);
        return o9245300239821758723;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.bs3 r13, java.util.List r14, dev.epro.r0.K14749510448791472029 r15) {
        /*
            boolean r0 = r15 instanceof ads_mobile_sdk.tr3
            if (r0 == 0) goto L13
            r0 = r15
            ads_mobile_sdk.tr3 r0 = (ads_mobile_sdk.tr3) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.tr3 r0 = new ads_mobile_sdk.tr3
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.d
            int r1 = r0.f
            r2 = 3
            r3 = 2
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            r5 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L30
            dev.epro.r0.E17665849472693074628.k(r15)
            return r4
        L30:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r13)
            return r6
        L36:
            dev.epro.r0.E17665849472693074628.k(r15)
            return r4
        L3a:
            java.util.List r13 = r0.c
            java.util.List r14 = r0.b
            ads_mobile_sdk.bs3 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r15)
            goto L9f
        L44:
            dev.epro.r0.E17665849472693074628.k(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r14.iterator()
        L55:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L87
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            android.net.Uri r10 = android.net.Uri.parse(r10)
            java.lang.String r10 = r10.getPath()
            if (r10 != 0) goto L6e
            java.lang.String r10 = ""
        L6e:
            java.lang.String r11 = ".js"
            boolean r11 = dev.epro.r0.Z13168519540281190457.z(r10, r11, r5)
            if (r11 != 0) goto L83
            java.lang.String r11 = ".css"
            boolean r10 = dev.epro.r0.Z13168519540281190457.z(r10, r11, r5)
            if (r10 == 0) goto L7f
            goto L83
        L7f:
            r1.add(r9)
            goto L55
        L83:
            r15.add(r9)
            goto L55
        L87:
            boolean r8 = r15.isEmpty()
            if (r8 != 0) goto La9
            r0.a = r13
            r0.b = r14
            r0.c = r1
            r0.f = r5
            java.lang.Object r15 = r13.b(r15, r0)
            if (r15 != r7) goto L9c
            goto Lcf
        L9c:
            r12 = r1
            r1 = r13
            r13 = r12
        L9f:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            r12 = r1
            r1 = r13
            r13 = r12
            goto Laa
        La9:
            r15 = 0
        Laa:
            if (r15 != 0) goto Lbb
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.f = r3
            java.lang.Object r13 = r13.a(r14, r0)
            if (r13 != r7) goto Ld0
            goto Lcf
        Lbb:
            boolean r14 = r1.isEmpty()
            if (r14 != 0) goto Ld0
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.f = r2
            java.lang.Object r13 = r13.a(r1, r0)
            if (r13 != r7) goto Ld0
        Lcf:
            return r7
        Ld0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.a(ads_mobile_sdk.bs3, java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0089, code lost:
    
        if (r1.a(r3) == r4) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e4 A[Catch: all -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x00ff, blocks: (B:94:0x00c1, B:98:0x00dd, B:101:0x00e4, B:108:0x00d7, B:106:0x00d2), top: B:93:0x00c1, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0163 A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #2 {all -> 0x0184, blocks: (B:113:0x0147, B:117:0x0163, B:120:0x016a, B:126:0x015d, B:124:0x0158), top: B:112:0x0147, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a A[Catch: all -> 0x0184, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0184, blocks: (B:113:0x0147, B:117:0x0163, B:120:0x016a, B:126:0x015d, B:124:0x0158), top: B:112:0x0147, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018e A[Catch: all -> 0x019a, TryCatch #5 {all -> 0x019a, blocks: (B:20:0x0187, B:22:0x018e, B:24:0x0192, B:26:0x0196, B:27:0x019d, B:29:0x01a1, B:31:0x01a5, B:33:0x01a9, B:34:0x01aa, B:35:0x01af, B:36:0x01b0, B:37:0x01b7, B:38:0x01b8, B:39:0x01bf, B:40:0x01c0), top: B:19:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c0 A[Catch: all -> 0x019a, TRY_LEAVE, TryCatch #5 {all -> 0x019a, blocks: (B:20:0x0187, B:22:0x018e, B:24:0x0192, B:26:0x0196, B:27:0x019d, B:29:0x01a1, B:31:0x01a5, B:33:0x01a9, B:34:0x01aa, B:35:0x01af, B:36:0x01b0, B:37:0x01b7, B:38:0x01b8, B:39:0x01bf, B:40:0x01c0), top: B:19:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109 A[Catch: all -> 0x0115, TryCatch #3 {all -> 0x0115, blocks: (B:58:0x0102, B:60:0x0109, B:62:0x010d, B:64:0x0111, B:65:0x0118, B:67:0x011c, B:69:0x0120, B:71:0x0124, B:72:0x0125, B:73:0x012a, B:74:0x012b, B:75:0x0132, B:76:0x0133, B:77:0x013a, B:78:0x013b), top: B:57:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013b A[Catch: all -> 0x0115, TRY_LEAVE, TryCatch #3 {all -> 0x0115, blocks: (B:58:0x0102, B:60:0x0109, B:62:0x010d, B:64:0x0111, B:65:0x0118, B:67:0x011c, B:69:0x0120, B:71:0x0124, B:72:0x0125, B:73:0x012a, B:74:0x012b, B:75:0x0132, B:76:0x0133, B:77:0x013a, B:78:0x013b), top: B:57:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00dd A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #9 {all -> 0x00ff, blocks: (B:94:0x00c1, B:98:0x00dd, B:101:0x00e4, B:108:0x00d7, B:106:0x00d2), top: B:93:0x00c1, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.bs3 r16, dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.a(ads_mobile_sdk.bs3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0164 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:20:0x015d, B:22:0x0164, B:24:0x0168, B:26:0x016c, B:27:0x0173, B:29:0x0177, B:31:0x017b, B:33:0x017f, B:34:0x0180, B:35:0x0185, B:36:0x0186, B:37:0x018d, B:38:0x018e, B:39:0x0195, B:40:0x0196), top: B:19:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0196 A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #0 {all -> 0x0170, blocks: (B:20:0x015d, B:22:0x0164, B:24:0x0168, B:26:0x016c, B:27:0x0173, B:29:0x0177, B:31:0x017b, B:33:0x017f, B:34:0x0180, B:35:0x0185, B:36:0x0186, B:37:0x018d, B:38:0x018e, B:39:0x0195, B:40:0x0196), top: B:19:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1 A[Catch: all -> 0x00cd, TryCatch #6 {all -> 0x00cd, blocks: (B:58:0x00ba, B:60:0x00c1, B:62:0x00c5, B:64:0x00c9, B:65:0x00d0, B:67:0x00d4, B:69:0x00d8, B:71:0x00dc, B:72:0x00dd, B:73:0x00e2, B:74:0x00e3, B:75:0x00ea, B:76:0x00eb, B:77:0x00f2, B:78:0x00f3), top: B:57:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3 A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #6 {all -> 0x00cd, blocks: (B:58:0x00ba, B:60:0x00c1, B:62:0x00c5, B:64:0x00c9, B:65:0x00d0, B:67:0x00d4, B:69:0x00d8, B:71:0x00dc, B:72:0x00dd, B:73:0x00e2, B:74:0x00e3, B:75:0x00ea, B:76:0x00eb, B:77:0x00f2, B:78:0x00f3), top: B:57:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.bs3 r16, dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.bs3.b(ads_mobile_sdk.bs3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
