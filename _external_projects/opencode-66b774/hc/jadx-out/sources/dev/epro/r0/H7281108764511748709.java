package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H7281108764511748709 {
    public static final H7281108764511748709 d = new H7281108764511748709(J8045362843799184672.f(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public H7281108764511748709(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H7281108764511748709)) {
            return false;
        }
        H7281108764511748709 h7281108764511748709 = (H7281108764511748709) obj;
        long j = h7281108764511748709.a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j) && L2216691091636065972.b(this.b, h7281108764511748709.b) && this.c == h7281108764511748709.c;
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Float.hashCode(this.c) + G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbY = G6547577305291411977.y("Shadow(color=", U10174709222559481877.h(this.a), ", offset=", L2216691091636065972.h(this.b), ", blurRadius=");
        sbY.append(this.c);
        sbY.append(")");
        return sbY.toString();
    }
}
