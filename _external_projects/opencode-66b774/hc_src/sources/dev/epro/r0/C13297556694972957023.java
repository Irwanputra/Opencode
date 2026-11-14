package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C13297556694972957023 implements V15138624659649446319 {
    public final float[] a;
    public final float[] b;

    public C13297556694972957023(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            S10973172697741180971.j("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // dev.epro.r0.V15138624659649446319
    public final float a(float f) {
        return M2066880349381062048.L(f, this.b, this.a);
    }

    @Override // dev.epro.r0.V15138624659649446319
    public final float b(float f) {
        return M2066880349381062048.L(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C13297556694972957023)) {
            return false;
        }
        C13297556694972957023 c13297556694972957023 = (C13297556694972957023) obj;
        return Arrays.equals(this.a, c13297556694972957023.a) && Arrays.equals(this.b, c13297556694972957023.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        return "FontScaleConverter{fromSpValues=" + arrays + ", toDpValues=" + arrays2 + "}";
    }
}
