package ads_mobile_sdk;

import dev.epro.r0.R12517428114166698439;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sx2 implements R12517428114166698439 {
    public final int a;
    public final String b;

    public sx2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx2)) {
            return false;
        }
        sx2 sx2Var = (sx2) obj;
        return this.a == sx2Var.a && this.b.equals(sx2Var.b);
    }

    @Override // dev.epro.r0.R12517428114166698439
    public final int getAmount() {
        return this.a;
    }

    @Override // dev.epro.r0.R12517428114166698439
    public final String getType() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RewardItemImpl(amount=" + this.a + ", type=" + this.b + ")";
    }
}
