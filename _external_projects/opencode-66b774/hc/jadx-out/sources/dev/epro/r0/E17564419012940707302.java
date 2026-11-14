package dev.epro.r0;

import ads_mobile_sdk.cu0;
import ads_mobile_sdk.ft3;
import ads_mobile_sdk.g;
import ads_mobile_sdk.hn2;
import ads_mobile_sdk.jb1;
import ads_mobile_sdk.nl0;
import ads_mobile_sdk.rb1;
import ads_mobile_sdk.tu;
import ads_mobile_sdk.wm1;
import ads_mobile_sdk.yi1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E17564419012940707302 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public E17564419012940707302(H17306840337920354701 h17306840337920354701) {
        this.a = (byte) 0;
        this.d = 0;
        S15638288480382345131.a("input", h17306840337920354701);
        this.e = h17306840337920354701;
        h17306840337920354701.c = this;
    }

    public static void A0(int i) throws N11355818201711573941 {
        if ((i & 7) != 0) {
            throw N11355818201711573941.d();
        }
    }

    public static void z0(int i) throws N11355818201711573941 {
        if ((i & 3) != 0) {
            throw N11355818201711573941.d();
        }
    }

    public void A(D11116981298317247998 d11116981298317247998) throws O941307146068593422 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        if ((this.b & 7) != 2) {
            throw A9458650138667563085.b();
        }
        do {
            ((H7410314698464292688) d11116981298317247998).add(y());
            if (f3160751278268780235.c()) {
                return;
            } else {
                iA = f3160751278268780235.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void B(List list) throws Q13606351353383574666 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        if ((this.b & 7) != 2) {
            throw F10620977331851870088.b();
        }
        do {
            list.add(x());
            if (x4929887216837100213.c()) {
                return;
            } else {
                iA = x4929887216837100213.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void C(A10696933611341011168 a10696933611341011168) throws N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof T8586479527660021265;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    a10696933611341011168.add(Double.valueOf(Double.longBitsToDouble(h17306840337920354701.h())));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int i3 = h17306840337920354701.i();
            A0(i3);
            int iC = h17306840337920354701.c() + i3;
            do {
                a10696933611341011168.add(Double.valueOf(Double.longBitsToDouble(h17306840337920354701.h())));
            } while (h17306840337920354701.c() < iC);
            return;
        }
        T8586479527660021265 t8586479527660021265 = (T8586479527660021265) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                t8586479527660021265.b(Double.longBitsToDouble(h17306840337920354701.h()));
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i4 != 2) {
            throw N11355818201711573941.b();
        }
        int i5 = h17306840337920354701.i();
        A0(i5);
        int iC2 = h17306840337920354701.c() + i5;
        do {
            t8586479527660021265.b(Double.longBitsToDouble(h17306840337920354701.h()));
        } while (h17306840337920354701.c() < iC2);
    }

    public void D(D11116981298317247998 d11116981298317247998) throws A9458650138667563085 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Double.valueOf(f3160751278268780235.m()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.B();
        if ((iB & 7) != 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int iB2 = f3160751278268780235.b() + iB;
        do {
            ((H7410314698464292688) d11116981298317247998).add(Double.valueOf(f3160751278268780235.m()));
        } while (f3160751278268780235.b() < iB2);
    }

    public void E(List list) throws F10620977331851870088 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(x4929887216837100213.m()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iK = x4929887216837100213.K();
        if ((iK & 7) != 0) {
            throw new F10620977331851870088("Failed to parse the message.");
        }
        int iB = x4929887216837100213.b() + iK;
        do {
            list.add(Double.valueOf(x4929887216837100213.m()));
        } while (x4929887216837100213.b() < iB);
    }

    public void F(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u9933786248742319541.b(h17306840337920354701.i());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(h17306840337920354701.i());
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void G(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.n()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.n()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void H(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.K()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.K()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    public Object I(T18086906245708496780 t18086906245708496780, Class cls, X8134396307090105871 x8134396307090105871) throws O941307146068593422, J12068242864160501074, F10620977331851870088 {
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = 0;
        switch (t18086906245708496780.ordinal()) {
            case 0:
                x0(1);
                return Double.valueOf(x4929887216837100213.m());
            case 1:
                x0(5);
                return Float.valueOf(x4929887216837100213.q());
            case 2:
                x0(0);
                return Long.valueOf(x4929887216837100213.L());
            case 3:
                x0(0);
                return Long.valueOf(x4929887216837100213.L());
            case 4:
                x0(0);
                return Integer.valueOf(x4929887216837100213.K());
            case 5:
                x0(1);
                return Long.valueOf(x4929887216837100213.J());
            case 6:
                x0(5);
                return Integer.valueOf(x4929887216837100213.I());
            case 7:
                x0(0);
                return Boolean.valueOf(x4929887216837100213.k());
            case 8:
                x0(2);
                byte[] bArrF = x4929887216837100213.d;
                int iK = x4929887216837100213.K();
                int i2 = x4929887216837100213.g;
                int i3 = x4929887216837100213.e;
                if (iK <= i3 - i2 && iK > 0) {
                    x4929887216837100213.g = i2 + iK;
                    i = i2;
                } else {
                    if (iK == 0) {
                        return "";
                    }
                    if (iK <= i3) {
                        x4929887216837100213.O(iK);
                        x4929887216837100213.g = iK;
                    } else {
                        bArrF = x4929887216837100213.F(iK);
                    }
                }
                return F2424644667972238580.a.k(i, bArrF, iK);
            case 9:
            default:
                S10973172697741180971.j("unsupported field type.");
                return null;
            case 10:
                x0(2);
                N10092264544134359582 n10092264544134359582A = X1177226880161088161.c.a(cls);
                K17275736824900228431 k17275736824900228431D = n10092264544134359582A.d();
                r(k17275736824900228431D, n10092264544134359582A, x8134396307090105871);
                n10092264544134359582A.b(k17275736824900228431D);
                return k17275736824900228431D;
            case 11:
                return x();
            case 12:
                x0(0);
                return Integer.valueOf(x4929887216837100213.K());
            case 13:
                x0(0);
                return Integer.valueOf(x4929887216837100213.K());
            case 14:
                x0(5);
                return Integer.valueOf(x4929887216837100213.I());
            case 15:
                x0(1);
                return Long.valueOf(x4929887216837100213.J());
            case 16:
                x0(0);
                return Integer.valueOf(x4929887216837100213.w());
            case 17:
                x0(0);
                return Long.valueOf(x4929887216837100213.x());
        }
    }

    public Object J(V14641450762532118893 v14641450762532118893, Class cls, R12171924199823312678 r12171924199823312678) throws A9458650138667563085, J12068242864160501074, Q13606351353383574666 {
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        switch (v14641450762532118893.ordinal()) {
            case 0:
                x0(1);
                return Double.valueOf(f3160751278268780235.m());
            case 1:
                x0(5);
                return Float.valueOf(f3160751278268780235.q());
            case 2:
                x0(0);
                return Long.valueOf(f3160751278268780235.s());
            case 3:
                x0(0);
                return Long.valueOf(f3160751278268780235.C());
            case 4:
                x0(0);
                return Integer.valueOf(f3160751278268780235.r());
            case 5:
                x0(1);
                return Long.valueOf(f3160751278268780235.p());
            case 6:
                x0(5);
                return Integer.valueOf(f3160751278268780235.o());
            case 7:
                x0(0);
                return Boolean.valueOf(f3160751278268780235.k());
            case 8:
                x0(2);
                return f3160751278268780235.z();
            case 9:
            default:
                S10973172697741180971.j("unsupported field type.");
                return null;
            case 10:
                x0(2);
                B8838962141159673445 b8838962141159673445A = X8293765978123339002.c.a(cls);
                T3817383632789307090 t3817383632789307090D = b8838962141159673445A.d();
                s(t3817383632789307090D, b8838962141159673445A, r12171924199823312678);
                b8838962141159673445A.b(t3817383632789307090D);
                return t3817383632789307090D;
            case 11:
                return y();
            case 12:
                x0(0);
                return Integer.valueOf(f3160751278268780235.B());
            case 13:
                x0(0);
                return Integer.valueOf(f3160751278268780235.n());
            case 14:
                x0(5);
                return Integer.valueOf(f3160751278268780235.u());
            case 15:
                x0(1);
                return Long.valueOf(f3160751278268780235.v());
            case 16:
                x0(0);
                return Integer.valueOf(f3160751278268780235.w());
            case 17:
                x0(0);
                return Long.valueOf(f3160751278268780235.x());
        }
    }

    public void K(A10696933611341011168 a10696933611341011168) throws N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = h17306840337920354701.i();
                z0(i3);
                int iC = h17306840337920354701.c() + i3;
                do {
                    a10696933611341011168.add(Integer.valueOf(h17306840337920354701.g()));
                } while (h17306840337920354701.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw N11355818201711573941.b();
            }
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.g()));
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL = h17306840337920354701.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = h17306840337920354701.i();
            z0(i5);
            int iC2 = h17306840337920354701.c() + i5;
            do {
                u9933786248742319541.b(h17306840337920354701.g());
            } while (h17306840337920354701.c() < iC2);
            return;
        }
        if (i4 != 5) {
            throw N11355818201711573941.b();
        }
        do {
            u9933786248742319541.b(h17306840337920354701.g());
            if (h17306840337920354701.d()) {
                return;
            } else {
                iL2 = h17306840337920354701.l();
            }
        } while (iL2 == this.b);
        this.d = iL2;
    }

    public void L(D11116981298317247998 d11116981298317247998) throws A9458650138667563085 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iB = f3160751278268780235.B();
            if ((iB & 3) != 0) {
                throw new A9458650138667563085("Failed to parse the message.");
            }
            int iB2 = f3160751278268780235.b() + iB;
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.o()));
            } while (f3160751278268780235.b() < iB2);
            return;
        }
        if (i != 5) {
            throw A9458650138667563085.b();
        }
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.o()));
            if (f3160751278268780235.c()) {
                return;
            } else {
                iA = f3160751278268780235.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void M(List list) throws F10620977331851870088 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iK = x4929887216837100213.K();
            if ((iK & 3) != 0) {
                throw new F10620977331851870088("Failed to parse the message.");
            }
            int iB = x4929887216837100213.b() + iK;
            do {
                list.add(Integer.valueOf(x4929887216837100213.I()));
            } while (x4929887216837100213.b() < iB);
            return;
        }
        if (i != 5) {
            throw F10620977331851870088.b();
        }
        do {
            list.add(Integer.valueOf(x4929887216837100213.I()));
            if (x4929887216837100213.c()) {
                return;
            } else {
                iA = x4929887216837100213.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void N(A10696933611341011168 a10696933611341011168) throws N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof K908934630684087819;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    a10696933611341011168.add(Long.valueOf(h17306840337920354701.h()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int i3 = h17306840337920354701.i();
            A0(i3);
            int iC = h17306840337920354701.c() + i3;
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.h()));
            } while (h17306840337920354701.c() < iC);
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                k908934630684087819.b(h17306840337920354701.h());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i4 != 2) {
            throw N11355818201711573941.b();
        }
        int i5 = h17306840337920354701.i();
        A0(i5);
        int iC2 = h17306840337920354701.c() + i5;
        do {
            k908934630684087819.b(h17306840337920354701.h());
        } while (h17306840337920354701.c() < iC2);
    }

    public void O(D11116981298317247998 d11116981298317247998) throws A9458650138667563085 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.p()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.B();
        if ((iB & 7) != 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int iB2 = f3160751278268780235.b() + iB;
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.p()));
        } while (f3160751278268780235.b() < iB2);
    }

    public void P(List list) throws F10620977331851870088 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(x4929887216837100213.J()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iK = x4929887216837100213.K();
        if ((iK & 7) != 0) {
            throw new F10620977331851870088("Failed to parse the message.");
        }
        int iB = x4929887216837100213.b() + iK;
        do {
            list.add(Long.valueOf(x4929887216837100213.J()));
        } while (x4929887216837100213.b() < iB);
    }

    public void Q(A10696933611341011168 a10696933611341011168) throws N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof Q17312955529835048400;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = h17306840337920354701.i();
                z0(i3);
                int iC = h17306840337920354701.c() + i3;
                do {
                    a10696933611341011168.add(Float.valueOf(Float.intBitsToFloat(h17306840337920354701.g())));
                } while (h17306840337920354701.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw N11355818201711573941.b();
            }
            do {
                a10696933611341011168.add(Float.valueOf(Float.intBitsToFloat(h17306840337920354701.g())));
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL = h17306840337920354701.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        Q17312955529835048400 q17312955529835048400 = (Q17312955529835048400) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = h17306840337920354701.i();
            z0(i5);
            int iC2 = h17306840337920354701.c() + i5;
            do {
                q17312955529835048400.b(Float.intBitsToFloat(h17306840337920354701.g()));
            } while (h17306840337920354701.c() < iC2);
            return;
        }
        if (i4 != 5) {
            throw N11355818201711573941.b();
        }
        do {
            q17312955529835048400.b(Float.intBitsToFloat(h17306840337920354701.g()));
            if (h17306840337920354701.d()) {
                return;
            } else {
                iL2 = h17306840337920354701.l();
            }
        } while (iL2 == this.b);
        this.d = iL2;
    }

    public void R(D11116981298317247998 d11116981298317247998) throws A9458650138667563085 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iB = f3160751278268780235.B();
            if ((iB & 3) != 0) {
                throw new A9458650138667563085("Failed to parse the message.");
            }
            int iB2 = f3160751278268780235.b() + iB;
            do {
                ((H7410314698464292688) d11116981298317247998).add(Float.valueOf(f3160751278268780235.q()));
            } while (f3160751278268780235.b() < iB2);
            return;
        }
        if (i != 5) {
            throw A9458650138667563085.b();
        }
        do {
            ((H7410314698464292688) d11116981298317247998).add(Float.valueOf(f3160751278268780235.q()));
            if (f3160751278268780235.c()) {
                return;
            } else {
                iA = f3160751278268780235.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void S(List list) throws F10620977331851870088 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iK = x4929887216837100213.K();
            if ((iK & 3) != 0) {
                throw new F10620977331851870088("Failed to parse the message.");
            }
            int iB = x4929887216837100213.b() + iK;
            do {
                list.add(Float.valueOf(x4929887216837100213.q()));
            } while (x4929887216837100213.b() < iB);
            return;
        }
        if (i != 5) {
            throw F10620977331851870088.b();
        }
        do {
            list.add(Float.valueOf(x4929887216837100213.q()));
            if (x4929887216837100213.c()) {
                return;
            } else {
                iA = x4929887216837100213.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void T(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u9933786248742319541.b(h17306840337920354701.i());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(h17306840337920354701.i());
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void U(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.r()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.r()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void V(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.K()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.K()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    public void W(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof K908934630684087819;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Long.valueOf(h17306840337920354701.j()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.j()));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                k908934630684087819.b(h17306840337920354701.j());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            k908934630684087819.b(h17306840337920354701.j());
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void X(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.s()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.s()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void Y(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(x4929887216837100213.L()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Long.valueOf(x4929887216837100213.L()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    public void Z(A10696933611341011168 a10696933611341011168) throws N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = h17306840337920354701.i();
                z0(i3);
                int iC = h17306840337920354701.c() + i3;
                do {
                    a10696933611341011168.add(Integer.valueOf(h17306840337920354701.g()));
                } while (h17306840337920354701.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw N11355818201711573941.b();
            }
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.g()));
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL = h17306840337920354701.l();
                }
            } while (iL == this.b);
            this.d = iL;
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = h17306840337920354701.i();
            z0(i5);
            int iC2 = h17306840337920354701.c() + i5;
            do {
                u9933786248742319541.b(h17306840337920354701.g());
            } while (h17306840337920354701.c() < iC2);
            return;
        }
        if (i4 != 5) {
            throw N11355818201711573941.b();
        }
        do {
            u9933786248742319541.b(h17306840337920354701.g());
            if (h17306840337920354701.d()) {
                return;
            } else {
                iL2 = h17306840337920354701.l();
            }
        } while (iL2 == this.b);
        this.d = iL2;
    }

    public Object a(ft3 ft3Var, Class cls, nl0 nl0Var) throws yi1 {
        tu tuVar = (tu) this.e;
        switch (ft3Var.ordinal()) {
            case 0:
                b(1);
                return Double.valueOf(tuVar.f());
            case 1:
                b(5);
                return Float.valueOf(tuVar.j());
            case 2:
                b(0);
                return Long.valueOf(tuVar.l());
            case 3:
                b(0);
                return Long.valueOf(tuVar.v());
            case 4:
                b(0);
                return Integer.valueOf(tuVar.k());
            case 5:
                b(1);
                return Long.valueOf(tuVar.i());
            case 6:
                b(5);
                return Integer.valueOf(tuVar.h());
            case 7:
                b(0);
                return Boolean.valueOf(tuVar.d());
            case 8:
                b(2);
                return tuVar.s();
            case 9:
            default:
                S10973172697741180971.j("unsupported field type.");
                return null;
            case 10:
                b(2);
                G18207276409179303092 g18207276409179303092A = hn2.c.a(cls);
                cu0 cu0VarA = g18207276409179303092A.a();
                b(cu0VarA, g18207276409179303092A, nl0Var);
                g18207276409179303092A.c(cu0VarA);
                return cu0VarA;
            case 11:
                b(2);
                return tuVar.e();
            case 12:
                b(0);
                return Integer.valueOf(tuVar.u());
            case 13:
                b(0);
                return Integer.valueOf(tuVar.g());
            case 14:
                b(5);
                return Integer.valueOf(tuVar.n());
            case 15:
                b(1);
                return Long.valueOf(tuVar.o());
            case 16:
                b(0);
                return Integer.valueOf(tuVar.p());
            case 17:
                b(0);
                return Long.valueOf(tuVar.q());
        }
    }

    public void a0(D11116981298317247998 d11116981298317247998) throws A9458650138667563085 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iB = f3160751278268780235.B();
            if ((iB & 3) != 0) {
                throw new A9458650138667563085("Failed to parse the message.");
            }
            int iB2 = f3160751278268780235.b() + iB;
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.u()));
            } while (f3160751278268780235.b() < iB2);
            return;
        }
        if (i != 5) {
            throw A9458650138667563085.b();
        }
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.u()));
            if (f3160751278268780235.c()) {
                return;
            } else {
                iA = f3160751278268780235.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void b(g gVar, G18207276409179303092 g18207276409179303092, nl0 nl0Var) throws yi1 {
        tu tuVar = (tu) this.e;
        int iM = tuVar.m();
        if (tuVar.a + tuVar.b >= 100) {
            Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iD = tuVar.d(iM);
        tuVar.a++;
        g18207276409179303092.a(gVar, this, nl0Var);
        tuVar.a(0);
        tuVar.a--;
        if (tuVar.a() == 0) {
            tuVar.c(iD);
        } else {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public void b0(List list) throws F10620977331851870088 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iK = x4929887216837100213.K();
            if ((iK & 3) != 0) {
                throw new F10620977331851870088("Failed to parse the message.");
            }
            int iB = x4929887216837100213.b() + iK;
            do {
                list.add(Integer.valueOf(x4929887216837100213.I()));
            } while (x4929887216837100213.b() < iB);
            return;
        }
        if (i != 5) {
            throw F10620977331851870088.b();
        }
        do {
            list.add(Integer.valueOf(x4929887216837100213.I()));
            if (x4929887216837100213.c()) {
                return;
            } else {
                iA = x4929887216837100213.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void c(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        tu tuVar = (tu) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                o6641393078261985068.add(Double.valueOf(tuVar.f()));
                if (tuVar.c()) {
                    return;
                } else {
                    iT = tuVar.t();
                }
            } while (iT == this.b);
            this.d = iT;
            return;
        }
        if (i != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iU = tuVar.u();
        d(iU);
        int iB = tuVar.b() + iU;
        do {
            o6641393078261985068.add(Double.valueOf(tuVar.f()));
        } while (tuVar.b() < iB);
    }

    public void c0(A10696933611341011168 a10696933611341011168) throws N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof K908934630684087819;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    a10696933611341011168.add(Long.valueOf(h17306840337920354701.h()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int i3 = h17306840337920354701.i();
            A0(i3);
            int iC = h17306840337920354701.c() + i3;
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.h()));
            } while (h17306840337920354701.c() < iC);
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 1) {
            do {
                k908934630684087819.b(h17306840337920354701.h());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i4 != 2) {
            throw N11355818201711573941.b();
        }
        int i5 = h17306840337920354701.i();
        A0(i5);
        int iC2 = h17306840337920354701.c() + i5;
        do {
            k908934630684087819.b(h17306840337920354701.h());
        } while (h17306840337920354701.c() < iC2);
    }

    public void d(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.g()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.g()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                jb1Var.b(tuVar.g());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iB2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.g());
        } while (tuVar.b() < iB2);
        a(iB2);
    }

    public void d0(D11116981298317247998 d11116981298317247998) throws A9458650138667563085 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.v()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.B();
        if ((iB & 7) != 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int iB2 = f3160751278268780235.b() + iB;
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.v()));
        } while (f3160751278268780235.b() < iB2);
    }

    public void e(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iU = tuVar.u();
                c(iU);
                int iB = tuVar.b() + iU;
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.h()));
                } while (tuVar.b() < iB);
                return;
            }
            if (i2 != 5) {
                Z3383101362411723454.v();
                return;
            }
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.h()));
                if (tuVar.c()) {
                    return;
                } else {
                    iT = tuVar.t();
                }
            } while (iT == this.b);
            this.d = iT;
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 2) {
            int iU2 = tuVar.u();
            c(iU2);
            int iB2 = tuVar.b() + iU2;
            do {
                jb1Var.b(tuVar.h());
            } while (tuVar.b() < iB2);
            return;
        }
        if (i3 != 5) {
            Z3383101362411723454.v();
            return;
        }
        do {
            jb1Var.b(tuVar.h());
            if (tuVar.c()) {
                return;
            } else {
                iT2 = tuVar.t();
            }
        } while (iT2 == this.b);
        this.d = iT2;
    }

    public void e0(List list) throws F10620977331851870088 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(x4929887216837100213.J()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iK = x4929887216837100213.K();
        if ((iK & 7) != 0) {
            throw new F10620977331851870088("Failed to parse the message.");
        }
        int iB = x4929887216837100213.b() + iK;
        do {
            list.add(Long.valueOf(x4929887216837100213.J()));
        } while (x4929887216837100213.b() < iB);
    }

    public void f(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    o6641393078261985068.add(Long.valueOf(tuVar.i()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iU = tuVar.u();
            d(iU);
            int iB = tuVar.b() + iU;
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.i()));
            } while (tuVar.b() < iB);
            return;
        }
        wm1 wm1Var = (wm1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                wm1Var.a(tuVar.i());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iU2 = tuVar.u();
        d(iU2);
        int iB2 = tuVar.b() + iU2;
        do {
            wm1Var.a(tuVar.i());
        } while (tuVar.b() < iB2);
    }

    public void f0(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Integer.valueOf(H17306840337920354701.a(h17306840337920354701.i())));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(H17306840337920354701.a(h17306840337920354701.i())));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u9933786248742319541.b(H17306840337920354701.a(h17306840337920354701.i()));
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(H17306840337920354701.a(h17306840337920354701.i()));
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void g(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        tu tuVar = (tu) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iU = tuVar.u();
            c(iU);
            int iB = tuVar.b() + iU;
            do {
                o6641393078261985068.add(Float.valueOf(tuVar.j()));
            } while (tuVar.b() < iB);
            return;
        }
        if (i != 5) {
            Z3383101362411723454.v();
            return;
        }
        do {
            o6641393078261985068.add(Float.valueOf(tuVar.j()));
            if (tuVar.c()) {
                return;
            } else {
                iT = tuVar.t();
            }
        } while (iT == this.b);
        this.d = iT;
    }

    public void g0(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.w()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.w()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void h(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.k()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.k()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                jb1Var.b(tuVar.k());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iB2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.k());
        } while (tuVar.b() < iB2);
        a(iB2);
    }

    public void h0(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.w()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.w()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    public void i(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    o6641393078261985068.add(Long.valueOf(tuVar.l()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.l()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        wm1 wm1Var = (wm1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wm1Var.a(tuVar.l());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iB2 = tuVar.b() + tuVar.u();
        do {
            wm1Var.a(tuVar.l());
        } while (tuVar.b() < iB2);
        a(iB2);
    }

    public void i0(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof K908934630684087819;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Long.valueOf(H17306840337920354701.b(h17306840337920354701.j())));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Long.valueOf(H17306840337920354701.b(h17306840337920354701.j())));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                k908934630684087819.b(H17306840337920354701.b(h17306840337920354701.j()));
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            k908934630684087819.b(H17306840337920354701.b(h17306840337920354701.j()));
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void j(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iU = tuVar.u();
                c(iU);
                int iB = tuVar.b() + iU;
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.n()));
                } while (tuVar.b() < iB);
                return;
            }
            if (i2 != 5) {
                Z3383101362411723454.v();
                return;
            }
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.n()));
                if (tuVar.c()) {
                    return;
                } else {
                    iT = tuVar.t();
                }
            } while (iT == this.b);
            this.d = iT;
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 2) {
            int iU2 = tuVar.u();
            c(iU2);
            int iB2 = tuVar.b() + iU2;
            do {
                jb1Var.b(tuVar.n());
            } while (tuVar.b() < iB2);
            return;
        }
        if (i3 != 5) {
            Z3383101362411723454.v();
            return;
        }
        do {
            jb1Var.b(tuVar.n());
            if (tuVar.c()) {
                return;
            } else {
                iT2 = tuVar.t();
            }
        } while (iT2 == this.b);
        this.d = iT2;
    }

    public void j0(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.x()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.x()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void k(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    o6641393078261985068.add(Long.valueOf(tuVar.o()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iU = tuVar.u();
            d(iU);
            int iB = tuVar.b() + iU;
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.o()));
            } while (tuVar.b() < iB);
            return;
        }
        wm1 wm1Var = (wm1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                wm1Var.a(tuVar.o());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iU2 = tuVar.u();
        d(iU2);
        int iB2 = tuVar.b() + iU2;
        do {
            wm1Var.a(tuVar.o());
        } while (tuVar.b() < iB2);
    }

    public void k0(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(x4929887216837100213.x()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Long.valueOf(x4929887216837100213.x()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    public void l(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.p()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.p()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                jb1Var.b(tuVar.p());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iB2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.p());
        } while (tuVar.b() < iB2);
        a(iB2);
    }

    public String l0() throws O941307146068593422, Q13606351353383574666, N11355818201711573941 {
        x0(2);
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        int i = h17306840337920354701.i();
        if (i > 0) {
            int i2 = h17306840337920354701.e;
            int i3 = h17306840337920354701.g;
            if (i <= i2 - i3) {
                String str = new String(h17306840337920354701.d, i3, i, S15638288480382345131.a);
                h17306840337920354701.g += i;
                return str;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i < 0) {
            throw N11355818201711573941.c();
        }
        throw N11355818201711573941.e();
    }

    public void m(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    o6641393078261985068.add(Long.valueOf(tuVar.q()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.q()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        wm1 wm1Var = (wm1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wm1Var.a(tuVar.q());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iB2 = tuVar.b() + tuVar.u();
        do {
            wm1Var.a(tuVar.q());
        } while (tuVar.b() < iB2);
        a(iB2);
    }

    public void m0(A10696933611341011168 a10696933611341011168, boolean z) throws J12068242864160501074 {
        int iL;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        if ((this.b & 7) != 2) {
            throw N11355818201711573941.b();
        }
        do {
            a10696933611341011168.add(z ? p0() : l0());
            if (h17306840337920354701.d()) {
                return;
            } else {
                iL = h17306840337920354701.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public void n(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.u()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.u()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                jb1Var.b(tuVar.u());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iB2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.u());
        } while (tuVar.b() < iB2);
        a(iB2);
    }

    public void n0(D11116981298317247998 d11116981298317247998, boolean z) throws O941307146068593422, J12068242864160501074, Q13606351353383574666 {
        String strY;
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        if ((this.b & 7) != 2) {
            throw A9458650138667563085.b();
        }
        do {
            if (z) {
                x0(2);
                strY = f3160751278268780235.z();
            } else {
                x0(2);
                strY = f3160751278268780235.y();
            }
            ((H7410314698464292688) d11116981298317247998).add(strY);
            if (f3160751278268780235.c()) {
                return;
            } else {
                iA = f3160751278268780235.A();
            }
        } while (iA == this.b);
        this.d = iA;
    }

    public void o(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        int iT2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof wm1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    o6641393078261985068.add(Long.valueOf(tuVar.v()));
                    if (tuVar.c()) {
                        return;
                    } else {
                        iT = tuVar.t();
                    }
                } while (iT == this.b);
                this.d = iT;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.v()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        wm1 wm1Var = (wm1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                wm1Var.a(tuVar.v());
                if (tuVar.c()) {
                    return;
                } else {
                    iT2 = tuVar.t();
                }
            } while (iT2 == this.b);
            this.d = iT2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int iB2 = tuVar.b() + tuVar.u();
        do {
            wm1Var.a(tuVar.v());
        } while (tuVar.b() < iB2);
        a(iB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o0(java.util.List r9, boolean r10) throws dev.epro.r0.O941307146068593422, dev.epro.r0.J12068242864160501074, dev.epro.r0.Q13606351353383574666 {
        /*
            r8 = this;
            java.lang.Object r0 = r8.e
            dev.epro.r0.X4929887216837100213 r0 = (dev.epro.r0.X4929887216837100213) r0
            int r1 = r8.b
            r1 = r1 & 7
            r2 = 2
            if (r1 != r2) goto Lb9
            boolean r1 = r9 instanceof dev.epro.r0.M9021326446326000287
            if (r1 == 0) goto L2e
            if (r10 != 0) goto L2e
            r1 = r9
            dev.epro.r0.M9021326446326000287 r1 = (dev.epro.r0.M9021326446326000287) r1
        L14:
            dev.epro.r0.B15200565448991586841 r9 = r8.x()
            r1.e(r9)
            boolean r9 = r0.c()
            if (r9 == 0) goto L23
            goto Lad
        L23:
            int r9 = r0.A()
            int r10 = r8.b
            if (r9 == r10) goto L14
            r8.d = r9
            return
        L2e:
            java.lang.String r1 = ""
            if (r10 == 0) goto L61
            r8.x0(r2)
            byte[] r3 = r0.d
            int r4 = r0.K()
            int r5 = r0.g
            int r6 = r0.e
            int r7 = r6 - r5
            if (r4 > r7) goto L4a
            if (r4 <= 0) goto L4a
            int r1 = r5 + r4
            r0.g = r1
            goto L5a
        L4a:
            if (r4 != 0) goto L4d
            goto La4
        L4d:
            r5 = 0
            if (r4 > r6) goto L56
            r0.O(r4)
            r0.g = r4
            goto L5a
        L56:
            byte[] r3 = r0.F(r4)
        L5a:
            dev.epro.r0.E2166724654553415323 r1 = dev.epro.r0.F2424644667972238580.a
            java.lang.String r1 = r1.k(r5, r3, r4)
            goto La4
        L61:
            r8.x0(r2)
            byte[] r3 = r0.d
            int r4 = r0.K()
            if (r4 <= 0) goto L80
            int r5 = r0.e
            int r6 = r0.g
            int r5 = r5 - r6
            if (r4 > r5) goto L80
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r5 = dev.epro.r0.X10245771154555039797.a
            r1.<init>(r3, r6, r4, r5)
            int r3 = r0.g
            int r3 = r3 + r4
            r0.g = r3
            goto La4
        L80:
            if (r4 != 0) goto L83
            goto La4
        L83:
            int r1 = r0.e
            if (r4 > r1) goto L99
            r0.O(r4)
            java.lang.String r1 = new java.lang.String
            int r5 = r0.g
            java.nio.charset.Charset r6 = dev.epro.r0.X10245771154555039797.a
            r1.<init>(r3, r5, r4, r6)
            int r3 = r0.g
            int r3 = r3 + r4
            r0.g = r3
            goto La4
        L99:
            java.lang.String r1 = new java.lang.String
            byte[] r3 = r0.F(r4)
            java.nio.charset.Charset r4 = dev.epro.r0.X10245771154555039797.a
            r1.<init>(r3, r4)
        La4:
            r9.add(r1)
            boolean r1 = r0.c()
            if (r1 == 0) goto Lae
        Lad:
            return
        Lae:
            int r1 = r0.A()
            int r3 = r8.b
            if (r1 == r3) goto L2e
            r8.d = r1
            return
        Lb9:
            dev.epro.r0.Q13606351353383574666 r8 = dev.epro.r0.F10620977331851870088.b()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17564419012940707302.o0(java.util.List, boolean):void");
    }

    public void p(Object obj, B8838962141159673445 b8838962141159673445, R12171924199823312678 r12171924199823312678) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            b8838962141159673445.e(obj, this, r12171924199823312678);
            if (this.b == this.c) {
            } else {
                throw new A9458650138667563085("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public String p0() throws O941307146068593422, Q13606351353383574666, N11355818201711573941 {
        x0(2);
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        int i = h17306840337920354701.i();
        if (i > 0) {
            int i2 = h17306840337920354701.e;
            int i3 = h17306840337920354701.g;
            if (i <= i2 - i3) {
                String strH = V3851199863415612823.a.h(i3, h17306840337920354701.d, i);
                h17306840337920354701.g += i;
                return strH;
            }
        }
        if (i == 0) {
            return "";
        }
        if (i <= 0) {
            throw N11355818201711573941.c();
        }
        throw N11355818201711573941.e();
    }

    public void q(Object obj, Y3341182438442346389 y3341182438442346389, R4931231174251890987 r4931231174251890987) throws N11355818201711573941 {
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        int i = h17306840337920354701.i();
        if (h17306840337920354701.a + 0 >= h17306840337920354701.b) {
            throw new N11355818201711573941("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = h17306840337920354701.e(i);
        h17306840337920354701.a++;
        y3341182438442346389.g(obj, this, r4931231174251890987);
        if (h17306840337920354701.i != 0) {
            throw new N11355818201711573941("Protocol message end-group tag did not match expected tag.");
        }
        h17306840337920354701.a--;
        h17306840337920354701.j = iE;
        h17306840337920354701.m();
    }

    public void q0(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                u9933786248742319541.b(h17306840337920354701.i());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(h17306840337920354701.i());
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void r(Object obj, N10092264544134359582 n10092264544134359582, X8134396307090105871 x8134396307090105871) throws F10620977331851870088 {
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int iK = x4929887216837100213.K();
        if (x4929887216837100213.a >= 100) {
            throw new F10620977331851870088("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iJ = x4929887216837100213.j(iK);
        x4929887216837100213.a++;
        n10092264544134359582.g(obj, this, x8134396307090105871);
        x4929887216837100213.a(0);
        x4929887216837100213.a--;
        x4929887216837100213.i(iJ);
    }

    public void r0(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.B()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.B()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void s(Object obj, B8838962141159673445 b8838962141159673445, R12171924199823312678 r12171924199823312678) throws A9458650138667563085 {
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int iB = f3160751278268780235.B();
        if (f3160751278268780235.a >= 100) {
            throw new A9458650138667563085("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = f3160751278268780235.j(iB);
        f3160751278268780235.a++;
        b8838962141159673445.e(obj, this, r12171924199823312678);
        f3160751278268780235.a(0);
        f3160751278268780235.a--;
        f3160751278268780235.i(iJ);
    }

    public void s0(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.K()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.K()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    public void t(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof N2953453778378988595;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Boolean.valueOf(h17306840337920354701.f()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Boolean.valueOf(h17306840337920354701.f()));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        N2953453778378988595 n2953453778378988595 = (N2953453778378988595) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                n2953453778378988595.b(h17306840337920354701.f());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            n2953453778378988595.b(h17306840337920354701.f());
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void t0(A10696933611341011168 a10696933611341011168) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iL;
        int iL2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof K908934630684087819;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    a10696933611341011168.add(Long.valueOf(h17306840337920354701.j()));
                    if (h17306840337920354701.d()) {
                        return;
                    } else {
                        iL = h17306840337920354701.l();
                    }
                } while (iL == this.b);
                this.d = iL;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int iC = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.j()));
            } while (h17306840337920354701.c() < iC);
            w0(iC);
            return;
        }
        K908934630684087819 k908934630684087819 = (K908934630684087819) a10696933611341011168;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                k908934630684087819.b(h17306840337920354701.j());
                if (h17306840337920354701.d()) {
                    return;
                } else {
                    iL2 = h17306840337920354701.l();
                }
            } while (iL2 == this.b);
            this.d = iL2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int iC2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            k908934630684087819.b(h17306840337920354701.j());
        } while (h17306840337920354701.c() < iC2);
        w0(iC2);
    }

    public void u(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Boolean.valueOf(f3160751278268780235.k()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Boolean.valueOf(f3160751278268780235.k()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void u0(D11116981298317247998 d11116981298317247998) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.C()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    iA = f3160751278268780235.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int iB = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.C()));
        } while (f3160751278268780235.b() < iB);
        w0(iB);
    }

    public void v(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(x4929887216837100213.k()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Boolean.valueOf(x4929887216837100213.k()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    public void v0(List list) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        int iA;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(x4929887216837100213.L()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    iA = x4929887216837100213.A();
                }
            } while (iA == this.b);
            this.d = iA;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int iB = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Long.valueOf(x4929887216837100213.L()));
        } while (x4929887216837100213.b() < iB);
        w0(iB);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dev.epro.r0.M18082356575916498704 w() throws dev.epro.r0.O941307146068593422, dev.epro.r0.Q13606351353383574666, dev.epro.r0.N11355818201711573941 {
        /*
            r4 = this;
            r0 = 2
            r4.x0(r0)
            java.lang.Object r4 = r4.e
            dev.epro.r0.H17306840337920354701 r4 = (dev.epro.r0.H17306840337920354701) r4
            byte[] r0 = r4.d
            int r1 = r4.i()
            if (r1 <= 0) goto L21
            int r2 = r4.e
            int r3 = r4.g
            int r2 = r2 - r3
            if (r1 > r2) goto L21
            dev.epro.r0.M18082356575916498704 r0 = dev.epro.r0.N17666688112968464504.i(r3, r0, r1)
            int r2 = r4.g
            int r2 = r2 + r1
            r4.g = r2
            return r0
        L21:
            if (r1 != 0) goto L26
            dev.epro.r0.M18082356575916498704 r4 = dev.epro.r0.N17666688112968464504.b
            return r4
        L26:
            if (r1 <= 0) goto L37
            int r2 = r4.e
            int r3 = r4.g
            int r2 = r2 - r3
            if (r1 > r2) goto L37
            int r1 = r1 + r3
            r4.g = r1
            byte[] r4 = java.util.Arrays.copyOfRange(r0, r3, r1)
            goto L3d
        L37:
            if (r1 > 0) goto L4a
            if (r1 != 0) goto L45
            byte[] r4 = dev.epro.r0.S15638288480382345131.b
        L3d:
            dev.epro.r0.M18082356575916498704 r0 = dev.epro.r0.N17666688112968464504.b
            dev.epro.r0.M18082356575916498704 r0 = new dev.epro.r0.M18082356575916498704
            r0.<init>(r4)
            return r0
        L45:
            dev.epro.r0.N11355818201711573941 r4 = dev.epro.r0.N11355818201711573941.c()
            throw r4
        L4a:
            dev.epro.r0.N11355818201711573941 r4 = dev.epro.r0.N11355818201711573941.e()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17564419012940707302.w():dev.epro.r0.M18082356575916498704");
    }

    public void w0(int i) throws A9458650138667563085, F10620977331851870088, N11355818201711573941 {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (((H17306840337920354701) obj).c() != i) {
                    throw N11355818201711573941.e();
                }
                return;
            case 1:
            default:
                if (((F3160751278268780235) obj).b() != i) {
                    throw A9458650138667563085.e();
                }
                return;
            case 2:
                if (((X4929887216837100213) obj).b() != i) {
                    throw F10620977331851870088.e();
                }
                return;
        }
    }

    public B15200565448991586841 x() throws O941307146068593422, J12068242864160501074, Q13606351353383574666 {
        x0(2);
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        byte[] bArr = x4929887216837100213.d;
        int iK = x4929887216837100213.K();
        int i = x4929887216837100213.e;
        int i2 = x4929887216837100213.g;
        if (iK <= i - i2 && iK > 0) {
            B15200565448991586841 b15200565448991586841I = B15200565448991586841.i(i2, bArr, iK);
            x4929887216837100213.g += iK;
            return b15200565448991586841I;
        }
        if (iK == 0) {
            return B15200565448991586841.c;
        }
        byte[] bArrG = x4929887216837100213.G(iK);
        if (bArrG != null) {
            return B15200565448991586841.i(0, bArrG, bArrG.length);
        }
        int i3 = x4929887216837100213.g;
        int i4 = x4929887216837100213.e;
        int length = i4 - i3;
        x4929887216837100213.i += i4;
        x4929887216837100213.g = 0;
        x4929887216837100213.e = 0;
        ArrayList arrayListH = x4929887216837100213.H(iK - length);
        byte[] bArr2 = new byte[iK];
        System.arraycopy(bArr, i3, bArr2, 0, length);
        int size = arrayListH.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayListH.get(i5);
            i5++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        B15200565448991586841 b15200565448991586841 = B15200565448991586841.c;
        return new B15200565448991586841(bArr2);
    }

    public void x0(int i) throws O941307146068593422, J12068242864160501074, Q13606351353383574666 {
        switch (this.a) {
            case 0:
                if ((this.b & 7) != i) {
                    throw N11355818201711573941.b();
                }
                return;
            case 1:
            default:
                if ((this.b & 7) != i) {
                    throw A9458650138667563085.b();
                }
                return;
            case 2:
                if ((this.b & 7) != i) {
                    throw F10620977331851870088.b();
                }
                return;
        }
    }

    public D8243293650800641817 y() throws O941307146068593422, J12068242864160501074, Q13606351353383574666 {
        x0(2);
        return ((F3160751278268780235) this.e).l();
    }

    public boolean y0() {
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 2:
                X4929887216837100213 x4929887216837100213 = (X4929887216837100213) obj;
                if (x4929887216837100213.c() || (i = this.b) == this.c) {
                    return false;
                }
                return x4929887216837100213.D(i);
            default:
                F3160751278268780235 f3160751278268780235 = (F3160751278268780235) obj;
                if (f3160751278268780235.c() || (i2 = this.b) == this.c) {
                    return false;
                }
                return f3160751278268780235.D(i2);
        }
    }

    public void z(A10696933611341011168 a10696933611341011168) throws J12068242864160501074 {
        int iL;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        if ((this.b & 7) != 2) {
            throw N11355818201711573941.b();
        }
        do {
            a10696933611341011168.add(w());
            if (h17306840337920354701.d()) {
                return;
            } else {
                iL = h17306840337920354701.l();
            }
        } while (iL == this.b);
        this.d = iL;
    }

    public E17564419012940707302(F3160751278268780235 f3160751278268780235) {
        this.a = (byte) 3;
        this.d = 0;
        Charset charset = A9187767737237685029.a;
        this.e = f3160751278268780235;
        f3160751278268780235.b = this;
    }

    public E17564419012940707302(tu tuVar) {
        this.a = (byte) 1;
        this.d = 0;
        byte[] bArr = rb1.a;
        this.e = tuVar;
        tuVar.d = this;
    }

    public E17564419012940707302(X4929887216837100213 x4929887216837100213) {
        this.a = (byte) 2;
        this.d = 0;
        Charset charset = X10245771154555039797.a;
        this.e = x4929887216837100213;
        x4929887216837100213.b = this;
    }

    public E17564419012940707302(Z17561488864728364842 z17561488864728364842) {
        this.a = (byte) 4;
        this.e = z17561488864728364842;
    }

    public void b(O6641393078261985068 o6641393078261985068) throws C17458191457732048292 {
        int iT;
        tu tuVar = (tu) this.e;
        if ((this.b & 7) == 2) {
            do {
                b(2);
                o6641393078261985068.add(tuVar.e());
                if (tuVar.c()) {
                    return;
                } else {
                    iT = tuVar.t();
                }
            } while (iT == this.b);
            this.d = iT;
            return;
        }
        Z3383101362411723454.v();
    }

    public void b(int i) throws C17458191457732048292 {
        if ((this.b & 7) == i) {
            return;
        }
        Z3383101362411723454.v();
    }

    public static void c(int i) throws yi1 {
        if ((i & 3) == 0) {
            return;
        }
        Z3383101362411723454.o("Failed to parse the message.");
    }

    public static void d(int i) throws yi1 {
        if ((i & 7) == 0) {
            return;
        }
        Z3383101362411723454.o("Failed to parse the message.");
    }

    public int h() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                int iL = this.d;
                if (iL != 0) {
                    this.b = iL;
                    this.d = 0;
                } else {
                    iL = ((H17306840337920354701) obj).l();
                    this.b = iL;
                }
                if (iL == 0 || iL == this.c) {
                    return Integer.MAX_VALUE;
                }
                return iL >>> 3;
            case 1:
            default:
                int iA = this.d;
                if (iA != 0) {
                    this.b = iA;
                    this.d = 0;
                } else {
                    iA = ((F3160751278268780235) obj).A();
                    this.b = iA;
                }
                if (iA == 0 || iA == this.c) {
                    return Integer.MAX_VALUE;
                }
                return iA >>> 3;
            case 2:
                int iA2 = this.d;
                if (iA2 != 0) {
                    this.b = iA2;
                    this.d = 0;
                } else {
                    iA2 = ((X4929887216837100213) obj).A();
                    this.b = iA2;
                }
                if (iA2 == 0 || iA2 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return iA2 >>> 3;
        }
    }

    public int i(int i) {
        return ((Z17561488864728364842) this.e).Q[this.c + i];
    }

    public void n(Object obj, Y3341182438442346389 y3341182438442346389, R4931231174251890987 r4931231174251890987) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            y3341182438442346389.g(obj, this, r4931231174251890987);
            if (this.b == this.c) {
            } else {
                throw N11355818201711573941.d();
            }
        } finally {
            this.c = i;
        }
    }

    public void o(Object obj, N10092264544134359582 n10092264544134359582, X8134396307090105871 x8134396307090105871) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            n10092264544134359582.g(obj, this, x8134396307090105871);
            if (this.b == this.c) {
            } else {
                throw new F10620977331851870088("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public Object j(int i) {
        return ((Z17561488864728364842) this.e).S[this.d + i];
    }

    public void a(g gVar, G18207276409179303092 g18207276409179303092, nl0 nl0Var) throws yi1 {
        tu tuVar = (tu) this.e;
        int i = tuVar.a;
        int i2 = tuVar.b;
        if (i + i2 < 100) {
            int i3 = this.c;
            this.c = ((this.b >>> 3) << 3) | 4;
            tuVar.b = i2 + 1;
            try {
                g18207276409179303092.a(gVar, this, nl0Var);
                if (this.b == this.c) {
                    return;
                } else {
                    throw new yi1("Failed to parse the message.");
                }
            } finally {
                tuVar.b--;
                this.c = i3;
            }
        }
        Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public void a(O6641393078261985068 o6641393078261985068) throws yi1 {
        int iT;
        tu tuVar = (tu) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                o6641393078261985068.add(Boolean.valueOf(tuVar.d()));
                if (tuVar.c()) {
                    return;
                } else {
                    iT = tuVar.t();
                }
            } while (iT == this.b);
            this.d = iT;
            return;
        }
        if (i == 2) {
            int iB = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Boolean.valueOf(tuVar.d()));
            } while (tuVar.b() < iB);
            a(iB);
            return;
        }
        Z3383101362411723454.v();
    }

    public int a() {
        int iT = this.d;
        if (iT != 0) {
            this.b = iT;
            this.d = 0;
        } else {
            iT = ((tu) this.e).t();
            this.b = iT;
        }
        if (iT == 0 || iT == this.c) {
            return Integer.MAX_VALUE;
        }
        return iT >>> 3;
    }

    public void a(O6641393078261985068 o6641393078261985068, boolean z) throws C17458191457732048292 {
        String strR;
        int iT;
        tu tuVar = (tu) this.e;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    b(2);
                    strR = tuVar.s();
                } else {
                    b(2);
                    strR = tuVar.r();
                }
                o6641393078261985068.add(strR);
                if (tuVar.c()) {
                    return;
                } else {
                    iT = tuVar.t();
                }
            } while (iT == this.b);
            this.d = iT;
            return;
        }
        Z3383101362411723454.v();
    }

    public void a(int i) throws yi1 {
        if (((tu) this.e).b() == i) {
            return;
        }
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
