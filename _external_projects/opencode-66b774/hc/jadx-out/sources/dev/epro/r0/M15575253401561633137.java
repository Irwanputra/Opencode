package dev.epro.r0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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

    public final boolean b(boolean z, Q9103558464140585130 q9103558464140585130) throws Exception {
        int iL;
        int iG;
        Object[] array;
        try {
            this.a.q(9L);
            iL = L14928198200995638215.l(this.a);
        } catch (EOFException unused) {
        }
        if (iL > 16384) {
            Q11088980322693754445.h(G6547577305291411977.n(iL, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int iD = this.a.d() & 255;
        byte bD = this.a.d();
        int i = bD & 255;
        int iG2 = this.a.g();
        int i2 = Integer.MAX_VALUE & iG2;
        if (iD != 8) {
            Level level = Level.FINE;
        }
        if (z && iD != 4) {
            StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
            String[] strArr = K15662838989169835869.b;
            sb.append(iD < strArr.length ? strArr[iD] : C14766148968941961570.d("0x%02x", Integer.valueOf(iD)));
            throw new IOException(sb.toString());
        }
        N10274084507843431211 n10274084507843431211 = null;
        byte b = 1;
        switch (iD) {
            case 0:
                c(q9103558464140585130, iL, i, i2);
                return true;
            case 1:
                e(q9103558464140585130, iL, i, i2);
                return true;
            case 2:
                if (iL != 5) {
                    Q11088980322693754445.h(G6547577305291411977.o(iL, "TYPE_PRIORITY length: ", " != 5"));
                    return false;
                }
                if (i2 == 0) {
                    Q11088980322693754445.h("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                T13344602445187831655 t13344602445187831655 = this.a;
                t13344602445187831655.g();
                t13344602445187831655.d();
                return true;
            case 3:
                if (iL != 4) {
                    Q11088980322693754445.h(G6547577305291411977.o(iL, "TYPE_RST_STREAM length: ", " != 4"));
                    return false;
                }
                if (i2 == 0) {
                    Q11088980322693754445.h("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int iG3 = this.a.g();
                N10274084507843431211.b.getClass();
                N10274084507843431211[] n10274084507843431211ArrValues = N10274084507843431211.values();
                int length = n10274084507843431211ArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        N10274084507843431211 n102740845078434312112 = n10274084507843431211ArrValues[i3];
                        if (n102740845078434312112.a == iG3) {
                            n10274084507843431211 = n102740845078434312112;
                        } else {
                            i3++;
                        }
                    }
                }
                if (n10274084507843431211 == null) {
                    Q11088980322693754445.h(G6547577305291411977.n(iG3, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                A13573370436844979007 a13573370436844979007 = q9103558464140585130.b;
                if (i2 != 0 && (iG2 & 1) == 0) {
                    Z9658010704151025794.b(a13573370436844979007.i, a13573370436844979007.c + '[' + i2 + "] onReset", new F3589725160299670242(a13573370436844979007, i2, n10274084507843431211, b));
                    return true;
                }
                W10382756971622296125 w10382756971622296125D = a13573370436844979007.d(i2);
                if (w10382756971622296125D != null) {
                    synchronized (w10382756971622296125D) {
                        if (w10382756971622296125D.g() == null) {
                            w10382756971622296125D.l = n10274084507843431211;
                            w10382756971622296125D.notifyAll();
                        }
                        break;
                    }
                    return true;
                }
                return true;
            case 4:
                T13344602445187831655 t133446024451878316552 = this.a;
                if (i2 != 0) {
                    Q11088980322693754445.h("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((bD & 1) != 0) {
                    if (iL != 0) {
                        Q11088980322693754445.h("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (iL % 6 != 0) {
                    Q11088980322693754445.h(G6547577305291411977.n(iL, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                P15116306960523597113 p15116306960523597113 = new P15116306960523597113();
                I12982432556619280823 i12982432556619280823L = W7808703833045379622.L(W7808703833045379622.N(0, iL), 6);
                int i4 = i12982432556619280823L.a;
                int i5 = i12982432556619280823L.b;
                int i6 = i12982432556619280823L.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        short sJ = t133446024451878316552.j();
                        byte[] bArr = L14928198200995638215.a;
                        int i7 = sJ & 65535;
                        iG = t133446024451878316552.g();
                        if (i7 != 2) {
                            if (i7 != 4) {
                                if (i7 == 5 && (iG < 16384 || iG > 16777215)) {
                                }
                            } else if (iG < 0) {
                                Q11088980322693754445.h("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (iG != 0 && iG != 1) {
                            Q11088980322693754445.h("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        p15116306960523597113.b(i7, iG);
                        if (i4 != i5) {
                            i4 += i6;
                        }
                    }
                    Q11088980322693754445.h(G6547577305291411977.n(iG, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                    return false;
                }
                A13573370436844979007 a135733704368449790072 = q9103558464140585130.b;
                Z9658010704151025794.b(a135733704368449790072.h, G6547577305291411977.u(new StringBuilder(), a135733704368449790072.c, " applyAndAckSettings"), new O9814524300768724052(q9103558464140585130, p15116306960523597113, (byte) 14));
                return true;
            case 5:
                g(q9103558464140585130, iL, i, i2);
                return true;
            case 6:
                if (iL != 8) {
                    Q11088980322693754445.h(G6547577305291411977.n(iL, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i2 != 0) {
                    Q11088980322693754445.h("TYPE_PING streamId != 0");
                    return false;
                }
                final int iG4 = this.a.g();
                final int iG5 = this.a.g();
                i = (bD & 1) != 0 ? 1 : 0;
                A13573370436844979007 a135733704368449790073 = q9103558464140585130.b;
                if (i == 0) {
                    Z9658010704151025794 z9658010704151025794 = a135733704368449790073.h;
                    String strU = G6547577305291411977.u(new StringBuilder(), q9103558464140585130.b.c, " ping");
                    final A13573370436844979007 a135733704368449790074 = q9103558464140585130.b;
                    Z9658010704151025794.b(z9658010704151025794, strU, new B13729205492206812220() { // from class: dev.epro.r0.M5657226284980513953
                        @Override // dev.epro.r0.B13729205492206812220
                        public final Object invoke() {
                            A13573370436844979007 a135733704368449790075 = a135733704368449790074;
                            try {
                                a135733704368449790075.w.h(iG4, iG5, true);
                            } catch (IOException e) {
                                N10274084507843431211 n102740845078434312113 = N10274084507843431211.PROTOCOL_ERROR;
                                a135733704368449790075.b(n102740845078434312113, n102740845078434312113, e);
                            }
                            return O9245300239821758723.a;
                        }
                    });
                    return true;
                }
                synchronized (a135733704368449790073) {
                    try {
                        if (iG4 == 1) {
                            a135733704368449790073.l++;
                        } else if (iG4 == 2) {
                            a135733704368449790073.n++;
                        } else if (iG4 == 3) {
                            a135733704368449790073.notifyAll();
                        }
                    } finally {
                    }
                }
                return true;
            case 7:
                if (iL < 8) {
                    Q11088980322693754445.h(G6547577305291411977.n(iL, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i2 != 0) {
                    Q11088980322693754445.h("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int iG6 = this.a.g();
                int iG7 = this.a.g();
                int i8 = iL - 8;
                N10274084507843431211.b.getClass();
                N10274084507843431211[] n10274084507843431211ArrValues2 = N10274084507843431211.values();
                int length2 = n10274084507843431211ArrValues2.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length2) {
                        N10274084507843431211 n102740845078434312113 = n10274084507843431211ArrValues2[i9];
                        if (n102740845078434312113.a == iG7) {
                            n10274084507843431211 = n102740845078434312113;
                        } else {
                            i9++;
                        }
                    }
                }
                if (n10274084507843431211 == null) {
                    Q11088980322693754445.h(G6547577305291411977.n(iG7, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                P5124777957357031757 p5124777957357031757E = P5124777957357031757.d;
                if (i8 > 0) {
                    p5124777957357031757E = this.a.e(i8);
                }
                p5124777957357031757E.getClass();
                p5124777957357031757E.b();
                A13573370436844979007 a135733704368449790075 = q9103558464140585130.b;
                synchronized (a135733704368449790075) {
                    array = a135733704368449790075.b.values().toArray(new W10382756971622296125[0]);
                    a135733704368449790075.f = true;
                }
                W10382756971622296125[] w10382756971622296125Arr = (W10382756971622296125[]) array;
                int length3 = w10382756971622296125Arr.length;
                while (i < length3) {
                    W10382756971622296125 w10382756971622296125 = w10382756971622296125Arr[i];
                    if (w10382756971622296125.a > iG6 && w10382756971622296125.h()) {
                        N10274084507843431211 n102740845078434312114 = N10274084507843431211.REFUSED_STREAM;
                        synchronized (w10382756971622296125) {
                            if (w10382756971622296125.g() == null) {
                                w10382756971622296125.l = n102740845078434312114;
                                w10382756971622296125.notifyAll();
                            }
                        }
                        q9103558464140585130.b.d(w10382756971622296125.a);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (iL != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iL);
                    }
                    long jG = ((long) this.a.g()) & 2147483647L;
                    if (jG == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Level level2 = Level.FINE;
                    A13573370436844979007 a135733704368449790076 = q9103558464140585130.b;
                    if (i2 == 0) {
                        synchronized (a135733704368449790076) {
                            a135733704368449790076.u += jG;
                            a135733704368449790076.notifyAll();
                        }
                        return true;
                    }
                    W10382756971622296125 w10382756971622296125C = a135733704368449790076.c(i2);
                    if (w10382756971622296125C != null) {
                        synchronized (w10382756971622296125C) {
                            w10382756971622296125C.e += jG;
                            if (jG > 0) {
                                w10382756971622296125C.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    Logger logger = d;
                    String[] strArr2 = K15662838989169835869.b;
                    C14766148968941961570.d("%s 0x%08x %5d %-13s %s", "<<", Integer.valueOf(i2), Integer.valueOf(iL), 8 < strArr2.length ? strArr2[8] : C14766148968941961570.d("0x%02x", 8), i == 0 ? "" : K15662838989169835869.d[i]);
                    logger.getClass();
                    throw e;
                }
            default:
                this.a.s(iL);
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0113, code lost:
    
        r9.k(dev.epro.r0.F12902864952249894497.b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dev.epro.r0.Q9103558464140585130 r17, int r18, int r19, final int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M15575253401561633137.c(dev.epro.r0.Q9103558464140585130, int, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final List d(int i, int i2, int i3, int i4) throws IOException {
        B4727321331707555656 b4727321331707555656 = this.b;
        b4727321331707555656.d = i;
        b4727321331707555656.e = i2;
        b4727321331707555656.b = i3;
        b4727321331707555656.c = i4;
        P14068990878373664744 p14068990878373664744 = this.c;
        T13344602445187831655 t13344602445187831655 = p14068990878373664744.d;
        while (!t13344602445187831655.b()) {
            byte bD = t13344602445187831655.d();
            byte[] bArr = L14928198200995638215.a;
            int i5 = bD & 255;
            if (i5 == 128) {
                Q11088980322693754445.h("index == 0");
                return null;
            }
            if ((bD & 128) == 128) {
                int iF = p14068990878373664744.f(i5, 127);
                int i6 = iF - 1;
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
                Q11088980322693754445.h(G6547577305291411977.n(iF, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                O12229768880637238015[] o12229768880637238015Arr3 = C17517635496846834643.a;
                P5124777957357031757 p5124777957357031757E = p14068990878373664744.e();
                C17517635496846834643.a(p5124777957357031757E);
                p14068990878373664744.d(new O12229768880637238015(p5124777957357031757E, p14068990878373664744.e()));
            } else if ((bD & 64) == 64) {
                p14068990878373664744.d(new O12229768880637238015(p14068990878373664744.c(p14068990878373664744.f(i5, 63) - 1), p14068990878373664744.e()));
            } else if ((bD & 32) == 32) {
                int iF2 = p14068990878373664744.f(i5, 31);
                p14068990878373664744.a = iF2;
                if (iF2 < 0 || iF2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + p14068990878373664744.a);
                }
                int i7 = p14068990878373664744.h;
                if (iF2 < i7) {
                    if (iF2 == 0) {
                        O12229768880637238015[] o12229768880637238015Arr4 = p14068990878373664744.e;
                        O5378677881740157249.x0(0, o12229768880637238015Arr4.length, null, o12229768880637238015Arr4);
                        p14068990878373664744.f = p14068990878373664744.e.length - 1;
                        p14068990878373664744.g = 0;
                        p14068990878373664744.h = 0;
                    } else {
                        p14068990878373664744.b(i7 - iF2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                O12229768880637238015[] o12229768880637238015Arr5 = C17517635496846834643.a;
                P5124777957357031757 p5124777957357031757E2 = p14068990878373664744.e();
                C17517635496846834643.a(p5124777957357031757E2);
                p14068990878373664744.a(new O12229768880637238015(p5124777957357031757E2, p14068990878373664744.e()));
            } else {
                p14068990878373664744.a(new O12229768880637238015(p14068990878373664744.c(p14068990878373664744.f(i5, 15) - 1), p14068990878373664744.e()));
            }
        }
        ArrayList arrayList = p14068990878373664744.b;
        List listD1 = R9411874267597469228.d1(arrayList);
        arrayList.clear();
        p14068990878373664744.c = 0L;
        return listD1;
    }

    public final void e(Q9103558464140585130 q9103558464140585130, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            Q11088980322693754445.h("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte bD = this.a.d();
            byte[] bArr = L14928198200995638215.a;
            i4 = bD & 255;
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
        List listD = d(Z860808776098365610.H(i, i2, i4), i4, i2, i3);
        A13573370436844979007 a13573370436844979007 = q9103558464140585130.b;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            Z9658010704151025794.b(a13573370436844979007.i, a13573370436844979007.c + '[' + i3 + "] onHeaders", new F3589725160299670242(a13573370436844979007, i3, listD, z2));
            return;
        }
        synchronized (a13573370436844979007) {
            W10382756971622296125 w10382756971622296125C = a13573370436844979007.c(i3);
            if (w10382756971622296125C != null) {
                w10382756971622296125C.k(C14766148968941961570.h(listD), z2);
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
            W10382756971622296125 w10382756971622296125 = new W10382756971622296125(i3, a13573370436844979007, false, z2, C14766148968941961570.h(listD));
            a13573370436844979007.d = i3;
            a13573370436844979007.b.put(Integer.valueOf(i3), w10382756971622296125);
            Z9658010704151025794.b(a13573370436844979007.g.d(), a13573370436844979007.c + '[' + i3 + "] onStream", new O9814524300768724052(a13573370436844979007, w10382756971622296125, (byte) 13));
        }
    }

    public final void g(Q9103558464140585130 q9103558464140585130, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            Q11088980322693754445.h("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        byte b = 0;
        if ((i2 & 8) != 0) {
            byte bD = this.a.d();
            byte[] bArr = L14928198200995638215.a;
            i4 = bD & 255;
        } else {
            i4 = 0;
        }
        int iG = this.a.g() & Integer.MAX_VALUE;
        List listD = d(Z860808776098365610.H(i - 4, i2, i4), i4, i2, i3);
        A13573370436844979007 a13573370436844979007 = q9103558464140585130.b;
        synchronized (a13573370436844979007) {
            if (a13573370436844979007.y.contains(Integer.valueOf(iG))) {
                a13573370436844979007.j(iG, N10274084507843431211.PROTOCOL_ERROR);
                return;
            }
            a13573370436844979007.y.add(Integer.valueOf(iG));
            Z9658010704151025794.b(a13573370436844979007.i, a13573370436844979007.c + '[' + iG + "] onRequest", new F3589725160299670242(a13573370436844979007, iG, listD, b));
        }
    }
}
