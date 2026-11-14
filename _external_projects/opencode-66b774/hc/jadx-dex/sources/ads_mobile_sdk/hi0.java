package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class hi0 implements dev.epro.r0.R16693852608535438299 {
    public final java.lang.Integer a;
    public final java.lang.Integer b;
    public final java.lang.Integer c;

    public hi0(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        dev.epro.r0.K12878124840946646356 k12878124840946646356 = p3477296814990354048.g0.d;
        k12878124840946646356.a = this.a;
        k12878124840946646356.b = this.b;
        k12878124840946646356.c = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.hi0)) {
            return false;
        }
        ads_mobile_sdk.hi0 hi0Var = (ads_mobile_sdk.hi0) obj;
        return this.a.equals(hi0Var.a) && this.b.equals(hi0Var.b) && this.c.equals(hi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "DeviceTierSignal(advertisedMemoryTier=" + this.a + ", availableMemoryTier=" + this.b + ", availableProcessorsTier=" + this.c + ")";
    }
}
