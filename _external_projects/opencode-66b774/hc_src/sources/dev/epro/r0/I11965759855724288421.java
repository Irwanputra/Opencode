package dev.epro.r0;

import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class I11965759855724288421 extends Z17471428274427141949 implements Z3857703353417784960, G13991919739136867102, I5164649337253478959 {
    public static final P16607035664026122700 s = new P16607035664026122700((byte) 2);
    public static final P16607035664026122700 t = new P16607035664026122700((byte) 3);
    public G11446432889051344197 f;
    public F4096073349764486348 g;
    public L12639328004344855510 h;
    public F4096073349764486348 i;
    public N14167181018348403125 j;
    public A4559761392562572984 k;
    public boolean l;
    public A4559761392562572984 m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f283o;
    public final I18227652366819457368 p = new I18227652366819457368(this, 0);
    public G6575252167976303972 q;
    public A4559761392562572984 r;

    public static void N0(Y4989033692226475498 y4989033692226475498) {
        V13058232089047844042 v13058232089047844042;
        Y4989033692226475498 y49890336922264754982 = y4989033692226475498.v;
        H11725168162114556860 h11725168162114556860 = y4989033692226475498.u;
        if (!S10823041268949770285.t(y49890336922264754982 != null ? y49890336922264754982.u : null, h11725168162114556860)) {
            h11725168162114556860.G.p.y.f();
            return;
        }
        P10552808509296666343 v = h11725168162114556860.G.p.v();
        if (v == null || (v13058232089047844042 = ((T8458668874796040341) v).y) == null) {
            return;
        }
        v13058232089047844042.f();
    }

    @Override // dev.epro.r0.J4720286603213127984
    public boolean A() {
        return false;
    }

    public abstract B1029012102904255937 B0();

    public abstract boolean F0();

    public abstract H11725168162114556860 G0();

    public abstract H11646813293457574213 H0();

    public abstract I11965759855724288421 I0();

    public abstract long J0();

    @Override // dev.epro.r0.G13991919739136867102
    public boolean L() {
        return G0().H();
    }

    public final G11446432889051344197 L0() {
        G11446432889051344197 g11446432889051344197 = this.f;
        if (g11446432889051344197 != null) {
            return g11446432889051344197;
        }
        G11446432889051344197 g114464328890513441972 = new G11446432889051344197(this);
        this.f = g114464328890513441972;
        return g114464328890513441972;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O0(E13273723708836014930 e13273723708836014930) {
        H11725168162114556860 h11725168162114556860;
        Object[] objArr = e13273723708836014930.b;
        long[] jArr = e13273723708836014930.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (h11725168162114556860 = (H11725168162114556860) ((D3072230964632682649) objArr[(i << 3) + i3]).get()) != null) {
                        if (A()) {
                            h11725168162114556860.T(false);
                        } else {
                            h11725168162114556860.V(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void Q0();

    public final void S0() {
        G6575252167976303972 g6575252167976303972 = this.q;
        if (g6575252167976303972 != null) {
            int i = g6575252167976303972.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((D9734197463427655843[]) g6575252167976303972.b)[i2] = null;
                ((float[]) g6575252167976303972.c)[i2] = Float.NaN;
                ((byte[]) g6575252167976303972.d)[i2] = 0;
            }
            g6575252167976303972.a = 0;
        }
        A4559761392562572984 a4559761392562572984 = this.r;
        if (a4559761392562572984 == null) {
            return;
        }
        Object[] objArr = a4559761392562572984.c;
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
                            O0((E13273723708836014930) objArr[(i3 << 3) + i5]);
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
        a4559761392562572984.a();
    }

    @Override // dev.epro.r0.Z17471428274427141949
    public final int c0(P777117574205674816 p777117574205674816) {
        int u0;
        if (!F0() || (u0 = u0(p777117574205674816)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = p777117574205674816 instanceof F5308936833291684381;
        long j = this.e;
        return u0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // dev.epro.r0.Z3857703353417784960
    public final void n(boolean z) {
        I11965759855724288421 I0 = I0();
        H11725168162114556860 G0 = I0 != null ? I0.G0() : null;
        if (S10823041268949770285.t(G0, G0())) {
            this.l = z;
            return;
        }
        if ((G0 != null ? G0.G.d : null) != J4327291511168983093.c) {
            if ((G0 != null ? G0.G.d : null) != J4327291511168983093.d) {
                return;
            }
        }
        this.l = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(dev.epro.r0.H11725168162114556860 r32, dev.epro.r0.D9734197463427655843 r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I11965759855724288421.s0(dev.epro.r0.H11725168162114556860, dev.epro.r0.D9734197463427655843):void");
    }

    @Override // dev.epro.r0.I5164649337253478959
    public final H11646813293457574213 t(int i, int i2, Map map, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            P753981624812481271.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new E15710334795292209930(i, i2, map, f4096073349764486348, f40960733497644863482, this);
    }

    public abstract int u0(P777117574205674816 p777117574205674816);

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(final N14167181018348403125 n14167181018348403125, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        H11725168162114556860 h11725168162114556860;
        boolean z2;
        int i;
        char c2;
        long j6;
        B4499109999593241705 snapshotObserver;
        A4559761392562572984 a4559761392562572984 = this.r;
        G6575252167976303972 g6575252167976303972 = this.q;
        if (g6575252167976303972 == null) {
            g6575252167976303972 = new G6575252167976303972((byte) 4);
            this.q = g6575252167976303972;
        }
        G6575252167976303972 g65752521679763039722 = g6575252167976303972;
        Y633750919412282388 y633750919412282388 = G0().n;
        if (y633750919412282388 != null && (snapshotObserver = ((S7974369370986781936) y633750919412282388).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(n14167181018348403125, s, new B13729205492206812220() { // from class: dev.epro.r0.A10890032050191812355
                @Override // dev.epro.r0.B13729205492206812220
                public final Object invoke() {
                    I11965759855724288421 i11965759855724288421 = I11965759855724288421.this;
                    i11965759855724288421.L0().a = false;
                    i11965759855724288421.L0().b = j;
                    i11965759855724288421.L0().c = j2;
                    F4096073349764486348 e = n14167181018348403125.a.e();
                    if (e != null) {
                        e.invoke(i11965759855724288421.L0());
                    }
                    return O9245300239821758723.a;
                }
            });
        }
        boolean A = A();
        E13273723708836014930 e13273723708836014930 = (E13273723708836014930) g65752521679763039722.e;
        E13273723708836014930 e132737237088360149302 = (E13273723708836014930) g65752521679763039722.f;
        int i2 = g65752521679763039722.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) g65752521679763039722.d)[i3];
            if (b == 3) {
                D9734197463427655843 d9734197463427655843 = ((D9734197463427655843[]) g65752521679763039722.b)[i3];
                d9734197463427655843.getClass();
                e132737237088360149302.k(d9734197463427655843);
            } else if (b != 0 && a4559761392562572984 != null) {
                D9734197463427655843 d97341974634276558432 = ((D9734197463427655843[]) g65752521679763039722.b)[i3];
                d97341974634276558432.getClass();
                E13273723708836014930 e132737237088360149303 = (E13273723708836014930) a4559761392562572984.l(d97341974634276558432);
                if (e132737237088360149303 != null) {
                    e13273723708836014930.j(e132737237088360149303);
                }
            }
        }
        int i4 = g65752521679763039722.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) g65752521679763039722.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                D9734197463427655843[] d9734197463427655843Arr = (D9734197463427655843[]) g65752521679763039722.b;
                d9734197463427655843Arr[i6 - i5] = d9734197463427655843Arr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = g65752521679763039722.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((D9734197463427655843[]) g65752521679763039722.b)[i8] = null;
        }
        g65752521679763039722.a -= i5;
        I11965759855724288421 I0 = I0();
        Object[] objArr = e132737237088360149302.b;
        long[] jArr = e132737237088360149302.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            D9734197463427655843 d97341974634276558433 = (D9734197463427655843) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            I11965759855724288421 i11965759855724288421 = I0 == null ? this : I0;
                            i = i9;
                            I11965759855724288421 i119657598557242884212 = i11965759855724288421;
                            while (true) {
                                G6575252167976303972 g65752521679763039723 = i119657598557242884212.q;
                                if (g65752521679763039723 != null) {
                                    z2 = A;
                                    if (O5378677881740157249.j0(d97341974634276558433, (D9734197463427655843[]) g65752521679763039723.b)) {
                                        break;
                                    }
                                } else {
                                    z2 = A;
                                }
                                I11965759855724288421 I02 = i119657598557242884212.I0();
                                if (I02 == null) {
                                    break;
                                }
                                i119657598557242884212 = I02;
                                A = z2;
                            }
                            A4559761392562572984 a45597613925625729842 = i119657598557242884212.r;
                            E13273723708836014930 e132737237088360149304 = a45597613925625729842 != null ? (E13273723708836014930) a45597613925625729842.l(d97341974634276558433) : null;
                            if (e132737237088360149304 != null) {
                                i11965759855724288421.O0(e132737237088360149304);
                            }
                        } else {
                            z2 = A;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        A = z2;
                    }
                    z = A;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = A;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                A = z;
                i9 = 8;
            }
        } else {
            z = A;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        e132737237088360149302.b();
        Object[] objArr2 = e13273723708836014930.b;
        long[] jArr2 = e13273723708836014930.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (h11725168162114556860 = (H11725168162114556860) ((D3072230964632682649) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                h11725168162114556860.T(false);
                            } else {
                                h11725168162114556860.V(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        e13273723708836014930.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(dev.epro.r0.H11646813293457574213 r28) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.I11965759855724288421.x0(dev.epro.r0.H11646813293457574213):void");
    }

    public abstract I11965759855724288421 z0();
}
