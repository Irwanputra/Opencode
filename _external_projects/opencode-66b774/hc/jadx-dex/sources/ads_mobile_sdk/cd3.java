package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class cd3 {
    public final int a;
    public final ads_mobile_sdk.s23 b;
    public final java.lang.String c;
    public final java.util.ArrayList d;

    public cd3(int i, ads_mobile_sdk.s23 s23Var, java.lang.String str, java.util.ArrayList arrayList) {
        this.a = i;
        this.b = s23Var;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.cd3)) {
            return false;
        }
        ads_mobile_sdk.cd3 cd3Var = (ads_mobile_sdk.cd3) obj;
        return this.a == cd3Var.a && this.b == cd3Var.b && dev.epro.r0.S10823041268949770285.t(this.c, cd3Var.c) && this.d.equals(cd3Var.d);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.a) * 31;
        ads_mobile_sdk.s23 s23Var = this.b;
        int iHashCode2 = (iHashCode + (s23Var == null ? 0 : s23Var.hashCode())) * 31;
        java.lang.String str = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "SwipeableInterstitialAdConfig(requiredScreenHoldSec=" + this.a + ", videoAutoPlayStartTime=" + this.b + ", interactionUrl=" + this.c + ", interactionTypes=" + this.d + ")";
    }
}
