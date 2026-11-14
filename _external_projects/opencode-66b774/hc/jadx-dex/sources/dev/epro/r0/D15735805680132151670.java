package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D15735805680132151670 {
    public int a;
    public long b;
    public java.lang.Object c;
    public int d;

    public D15735805680132151670(dev.epro.r0.R16085073546103879032 r16085073546103879032, long j, int i, int i2) {
        this.c = r16085073546103879032;
        this.b = j;
        this.a = i;
        this.d = i2;
    }

    public dev.epro.r0.E12775674050813925581 a(dev.epro.r0.L18233974379278055712 l18233974379278055712, boolean z, int i, int i2, int i3, int i4) {
        if (!l18233974379278055712.c) {
            return null;
        }
        ((dev.epro.r0.R16085073546103879032) this.c).getClass();
        return null;
    }

    public dev.epro.r0.L18233974379278055712 b(boolean z, int i, long j, dev.epro.r0.B5288020592368727841 b5288020592368727841, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = this.a;
        int i6 = this.d;
        long j2 = this.b;
        dev.epro.r0.R16085073546103879032 r16085073546103879032 = (dev.epro.r0.R16085073546103879032) this.c;
        int i7 = i3 + i4;
        if (b5288020592368727841 == null) {
            return new dev.epro.r0.L18233974379278055712(true, true, (byte) 1);
        }
        long j3 = b5288020592368727841.a;
        r16085073546103879032.getClass();
        return (i2 < Integer.MAX_VALUE && ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) >= 0) ? (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j3 >> 32)) < 0)) ? z2 ? new dev.epro.r0.L18233974379278055712(true, true, (byte) 1) : new dev.epro.r0.L18233974379278055712(true, b(z, 0, dev.epro.r0.B5288020592368727841.a(dev.epro.r0.I16980768508151520658.i(j2), (((int) (j & 4294967295L)) - i6) - i4), new dev.epro.r0.B5288020592368727841(dev.epro.r0.B5288020592368727841.a(((int) (j3 >> 32)) - i5, (int) (j3 & 4294967295L))), i2 + 1, i7, 0, true, false).c, (byte) 1) : new dev.epro.r0.L18233974379278055712(false, false, (byte) 1) : new dev.epro.r0.L18233974379278055712(true, true, (byte) 1);
    }
}
