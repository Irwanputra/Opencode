package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class T1422539684983103901 extends J2215566372910931965 implements B18307494358031290147, T1688716394939190891, F16971278462881137815, F10290064089087821626 {
    public J6677065442496343492 A;
    public J6677065442496343492 B;
    public P6327922796096925265 C;
    public R6293603162540210843 D;
    public D6833517301966315943 E;
    public E3422549137300678133 F;
    public M204440408817344908 G;
    public P11184147566986477297 H;
    public V6324805455732276888 I;
    public R7000310675073492254 q;
    public F4096073349764486348 r;
    public boolean s;
    public S9385204271696540760 t;
    public H17686692708284905246 u;
    public N4459031729035016230 v;
    public boolean w;
    public boolean x;
    public Z225719637791784451 y;
    public long z = 0;

    public T1422539684983103901(F4096073349764486348 f4096073349764486348, boolean z, S9385204271696540760 s9385204271696540760, R7000310675073492254 r7000310675073492254) {
        this.q = r7000310675073492254;
        this.r = f4096073349764486348;
        this.s = z;
        this.t = s9385204271696540760;
    }

    public static void o1(T1422539684983103901 t1422539684983103901, N13196868278329319633 n13196868278329319633, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        R6293603162540210843 r6293603162540210843 = t1422539684983103901.D;
        if (r6293603162540210843 == null) {
            r6293603162540210843 = new R6293603162540210843();
            r6293603162540210843.p = null;
            r6293603162540210843.q = Long.MAX_VALUE;
            r6293603162540210843.r = false;
            t1422539684983103901.D = r6293603162540210843;
        }
        r6293603162540210843.p = n13196868278329319633;
        r6293603162540210843.q = j;
        P11184147566986477297 p11184147566986477297 = t1422539684983103901.H;
        R7000310675073492254 r7000310675073492254 = t1422539684983103901.q;
        if (p11184147566986477297 == null) {
            t1422539684983103901.H = new P11184147566986477297(r7000310675073492254, 2);
        } else {
            p11184147566986477297.b = r7000310675073492254;
            p11184147566986477297.a = j2;
        }
        r6293603162540210843.r = false;
        t1422539684983103901.F = r6293603162540210843;
    }

    public final void A1() {
        this.w = true;
        R4833348786910499294 r4833348786910499294 = null;
        if (this.u == null) {
            this.u = I3887072968740112330.a(Integer.MAX_VALUE, 6, null);
        }
        R7033599853981556291.E(V0(), null, null, new J13979756969328643311((Object) this, r4833348786910499294, (byte) 0), 3);
    }

    public final void B1(F4096073349764486348 f4096073349764486348, boolean z, S9385204271696540760 s9385204271696540760, R7000310675073492254 r7000310675073492254, boolean z2) {
        this.r = f4096073349764486348;
        boolean z3 = true;
        if (this.s != z) {
            this.s = z;
            if (!z) {
                J6677065442496343492 j6677065442496343492 = this.B;
                if (j6677065442496343492 != null) {
                    i1(j6677065442496343492);
                }
                J6677065442496343492 j66770654424963434922 = this.A;
                if (j66770654424963434922 != null) {
                    i1(j66770654424963434922);
                }
                this.B = null;
                this.A = null;
                k1();
                this.I = null;
            }
            z2 = true;
        }
        if (!S10823041268949770285.t(this.t, s9385204271696540760)) {
            k1();
            this.t = s9385204271696540760;
        }
        if (this.q != r7000310675073492254) {
            this.q = r7000310675073492254;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.x;
            M16031945508028496077 m16031945508028496077 = M16031945508028496077.a;
            if (z4) {
                m1();
                if (this.w) {
                    v1().a(m16031945508028496077);
                }
                this.G = null;
            }
            V6324805455732276888 v6324805455732276888 = this.I;
            if (v6324805455732276888 != null) {
                v6324805455732276888.a();
                T1422539684983103901 t1422539684983103901 = v6324805455732276888.a;
                if (t1422539684983103901.w) {
                    t1422539684983103901.p1(m16031945508028496077);
                }
                v6324805455732276888.g = null;
                T17032536773975598836 t17032536773975598836 = v6324805455732276888.j;
                t17032536773975598836.a = 0;
                ((Q5456326841214199073) t17032536773975598836.b).b = 0;
            }
        }
    }

    @Override // dev.epro.r0.V17914047163624077766
    public final String L0() {
        if (!this.s) {
            return "idle";
        }
        E3422549137300678133 e3422549137300678133 = this.F;
        return e3422549137300678133 instanceof Z225719637791784451 ? ((Z225719637791784451) e3422549137300678133).r ? "waiting" : "idle" : ((e3422549137300678133 instanceof R6293603162540210843) || (e3422549137300678133 instanceof D6833517301966315943)) ? "waiting" : e3422549137300678133 instanceof P6327922796096925265 ? "recognized" : "idle";
    }

    @Override // dev.epro.r0.T1688716394939190891
    public final void O() {
        V6324805455732276888 v6324805455732276888 = this.I;
        if (v6324805455732276888 != null) {
            v6324805455732276888.a();
            T1422539684983103901 t1422539684983103901 = v6324805455732276888.a;
            if (t1422539684983103901.w) {
                t1422539684983103901.p1(M16031945508028496077.a);
            }
            v6324805455732276888.g = null;
            T17032536773975598836 t17032536773975598836 = v6324805455732276888.j;
            t17032536773975598836.a = 0;
            ((Q5456326841214199073) t17032536773975598836.b).b = 0;
        }
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void a1() {
        this.w = false;
        k1();
        J6677065442496343492 j6677065442496343492 = this.B;
        if (j6677065442496343492 != null) {
            i1(j6677065442496343492);
        }
        J6677065442496343492 j66770654424963434922 = this.A;
        if (j66770654424963434922 != null) {
            i1(j66770654424963434922);
        }
        this.B = null;
        this.A = null;
    }

    public final void k1() {
        N4459031729035016230 n4459031729035016230 = this.v;
        if (n4459031729035016230 != null) {
            S9385204271696540760 s9385204271696540760 = this.t;
            if (s9385204271696540760 != null) {
                s9385204271696540760.c(new V8456276107310882316(n4459031729035016230));
            }
            this.v = null;
        }
    }

    public abstract Object l1(O12152244488187446230 o12152244488187446230, J13979756969328643311 j13979756969328643311);

    public final void m1() {
        this.z = 0L;
        Z225719637791784451 z225719637791784451 = this.y;
        A16590768180473949618 a16590768180473949618 = A16590768180473949618.c;
        if (z225719637791784451 == null) {
            z225719637791784451 = new Z225719637791784451();
            z225719637791784451.p = a16590768180473949618;
            z225719637791784451.q = false;
            z225719637791784451.r = false;
            this.y = z225719637791784451;
        }
        z225719637791784451.p = a16590768180473949618;
        z225719637791784451.q = false;
        z225719637791784451.r = false;
        this.F = z225719637791784451;
    }

    @Override // dev.epro.r0.F10290064089087821626
    public final R7000310675073492254 n() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fe  */
    /* JADX WARN: Type inference failed for: r16v0, types: [dev.epro.r0.F16971278462881137815, dev.epro.r0.J2215566372910931965, dev.epro.r0.R16749699847173633337, dev.epro.r0.T1422539684983103901, dev.epro.r0.V17914047163624077766] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @Override // dev.epro.r0.B18307494358031290147
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(dev.epro.r0.Y1086209215650239921 r17, dev.epro.r0.J17191566391535857141 r18, long r19) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T1422539684983103901.n0(dev.epro.r0.Y1086209215650239921, dev.epro.r0.J17191566391535857141, long):void");
    }

    public final void n1(N13196868278329319633 n13196868278329319633, long j, P11184147566986477297 p11184147566986477297) {
        D6833517301966315943 d6833517301966315943 = this.E;
        if (d6833517301966315943 == null) {
            d6833517301966315943 = new D6833517301966315943();
            d6833517301966315943.p = null;
            d6833517301966315943.q = Long.MAX_VALUE;
            this.E = d6833517301966315943;
        }
        d6833517301966315943.p = n13196868278329319633;
        d6833517301966315943.q = j;
        p11184147566986477297.a = 0L;
        this.F = d6833517301966315943;
    }

    public final void p1(L1051026420479117730 l1051026420479117730) {
        if ((l1051026420479117730 instanceof E14661167550073153335) && !this.w) {
            this.w = true;
            A1();
        }
        v1().a(l1051026420479117730);
    }

    public void r1(U6972183442521542605 u6972183442521542605) {
        if (this.n) {
            R7033599853981556291.E(V0(), null, null, new I15284427961769500538(this, u6972183442521542605, null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s1(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof dev.epro.r0.G12429273726606460895
            if (r0 == 0) goto L13
            r0 = r6
            dev.epro.r0.G12429273726606460895 r0 = (dev.epro.r0.G12429273726606460895) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.G12429273726606460895 r0 = new dev.epro.r0.G12429273726606460895
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            int r1 = r0.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L47
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L2c:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.N4459031729035016230 r6 = r5.v
            if (r6 == 0) goto L49
            dev.epro.r0.S9385204271696540760 r1 = r5.t
            if (r1 == 0) goto L47
            dev.epro.r0.V8456276107310882316 r4 = new dev.epro.r0.V8456276107310882316
            r4.<init>(r6)
            r0.v = r3
            java.lang.Object r6 = r1.b(r4, r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r0) goto L47
            return r0
        L47:
            r5.v = r2
        L49:
            dev.epro.r0.U6972183442521542605 r6 = new dev.epro.r0.U6972183442521542605
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.r1(r6)
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T1422539684983103901.s1(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r1.b(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t1(dev.epro.r0.E14661167550073153335 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dev.epro.r0.X7413509937868935242
            if (r0 == 0) goto L13
            r0 = r8
            dev.epro.r0.X7413509937868935242 r0 = (dev.epro.r0.X7413509937868935242) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dev.epro.r0.X7413509937868935242 r0 = new dev.epro.r0.X7413509937868935242
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            int r1 = r0.x
            r2 = 2
            r3 = 1
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            dev.epro.r0.N4459031729035016230 r7 = r0.u
            dev.epro.r0.E14661167550073153335 r0 = r0.t
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            r6 = 0
            return r6
        L35:
            dev.epro.r0.E14661167550073153335 r7 = r0.t
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L56
        L3b:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.N4459031729035016230 r8 = r6.v
            if (r8 == 0) goto L56
            dev.epro.r0.S9385204271696540760 r1 = r6.t
            if (r1 == 0) goto L56
            dev.epro.r0.V8456276107310882316 r5 = new dev.epro.r0.V8456276107310882316
            r5.<init>(r8)
            r0.t = r7
            r0.x = r3
            java.lang.Object r8 = r1.b(r5, r0)
            if (r8 != r4) goto L56
            goto L6b
        L56:
            dev.epro.r0.N4459031729035016230 r8 = new dev.epro.r0.N4459031729035016230
            r8.<init>()
            dev.epro.r0.S9385204271696540760 r1 = r6.t
            if (r1 == 0) goto L70
            r0.t = r7
            r0.u = r8
            r0.x = r2
            java.lang.Object r0 = r1.b(r8, r0)
            if (r0 != r4) goto L6c
        L6b:
            return r4
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.v = r8
            long r7 = r7.a
            r6.q1(r7)
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T1422539684983103901.t1(dev.epro.r0.E14661167550073153335, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u1(dev.epro.r0.U6972183442521542605 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dev.epro.r0.L379197613037019985
            if (r0 == 0) goto L13
            r0 = r7
            dev.epro.r0.L379197613037019985 r0 = (dev.epro.r0.L379197613037019985) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dev.epro.r0.L379197613037019985 r0 = new dev.epro.r0.L379197613037019985
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            dev.epro.r0.U6972183442521542605 r6 = r0.t
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L2e:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.N4459031729035016230 r7 = r5.v
            if (r7 == 0) goto L4d
            dev.epro.r0.S9385204271696540760 r1 = r5.t
            if (r1 == 0) goto L4b
            dev.epro.r0.T10068966379787584704 r4 = new dev.epro.r0.T10068966379787584704
            r4.<init>(r7)
            r0.t = r6
            r0.w = r3
            java.lang.Object r7 = r1.b(r4, r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r0) goto L4b
            return r0
        L4b:
            r5.v = r2
        L4d:
            r5.r1(r6)
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T1422539684983103901.u1(dev.epro.r0.U6972183442521542605, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final E5386183571211952538 v1() {
        H17686692708284905246 h17686692708284905246 = this.u;
        if (h17686692708284905246 != null) {
            return h17686692708284905246;
        }
        S10973172697741180971.j("Events channel not initialized.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [dev.epro.r0.J2215566372910931965, dev.epro.r0.T1422539684983103901] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object] */
    @Override // dev.epro.r0.T1688716394939190891
    public final void w0(N12245111110189169079 n12245111110189169079, J17191566391535857141 j17191566391535857141) {
        Object obj;
        Object obj2;
        char c;
        long j;
        float f;
        float intBitsToFloat;
        V6324805455732276888 v6324805455732276888;
        Object obj3;
        J17191566391535857141 j171915663915358571412;
        V6324805455732276888 v63248054557322768882;
        V12527742189361867087 v12527742189361867087;
        V12527742189361867087 v125277421893618670872;
        int i = n12245111110189169079.b;
        ArrayList arrayList = (ArrayList) n12245111110189169079.c;
        if (this.s) {
            V6324805455732276888 v63248054557322768883 = this.I;
            if (v63248054557322768883 == null) {
                v63248054557322768883 = new V6324805455732276888(this);
                this.I = v63248054557322768883;
            }
            if (this.B == null) {
                J6677065442496343492 j6677065442496343492 = new J6677065442496343492(v63248054557322768883);
                h1(j6677065442496343492);
                this.B = j6677065442496343492;
            }
            V6324805455732276888 v63248054557322768884 = this.I;
            if (v63248054557322768884 != null) {
                T1422539684983103901 t1422539684983103901 = v63248054557322768884.a;
                Q13169198992966610970 q13169198992966610970 = v63248054557322768884.f;
                Q13169198992966610970 q131691989929666109702 = q13169198992966610970;
                if (q13169198992966610970 == null) {
                    H1680712944080904022 h1680712944080904022 = v63248054557322768884.b;
                    H1680712944080904022 h16807129440809040222 = h1680712944080904022;
                    if (h1680712944080904022 == null) {
                        H1680712944080904022 h16807129440809040223 = new H1680712944080904022();
                        h16807129440809040223.l = L4099941323637989549.c;
                        h16807129440809040223.m = false;
                        h16807129440809040223.n = false;
                        v63248054557322768884.b = h16807129440809040223;
                        h16807129440809040222 = h16807129440809040223;
                    }
                    v63248054557322768884.f = h16807129440809040222;
                    q131691989929666109702 = h16807129440809040222;
                }
                boolean z = q131691989929666109702 instanceof H1680712944080904022;
                J17191566391535857141 j171915663915358571413 = J17191566391535857141.a;
                boolean z2 = true;
                J17191566391535857141 j171915663915358571414 = J17191566391535857141.b;
                if (z) {
                    H1680712944080904022 h16807129440809040224 = (H1680712944080904022) q131691989929666109702;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!S10823041268949770285.v((V12527742189361867087) arrayList.get(i2))) {
                            return;
                        }
                    }
                    V12527742189361867087 v125277421893618670873 = (V12527742189361867087) R9411874267597469228.B0(arrayList);
                    int i3 = E16381631064888689527.a[h16807129440809040224.l.ordinal()];
                    L4099941323637989549 l4099941323637989549 = L4099941323637989549.b;
                    L4099941323637989549 l40999413236379895492 = L4099941323637989549.a;
                    L4099941323637989549 l40999413236379895493 = i3 == 1 ? !t1422539684983103901.z1() ? l40999413236379895492 : l4099941323637989549 : h16807129440809040224.l;
                    h16807129440809040224.l = l40999413236379895493;
                    if (j17191566391535857141 == j171915663915358571413) {
                        if (l40999413236379895493 == l4099941323637989549) {
                            v125277421893618670873.i = true;
                            h16807129440809040224.m = true;
                        }
                        h16807129440809040224.n = true;
                    }
                    if (j17191566391535857141 == j171915663915358571414) {
                        if (l40999413236379895493 == l40999413236379895492) {
                            V6324805455732276888.c(v63248054557322768884, v125277421893618670873, v125277421893618670873.a, 0L, 12);
                            return;
                        }
                        if (h16807129440809040224.m) {
                            v63248054557322768884.f(v125277421893618670873, v125277421893618670873, new L11375348705951955702(i), 0L);
                            v63248054557322768884.e(v125277421893618670873, new L11375348705951955702(i), 0L);
                            long j2 = v125277421893618670873.a;
                            K13194410849201862068 k13194410849201862068 = v63248054557322768884.c;
                            if (k13194410849201862068 == null) {
                                k13194410849201862068 = new K13194410849201862068();
                                k13194410849201862068.l = Long.MAX_VALUE;
                                v63248054557322768884.c = k13194410849201862068;
                            }
                            k13194410849201862068.l = j2;
                            v63248054557322768884.f = k13194410849201862068;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = q131691989929666109702 instanceof U4028013539401150749;
                J17191566391535857141 j171915663915358571415 = J17191566391535857141.c;
                if (z3) {
                    U4028013539401150749 u4028013539401150749 = (U4028013539401150749) q131691989929666109702;
                    if (j17191566391535857141 == j171915663915358571413) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            v6324805455732276888 = v63248054557322768884;
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i4);
                        v6324805455732276888 = v63248054557322768884;
                        if (G16660188620551127941.y(((V12527742189361867087) obj3).a, u4028013539401150749.m)) {
                            break;
                        }
                        i4++;
                        v63248054557322768884 = v6324805455732276888;
                    }
                    V12527742189361867087 v125277421893618670874 = (V12527742189361867087) obj3;
                    if (v125277421893618670874 == null) {
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                v125277421893618670872 = 0;
                                break;
                            }
                            v125277421893618670872 = arrayList.get(i5);
                            if (((V12527742189361867087) v125277421893618670872).d) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        v125277421893618670874 = v125277421893618670872;
                        if (v125277421893618670874 == null) {
                            v6324805455732276888.a();
                            return;
                        }
                        u4028013539401150749.m = v125277421893618670874.a;
                    }
                    V12527742189361867087 v125277421893618670875 = v125277421893618670874;
                    if (j17191566391535857141 == j171915663915358571414) {
                        if (v125277421893618670875.i) {
                            j171915663915358571412 = j171915663915358571415;
                            v63248054557322768882 = v6324805455732276888;
                            V12527742189361867087 v125277421893618670876 = u4028013539401150749.l;
                            if (v125277421893618670876 == null) {
                                S10973172697741180971.j("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j3 = u4028013539401150749.m;
                            P11184147566986477297 p11184147566986477297 = v63248054557322768882.h;
                            if (p11184147566986477297 == null) {
                                S10973172697741180971.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            v63248054557322768882.b(v125277421893618670876, j3, p11184147566986477297);
                        } else if (S10823041268949770285.w(v125277421893618670875)) {
                            int size4 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size4) {
                                    v12527742189361867087 = null;
                                    break;
                                }
                                ?? r6 = arrayList.get(i6);
                                if (((V12527742189361867087) r6).d) {
                                    v12527742189361867087 = r6;
                                    break;
                                }
                                i6++;
                            }
                            V12527742189361867087 v125277421893618670877 = v12527742189361867087;
                            if (v125277421893618670877 == null) {
                                v6324805455732276888.a();
                            } else {
                                u4028013539401150749.m = v125277421893618670877.a;
                            }
                        } else {
                            K1865709164992808030 k1865709164992808030 = (K1865709164992808030) B11964701839924937722.o(t1422539684983103901, Y238707362170117896.t);
                            float f2 = F10757829603125321143.a;
                            float d = k1865709164992808030.d();
                            v63248054557322768882 = v6324805455732276888;
                            P11184147566986477297 p111841475669864772972 = v63248054557322768882.h;
                            if (p111841475669864772972 == null) {
                                S10973172697741180971.j("Touch slop detector not initialized.");
                                return;
                            }
                            long a = P11184147566986477297.a(p111841475669864772972, S10823041268949770285.P(v125277421893618670875, t1422539684983103901.q, new L11375348705951955702(i), true), d);
                            if ((9223372034707292159L & a) != 9205357640488583168L) {
                                v125277421893618670875.i = true;
                                V12527742189361867087 v125277421893618670878 = u4028013539401150749.l;
                                v125277421893618670878.getClass();
                                j171915663915358571412 = j171915663915358571415;
                                v63248054557322768882.f(v125277421893618670878, v125277421893618670875, new L11375348705951955702(i), a);
                                v63248054557322768882.e(v125277421893618670875, new L11375348705951955702(i), a);
                                long j4 = v125277421893618670875.a;
                                K13194410849201862068 k131944108492018620682 = v63248054557322768882.c;
                                if (k131944108492018620682 == null) {
                                    k131944108492018620682 = new K13194410849201862068();
                                    k131944108492018620682.l = Long.MAX_VALUE;
                                    v63248054557322768882.c = k131944108492018620682;
                                }
                                k131944108492018620682.l = j4;
                                v63248054557322768882.f = k131944108492018620682;
                            } else {
                                j171915663915358571412 = j171915663915358571415;
                                u4028013539401150749.n = true;
                            }
                        }
                        if (j17191566391535857141 == j171915663915358571412 || !u4028013539401150749.n) {
                            return;
                        }
                        if (!v125277421893618670875.i) {
                            u4028013539401150749.n = false;
                            return;
                        }
                        V12527742189361867087 v125277421893618670879 = u4028013539401150749.l;
                        if (v125277421893618670879 == null) {
                            S10973172697741180971.j("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j5 = u4028013539401150749.m;
                        P11184147566986477297 p111841475669864772973 = v63248054557322768882.h;
                        if (p111841475669864772973 != null) {
                            v63248054557322768882.b(v125277421893618670879, j5, p111841475669864772973);
                            return;
                        } else {
                            S10973172697741180971.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    j171915663915358571412 = j171915663915358571415;
                    v63248054557322768882 = v6324805455732276888;
                    if (j17191566391535857141 == j171915663915358571412) {
                        return;
                    } else {
                        return;
                    }
                }
                if (q131691989929666109702 instanceof H13563640512344124027) {
                    H13563640512344124027 h13563640512344124027 = (H13563640512344124027) q131691989929666109702;
                    if (j17191566391535857141 != j171915663915358571415) {
                        return;
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            break;
                        }
                        if (((V12527742189361867087) arrayList.get(i7)).i) {
                            z2 = false;
                            break;
                        }
                        i7++;
                    }
                    int size6 = arrayList.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size6) {
                            break;
                        }
                        if (!((V12527742189361867087) arrayList.get(i8)).d) {
                            i8++;
                        } else if (!arrayList.isEmpty()) {
                            if (z2) {
                                long Q = S10823041268949770285.Q((V12527742189361867087) R9411874267597469228.B0(arrayList), t1422539684983103901.q, new L11375348705951955702(i));
                                V12527742189361867087 v1252774218936186708710 = h13563640512344124027.l;
                                v1252774218936186708710.getClass();
                                long e = L2216691091636065972.e(Q, S10823041268949770285.Q(v1252774218936186708710, t1422539684983103901.q, new L11375348705951955702(i)));
                                V12527742189361867087 v1252774218936186708711 = h13563640512344124027.l;
                                if (v1252774218936186708711 != null) {
                                    V6324805455732276888.c(v63248054557322768884, v1252774218936186708711, h13563640512344124027.m, e, 8);
                                    return;
                                } else {
                                    S10973172697741180971.j("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    v63248054557322768884.a();
                    return;
                }
                if (!(q131691989929666109702 instanceof K13194410849201862068)) {
                    Z3383101362411723454.g();
                    return;
                }
                K13194410849201862068 k131944108492018620683 = (K13194410849201862068) q131691989929666109702;
                if (j17191566391535857141 != j171915663915358571414) {
                    return;
                }
                long j6 = k131944108492018620683.l;
                int size7 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i9);
                    if (G16660188620551127941.y(((V12527742189361867087) obj).a, j6)) {
                        break;
                    } else {
                        i9++;
                    }
                }
                V12527742189361867087 v1252774218936186708712 = (V12527742189361867087) obj;
                if (v1252774218936186708712 == null) {
                    return;
                }
                long j7 = v1252774218936186708712.c;
                boolean w = S10823041268949770285.w(v1252774218936186708712);
                M16031945508028496077 m16031945508028496077 = M16031945508028496077.a;
                if (!w) {
                    if (v1252774218936186708712.i) {
                        t1422539684983103901.p1(m16031945508028496077);
                        return;
                    } else {
                        if (L2216691091636065972.c(S10823041268949770285.P(v1252774218936186708712, t1422539684983103901.q, new L11375348705951955702(i), true)) == 0.0f) {
                            return;
                        }
                        v63248054557322768884.e(v1252774218936186708712, new L11375348705951955702(i), S10823041268949770285.P(v1252774218936186708712, t1422539684983103901.q, new L11375348705951955702(i), false));
                        v1252774218936186708712.i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i10);
                    if (((V12527742189361867087) obj2).d) {
                        break;
                    } else {
                        i10++;
                    }
                }
                V12527742189361867087 v1252774218936186708713 = (V12527742189361867087) obj2;
                if (v1252774218936186708713 != null) {
                    k131944108492018620683.l = v1252774218936186708713.a;
                    return;
                }
                if (v1252774218936186708712.i || !S10823041268949770285.w(v1252774218936186708712)) {
                    t1422539684983103901.p1(m16031945508028496077);
                } else {
                    M204440408817344908 d2 = v63248054557322768884.d();
                    R7000310675073492254 r7000310675073492254 = t1422539684983103901.q;
                    T17032536773975598836 t17032536773975598836 = v63248054557322768884.i;
                    U9803441765912152712 u9803441765912152712 = (U9803441765912152712) t17032536773975598836.b;
                    char c2 = ' ';
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
                    long j8 = 4294967295L;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    if (S10823041268949770285.v(v1252774218936186708712)) {
                        t17032536773975598836.a = 0;
                        u9803441765912152712.d();
                    }
                    if (S10823041268949770285.w(v1252774218936186708712) || S10823041268949770285.v(v1252774218936186708712)) {
                        c = ' ';
                        j = 4294967295L;
                        f = 0.0f;
                    } else {
                        if (u9803441765912152712.b == 3) {
                            int i11 = t17032536773975598836.a;
                            t17032536773975598836.a = i11 + 1;
                            u9803441765912152712.n(i11, v1252774218936186708712);
                        } else {
                            u9803441765912152712.a(v1252774218936186708712);
                        }
                        if (t17032536773975598836.a == 3) {
                            t17032536773975598836.a = 0;
                        }
                        Object[] objArr = u9803441765912152712.a;
                        int i12 = u9803441765912152712.b;
                        int i13 = 0;
                        float f3 = 0.0f;
                        while (i13 < i12) {
                            char c3 = c2;
                            f3 = Float.intBitsToFloat((int) (((V12527742189361867087) objArr[i13]).c >> c3)) + f3;
                            i13++;
                            c2 = c3;
                        }
                        c = c2;
                        f = 0.0f;
                        int i14 = u9803441765912152712.b;
                        intBitsToFloat2 = f3 / i14;
                        Object[] objArr2 = u9803441765912152712.a;
                        float f4 = 0.0f;
                        int i15 = 0;
                        while (i15 < i14) {
                            long j9 = j8;
                            f4 += Float.intBitsToFloat((int) (((V12527742189361867087) objArr2[i15]).c & j9));
                            i15++;
                            j8 = j9;
                        }
                        j = j8;
                        intBitsToFloat3 = f4 / u9803441765912152712.b;
                    }
                    long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & j);
                    if (r7000310675073492254 != null) {
                        if (i == 1) {
                            intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
                        } else if (i == 2) {
                            intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j));
                        }
                        floatToRawIntBits = r7000310675073492254 == R7000310675073492254.b ? (Float.floatToRawIntBits(f) & j) | (Float.floatToRawIntBits(intBitsToFloat) << c) : (Float.floatToRawIntBits(f) << c) | (Float.floatToRawIntBits(intBitsToFloat) & j);
                    }
                    ((H14072535535744303516) d2.b).a(v1252774218936186708712.b, floatToRawIntBits);
                    float a2 = ((K1865709164992808030) B11964701839924937722.o(t1422539684983103901, Y238707362170117896.t)).a();
                    long j10 = v63248054557322768884.d().j(T3224757362656795885.a(a2, a2));
                    H14072535535744303516 h14072535535744303516 = (H14072535535744303516) v63248054557322768884.d().b;
                    F15711662138251908495 f15711662138251908495 = h14072535535744303516.a;
                    O5378677881740157249.x0(0, r5.length, null, f15711662138251908495.d);
                    f15711662138251908495.e = 0;
                    F15711662138251908495 f157116621382519084952 = h14072535535744303516.b;
                    O5378677881740157249.x0(0, r5.length, null, f157116621382519084952.d);
                    f157116621382519084952.e = 0;
                    h14072535535744303516.c = 0L;
                    t1422539684983103901.p1(new U6972183442521542605(R3964428913610127921.c(j10), true));
                }
                v63248054557322768884.a();
            }
        }
    }

    public final M204440408817344908 w1() {
        M204440408817344908 m204440408817344908 = this.G;
        if (m204440408817344908 != null) {
            return m204440408817344908;
        }
        S10973172697741180971.j("Velocity Tracker not initialized.");
        return null;
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void x0() {
        if (this.x) {
            m1();
            if (this.w) {
                v1().a(M16031945508028496077.a);
            }
            this.G = null;
        }
        this.x = false;
    }

    public final void x1(long j, N13196868278329319633 n13196868278329319633) {
        this.z = L2216691091636065972.f(this.z, j);
        T13998044911588922055.c(w1(), n13196868278329319633);
        v1().a(new P8765079843515277045(j, false));
    }

    public final void y1(N13196868278329319633 n13196868278329319633, N13196868278329319633 n131968682783293196332, long j) {
        if (this.G == null) {
            this.G = new M204440408817344908((byte) 2);
        }
        T13998044911588922055.c(w1(), n13196868278329319633);
        long e = L2216691091636065972.e(n131968682783293196332.c, j);
        if (((Boolean) this.r.invoke(new O12393276431214249727(n13196868278329319633.i))).booleanValue()) {
            if (!this.w) {
                if (this.u == null) {
                    this.u = I3887072968740112330.a(Integer.MAX_VALUE, 6, null);
                }
                A1();
            }
            v1().a(new E14661167550073153335(e));
        }
    }

    public boolean z1() {
        V5142773592757085764 v5142773592757085764 = ((U830809347177809305) this).R;
        if (v5142773592757085764.a.b()) {
            return true;
        }
        N11829648573770870927 n11829648573770870927 = v5142773592757085764.b;
        return n11829648573770870927 != null ? n11829648573770870927.e() : false;
    }

    public void q1(long j) {
    }
}
