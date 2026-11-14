package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E15954736605708921304 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public E15954736605708921304(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dev.epro.r0.E15954736605708921304)) {
            return false;
        }
        dev.epro.r0.E15954736605708921304 e15954736605708921304 = (dev.epro.r0.E15954736605708921304) obj;
        long j = e15954736605708921304.a;
        int i = dev.epro.r0.U10174709222559481877.i;
        return dev.epro.r0.P15388715743159210616.a(this.a, j) && dev.epro.r0.P15388715743159210616.a(this.b, e15954736605708921304.b) && dev.epro.r0.P15388715743159210616.a(this.c, e15954736605708921304.c) && dev.epro.r0.P15388715743159210616.a(this.d, e15954736605708921304.d) && dev.epro.r0.P15388715743159210616.a(this.e, e15954736605708921304.e) && dev.epro.r0.P15388715743159210616.a(this.f, e15954736605708921304.f);
    }

    public final int hashCode() {
        int i = dev.epro.r0.U10174709222559481877.i;
        return java.lang.Long.hashCode(this.f) + dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(java.lang.Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }
}
