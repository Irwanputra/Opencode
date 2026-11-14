package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class B4348741517090369682 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.L13148442655056575112 a;
    public final dev.epro.r0.L13148442655056575112 b;

    public B4348741517090369682(dev.epro.r0.P6024466796603310388 p6024466796603310388, dev.epro.r0.P6024466796603310388 p60244667966033103882) {
        this.a = p6024466796603310388;
        this.b = p60244667966033103882;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.O5968480924377082674 o5968480924377082674 = new dev.epro.r0.O5968480924377082674();
        o5968480924377082674.o = 1.0f;
        o5968480924377082674.p = this.a;
        o5968480924377082674.q = this.b;
        return o5968480924377082674;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.O5968480924377082674 o5968480924377082674 = (dev.epro.r0.O5968480924377082674) r15896830329318850690;
        o5968480924377082674.o = 1.0f;
        o5968480924377082674.p = this.a;
        o5968480924377082674.q = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B4348741517090369682)) {
            return false;
        }
        dev.epro.r0.B4348741517090369682 b4348741517090369682 = (dev.epro.r0.B4348741517090369682) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, b4348741517090369682.a) && dev.epro.r0.S10823041268949770285.t(this.b, b4348741517090369682.b);
    }

    public final int hashCode() {
        dev.epro.r0.L13148442655056575112 l13148442655056575112 = this.a;
        int iHashCode = (l13148442655056575112 != null ? l13148442655056575112.hashCode() : 0) * 31;
        dev.epro.r0.L13148442655056575112 l131484426550565751122 = this.b;
        return java.lang.Float.hashCode(1.0f) + ((iHashCode + (l131484426550565751122 != null ? l131484426550565751122.hashCode() : 0)) * 31);
    }
}
