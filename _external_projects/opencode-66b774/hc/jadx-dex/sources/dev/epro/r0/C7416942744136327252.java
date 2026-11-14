package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C7416942744136327252 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public C7416942744136327252(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dev.epro.r0.C7416942744136327252)) {
            return false;
        }
        dev.epro.r0.C7416942744136327252 c7416942744136327252 = (dev.epro.r0.C7416942744136327252) obj;
        long j = c7416942744136327252.a;
        int i = dev.epro.r0.U10174709222559481877.i;
        return dev.epro.r0.P15388715743159210616.a(this.a, j) && dev.epro.r0.P15388715743159210616.a(this.b, c7416942744136327252.b) && dev.epro.r0.P15388715743159210616.a(this.c, c7416942744136327252.c) && dev.epro.r0.P15388715743159210616.a(this.d, c7416942744136327252.d);
    }

    public final int hashCode() {
        int i = dev.epro.r0.U10174709222559481877.i;
        return java.lang.Long.hashCode(this.d) + dev.epro.r0.G6547577305291411977.j(dev.epro.r0.G6547577305291411977.j(java.lang.Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }
}
