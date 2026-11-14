package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class F12358110522655318322 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public F12358110522655318322(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new Q686808008070211503(new W15170032298606046665(), this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        Q686808008070211503 q686808008070211503 = (Q686808008070211503) r15896830329318850690;
        q686808008070211503.q = this.a;
        q686808008070211503.h1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F12358110522655318322) {
            return this.a == ((F12358110522655318322) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
