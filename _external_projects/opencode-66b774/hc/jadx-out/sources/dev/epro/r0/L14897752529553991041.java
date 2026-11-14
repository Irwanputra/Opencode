package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L14897752529553991041 {
    public final float a;
    public final float b;
    public final float c;

    public L14897752529553991041(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L14897752529553991041)) {
            return false;
        }
        L14897752529553991041 l14897752529553991041 = (L14897752529553991041) obj;
        return A891803927997771281.b(this.a, l14897752529553991041.a) && A891803927997771281.b(this.b, l14897752529553991041.b) && A891803927997771281.b(this.c, l14897752529553991041.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + E12098517352909843120.e(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) A891803927997771281.c(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) A891803927997771281.c(f + f2));
        sb.append(", width=");
        sb.append((Object) A891803927997771281.c(f2));
        sb.append(", contentWidth=");
        sb.append((Object) A891803927997771281.c(this.c));
        sb.append(')');
        return sb.toString();
    }
}
