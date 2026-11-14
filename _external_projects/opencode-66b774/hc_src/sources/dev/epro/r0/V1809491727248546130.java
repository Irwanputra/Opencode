package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
final class V1809491727248546130 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public V1809491727248546130(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        G14374763775307753082 g14374763775307753082 = new G14374763775307753082();
        g14374763775307753082.f247o = this.a;
        return g14374763775307753082;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((G14374763775307753082) r15896830329318850690).f247o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V1809491727248546130) {
            return this.a == ((V1809491727248546130) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
