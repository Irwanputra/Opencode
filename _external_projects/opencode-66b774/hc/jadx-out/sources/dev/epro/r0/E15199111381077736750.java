package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
final class E15199111381077736750 extends A8269341136279542501 {
    public final F11522267504195649243 a;

    public E15199111381077736750(F11522267504195649243 f11522267504195649243) {
        this.a = f11522267504195649243;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        R4743829846443809013 r4743829846443809013 = new R4743829846443809013();
        r4743829846443809013.f468o = this.a;
        r4743829846443809013.p = 1.0f;
        return r4743829846443809013;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        R4743829846443809013 r4743829846443809013 = (R4743829846443809013) r15896830329318850690;
        r4743829846443809013.f468o = this.a;
        r4743829846443809013.p = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E15199111381077736750) {
            return this.a == ((E15199111381077736750) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }
}
