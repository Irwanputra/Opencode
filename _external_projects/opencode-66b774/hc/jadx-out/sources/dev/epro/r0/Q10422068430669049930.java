package dev.epro.r0;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q10422068430669049930 extends E10177778682618078576 {
    public B13729205492206812220 K;
    public boolean L;
    public final G14438155262350387569 M;
    public final G14438155262350387569 N;
    public N13196868278329319633 O;
    public X7175349259954592591 P;
    public X7175349259954592591 Q;
    public boolean R;
    public boolean S;
    public long T;
    public boolean U;
    public V12527742189361867087 V;
    public X7175349259954592591 W;
    public X7175349259954592591 X;
    public boolean Y;
    public boolean Z;
    public long a0;
    public boolean b0;

    public Q10422068430669049930(B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, S9385204271696540760 s9385204271696540760, boolean z) {
        super(s9385204271696540760, null, z, true, null, null, b13729205492206812220);
        this.K = b137292054922068122202;
        this.L = true;
        G14438155262350387569 g14438155262350387569 = S11299071591039262705.a;
        this.M = new G14438155262350387569();
        this.N = new G14438155262350387569();
        this.T = -1L;
        this.a0 = -1L;
    }

    public final void A1(long j, N13196868278329319633 n13196868278329319633) {
        if (this.v && !this.U) {
            p1(n13196868278329319633.c, false);
            this.T = j;
            if (!this.S && !this.R) {
                w1();
            }
        }
        this.O = null;
        this.U = false;
        this.R = false;
        X7175349259954592591 x7175349259954592591 = this.P;
        if (x7175349259954592591 != null) {
            x7175349259954592591.c(null);
        }
        this.P = null;
        this.S = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1() {
        /*
            r24 = this;
            r0 = r24
            dev.epro.r0.G14438155262350387569 r1 = r0.M
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.32E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            dev.epro.r0.Q15035754882231748864 r10 = (dev.epro.r0.Q15035754882231748864) r10
            r10.c(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.32E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.a()
            dev.epro.r0.G14438155262350387569 r0 = r0.N
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto La2
            r4 = r14
        L71:
            r6 = r2[r4]
            long r8 = ~r6
            long r8 = r8 << r21
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L9d
            int r8 = r4 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L84:
            if (r9 >= r8) goto L9b
            long r22 = r6 & r18
            int r10 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r10 < 0) goto L90
            long r6 = r6 >> r13
            int r9 = r9 + 1
            goto L84
        L90:
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r1[r0]
            dev.epro.r0.F12791421438151516421 r0 = (dev.epro.r0.F12791421438151516421) r0
            r0.getClass()
            throw r5
        L9b:
            if (r8 != r13) goto La2
        L9d:
            if (r4 == r3) goto La2
            int r4 = r4 + 1
            goto L71
        La2:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q10422068430669049930.B1():void");
    }

    @Override // dev.epro.r0.T1688716394939190891
    public final void O() {
        y1(true);
    }

    @Override // dev.epro.r0.R15896830329318850690
    public final void b1() {
        B1();
    }

    @Override // dev.epro.r0.E10177778682618078576
    public final void k1(S2460821117650695638 s2460821117650695638) {
        if (this.K != null) {
            S464754454553842217 s464754454553842217 = new S464754454553842217(this, (byte) 12);
            D15596191924284547207[] d15596191924284547207Arr = U4676709778812953726.a;
            s2460821117650695638.a(E5458822993765169982.c, new R17587901753867651123(null, s464754454553842217));
        }
    }

    @Override // dev.epro.r0.E10177778682618078576, dev.epro.r0.B18307494358031290147
    public final void n0(Y1086209215650239921 y1086209215650239921, J17191566391535857141 j17191566391535857141, long j) {
        super.n0(y1086209215650239921, j17191566391535857141, j);
        if (j17191566391535857141 != J17191566391535857141.b) {
            if (j17191566391535857141 != J17191566391535857141.c || this.O == null || this.S) {
                return;
            }
            List list = y1086209215650239921.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                N13196868278329319633 n13196868278329319633 = (N13196868278329319633) list.get(i);
                if (n13196868278329319633.c() && n13196868278329319633 != this.O) {
                    y1(false);
                    return;
                }
            }
            return;
        }
        if (this.O == null) {
            if (U2645994142831146282.f(y1086209215650239921, true, false)) {
                N13196868278329319633 n131968682783293196332 = (N13196868278329319633) y1086209215650239921.a.get(0);
                n131968682783293196332.a();
                this.O = n131968682783293196332;
                if (this.v) {
                    X7175349259954592591 x7175349259954592591 = this.Q;
                    if (x7175349259954592591 != null && x7175349259954592591.b()) {
                        ((K1865709164992808030) B11964701839924937722.o(this, Y238707362170117896.t)).getClass();
                        if (n131968682783293196332.b - this.T < 40) {
                            this.U = true;
                            return;
                        }
                        this.R = true;
                        X7175349259954592591 x71753492599545925912 = this.Q;
                        if (x71753492599545925912 != null) {
                            x71753492599545925912.c(null);
                        }
                        this.Q = null;
                    }
                    this.S = false;
                    r1(n131968682783293196332);
                    if (this.K != null) {
                        this.P = R7033599853981556291.E(V0(), null, null, new C5756303275221609163(this, null, (byte) 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = y1086209215650239921.c == 2;
        List list2 = y1086209215650239921.a;
        if (z && !this.S && this.v && this.K != null) {
            X7175349259954592591 x71753492599545925913 = this.P;
            if (x71753492599545925913 != null) {
                x71753492599545925913.c(null);
            }
            this.P = null;
            B13729205492206812220 b13729205492206812220 = this.K;
            if (b13729205492206812220 != null) {
                b13729205492206812220.invoke();
            }
            if (this.L) {
                ((D1743966822371805936) ((I16162375839174538453) B11964701839924937722.o(this, Y238707362170117896.l))).a(0);
            }
            this.S = true;
        }
        if (this.S) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!I3887072968740112330.t((N13196868278329319633) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((N13196868278329319633) list2.get(i3)).a();
                    }
                    return;
                }
            }
            N13196868278329319633 n131968682783293196333 = (N13196868278329319633) list2.get(0);
            n131968682783293196333.a();
            long j2 = n131968682783293196333.b;
            N13196868278329319633 n131968682783293196334 = this.O;
            n131968682783293196334.getClass();
            A1(j2, n131968682783293196334);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!I3887072968740112330.s((N13196868278329319633) list2.get(i4))) {
                long jN1 = n1(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    N13196868278329319633 n131968682783293196335 = (N13196868278329319633) list2.get(i5);
                    if (n131968682783293196335.c() || I3887072968740112330.B(n131968682783293196335, j, jN1)) {
                        y1(false);
                        return;
                    }
                }
                return;
            }
        }
        N13196868278329319633 n131968682783293196336 = (N13196868278329319633) list2.get(0);
        n131968682783293196336.a();
        long j3 = n131968682783293196336.b;
        N13196868278329319633 n131968682783293196337 = this.O;
        n131968682783293196337.getClass();
        A1(j3, n131968682783293196337);
    }

    @Override // dev.epro.r0.E10177778682618078576
    public final void t1() {
        B1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // dev.epro.r0.E10177778682618078576
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u1(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = dev.epro.r0.D15445857918358799638.J(r7)
            dev.epro.r0.B13729205492206812220 r7 = r6.K
            r2 = 0
            if (r7 == 0) goto L25
            dev.epro.r0.G14438155262350387569 r7 = r6.M
            java.lang.Object r3 = r7.e(r0)
            if (r3 != 0) goto L25
            dev.epro.r0.W5797197595347441198 r3 = r6.V0()
            dev.epro.r0.C5756303275221609163 r4 = new dev.epro.r0.C5756303275221609163
            r5 = 2
            r4.<init>(r6, r2, r5)
            r5 = 3
            dev.epro.r0.X7175349259954592591 r2 = dev.epro.r0.R7033599853981556291.E(r3, r2, r2, r4, r5)
            r7.i(r0, r2)
            r7 = 1
            goto L26
        L25:
            r7 = 0
        L26:
            dev.epro.r0.G14438155262350387569 r6 = r6.N
            java.lang.Object r6 = r6.e(r0)
            dev.epro.r0.F12791421438151516421 r6 = (dev.epro.r0.F12791421438151516421) r6
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q10422068430669049930.u1(android.view.KeyEvent):boolean");
    }

    @Override // dev.epro.r0.E10177778682618078576
    public final void v1(KeyEvent keyEvent) {
        long J = D15445857918358799638.J(keyEvent);
        G14438155262350387569 g14438155262350387569 = this.M;
        boolean z = false;
        if (g14438155262350387569.e(J) != null) {
            Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) g14438155262350387569.e(J);
            if (q15035754882231748864 != null) {
                if (q15035754882231748864.b()) {
                    q15035754882231748864.c(null);
                } else {
                    z = true;
                }
            }
            g14438155262350387569.g(J);
        }
        if (z) {
            return;
        }
        w1();
    }

    @Override // dev.epro.r0.T1688716394939190891
    public final void w0(N12245111110189169079 n12245111110189169079, J17191566391535857141 j17191566391535857141) {
        ArrayList arrayList = (ArrayList) n12245111110189169079.c;
        s1();
        if (this.v && this.z == null) {
            J6677065442496343492 j6677065442496343492 = new J6677065442496343492(this);
            h1(j6677065442496343492);
            this.z = j6677065442496343492;
        }
        int i = 0;
        if (j17191566391535857141 != J17191566391535857141.b) {
            if (j17191566391535857141 != J17191566391535857141.c || this.V == null || this.Z) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                V12527742189361867087 v12527742189361867087 = (V12527742189361867087) arrayList.get(i);
                if (v12527742189361867087.i && v12527742189361867087 != this.V) {
                    y1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.V == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (S10823041268949770285.v((V12527742189361867087) arrayList.get(i2))) {
                    V12527742189361867087 v125277421893618670872 = (V12527742189361867087) arrayList.get(0);
                    v125277421893618670872.i = true;
                    this.V = v125277421893618670872;
                    if (this.v) {
                        X7175349259954592591 x7175349259954592591 = this.X;
                        if (x7175349259954592591 != null && x7175349259954592591.b()) {
                            ((K1865709164992808030) B11964701839924937722.o(this, Y238707362170117896.t)).getClass();
                            if (v125277421893618670872.b - this.a0 < 40) {
                                this.b0 = true;
                                return;
                            }
                            this.Y = true;
                            X7175349259954592591 x71753492599545925912 = this.X;
                            if (x71753492599545925912 != null) {
                                x71753492599545925912.c(null);
                            }
                            this.X = null;
                        }
                        this.Z = false;
                        q1(v125277421893618670872);
                        if (this.K != null) {
                            this.W = R7033599853981556291.E(V0(), null, null, new C5756303275221609163(this, null, (byte) 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.Z) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                V12527742189361867087 v125277421893618670873 = (V12527742189361867087) arrayList.get(i3);
                if (!v125277421893618670873.h || v125277421893618670873.d) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((V12527742189361867087) arrayList.get(i)).i = true;
                        i++;
                    }
                    return;
                }
            }
            V12527742189361867087 v125277421893618670874 = (V12527742189361867087) arrayList.get(0);
            v125277421893618670874.i = true;
            long j = v125277421893618670874.b;
            V12527742189361867087 v125277421893618670875 = this.V;
            v125277421893618670875.getClass();
            z1(j, v125277421893618670875);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            V12527742189361867087 v125277421893618670876 = (V12527742189361867087) arrayList.get(i4);
            if (v125277421893618670876.i || !v125277421893618670876.h || v125277421893618670876.d) {
                float fD = ((K1865709164992808030) B11964701839924937722.o(this, Y238707362170117896.t)).d();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    V12527742189361867087 v125277421893618670877 = (V12527742189361867087) arrayList.get(i5);
                    long j2 = v125277421893618670877.c;
                    V12527742189361867087 v125277421893618670878 = this.V;
                    v125277421893618670878.getClass();
                    boolean z = Math.abs(L2216691091636065972.c(L2216691091636065972.e(j2, v125277421893618670878.c))) > fD;
                    if (v125277421893618670877.i || z) {
                        y1(true);
                        return;
                    }
                }
                return;
            }
        }
        V12527742189361867087 v125277421893618670879 = (V12527742189361867087) arrayList.get(0);
        v125277421893618670879.i = true;
        long j3 = v125277421893618670879.b;
        V12527742189361867087 v1252774218936186708710 = this.V;
        v1252774218936186708710.getClass();
        z1(j3, v1252774218936186708710);
    }

    @Override // dev.epro.r0.B18307494358031290147
    public final void x0() {
        R12814464680100893999 r12814464680100893999;
        S9385204271696540760 s9385204271696540760 = this.q;
        if (s9385204271696540760 != null && (r12814464680100893999 = this.D) != null) {
            s9385204271696540760.c(new S6661593601236267363(r12814464680100893999));
        }
        this.D = null;
        y1(false);
    }

    public final void y1(boolean z) {
        if (z) {
            this.V = null;
            X7175349259954592591 x7175349259954592591 = this.W;
            if (x7175349259954592591 != null) {
                x7175349259954592591.c(null);
            }
            this.W = null;
            X7175349259954592591 x71753492599545925912 = this.X;
            if (x71753492599545925912 != null) {
                x71753492599545925912.c(null);
            }
            this.X = null;
            this.Y = false;
            this.Z = false;
            this.a0 = -1L;
            this.b0 = false;
        } else {
            this.O = null;
            X7175349259954592591 x71753492599545925913 = this.P;
            if (x71753492599545925913 != null) {
                x71753492599545925913.c(null);
            }
            this.P = null;
            X7175349259954592591 x71753492599545925914 = this.Q;
            if (x71753492599545925914 != null) {
                x71753492599545925914.c(null);
            }
            this.Q = null;
            this.R = false;
            this.S = false;
            this.T = -1L;
            this.U = false;
        }
        o1(z);
    }

    public final void z1(long j, V12527742189361867087 v12527742189361867087) {
        if (this.v && !this.b0) {
            p1(v12527742189361867087.c, true);
            this.a0 = j;
            if (!this.Z && !this.Y) {
                w1();
            }
        }
        this.V = null;
        this.b0 = false;
        this.Y = false;
        X7175349259954592591 x7175349259954592591 = this.W;
        if (x7175349259954592591 != null) {
            x7175349259954592591.c(null);
        }
        this.W = null;
        this.Z = false;
    }
}
