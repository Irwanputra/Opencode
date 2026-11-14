package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P6803222032892921558 extends J11984637636147625377 {
    public final String a;
    public final W1610686581142659326 b;

    public P6803222032892921558(String str, W1610686581142659326 w1610686581142659326) {
        this.a = str;
        this.b = w1610686581142659326;
    }

    @Override // dev.epro.r0.J11984637636147625377
    public final W1610686581142659326 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P6803222032892921558)) {
            return false;
        }
        P6803222032892921558 p6803222032892921558 = (P6803222032892921558) obj;
        return S10823041268949770285.t(this.a, p6803222032892921558.a) && S10823041268949770285.t(this.b, p6803222032892921558.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        W1610686581142659326 w1610686581142659326 = this.b;
        return (iHashCode + (w1610686581142659326 != null ? w1610686581142659326.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return G6547577305291411977.s("LinkAnnotation.Url(url=", this.a, ")");
    }
}
