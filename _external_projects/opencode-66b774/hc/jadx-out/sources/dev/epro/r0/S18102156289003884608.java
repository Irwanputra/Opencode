package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S18102156289003884608 {
    public final Z7022156542152740569 a;
    public final int b;

    public S18102156289003884608(Z7022156542152740569 z7022156542152740569, int i) {
        this.a = z7022156542152740569;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S18102156289003884608)) {
            return false;
        }
        S18102156289003884608 s18102156289003884608 = (S18102156289003884608) obj;
        return this.a.equals(s18102156289003884608.a) && this.b == s18102156289003884608.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ")";
    }
}
