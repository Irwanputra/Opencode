package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G15798799497496144130 {
    public final U9290200654526904876 a;
    public final M3397403720270972864 b;

    public G15798799497496144130(U9290200654526904876 u9290200654526904876, M3397403720270972864 m3397403720270972864) {
        this.a = u9290200654526904876;
        this.b = m3397403720270972864;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G15798799497496144130)) {
            return false;
        }
        G15798799497496144130 g15798799497496144130 = (G15798799497496144130) obj;
        return S10823041268949770285.t(this.b, g15798799497496144130.b) && S10823041268949770285.t(this.a, g15798799497496144130.a);
    }

    public final int hashCode() {
        U9290200654526904876 u9290200654526904876 = this.a;
        int iHashCode = (u9290200654526904876 != null ? u9290200654526904876.hashCode() : 0) * 31;
        M3397403720270972864 m3397403720270972864 = this.b;
        return iHashCode + (m3397403720270972864 != null ? m3397403720270972864.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
