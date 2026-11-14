package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I6173575418705308179 extends J11984637636147625377 {
    public final String a;
    public final W1610686581142659326 b;

    public I6173575418705308179(String str, W1610686581142659326 w1610686581142659326) {
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
        if (!(obj instanceof I6173575418705308179)) {
            return false;
        }
        I6173575418705308179 i6173575418705308179 = (I6173575418705308179) obj;
        return S10823041268949770285.t(this.a, i6173575418705308179.a) && S10823041268949770285.t(this.b, i6173575418705308179.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        W1610686581142659326 w1610686581142659326 = this.b;
        return (iHashCode + (w1610686581142659326 != null ? w1610686581142659326.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return G6547577305291411977.s("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
