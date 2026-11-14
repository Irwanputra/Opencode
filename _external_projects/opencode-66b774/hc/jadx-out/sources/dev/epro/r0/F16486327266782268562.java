package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F16486327266782268562 implements C6935141804827476266 {
    public final G16768067413993841943 a;
    public final E686369837194379706 b;
    public final N12245111110189169079 c;

    public F16486327266782268562(G16768067413993841943 g16768067413993841943, W5545067588094269489 w5545067588094269489, N12245111110189169079 n12245111110189169079) {
        this.a = g16768067413993841943;
        this.b = w5545067588094269489;
        this.c = n12245111110189169079;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final int a() {
        return this.b.x().b;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final Object b(int i) {
        Object objJ = this.c.j(i);
        return objJ == null ? this.b.y(i) : objJ;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final void d(int i, Object obj, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-1201380429);
        int i3 = (m3727281027331139839.d(i) ? 4 : 2) | i2 | (m3727281027331139839.h(obj) ? 32 : 16) | (m3727281027331139839.f(this) ? 256 : 128);
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            C12265524002282074474.v(obj, i, this.a.y, S10823041268949770285.T(1142237095, new C2534700173735894684(this, i, (byte) 7), m3727281027331139839), m3727281027331139839, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new G2192189236223710848(this, i, obj, i2, (byte) 12);
        }
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final int e(Object obj) {
        return this.c.i(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F16486327266782268562)) {
            return false;
        }
        return S10823041268949770285.t(this.b, ((F16486327266782268562) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
