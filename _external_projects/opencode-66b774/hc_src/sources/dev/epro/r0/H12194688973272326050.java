package dev.epro.r0;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H12194688973272326050 implements S7370861580758580261 {
    public final T13344602445187831655 a;
    public final Inflater b;
    public int c;
    public boolean d;

    public H12194688973272326050(T13344602445187831655 t13344602445187831655, Inflater inflater) {
        this.a = t13344602445187831655;
        this.b = inflater;
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.a.a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        long j2;
        Inflater inflater = this.b;
        p5176232750190581838.getClass();
        while (!this.d) {
            try {
                P5586796822028136504 z = p5176232750190581838.z(1);
                int min = (int) Math.min(8192L, 8192 - z.c);
                boolean needsInput = inflater.needsInput();
                T13344602445187831655 t13344602445187831655 = this.a;
                if (needsInput && !t13344602445187831655.b()) {
                    P5586796822028136504 p5586796822028136504 = t13344602445187831655.b.a;
                    p5586796822028136504.getClass();
                    int i = p5586796822028136504.c;
                    int i2 = p5586796822028136504.b;
                    int i3 = i - i2;
                    this.c = i3;
                    inflater.setInput(p5586796822028136504.a, i2, i3);
                }
                int inflate = inflater.inflate(z.a, z.c, min);
                int i4 = this.c;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.c -= remaining;
                    t13344602445187831655.s(remaining);
                }
                if (inflate > 0) {
                    z.c += inflate;
                    j2 = inflate;
                    p5176232750190581838.b += j2;
                } else {
                    if (z.b == z.c) {
                        p5176232750190581838.a = z.a();
                        B14689168980551717317.a(z);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (t13344602445187831655.b()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        S10973172697741180971.m("closed");
        return 0L;
    }
}
