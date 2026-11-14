package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J7864302246393130751 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public J7864302246393130751(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof J7864302246393130751)) {
            return false;
        }
        J7864302246393130751 j7864302246393130751 = (J7864302246393130751) obj;
        long j = j7864302246393130751.a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j) && P15388715743159210616.a(this.b, j7864302246393130751.b) && P15388715743159210616.a(this.c, j7864302246393130751.c) && P15388715743159210616.a(this.d, j7864302246393130751.d);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.d) + G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
