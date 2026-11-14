package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class U3171922415799673643 extends E10177778682618078576 {
    public N13196868278329319633 K;
    public V12527742189361867087 L;

    @Override // dev.epro.r0.T1688716394939190891
    public final void O() {
        y1(true);
    }

    @Override // dev.epro.r0.E10177778682618078576, dev.epro.r0.B18307494358031290147
    public final void n0(Y1086209215650239921 y1086209215650239921, J17191566391535857141 j17191566391535857141, long j) {
        super.n0(y1086209215650239921, j17191566391535857141, j);
        if (j17191566391535857141 != J17191566391535857141.b) {
            if (j17191566391535857141 == J17191566391535857141.c) {
                if (this.K != null) {
                    List list = y1086209215650239921.a;
                    int size = list.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        N13196868278329319633 n13196868278329319633 = (N13196868278329319633) list.get(i);
                        if (n13196868278329319633.c() && n13196868278329319633 != this.K) {
                            y1(false);
                            break;
                        }
                        i++;
                    }
                }
                if (S10823041268949770285.t(this.A, "recognized")) {
                    this.A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.K == null) {
            if (U2645994142831146282.f(y1086209215650239921, true, false)) {
                N13196868278329319633 n131968682783293196332 = (N13196868278329319633) y1086209215650239921.a.get(0);
                n131968682783293196332.a();
                this.K = n131968682783293196332;
                if (this.v) {
                    this.A = "waiting";
                    r1(n131968682783293196332);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = y1086209215650239921.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!I3887072968740112330.s((N13196868278329319633) list2.get(i2))) {
                long jN1 = n1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    N13196868278329319633 n131968682783293196333 = (N13196868278329319633) list2.get(i3);
                    if (n131968682783293196333.c() || I3887072968740112330.B(n131968682783293196333, j, jN1)) {
                        y1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((N13196868278329319633) list2.get(0)).a();
        if (this.v) {
            this.A = "recognized";
            N13196868278329319633 n131968682783293196334 = this.K;
            n131968682783293196334.getClass();
            p1(n131968682783293196334.c, false);
            w1();
        }
        this.K = null;
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
            if (j17191566391535857141 == J17191566391535857141.c) {
                if (this.L != null) {
                    int size = arrayList.size();
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        V12527742189361867087 v12527742189361867087 = (V12527742189361867087) arrayList.get(i);
                        if (v12527742189361867087.i && v12527742189361867087 != this.L) {
                            y1(true);
                            break;
                        }
                        i++;
                    }
                }
                if (S10823041268949770285.t(this.A, "recognized")) {
                    this.A = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.L == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (S10823041268949770285.v((V12527742189361867087) arrayList.get(i2))) {
                    V12527742189361867087 v125277421893618670872 = (V12527742189361867087) arrayList.get(0);
                    v125277421893618670872.i = true;
                    this.L = v125277421893618670872;
                    if (this.v) {
                        this.A = "waiting";
                        q1(v125277421893618670872);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            V12527742189361867087 v125277421893618670873 = (V12527742189361867087) arrayList.get(i3);
            if (v125277421893618670873.i || !v125277421893618670873.h || v125277421893618670873.d) {
                float fD = ((K1865709164992808030) B11964701839924937722.o(this, Y238707362170117896.t)).d();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    V12527742189361867087 v125277421893618670874 = (V12527742189361867087) arrayList.get(i4);
                    long j = v125277421893618670874.c;
                    V12527742189361867087 v125277421893618670875 = this.L;
                    v125277421893618670875.getClass();
                    boolean z = Math.abs(L2216691091636065972.c(L2216691091636065972.e(j, v125277421893618670875.c))) > fD;
                    if (v125277421893618670874.i || z) {
                        y1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((V12527742189361867087) arrayList.get(0)).i = true;
        if (this.v) {
            this.A = "recognized";
            V12527742189361867087 v125277421893618670876 = this.L;
            v125277421893618670876.getClass();
            p1(v125277421893618670876.c, true);
            w1();
        }
        this.L = null;
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
            this.L = null;
        } else {
            this.K = null;
        }
        o1(z);
        this.A = "idle";
    }
}
