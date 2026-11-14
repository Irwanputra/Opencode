package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
final class R4942062994321361325 extends A8269341136279542501 {
    public final Object a;

    public R4942062994321361325(Object obj) {
        this.a = obj;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        V2011418798970996039 v2011418798970996039 = new V2011418798970996039();
        v2011418798970996039.f541o = this.a;
        return v2011418798970996039;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        ((V2011418798970996039) r15896830329318850690).f541o = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof R4942062994321361325) && this.a.equals(((R4942062994321361325) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ")";
    }
}
