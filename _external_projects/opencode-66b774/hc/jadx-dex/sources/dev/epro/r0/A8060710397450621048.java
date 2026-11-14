package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A8060710397450621048 extends dev.epro.r0.A8269341136279542501 {
    public final float a;

    public A8060710397450621048(float f) {
        this.a = f;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.Y15287013968708367369 y15287013968708367369 = new dev.epro.r0.Y15287013968708367369();
        y15287013968708367369.o = this.a;
        return y15287013968708367369;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        ((dev.epro.r0.Y15287013968708367369) r15896830329318850690).o = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dev.epro.r0.A8060710397450621048) && java.lang.Float.compare(this.a, ((dev.epro.r0.A8060710397450621048) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.a);
    }

    public final java.lang.String toString() {
        return "ZIndexElement(zIndex=" + this.a + ")";
    }
}
