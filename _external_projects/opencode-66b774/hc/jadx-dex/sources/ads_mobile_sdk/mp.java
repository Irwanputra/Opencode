package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mp {
    public final int a;
    public final java.lang.String b;

    public mp(java.lang.String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.mp)) {
            return false;
        }
        ads_mobile_sdk.mp mpVar = (ads_mobile_sdk.mp) obj;
        return this.a == mpVar.a && this.b.equals(mpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (java.lang.Integer.hashCode(this.a) * 31);
    }

    public final java.lang.String toString() {
        return "BowResponseError(code=" + this.a + ", description=" + this.b + ")";
    }
}
