package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z2695505886244604040 {
    public final Integer a;
    public final Object b;

    public Z2695505886244604040(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z2695505886244604040)) {
            return false;
        }
        Z2695505886244604040 z2695505886244604040 = (Z2695505886244604040) obj;
        return this.a.equals(z2695505886244604040.a) && S10823041268949770285.t(this.b, z2695505886244604040.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ")";
    }
}
