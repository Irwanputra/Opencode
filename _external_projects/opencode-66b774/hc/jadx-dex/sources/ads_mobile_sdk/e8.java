package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class e8 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.String a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final android.graphics.Insets g;
    public final java.lang.String h;
    public final java.lang.Boolean i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final java.util.ArrayList l;
    public final ads_mobile_sdk.qz2 m;
    public final boolean n;

    public e8(java.lang.String str, float f, int i, int i2, int i3, int i4, android.graphics.Insets insets, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, java.util.ArrayList arrayList, ads_mobile_sdk.qz2 qz2Var, boolean z) {
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = insets;
        this.h = str2;
        this.i = bool;
        this.j = str3;
        this.k = str4;
        this.l = arrayList;
        this.m = qz2Var;
        this.n = z;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        android.graphics.Insets insets;
        p3477296814990354048.getClass();
        p3477296814990354048.f = this.a;
        p3477296814990354048.i = this.b;
        p3477296814990354048.k = this.d;
        p3477296814990354048.j = this.c;
        p3477296814990354048.m = this.f;
        p3477296814990354048.l = this.e;
        if (android.os.Build.VERSION.SDK_INT >= 30 && (insets = this.g) != null) {
            p3477296814990354048.t = java.lang.Integer.valueOf(dev.epro.r0.U8229365251704901623.q(insets));
            p3477296814990354048.u = java.lang.Integer.valueOf(dev.epro.r0.U8229365251704901623.t(this.g));
            p3477296814990354048.v = java.lang.Integer.valueOf(dev.epro.r0.U8229365251704901623.w(this.g));
            p3477296814990354048.w = java.lang.Integer.valueOf(dev.epro.r0.U8229365251704901623.y(this.g));
        }
        p3477296814990354048.d = this.h;
        p3477296814990354048.e = this.i;
        p3477296814990354048.g = this.j;
        p3477296814990354048.h = this.k;
        p3477296814990354048.b.addAll(this.l);
        ads_mobile_sdk.qz2 qz2Var = this.m;
        if (qz2Var != null) {
            p3477296814990354048.x = java.lang.Integer.valueOf(qz2Var.a);
            p3477296814990354048.y = java.lang.Integer.valueOf(qz2Var.b);
            p3477296814990354048.z = java.lang.Integer.valueOf(qz2Var.d);
            p3477296814990354048.A = java.lang.Integer.valueOf(qz2Var.c);
        }
        p3477296814990354048.c = this.n;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.e8)) {
            return false;
        }
        ads_mobile_sdk.e8 e8Var = (ads_mobile_sdk.e8) obj;
        return this.a.equals(e8Var.a) && java.lang.Float.compare(this.b, e8Var.b) == 0 && this.c == e8Var.c && this.d == e8Var.d && this.e == e8Var.e && this.f == e8Var.f && dev.epro.r0.S10823041268949770285.t(this.g, e8Var.g) && dev.epro.r0.S10823041268949770285.t(this.h, e8Var.h) && dev.epro.r0.S10823041268949770285.t(this.i, e8Var.i) && dev.epro.r0.S10823041268949770285.t(this.j, e8Var.j) && dev.epro.r0.S10823041268949770285.t(this.k, e8Var.k) && this.l.equals(e8Var.l) && dev.epro.r0.S10823041268949770285.t(this.m, e8Var.m) && this.n == e8Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final int hashCode() {
        int iH = dev.epro.r0.U1554499319261669842.h(this.f, dev.epro.r0.U1554499319261669842.h(this.e, dev.epro.r0.U1554499319261669842.h(this.d, dev.epro.r0.U1554499319261669842.h(this.c, dev.epro.r0.E12098517352909843120.e(this.b, this.a.hashCode() * 31, 31)))));
        android.graphics.Insets insets = this.g;
        int iA = (iH + (insets == null ? 0 : dev.epro.r0.U8229365251704901623.a(insets))) * 31;
        java.lang.String str = this.h;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.i;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str2 = this.j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.k;
        int iK = dev.epro.r0.G6547577305291411977.k(this.l, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        ads_mobile_sdk.qz2 qz2Var = this.m;
        int iHashCode4 = (iK + (qz2Var != null ? qz2Var.hashCode() : 0)) * 31;
        boolean z = this.n;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return (iHashCode4 + r4) * 961;
    }

    public final java.lang.String toString() {
        android.graphics.Insets insets = this.g;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdSizeSignal(formatString=");
        sb.append(this.a);
        sb.append(", screenDensity=");
        sb.append(this.b);
        sb.append(", screenWidth=");
        dev.epro.r0.G6547577305291411977.A(sb, this.c, ", screenHeight=", this.d, ", screenWidthDip=");
        dev.epro.r0.G6547577305291411977.A(sb, this.e, ", screenHeightDip=", this.f, ", safeAreaMarginsDip=");
        sb.append(insets);
        sb.append(", responsiveAutoFormat=");
        sb.append(this.h);
        sb.append(", isInlineAdaptive=");
        sb.append(this.i);
        sb.append(", fluidType=");
        sb.append(this.j);
        sb.append(", multipleAdSizeString=");
        sb.append(this.k);
        sb.append(", supportedAdSizes=");
        sb.append(this.l);
        sb.append(", roundedCornerRadii=");
        sb.append(this.m);
        sb.append(", isGreaterThanMaxAllowedBannerSize=");
        sb.append(this.n);
        sb.append(", maxSlotWidth=null, maxSlotHeight=null)");
        return sb.toString();
    }
}
