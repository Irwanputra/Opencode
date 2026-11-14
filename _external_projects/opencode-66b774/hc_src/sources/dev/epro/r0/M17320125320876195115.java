package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M17320125320876195115 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public M17320125320876195115(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof M17320125320876195115)) {
            return false;
        }
        M17320125320876195115 m17320125320876195115 = (M17320125320876195115) obj;
        long j = m17320125320876195115.a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j) && P15388715743159210616.a(this.b, m17320125320876195115.b) && P15388715743159210616.a(this.c, m17320125320876195115.c) && P15388715743159210616.a(this.d, m17320125320876195115.d);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.d) + G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
