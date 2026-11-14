package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G11312307416001574639 {

    @O7462376509978667369("battery")
    public final O11737420808161199786 a;

    @O7462376509978667369("browser")
    public final R12931540315222958181 b;

    @O7462376509978667369("android_mem_info")
    public A15026739540715784716 c;

    @O7462376509978667369("device_tier")
    public final K12878124840946646356 d;

    @O7462376509978667369("network")
    public final L6316928331950232779 e;

    @O7462376509978667369("play_store")
    public final T2978137061770605532 f;

    @O7462376509978667369("build")
    public String g;

    @O7462376509978667369("remaining_data_partition_space")
    public Long h;

    public G11312307416001574639(int i) {
        O11737420808161199786 o11737420808161199786 = new O11737420808161199786(0);
        R12931540315222958181 r12931540315222958181 = new R12931540315222958181(0);
        A15026739540715784716 a15026739540715784716 = new A15026739540715784716(0);
        K12878124840946646356 k12878124840946646356 = new K12878124840946646356(0);
        L6316928331950232779 l6316928331950232779 = new L6316928331950232779(0);
        T2978137061770605532 t2978137061770605532 = new T2978137061770605532(0);
        this.a = o11737420808161199786;
        this.b = r12931540315222958181;
        this.c = a15026739540715784716;
        this.d = k12878124840946646356;
        this.e = l6316928331950232779;
        this.f = t2978137061770605532;
        this.g = null;
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G11312307416001574639)) {
            return false;
        }
        G11312307416001574639 g11312307416001574639 = (G11312307416001574639) obj;
        return S10823041268949770285.t(this.a, g11312307416001574639.a) && S10823041268949770285.t(this.b, g11312307416001574639.b) && S10823041268949770285.t(this.c, g11312307416001574639.c) && S10823041268949770285.t(this.d, g11312307416001574639.d) && S10823041268949770285.t(this.e, g11312307416001574639.e) && S10823041268949770285.t(this.f, g11312307416001574639.f) && S10823041268949770285.t(this.g, g11312307416001574639.g) && S10823041268949770285.t(this.h, g11312307416001574639.h);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.h;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceSignals(batterySignals=" + this.a + ", browserSignals=" + this.b + ", memorySignals=" + this.c + ", deviceTierSignals=" + this.d + ", networkSignals=" + this.e + ", playStoreSignals=" + this.f + ", buildName=" + this.g + ", remainingDataPartitionSpaceKilobytes=" + this.h + ")";
    }

    public G11312307416001574639() {
        this(0);
    }
}
