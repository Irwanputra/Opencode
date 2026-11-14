package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class E15199111381077736750 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.F11522267504195649243 a;

    public E15199111381077736750(dev.epro.r0.F11522267504195649243 f11522267504195649243) {
        this.a = f11522267504195649243;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.R4743829846443809013 r4743829846443809013 = new dev.epro.r0.R4743829846443809013();
        r4743829846443809013.o = this.a;
        r4743829846443809013.p = 1.0f;
        return r4743829846443809013;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.R4743829846443809013 r4743829846443809013 = (dev.epro.r0.R4743829846443809013) r15896830329318850690;
        r4743829846443809013.o = this.a;
        r4743829846443809013.p = 1.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.E15199111381077736750) {
            return this.a == ((dev.epro.r0.E15199111381077736750) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(1.0f) + (this.a.hashCode() * 31);
    }
}
