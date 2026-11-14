package dev.epro.r0;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B4727321331707555656 implements S7370861580758580261 {
    public final T13344602445187831655 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public B4727321331707555656(T13344602445187831655 t13344602445187831655) {
        this.a = t13344602445187831655;
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.a.a.a();
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        int i;
        int g;
        p5176232750190581838.getClass();
        do {
            int i2 = this.d;
            T13344602445187831655 t13344602445187831655 = this.a;
            if (i2 == 0) {
                t13344602445187831655.s(this.e);
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    this.d = L14928198200995638215.l(t13344602445187831655);
                    int d = t13344602445187831655.d() & 255;
                    this.b = t13344602445187831655.d() & 255;
                    Logger logger = M15575253401561633137.d;
                    Level level = Level.FINE;
                    g = t13344602445187831655.g() & Integer.MAX_VALUE;
                    this.c = g;
                    if (d != 9) {
                        throw new IOException(d + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long m = t13344602445187831655.m(p5176232750190581838, Math.min(8192L, i2));
                if (m != -1) {
                    this.d -= (int) m;
                    return m;
                }
            }
            return -1L;
        } while (g == i);
        Q11088980322693754445.h("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
