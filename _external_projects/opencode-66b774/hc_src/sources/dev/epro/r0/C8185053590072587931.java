package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C8185053590072587931 implements CharSequence {
    public final List a;
    public final O18396636586660755082 b;
    public final CharSequence c;
    public final long d;
    public final F12478849263529740365 e;
    public final H9390398899829886498 f;

    public C8185053590072587931(CharSequence charSequence, long j, F12478849263529740365 f12478849263529740365, H9390398899829886498 h9390398899829886498, List list, List list2, O18396636586660755082 o18396636586660755082, int i) {
        f12478849263529740365 = (i & 4) != 0 ? null : f12478849263529740365;
        h9390398899829886498 = (i & 8) != 0 ? null : h9390398899829886498;
        list = (i & 16) != 0 ? null : list;
        o18396636586660755082 = (i & 64) != 0 ? null : o18396636586660755082;
        this.a = list;
        this.b = o18396636586660755082;
        this.c = charSequence instanceof C8185053590072587931 ? ((C8185053590072587931) charSequence).c : charSequence;
        this.d = T1335862270807194835.h(charSequence.length(), j);
        this.e = f12478849263529740365 != null ? new F12478849263529740365(T1335862270807194835.h(charSequence.length(), f12478849263529740365.a)) : null;
        this.f = h9390398899829886498 != null ? new H9390398899829886498(h9390398899829886498.a, new F12478849263529740365(T1335862270807194835.h(charSequence.length(), ((F12478849263529740365) h9390398899829886498.b).a))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.c.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8185053590072587931.class != obj.getClass()) {
            return false;
        }
        C8185053590072587931 c8185053590072587931 = (C8185053590072587931) obj;
        if (F12478849263529740365.c(this.d, c8185053590072587931.d) && S10823041268949770285.t(this.e, c8185053590072587931.e) && S10823041268949770285.t(this.f, c8185053590072587931.f) && S10823041268949770285.t(this.a, c8185053590072587931.a)) {
            return Z13168519540281190457.x(this.c, c8185053590072587931.c) && S10823041268949770285.t(this.b, c8185053590072587931.b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        int i = F12478849263529740365.c;
        int j = G6547577305291411977.j(hashCode, this.d, 31);
        F12478849263529740365 f12478849263529740365 = this.e;
        int hashCode2 = (j + (f12478849263529740365 != null ? Long.hashCode(f12478849263529740365.a) : 0)) * 31;
        H9390398899829886498 h9390398899829886498 = this.f;
        int hashCode3 = (hashCode2 + (h9390398899829886498 != null ? h9390398899829886498.hashCode() : 0)) * 31;
        List list = this.a;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        O18396636586660755082 o18396636586660755082 = this.b;
        return hashCode4 + (o18396636586660755082 != null ? o18396636586660755082.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.c.toString();
    }
}
