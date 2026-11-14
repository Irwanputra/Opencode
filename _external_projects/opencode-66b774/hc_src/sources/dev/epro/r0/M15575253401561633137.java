package dev.epro.r0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M15575253401561633137 implements Closeable {
    public static final Logger d;
    public final T13344602445187831655 a;
    public final B4727321331707555656 b;
    public final P14068990878373664744 c;

    static {
        Logger logger = Logger.getLogger(K15662838989169835869.class.getName());
        logger.getClass();
        d = logger;
    }

    public M15575253401561633137(T13344602445187831655 t13344602445187831655) {
        this.a = t13344602445187831655;
        B4727321331707555656 b4727321331707555656 = new B4727321331707555656(t13344602445187831655);
        this.b = b4727321331707555656;
        this.c = new P14068990878373664744(b4727321331707555656);
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x0256, code lost:
    
        dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.n(r6, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x025f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r14, dev.epro.r0.Q9103558464140585130 r15) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M15575253401561633137.b(boolean, dev.epro.r0.Q9103558464140585130):boolean");
    }

    public final void c(Q9103558464140585130 q9103558464140585130, int i, int i2, final int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        if (i3 == 0) {
            Q11088980322693754445.h("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
            return;
        }
        final boolean z4 = true;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if ((i2 & 32) != 0) {
            Q11088980322693754445.h("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        if ((i2 & 8) != 0) {
            byte d2 = this.a.d();
            byte[] bArr = L14928198200995638215.a;
            i4 = d2 & 255;
        } else {
            i4 = 0;
        }
        final int H = Z860808776098365610.H(i, i2, i4);
        T13344602445187831655 t13344602445187831655 = this.a;
        final A13573370436844979007 a13573370436844979007 = q9103558464140585130.b;
        if ((i3 == 0 || (i3 & 1) != 0) ? false : z) {
            final P5176232750190581838 p5176232750190581838 = new P5176232750190581838();
            long j = H;
            t13344602445187831655.q(j);
            t13344602445187831655.m(p5176232750190581838, j);
            Z9658010704151025794.b(a13573370436844979007.i, a13573370436844979007.c + '[' + i3 + "] onData", new B13729205492206812220(i3, p5176232750190581838, H, z4) { // from class: dev.epro.r0.Y7942067758532353363
                public final /* synthetic */ int b;
                public final /* synthetic */ P5176232750190581838 c;
                public final /* synthetic */ int d;

                @Override // dev.epro.r0.B13729205492206812220
                public final Object invoke() {
                    A13573370436844979007 a135733704368449790072 = A13573370436844979007.this;
                    int i5 = this.b;
                    P5176232750190581838 p51762327501905818382 = this.c;
                    int i6 = this.d;
                    try {
                        a135733704368449790072.k.getClass();
                        p51762327501905818382.u(i6);
                        a135733704368449790072.w.j(i5, N10274084507843431211.CANCEL);
                        synchronized (a135733704368449790072) {
                            a135733704368449790072.y.remove(Integer.valueOf(i5));
                        }
                    } catch (IOException unused) {
                    }
                    return O9245300239821758723.a;
                }
            });
        } else {
            W10382756971622296125 c = a13573370436844979007.c(i3);
            if (c == null) {
                q9103558464140585130.b.j(i3, N10274084507843431211.PROTOCOL_ERROR);
                long j2 = H;
                q9103558464140585130.b.g(j2);
                t13344602445187831655.s(j2);
            } else {
                TimeZone timeZone = C14766148968941961570.a;
                A6352962637471496627 a6352962637471496627 = c.h;
                long j3 = H;
                a6352962637471496627.getClass();
                long j4 = j3;
                while (true) {
                    W10382756971622296125 w10382756971622296125 = a6352962637471496627.f;
                    if (j4 <= 0) {
                        TimeZone timeZone2 = C14766148968941961570.a;
                        w10382756971622296125.b.g(j3);
                        a6352962637471496627.f.b.p.getClass();
                        break;
                    }
                    synchronized (w10382756971622296125) {
                        z2 = a6352962637471496627.b;
                        z3 = a6352962637471496627.d.b + j4 > a6352962637471496627.a;
                    }
                    if (z3) {
                        t13344602445187831655.s(j4);
                        a6352962637471496627.f.f(N10274084507843431211.FLOW_CONTROL_ERROR);
                        break;
                    }
                    if (z2) {
                        t13344602445187831655.s(j4);
                        break;
                    }
                    long m = t13344602445187831655.m(a6352962637471496627.c, j4);
                    if (m == -1) {
                        throw new EOFException();
                    }
                    j4 -= m;
                    W10382756971622296125 w103827569716222961252 = a6352962637471496627.f;
                    synchronized (w103827569716222961252) {
                        try {
                            if (a6352962637471496627.e) {
                                a6352962637471496627.c.b();
                            } else {
                                P5176232750190581838 p51762327501905818382 = a6352962637471496627.d;
                                boolean z5 = p51762327501905818382.b == 0;
                                p51762327501905818382.C(a6352962637471496627.c);
                                if (z5) {
                                    w103827569716222961252.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (z4) {
                    c.k(F12902864952249894497.b, true);
                }
            }
        }
        this.a.s(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final List d(int i, int i2, int i3, int i4) {
        B4727321331707555656 b4727321331707555656 = this.b;
        b4727321331707555656.d = i;
        b4727321331707555656.e = i2;
        b4727321331707555656.b = i3;
        b4727321331707555656.c = i4;
        P14068990878373664744 p14068990878373664744 = this.c;
        T13344602445187831655 t13344602445187831655 = p14068990878373664744.d;
        while (!t13344602445187831655.b()) {
            byte d2 = t13344602445187831655.d();
            byte[] bArr = L14928198200995638215.a;
            int i5 = d2 & 255;
            if (i5 == 128) {
                Q11088980322693754445.h("index == 0");
                return null;
            }
            if ((d2 & 128) == 128) {
                int f = p14068990878373664744.f(i5, 127);
                int i6 = f - 1;
                if (i6 >= 0) {
                    O12229768880637238015[] o12229768880637238015Arr = C17517635496846834643.a;
                    if (i6 <= o12229768880637238015Arr.length - 1) {
                        p14068990878373664744.a(o12229768880637238015Arr[i6]);
                    }
                }
                int length = p14068990878373664744.f + 1 + (i6 - C17517635496846834643.a.length);
                if (length >= 0) {
                    O12229768880637238015[] o12229768880637238015Arr2 = p14068990878373664744.e;
                    if (length < o12229768880637238015Arr2.length) {
                        O12229768880637238015 o12229768880637238015 = o12229768880637238015Arr2[length];
                        o12229768880637238015.getClass();
                        p14068990878373664744.a(o12229768880637238015);
                    }
                }
                Q11088980322693754445.h(G6547577305291411977.n(f, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                O12229768880637238015[] o12229768880637238015Arr3 = C17517635496846834643.a;
                P5124777957357031757 e = p14068990878373664744.e();
                C17517635496846834643.a(e);
                p14068990878373664744.d(new O12229768880637238015(e, p14068990878373664744.e()));
            } else if ((d2 & 64) == 64) {
                p14068990878373664744.d(new O12229768880637238015(p14068990878373664744.c(p14068990878373664744.f(i5, 63) - 1), p14068990878373664744.e()));
            } else if ((d2 & 32) == 32) {
                int f2 = p14068990878373664744.f(i5, 31);
                p14068990878373664744.a = f2;
                if (f2 < 0 || f2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + p14068990878373664744.a);
                }
                int i7 = p14068990878373664744.h;
                if (f2 < i7) {
                    if (f2 == 0) {
                        O12229768880637238015[] o12229768880637238015Arr4 = p14068990878373664744.e;
                        O5378677881740157249.x0(0, o12229768880637238015Arr4.length, null, o12229768880637238015Arr4);
                        p14068990878373664744.f = p14068990878373664744.e.length - 1;
                        p14068990878373664744.g = 0;
                        p14068990878373664744.h = 0;
                    } else {
                        p14068990878373664744.b(i7 - f2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                O12229768880637238015[] o12229768880637238015Arr5 = C17517635496846834643.a;
                P5124777957357031757 e2 = p14068990878373664744.e();
                C17517635496846834643.a(e2);
                p14068990878373664744.a(new O12229768880637238015(e2, p14068990878373664744.e()));
            } else {
                p14068990878373664744.a(new O12229768880637238015(p14068990878373664744.c(p14068990878373664744.f(i5, 15) - 1), p14068990878373664744.e()));
            }
        }
        ArrayList arrayList = p14068990878373664744.b;
        List d1 = R9411874267597469228.d1(arrayList);
        arrayList.clear();
        p14068990878373664744.c = 0L;
        return d1;
    }

    public final void e(Q9103558464140585130 q9103558464140585130, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            Q11088980322693754445.h("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte d2 = this.a.d();
            byte[] bArr = L14928198200995638215.a;
            i4 = d2 & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            T13344602445187831655 t13344602445187831655 = this.a;
            t13344602445187831655.g();
            t13344602445187831655.d();
            byte[] bArr2 = L14928198200995638215.a;
            i -= 5;
        }
        List d3 = d(Z860808776098365610.H(i, i2, i4), i4, i2, i3);
        A13573370436844979007 a13573370436844979007 = q9103558464140585130.b;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            Z9658010704151025794.b(a13573370436844979007.i, a13573370436844979007.c + '[' + i3 + "] onHeaders", new F3589725160299670242(a13573370436844979007, i3, d3, z2));
            return;
        }
        synchronized (a13573370436844979007) {
            W10382756971622296125 c = a13573370436844979007.c(i3);
            if (c != null) {
                c.k(C14766148968941961570.h(d3), z2);
                return;
            }
            if (a13573370436844979007.f) {
                return;
            }
            if (i3 <= a13573370436844979007.d) {
                return;
            }
            if (i3 % 2 == a13573370436844979007.e % 2) {
                return;
            }
            W10382756971622296125 w10382756971622296125 = new W10382756971622296125(i3, a13573370436844979007, false, z2, C14766148968941961570.h(d3));
            a13573370436844979007.d = i3;
            a13573370436844979007.b.put(Integer.valueOf(i3), w10382756971622296125);
            Z9658010704151025794.b(a13573370436844979007.g.d(), a13573370436844979007.c + '[' + i3 + "] onStream", new O9814524300768724052(a13573370436844979007, w10382756971622296125, (byte) 13));
        }
    }

    public final void g(Q9103558464140585130 q9103558464140585130, int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            Q11088980322693754445.h("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        byte b = 0;
        if ((i2 & 8) != 0) {
            byte d2 = this.a.d();
            byte[] bArr = L14928198200995638215.a;
            i4 = d2 & 255;
        } else {
            i4 = 0;
        }
        int g = this.a.g() & Integer.MAX_VALUE;
        List d3 = d(Z860808776098365610.H(i - 4, i2, i4), i4, i2, i3);
        A13573370436844979007 a13573370436844979007 = q9103558464140585130.b;
        synchronized (a13573370436844979007) {
            if (a13573370436844979007.y.contains(Integer.valueOf(g))) {
                a13573370436844979007.j(g, N10274084507843431211.PROTOCOL_ERROR);
                return;
            }
            a13573370436844979007.y.add(Integer.valueOf(g));
            Z9658010704151025794.b(a13573370436844979007.i, a13573370436844979007.c + '[' + g + "] onRequest", new F3589725160299670242(a13573370436844979007, g, d3, b));
        }
    }
}
