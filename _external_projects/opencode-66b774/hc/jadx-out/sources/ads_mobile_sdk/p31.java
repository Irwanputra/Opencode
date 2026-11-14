package ads_mobile_sdk;

import dev.epro.r0.S10823041268949770285;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class p31 {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public p31(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p31)) {
            return false;
        }
        p31 p31Var = (p31) obj;
        return this.a.equals(p31Var.a) && S10823041268949770285.t(this.b, p31Var.b) && S10823041268949770285.t(this.c, p31Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ImpressionSequences(impressionSequence=" + this.a + ", formatImpressionSequence=" + this.b + ", slotFormatImpressionSequence=" + this.c + ")";
    }
}
