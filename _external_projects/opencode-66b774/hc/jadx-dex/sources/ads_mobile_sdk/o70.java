package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class o70 extends dev.epro.r0.H9465056496122534476 {
    public final java.lang.String a;
    public final java.lang.String b;

    public o70(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.o70)) {
            return false;
        }
        ads_mobile_sdk.o70 o70Var = (ads_mobile_sdk.o70) obj;
        return this.a.equals(o70Var.a) && this.b.equals(o70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.E12098517352909843120.m("StringCustomAsset(key=", this.a, ", stringValue=", this.b, ")");
    }
}
