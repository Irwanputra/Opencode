package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C236413207748491238 {
    public final float a;
    public final long b;
    public final A10693687560045094360 c;

    public C236413207748491238(float f, long j, A10693687560045094360 a10693687560045094360) {
        this.a = f;
        this.b = j;
        this.c = a10693687560045094360;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C236413207748491238)) {
            return false;
        }
        C236413207748491238 c236413207748491238 = (C236413207748491238) obj;
        return Float.compare(this.a, c236413207748491238.a) == 0 && N13757329872968394114.a(this.b, c236413207748491238.b) && S10823041268949770285.t(this.c, c236413207748491238.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i = N13757329872968394114.c;
        return this.c.hashCode() + G6547577305291411977.j(hashCode, this.b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + N13757329872968394114.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
