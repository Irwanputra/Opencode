package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G17151291860948256618 extends A8269341136279542501 {
    public final P10283164515565247229 a;

    public G17151291860948256618(P10283164515565247229 p10283164515565247229) {
        this.a = p10283164515565247229;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new D11634881167814338999(this.a, null);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        D11634881167814338999 d11634881167814338999 = (D11634881167814338999) r15896830329318850690;
        P10283164515565247229 p10283164515565247229 = d11634881167814338999.p;
        P10283164515565247229 p102831645155652472292 = this.a;
        if (S10823041268949770285.t(p10283164515565247229, p102831645155652472292)) {
            return;
        }
        d11634881167814338999.p = p102831645155652472292;
        if (d11634881167814338999.q) {
            d11634881167814338999.j1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof G17151291860948256618) && this.a.equals(((G17151291860948256618) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
