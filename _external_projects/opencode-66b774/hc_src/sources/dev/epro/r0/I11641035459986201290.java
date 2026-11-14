package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class I11641035459986201290 extends A8269341136279542501 {
    public final O9814524300768724052 a;

    public I11641035459986201290(O9814524300768724052 o9814524300768724052) {
        this.a = o9814524300768724052;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        T14719393505356666 t14719393505356666 = new T14719393505356666();
        t14719393505356666.f497o = this.a;
        return t14719393505356666;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((T14719393505356666) r15896830329318850690).f497o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I11641035459986201290) {
            return this.a == ((I11641035459986201290) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
