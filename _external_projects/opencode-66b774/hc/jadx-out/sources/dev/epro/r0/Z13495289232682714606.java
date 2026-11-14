package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z13495289232682714606 extends O8620973563946607355 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f600o;
    public final long p;

    public Z13495289232682714606(long j, Object obj) {
        this.f600o = obj;
        this.p = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z13495289232682714606)) {
            return false;
        }
        Z13495289232682714606 z13495289232682714606 = (Z13495289232682714606) obj;
        return this.f600o.equals(z13495289232682714606.f600o) && this.p == z13495289232682714606.p;
    }

    public final int hashCode() {
        return Long.hashCode(this.p) + (this.f600o.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f600o + ", compositeKey=" + this.p + ')';
    }
}
