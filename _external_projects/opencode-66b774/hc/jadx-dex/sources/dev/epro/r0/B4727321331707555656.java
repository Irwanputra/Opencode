package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B4727321331707555656 implements dev.epro.r0.S7370861580758580261 {
    public final dev.epro.r0.T13344602445187831655 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public B4727321331707555656(dev.epro.r0.T13344602445187831655 t13344602445187831655) {
        this.a = t13344602445187831655;
    }

    public final dev.epro.r0.O12329764647113144543 a() {
        return this.a.a.a();
    }

    public final long m(dev.epro.r0.P5176232750190581838 p5176232750190581838, long j) throws java.io.IOException {
        int i;
        int iG;
        p5176232750190581838.getClass();
        do {
            int i2 = this.d;
            dev.epro.r0.T13344602445187831655 t13344602445187831655 = this.a;
            if (i2 == 0) {
                t13344602445187831655.s(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    this.d = dev.epro.r0.L14928198200995638215.l(t13344602445187831655);
                    int iD = t13344602445187831655.d() & 255;
                    this.b = t13344602445187831655.d() & 255;
                    java.util.logging.Logger logger = dev.epro.r0.M15575253401561633137.d;
                    java.util.logging.Level level = java.util.logging.Level.FINE;
                    iG = t13344602445187831655.g() & Integer.MAX_VALUE;
                    this.c = iG;
                    if (iD != 9) {
                        throw new java.io.IOException(iD + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jM = t13344602445187831655.m(p5176232750190581838, java.lang.Math.min(8192L, i2));
                if (jM != -1) {
                    this.d -= (int) jM;
                    return jM;
                }
            }
            return -1L;
        } while (iG == i);
        dev.epro.r0.Q11088980322693754445.h("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    public final void close() {
    }
}
