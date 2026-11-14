package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
final class D15073615446276282802 extends A8269341136279542501 {
    public final float a;
    public final float b;

    public D15073615446276282802(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        K3306943059087435289 k3306943059087435289 = new K3306943059087435289();
        k3306943059087435289.f330o = this.a;
        k3306943059087435289.p = this.b;
        return k3306943059087435289;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        K3306943059087435289 k3306943059087435289 = (K3306943059087435289) r15896830329318850690;
        k3306943059087435289.f330o = this.a;
        k3306943059087435289.p = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D15073615446276282802)) {
            return false;
        }
        D15073615446276282802 d15073615446276282802 = (D15073615446276282802) obj;
        return A891803927997771281.b(this.a, d15073615446276282802.a) && A891803927997771281.b(this.b, d15073615446276282802.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
