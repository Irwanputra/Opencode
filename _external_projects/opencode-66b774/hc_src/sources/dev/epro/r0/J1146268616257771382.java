package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
final class J1146268616257771382 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public J1146268616257771382(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        R7626026470121583061 r7626026470121583061 = new R7626026470121583061();
        r7626026470121583061.f472o = this.a;
        return r7626026470121583061;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((R7626026470121583061) r15896830329318850690).f472o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J1146268616257771382) {
            return this.a == ((J1146268616257771382) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
