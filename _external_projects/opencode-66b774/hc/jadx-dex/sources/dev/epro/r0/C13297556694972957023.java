package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C13297556694972957023 implements dev.epro.r0.V15138624659649446319 {
    public final float[] a;
    public final float[] b;

    public C13297556694972957023(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            dev.epro.r0.S10973172697741180971.j("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    public final float a(float f) {
        return dev.epro.r0.M2066880349381062048.L(f, this.b, this.a);
    }

    public final float b(float f) {
        return dev.epro.r0.M2066880349381062048.L(f, this.a, this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dev.epro.r0.C13297556694972957023)) {
            return false;
        }
        dev.epro.r0.C13297556694972957023 c13297556694972957023 = (dev.epro.r0.C13297556694972957023) obj;
        return java.util.Arrays.equals(this.a, c13297556694972957023.a) && java.util.Arrays.equals(this.b, c13297556694972957023.b);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.b) + (java.util.Arrays.hashCode(this.a) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String string = java.util.Arrays.toString(this.a);
        string.getClass();
        java.lang.String string2 = java.util.Arrays.toString(this.b);
        string2.getClass();
        return "FontScaleConverter{fromSpValues=" + string + ", toDpValues=" + string2 + "}";
    }
}
