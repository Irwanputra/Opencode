package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O10025701552426213584 extends A8269341136279542501 {
    public final G17854281415623469737 a;

    public O10025701552426213584(G17854281415623469737 g17854281415623469737) {
        this.a = g17854281415623469737;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        R16304995653816874473 r16304995653816874473 = new R16304995653816874473();
        r16304995653816874473.f465o = this.a;
        r16304995653816874473.p = true;
        return r16304995653816874473;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        R16304995653816874473 r16304995653816874473 = (R16304995653816874473) r15896830329318850690;
        r16304995653816874473.f465o = this.a;
        r16304995653816874473.p = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof O10025701552426213584) {
            return S10823041268949770285.t(this.a, ((O10025701552426213584) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + G6547577305291411977.i(this.a.hashCode() * 31, 31, false);
    }
}
