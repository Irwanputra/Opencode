package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D9359986064522891875 implements E9133045636215945243 {
    public final G1892398518770611911 a = new G1892398518770611911();
    public final U9803441765912152712 b = new U9803441765912152712();
    public final Object c;

    public D9359986064522891875(Object obj) {
        this.c = obj;
    }

    public final void a(Z5153954235810715664 z5153954235810715664, E1005111105761972824 e1005111105761972824) {
        Exception exc;
        G1892398518770611911 g1892398518770611911 = this.a;
        int i = g1892398518770611911.b;
        U9803441765912152712 u9803441765912152712 = new U9803441765912152712();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            U9803441765912152712 u98034417659121527122 = this.b;
            if (i2 >= i) {
                if (i3 != u98034417659121527122.b) {
                    N2332913310205178802.a("Applier operation size mismatch");
                }
                u98034417659121527122.d();
                g1892398518770611911.b = 0;
                z5153954235810715664.k();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (g1892398518770611911.c(i2)) {
                        case 0:
                            z5153954235810715664.t();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            z5153954235810715664.h(u98034417659121527122.f(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            z5153954235810715664.m(g1892398518770611911.c(i4), g1892398518770611911.c(i6));
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    z5153954235810715664.l(g1892398518770611911.c(i4), g1892398518770611911.c(i7), g1892398518770611911.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case 4:
                            z5153954235810715664.a();
                            i2 = i4;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            z5153954235810715664.g(g1892398518770611911.c(i4), u98034417659121527122.f(i3));
                            i3 = i9;
                        case 6:
                            i2 += 2;
                            try {
                                g1892398518770611911.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case 7:
                            int i11 = i3 + 1;
                            Object f = u98034417659121527122.f(i3);
                            f.getClass();
                            V12319504402545346730.s(2, f);
                            i3 += 2;
                            z5153954235810715664.o((L12639328004344855510) f, u98034417659121527122.f(i11));
                            i2 = i4;
                        case 8:
                            Object obj = z5153954235810715664.c;
                            if (obj instanceof Y1249283782686518426) {
                                Y1249283782686518426 y1249283782686518426 = (Y1249283782686518426) obj;
                                if (((D389890677992184566) e1005111105761972824.e).l(y1249283782686518426)) {
                                    y1249283782686518426.g();
                                }
                            }
                            u9803441765912152712.a(obj);
                            z5153954235810715664.i();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (Throwable th) {
                z5153954235810715664.k();
                throw th;
            }
            exc = e3;
            throw new N5080615404647649127(u98034417659121527122, u9803441765912152712, g1892398518770611911, i2 - 1, exc);
        }
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final Object f() {
        return this.c;
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void g(int i, Object obj) {
        G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(5);
        g1892398518770611911.a(i);
        this.b.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void h(Object obj) {
        this.a.a(1);
        this.b.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void i() {
        this.a.a(8);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void j(int i, Object obj) {
        G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(6);
        g1892398518770611911.a(i);
        this.b.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void l(int i, int i2, int i3) {
        G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(3);
        g1892398518770611911.a(i);
        g1892398518770611911.a(i2);
        g1892398518770611911.a(i3);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void m(int i, int i2) {
        G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(2);
        g1892398518770611911.a(i);
        g1892398518770611911.a(i2);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void o(L12639328004344855510 l12639328004344855510, Object obj) {
        this.a.a(7);
        U9803441765912152712 u9803441765912152712 = this.b;
        u9803441765912152712.a(l12639328004344855510);
        u9803441765912152712.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void t() {
        this.a.a(0);
    }
}
