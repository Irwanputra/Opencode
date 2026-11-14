package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A16702659903939584452 implements B1029012102904255937 {
    public final L5844152868342410893 a;

    public A16702659903939584452(L5844152868342410893 l5844152868342410893) {
        this.a = l5844152868342410893;
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final boolean C() {
        return this.a.u.e1().n;
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final void D(float[] fArr) {
        this.a.u.D(fArr);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final S6349823729575121924 E(B1029012102904255937 b1029012102904255937, boolean z) {
        return this.a.u.E(b1029012102904255937, z);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long N() {
        L5844152868342410893 l5844152868342410893 = this.a;
        return (l5844152868342410893.a << 32) | (l5844152868342410893.b & 4294967295L);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long O(long j) {
        return this.a.u.O(L2216691091636065972.f(j, a()));
    }

    public final long a() {
        L5844152868342410893 l5844152868342410893 = this.a;
        L5844152868342410893 I = M18113111391818111737.I(l5844152868342410893);
        return L2216691091636065972.e(h(I.x, 0L), l5844152868342410893.u.h(I.u, 0L));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long b(long j) {
        return this.a.u.b(L2216691091636065972.f(j, a()));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long g(long j) {
        return L2216691091636065972.f(this.a.u.g(j), a());
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long h(B1029012102904255937 b1029012102904255937, long j) {
        boolean z = b1029012102904255937 instanceof A16702659903939584452;
        L5844152868342410893 l5844152868342410893 = this.a;
        if (!z) {
            L5844152868342410893 I = M18113111391818111737.I(l5844152868342410893);
            B1029012102904255937 b10290121029042559372 = I.u;
            long h = h(I.x, j);
            float f = (int) (I.v & 4294967295L);
            long e = L2216691091636065972.e(h, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            B1029012102904255937 u = b10290121029042559372.u();
            if (u != null) {
                b10290121029042559372 = u;
            }
            return L2216691091636065972.f(e, ((Y4989033692226475498) b10290121029042559372).h(b1029012102904255937, 0L));
        }
        L5844152868342410893 l58441528683424108932 = ((A16702659903939584452) b1029012102904255937).a;
        Y4989033692226475498 y4989033692226475498 = l58441528683424108932.u;
        y4989033692226475498.o1();
        L5844152868342410893 c1 = l5844152868342410893.u.a1(y4989033692226475498).c1();
        if (c1 != null) {
            long c = Q2551293802323679034.c(Q2551293802323679034.d(l58441528683424108932.V0(c1, false), V1475975160983963926.O(j)), l5844152868342410893.V0(c1, false));
            return (Float.floatToRawIntBits((int) (c >> 32)) << 32) | (Float.floatToRawIntBits((int) (c & 4294967295L)) & 4294967295L);
        }
        L5844152868342410893 I2 = M18113111391818111737.I(l58441528683424108932);
        long d = Q2551293802323679034.d(Q2551293802323679034.d(l58441528683424108932.V0(I2, false), I2.v), V1475975160983963926.O(j));
        L5844152868342410893 I3 = M18113111391818111737.I(l5844152868342410893);
        long c2 = Q2551293802323679034.c(d, Q2551293802323679034.d(l5844152868342410893.V0(I3, false), I3.v));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (c2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (c2 & 4294967295L)) & 4294967295L;
        Y4989033692226475498 y49890336922264754982 = I3.u.w;
        y49890336922264754982.getClass();
        Y4989033692226475498 y49890336922264754983 = I2.u.w;
        y49890336922264754983.getClass();
        return y49890336922264754982.h(y49890336922264754983, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final void i(B1029012102904255937 b1029012102904255937, float[] fArr) {
        this.a.u.i(b1029012102904255937, fArr);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long j(long j) {
        return this.a.u.j(L2216691091636065972.f(j, a()));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final B1029012102904255937 l() {
        L5844152868342410893 c1;
        if (!C()) {
            P753981624812481271.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Y4989033692226475498 y4989033692226475498 = ((Y4989033692226475498) this.a.u.u.F.e).w;
        if (y4989033692226475498 == null || (c1 = y4989033692226475498.c1()) == null) {
            return null;
        }
        return c1.x;
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long r(B1029012102904255937 b1029012102904255937, long j) {
        return h(b1029012102904255937, j);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final B1029012102904255937 u() {
        L5844152868342410893 c1;
        if (!C()) {
            P753981624812481271.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        Y4989033692226475498 y4989033692226475498 = this.a.u.w;
        if (y4989033692226475498 == null || (c1 = y4989033692226475498.c1()) == null) {
            return null;
        }
        return c1.x;
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long z(long j) {
        return L2216691091636065972.f(this.a.u.z(j), a());
    }
}
