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
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    public static void A0(int i) {
        if ((i & 7) != 0) {
            throw N11355818201711573941.d();
        }
    }

    public static void z0(int i) {
        if ((i & 3) != 0) {
            throw N11355818201711573941.d();
        }
    }

    public void A(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        if ((this.b & 7) != 2) {
            throw A9458650138667563085.b();
        }
        do {
            ((H7410314698464292688) d11116981298317247998).add(y());
            if (f3160751278268780235.c()) {
                return;
            } else {
                A = f3160751278268780235.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void B(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        if ((this.b & 7) != 2) {
            throw F10620977331851870088.b();
        }
        do {
            list.add(x());
            if (x4929887216837100213.c()) {
                return;
            } else {
                A = x4929887216837100213.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void C(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int i3 = h17306840337920354701.i();
            A0(i3);
            int c = h17306840337920354701.c() + i3;
            do {
                a10696933611341011168.add(Double.valueOf(Double.longBitsToDouble(h17306840337920354701.h())));
            } while (h17306840337920354701.c() < c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i4 != 2) {
            throw N11355818201711573941.b();
        }
        int i5 = h17306840337920354701.i();
        A0(i5);
        int c2 = h17306840337920354701.c() + i5;
        do {
            t8586479527660021265.b(Double.longBitsToDouble(h17306840337920354701.h()));
        } while (h17306840337920354701.c() < c2);
    }

    public void D(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Double.valueOf(f3160751278268780235.m()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int B = f3160751278268780235.B();
        if ((B & 7) != 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int b = f3160751278268780235.b() + B;
        do {
            ((H7410314698464292688) d11116981298317247998).add(Double.valueOf(f3160751278268780235.m()));
        } while (f3160751278268780235.b() < b);
    }

    public void E(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Double.valueOf(x4929887216837100213.m()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int K = x4929887216837100213.K();
        if ((K & 7) != 0) {
            throw new F10620977331851870088("Failed to parse the message.");
        }
        int b = x4929887216837100213.b() + K;
        do {
            list.add(Double.valueOf(x4929887216837100213.m()));
        } while (x4929887216837100213.b() < b);
    }

    public void F(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(h17306840337920354701.i());
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void G(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.n()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.n()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void H(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.K()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.K()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public Object I(T18086906245708496780 t18086906245708496780, Class cls, X8134396307090105871 x8134396307090105871) {
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
                byte[] bArr = x4929887216837100213.d;
                int K = x4929887216837100213.K();
                int i2 = x4929887216837100213.g;
                int i3 = x4929887216837100213.e;
                if (K <= i3 - i2 && K > 0) {
                    x4929887216837100213.g = i2 + K;
                    i = i2;
                } else {
                    if (K == 0) {
                        return "";
                    }
                    if (K <= i3) {
                        x4929887216837100213.O(K);
                        x4929887216837100213.g = K;
                    } else {
                        bArr = x4929887216837100213.F(K);
                    }
                }
                return F2424644667972238580.a.k(i, bArr, K);
            case 9:
            default:
                S10973172697741180971.j("unsupported field type.");
                return null;
            case 10:
                x0(2);
                N10092264544134359582 a = X1177226880161088161.c.a(cls);
                K17275736824900228431 d = a.d();
                r(d, a, x8134396307090105871);
                a.b(d);
                return d;
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

    public Object J(V14641450762532118893 v14641450762532118893, Class cls, R12171924199823312678 r12171924199823312678) {
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
                B8838962141159673445 a = X8293765978123339002.c.a(cls);
                T3817383632789307090 d = a.d();
                s(d, a, r12171924199823312678);
                a.b(d);
                return d;
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

    public void K(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = h17306840337920354701.i();
                z0(i3);
                int c = h17306840337920354701.c() + i3;
                do {
                    a10696933611341011168.add(Integer.valueOf(h17306840337920354701.g()));
                } while (h17306840337920354701.c() < c);
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
                    l = h17306840337920354701.l();
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = h17306840337920354701.i();
            z0(i5);
            int c2 = h17306840337920354701.c() + i5;
            do {
                u9933786248742319541.b(h17306840337920354701.g());
            } while (h17306840337920354701.c() < c2);
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
                l2 = h17306840337920354701.l();
            }
        } while (l2 == this.b);
        this.d = l2;
    }

    public void L(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int B = f3160751278268780235.B();
            if ((B & 3) != 0) {
                throw new A9458650138667563085("Failed to parse the message.");
            }
            int b = f3160751278268780235.b() + B;
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.o()));
            } while (f3160751278268780235.b() < b);
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
                A = f3160751278268780235.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void M(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int K = x4929887216837100213.K();
            if ((K & 3) != 0) {
                throw new F10620977331851870088("Failed to parse the message.");
            }
            int b = x4929887216837100213.b() + K;
            do {
                list.add(Integer.valueOf(x4929887216837100213.I()));
            } while (x4929887216837100213.b() < b);
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
                A = x4929887216837100213.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void N(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int i3 = h17306840337920354701.i();
            A0(i3);
            int c = h17306840337920354701.c() + i3;
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.h()));
            } while (h17306840337920354701.c() < c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i4 != 2) {
            throw N11355818201711573941.b();
        }
        int i5 = h17306840337920354701.i();
        A0(i5);
        int c2 = h17306840337920354701.c() + i5;
        do {
            k908934630684087819.b(h17306840337920354701.h());
        } while (h17306840337920354701.c() < c2);
    }

    public void O(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.p()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int B = f3160751278268780235.B();
        if ((B & 7) != 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int b = f3160751278268780235.b() + B;
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.p()));
        } while (f3160751278268780235.b() < b);
    }

    public void P(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(x4929887216837100213.J()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int K = x4929887216837100213.K();
        if ((K & 7) != 0) {
            throw new F10620977331851870088("Failed to parse the message.");
        }
        int b = x4929887216837100213.b() + K;
        do {
            list.add(Long.valueOf(x4929887216837100213.J()));
        } while (x4929887216837100213.b() < b);
    }

    public void Q(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof Q17312955529835048400;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = h17306840337920354701.i();
                z0(i3);
                int c = h17306840337920354701.c() + i3;
                do {
                    a10696933611341011168.add(Float.valueOf(Float.intBitsToFloat(h17306840337920354701.g())));
                } while (h17306840337920354701.c() < c);
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
                    l = h17306840337920354701.l();
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        Q17312955529835048400 q17312955529835048400 = (Q17312955529835048400) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = h17306840337920354701.i();
            z0(i5);
            int c2 = h17306840337920354701.c() + i5;
            do {
                q17312955529835048400.b(Float.intBitsToFloat(h17306840337920354701.g()));
            } while (h17306840337920354701.c() < c2);
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
                l2 = h17306840337920354701.l();
            }
        } while (l2 == this.b);
        this.d = l2;
    }

    public void R(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int B = f3160751278268780235.B();
            if ((B & 3) != 0) {
                throw new A9458650138667563085("Failed to parse the message.");
            }
            int b = f3160751278268780235.b() + B;
            do {
                ((H7410314698464292688) d11116981298317247998).add(Float.valueOf(f3160751278268780235.q()));
            } while (f3160751278268780235.b() < b);
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
                A = f3160751278268780235.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void S(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int K = x4929887216837100213.K();
            if ((K & 3) != 0) {
                throw new F10620977331851870088("Failed to parse the message.");
            }
            int b = x4929887216837100213.b() + K;
            do {
                list.add(Float.valueOf(x4929887216837100213.q()));
            } while (x4929887216837100213.b() < b);
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
                A = x4929887216837100213.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void T(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(h17306840337920354701.i());
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void U(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.r()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.r()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void V(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.K()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.K()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public void W(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.j()));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            k908934630684087819.b(h17306840337920354701.j());
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void X(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.s()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.s()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void Y(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(x4929887216837100213.L()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Long.valueOf(x4929887216837100213.L()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public void Z(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        boolean z = a10696933611341011168 instanceof U9933786248742319541;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int i3 = h17306840337920354701.i();
                z0(i3);
                int c = h17306840337920354701.c() + i3;
                do {
                    a10696933611341011168.add(Integer.valueOf(h17306840337920354701.g()));
                } while (h17306840337920354701.c() < c);
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
                    l = h17306840337920354701.l();
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        U9933786248742319541 u9933786248742319541 = (U9933786248742319541) a10696933611341011168;
        int i4 = i & 7;
        if (i4 == 2) {
            int i5 = h17306840337920354701.i();
            z0(i5);
            int c2 = h17306840337920354701.c() + i5;
            do {
                u9933786248742319541.b(h17306840337920354701.g());
            } while (h17306840337920354701.c() < c2);
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
                l2 = h17306840337920354701.l();
            }
        } while (l2 == this.b);
        this.d = l2;
    }

    public Object a(ft3 ft3Var, Class cls, nl0 nl0Var) {
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
                G18207276409179303092 a = hn2.c.a(cls);
                cu0 a2 = a.a();
                b(a2, a, nl0Var);
                a.c(a2);
                return a2;
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

    public void a0(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int B = f3160751278268780235.B();
            if ((B & 3) != 0) {
                throw new A9458650138667563085("Failed to parse the message.");
            }
            int b = f3160751278268780235.b() + B;
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.u()));
            } while (f3160751278268780235.b() < b);
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
                A = f3160751278268780235.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void b(g gVar, G18207276409179303092 g18207276409179303092, nl0 nl0Var) {
        tu tuVar = (tu) this.e;
        int m = tuVar.m();
        if (tuVar.a + tuVar.b >= 100) {
            Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int d = tuVar.d(m);
        tuVar.a++;
        g18207276409179303092.a(gVar, this, nl0Var);
        tuVar.a(0);
        tuVar.a--;
        if (tuVar.a() == 0) {
            tuVar.c(d);
        } else {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public void b0(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int K = x4929887216837100213.K();
            if ((K & 3) != 0) {
                throw new F10620977331851870088("Failed to parse the message.");
            }
            int b = x4929887216837100213.b() + K;
            do {
                list.add(Integer.valueOf(x4929887216837100213.I()));
            } while (x4929887216837100213.b() < b);
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
                A = x4929887216837100213.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void c(O6641393078261985068 o6641393078261985068) {
        int t;
        tu tuVar = (tu) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                o6641393078261985068.add(Double.valueOf(tuVar.f()));
                if (tuVar.c()) {
                    return;
                } else {
                    t = tuVar.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i != 2) {
            Z3383101362411723454.v();
            return;
        }
        int u = tuVar.u();
        d(u);
        int b = tuVar.b() + u;
        do {
            o6641393078261985068.add(Double.valueOf(tuVar.f()));
        } while (tuVar.b() < b);
    }

    public void c0(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int i3 = h17306840337920354701.i();
            A0(i3);
            int c = h17306840337920354701.c() + i3;
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.h()));
            } while (h17306840337920354701.c() < c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i4 != 2) {
            throw N11355818201711573941.b();
        }
        int i5 = h17306840337920354701.i();
        A0(i5);
        int c2 = h17306840337920354701.c() + i5;
        do {
            k908934630684087819.b(h17306840337920354701.h());
        } while (h17306840337920354701.c() < c2);
    }

    public void d(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.g()));
            } while (tuVar.b() < b);
            a(b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int b2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.g());
        } while (tuVar.b() < b2);
        a(b2);
    }

    public void d0(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.v()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int B = f3160751278268780235.B();
        if ((B & 7) != 0) {
            throw new A9458650138667563085("Failed to parse the message.");
        }
        int b = f3160751278268780235.b() + B;
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.v()));
        } while (f3160751278268780235.b() < b);
    }

    public void e(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int u = tuVar.u();
                c(u);
                int b = tuVar.b() + u;
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.h()));
                } while (tuVar.b() < b);
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
                    t = tuVar.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 2) {
            int u2 = tuVar.u();
            c(u2);
            int b2 = tuVar.b() + u2;
            do {
                jb1Var.b(tuVar.h());
            } while (tuVar.b() < b2);
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
                t2 = tuVar.t();
            }
        } while (t2 == this.b);
        this.d = t2;
    }

    public void e0(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                list.add(Long.valueOf(x4929887216837100213.J()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int K = x4929887216837100213.K();
        if ((K & 7) != 0) {
            throw new F10620977331851870088("Failed to parse the message.");
        }
        int b = x4929887216837100213.b() + K;
        do {
            list.add(Long.valueOf(x4929887216837100213.J()));
        } while (x4929887216837100213.b() < b);
    }

    public void f(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int u = tuVar.u();
            d(u);
            int b = tuVar.b() + u;
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.i()));
            } while (tuVar.b() < b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int u2 = tuVar.u();
        d(u2);
        int b2 = tuVar.b() + u2;
        do {
            wm1Var.a(tuVar.i());
        } while (tuVar.b() < b2);
    }

    public void f0(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(H17306840337920354701.a(h17306840337920354701.i())));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(H17306840337920354701.a(h17306840337920354701.i()));
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void g(O6641393078261985068 o6641393078261985068) {
        int t;
        tu tuVar = (tu) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int u = tuVar.u();
            c(u);
            int b = tuVar.b() + u;
            do {
                o6641393078261985068.add(Float.valueOf(tuVar.j()));
            } while (tuVar.b() < b);
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
                t = tuVar.t();
            }
        } while (t == this.b);
        this.d = t;
    }

    public void g0(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.w()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.w()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void h(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.k()));
            } while (tuVar.b() < b);
            a(b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int b2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.k());
        } while (tuVar.b() < b2);
        a(b2);
    }

    public void h0(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.w()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.w()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public void i(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.l()));
            } while (tuVar.b() < b);
            a(b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int b2 = tuVar.b() + tuVar.u();
        do {
            wm1Var.a(tuVar.l());
        } while (tuVar.b() < b2);
        a(b2);
    }

    public void i0(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Long.valueOf(H17306840337920354701.b(h17306840337920354701.j())));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            k908934630684087819.b(H17306840337920354701.b(h17306840337920354701.j()));
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void j(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
        tu tuVar = (tu) this.e;
        boolean z = o6641393078261985068 instanceof jb1;
        int i = this.b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int u = tuVar.u();
                c(u);
                int b = tuVar.b() + u;
                do {
                    o6641393078261985068.add(Integer.valueOf(tuVar.n()));
                } while (tuVar.b() < b);
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
                    t = tuVar.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        jb1 jb1Var = (jb1) o6641393078261985068;
        int i3 = i & 7;
        if (i3 == 2) {
            int u2 = tuVar.u();
            c(u2);
            int b2 = tuVar.b() + u2;
            do {
                jb1Var.b(tuVar.n());
            } while (tuVar.b() < b2);
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
                t2 = tuVar.t();
            }
        } while (t2 == this.b);
        this.d = t2;
    }

    public void j0(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.x()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.x()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void k(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int u = tuVar.u();
            d(u);
            int b = tuVar.b() + u;
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.o()));
            } while (tuVar.b() < b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int u2 = tuVar.u();
        d(u2);
        int b2 = tuVar.b() + u2;
        do {
            wm1Var.a(tuVar.o());
        } while (tuVar.b() < b2);
    }

    public void k0(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(x4929887216837100213.x()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Long.valueOf(x4929887216837100213.x()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public void l(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.p()));
            } while (tuVar.b() < b);
            a(b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int b2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.p());
        } while (tuVar.b() < b2);
        a(b2);
    }

    public String l0() {
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

    public void m(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.q()));
            } while (tuVar.b() < b);
            a(b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int b2 = tuVar.b() + tuVar.u();
        do {
            wm1Var.a(tuVar.q());
        } while (tuVar.b() < b2);
        a(b2);
    }

    public void m0(A10696933611341011168 a10696933611341011168, boolean z) {
        int l;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        if ((this.b & 7) != 2) {
            throw N11355818201711573941.b();
        }
        do {
            a10696933611341011168.add(z ? p0() : l0());
            if (h17306840337920354701.d()) {
                return;
            } else {
                l = h17306840337920354701.l();
            }
        } while (l == this.b);
        this.d = l;
    }

    public void n(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Integer.valueOf(tuVar.u()));
            } while (tuVar.b() < b);
            a(b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int b2 = tuVar.b() + tuVar.u();
        do {
            jb1Var.b(tuVar.u());
        } while (tuVar.b() < b2);
        a(b2);
    }

    public void n0(D11116981298317247998 d11116981298317247998, boolean z) {
        String y;
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        if ((this.b & 7) != 2) {
            throw A9458650138667563085.b();
        }
        do {
            if (z) {
                x0(2);
                y = f3160751278268780235.z();
            } else {
                x0(2);
                y = f3160751278268780235.y();
            }
            ((H7410314698464292688) d11116981298317247998).add(y);
            if (f3160751278268780235.c()) {
                return;
            } else {
                A = f3160751278268780235.A();
            }
        } while (A == this.b);
        this.d = A;
    }

    public void o(O6641393078261985068 o6641393078261985068) {
        int t;
        int t2;
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
                        t = tuVar.t();
                    }
                } while (t == this.b);
                this.d = t;
                return;
            }
            if (i2 != 2) {
                Z3383101362411723454.v();
                return;
            }
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Long.valueOf(tuVar.v()));
            } while (tuVar.b() < b);
            a(b);
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
                    t2 = tuVar.t();
                }
            } while (t2 == this.b);
            this.d = t2;
            return;
        }
        if (i3 != 2) {
            Z3383101362411723454.v();
            return;
        }
        int b2 = tuVar.b() + tuVar.u();
        do {
            wm1Var.a(tuVar.v());
        } while (tuVar.b() < b2);
        a(b2);
    }

    public void o0(List list, boolean z) {
        int A;
        int A2;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        if ((this.b & 7) != 2) {
            throw F10620977331851870088.b();
        }
        if ((list instanceof M9021326446326000287) && !z) {
            M9021326446326000287 m9021326446326000287 = (M9021326446326000287) list;
            do {
                m9021326446326000287.e(x());
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A2 = x4929887216837100213.A();
                }
            } while (A2 == this.b);
            this.d = A2;
            return;
        }
        do {
            String str = "";
            if (z) {
                x0(2);
                byte[] bArr = x4929887216837100213.d;
                int K = x4929887216837100213.K();
                int i = x4929887216837100213.g;
                int i2 = x4929887216837100213.e;
                if (K <= i2 - i && K > 0) {
                    x4929887216837100213.g = i + K;
                } else if (K != 0) {
                    i = 0;
                    if (K <= i2) {
                        x4929887216837100213.O(K);
                        x4929887216837100213.g = K;
                    } else {
                        bArr = x4929887216837100213.F(K);
                    }
                }
                str = F2424644667972238580.a.k(i, bArr, K);
            } else {
                x0(2);
                byte[] bArr2 = x4929887216837100213.d;
                int K2 = x4929887216837100213.K();
                if (K2 > 0) {
                    int i3 = x4929887216837100213.e;
                    int i4 = x4929887216837100213.g;
                    if (K2 <= i3 - i4) {
                        str = new String(bArr2, i4, K2, X10245771154555039797.a);
                        x4929887216837100213.g += K2;
                    }
                }
                if (K2 != 0) {
                    if (K2 <= x4929887216837100213.e) {
                        x4929887216837100213.O(K2);
                        str = new String(bArr2, x4929887216837100213.g, K2, X10245771154555039797.a);
                        x4929887216837100213.g += K2;
                    } else {
                        str = new String(x4929887216837100213.F(K2), X10245771154555039797.a);
                    }
                }
            }
            list.add(str);
            if (x4929887216837100213.c()) {
                return;
            } else {
                A = x4929887216837100213.A();
            }
        } while (A == this.b);
        this.d = A;
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

    public String p0() {
        x0(2);
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        int i = h17306840337920354701.i();
        if (i > 0) {
            int i2 = h17306840337920354701.e;
            int i3 = h17306840337920354701.g;
            if (i <= i2 - i3) {
                String h = V3851199863415612823.a.h(i3, h17306840337920354701.d, i);
                h17306840337920354701.g += i;
                return h;
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

    public void q(Object obj, Y3341182438442346389 y3341182438442346389, R4931231174251890987 r4931231174251890987) {
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        int i = h17306840337920354701.i();
        if (h17306840337920354701.a + 0 >= h17306840337920354701.b) {
            throw new N11355818201711573941("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e = h17306840337920354701.e(i);
        h17306840337920354701.a++;
        y3341182438442346389.g(obj, this, r4931231174251890987);
        if (h17306840337920354701.i != 0) {
            throw new N11355818201711573941("Protocol message end-group tag did not match expected tag.");
        }
        h17306840337920354701.a--;
        h17306840337920354701.j = e;
        h17306840337920354701.m();
    }

    public void q0(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Integer.valueOf(h17306840337920354701.i()));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            u9933786248742319541.b(h17306840337920354701.i());
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void r(Object obj, N10092264544134359582 n10092264544134359582, X8134396307090105871 x8134396307090105871) {
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int K = x4929887216837100213.K();
        if (x4929887216837100213.a >= 100) {
            throw new F10620977331851870088("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int j = x4929887216837100213.j(K);
        x4929887216837100213.a++;
        n10092264544134359582.g(obj, this, x8134396307090105871);
        x4929887216837100213.a(0);
        x4929887216837100213.a--;
        x4929887216837100213.i(j);
    }

    public void r0(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.B()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Integer.valueOf(f3160751278268780235.B()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void s(Object obj, B8838962141159673445 b8838962141159673445, R12171924199823312678 r12171924199823312678) {
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int B = f3160751278268780235.B();
        if (f3160751278268780235.a >= 100) {
            throw new A9458650138667563085("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int j = f3160751278268780235.j(B);
        f3160751278268780235.a++;
        b8838962141159673445.e(obj, this, r12171924199823312678);
        f3160751278268780235.a(0);
        f3160751278268780235.a--;
        f3160751278268780235.i(j);
    }

    public void s0(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Integer.valueOf(x4929887216837100213.K()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Integer.valueOf(x4929887216837100213.K()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public void t(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Boolean.valueOf(h17306840337920354701.f()));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            n2953453778378988595.b(h17306840337920354701.f());
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void t0(A10696933611341011168 a10696933611341011168) {
        int l;
        int l2;
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
                        l = h17306840337920354701.l();
                    }
                } while (l == this.b);
                this.d = l;
                return;
            }
            if (i2 != 2) {
                throw N11355818201711573941.b();
            }
            int c = h17306840337920354701.c() + h17306840337920354701.i();
            do {
                a10696933611341011168.add(Long.valueOf(h17306840337920354701.j()));
            } while (h17306840337920354701.c() < c);
            w0(c);
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
                    l2 = h17306840337920354701.l();
                }
            } while (l2 == this.b);
            this.d = l2;
            return;
        }
        if (i3 != 2) {
            throw N11355818201711573941.b();
        }
        int c2 = h17306840337920354701.c() + h17306840337920354701.i();
        do {
            k908934630684087819.b(h17306840337920354701.j());
        } while (h17306840337920354701.c() < c2);
        w0(c2);
    }

    public void u(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Boolean.valueOf(f3160751278268780235.k()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Boolean.valueOf(f3160751278268780235.k()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void u0(D11116981298317247998 d11116981298317247998) {
        int A;
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.C()));
                if (f3160751278268780235.c()) {
                    return;
                } else {
                    A = f3160751278268780235.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw A9458650138667563085.b();
        }
        int b = f3160751278268780235.b() + f3160751278268780235.B();
        do {
            ((H7410314698464292688) d11116981298317247998).add(Long.valueOf(f3160751278268780235.C()));
        } while (f3160751278268780235.b() < b);
        w0(b);
    }

    public void v(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Boolean.valueOf(x4929887216837100213.k()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Boolean.valueOf(x4929887216837100213.k()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public void v0(List list) {
        int A;
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                list.add(Long.valueOf(x4929887216837100213.L()));
                if (x4929887216837100213.c()) {
                    return;
                } else {
                    A = x4929887216837100213.A();
                }
            } while (A == this.b);
            this.d = A;
            return;
        }
        if (i != 2) {
            throw F10620977331851870088.b();
        }
        int b = x4929887216837100213.b() + x4929887216837100213.K();
        do {
            list.add(Long.valueOf(x4929887216837100213.L()));
        } while (x4929887216837100213.b() < b);
        w0(b);
    }

    public M18082356575916498704 w() {
        byte[] bArr;
        x0(2);
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        byte[] bArr2 = h17306840337920354701.d;
        int i = h17306840337920354701.i();
        if (i > 0) {
            int i2 = h17306840337920354701.e;
            int i3 = h17306840337920354701.g;
            if (i <= i2 - i3) {
                M18082356575916498704 i4 = N17666688112968464504.i(i3, bArr2, i);
                h17306840337920354701.g += i;
                return i4;
            }
        }
        if (i == 0) {
            return N17666688112968464504.b;
        }
        if (i > 0) {
            int i5 = h17306840337920354701.e;
            int i6 = h17306840337920354701.g;
            if (i <= i5 - i6) {
                int i7 = i + i6;
                h17306840337920354701.g = i7;
                bArr = Arrays.copyOfRange(bArr2, i6, i7);
                M18082356575916498704 m18082356575916498704 = N17666688112968464504.b;
                return new M18082356575916498704(bArr);
            }
        }
        if (i > 0) {
            throw N11355818201711573941.e();
        }
        if (i != 0) {
            throw N11355818201711573941.c();
        }
        bArr = S15638288480382345131.b;
        M18082356575916498704 m180823565759164987042 = N17666688112968464504.b;
        return new M18082356575916498704(bArr);
    }

    public void w0(int i) {
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

    public B15200565448991586841 x() {
        x0(2);
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) this.e;
        byte[] bArr = x4929887216837100213.d;
        int K = x4929887216837100213.K();
        int i = x4929887216837100213.e;
        int i2 = x4929887216837100213.g;
        if (K <= i - i2 && K > 0) {
            B15200565448991586841 i3 = B15200565448991586841.i(i2, bArr, K);
            x4929887216837100213.g += K;
            return i3;
        }
        if (K == 0) {
            return B15200565448991586841.c;
        }
        byte[] G = x4929887216837100213.G(K);
        if (G != null) {
            return B15200565448991586841.i(0, G, G.length);
        }
        int i4 = x4929887216837100213.g;
        int i5 = x4929887216837100213.e;
        int i6 = i5 - i4;
        x4929887216837100213.i += i5;
        x4929887216837100213.g = 0;
        x4929887216837100213.e = 0;
        ArrayList H = x4929887216837100213.H(K - i6);
        byte[] bArr2 = new byte[K];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = H.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = H.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        B15200565448991586841 b15200565448991586841 = B15200565448991586841.c;
        return new B15200565448991586841(bArr2);
    }

    public void x0(int i) {
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

    public D8243293650800641817 y() {
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

    public void z(A10696933611341011168 a10696933611341011168) {
        int l;
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) this.e;
        if ((this.b & 7) != 2) {
            throw N11355818201711573941.b();
        }
        do {
            a10696933611341011168.add(w());
            if (h17306840337920354701.d()) {
                return;
            } else {
                l = h17306840337920354701.l();
            }
        } while (l == this.b);
        this.d = l;
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

    public void b(O6641393078261985068 o6641393078261985068) {
        int t;
        tu tuVar = (tu) this.e;
        if ((this.b & 7) == 2) {
            do {
                b(2);
                o6641393078261985068.add(tuVar.e());
                if (tuVar.c()) {
                    return;
                } else {
                    t = tuVar.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        Z3383101362411723454.v();
    }

    public void b(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        Z3383101362411723454.v();
    }

    public static void c(int i) {
        if ((i & 3) == 0) {
            return;
        }
        Z3383101362411723454.o("Failed to parse the message.");
    }

    public static void d(int i) {
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
                int i = this.d;
                if (i != 0) {
                    this.b = i;
                    this.d = 0;
                } else {
                    i = ((H17306840337920354701) obj).l();
                    this.b = i;
                }
                if (i == 0 || i == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i >>> 3;
            case 1:
            default:
                int i2 = this.d;
                if (i2 != 0) {
                    this.b = i2;
                    this.d = 0;
                } else {
                    i2 = ((F3160751278268780235) obj).A();
                    this.b = i2;
                }
                if (i2 == 0 || i2 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i2 >>> 3;
            case 2:
                int i3 = this.d;
                if (i3 != 0) {
                    this.b = i3;
                    this.d = 0;
                } else {
                    i3 = ((X4929887216837100213) obj).A();
                    this.b = i3;
                }
                if (i3 == 0 || i3 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i3 >>> 3;
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

    public void a(g gVar, G18207276409179303092 g18207276409179303092, nl0 nl0Var) {
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

    public void a(O6641393078261985068 o6641393078261985068) {
        int t;
        tu tuVar = (tu) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                o6641393078261985068.add(Boolean.valueOf(tuVar.d()));
                if (tuVar.c()) {
                    return;
                } else {
                    t = tuVar.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        if (i == 2) {
            int b = tuVar.b() + tuVar.u();
            do {
                o6641393078261985068.add(Boolean.valueOf(tuVar.d()));
            } while (tuVar.b() < b);
            a(b);
            return;
        }
        Z3383101362411723454.v();
    }

    public int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = ((tu) this.e).t();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public void a(O6641393078261985068 o6641393078261985068, boolean z) {
        String r;
        int t;
        tu tuVar = (tu) this.e;
        if ((this.b & 7) == 2) {
            do {
                if (z) {
                    b(2);
                    r = tuVar.s();
                } else {
                    b(2);
                    r = tuVar.r();
                }
                o6641393078261985068.add(r);
                if (tuVar.c()) {
                    return;
                } else {
                    t = tuVar.t();
                }
            } while (t == this.b);
            this.d = t;
            return;
        }
        Z3383101362411723454.v();
    }

    public void a(int i) {
        if (((tu) this.e).b() == i) {
            return;
        }
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
