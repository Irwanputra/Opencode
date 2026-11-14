package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D9359986064522891875 implements dev.epro.r0.E9133045636215945243 {
    public final dev.epro.r0.G1892398518770611911 a = new dev.epro.r0.G1892398518770611911();
    public final dev.epro.r0.U9803441765912152712 b = new dev.epro.r0.U9803441765912152712();
    public final java.lang.Object c;

    public D9359986064522891875(java.lang.Object obj) {
        this.c = obj;
    }

    public final void a(dev.epro.r0.Z5153954235810715664 z5153954235810715664, dev.epro.r0.E1005111105761972824 e1005111105761972824) {
        java.lang.Exception exc;
        dev.epro.r0.G1892398518770611911 g1892398518770611911 = this.a;
        int i = g1892398518770611911.b;
        dev.epro.r0.U9803441765912152712 u9803441765912152712 = new dev.epro.r0.U9803441765912152712();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            dev.epro.r0.U9803441765912152712 u98034417659121527122 = this.b;
            if (i2 >= i) {
                if (i3 != u98034417659121527122.b) {
                    dev.epro.r0.N2332913310205178802.a("Applier operation size mismatch");
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
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            z5153954235810715664.h(u98034417659121527122.f(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            z5153954235810715664.m(g1892398518770611911.c(i4), g1892398518770611911.c(i6));
                            break;
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    z5153954235810715664.l(g1892398518770611911.c(i4), g1892398518770611911.c(i7), g1892398518770611911.c(i8));
                                } catch (java.lang.Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (java.lang.Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case 4:
                            z5153954235810715664.a();
                            i2 = i4;
                            break;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            z5153954235810715664.g(g1892398518770611911.c(i4), u98034417659121527122.f(i3));
                            i3 = i9;
                            break;
                        case 6:
                            i2 += 2;
                            try {
                                g1892398518770611911.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (java.lang.Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i11 = i3 + 1;
                            java.lang.Object objF = u98034417659121527122.f(i3);
                            objF.getClass();
                            dev.epro.r0.V12319504402545346730.s(2, objF);
                            i3 += 2;
                            z5153954235810715664.o((dev.epro.r0.L12639328004344855510) objF, u98034417659121527122.f(i11));
                            i2 = i4;
                            break;
                        case 8:
                            java.lang.Object obj = z5153954235810715664.c;
                            if (obj instanceof dev.epro.r0.Y1249283782686518426) {
                                dev.epro.r0.Y1249283782686518426 y1249283782686518426 = (dev.epro.r0.Y1249283782686518426) obj;
                                if (((dev.epro.r0.D389890677992184566) e1005111105761972824.e).l(y1249283782686518426)) {
                                    y1249283782686518426.g();
                                }
                            }
                            u9803441765912152712.a(obj);
                            z5153954235810715664.i();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (java.lang.Exception e4) {
                    exc = e4;
                    i2 = i4;
                }
            } catch (java.lang.Throwable th) {
                z5153954235810715664.k();
                throw th;
            }
            exc = e3;
            throw new dev.epro.r0.N5080615404647649127(u98034417659121527122, u9803441765912152712, g1892398518770611911, i2 - 1, exc);
        }
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final java.lang.Object f() {
        return this.c;
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void g(int i, java.lang.Object obj) {
        dev.epro.r0.G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(5);
        g1892398518770611911.a(i);
        this.b.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void h(java.lang.Object obj) {
        this.a.a(1);
        this.b.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void i() {
        this.a.a(8);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void j(int i, java.lang.Object obj) {
        dev.epro.r0.G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(6);
        g1892398518770611911.a(i);
        this.b.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void l(int i, int i2, int i3) {
        dev.epro.r0.G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(3);
        g1892398518770611911.a(i);
        g1892398518770611911.a(i2);
        g1892398518770611911.a(i3);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void m(int i, int i2) {
        dev.epro.r0.G1892398518770611911 g1892398518770611911 = this.a;
        g1892398518770611911.a(2);
        g1892398518770611911.a(i);
        g1892398518770611911.a(i2);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void o(dev.epro.r0.L12639328004344855510 l12639328004344855510, java.lang.Object obj) {
        this.a.a(7);
        dev.epro.r0.U9803441765912152712 u9803441765912152712 = this.b;
        u9803441765912152712.a(l12639328004344855510);
        u9803441765912152712.a(obj);
    }

    @Override // dev.epro.r0.E9133045636215945243
    public final void t() {
        this.a.a(0);
    }
}
