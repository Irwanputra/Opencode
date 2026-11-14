package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W12973714701299903186 {
    public final M11181104712105445833 a;
    public final R17143752899285419206 b;

    public W12973714701299903186(M11181104712105445833 m11181104712105445833, R17143752899285419206 r17143752899285419206) {
        this.a = m11181104712105445833;
        this.b = r17143752899285419206;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W12973714701299903186)) {
            return false;
        }
        W12973714701299903186 w12973714701299903186 = (W12973714701299903186) obj;
        return S10823041268949770285.t(this.a, w12973714701299903186.a) && this.b.equals(w12973714701299903186.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
