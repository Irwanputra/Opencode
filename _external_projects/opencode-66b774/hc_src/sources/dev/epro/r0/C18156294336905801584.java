package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C18156294336905801584 {
    public R8540738700654750557 a;
    public F10342546226345611902 b;
    public V1715405128288489768 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18156294336905801584)) {
            return false;
        }
        C18156294336905801584 c18156294336905801584 = (C18156294336905801584) obj;
        return S10823041268949770285.t(this.a, c18156294336905801584.a) && this.b == c18156294336905801584.b && S10823041268949770285.t(this.c, c18156294336905801584.c) && W8572396779607072172.a(this.d, c18156294336905801584.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + W8572396779607072172.d(this.d) + ")";
    }
}
