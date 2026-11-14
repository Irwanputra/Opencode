package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S3426947254695259356 extends A8269341136279542501 {
    public final C2148711509933735908 a;

    public S3426947254695259356(C2148711509933735908 c2148711509933735908) {
        this.a = c2148711509933735908;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        D7684223024353934705 d7684223024353934705 = new D7684223024353934705();
        d7684223024353934705.f210o = this.a;
        return d7684223024353934705;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        D7684223024353934705 d7684223024353934705 = (D7684223024353934705) r15896830329318850690;
        d7684223024353934705.f210o = this.a;
        E10717724117948616506.n(d7684223024353934705);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S3426947254695259356) {
            return this.a == ((S3426947254695259356) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
