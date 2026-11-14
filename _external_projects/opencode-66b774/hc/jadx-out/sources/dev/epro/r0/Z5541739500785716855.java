package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
final class Z5541739500785716855 extends A8269341136279542501 {
    public final String a;

    public Z5541739500785716855(String str) {
        this.a = str;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        Z16791447482659517775 z16791447482659517775 = new Z16791447482659517775();
        z16791447482659517775.f601o = this.a;
        return z16791447482659517775;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((Z16791447482659517775) r15896830329318850690).f601o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z5541739500785716855)) {
            return false;
        }
        return this.a.equals(((Z5541739500785716855) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
