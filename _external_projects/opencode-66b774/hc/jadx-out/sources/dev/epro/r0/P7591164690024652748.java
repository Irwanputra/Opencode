package dev.epro.r0;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P7591164690024652748 implements N10092264544134359582 {
    public static final int[] n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f437o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final K17275736824900228431 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final P6556295605237910640 j;
    public final J9391192653199620777 k;
    public final Q17537606732352760497 l;
    public final E13260110309995934400 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f437o = unsafe;
    }

    public P7591164690024652748(int[] iArr, Object[] objArr, int i, int i2, K17275736824900228431 k17275736824900228431, boolean z, int[] iArr2, int i3, int i4, P6556295605237910640 p6556295605237910640, J9391192653199620777 j9391192653199620777, Q17537606732352760497 q17537606732352760497, Z14573996342726291806 z14573996342726291806, E13260110309995934400 e13260110309995934400) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = k17275736824900228431 instanceof K17275736824900228431;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = p6556295605237910640;
        this.k = j9391192653199620777;
        this.l = q17537606732352760497;
        this.e = k17275736824900228431;
        this.m = e13260110309995934400;
    }

    public static Field C(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbG = X2485016533998461232.g("Field ", str, " for ");
            sbG.append(cls.getName());
            sbG.append(" not found. Known fields are ");
            sbG.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbG.toString());
        }
    }

    public static int F(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof K17275736824900228431) {
            return ((K17275736824900228431) obj).e();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.P7591164690024652748 u(dev.epro.r0.T14602662695158654172 r35, dev.epro.r0.P6556295605237910640 r36, dev.epro.r0.J9391192653199620777 r37, dev.epro.r0.Q17537606732352760497 r38, dev.epro.r0.Z14573996342726291806 r39, dev.epro.r0.E13260110309995934400 r40) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.u(dev.epro.r0.T14602662695158654172, dev.epro.r0.P6556295605237910640, dev.epro.r0.J9391192653199620777, dev.epro.r0.Q17537606732352760497, dev.epro.r0.Z14573996342726291806, dev.epro.r0.E13260110309995934400):dev.epro.r0.P7591164690024652748");
    }

    public static long v(int i) {
        return i & 1048575;
    }

    public static int w(long j, Object obj) {
        return ((Integer) J3288146055636008296.j(j, obj)).intValue();
    }

    public static long x(long j, Object obj) {
        return ((Long) J3288146055636008296.j(j, obj)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r7, dev.epro.r0.E17564419012940707302 r8, java.lang.Object r9) throws dev.epro.r0.O941307146068593422, dev.epro.r0.J12068242864160501074, dev.epro.r0.Q13606351353383574666 {
        /*
            r6 = this;
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r7
            java.lang.String r1 = ""
            r2 = 2
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L44
            r6 = r7 & r3
            long r6 = (long) r6
            r8.x0(r2)
            java.lang.Object r8 = r8.e
            dev.epro.r0.X4929887216837100213 r8 = (dev.epro.r0.X4929887216837100213) r8
            byte[] r0 = r8.d
            int r2 = r8.K()
            int r3 = r8.g
            int r4 = r8.e
            int r5 = r4 - r3
            if (r2 > r5) goto L2a
            if (r2 <= 0) goto L2a
            int r1 = r3 + r2
            r8.g = r1
            goto L3a
        L2a:
            if (r2 != 0) goto L2d
            goto L40
        L2d:
            r3 = 0
            if (r2 > r4) goto L36
            r8.O(r2)
            r8.g = r2
            goto L3a
        L36:
            byte[] r0 = r8.F(r2)
        L3a:
            dev.epro.r0.E2166724654553415323 r8 = dev.epro.r0.F2424644667972238580.a
            java.lang.String r1 = r8.k(r3, r0, r2)
        L40:
            dev.epro.r0.J3288146055636008296.p(r6, r9, r1)
            return
        L44:
            boolean r6 = r6.f
            if (r6 == 0) goto L96
            r6 = r7 & r3
            long r6 = (long) r6
            r8.x0(r2)
            java.lang.Object r8 = r8.e
            dev.epro.r0.X4929887216837100213 r8 = (dev.epro.r0.X4929887216837100213) r8
            byte[] r0 = r8.d
            int r2 = r8.K()
            if (r2 <= 0) goto L6e
            int r3 = r8.e
            int r4 = r8.g
            int r3 = r3 - r4
            if (r2 > r3) goto L6e
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r3 = dev.epro.r0.X10245771154555039797.a
            r1.<init>(r0, r4, r2, r3)
            int r0 = r8.g
            int r0 = r0 + r2
            r8.g = r0
            goto L92
        L6e:
            if (r2 != 0) goto L71
            goto L92
        L71:
            int r1 = r8.e
            if (r2 > r1) goto L87
            r8.O(r2)
            java.lang.String r1 = new java.lang.String
            int r3 = r8.g
            java.nio.charset.Charset r4 = dev.epro.r0.X10245771154555039797.a
            r1.<init>(r0, r3, r2, r4)
            int r0 = r8.g
            int r0 = r0 + r2
            r8.g = r0
            goto L92
        L87:
            java.lang.String r1 = new java.lang.String
            byte[] r8 = r8.F(r2)
            java.nio.charset.Charset r0 = dev.epro.r0.X10245771154555039797.a
            r1.<init>(r8, r0)
        L92:
            dev.epro.r0.J3288146055636008296.p(r6, r9, r1)
            return
        L96:
            r6 = r7 & r3
            long r6 = (long) r6
            dev.epro.r0.B15200565448991586841 r8 = r8.x()
            dev.epro.r0.J3288146055636008296.p(r6, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.A(int, dev.epro.r0.E17564419012940707302, java.lang.Object):void");
    }

    public final void B(int i, E17564419012940707302 e17564419012940707302, Object obj) throws O941307146068593422, J12068242864160501074, Q13606351353383574666 {
        boolean z = (536870912 & i) != 0;
        J9391192653199620777 j9391192653199620777 = this.k;
        if (z) {
            e17564419012940707302.o0(j9391192653199620777.c(i & 1048575, obj), true);
        } else {
            e17564419012940707302.o0(j9391192653199620777.c(i & 1048575, obj), false);
        }
    }

    public final void D(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        J3288146055636008296.n((1 << (i2 >>> 20)) | J3288146055636008296.h(j, obj), j, obj);
    }

    public final void E(int i, int i2, Object obj) {
        J3288146055636008296.n(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int G(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.c(java.lang.Object):boolean");
    }

    @Override // dev.epro.r0.N10092264544134359582
    public final K17275736824900228431 d() {
        this.j.getClass();
        return this.e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(dev.epro.r0.K17275736824900228431 r12) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.e(dev.epro.r0.K17275736824900228431):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(dev.epro.r0.K17275736824900228431 r12, dev.epro.r0.K17275736824900228431 r13) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.f(dev.epro.r0.K17275736824900228431, dev.epro.r0.K17275736824900228431):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x069a A[Catch: all -> 0x04a1, TryCatch #2 {all -> 0x04a1, blocks: (B:153:0x0695, B:155:0x069a, B:156:0x069f, B:113:0x03f5, B:115:0x03fc, B:116:0x040c, B:117:0x041c, B:118:0x042c, B:119:0x043c, B:120:0x044c, B:121:0x045c, B:122:0x046d, B:123:0x047e, B:126:0x04a4, B:127:0x04c1, B:128:0x04de, B:129:0x04fb, B:130:0x0518, B:131:0x0538, B:132:0x0555, B:133:0x056a, B:134:0x058e, B:135:0x059b, B:136:0x05ba, B:137:0x05d7, B:138:0x05f4, B:139:0x0611, B:140:0x062e, B:141:0x064b, B:142:0x066a, B:143:0x067f, B:147:0x068a), top: B:178:0x0695 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x06bf A[LOOP:4: B:166:0x06bd->B:167:0x06bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06a5 A[SYNTHETIC] */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r20, dev.epro.r0.E17564419012940707302 r21, dev.epro.r0.X8134396307090105871 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.g(java.lang.Object, dev.epro.r0.E17564419012940707302, dev.epro.r0.X8134396307090105871):void");
    }

    public final boolean h(K17275736824900228431 k17275736824900228431, K17275736824900228431 k172757368249002284312, int i) {
        return m(i, k17275736824900228431) == m(i, k172757368249002284312);
    }

    public final void i(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (J3288146055636008296.j(G(i) & 1048575, obj) == null) {
            return;
        }
        j(i);
    }

    public final void j(int i) {
        if (this.b[E12098517352909843120.f(i, 3, 2, 1)] == null) {
            return;
        }
        Z3383101362411723454.s();
    }

    public final Object k(int i) {
        return this.b[(i / 3) * 2];
    }

    public final N10092264544134359582 l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        N10092264544134359582 n10092264544134359582 = (N10092264544134359582) objArr[i2];
        if (n10092264544134359582 != null) {
            return n10092264544134359582;
        }
        N10092264544134359582 n10092264544134359582A = X1177226880161088161.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = n10092264544134359582A;
        return n10092264544134359582A;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.m(int, java.lang.Object):boolean");
    }

    public final boolean o(int i, int i2, Object obj) {
        return J3288146055636008296.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r10.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.Object r8, int r9, java.lang.Object r10, dev.epro.r0.X8134396307090105871 r11, dev.epro.r0.E17564419012940707302 r12) throws dev.epro.r0.O941307146068593422, dev.epro.r0.J12068242864160501074, dev.epro.r0.Q13606351353383574666 {
        /*
            r7 = this;
            int r9 = r7.G(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = dev.epro.r0.J3288146055636008296.j(r0, r8)
            dev.epro.r0.E13260110309995934400 r7 = r7.m
            if (r9 != 0) goto L1e
            r7.getClass()
            dev.epro.r0.C12163932668652713734 r9 = dev.epro.r0.C12163932668652713734.b
            dev.epro.r0.C12163932668652713734 r9 = r9.b()
            dev.epro.r0.J3288146055636008296.p(r0, r8, r9)
            goto L35
        L1e:
            r7.getClass()
            r2 = r9
            dev.epro.r0.C12163932668652713734 r2 = (dev.epro.r0.C12163932668652713734) r2
            boolean r2 = r2.a
            if (r2 != 0) goto L35
            dev.epro.r0.C12163932668652713734 r2 = dev.epro.r0.C12163932668652713734.b
            dev.epro.r0.C12163932668652713734 r2 = r2.b()
            dev.epro.r0.E13260110309995934400.a(r2, r9)
            dev.epro.r0.J3288146055636008296.p(r0, r8, r2)
            r9 = r2
        L35:
            r7.getClass()
            dev.epro.r0.C12163932668652713734 r9 = (dev.epro.r0.C12163932668652713734) r9
            dev.epro.r0.A13843307759923533495 r10 = (dev.epro.r0.A13843307759923533495) r10
            dev.epro.r0.Q7316561721656982910 r7 = r10.a
            r8 = 2
            r12.x0(r8)
            java.lang.Object r10 = r12.e
            dev.epro.r0.X4929887216837100213 r10 = (dev.epro.r0.X4929887216837100213) r10
            int r0 = r10.K()
            int r0 = r10.j(r0)
            java.lang.Object r1 = r7.d
            java.lang.String r2 = ""
            r3 = r1
        L53:
            int r4 = r12.h()     // Catch: java.lang.Throwable -> L77
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9d
            boolean r5 = r10.c()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L63
            goto L9d
        L63:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L86
            if (r4 == r8) goto L79
            boolean r4 = r12.y0()     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            if (r4 == 0) goto L71
            goto L53
        L71:
            dev.epro.r0.F10620977331851870088 r4 = new dev.epro.r0.F10620977331851870088     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            throw r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
        L77:
            r7 = move-exception
            goto La4
        L79:
            java.lang.Object r4 = r7.c     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            dev.epro.r0.T18086906245708496780 r4 = (dev.epro.r0.T18086906245708496780) r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            java.lang.Object r3 = r12.I(r4, r5, r11)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            goto L53
        L86:
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            dev.epro.r0.T18086906245708496780 r4 = (dev.epro.r0.T18086906245708496780) r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            r5 = 0
            java.lang.Object r2 = r12.I(r4, r5, r5)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            goto L53
        L90:
            boolean r4 = r12.y0()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L97
            goto L53
        L97:
            dev.epro.r0.F10620977331851870088 r7 = new dev.epro.r0.F10620977331851870088     // Catch: java.lang.Throwable -> L77
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L77
            throw r7     // Catch: java.lang.Throwable -> L77
        L9d:
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> L77
            r10.i(r0)
            return
        La4:
            r10.i(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.p(java.lang.Object, int, java.lang.Object, dev.epro.r0.X8134396307090105871, dev.epro.r0.E17564419012940707302):void");
    }

    public final void q(int i, Object obj, Object obj2) {
        if (m(i, obj2)) {
            long jG = G(i) & 1048575;
            Unsafe unsafe = f437o;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                D11988991656201568495.g(this.a[i], obj2);
                return;
            }
            N10092264544134359582 n10092264544134359582L = l(i);
            if (!m(i, obj)) {
                if (n(object)) {
                    K17275736824900228431 k17275736824900228431D = n10092264544134359582L.d();
                    n10092264544134359582L.a(k17275736824900228431D, object);
                    unsafe.putObject(obj, jG, k17275736824900228431D);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                D(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!n(object2)) {
                K17275736824900228431 k17275736824900228431D2 = n10092264544134359582L.d();
                n10092264544134359582L.a(k17275736824900228431D2, object2);
                unsafe.putObject(obj, jG, k17275736824900228431D2);
                object2 = k17275736824900228431D2;
            }
            n10092264544134359582L.a(object2, object);
        }
    }

    public final void r(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (o(i2, i, obj2)) {
            long jG = G(i) & 1048575;
            Unsafe unsafe = f437o;
            Object object = unsafe.getObject(obj2, jG);
            if (object == null) {
                D11988991656201568495.g(iArr[i], obj2);
                return;
            }
            N10092264544134359582 n10092264544134359582L = l(i);
            if (!o(i2, i, obj)) {
                if (n(object)) {
                    K17275736824900228431 k17275736824900228431D = n10092264544134359582L.d();
                    n10092264544134359582L.a(k17275736824900228431D, object);
                    unsafe.putObject(obj, jG, k17275736824900228431D);
                } else {
                    unsafe.putObject(obj, jG, object);
                }
                E(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jG);
            if (!n(object2)) {
                K17275736824900228431 k17275736824900228431D2 = n10092264544134359582L.d();
                n10092264544134359582L.a(k17275736824900228431D2, object2);
                unsafe.putObject(obj, jG, k17275736824900228431D2);
                object2 = k17275736824900228431D2;
            }
            n10092264544134359582L.a(object2, object);
        }
    }

    public final Object s(int i, Object obj) {
        N10092264544134359582 n10092264544134359582L = l(i);
        long jG = G(i) & 1048575;
        if (!m(i, obj)) {
            return n10092264544134359582L.d();
        }
        Object object = f437o.getObject(obj, jG);
        if (n(object)) {
            return object;
        }
        K17275736824900228431 k17275736824900228431D = n10092264544134359582L.d();
        if (object != null) {
            n10092264544134359582L.a(k17275736824900228431D, object);
        }
        return k17275736824900228431D;
    }

    public final Object t(int i, int i2, Object obj) {
        N10092264544134359582 n10092264544134359582L = l(i2);
        if (!o(i, i2, obj)) {
            return n10092264544134359582L.d();
        }
        Object object = f437o.getObject(obj, G(i2) & 1048575);
        if (n(object)) {
            return object;
        }
        K17275736824900228431 k17275736824900228431D = n10092264544134359582L.d();
        if (object != null) {
            n10092264544134359582L.a(k17275736824900228431D, object);
        }
        return k17275736824900228431D;
    }

    public final void y(Object obj, long j, E17564419012940707302 e17564419012940707302, N10092264544134359582 n10092264544134359582, X8134396307090105871 x8134396307090105871) throws Q13606351353383574666 {
        int iA;
        List listC = this.k.c(j, obj);
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) e17564419012940707302.e;
        int i = e17564419012940707302.b;
        if ((i & 7) != 3) {
            throw F10620977331851870088.b();
        }
        do {
            K17275736824900228431 k17275736824900228431D = n10092264544134359582.d();
            e17564419012940707302.o(k17275736824900228431D, n10092264544134359582, x8134396307090105871);
            n10092264544134359582.b(k17275736824900228431D);
            listC.add(k17275736824900228431D);
            if (x4929887216837100213.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                iA = x4929887216837100213.A();
            }
        } while (iA == i);
        e17564419012940707302.d = iA;
    }

    public final void z(Object obj, int i, E17564419012940707302 e17564419012940707302, N10092264544134359582 n10092264544134359582, X8134396307090105871 x8134396307090105871) throws F10620977331851870088 {
        int iA;
        List listC = this.k.c(i & 1048575, obj);
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) e17564419012940707302.e;
        int i2 = e17564419012940707302.b;
        if ((i2 & 7) != 2) {
            throw F10620977331851870088.b();
        }
        do {
            K17275736824900228431 k17275736824900228431D = n10092264544134359582.d();
            e17564419012940707302.r(k17275736824900228431D, n10092264544134359582, x8134396307090105871);
            n10092264544134359582.b(k17275736824900228431D);
            listC.add(k17275736824900228431D);
            if (x4929887216837100213.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                iA = x4929887216837100213.A();
            }
        } while (iA == i2);
        e17564419012940707302.d = iA;
    }
}
