package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ue2 {
    public final java.lang.String a;
    public final ads_mobile_sdk.qw2 b;
    public final java.lang.String c;

    public ue2(java.lang.String str, ads_mobile_sdk.qw2 qw2Var, java.lang.String str2) {
        str.getClass();
        qw2Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = qw2Var;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.ue2)) {
            return false;
        }
        ads_mobile_sdk.ue2 ue2Var = (ads_mobile_sdk.ue2) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, ue2Var.a) && this.b == ue2Var.b && dev.epro.r0.S10823041268949770285.t(this.c, ue2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersistentCacheToken(filename=");
        sb.append(this.a);
        sb.append(", adFormat=");
        sb.append(this.b);
        sb.append(", adRequest=");
        return dev.epro.r0.G6547577305291411977.u(sb, this.c, ")");
    }
}
