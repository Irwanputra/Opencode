package ads_mobile_sdk;

import dev.epro.r0.B8669154544800329371;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.M665231115116566295;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P17571903987102865660;
import dev.epro.r0.Q1304841290039450495;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R5692663580087387669;
import dev.epro.r0.U4020053660465689583;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z1085125311131623997;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class fl2 extends c61 implements B8669154544800329371 {
    public final LinkedHashMap A;
    public final LinkedHashMap B;
    public final LinkedHashMap C;
    public final LinkedHashMap D;
    public boolean E;
    public final LinkedHashMap F;
    public boolean G;
    public final W5797197595347441198 c;
    public final kz2 e;
    public final jr0 g;

    /* renamed from: o, reason: collision with root package name */
    public final q43 f36o;
    public final H15186625828076266306 p;
    public U4020053660465689583 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public long v;
    public boolean w;
    public long x;
    public final LinkedHashMap y;
    public final LinkedHashMap z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl2(W5797197595347441198 w5797197595347441198, ci3 ci3Var, kz2 kz2Var, O16637889491137121389 o16637889491137121389, jr0 jr0Var, Q1304841290039450495 q1304841290039450495, bb0 bb0Var, bb0 bb0Var2, bb0 bb0Var3, bb0 bb0Var4, bb0 bb0Var5, ab0 ab0Var, q43 q43Var) {
        super((wv0) null, 3);
        w5797197595347441198.getClass();
        ci3Var.getClass();
        kz2Var.getClass();
        o16637889491137121389.getClass();
        jr0Var.getClass();
        q1304841290039450495.getClass();
        bb0Var.getClass();
        bb0Var2.getClass();
        bb0Var3.getClass();
        bb0Var4.getClass();
        bb0Var5.getClass();
        q43Var.getClass();
        this.c = w5797197595347441198;
        this.e = kz2Var;
        this.g = jr0Var;
        this.f36o = q43Var;
        this.p = new H15186625828076266306();
        R5692663580087387669 k = J8045362843799184672.k();
        k.f0();
        this.q = k;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.v = 0L;
        this.w = true;
        this.x = 0L;
        this.y = new LinkedHashMap();
        this.z = new LinkedHashMap();
        this.A = new LinkedHashMap();
        this.B = new LinkedHashMap();
        this.C = new LinkedHashMap();
        this.D = new LinkedHashMap();
        this.F = new LinkedHashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01a1, code lost:
    
        if (dev.epro.r0.J8045362843799184672.J(r8, r2) == r4) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0107, code lost:
    
        if (r3.c(r2) != r4) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013f, code lost:
    
        if (r0 == r4) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0151, code lost:
    
        if (r0 == r4) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016b, code lost:
    
        if (r0 == r4) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a6 A[Catch: all -> 0x02b2, TryCatch #2 {all -> 0x02b2, blocks: (B:112:0x029f, B:114:0x02a6, B:116:0x02aa, B:118:0x02ae, B:119:0x02b5, B:121:0x02b9, B:123:0x02bd, B:125:0x02c1, B:126:0x02c2, B:127:0x02c7, B:128:0x02c8, B:129:0x02cf, B:130:0x02d0, B:131:0x02d7, B:132:0x02d8), top: B:111:0x029f }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d8 A[Catch: all -> 0x02b2, TRY_LEAVE, TryCatch #2 {all -> 0x02b2, blocks: (B:112:0x029f, B:114:0x02a6, B:116:0x02aa, B:118:0x02ae, B:119:0x02b5, B:121:0x02b9, B:123:0x02bd, B:125:0x02c1, B:126:0x02c2, B:127:0x02c7, B:128:0x02c8, B:129:0x02cf, B:130:0x02d0, B:131:0x02d7, B:132:0x02d8), top: B:111:0x029f }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00d2 A[PHI: r3
      0x00d2: PHI (r3v2 ads_mobile_sdk.fl2) = (r3v1 ads_mobile_sdk.fl2), (r3v51 ads_mobile_sdk.fl2) binds: [B:7:0x0028, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023a A[Catch: all -> 0x0246, TryCatch #5 {all -> 0x0246, blocks: (B:68:0x0233, B:70:0x023a, B:72:0x023e, B:74:0x0242, B:75:0x0249, B:77:0x024d, B:79:0x0251, B:81:0x0255, B:82:0x0256, B:83:0x025b, B:84:0x025c, B:85:0x0263, B:86:0x0264, B:87:0x026b, B:88:0x026c), top: B:67:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026c A[Catch: all -> 0x0246, TRY_LEAVE, TryCatch #5 {all -> 0x0246, blocks: (B:68:0x0233, B:70:0x023a, B:72:0x023e, B:74:0x0242, B:75:0x0249, B:77:0x024d, B:79:0x0251, B:81:0x0255, B:82:0x0256, B:83:0x025b, B:84:0x025c, B:85:0x0263, B:86:0x0264, B:87:0x026b, B:88:0x026c), top: B:67:0x0233 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r3v20, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0175 -> B:15:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:155:0x01a1 -> B:15:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.fl2 r17, dev.epro.r0.K14749510448791472029 r18) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.a(ads_mobile_sdk.fl2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.fl2 r10, long r11, dev.epro.r0.K14749510448791472029 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.hj2
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.hj2 r0 = (ads_mobile_sdk.hj2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.hj2 r0 = new ads_mobile_sdk.hj2
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            r5 = 0
            if (r1 == 0) goto L47
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            long r10 = r0.d
            java.lang.Object r12 = r0.a
            java.util.Iterator r12 = (java.util.Iterator) r12
            dev.epro.r0.E17665849472693074628.k(r13)
            goto L92
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r10)
            return r5
        L37:
            long r11 = r0.d
            dev.epro.r0.H15186625828076266306 r10 = r0.c
            java.util.ArrayList r1 = r0.b
            java.lang.Object r3 = r0.a
            ads_mobile_sdk.fl2 r3 = (ads_mobile_sdk.fl2) r3
            dev.epro.r0.E17665849472693074628.k(r13)
            r13 = r10
            r10 = r3
            goto L69
        L47:
            dev.epro.r0.E17665849472693074628.k(r13)
            boolean r13 = r10.r
            if (r13 != 0) goto L4f
            goto Lae
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            dev.epro.r0.H15186625828076266306 r13 = r10.p
            r0.a = r10
            r0.b = r1
            r0.c = r13
            r0.d = r11
            r0.g = r3
            java.lang.Object r3 = r13.c(r0)
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r3 != r6) goto L69
            return r6
        L69:
            long r6 = r10.x     // Catch: java.lang.Throwable -> Laf
            int r3 = dev.epro.r0.E17093345031926825464.c(r11, r6)     // Catch: java.lang.Throwable -> Laf
            if (r3 <= 0) goto Lb1
            boolean r3 = r10.w     // Catch: java.lang.Throwable -> Laf
            if (r3 != 0) goto L76
            goto Lb1
        L76:
            r3 = 0
            r10.w = r3     // Catch: java.lang.Throwable -> Laf
            r10.x = r11     // Catch: java.lang.Throwable -> Laf
            java.util.ArrayList r10 = r10.a(r5)     // Catch: java.lang.Throwable -> Laf
            r1.addAll(r10)     // Catch: java.lang.Throwable -> Laf
            r13.b(r5)
            boolean r10 = r1.isEmpty()
            if (r10 != 0) goto Lae
            java.util.Iterator r10 = r1.iterator()
            r8 = r11
            r12 = r10
            r10 = r8
        L92:
            boolean r13 = r12.hasNext()
            if (r13 != 0) goto L99
            goto Lae
        L99:
            java.lang.Object r13 = r12.next()
            if (r13 == 0) goto La3
            dev.epro.r0.Z3383101362411723454.s()
            return r5
        La3:
            r0.a = r12
            r0.b = r5
            r0.c = r5
            r0.d = r10
            r0.g = r2
            throw r5
        Lae:
            return r4
        Laf:
            r10 = move-exception
            goto Lb5
        Lb1:
            r13.b(r5)
            return r4
        Lb5:
            r13.b(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.d(ads_mobile_sdk.fl2, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.b(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (r13 == r8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b$1(java.util.List r12, dev.epro.r0.K14749510448791472029 r13) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.b$1(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: c, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4c(java.util.List r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.wj2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.wj2 r0 = (ads_mobile_sdk.wj2) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.wj2 r0 = new ads_mobile_sdk.wj2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.f
            int r9 = r0.h
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L8f
            if (r9 == r1) goto L78
            r8 = 2
            r3 = 0
            if (r9 == r8) goto L58
            r8 = 3
            if (r9 != r8) goto L52
            java.lang.Object r8 = r0.c
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            java.util.Iterator r9 = r0.b
            java.util.Collection r0 = r0.a
            java.util.Iterator r0 = (java.util.Iterator) r0
            dev.epro.r0.E17665849472693074628.k(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            double r5 = (double) r7
            double r5 = r5 / r3
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r5)
            int r7 = r8.compareTo(r7)
            if (r7 <= 0) goto L4b
            r9 = r2
        L4b:
            boolean r7 = r0.hasNext()
            if (r7 != 0) goto L6d
            return r9
        L52:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L58:
            java.util.Collection r8 = r0.a
            r0 = r8
            java.util.Iterator r0 = (java.util.Iterator) r0
            dev.epro.r0.E17665849472693074628.k(r7)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            double r7 = (double) r7
            double r7 = r7 / r3
            java.lang.Double r9 = new java.lang.Double
            r9.<init>(r7)
        L6d:
            java.lang.Object r7 = r0.next()
            r7.getClass()
            dev.epro.r0.Z3383101362411723454.s()
            return r2
        L78:
            java.lang.Object r8 = r0.c
            java.util.Iterator r9 = r0.b
            java.util.Collection r3 = r0.a
            java.util.Collection r3 = (java.util.Collection) r3
            dev.epro.r0.E17665849472693074628.k(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9b
            r3.add(r8)
            goto L9b
        L8f:
            dev.epro.r0.E17665849472693074628.k(r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r9 = r8.iterator()
        L9b:
            boolean r7 = r9.hasNext()
            if (r7 != 0) goto Lbe
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r7 = r3.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto Lae
            return r2
        Lae:
            java.lang.Object r8 = r7.next()
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto Lb9
            return r8
        Lb9:
            java.lang.ClassCastException r7 = dev.epro.r0.G6547577305291411977.m(r8)
            throw r7
        Lbe:
            java.lang.Object r7 = r9.next()
            if (r7 == 0) goto Lc8
            dev.epro.r0.Z3383101362411723454.s()
            return r2
        Lc8:
            java.util.Collection r3 = (java.util.Collection) r3
            r0.a = r3
            r0.b = r9
            r0.c = r7
            r0.h = r1
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.m4c(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        return b(this, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(dev.epro.r0.R4833348786910499294 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.xi2
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.xi2 r0 = (ads_mobile_sdk.xi2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.xi2 r0 = new ads_mobile_sdk.xi2
            dev.epro.r0.K14749510448791472029 r5 = (dev.epro.r0.K14749510448791472029) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ads_mobile_sdk.fl2 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L45
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L30:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            r0.d = r2
            ads_mobile_sdk.q43 r5 = r4.f36o
            r5.getClass()
            java.lang.Object r5 = ads_mobile_sdk.q43.b(r5, r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L45
            return r0
        L45:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            ads_mobile_sdk.jr0 r0 = r4.g
            r0.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            ads_mobile_sdk.ao r2 = ads_mobile_sdk.ao.a$11
            java.lang.String r3 = "gads:use_server_provided_total_ad_limit:enabled"
            java.lang.Object r0 = r0.a(r3, r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L65
            if (r5 <= 0) goto L65
            goto L7b
        L65:
            ads_mobile_sdk.jr0 r4 = r4.g
            r5 = 15
            java.lang.String r0 = "gads:preloaded_ads:upper_bound"
            java.lang.Integer r5 = dev.epro.r0.O17574792317020433029.c(r4, r0, r5)
            ads_mobile_sdk.ao r1 = ads_mobile_sdk.ao.a$18
            java.lang.Object r4 = r4.a(r0, r5, r1)
            java.lang.Number r4 = (java.lang.Number) r4
            int r5 = r4.intValue()
        L7b:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.k(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(4:(2:3|(7:5|6|7|(1:(1:(1:(1:(1:(7:14|15|16|17|18|19|20)(2:55|56))(9:57|58|59|60|61|62|(5:64|17|18|19|20)|65|66))(7:79|80|81|82|83|19|20))(9:116|117|118|119|120|121|(5:123|82|83|19|20)|65|66))(1:131))(1:156)|132|133|(2:135|136)(4:137|(4:139|140|141|(4:143|120|121|(0)))(5:147|148|149|150|(4:152|61|62|(0)))|65|66)))|132|133|(0)(0))|161|6|7|(0)(0)|(3:(0)|(1:112)|(1:51))) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00bb, code lost:
    
        if (r5 == r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0145, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0190, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0191, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0189 A[Catch: all -> 0x0163, TRY_LEAVE, TryCatch #0 {all -> 0x0163, blocks: (B:87:0x0150, B:89:0x0157, B:91:0x015b, B:93:0x015f, B:94:0x0166, B:96:0x016a, B:98:0x016e, B:100:0x0172, B:101:0x0173, B:102:0x0178, B:103:0x0179, B:104:0x0180, B:105:0x0181, B:106:0x0188, B:107:0x0189), top: B:86:0x0150, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c7 A[Catch: all -> 0x0194, TRY_ENTER, TryCatch #12 {all -> 0x0194, blocks: (B:133:0x00bf, B:137:0x00c7, B:139:0x00f4, B:148:0x0198), top: B:132:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f7 A[Catch: all -> 0x0203, TryCatch #1 {all -> 0x0203, blocks: (B:26:0x01f0, B:28:0x01f7, B:30:0x01fb, B:32:0x01ff, B:33:0x0206, B:35:0x020a, B:37:0x020e, B:39:0x0212, B:40:0x0213, B:41:0x0218, B:42:0x0219, B:43:0x0220, B:44:0x0221, B:45:0x0228, B:46:0x0229), top: B:25:0x01f0, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0229 A[Catch: all -> 0x0203, TRY_LEAVE, TryCatch #1 {all -> 0x0203, blocks: (B:26:0x01f0, B:28:0x01f7, B:30:0x01fb, B:32:0x01ff, B:33:0x0206, B:35:0x020a, B:37:0x020e, B:39:0x0212, B:40:0x0213, B:41:0x0218, B:42:0x0219, B:43:0x0220, B:44:0x0221, B:45:0x0228, B:46:0x0229), top: B:25:0x01f0, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157 A[Catch: all -> 0x0163, TryCatch #0 {all -> 0x0163, blocks: (B:87:0x0150, B:89:0x0157, B:91:0x015b, B:93:0x015f, B:94:0x0166, B:96:0x016a, B:98:0x016e, B:100:0x0172, B:101:0x0173, B:102:0x0178, B:103:0x0179, B:104:0x0180, B:105:0x0181, B:106:0x0188, B:107:0x0189), top: B:86:0x0150, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v21, types: [ads_mobile_sdk.fl2] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v5, types: [ads_mobile_sdk.fl2] */
    /* JADX WARN: Type inference failed for: r0v9, types: [ads_mobile_sdk.fl2] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [dev.epro.r0.H15186625828076266306, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v5, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ads_mobile_sdk.jj2, dev.epro.r0.K14749510448791472029, dev.epro.r0.R4833348786910499294] */
    /* JADX WARN: Type inference failed for: r3v21, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r3v23, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [dev.epro.r0.R8015591507171738907] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v24, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(dev.epro.r0.K14749510448791472029 r17) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.r(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:11:0x004d, B:13:0x0055), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(dev.epro.r0.K14749510448791472029 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.dl2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.dl2 r0 = (ads_mobile_sdk.dl2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.dl2 r0 = new ads_mobile_sdk.dl2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            ads_mobile_sdk.fl2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r0
            goto L4d
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L34:
            dev.epro.r0.E17665849472693074628.k(r8)
            boolean r8 = r7.G
            if (r8 != 0) goto L3c
            return r2
        L3c:
            r0.a = r7
            dev.epro.r0.H15186625828076266306 r8 = r7.p
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = r8.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L4d
            return r1
        L4d:
            dev.epro.r0.U4020053660465689583 r0 = r7.q     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L72
            dev.epro.r0.W5797197595347441198 r0 = r7.c     // Catch: java.lang.Throwable -> L70
            dev.epro.r0.N4024785987441166868 r1 = new dev.epro.r0.N4024785987441166868     // Catch: java.lang.Throwable -> L70
            r5 = 9
            r1.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L70
            dev.epro.r0.I3826119971291161142 r5 = dev.epro.r0.I3826119971291161142.a     // Catch: java.lang.Throwable -> L70
            r0.getClass()     // Catch: java.lang.Throwable -> L70
            dev.epro.r0.P7598478828797568949 r6 = new dev.epro.r0.P7598478828797568949     // Catch: java.lang.Throwable -> L70
            r6.<init>(r1, r4, r3)     // Catch: java.lang.Throwable -> L70
            r1 = 2
            dev.epro.r0.X7175349259954592591 r0 = dev.epro.r0.R7033599853981556291.E(r0, r5, r4, r6, r1)     // Catch: java.lang.Throwable -> L70
            r7.q = r0     // Catch: java.lang.Throwable -> L70
            goto L72
        L70:
            r7 = move-exception
            goto L76
        L72:
            r8.b(r4)
            return r2
        L76:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.s(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object d(long j, R14062301455140331524 r14062301455140331524) {
        return a(this, j, r14062301455140331524);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x006f, code lost:
    
        if (r13.c(r0) == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.fl2 r10, long r11, dev.epro.r0.K14749510448791472029 r13) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.c(ads_mobile_sdk.fl2, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean c(java.util.List r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.zi2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.zi2 r0 = (ads_mobile_sdk.zi2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.zi2 r0 = new ads_mobile_sdk.zi2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.c
            int r6 = r0.e
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L53
            r5 = 2
            if (r6 == r3) goto L3b
            if (r6 != r5) goto L35
            java.util.Iterator r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L49
            r4 = r3
            goto L4a
        L35:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L3b:
            java.util.Iterator r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 == 0) goto L4e
            r5 = r6
        L49:
            r4 = r1
        L4a:
            if (r4 == 0) goto L7b
            r1 = r3
            goto L81
        L4e:
            r0.a = r6
            r0.e = r5
            throw r2
        L53:
            dev.epro.r0.E17665849472693074628.k(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L5f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L70
            java.lang.Object r6 = r5.next()
            if (r6 != 0) goto L6c
            goto L5f
        L6c:
            dev.epro.r0.Z3383101362411723454.s()
            return r2
        L70:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L77
            goto L81
        L77:
            java.util.Iterator r5 = r4.iterator()
        L7b:
            boolean r4 = r5.hasNext()
            if (r4 != 0) goto L86
        L81:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L86:
            java.lang.Object r4 = r5.next()
            if (r4 == 0) goto L90
            dev.epro.r0.Z3383101362411723454.s()
            return r2
        L90:
            r0.a = r5
            r0.e = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.c(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Boolean");
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object b(long j, R14062301455140331524 r14062301455140331524) {
        return b(this, j, r14062301455140331524);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0070, code lost:
    
        if (r13.c(r0) == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.fl2 r10, long r11, dev.epro.r0.K14749510448791472029 r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.b(ads_mobile_sdk.fl2, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final ArrayList b() {
        LinkedHashMap linkedHashMap;
        M665231115116566295 m665231115116566295 = qw2.n;
        ArrayList arrayList = new ArrayList();
        m665231115116566295.getClass();
        int i = 0;
        Z1085125311131623997 z1085125311131623997 = new Z1085125311131623997(m665231115116566295, (byte) 0);
        while (z1085125311131623997.hasNext()) {
            switch (((qw2) z1085125311131623997.next()).ordinal()) {
                case 1:
                    linkedHashMap = this.y;
                    break;
                case 2:
                    linkedHashMap = this.z;
                    break;
                case 3:
                default:
                    linkedHashMap = null;
                    break;
                case 4:
                    linkedHashMap = this.A;
                    break;
                case 5:
                    linkedHashMap = this.B;
                    break;
                case 6:
                    linkedHashMap = this.C;
                    break;
                case 7:
                    linkedHashMap = this.D;
                    break;
                case 8:
                    linkedHashMap = this.F;
                    break;
            }
            Collection values = linkedHashMap != null ? linkedHashMap.values() : null;
            if (values != null) {
                arrayList.add(values);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            P17571903987102865660.n0(arrayList2, (Iterable) obj);
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008e A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:11:0x008a, B:13:0x008e, B:14:0x0093, B:16:0x0097, B:17:0x0099), top: B:10:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:11:0x008a, B:13:0x008e, B:14:0x0093, B:16:0x0097, B:17:0x0099), top: B:10:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.fl2 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.vj2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.vj2 r0 = (ads_mobile_sdk.vj2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.vj2 r0 = new ads_mobile_sdk.vj2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            ads_mobile_sdk.fl2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r6
            r6 = r0
            goto L8a
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r7)
            ads_mobile_sdk.jr0 r7 = r6.g
            r7.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r4 = ads_mobile_sdk.ao.a$11
            java.lang.String r5 = "gads:preload:bind_to_online:enabled"
            java.lang.Object r5 = r7.a(r5, r1, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6.r = r5
            r7.getClass()
            java.lang.String r5 = "gads:preload:bind_on_foreground"
            java.lang.Object r5 = r7.a(r5, r1, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6.s = r5
            java.lang.String r5 = "gads:preload_app_open_in_background"
            java.lang.Object r5 = r7.a(r5, r1, r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r6.t = r5
            java.lang.String r5 = "gads:centralized_preload_manager:enabled"
            java.lang.Object r7 = r7.a(r5, r1, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r6.G = r7
            dev.epro.r0.H15186625828076266306 r7 = r6.p
            r0.a = r6
            r0.b = r7
            r0.e = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L8a
            return r1
        L8a:
            boolean r0 = r6.r     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L93
            r6.w = r2     // Catch: java.lang.Throwable -> L91
            goto L93
        L91:
            r6 = move-exception
            goto La4
        L93:
            boolean r0 = r6.s     // Catch: java.lang.Throwable -> L91
            if (r0 != 0) goto L99
            r6.u = r2     // Catch: java.lang.Throwable -> L91
        L99:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L91
            r7.b(r3)
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            r7.<init>(r6)
            return r7
        La4:
            r7.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.b(ads_mobile_sdk.fl2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean a(java.util.List r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.si2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.si2 r0 = (ads_mobile_sdk.si2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.si2 r0 = new ads_mobile_sdk.si2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.b
            int r6 = r0.d
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L36
            if (r6 != r2) goto L30
            java.util.Iterator r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L5e
            goto L65
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r1
        L36:
            dev.epro.r0.E17665849472693074628.k(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L42:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()
            if (r6 != 0) goto L4f
            goto L42
        L4f:
            dev.epro.r0.Z3383101362411723454.s()
            return r1
        L53:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L5a
            goto L64
        L5a:
            java.util.Iterator r5 = r4.iterator()
        L5e:
            boolean r4 = r5.hasNext()
            if (r4 != 0) goto L6a
        L64:
            r2 = 0
        L65:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L6a:
            java.lang.Object r4 = r5.next()
            if (r4 == 0) goto L74
            dev.epro.r0.Z3383101362411723454.s()
            return r1
        L74:
            r0.a = r5
            r0.d = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.a(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r5, int r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.a(java.util.List, int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* renamed from: a, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3a(java.util.List r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.yi2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.yi2 r0 = (ads_mobile_sdk.yi2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.yi2 r0 = new ads_mobile_sdk.yi2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.c
            int r6 = r0.e
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L37
            if (r6 != r2) goto L31
            int r5 = r0.b
            java.util.Iterator r6 = r0.a
            dev.epro.r0.E17665849472693074628.k(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r5
            goto L3f
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r1
        L37:
            dev.epro.r0.E17665849472693074628.k(r4)
            java.util.Iterator r6 = r5.iterator()
            r4 = 0
        L3f:
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L4b
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        L4b:
            java.lang.Object r5 = r6.next()
            if (r5 == 0) goto L55
            dev.epro.r0.Z3383101362411723454.s()
            return r1
        L55:
            r0.a = r6
            r0.b = r4
            r0.e = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.m3a(java.util.List, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0070, code lost:
    
        if (r13.c(r0) == r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.fl2 r10, long r11, dev.epro.r0.K14749510448791472029 r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.a(ads_mobile_sdk.fl2, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x00c7, code lost:
    
        if (r9 == r4) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0195 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #7 {all -> 0x016f, blocks: (B:84:0x015c, B:86:0x0163, B:88:0x0167, B:90:0x016b, B:91:0x0172, B:93:0x0176, B:95:0x017a, B:97:0x017e, B:98:0x017f, B:99:0x0184, B:100:0x0185, B:101:0x018c, B:102:0x018d, B:103:0x0194, B:104:0x0195), top: B:83:0x015c, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0219 A[Catch: all -> 0x0225, TryCatch #1 {all -> 0x0225, blocks: (B:33:0x0212, B:35:0x0219, B:37:0x021d, B:39:0x0221, B:40:0x0228, B:42:0x022c, B:44:0x0230, B:46:0x0234, B:47:0x0235, B:48:0x023a, B:49:0x023b, B:50:0x0242, B:51:0x0243, B:52:0x024a, B:53:0x024b), top: B:32:0x0212, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024b A[Catch: all -> 0x0225, TRY_LEAVE, TryCatch #1 {all -> 0x0225, blocks: (B:33:0x0212, B:35:0x0219, B:37:0x021d, B:39:0x0221, B:40:0x0228, B:42:0x022c, B:44:0x0230, B:46:0x0234, B:47:0x0235, B:48:0x023a, B:49:0x023b, B:50:0x0242, B:51:0x0243, B:52:0x024a, B:53:0x024b), top: B:32:0x0212, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163 A[Catch: all -> 0x016f, TryCatch #7 {all -> 0x016f, blocks: (B:84:0x015c, B:86:0x0163, B:88:0x0167, B:90:0x016b, B:91:0x0172, B:93:0x0176, B:95:0x017a, B:97:0x017e, B:98:0x017f, B:99:0x0184, B:100:0x0185, B:101:0x018c, B:102:0x018d, B:103:0x0194, B:104:0x0195), top: B:83:0x015c, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v5, types: [dev.epro.r0.R8015591507171738907, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [ads_mobile_sdk.th3, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [ads_mobile_sdk.em2, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.wv0 r18, dev.epro.r0.K14749510448791472029 r19) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.fl2.a(ads_mobile_sdk.wv0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final ArrayList a(F4096073349764486348 f4096073349764486348) {
        LinkedHashMap linkedHashMap;
        Collection values;
        ArrayList arrayList = new ArrayList();
        M665231115116566295 m665231115116566295 = qw2.n;
        Z1085125311131623997 j = E12098517352909843120.j(m665231115116566295, m665231115116566295);
        while (j.hasNext()) {
            qw2 qw2Var = (qw2) j.next();
            if (f4096073349764486348 == null || !((Boolean) f4096073349764486348.invoke(qw2Var)).booleanValue()) {
                switch (qw2Var.ordinal()) {
                    case 1:
                        linkedHashMap = this.y;
                        break;
                    case 2:
                        linkedHashMap = this.z;
                        break;
                    case 3:
                    default:
                        linkedHashMap = null;
                        break;
                    case 4:
                        linkedHashMap = this.A;
                        break;
                    case 5:
                        linkedHashMap = this.B;
                        break;
                    case 6:
                        linkedHashMap = this.C;
                        break;
                    case 7:
                        linkedHashMap = this.D;
                        break;
                    case 8:
                        linkedHashMap = this.F;
                        break;
                }
                if (linkedHashMap != null && (values = linkedHashMap.values()) != null) {
                    arrayList.addAll(values);
                }
            }
        }
        return arrayList;
    }
}
