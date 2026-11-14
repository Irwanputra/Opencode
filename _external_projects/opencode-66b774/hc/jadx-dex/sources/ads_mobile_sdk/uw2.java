package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class uw2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final ads_mobile_sdk.lu f;
    public final android.graphics.Rect g;
    public final dev.epro.r0.H9390398899829886498 h;
    public final dev.epro.r0.H9390398899829886498 i;

    public uw2(int i, int i2, int i3, int i4, boolean z, ads_mobile_sdk.lu luVar, android.graphics.Rect rect, dev.epro.r0.H9390398899829886498 h9390398899829886498, dev.epro.r0.H9390398899829886498 h93903988998298864982) {
        luVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = luVar;
        this.g = rect;
        this.h = h9390398899829886498;
        this.i = h93903988998298864982;
    }

    public final android.graphics.Point a() {
        android.graphics.Rect rect = this.g;
        int i = rect.left + this.c;
        int i2 = rect.top + this.d;
        if (!this.e) {
            dev.epro.r0.H9390398899829886498 h9390398899829886498 = this.i;
            int iIntValue = ((java.lang.Number) h9390398899829886498.a).intValue();
            int iIntValue2 = ((java.lang.Number) h9390398899829886498.b).intValue();
            int iIntValue3 = ((java.lang.Number) this.h.a).intValue();
            if (i < 0) {
                i = 0;
            } else {
                int i3 = this.a;
                if (i + i3 > iIntValue3) {
                    i = iIntValue3 - i3;
                }
            }
            if (i2 < iIntValue) {
                i2 = iIntValue;
            } else {
                int i4 = this.b;
                if (i2 + i4 > iIntValue2) {
                    i2 = iIntValue2 - i4;
                }
            }
        }
        return new android.graphics.Point(i, i2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.uw2)) {
            return false;
        }
        ads_mobile_sdk.uw2 uw2Var = (ads_mobile_sdk.uw2) obj;
        return this.a == uw2Var.a && this.b == uw2Var.b && this.c == uw2Var.c && this.d == uw2Var.d && this.e == uw2Var.e && this.f == uw2Var.f && this.g.equals(uw2Var.g) && this.h.equals(uw2Var.h) && this.i.equals(uw2Var.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iH = dev.epro.r0.U1554499319261669842.h(this.d, dev.epro.r0.U1554499319261669842.h(this.c, dev.epro.r0.U1554499319261669842.h(this.b, java.lang.Integer.hashCode(this.a) * 31)));
        boolean z = this.e;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iH + r1) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(this.a, this.b, "ResizeParams(widthDips=", ", heightDips=", ", offsetXDips=");
        dev.epro.r0.G6547577305291411977.A(sbP, this.c, ", offsetYDips=", this.d, ", allowOffScreen=");
        sbP.append(this.e);
        sbP.append(", closeButtonPosition=");
        sbP.append(this.f);
        sbP.append(", originalAdPosition=");
        sbP.append(this.g);
        sbP.append(", activityWindowDimensions=");
        sbP.append(this.h);
        sbP.append(", activityVerticalLimits=");
        sbP.append(this.i);
        sbP.append(")");
        return sbP.toString();
    }
}
