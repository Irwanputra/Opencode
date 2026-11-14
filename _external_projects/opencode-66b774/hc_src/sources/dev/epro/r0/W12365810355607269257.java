package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W12365810355607269257 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public W12365810355607269257(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof W12365810355607269257)) {
            return false;
        }
        W12365810355607269257 w12365810355607269257 = (W12365810355607269257) obj;
        long j = w12365810355607269257.a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j) && P15388715743159210616.a(this.b, w12365810355607269257.b) && P15388715743159210616.a(this.c, w12365810355607269257.c) && P15388715743159210616.a(this.d, w12365810355607269257.d) && P15388715743159210616.a(this.e, w12365810355607269257.e) && P15388715743159210616.a(this.f, w12365810355607269257.f);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.f) + G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
