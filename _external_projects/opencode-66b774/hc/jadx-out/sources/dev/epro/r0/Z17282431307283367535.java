package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z17282431307283367535 {

    @O7462376509978667369("pcc")
    public final Integer a;

    @O7462376509978667369("dload")
    public final Long b;

    public Z17282431307283367535(Integer num, Long l) {
        this.a = num;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z17282431307283367535)) {
            return false;
        }
        Z17282431307283367535 z17282431307283367535 = (Z17282431307283367535) obj;
        return S10823041268949770285.t(this.a, z17282431307283367535.a) && S10823041268949770285.t(this.b, z17282431307283367535.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "AdUnitQualitySignals(priorClickCount=" + this.a + ", loadDuration=" + this.b + ")";
    }
}
