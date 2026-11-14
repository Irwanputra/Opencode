package dev.epro.r0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M3727281027331139839 {
    public int A;
    public int B;
    public boolean C;
    public final I16737082536984153748 D;
    public final ArrayList E;
    public boolean F;
    public S2509933476155449112 G;
    public E1092155023341394263 H;
    public K15438463641018513946 I;
    public boolean J;
    public P3648740535677465818 K;
    public M18113111391818111737 L;
    public final O13358947611952778634 M;
    public M7798980774515057476 N;
    public W8201509300847612631 O;
    public Y16033830328113725410 P;
    public final W12685451225593881345 Q;
    public final G8001132634698687269 R;
    public boolean S;
    public long T;
    public E936446761334852831 U;
    public final Z5153954235810715664 a;
    public final Y5209789131793062978 b;
    public final E1092155023341394263 c;
    public final V8500408966188516816 d;
    public final M18113111391818111737 e;
    public final M18113111391818111737 f;
    public final H12843822278061842084 g;
    public final S12944751221596631194 h;
    public T15652639163465303893 j;
    public int k;
    public int l;
    public int m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f369o;
    public A3997919466996862373 p;
    public boolean q;
    public boolean r;
    public Q9908018528090167751 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final B3798966058357121240 n = new B3798966058357121240((byte) 1);
    public final ArrayList s = new ArrayList();
    public final B3798966058357121240 t = new B3798966058357121240((byte) 1);
    public P3648740535677465818 u = P3648740535677465818.d;
    public final B3798966058357121240 x = new B3798966058357121240((byte) 1);
    public int z = -1;

    public M3727281027331139839(Z5153954235810715664 z5153954235810715664, Y5209789131793062978 y5209789131793062978, E1092155023341394263 e1092155023341394263, V8500408966188516816 v8500408966188516816, M18113111391818111737 m18113111391818111737, M18113111391818111737 m181131113918181117372, H12843822278061842084 h12843822278061842084, S12944751221596631194 s12944751221596631194) {
        this.a = z5153954235810715664;
        this.b = y5209789131793062978;
        this.c = e1092155023341394263;
        this.d = v8500408966188516816;
        this.e = m18113111391818111737;
        this.f = m181131113918181117372;
        this.g = h12843822278061842084;
        this.h = s12944751221596631194;
        this.C = y5209789131793062978.g() || y5209789131793062978.e();
        this.D = new I16737082536984153748(this, (byte) 0);
        this.E = new ArrayList();
        S2509933476155449112 j = e1092155023341394263.j();
        j.c();
        this.G = j;
        E1092155023341394263 e10921550233413942632 = new E1092155023341394263();
        if (y5209789131793062978.g()) {
            e10921550233413942632.b();
        }
        if (y5209789131793062978.e()) {
            e10921550233413942632.k = new Q9908018528090167751();
        }
        this.H = e10921550233413942632;
        K15438463641018513946 k = e10921550233413942632.k();
        k.e(true);
        this.I = k;
        this.M = new O13358947611952778634(this, m18113111391818111737);
        S2509933476155449112 j2 = this.H.j();
        try {
            M7798980774515057476 a = j2.a(0);
            j2.c();
            this.N = a;
            this.O = new W8201509300847612631();
            this.Q = new W12685451225593881345(this);
            G8001132634698687269 k2 = y5209789131793062978.k();
            G8001132634698687269 A = A();
            this.R = k2.plus(A == null ? I3826119971291161142.a : A);
        } catch (Throwable th) {
            j2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.Y6676784304453696344 O(int r13, dev.epro.r0.M3727281027331139839 r14) {
        /*
            dev.epro.r0.S2509933476155449112 r0 = r14.G
            int r0 = r0.i(r13)
            dev.epro.r0.S2509933476155449112 r1 = r14.G
            int[] r2 = r1.b
            java.lang.Object r1 = r1.p(r2, r13)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L94
            boolean r0 = r1 instanceof dev.epro.r0.C4085811703908263224
            if (r0 == 0) goto L94
            dev.epro.r0.S2509933476155449112 r0 = r14.G
            boolean r0 = r0.d(r13)
            if (r0 == 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            P(r14, r0, r13)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            r12 = r0
            goto L31
        L30:
            r12 = r3
        L31:
            dev.epro.r0.S2509933476155449112 r0 = r14.G
            int[] r1 = r0.b
            java.lang.Object r0 = r0.p(r1, r13)
            r0.getClass()
            r5 = r0
            dev.epro.r0.C4085811703908263224 r5 = (dev.epro.r0.C4085811703908263224) r5
            dev.epro.r0.S2509933476155449112 r0 = r14.G
            r1 = 0
            java.lang.Object r6 = r0.h(r13, r1)
            dev.epro.r0.S2509933476155449112 r0 = r14.G
            dev.epro.r0.M7798980774515057476 r9 = r0.a(r13)
            dev.epro.r0.S2509933476155449112 r0 = r14.G
            int[] r0 = r0.b
            int r1 = r13 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = r14.s
            int r2 = dev.epro.r0.E18444280280170001567.D(r13, r1)
            if (r2 >= 0) goto L67
            int r2 = r2 + 1
            int r2 = -r2
        L67:
            int r3 = r1.size()
            if (r2 >= r3) goto L86
            java.lang.Object r3 = r1.get(r2)
            dev.epro.r0.O740537273435134204 r3 = (dev.epro.r0.O740537273435134204) r3
            int r4 = r3.b
            if (r4 >= r0) goto L86
            dev.epro.r0.V4878375136513573151 r4 = r3.a
            java.lang.Object r3 = r3.c
            dev.epro.r0.H9390398899829886498 r7 = new dev.epro.r0.H9390398899829886498
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L67
        L86:
            dev.epro.r0.Y6676784304453696344 r4 = new dev.epro.r0.Y6676784304453696344
            dev.epro.r0.S12944751221596631194 r7 = r14.h
            dev.epro.r0.E1092155023341394263 r8 = r14.c
            dev.epro.r0.P3648740535677465818 r11 = r14.m(r13)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.O(int, dev.epro.r0.M3727281027331139839):dev.epro.r0.Y6676784304453696344");
    }

    public static final void P(M3727281027331139839 m3727281027331139839, ArrayList arrayList, int i) {
        int i2 = m3727281027331139839.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (m3727281027331139839.G.j(i3)) {
                Y6676784304453696344 O = O(i3, m3727281027331139839);
                if (O != null) {
                    arrayList.add(O);
                }
            } else if (m3727281027331139839.G.d(i3)) {
                P(m3727281027331139839, arrayList, i3);
            }
            i3 += m3727281027331139839.G.b[(i3 * 5) + 3];
        }
    }

    public static final int Q(M3727281027331139839 m3727281027331139839, int i, int i2, boolean z, int i3) {
        int i4;
        long[] jArr;
        Object[] objArr;
        int i5;
        long[] jArr2;
        Object[] objArr2;
        int i6;
        int i7;
        S2509933476155449112 s2509933476155449112 = m3727281027331139839.G;
        int i8 = 0;
        if (s2509933476155449112.j(i2)) {
            int i9 = s2509933476155449112.i(i2);
            Object p = s2509933476155449112.p(s2509933476155449112.b, i2);
            if (i9 == 126665345 && (p instanceof C4085811703908263224)) {
                Y6676784304453696344 O = O(i2, m3727281027331139839);
                if (O != null) {
                    m3727281027331139839.b.c(O);
                    m3727281027331139839.M.e();
                    O13358947611952778634 o13358947611952778634 = m3727281027331139839.M;
                    S12944751221596631194 s12944751221596631194 = m3727281027331139839.h;
                    Y5209789131793062978 y5209789131793062978 = m3727281027331139839.b;
                    Z17561488864728364842 z17561488864728364842 = o13358947611952778634.b.a;
                    z17561488864728364842.e0(W8984620363857960606.c);
                    Z860808776098365610.O(z17561488864728364842, s12944751221596631194, y5209789131793062978, O);
                }
                if (!z || i2 == i) {
                    return s2509933476155449112.o(i2);
                }
                O13358947611952778634 o133589476119527786342 = m3727281027331139839.M;
                o133589476119527786342.c();
                o133589476119527786342.b();
                M3727281027331139839 m37272810273311398392 = o133589476119527786342.a;
                int o2 = m37272810273311398392.G.l(i2) ? 1 : m37272810273311398392.G.o(i2);
                if (o2 > 0) {
                    o133589476119527786342.f(i3, o2);
                }
                return 0;
            }
            if (i9 == 206 && S10823041268949770285.t(p, N2332913310205178802.e)) {
                Object h = s2509933476155449112.h(i2, 0);
                F819643558874997944 f819643558874997944 = h instanceof F819643558874997944 ? (F819643558874997944) h : null;
                Object obj = f819643558874997944 != null ? f819643558874997944.a : null;
                Z4695029197663506711 z4695029197663506711 = obj instanceof Z4695029197663506711 ? (Z4695029197663506711) obj : null;
                if (z4695029197663506711 != null) {
                    E13273723708836014930 e13273723708836014930 = z4695029197663506711.a.e;
                    Object[] objArr3 = e13273723708836014930.b;
                    long[] jArr3 = e13273723708836014930.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j = jArr3[i10];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = i8;
                                while (i13 < i12) {
                                    if ((255 & j) < 128) {
                                        M3727281027331139839 m37272810273311398393 = (M3727281027331139839) objArr3[(i10 << 3) + i13];
                                        E1092155023341394263 e1092155023341394263 = m37272810273311398393.c;
                                        if (e1092155023341394263.b <= 0 || (e1092155023341394263.a[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            objArr2 = objArr3;
                                            i6 = i8;
                                            i7 = i11;
                                        } else {
                                            S12944751221596631194 s129447512215966311942 = m37272810273311398393.h;
                                            synchronized (s129447512215966311942.d) {
                                                s129447512215966311942.s();
                                                i7 = i11;
                                                A4559761392562572984 a4559761392562572984 = s129447512215966311942.n;
                                                s129447512215966311942.n = E7125458317232359087.f();
                                                try {
                                                    s129447512215966311942.v.g0(a4559761392562572984);
                                                } finally {
                                                }
                                            }
                                            M18113111391818111737 m18113111391818111737 = new M18113111391818111737();
                                            m37272810273311398393.L = m18113111391818111737;
                                            S2509933476155449112 j2 = m37272810273311398393.c.j();
                                            try {
                                                m37272810273311398393.G = j2;
                                                O13358947611952778634 o133589476119527786343 = m37272810273311398393.M;
                                                M18113111391818111737 m181131113918181117372 = o133589476119527786343.b;
                                                try {
                                                    o133589476119527786343.b = m18113111391818111737;
                                                    m37272810273311398393.N(0);
                                                    O13358947611952778634 o133589476119527786344 = m37272810273311398393.M;
                                                    o133589476119527786344.b();
                                                    jArr2 = jArr3;
                                                    if (o133589476119527786344.c) {
                                                        objArr2 = objArr3;
                                                        o133589476119527786344.b.a.e0(F12990874476926779080.c);
                                                        if (o133589476119527786344.c) {
                                                            o133589476119527786344.d(false);
                                                            o133589476119527786344.d(false);
                                                            o133589476119527786344.b.a.e0(B14172617168564953885.c);
                                                            i6 = 0;
                                                            o133589476119527786344.c = false;
                                                        }
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i6 = 0;
                                                } finally {
                                                }
                                            } finally {
                                                j2.c();
                                            }
                                        }
                                        m3727281027331139839.b.u(m37272810273311398393.h);
                                    } else {
                                        jArr2 = jArr3;
                                        objArr2 = objArr3;
                                        i6 = i8;
                                        i7 = i11;
                                    }
                                    j >>= i7;
                                    i13++;
                                    i11 = i7;
                                    objArr3 = objArr2;
                                    i8 = i6;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                objArr = objArr3;
                                i5 = i8;
                                if (i12 != i11) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                objArr = objArr3;
                                i5 = i8;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            objArr3 = objArr;
                            i8 = i5;
                            jArr3 = jArr;
                        }
                    }
                }
                return s2509933476155449112.o(i2);
            }
            i4 = 1;
            if (!s2509933476155449112.l(i2)) {
                return s2509933476155449112.o(i2);
            }
        } else {
            i4 = 1;
            if (s2509933476155449112.d(i2)) {
                int i14 = s2509933476155449112.b[(i2 * 5) + 3] + i2;
                int i15 = 0;
                for (int i16 = i2 + 1; i16 < i14; i16 += s2509933476155449112.b[(i16 * 5) + 3]) {
                    boolean l = s2509933476155449112.l(i16);
                    if (l) {
                        m3727281027331139839.M.c();
                        O13358947611952778634 o133589476119527786345 = m3727281027331139839.M;
                        Object n = s2509933476155449112.n(i16);
                        o133589476119527786345.c();
                        o133589476119527786345.h.add(n);
                    }
                    i15 += Q(m3727281027331139839, i, i16, l || z, l ? 0 : i3 + i15);
                    if (l) {
                        m3727281027331139839.M.c();
                        m3727281027331139839.M.a();
                    }
                }
                if (!s2509933476155449112.l(i2)) {
                    return i15;
                }
            } else if (!s2509933476155449112.l(i2)) {
                return s2509933476155449112.o(i2);
            }
        }
        return i4;
    }

    public final W12685451225593881345 A() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean B() {
        V4878375136513573151 y;
        return (this.S || this.y || this.w || (y = y()) == null || (y.b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(12:(9:(7:39|(1:41)|42|(1:44)(1:132)|45|(1:47)(1:131)|(33:49|50|51|52|53|(4:55|(1:57)(1:124)|58|(1:60)(1:123))(1:125)|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|81|82|83|84|(1:86)|87|88|89))(1:133)|81|82|83|84|(0)|87|88|89)|69|70|71|72|73|74|75|76|77|78|79)|64|65|66|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0243, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0244, code lost:
    
        r10 = r3;
        r12 = r5;
        r23 = r7;
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d A[Catch: all -> 0x00ac, TryCatch #5 {all -> 0x00ac, blocks: (B:3:0x000a, B:5:0x001b, B:7:0x0053, B:10:0x0066, B:18:0x00a2, B:19:0x020a, B:23:0x00b2, B:24:0x00b5, B:29:0x0058, B:31:0x005e, B:32:0x0063, B:33:0x00b6, B:35:0x00bc, B:37:0x00c6, B:39:0x00d0, B:41:0x00d4, B:42:0x00d9, B:45:0x00e3, B:47:0x00f0, B:50:0x0110, B:53:0x0124, B:55:0x012d, B:57:0x0138, B:58:0x0149, B:61:0x0161, B:89:0x0207, B:91:0x025b, B:92:0x025e, B:123:0x014e, B:128:0x0260, B:129:0x0263, B:130:0x010e, B:131:0x00fe, B:132:0x00de, B:137:0x0264, B:52:0x011d), top: B:2:0x000a, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5 A[Catch: all -> 0x021d, TRY_LEAVE, TryCatch #11 {all -> 0x021d, blocks: (B:84:0x01e8, B:86:0x01f5, B:98:0x0249, B:99:0x024b), top: B:83:0x01e8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.C(java.util.ArrayList):void");
    }

    public final void D(C4085811703908263224 c4085811703908263224, P3648740535677465818 p3648740535677465818, Object obj, boolean z) {
        Y(126665345, c4085811703908263224);
        E();
        l0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                K15438463641018513946.y(this.I);
            }
            boolean z2 = (this.S || S10823041268949770285.t(this.G.f(), p3648740535677465818)) ? false : true;
            if (z2) {
                K(p3648740535677465818);
            }
            V(202, 0, N2332913310205178802.c, p3648740535677465818);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                B5998207562248239613.x(this, new T15443218846549482730(-59194059, true, new T14793413619962821194(c4085811703908263224, obj, (byte) 26)));
                this.w = z3;
            } else {
                this.J = true;
                K15438463641018513946 k15438463641018513946 = this.I;
                this.b.m(new Y6676784304453696344(c4085811703908263224, obj, this.h, this.H, k15438463641018513946.b(k15438463641018513946.F(k15438463641018513946.b, k15438463641018513946.v)), O2161699089510411363.a, l(), null));
            }
        } catch (Throwable th) {
            try {
                O8620973563946607355.Z(th, new C3336714079929080859(this, (byte) 1));
                throw th;
            } finally {
                q(false);
                this.K = null;
                this.T = j;
                q(false);
            }
        }
    }

    public final Object E() {
        boolean z = this.S;
        E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof R9664561160840670135)) {
                return m;
            }
        } else if (this.r) {
            N2332913310205178802.a("A call to createNode(), emitNode() or useNode() expected");
            return e17149812035295265804;
        }
        return e17149812035295265804;
    }

    public final List F() {
        Y5209789131793062978 y5209789131793062978 = this.b;
        R13600139557160461432 i = y5209789131793062978.i();
        S12944751221596631194 s12944751221596631194 = i != null ? (S12944751221596631194) i : null;
        if (s12944751221596631194 != null) {
            E1092155023341394263 e1092155023341394263 = s12944751221596631194.f;
            S2509933476155449112 j = S13318420980680640021.a(e1092155023341394263).j();
            try {
                Integer A = C9869900372345142877.A(j, y5209789131793062978, 0, j.c);
                if (A != null) {
                    j = S13318420980680640021.a(e1092155023341394263).j();
                    try {
                        ArrayList a0 = C9869900372345142877.a0(j, A.intValue(), 0);
                        j.c();
                        return R9411874267597469228.O0(a0, s12944751221596631194.v.F());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return O2161699089510411363.a;
    }

    public final int G(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(dev.epro.r0.S12944751221596631194 r9, dev.epro.r0.S12944751221596631194 r10, java.lang.Integer r11, java.util.List r12, dev.epro.r0.B13729205492206812220 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            dev.epro.r0.H9390398899829886498 r6 = (dev.epro.r0.H9390398899829886498) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L24
            dev.epro.r0.V4878375136513573151 r7 = (dev.epro.r0.V4878375136513573151) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.f0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L5e
        L26:
            r8.f0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L55
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L4f
            if (r10 == r9) goto L4f
            if (r11 < 0) goto L4f
            r9.r = r10     // Catch: java.lang.Throwable -> L24
            r9.s = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L49
            r9.r = r5     // Catch: java.lang.Throwable -> L24
            r9.s = r2     // Catch: java.lang.Throwable -> L24
            goto L53
        L49:
            r10 = move-exception
            r9.r = r5     // Catch: java.lang.Throwable -> L24
            r9.s = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L4f:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L53:
            if (r10 != 0) goto L59
        L55:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L59:
            r8.F = r0
            r8.k = r1
            return r10
        L5e:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.H(dev.epro.r0.S12944751221596631194, dev.epro.r0.S12944751221596631194, java.lang.Integer, java.util.List, dev.epro.r0.B13729205492206812220):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.I():void");
    }

    public final void J() {
        N(this.G.g);
        O13358947611952778634 o13358947611952778634 = this.M;
        o13358947611952778634.d(false);
        o13358947611952778634.e();
        o13358947611952778634.b.a.e0(C8835733195707991667.c);
        int i = o13358947611952778634.f;
        S2509933476155449112 s2509933476155449112 = o13358947611952778634.a.G;
        o13358947611952778634.f = s2509933476155449112.b[(s2509933476155449112.g * 5) + 3] + i;
    }

    public final void K(P3648740535677465818 p3648740535677465818) {
        Q9908018528090167751 q9908018528090167751 = this.v;
        if (q9908018528090167751 == null) {
            q9908018528090167751 = new Q9908018528090167751();
            this.v = q9908018528090167751;
        }
        q9908018528090167751.i(this.G.g, p3648740535677465818);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r7, int r8, int r9) {
        /*
            r6 = this;
            dev.epro.r0.S2509933476155449112 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            dev.epro.r0.O13358947611952778634 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.L(int, int, int):void");
    }

    public final Object M() {
        boolean z = this.S;
        E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
        if (!z) {
            Object m = this.G.m();
            if (!this.y || (m instanceof R9664561160840670135)) {
                return m instanceof F819643558874997944 ? ((F819643558874997944) m).a : m;
            }
        } else if (this.r) {
            N2332913310205178802.a("A call to createNode(), emitNode() or useNode() expected");
            return e17149812035295265804;
        }
        return e17149812035295265804;
    }

    public final void N(int i) {
        boolean l = this.G.l(i);
        O13358947611952778634 o13358947611952778634 = this.M;
        if (l) {
            o13358947611952778634.c();
            Object n = this.G.n(i);
            o13358947611952778634.c();
            o13358947611952778634.h.add(n);
        }
        Q(this, i, i, l, 0);
        o13358947611952778634.c();
        if (l) {
            o13358947611952778634.a();
        }
    }

    public final boolean R(int i, boolean z) {
        V4878375136513573151 y;
        if ((i & 1) == 0 && (this.S || this.y)) {
            Y16033830328113725410 y16033830328113725410 = this.P;
            if (y16033830328113725410 != null && (y = y()) != null && y16033830328113725410.c()) {
                int i2 = y.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                y.b = i3;
                y.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                Z17561488864728364842 z17561488864728364842 = this.M.b.a;
                z17561488864728364842.e0(G1523364859134369758.c);
                Z860808776098365610.M(z17561488864728364842, 0, y);
                this.b.t(y);
                return false;
            }
        } else if (!z && B()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.S():void");
    }

    public final void T() {
        S2509933476155449112 s2509933476155449112 = this.G;
        int i = s2509933476155449112.i;
        this.l = i >= 0 ? s2509933476155449112.b[(i * 5) + 1] & 67108863 : 0;
        s2509933476155449112.t();
    }

    public final void U() {
        if (this.l != 0) {
            N2332913310205178802.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        V4878375136513573151 y = y();
        if (y != null) {
            int i = y.b;
            if ((i & 128) == 0) {
                y.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            T();
        } else {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(int r26, int r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.V(int, int, java.lang.Object, java.lang.Object):void");
    }

    public final void W() {
        V(-127, 0, null, null);
    }

    public final void X(int i, Q15354356404958779064 q15354356404958779064) {
        V(i, 0, q15354356404958779064, null);
    }

    public final void Y(int i, Object obj) {
        V(i, 0, obj, null);
    }

    public final void Z(Object obj, boolean z) {
        if (z) {
            S2509933476155449112 s2509933476155449112 = this.G;
            if (s2509933476155449112.k <= 0) {
                if ((s2509933476155449112.b[(s2509933476155449112.g * 5) + 1] & 1073741824) == 0) {
                    L4738636499147270068.a("Expected a node group");
                }
                s2509933476155449112.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            O13358947611952778634 o13358947611952778634 = this.M;
            o13358947611952778634.getClass();
            o13358947611952778634.d(false);
            Z17561488864728364842 z17561488864728364842 = o13358947611952778634.b.a;
            z17561488864728364842.e0(X15328098436194021515.c);
            Z860808776098365610.M(z17561488864728364842, 0, obj);
        }
        this.G.u();
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        W8201509300847612631 w8201509300847612631 = this.O;
        w8201509300847612631.P.b0();
        w8201509300847612631.O.b0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        S2509933476155449112 s2509933476155449112 = this.G;
        if (!s2509933476155449112.f) {
            s2509933476155449112.c();
        }
        if (this.I.w) {
            return;
        }
        w();
    }

    public final void a0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            V(i, 0, null, null);
            return;
        }
        if (this.r) {
            N2332913310205178802.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        S2509933476155449112 s2509933476155449112 = this.G;
        boolean z = this.S;
        E17149812035295265804 e17149812035295265804 = O9023047933786425027.a;
        if (z) {
            s2509933476155449112.k++;
            this.I.R(i, e17149812035295265804, false, e17149812035295265804);
            v(false, null);
            return;
        }
        if (s2509933476155449112.g() == i && ((i3 = s2509933476155449112.g) >= s2509933476155449112.h || (s2509933476155449112.b[(i3 * 5) + 1] & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0)) {
            s2509933476155449112.u();
            v(false, null);
            return;
        }
        if (s2509933476155449112.k <= 0 && (i2 = s2509933476155449112.g) != s2509933476155449112.h) {
            int i4 = this.k;
            J();
            this.M.f(i4, s2509933476155449112.s());
            E18444280280170001567.N(i2, s2509933476155449112.g, this.s);
        }
        s2509933476155449112.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            K15438463641018513946 k = this.H.k();
            this.I = k;
            k.N();
            this.J = false;
            this.K = null;
        }
        K15438463641018513946 k15438463641018513946 = this.I;
        k15438463641018513946.d();
        int i5 = k15438463641018513946.t;
        k15438463641018513946.R(i, e17149812035295265804, false, e17149812035295265804);
        this.N = k15438463641018513946.b(i5);
        v(false, null);
    }

    public final void b(L12639328004344855510 l12639328004344855510, Object obj) {
        if (this.S) {
            Z17561488864728364842 z17561488864728364842 = this.O.O;
            z17561488864728364842.e0(S1458313450507615740.c);
            Z860808776098365610.M(z17561488864728364842, 0, obj);
            V12319504402545346730.s(2, l12639328004344855510);
            Z860808776098365610.M(z17561488864728364842, 1, l12639328004344855510);
            return;
        }
        O13358947611952778634 o13358947611952778634 = this.M;
        o13358947611952778634.b();
        Z17561488864728364842 z175614888647283648422 = o13358947611952778634.b.a;
        z175614888647283648422.e0(S1458313450507615740.c);
        V12319504402545346730.s(2, l12639328004344855510);
        Z860808776098365610.N(z175614888647283648422, 0, obj, 1, l12639328004344855510);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.M3727281027331139839 b0(int r7) {
        /*
            r6 = this;
            r6.a0(r7)
            boolean r7 = r6.S
            dev.epro.r0.H12843822278061842084 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            dev.epro.r0.S12944751221596631194 r2 = r6.h
            if (r7 == 0) goto L26
            dev.epro.r0.V4878375136513573151 r7 = new dev.epro.r0.V4878375136513573151
            r7.<init>(r2)
            r1.add(r7)
            r6.l0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.z()
            return r6
        L26:
            dev.epro.r0.S2509933476155449112 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = dev.epro.r0.E18444280280170001567.D(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            dev.epro.r0.O740537273435134204 r7 = (dev.epro.r0.O740537273435134204) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            dev.epro.r0.S2509933476155449112 r3 = r6.G
            java.lang.Object r3 = r3.m()
            dev.epro.r0.E17149812035295265804 r4 = dev.epro.r0.O9023047933786425027.a
            boolean r4 = dev.epro.r0.S10823041268949770285.t(r3, r4)
            if (r4 == 0) goto L51
            dev.epro.r0.V4878375136513573151 r3 = new dev.epro.r0.V4878375136513573151
            r3.<init>(r2)
            r6.l0(r3)
            goto L56
        L51:
            r3.getClass()
            dev.epro.r0.V4878375136513573151 r3 = (dev.epro.r0.V4878375136513573151) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.z()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.175E-43)
            r3.b = r7
            dev.epro.r0.O13358947611952778634 r7 = r6.M
            dev.epro.r0.M18113111391818111737 r7 = r7.b
            dev.epro.r0.Z17561488864728364842 r7 = r7.a
            dev.epro.r0.S11120600819794109438 r0 = dev.epro.r0.S11120600819794109438.c
            r7.e0(r0)
            dev.epro.r0.Z860808776098365610.M(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            dev.epro.r0.S2509933476155449112 r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.b0(int):dev.epro.r0.M3727281027331139839");
    }

    public final boolean c(float f) {
        Object E = E();
        if ((E instanceof Float) && f == ((Number) E).floatValue()) {
            return false;
        }
        l0(Float.valueOf(f));
        return true;
    }

    public final void c0(Object obj) {
        if (!this.S && this.G.g() == 207 && !S10823041268949770285.t(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        V(207, 0, null, obj);
    }

    public final boolean d(int i) {
        Object E = E();
        if ((E instanceof Integer) && i == ((Number) E).intValue()) {
            return false;
        }
        l0(Integer.valueOf(i));
        return true;
    }

    public final void d0() {
        V(125, 2, null, null);
        this.r = true;
    }

    public final boolean e(long j) {
        Object E = E();
        if ((E instanceof Long) && j == ((Number) E).longValue()) {
            return false;
        }
        l0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        this.m = 0;
        this.G = this.c.j();
        V(100, 0, null, null);
        Y5209789131793062978 y5209789131793062978 = this.b;
        y5209789131793062978.w();
        P3648740535677465818 j = y5209789131793062978.j();
        this.x.e(this.w ? 1 : 0);
        this.w = f(j);
        this.K = null;
        if (!this.q) {
            this.q = y5209789131793062978.f();
        }
        boolean z = this.C;
        if (!z) {
            z = y5209789131793062978.g();
            this.C = z;
        }
        if (z) {
            X354568553596380848 x354568553596380848 = U13706796831929704163.a;
            x354568553596380848.getClass();
            j = j.b(x354568553596380848, new Z4204317696696431622(A()));
        }
        this.u = j;
        Set set = (Set) O4077903568229246.K(j, G14528836375187741604.a);
        if (set != null) {
            set.add(x());
            y5209789131793062978.r(set);
        }
        V(Long.hashCode(y5209789131793062978.h()), 0, null, null);
    }

    public final boolean f(Object obj) {
        if (S10823041268949770285.t(E(), obj)) {
            return false;
        }
        l0(obj);
        return true;
    }

    public final boolean f0(V4878375136513573151 v4878375136513573151, Object obj) {
        M7798980774515057476 m7798980774515057476 = v4878375136513573151.c;
        if (m7798980774515057476 == null) {
            return false;
        }
        int a = this.G.a.a(G16660188620551127941.t(m7798980774515057476));
        if (!this.F || a < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int D = E18444280280170001567.D(a, arrayList);
        if (D < 0) {
            int i = -(D + 1);
            if (!(obj instanceof B4739506393801054036)) {
                obj = null;
            }
            arrayList.add(i, new O740537273435134204(v4878375136513573151, a, obj));
            return true;
        }
        O740537273435134204 o740537273435134204 = (O740537273435134204) arrayList.get(D);
        if (!(obj instanceof B4739506393801054036)) {
            o740537273435134204.c = null;
            return true;
        }
        Object obj2 = o740537273435134204.c;
        if (obj2 == null) {
            o740537273435134204.c = obj;
            return true;
        }
        if (obj2 instanceof E13273723708836014930) {
            ((E13273723708836014930) obj2).a(obj);
            return true;
        }
        E13273723708836014930 e13273723708836014930 = L12621230156277355451.a;
        E13273723708836014930 e132737237088360149302 = new E13273723708836014930(2);
        e132737237088360149302.k(obj2);
        e132737237088360149302.k(obj);
        o740537273435134204.c = e132737237088360149302;
        return true;
    }

    public final boolean g(boolean z) {
        Object E = E();
        if ((E instanceof Boolean) && z == ((Boolean) E).booleanValue()) {
            return false;
        }
        l0(Boolean.valueOf(z));
        return true;
    }

    public final void g0(A4559761392562572984 a4559761392562572984) {
        ArrayList arrayList = this.s;
        for (int N = K5751602218013079365.N(arrayList); -1 < N; N--) {
            O740537273435134204 o740537273435134204 = (O740537273435134204) arrayList.get(N);
            M7798980774515057476 m7798980774515057476 = o740537273435134204.a.c;
            M7798980774515057476 t = m7798980774515057476 != null ? G16660188620551127941.t(m7798980774515057476) : null;
            if (t == null || !t.a()) {
                arrayList.remove(N);
            } else {
                int i = o740537273435134204.b;
                int i2 = t.a;
                if (i != i2) {
                    o740537273435134204.b = i2;
                }
            }
        }
        Object[] objArr = a4559761392562572984.b;
        Object[] objArr2 = a4559761392562572984.c;
        long[] jArr = a4559761392562572984.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            V4878375136513573151 v4878375136513573151 = (V4878375136513573151) obj;
                            M7798980774515057476 m77989807745150574762 = v4878375136513573151.c;
                            if (m77989807745150574762 != null) {
                                int i7 = G16660188620551127941.t(m77989807745150574762).a;
                                if (obj2 == N5158094851646208854.m) {
                                    obj2 = null;
                                }
                                arrayList.add(new O740537273435134204(v4878375136513573151, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        R4678422174699242737.m0(arrayList, E18444280280170001567.G);
    }

    public final boolean h(Object obj) {
        if (E() == obj) {
            return false;
        }
        l0(obj);
        return true;
    }

    public final void h0(int i, int i2) {
        if (m0(i) != i2) {
            if (i < 0) {
                A3997919466996862373 a3997919466996862373 = this.p;
                if (a3997919466996862373 == null) {
                    a3997919466996862373 = new A3997919466996862373();
                    this.p = a3997919466996862373;
                }
                a3997919466996862373.f(i, i2);
                return;
            }
            int[] iArr = this.f369o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.f369o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        O13358947611952778634 o13358947611952778634 = this.M;
        o13358947611952778634.c = false;
        o13358947611952778634.d.b = 0;
        o13358947611952778634.f = 0;
        o13358947611952778634.e = true;
        o13358947611952778634.g = 0;
        o13358947611952778634.h.clear();
        o13358947611952778634.i = -1;
        o13358947611952778634.j = -1;
        o13358947611952778634.k = -1;
        o13358947611952778634.l = 0;
        this.E.clear();
        this.f369o = null;
        this.p = null;
    }

    public final void i0(int i, int i2) {
        int m0 = m0(i);
        if (m0 != i2) {
            int i3 = i2 - m0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int m02 = m0(i) + i3;
                h0(i, m02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        T15652639163465303893 t15652639163465303893 = (T15652639163465303893) arrayList.get(i4);
                        if (t15652639163465303893 != null && t15652639163465303893.a(i, m02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                S2509933476155449112 s2509933476155449112 = this.G;
                if (i < 0) {
                    i = s2509933476155449112.i;
                } else if (s2509933476155449112.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final Object j(T5853297761459116769 t5853297761459116769) {
        return O4077903568229246.K(l(), t5853297761459116769);
    }

    public final P3648740535677465818 j0(P3648740535677465818 p3648740535677465818, P3648740535677465818 p36487405356774658182) {
        p3648740535677465818.getClass();
        D13190160240050003111 d13190160240050003111 = new D13190160240050003111(p3648740535677465818);
        d13190160240050003111.putAll(p36487405356774658182);
        P3648740535677465818 e = d13190160240050003111.e();
        X(204, N2332913310205178802.d);
        E();
        l0(e);
        E();
        l0(p36487405356774658182);
        q(false);
        return e;
    }

    public final void k(B13729205492206812220 b13729205492206812220) {
        if (!this.r) {
            N2332913310205178802.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            N2332913310205178802.a("createNode() can only be called when inserting");
        }
        B3798966058357121240 b3798966058357121240 = this.n;
        int i = b3798966058357121240.a[b3798966058357121240.b - 1];
        K15438463641018513946 k15438463641018513946 = this.I;
        M7798980774515057476 b = k15438463641018513946.b(k15438463641018513946.v);
        this.l++;
        W8201509300847612631 w8201509300847612631 = this.O;
        Z17561488864728364842 z17561488864728364842 = w8201509300847612631.O;
        z17561488864728364842.e0(B15877192428055666180.d);
        Z860808776098365610.M(z17561488864728364842, 0, b13729205492206812220);
        z17561488864728364842.Q[z17561488864728364842.R - z17561488864728364842.O[z17561488864728364842.P - 1].a] = i;
        Z860808776098365610.M(z17561488864728364842, 1, b);
        Z17561488864728364842 z175614888647283648422 = w8201509300847612631.P;
        z175614888647283648422.e0(B15877192428055666180.e);
        z175614888647283648422.Q[z175614888647283648422.R - z175614888647283648422.O[z175614888647283648422.P - 1].a] = i;
        Z860808776098365610.M(z175614888647283648422, 0, b);
    }

    public final void k0(Object obj) {
        if (obj instanceof Z4972949040470868463) {
            F819643558874997944 f819643558874997944 = new F819643558874997944((Z4972949040470868463) obj, this.m - 1);
            if (this.S) {
                Z17561488864728364842 z17561488864728364842 = this.M.b.a;
                z17561488864728364842.e0(L13814185666522667370.c);
                Z860808776098365610.M(z17561488864728364842, 0, f819643558874997944);
            }
            this.d.add(obj);
            obj = f819643558874997944;
        }
        l0(obj);
    }

    public final P3648740535677465818 l() {
        P3648740535677465818 p3648740535677465818 = this.K;
        return p3648740535677465818 != null ? p3648740535677465818 : m(this.G.i);
    }

    public final void l0(Object obj) {
        if (this.S) {
            this.I.T(obj);
            return;
        }
        S2509933476155449112 s2509933476155449112 = this.G;
        boolean z = s2509933476155449112.n;
        O13358947611952778634 o13358947611952778634 = this.M;
        if (!z) {
            M7798980774515057476 a = s2509933476155449112.a(s2509933476155449112.i);
            Z17561488864728364842 z17561488864728364842 = o13358947611952778634.b.a;
            z17561488864728364842.e0(P9608176217888420989.c);
            Z860808776098365610.N(z17561488864728364842, 0, a, 1, obj);
            return;
        }
        int d = (s2509933476155449112.l - S13318420980680640021.d(s2509933476155449112.b, s2509933476155449112.i)) - 1;
        if (o13358947611952778634.a.G.i - o13358947611952778634.f >= 0) {
            o13358947611952778634.d(true);
            Z17561488864728364842 z175614888647283648422 = o13358947611952778634.b.a;
            z175614888647283648422.e0(B15877192428055666180.g);
            Z860808776098365610.M(z175614888647283648422, 0, obj);
            z175614888647283648422.Q[z175614888647283648422.R - z175614888647283648422.O[z175614888647283648422.P - 1].a] = d;
            return;
        }
        S2509933476155449112 s25099334761554491122 = this.G;
        M7798980774515057476 a2 = s25099334761554491122.a(s25099334761554491122.i);
        Z17561488864728364842 z175614888647283648423 = o13358947611952778634.b.a;
        z175614888647283648423.e0(B15877192428055666180.f);
        Z860808776098365610.N(z175614888647283648423, 0, obj, 1, a2);
        z175614888647283648423.Q[z175614888647283648423.R - z175614888647283648423.O[z175614888647283648423.P - 1].a] = d;
    }

    public final P3648740535677465818 m(int i) {
        P3648740535677465818 p3648740535677465818;
        boolean z = this.S;
        Q15354356404958779064 q15354356404958779064 = N2332913310205178802.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.r(i2) == 202 && S10823041268949770285.t(this.I.s(i2), q15354356404958779064)) {
                    Object p = this.I.p(i2);
                    p.getClass();
                    P3648740535677465818 p36487405356774658182 = (P3648740535677465818) p;
                    this.K = p36487405356774658182;
                    return p36487405356774658182;
                }
                K15438463641018513946 k15438463641018513946 = this.I;
                i2 = k15438463641018513946.F(k15438463641018513946.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    S2509933476155449112 s2509933476155449112 = this.G;
                    if (S10823041268949770285.t(s2509933476155449112.p(s2509933476155449112.b, i), q15354356404958779064)) {
                        Q9908018528090167751 q9908018528090167751 = this.v;
                        if (q9908018528090167751 == null || (p3648740535677465818 = (P3648740535677465818) q9908018528090167751.b(i)) == null) {
                            S2509933476155449112 s25099334761554491122 = this.G;
                            Object b = s25099334761554491122.b(s25099334761554491122.b, i);
                            b.getClass();
                            p3648740535677465818 = (P3648740535677465818) b;
                        }
                        this.K = p3648740535677465818;
                        return p3648740535677465818;
                    }
                }
                i = this.G.q(i);
            }
        }
        P3648740535677465818 p36487405356774658183 = this.u;
        this.K = p36487405356774658183;
        return p36487405356774658183;
    }

    public final int m0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f369o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        A3997919466996862373 a3997919466996862373 = this.p;
        if (a3997919466996862373 != null && a3997919466996862373.c(i) >= 0) {
            int c = a3997919466996862373.c(i);
            if (c >= 0) {
                return a3997919466996862373.c[c];
            }
            K2042933864045806308.n(G6547577305291411977.n(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final A8944194597127240917 n() {
        Collection collection;
        if (!this.b.l()) {
            return null;
        }
        G9506192477171422664 F = K5751602218013079365.F();
        K15438463641018513946 k15438463641018513946 = this.I;
        F.addAll(C9869900372345142877.p(k15438463641018513946, null, k15438463641018513946.t, null));
        S2509933476155449112 s2509933476155449112 = this.G;
        boolean z = s2509933476155449112.f;
        int[] iArr = s2509933476155449112.b;
        if (z || s2509933476155449112.c == 0) {
            collection = O2161699089510411363.a;
        } else {
            S10479950654634216925 s10479950654634216925 = new S10479950654634216925(s2509933476155449112);
            int i = s2509933476155449112.i;
            Object valueOf = Integer.valueOf(s2509933476155449112.l - S13318420980680640021.d(iArr, i));
            while (i >= 0) {
                s10479950654634216925.j(s2509933476155449112.i(i), s2509933476155449112.k(i) ? s2509933476155449112.p(iArr, i) : O9023047933786425027.a, s2509933476155449112.a.m(i), valueOf);
                valueOf = s2509933476155449112.a(i);
                i = s2509933476155449112.q(i);
            }
            collection = (ArrayList) s10479950654634216925.a;
        }
        F.addAll(collection);
        F.addAll(F());
        return new A8944194597127240917(K5751602218013079365.v(F), this.C);
    }

    public final void n0() {
        if (!this.r) {
            N2332913310205178802.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            N2332913310205178802.a("useNode() called while inserting");
        }
        S2509933476155449112 s2509933476155449112 = this.G;
        Object n = s2509933476155449112.n(s2509933476155449112.i);
        O13358947611952778634 o13358947611952778634 = this.M;
        o13358947611952778634.c();
        o13358947611952778634.h.add(n);
        if (this.y && (n instanceof Y1249283782686518426)) {
            o13358947611952778634.b();
            o13358947611952778634.b.a.e0(F14281324791588985298.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(A4559761392562572984 a4559761392562572984, L12639328004344855510 l12639328004344855510) {
        ArrayList arrayList = this.s;
        if (this.F) {
            N2332913310205178802.a("Reentrant composition is not supported");
        }
        this.g.z();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(D459204867321966484.h().g());
            this.v = null;
            g0(a4559761392562572984);
            this.k = 0;
            this.F = true;
            try {
                e0();
                Object E = E();
                if (E != l12639328004344855510 && l12639328004344855510 != null) {
                    l0(l12639328004344855510);
                }
                I16737082536984153748 i16737082536984153748 = this.D;
                D389890677992184566 a = Z3658309082448601011.a();
                try {
                    a.b(i16737082536984153748);
                    Q15354356404958779064 q15354356404958779064 = N2332913310205178802.a;
                    if (l12639328004344855510 != null) {
                        X(200, q15354356404958779064);
                        B5998207562248239613.x(this, l12639328004344855510);
                        q(false);
                    } else if (!this.w || E == null || E.equals(O9023047933786425027.a)) {
                        S();
                    } else {
                        X(200, q15354356404958779064);
                        V12319504402545346730.s(2, E);
                        B5998207562248239613.x(this, (L12639328004344855510) E);
                        q(false);
                    }
                    a.m(a.c - 1);
                    u();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        N2332913310205178802.a("Check failed");
                    }
                    w();
                } catch (Throwable th) {
                    a.m(a.c - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void p(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        p(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object n = this.G.n(i);
            O13358947611952778634 o13358947611952778634 = this.M;
            o13358947611952778634.c();
            o13358947611952778634.h.add(n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04cc  */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M3727281027331139839.q(boolean):void");
    }

    public final void r() {
        q(false);
        V4878375136513573151 y = y();
        if (y != null) {
            int i = y.b;
            if ((i & 1) != 0) {
                y.b = i | 2;
            }
        }
    }

    public final void s() {
        q(false);
    }

    public final V4878375136513573151 t() {
        V4878375136513573151 v4878375136513573151;
        M7798980774515057476 a;
        C16936830270381006423 c16936830270381006423;
        ArrayList arrayList = this.E;
        V4878375136513573151 v48783751365135731512 = !arrayList.isEmpty() ? (V4878375136513573151) arrayList.remove(arrayList.size() - 1) : null;
        if (v48783751365135731512 != null) {
            v48783751365135731512.b &= -9;
            this.g.z();
            int i = this.B;
            M8849337839148886240 m8849337839148886240 = v48783751365135731512.f;
            if (m8849337839148886240 != null && (v48783751365135731512.b & 16) == 0) {
                Object[] objArr = m8849337839148886240.b;
                int[] iArr = m8849337839148886240.c;
                long[] jArr = m8849337839148886240.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    loop0: while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j & 255) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    if (iArr[i5] != i) {
                                        c16936830270381006423 = new C16936830270381006423(v48783751365135731512, i, m8849337839148886240, (byte) 3);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            c16936830270381006423 = null;
            O13358947611952778634 o13358947611952778634 = this.M;
            if (c16936830270381006423 != null) {
                Z17561488864728364842 z17561488864728364842 = o13358947611952778634.b.a;
                z17561488864728364842.e0(D11609958941943614329.c);
                Z860808776098365610.N(z17561488864728364842, 0, c16936830270381006423, 1, this.h);
            }
            int i6 = v48783751365135731512.b;
            if ((i6 & 512) != 0) {
                v48783751365135731512.b = i6 & (-513);
                Z17561488864728364842 z175614888647283648422 = o13358947611952778634.b.a;
                z175614888647283648422.e0(U17779414196812254951.c);
                Z860808776098365610.M(z175614888647283648422, 0, v48783751365135731512);
                int i7 = v48783751365135731512.b;
                v48783751365135731512.b = i7 & (-129);
                if ((i7 & 1024) != 0) {
                    v48783751365135731512.b = i7 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (v48783751365135731512 != null) {
            int i8 = v48783751365135731512.b;
            if ((i8 & 16) == 0 && ((i8 & 1) != 0 || this.q)) {
                if (v48783751365135731512.c == null) {
                    if (this.S) {
                        K15438463641018513946 k15438463641018513946 = this.I;
                        a = k15438463641018513946.b(k15438463641018513946.v);
                    } else {
                        S2509933476155449112 s2509933476155449112 = this.G;
                        a = s2509933476155449112.a(s2509933476155449112.i);
                    }
                    v48783751365135731512.c = a;
                }
                v48783751365135731512.b &= -5;
                v4878375136513573151 = v48783751365135731512;
                q(false);
                return v4878375136513573151;
            }
        }
        v4878375136513573151 = null;
        q(false);
        return v4878375136513573151;
    }

    public final void u() {
        q(false);
        this.b.d();
        q(false);
        O13358947611952778634 o13358947611952778634 = this.M;
        if (o13358947611952778634.c) {
            o13358947611952778634.d(false);
            o13358947611952778634.d(false);
            o13358947611952778634.b.a.e0(B14172617168564953885.c);
            o13358947611952778634.c = false;
        }
        o13358947611952778634.b();
        if (o13358947611952778634.d.b != 0) {
            N2332913310205178802.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            N2332913310205178802.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.d() != 0;
    }

    public final void v(boolean z, T15652639163465303893 t15652639163465303893) {
        this.i.add(this.j);
        this.j = t15652639163465303893;
        int i = this.l;
        B3798966058357121240 b3798966058357121240 = this.n;
        b3798966058357121240.e(i);
        b3798966058357121240.e(this.m);
        b3798966058357121240.e(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void w() {
        E1092155023341394263 e1092155023341394263 = new E1092155023341394263();
        if (this.C) {
            e1092155023341394263.b();
        }
        if (this.b.e()) {
            e1092155023341394263.k = new Q9908018528090167751();
        }
        this.H = e1092155023341394263;
        K15438463641018513946 k = e1092155023341394263.k();
        k.e(true);
        this.I = k;
    }

    public final M7586588299491030525 x() {
        E936446761334852831 e936446761334852831 = this.U;
        if (e936446761334852831 != null) {
            return e936446761334852831;
        }
        E936446761334852831 e9364467613348528312 = new E936446761334852831(this.h);
        this.U = e9364467613348528312;
        return e9364467613348528312;
    }

    public final V4878375136513573151 y() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (V4878375136513573151) arrayList.get(arrayList.size() - 1);
    }

    public final boolean z() {
        if (!B() || this.w) {
            return true;
        }
        V4878375136513573151 y = y();
        return (y == null || (y.b & 4) == 0) ? false : true;
    }
}
