package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T9486746963944005828 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public T9486746963944005828(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9486746963944005828)) {
            return false;
        }
        T9486746963944005828 t9486746963944005828 = (T9486746963944005828) obj;
        long j = t9486746963944005828.a;
        int i = U10174709222559481877.i;
        if (P15388715743159210616.a(this.a, j) && P15388715743159210616.a(this.b, t9486746963944005828.b) && P15388715743159210616.a(this.c, t9486746963944005828.c) && P15388715743159210616.a(this.d, t9486746963944005828.d) && P15388715743159210616.a(this.e, t9486746963944005828.e) && P15388715743159210616.a(this.f, t9486746963944005828.f) && P15388715743159210616.a(this.g, t9486746963944005828.g)) {
            return P15388715743159210616.a(this.h, t9486746963944005828.h);
        }
        return false;
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.h) + G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }
}
