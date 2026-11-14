package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class sx2 implements dev.epro.r0.R12517428114166698439 {
    public final int a;
    public final java.lang.String b;

    public sx2(java.lang.String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.sx2)) {
            return false;
        }
        ads_mobile_sdk.sx2 sx2Var = (ads_mobile_sdk.sx2) obj;
        return this.a == sx2Var.a && this.b.equals(sx2Var.b);
    }

    public final int getAmount() {
        return this.a;
    }

    public final java.lang.String getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (java.lang.Integer.hashCode(this.a) * 31);
    }

    public final java.lang.String toString() {
        return "RewardItemImpl(amount=" + this.a + ", type=" + this.b + ")";
    }
}
