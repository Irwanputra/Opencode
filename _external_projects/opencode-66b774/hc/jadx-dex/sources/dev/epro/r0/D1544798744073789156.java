package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D1544798744073789156 implements dev.epro.r0.C6935141804827476266 {
    public final dev.epro.r0.E17523205116624666034 a;
    public final dev.epro.r0.D10662552791659878041 b;
    public final dev.epro.r0.Y675896210957211707 c;
    public final dev.epro.r0.N12245111110189169079 d;

    public D1544798744073789156(dev.epro.r0.E17523205116624666034 e17523205116624666034, dev.epro.r0.D10662552791659878041 d10662552791659878041, dev.epro.r0.Y675896210957211707 y675896210957211707, dev.epro.r0.N12245111110189169079 n12245111110189169079) {
        this.a = e17523205116624666034;
        this.b = d10662552791659878041;
        this.c = y675896210957211707;
        this.d = n12245111110189169079;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final int a() {
        return this.b.x().b;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final java.lang.Object b(int i) {
        java.lang.Object objJ = this.d.j(i);
        return objJ == null ? this.b.y(i) : objJ;
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final java.lang.Object c(int i) {
        return this.b.v(i);
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final void d(int i, java.lang.Object obj, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-462424778);
        int i3 = (m3727281027331139839.d(i) ? 4 : 2) | i2 | (m3727281027331139839.h(obj) ? 32 : 16) | (m3727281027331139839.f(this) ? 256 : 128);
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            dev.epro.r0.C12265524002282074474.v(obj, i, this.a.s, dev.epro.r0.S10823041268949770285.T(-824725566, new dev.epro.r0.C2534700173735894684(this, i, (byte) 2), m3727281027331139839), m3727281027331139839, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.G2192189236223710848(this, i, obj, i2, (byte) 8);
        }
    }

    @Override // dev.epro.r0.C6935141804827476266
    public final int e(java.lang.Object obj) {
        return this.d.i(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.D1544798744073789156)) {
            return false;
        }
        return dev.epro.r0.S10823041268949770285.t(this.b, ((dev.epro.r0.D1544798744073789156) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
