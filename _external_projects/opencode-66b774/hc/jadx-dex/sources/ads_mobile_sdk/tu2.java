package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class tu2 {
    public java.lang.String a = "";
    public int b = 0;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.Boolean f = null;
    public boolean g = false;
    public boolean h = false;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.tu2)) {
            return false;
        }
        ads_mobile_sdk.tu2 tu2Var = (ads_mobile_sdk.tu2) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, tu2Var.a) && this.b == tu2Var.b && dev.epro.r0.S10823041268949770285.t(this.c, tu2Var.c) && dev.epro.r0.S10823041268949770285.t(this.d, tu2Var.d) && dev.epro.r0.S10823041268949770285.t(this.f, tu2Var.f) && this.g == tu2Var.g && this.h == tu2Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final int hashCode() {
        int iC = dev.epro.r0.H4776669175763245653.c(dev.epro.r0.H4776669175763245653.c(dev.epro.r0.U1554499319261669842.h(this.b, this.a.hashCode() * 31), this.c), this.d) * 31;
        java.lang.Boolean bool = this.f;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.g;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.h;
        return i + (z2 ? 1 : z2);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        int i = this.b;
        java.lang.String str2 = this.c;
        java.lang.String str3 = this.d;
        java.lang.Boolean bool = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        java.lang.StringBuilder sbX = dev.epro.r0.G6547577305291411977.x(i, "RenderTraceMeta(renderId=", str, ", adConfigIndex=", ", renderer=");
        dev.epro.r0.G6547577305291411977.B(sbX, str2, ", adapterName=", str3, ", adapterVersion=, winningAd=");
        sbX.append(bool);
        sbX.append(", isOfflineAd=");
        sbX.append(z);
        sbX.append(", isHtmlAdResponse=");
        return dev.epro.r0.E12098517352909843120.o(sbX, z2, ")");
    }
}
