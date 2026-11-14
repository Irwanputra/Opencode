package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K7902078054435340508 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public K7902078054435340508(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K7902078054435340508)) {
            return false;
        }
        K7902078054435340508 k7902078054435340508 = (K7902078054435340508) obj;
        long j = k7902078054435340508.a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j) && P15388715743159210616.a(this.b, k7902078054435340508.b) && P15388715743159210616.a(this.c, k7902078054435340508.c) && P15388715743159210616.a(this.d, k7902078054435340508.d) && P15388715743159210616.a(this.e, k7902078054435340508.e);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.e) + G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String h = U10174709222559481877.h(this.a);
        String h2 = U10174709222559481877.h(this.b);
        String h3 = U10174709222559481877.h(this.c);
        String h4 = U10174709222559481877.h(this.d);
        String h5 = U10174709222559481877.h(this.e);
        StringBuilder y = G6547577305291411977.y("ContextMenuColors(backgroundColor=", h, ", textColor=", h2, ", iconColor=");
        G6547577305291411977.B(y, h3, ", disabledTextColor=", h4, ", disabledIconColor=");
        return G6547577305291411977.u(y, h5, ")");
    }
}
