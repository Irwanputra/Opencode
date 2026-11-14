package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X1840570513157370182 {
    public float a = 0.0f;
    public boolean b = true;
    public B5998207562248239613 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X1840570513157370182)) {
            return false;
        }
        X1840570513157370182 x1840570513157370182 = (X1840570513157370182) obj;
        return Float.compare(this.a, x1840570513157370182.a) == 0 && this.b == x1840570513157370182.b && S10823041268949770285.t(this.c, x1840570513157370182.c);
    }

    public final int hashCode() {
        int i = G6547577305291411977.i(Float.hashCode(this.a) * 31, 31, this.b);
        B5998207562248239613 b5998207562248239613 = this.c;
        return (i + (b5998207562248239613 == null ? 0 : b5998207562248239613.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
