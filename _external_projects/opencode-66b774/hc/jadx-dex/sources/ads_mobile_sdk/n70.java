package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class n70 extends dev.epro.r0.H9465056496122534476 {
    public final java.lang.String a;
    public final ads_mobile_sdk.wf1 b;

    public n70(java.lang.String str, ads_mobile_sdk.wf1 wf1Var) {
        str.getClass();
        this.a = str;
        this.b = wf1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.n70)) {
            return false;
        }
        ads_mobile_sdk.n70 n70Var = (ads_mobile_sdk.n70) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, n70Var.a) && this.b.equals(n70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ImageCustomAsset(key=" + this.a + ", imageValue=" + this.b + ")";
    }
}
