package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class p31 {
    public final java.lang.Integer a;
    public final java.lang.Integer b;
    public final java.lang.Integer c;

    public p31(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.p31)) {
            return false;
        }
        ads_mobile_sdk.p31 p31Var = (ads_mobile_sdk.p31) obj;
        return this.a.equals(p31Var.a) && dev.epro.r0.S10823041268949770285.t(this.b, p31Var.b) && dev.epro.r0.S10823041268949770285.t(this.c, p31Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ImpressionSequences(impressionSequence=" + this.a + ", formatImpressionSequence=" + this.b + ", slotFormatImpressionSequence=" + this.c + ")";
    }
}
