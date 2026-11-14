package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K12878124840946646356 {

    @O7462376509978667369("ad_mem_tier")
    public Integer a;

    @O7462376509978667369("avai_mem_tier")
    public Integer b;

    @O7462376509978667369("avai_proc_tier")
    public Integer c;

    public K12878124840946646356(int i) {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K12878124840946646356)) {
            return false;
        }
        K12878124840946646356 k12878124840946646356 = (K12878124840946646356) obj;
        return S10823041268949770285.t(this.a, k12878124840946646356.a) && S10823041268949770285.t(this.b, k12878124840946646356.b) && S10823041268949770285.t(this.c, k12878124840946646356.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceTierSignals(advertisedMemoryTier=" + this.a + ", availableMemoryTier=" + this.b + ", availableProcessorsTier=" + this.c + ")";
    }

    public K12878124840946646356() {
        this(0);
    }
}
