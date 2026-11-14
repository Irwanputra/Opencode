package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P1480303480448191796 implements N123190348026444920 {
    public final long a;
    public final long b;

    public P1480303480448191796(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            K2042933864045806308.j("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        K2042933864045806308.j("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P1480303480448191796)) {
            return false;
        }
        P1480303480448191796 p1480303480448191796 = (P1480303480448191796) obj;
        return this.a == p1480303480448191796.a && this.b == p1480303480448191796.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // dev.epro.r0.N123190348026444920
    public final J12043550928838212009 i(M2547930385040280601 m2547930385040280601) {
        return M9216324016624295870.v(new R3229391822211813842(F3269663106233752804.a(m2547930385040280601, new L3924708429741079482(this, null)), new R15192661853924864744(2, null, (byte) 6), (byte) 1));
    }

    public final String toString() {
        G9506192477171422664 g9506192477171422664 = new G9506192477171422664(2);
        long j = this.a;
        if (j > 0) {
            g9506192477171422664.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            g9506192477171422664.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + R9411874267597469228.J0(K5751602218013079365.v(g9506192477171422664), null, null, null, 0, null, 63) + ')';
    }
}
