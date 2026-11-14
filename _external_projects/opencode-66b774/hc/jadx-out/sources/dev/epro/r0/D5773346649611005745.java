package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
final class D5773346649611005745 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public D5773346649611005745(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        Z6132750525889585899 z6132750525889585899 = new Z6132750525889585899();
        z6132750525889585899.f604o = this.a;
        return z6132750525889585899;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((Z6132750525889585899) r15896830329318850690).f604o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D5773346649611005745) {
            return this.a == ((D5773346649611005745) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
