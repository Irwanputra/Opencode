package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ea2 {
    public final java.lang.String a;
    public final ads_mobile_sdk.qw2 b;
    public final dev.epro.r0.W6853231930366344609 c;
    public final dev.epro.r0.S4967920478913205567 d;
    public final dev.epro.r0.E6758797890281795541 e;
    public final boolean f;
    public final java.util.List g;
    public final boolean h;
    public final dev.epro.r0.P16369341241763256475 i;
    public final dev.epro.r0.N2475062157440797164 j;
    public final dev.epro.r0.L17551298460506453774 k;
    public final java.lang.String l;
    public final boolean m;
    public final android.widget.ImageView.ScaleType n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f30o;

    public ea2(java.lang.String str, ads_mobile_sdk.qw2 qw2Var, dev.epro.r0.W6853231930366344609 w6853231930366344609, dev.epro.r0.S4967920478913205567 s4967920478913205567, dev.epro.r0.E6758797890281795541 e6758797890281795541, boolean z, java.util.List list, boolean z2, dev.epro.r0.P16369341241763256475 p16369341241763256475, dev.epro.r0.N2475062157440797164 n2475062157440797164, dev.epro.r0.L17551298460506453774 l17551298460506453774, java.lang.String str2, boolean z3, android.widget.ImageView.ScaleType scaleType, int i) {
        e6758797890281795541.getClass();
        scaleType.getClass();
        this.a = str;
        this.b = qw2Var;
        this.c = w6853231930366344609;
        this.d = s4967920478913205567;
        this.e = e6758797890281795541;
        this.f = z;
        this.g = list;
        this.h = z2;
        this.i = p16369341241763256475;
        this.j = n2475062157440797164;
        this.k = l17551298460506453774;
        this.l = str2;
        this.m = z3;
        this.n = scaleType;
        this.f30o = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ea2)) {
            return false;
        }
        ads_mobile_sdk.ea2 ea2Var = (ads_mobile_sdk.ea2) obj;
        return this.a.equals(ea2Var.a) && this.b == ea2Var.b && this.c == ea2Var.c && dev.epro.r0.S10823041268949770285.t(this.d, ea2Var.d) && dev.epro.r0.S10823041268949770285.t(this.e, ea2Var.e) && this.f == ea2Var.f && dev.epro.r0.S10823041268949770285.t(this.g, ea2Var.g) && this.h == ea2Var.h && this.i == ea2Var.i && dev.epro.r0.S10823041268949770285.t(this.j, ea2Var.j) && dev.epro.r0.S10823041268949770285.t(this.k, ea2Var.k) && this.l.equals(ea2Var.l) && this.m == ea2Var.m && this.n == ea2Var.n && this.f30o == ea2Var.f30o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        dev.epro.r0.S4967920478913205567 s4967920478913205567 = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (s4967920478913205567 == null ? 0 : s4967920478913205567.hashCode())) * 31)) * 31;
        boolean z = this.f;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        int i = (iHashCode2 + r4) * 31;
        java.util.List list = this.g;
        int iHashCode3 = (i + (list == null ? 0 : list.hashCode())) * 31;
        boolean z2 = this.h;
        ?? r42 = z2;
        if (z2) {
            r42 = 1;
        }
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + r42) * 31)) * 31;
        dev.epro.r0.N2475062157440797164 n2475062157440797164 = this.j;
        int iHashCode5 = (iHashCode4 + (n2475062157440797164 == null ? 0 : n2475062157440797164.hashCode())) * 31;
        dev.epro.r0.L17551298460506453774 l17551298460506453774 = this.k;
        int iH = dev.epro.r0.E12098517352909843120.h((iHashCode5 + (l17551298460506453774 != null ? l17551298460506453774.hashCode() : 0)) * 31, 31, this.l);
        boolean z3 = this.m;
        return java.lang.Integer.hashCode(this.f30o) + ((this.n.hashCode() + ((iH + (z3 ? 1 : z3)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OutOfContextTestingConfiguration(adUnitId=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append(this.b);
        sb.append(", adChoicesPosition=");
        sb.append(this.c);
        sb.append(", adRequest=");
        sb.append(this.d);
        sb.append(", adSize=");
        sb.append(this.e);
        sb.append(", customMuteThisAd=");
        sb.append(this.f);
        sb.append(", customNativeTemplates=");
        sb.append(this.g);
        sb.append(", isImageLoadingDisabled=");
        sb.append(this.h);
        sb.append(", mediaAspectRatio=");
        sb.append(this.i);
        sb.append(", serverSideVerificationOptions=");
        sb.append(this.j);
        sb.append(", videoOptions=");
        sb.append(this.k);
        sb.append(", bannerPosition=");
        sb.append(this.l);
        sb.append(", isImmersiveMode=");
        sb.append(this.m);
        sb.append(", imageScaleType=");
        sb.append(this.n);
        sb.append(", widthConstraint=");
        return dev.epro.r0.E12098517352909843120.n(sb, this.f30o, ")");
    }
}
