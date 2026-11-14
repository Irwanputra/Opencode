package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jh3 {
    public final int a;
    public final java.lang.Integer b;
    public final long c;
    public final long d;
    public final ads_mobile_sdk.im0 e;

    public jh3(int i, java.lang.Integer num, long j, long j2, ads_mobile_sdk.im0 im0Var) {
        this.a = i;
        this.b = num;
        this.c = j;
        this.d = j2;
        this.e = im0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.jh3)) {
            return false;
        }
        ads_mobile_sdk.jh3 jh3Var = (ads_mobile_sdk.jh3) obj;
        return this.a == jh3Var.a && dev.epro.r0.S10823041268949770285.t(this.b, jh3Var.b) && dev.epro.r0.E17093345031926825464.d(this.c, jh3Var.c) && dev.epro.r0.E17093345031926825464.d(this.d, jh3Var.d) && this.e == jh3Var.e;
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.a) * 31;
        java.lang.Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        return this.e.hashCode() + dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(iHashCode2, this.c, 31), this.d, 31);
    }

    public final java.lang.String toString() {
        java.lang.String strL = dev.epro.r0.E17093345031926825464.l(this.c);
        java.lang.String strL2 = dev.epro.r0.E17093345031926825464.l(this.d);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThrottleConfiguration(nofillsBeforeThrottle=");
        sb.append(this.a);
        sb.append(", postThrottleNofillsBeforeThrottle=");
        sb.append(this.b);
        sb.append(", nofillRetentionTime=");
        dev.epro.r0.G6547577305291411977.B(sb, strL, ", callbackDelay=", strL2, ", fillDefinition=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
