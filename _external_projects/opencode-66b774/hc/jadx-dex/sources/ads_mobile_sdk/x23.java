package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class x23 {
    public final java.lang.String a;
    public final dev.epro.r0.I16631908410500040363 b;

    public x23(dev.epro.r0.I16631908410500040363 i16631908410500040363, java.lang.String str) {
        this.a = str;
        this.b = i16631908410500040363;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.x23)) {
            return false;
        }
        ads_mobile_sdk.x23 x23Var = (ads_mobile_sdk.x23) obj;
        return this.a.equals(x23Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, x23Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dev.epro.r0.I16631908410500040363 i16631908410500040363 = this.b;
        return iHashCode + (i16631908410500040363 == null ? 0 : i16631908410500040363.a.hashCode());
    }

    public final java.lang.String toString() {
        return "Action(name=" + this.a + ", info=" + this.b + ")";
    }
}
