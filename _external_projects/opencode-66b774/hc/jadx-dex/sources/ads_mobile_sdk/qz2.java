package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qz2 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public qz2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.qz2)) {
            return false;
        }
        ads_mobile_sdk.qz2 qz2Var = (ads_mobile_sdk.qz2) obj;
        return this.a == qz2Var.a && this.b == qz2Var.b && this.c == qz2Var.c && this.d == qz2Var.d;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.d) + dev.epro.r0.U1554499319261669842.h(this.c, dev.epro.r0.U1554499319261669842.h(this.b, java.lang.Integer.hashCode(this.a) * 31));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sbP = dev.epro.r0.E12098517352909843120.p(this.a, this.b, "RoundedCornerRadii(topLeft=", ", topRight=", ", bottomRight=");
        sbP.append(this.c);
        sbP.append(", bottomLeft=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
