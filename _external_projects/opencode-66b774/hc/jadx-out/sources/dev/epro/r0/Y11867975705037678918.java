package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
final class Y11867975705037678918 extends A8269341136279542501 {
    public final B13729205492206812220 a;

    public Y11867975705037678918(B13729205492206812220 b13729205492206812220) {
        this.a = b13729205492206812220;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        return new R15440331276160296439(this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((R15440331276160296439) r15896830329318850690).q = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y11867975705037678918) {
            return this.a == ((Y11867975705037678918) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
