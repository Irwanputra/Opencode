package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
final class N14197335738847091403 extends A8269341136279542501 {
    public final H10681976249452161517 a;

    public N14197335738847091403(H10681976249452161517 h10681976249452161517) {
        this.a = h10681976249452161517;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        L9701652813171817009 l9701652813171817009 = new L9701652813171817009();
        l9701652813171817009.f355o = this.a;
        return l9701652813171817009;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        L9701652813171817009 l9701652813171817009 = (L9701652813171817009) r15896830329318850690;
        l9701652813171817009.f355o.a.l(l9701652813171817009);
        H10681976249452161517 h10681976249452161517 = this.a;
        l9701652813171817009.f355o = h10681976249452161517;
        h10681976249452161517.a.b(l9701652813171817009);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N14197335738847091403) && S10823041268949770285.t(this.a, ((N14197335738847091403) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }
}
