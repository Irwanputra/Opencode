package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M2563387695822359547 extends V12319504402545346730 {
    public final F17048500263560432125 q;

    public M2563387695822359547(F17048500263560432125 f17048500263560432125) {
        f17048500263560432125.getClass();
        this.q = f17048500263560432125;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && M2563387695822359547.class == obj.getClass() && S10823041268949770285.t(this.q, ((M2563387695822359547) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.q + ", direction=-1)";
    }
}
