package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A16702659903939584452 implements dev.epro.r0.B1029012102904255937 {
    public final dev.epro.r0.L5844152868342410893 a;

    public A16702659903939584452(dev.epro.r0.L5844152868342410893 l5844152868342410893) {
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
    public final dev.epro.r0.S6349823729575121924 E(dev.epro.r0.B1029012102904255937 b1029012102904255937, boolean z) {
        return this.a.u.E(b1029012102904255937, z);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long N() {
        dev.epro.r0.L5844152868342410893 l5844152868342410893 = this.a;
        return (((long) ((dev.epro.r0.Z17471428274427141949) l5844152868342410893).a) << 32) | (((long) ((dev.epro.r0.Z17471428274427141949) l5844152868342410893).b) & 4294967295L);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long O(long j) {
        return this.a.u.O(dev.epro.r0.L2216691091636065972.f(j, a()));
    }

    public final long a() {
        dev.epro.r0.L5844152868342410893 l5844152868342410893 = this.a;
        dev.epro.r0.L5844152868342410893 l5844152868342410893I = dev.epro.r0.M18113111391818111737.I(l5844152868342410893);
        return dev.epro.r0.L2216691091636065972.e(h(l5844152868342410893I.x, 0L), l5844152868342410893.u.h(l5844152868342410893I.u, 0L));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long b(long j) {
        return this.a.u.b(dev.epro.r0.L2216691091636065972.f(j, a()));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long g(long j) {
        return dev.epro.r0.L2216691091636065972.f(this.a.u.g(j), a());
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long h(dev.epro.r0.B1029012102904255937 b1029012102904255937, long j) {
        boolean z = b1029012102904255937 instanceof dev.epro.r0.A16702659903939584452;
        dev.epro.r0.L5844152868342410893 l5844152868342410893 = this.a;
        if (!z) {
            dev.epro.r0.L5844152868342410893 l5844152868342410893I = dev.epro.r0.M18113111391818111737.I(l5844152868342410893);
            dev.epro.r0.Y4989033692226475498 y4989033692226475498 = l5844152868342410893I.u;
            long jE = dev.epro.r0.L2216691091636065972.e(h(l5844152868342410893I.x, j), (4294967295L & ((long) java.lang.Float.floatToRawIntBits((int) (l5844152868342410893I.v & 4294967295L)))) | (java.lang.Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            dev.epro.r0.Y4989033692226475498 y4989033692226475498U = y4989033692226475498.u();
            if (y4989033692226475498U != null) {
                y4989033692226475498 = y4989033692226475498U;
            }
            return dev.epro.r0.L2216691091636065972.f(jE, y4989033692226475498.h(b1029012102904255937, 0L));
        }
        dev.epro.r0.L5844152868342410893 l58441528683424108932 = ((dev.epro.r0.A16702659903939584452) b1029012102904255937).a;
        dev.epro.r0.Y4989033692226475498 y49890336922264754982 = l58441528683424108932.u;
        y49890336922264754982.o1();
        dev.epro.r0.L5844152868342410893 l5844152868342410893C1 = l5844152868342410893.u.a1(y49890336922264754982).c1();
        if (l5844152868342410893C1 != null) {
            long jC = dev.epro.r0.Q2551293802323679034.c(dev.epro.r0.Q2551293802323679034.d(l58441528683424108932.V0(l5844152868342410893C1, false), dev.epro.r0.V1475975160983963926.O(j)), l5844152868342410893.V0(l5844152868342410893C1, false));
            return (((long) java.lang.Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        dev.epro.r0.L5844152868342410893 l5844152868342410893I2 = dev.epro.r0.M18113111391818111737.I(l58441528683424108932);
        long jD = dev.epro.r0.Q2551293802323679034.d(dev.epro.r0.Q2551293802323679034.d(l58441528683424108932.V0(l5844152868342410893I2, false), l5844152868342410893I2.v), dev.epro.r0.V1475975160983963926.O(j));
        dev.epro.r0.L5844152868342410893 l5844152868342410893I3 = dev.epro.r0.M18113111391818111737.I(l5844152868342410893);
        long jC2 = dev.epro.r0.Q2551293802323679034.c(jD, dev.epro.r0.Q2551293802323679034.d(l5844152868342410893.V0(l5844152868342410893I3, false), l5844152868342410893I3.v));
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        dev.epro.r0.Y4989033692226475498 y49890336922264754983 = l5844152868342410893I3.u.w;
        y49890336922264754983.getClass();
        dev.epro.r0.Y4989033692226475498 y49890336922264754984 = l5844152868342410893I2.u.w;
        y49890336922264754984.getClass();
        return y49890336922264754983.h(y49890336922264754984, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final void i(dev.epro.r0.B1029012102904255937 b1029012102904255937, float[] fArr) {
        this.a.u.i(b1029012102904255937, fArr);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long j(long j) {
        return this.a.u.j(dev.epro.r0.L2216691091636065972.f(j, a()));
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final dev.epro.r0.B1029012102904255937 l() {
        dev.epro.r0.L5844152868342410893 l5844152868342410893C1;
        if (!C()) {
            dev.epro.r0.P753981624812481271.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        dev.epro.r0.Y4989033692226475498 y4989033692226475498 = ((dev.epro.r0.Y4989033692226475498) this.a.u.u.F.e).w;
        if (y4989033692226475498 == null || (l5844152868342410893C1 = y4989033692226475498.c1()) == null) {
            return null;
        }
        return l5844152868342410893C1.x;
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long r(dev.epro.r0.B1029012102904255937 b1029012102904255937, long j) {
        return h(b1029012102904255937, j);
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final dev.epro.r0.B1029012102904255937 u() {
        dev.epro.r0.L5844152868342410893 l5844152868342410893C1;
        if (!C()) {
            dev.epro.r0.P753981624812481271.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        dev.epro.r0.Y4989033692226475498 y4989033692226475498 = this.a.u.w;
        if (y4989033692226475498 == null || (l5844152868342410893C1 = y4989033692226475498.c1()) == null) {
            return null;
        }
        return l5844152868342410893C1.x;
    }

    @Override // dev.epro.r0.B1029012102904255937
    public final long z(long j) {
        return dev.epro.r0.L2216691091636065972.f(this.a.u.z(j), a());
    }
}
