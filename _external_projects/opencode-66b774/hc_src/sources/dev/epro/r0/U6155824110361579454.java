package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U6155824110361579454 {
    public final float a;
    public final H10765568533039107979 b;

    public U6155824110361579454(float f, H10765568533039107979 h10765568533039107979) {
        this.a = f;
        this.b = h10765568533039107979;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U6155824110361579454)) {
            return false;
        }
        U6155824110361579454 u6155824110361579454 = (U6155824110361579454) obj;
        return A891803927997771281.b(this.a, u6155824110361579454.a) && this.b.equals(u6155824110361579454.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + A891803927997771281.c(this.a) + ", brush=" + this.b + ")";
    }
}
