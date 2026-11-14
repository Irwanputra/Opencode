package ads_mobile_sdk;

import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.U1554499319261669842;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class fs3 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public fs3(boolean z, int i, int i2, int i3) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs3)) {
            return false;
        }
        fs3 fs3Var = (fs3) obj;
        return this.a == fs3Var.a && this.b == fs3Var.b && this.c == fs3Var.c && this.d == fs3Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iH = U1554499319261669842.h(this.c, U1554499319261669842.h(this.b, L11610354117192841236.A(this.a) * 31));
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iH + r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewSize(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "VIDEO_RECT" : "FULLSCREEN" : "FLUID_RECTANGLE" : "FIXED_RECTANGLE" : "DEFAULT");
        sb.append(", widthInPixels=");
        sb.append(this.b);
        sb.append(", heightInPixels=");
        sb.append(this.c);
        sb.append(", isFluidHeight=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ fs3(int i, int i2, int i3, int i4) {
        this(false, i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
