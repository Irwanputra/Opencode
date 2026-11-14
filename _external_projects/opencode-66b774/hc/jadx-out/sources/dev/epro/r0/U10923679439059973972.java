package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
final class U10923679439059973972 extends A8269341136279542501 {
    public final F4096073349764486348 a;

    public U10923679439059973972(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        S1204837004756355294 s1204837004756355294 = new S1204837004756355294();
        s1204837004756355294.f477o = this.a;
        s1204837004756355294.p = true;
        return s1204837004756355294;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        S1204837004756355294 s1204837004756355294 = (S1204837004756355294) r15896830329318850690;
        F4096073349764486348 f4096073349764486348 = s1204837004756355294.f477o;
        F4096073349764486348 f40960733497644863482 = this.a;
        if (f4096073349764486348 != f40960733497644863482 || !s1204837004756355294.p) {
            R7033599853981556291.R(s1204837004756355294).V(false);
        }
        s1204837004756355294.f477o = f40960733497644863482;
        s1204837004756355294.p = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        U10923679439059973972 u10923679439059973972 = obj instanceof U10923679439059973972 ? (U10923679439059973972) obj : null;
        return u10923679439059973972 != null && this.a == u10923679439059973972.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
