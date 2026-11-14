package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class D15073615446276282802 extends dev.epro.r0.A8269341136279542501 {
    public final float a;
    public final float b;

    public D15073615446276282802(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.K3306943059087435289 k3306943059087435289 = new dev.epro.r0.K3306943059087435289();
        k3306943059087435289.o = this.a;
        k3306943059087435289.p = this.b;
        return k3306943059087435289;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.K3306943059087435289 k3306943059087435289 = (dev.epro.r0.K3306943059087435289) r15896830329318850690;
        k3306943059087435289.o = this.a;
        k3306943059087435289.p = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.D15073615446276282802)) {
            return false;
        }
        dev.epro.r0.D15073615446276282802 d15073615446276282802 = (dev.epro.r0.D15073615446276282802) obj;
        return dev.epro.r0.A891803927997771281.b(this.a, d15073615446276282802.a) && dev.epro.r0.A891803927997771281.b(this.b, d15073615446276282802.b);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.b) + (java.lang.Float.hashCode(this.a) * 31);
    }
}
