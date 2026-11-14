package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H2331361512828203859 {
    public final F4096073349764486348 a;
    public final A10693687560045094360 b;

    public H2331361512828203859(F4096073349764486348 f4096073349764486348, A10693687560045094360 a10693687560045094360) {
        this.a = f4096073349764486348;
        this.b = a10693687560045094360;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H2331361512828203859)) {
            return false;
        }
        H2331361512828203859 h2331361512828203859 = (H2331361512828203859) obj;
        return S10823041268949770285.t(this.a, h2331361512828203859.a) && S10823041268949770285.t(this.b, h2331361512828203859.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
