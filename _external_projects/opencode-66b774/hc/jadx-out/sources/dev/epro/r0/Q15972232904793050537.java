package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q15972232904793050537 extends A8269341136279542501 {
    public final M11181104712105445833 a;
    public final S16571168858015125610 b;
    public final U14340554418656580554 c;
    public final F4096073349764486348 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final F4096073349764486348 j;
    public final F4096073349764486348 k;

    public Q15972232904793050537(M11181104712105445833 m11181104712105445833, S16571168858015125610 s16571168858015125610, U14340554418656580554 u14340554418656580554, F4096073349764486348 f4096073349764486348, int i, boolean z, int i2, int i3, List list, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483) {
        this.a = m11181104712105445833;
        this.b = s16571168858015125610;
        this.c = u14340554418656580554;
        this.d = f4096073349764486348;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = f40960733497644863482;
        this.k = f40960733497644863483;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new P16897622849367240553(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null, this.k);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        boolean z;
        P16897622849367240553 p16897622849367240553 = (P16897622849367240553) r15896830329318850690;
        S16571168858015125610 s16571168858015125610 = p16897622849367240553.p;
        S16571168858015125610 s165711688580151256102 = this.b;
        if (s165711688580151256102 != s16571168858015125610) {
            if (!s165711688580151256102.a.b(s16571168858015125610.a)) {
                z = true;
            }
            p16897622849367240553.h1(z, p16897622849367240553.m1(this.a), p16897622849367240553.l1(this.b, this.i, this.h, this.g, this.f, this.c, this.e), p16897622849367240553.k1(this.d, this.j, null, this.k));
        }
        s165711688580151256102.getClass();
        z = false;
        p16897622849367240553.h1(z, p16897622849367240553.m1(this.a), p16897622849367240553.l1(this.b, this.i, this.h, this.g, this.f, this.c, this.e), p16897622849367240553.k1(this.d, this.j, null, this.k));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q15972232904793050537)) {
            return false;
        }
        Q15972232904793050537 q15972232904793050537 = (Q15972232904793050537) obj;
        return S10823041268949770285.t(this.a, q15972232904793050537.a) && S10823041268949770285.t(this.b, q15972232904793050537.b) && S10823041268949770285.t(this.i, q15972232904793050537.i) && S10823041268949770285.t(this.c, q15972232904793050537.c) && this.d == q15972232904793050537.d && this.k == q15972232904793050537.k && this.e == q15972232904793050537.e && this.f == q15972232904793050537.f && this.g == q15972232904793050537.g && this.h == q15972232904793050537.h && this.j == q15972232904793050537.j;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + G11450220448113054352.c(this.b, this.a.hashCode() * 31, 31)) * 31;
        F4096073349764486348 f4096073349764486348 = this.d;
        int i = (((G6547577305291411977.i(X2485016533998461232.f(this.e, (iHashCode + (f4096073349764486348 != null ? f4096073349764486348.hashCode() : 0)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode2 = (i + (list != null ? list.hashCode() : 0)) * 31;
        F4096073349764486348 f40960733497644863482 = this.j;
        int iHashCode3 = (iHashCode2 + (f40960733497644863482 != null ? f40960733497644863482.hashCode() : 0)) * 29791;
        F4096073349764486348 f40960733497644863483 = this.k;
        return iHashCode3 + (f40960733497644863483 != null ? f40960733497644863483.hashCode() : 0);
    }
}
