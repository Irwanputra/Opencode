package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class B11321578473434509236<S> extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.O11687042873311337343 a;
    public final dev.epro.r0.W1972671267364756056 b;
    public final dev.epro.r0.O7205211285568135375 c;

    public B11321578473434509236(dev.epro.r0.O11687042873311337343 o11687042873311337343, dev.epro.r0.W1972671267364756056 w1972671267364756056, dev.epro.r0.O7205211285568135375 o7205211285568135375) {
        this.a = o11687042873311337343;
        this.b = w1972671267364756056;
        this.c = o7205211285568135375;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        return new dev.epro.r0.X4371701013878427434(this.a, this.b, this.c);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.X4371701013878427434 x4371701013878427434 = (dev.epro.r0.X4371701013878427434) r15896830329318850690;
        x4371701013878427434.o = this.a;
        x4371701013878427434.p = this.b;
        x4371701013878427434.q = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof dev.epro.r0.B11321578473434509236)) {
            return false;
        }
        dev.epro.r0.B11321578473434509236 b11321578473434509236 = (dev.epro.r0.B11321578473434509236) obj;
        return dev.epro.r0.S10823041268949770285.t(b11321578473434509236.a, this.a) && b11321578473434509236.b.equals(this.b);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        dev.epro.r0.O11687042873311337343 o11687042873311337343 = this.a;
        return this.b.hashCode() + ((iHashCode + (o11687042873311337343 != null ? o11687042873311337343.hashCode() : 0)) * 31);
    }
}
