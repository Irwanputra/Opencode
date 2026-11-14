package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R9660484449158892313 {
    public final int a;
    public final Integer b;

    public R9660484449158892313(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R9660484449158892313)) {
            return false;
        }
        R9660484449158892313 r9660484449158892313 = (R9660484449158892313) obj;
        return this.a == r9660484449158892313.a && S10823041268949770285.t(this.b, r9660484449158892313.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ")";
    }
}
