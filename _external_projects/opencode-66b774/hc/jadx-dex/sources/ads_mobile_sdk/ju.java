package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ju {
    public final int a;
    public final int b;
    public final int c;

    public ju(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ju)) {
            return false;
        }
        ads_mobile_sdk.ju juVar = (ads_mobile_sdk.ju) obj;
        return this.a == juVar.a && this.b == juVar.b && this.c == juVar.c;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(50) + dev.epro.r0.U1554499319261669842.h(this.c, dev.epro.r0.U1554499319261669842.h(0, dev.epro.r0.U1554499319261669842.h(this.b, java.lang.Integer.hashCode(this.a) * 31)));
    }

    public final java.lang.String toString() {
        return dev.epro.r0.E12098517352909843120.n(dev.epro.r0.E12098517352909843120.p(this.a, this.b, "CloseButtonConfig(paddingLeft=", ", paddingRight=", ", paddingTop=0, paddingBottom="), this.c, ", size=50)");
    }
}
