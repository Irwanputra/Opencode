package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class wk0 {
    public final java.lang.String a;
    public final long b;
    public final int d;

    public wk0(java.lang.String str, int i, long j) {
        android.os.Build.MODEL.getClass();
        this.a = str;
        this.b = j;
        this.d = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.wk0)) {
            return false;
        }
        ads_mobile_sdk.wk0 wk0Var = (ads_mobile_sdk.wk0) obj;
        if (!this.a.equals(wk0Var.a) || this.b != wk0Var.b) {
            return false;
        }
        java.lang.String str = android.os.Build.MODEL;
        return dev.epro.r0.S10823041268949770285.t(str, str) && this.d == wk0Var.d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.d) + dev.epro.r0.H4776669175763245653.c(dev.epro.r0.G6547577305291411977.j(this.a.hashCode() * 31, this.b, 31), android.os.Build.MODEL);
    }

    public final java.lang.String toString() {
        java.lang.String str = android.os.Build.MODEL;
        java.lang.StringBuilder sbH = dev.epro.r0.X2485016533998461232.h("EnvironmentData(packageName=", this.a, ", versionCode=", this.b);
        sbH.append(", deviceModel=");
        sbH.append(str);
        sbH.append(", apiVersion=");
        sbH.append(this.d);
        sbH.append(")");
        return sbH.toString();
    }
}
