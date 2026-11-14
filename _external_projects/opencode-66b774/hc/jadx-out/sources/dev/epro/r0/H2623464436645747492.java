package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class H2623464436645747492 extends A8269341136279542501 {
    public final L1256556220631237103 a;
    public final G15527156457921655762 b;
    public final C1267176524613794288 c;
    public final float d;
    public final R3103059035698929241 e;

    public H2623464436645747492(L1256556220631237103 l1256556220631237103, G15527156457921655762 g15527156457921655762, C1267176524613794288 c1267176524613794288, float f, R3103059035698929241 r3103059035698929241) {
        this.a = l1256556220631237103;
        this.b = g15527156457921655762;
        this.c = c1267176524613794288;
        this.d = f;
        this.e = r3103059035698929241;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        T9938119293851550496 t9938119293851550496 = new T9938119293851550496();
        t9938119293851550496.f515o = this.a;
        t9938119293851550496.p = true;
        t9938119293851550496.q = this.b;
        t9938119293851550496.r = this.c;
        t9938119293851550496.s = this.d;
        t9938119293851550496.t = this.e;
        return t9938119293851550496;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        T9938119293851550496 t9938119293851550496 = (T9938119293851550496) r15896830329318850690;
        boolean z = t9938119293851550496.p;
        L1256556220631237103 l1256556220631237103 = this.a;
        boolean z2 = (z && W8572396779607072172.a(t9938119293851550496.f515o.d(), l1256556220631237103.d())) ? false : true;
        t9938119293851550496.f515o = l1256556220631237103;
        t9938119293851550496.p = true;
        t9938119293851550496.q = this.b;
        t9938119293851550496.r = this.c;
        t9938119293851550496.s = this.d;
        t9938119293851550496.t = this.e;
        if (z2) {
            D1286559660607336098.v(t9938119293851550496);
        }
        V1475975160983963926.D(t9938119293851550496);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H2623464436645747492)) {
            return false;
        }
        H2623464436645747492 h2623464436645747492 = (H2623464436645747492) obj;
        return S10823041268949770285.t(this.a, h2623464436645747492.a) && S10823041268949770285.t(this.b, h2623464436645747492.b) && S10823041268949770285.t(this.c, h2623464436645747492.c) && Float.compare(this.d, h2623464436645747492.d) == 0 && S10823041268949770285.t(this.e, h2623464436645747492.e);
    }

    public final int hashCode() {
        int iE = E12098517352909843120.e(this.d, (this.c.hashCode() + ((this.b.hashCode() + G6547577305291411977.i(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        R3103059035698929241 r3103059035698929241 = this.e;
        return iE + (r3103059035698929241 == null ? 0 : r3103059035698929241.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ")";
    }
}
