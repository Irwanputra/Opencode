package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F3159055080084457269 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public F3159055080084457269(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
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
        if (obj == null || !(obj instanceof F3159055080084457269)) {
            return false;
        }
        F3159055080084457269 f3159055080084457269 = (F3159055080084457269) obj;
        long j = f3159055080084457269.a;
        int i = U10174709222559481877.i;
        return P15388715743159210616.a(this.a, j) && P15388715743159210616.a(this.b, f3159055080084457269.b) && P15388715743159210616.a(this.c, f3159055080084457269.c) && P15388715743159210616.a(this.d, f3159055080084457269.d) && P15388715743159210616.a(this.e, f3159055080084457269.e) && P15388715743159210616.a(this.f, f3159055080084457269.f) && P15388715743159210616.a(this.g, f3159055080084457269.g) && P15388715743159210616.a(this.h, f3159055080084457269.h);
    }

    public final int hashCode() {
        int i = U10174709222559481877.i;
        return Long.hashCode(this.h) + G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(G6547577305291411977.j(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }
}
