package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class C12914368962070474931 extends dev.epro.r0.A8269341136279542501 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public C12914368962070474931(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        dev.epro.r0.B6965384962036329103 b6965384962036329103 = new dev.epro.r0.B6965384962036329103();
        b6965384962036329103.f178o = this.a;
        b6965384962036329103.p = this.b;
        b6965384962036329103.q = this.c;
        b6965384962036329103.r = this.d;
        b6965384962036329103.s = this.e;
        return b6965384962036329103;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.B6965384962036329103 b6965384962036329103 = (dev.epro.r0.B6965384962036329103) r15896830329318850690;
        b6965384962036329103.f178o = this.a;
        b6965384962036329103.p = this.b;
        b6965384962036329103.q = this.c;
        b6965384962036329103.r = this.d;
        b6965384962036329103.s = this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.C12914368962070474931)) {
            return false;
        }
        dev.epro.r0.C12914368962070474931 c12914368962070474931 = (dev.epro.r0.C12914368962070474931) obj;
        return dev.epro.r0.A891803927997771281.b(this.a, c12914368962070474931.a) && dev.epro.r0.A891803927997771281.b(this.b, c12914368962070474931.b) && dev.epro.r0.A891803927997771281.b(this.c, c12914368962070474931.c) && dev.epro.r0.A891803927997771281.b(this.d, c12914368962070474931.d) && this.e == c12914368962070474931.e;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.e) + dev.epro.r0.E12098517352909843120.e(this.d, dev.epro.r0.E12098517352909843120.e(this.c, dev.epro.r0.E12098517352909843120.e(this.b, java.lang.Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public C12914368962070474931(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
