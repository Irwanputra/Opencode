package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C18156294336905801584 {
    public dev.epro.r0.R8540738700654750557 a;
    public dev.epro.r0.F10342546226345611902 b;
    public dev.epro.r0.V1715405128288489768 c;
    public long d;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.C18156294336905801584)) {
            return false;
        }
        dev.epro.r0.C18156294336905801584 c18156294336905801584 = (dev.epro.r0.C18156294336905801584) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, c18156294336905801584.a) && this.b == c18156294336905801584.b && dev.epro.r0.S10823041268949770285.t(this.c, c18156294336905801584.c) && dev.epro.r0.W8572396779607072172.a(this.d, c18156294336905801584.d);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + dev.epro.r0.W8572396779607072172.d(this.d) + ")";
    }
}
