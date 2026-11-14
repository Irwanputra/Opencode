package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D6474964434458555331 implements dev.epro.r0.C6935141804827476266 {
    public final dev.epro.r0.W5896017744614017491 a;
    public final dev.epro.r0.V16530418555304444393 b;
    public final dev.epro.r0.N12245111110189169079 c;

    public D6474964434458555331(dev.epro.r0.W5896017744614017491 w5896017744614017491, dev.epro.r0.V16530418555304444393 v16530418555304444393, dev.epro.r0.N12245111110189169079 n12245111110189169079) {
        this.a = w5896017744614017491;
        this.b = v16530418555304444393;
        this.c = n12245111110189169079;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final int a() {
        return this.b.x().b;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final java.lang.Object b(int i) {
        java.lang.Object objJ = this.c.j(i);
        return objJ == null ? this.b.y(i) : objJ;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final java.lang.Object c(int i) {
        return this.b.v(i);
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final void d(int i, java.lang.Object obj, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        java.lang.Object obj2;
        dev.epro.r0.M3727281027331139839 m37272810273311398392;
        m3727281027331139839.b0(1493551140);
        int i4 = (m3727281027331139839.d(i) ? 4 : 2) | i2 | (m3727281027331139839.h(obj) ? 32 : 16) | (m3727281027331139839.f(this) ? 256 : 128);
        if (m3727281027331139839.R(i4 & 1, (i4 & 147) != 146)) {
            m37272810273311398392 = m3727281027331139839;
            dev.epro.r0.C12265524002282074474.v(obj, i, this.a.q, dev.epro.r0.S10823041268949770285.T(726189336, new dev.epro.r0.C2534700173735894684(this, i, (byte) 1), m3727281027331139839), m37272810273311398392, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
            obj2 = obj;
            i3 = i;
        } else {
            i3 = i;
            obj2 = obj;
            m37272810273311398392 = m3727281027331139839;
            m37272810273311398392.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.G2192189236223710848(this, i3, obj2, i2, (byte) 6);
        }
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final int e(java.lang.Object obj) {
        return this.c.i(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D6474964434458555331)) {
            return false;
        }
        return dev.epro.r0.S10823041268949770285.t(this.b, ((dev.epro.r0.D6474964434458555331) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
