package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G2452485859731482384 extends H4776669175763245653 {
    public final H4776669175763245653 a;
    public final int b;

    public G2452485859731482384(H4776669175763245653 h4776669175763245653, int i) {
        this.a = h4776669175763245653;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G2452485859731482384)) {
            return false;
        }
        G2452485859731482384 g2452485859731482384 = (G2452485859731482384) obj;
        return g2452485859731482384.a.equals(this.a) && g2452485859731482384.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
