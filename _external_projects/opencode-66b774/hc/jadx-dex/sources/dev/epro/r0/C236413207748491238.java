package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C236413207748491238 {
    public final float a;
    public final long b;
    public final dev.epro.r0.A10693687560045094360 c;

    public C236413207748491238(float f, long j, dev.epro.r0.A10693687560045094360 a10693687560045094360) {
        this.a = f;
        this.b = j;
        this.c = a10693687560045094360;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.C236413207748491238)) {
            return false;
        }
        dev.epro.r0.C236413207748491238 c236413207748491238 = (dev.epro.r0.C236413207748491238) obj;
        return java.lang.Float.compare(this.a, c236413207748491238.a) == 0 && dev.epro.r0.N13757329872968394114.a(this.b, c236413207748491238.b) && dev.epro.r0.S10823041268949770285.t(this.c, c236413207748491238.c);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Float.hashCode(this.a) * 31;
        int i = dev.epro.r0.N13757329872968394114.c;
        return this.c.hashCode() + dev.epro.r0.G6547577305291411977.j(iHashCode, this.b, 31);
    }

    public final java.lang.String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + dev.epro.r0.N13757329872968394114.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
