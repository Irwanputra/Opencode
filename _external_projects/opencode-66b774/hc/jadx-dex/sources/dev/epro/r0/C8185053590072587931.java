package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C8185053590072587931 implements java.lang.CharSequence {
    public final java.util.List a;
    public final dev.epro.r0.O18396636586660755082 b;
    public final java.lang.CharSequence c;
    public final long d;
    public final dev.epro.r0.F12478849263529740365 e;
    public final dev.epro.r0.H9390398899829886498 f;

    public C8185053590072587931(java.lang.CharSequence charSequence, long j, dev.epro.r0.F12478849263529740365 f12478849263529740365, dev.epro.r0.H9390398899829886498 h9390398899829886498, java.util.List list, java.util.List list2, dev.epro.r0.O18396636586660755082 o18396636586660755082, int i) {
        f12478849263529740365 = (i & 4) != 0 ? null : f12478849263529740365;
        h9390398899829886498 = (i & 8) != 0 ? null : h9390398899829886498;
        list = (i & 16) != 0 ? null : list;
        o18396636586660755082 = (i & 64) != 0 ? null : o18396636586660755082;
        this.a = list;
        this.b = o18396636586660755082;
        this.c = charSequence instanceof dev.epro.r0.C8185053590072587931 ? ((dev.epro.r0.C8185053590072587931) charSequence).c : charSequence;
        this.d = dev.epro.r0.T1335862270807194835.h(charSequence.length(), j);
        this.e = f12478849263529740365 != null ? new dev.epro.r0.F12478849263529740365(dev.epro.r0.T1335862270807194835.h(charSequence.length(), f12478849263529740365.a)) : null;
        this.f = h9390398899829886498 != null ? new dev.epro.r0.H9390398899829886498(h9390398899829886498.a, new dev.epro.r0.F12478849263529740365(dev.epro.r0.T1335862270807194835.h(charSequence.length(), ((dev.epro.r0.F12478849263529740365) h9390398899829886498.b).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c.charAt(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dev.epro.r0.C8185053590072587931.class != obj.getClass()) {
            return false;
        }
        dev.epro.r0.C8185053590072587931 c8185053590072587931 = (dev.epro.r0.C8185053590072587931) obj;
        if (dev.epro.r0.F12478849263529740365.c(this.d, c8185053590072587931.d) && dev.epro.r0.S10823041268949770285.t(this.e, c8185053590072587931.e) && dev.epro.r0.S10823041268949770285.t(this.f, c8185053590072587931.f) && dev.epro.r0.S10823041268949770285.t(this.a, c8185053590072587931.a)) {
            return dev.epro.r0.Z13168519540281190457.x(this.c, c8185053590072587931.c) && dev.epro.r0.S10823041268949770285.t(this.b, c8185053590072587931.b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        int i = dev.epro.r0.F12478849263529740365.c;
        int iJ = dev.epro.r0.G6547577305291411977.j(iHashCode, this.d, 31);
        dev.epro.r0.F12478849263529740365 f12478849263529740365 = this.e;
        int iHashCode2 = (iJ + (f12478849263529740365 != null ? java.lang.Long.hashCode(f12478849263529740365.a) : 0)) * 31;
        dev.epro.r0.H9390398899829886498 h9390398899829886498 = this.f;
        int iHashCode3 = (iHashCode2 + (h9390398899829886498 != null ? h9390398899829886498.hashCode() : 0)) * 31;
        java.util.List list = this.a;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        dev.epro.r0.O18396636586660755082 o18396636586660755082 = this.b;
        return iHashCode4 + (o18396636586660755082 != null ? o18396636586660755082.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return this.c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.c.toString();
    }
}
