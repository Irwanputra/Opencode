package dev.epro.r0;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L5982594854256394033 implements S7370861580758580261 {
    public final InputStream a;
    public final O12329764647113144543 b;

    public L5982594854256394033(InputStream inputStream, O12329764647113144543 o12329764647113144543) {
        this.a = inputStream;
        this.b = o12329764647113144543;
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        p5176232750190581838.getClass();
        try {
            this.b.f();
            P5586796822028136504 z = p5176232750190581838.z(1);
            int read = this.a.read(z.a, z.c, (int) Math.min(8192L, 8192 - z.c));
            if (read != -1) {
                z.c += read;
                long j2 = read;
                p5176232750190581838.b += j2;
                return j2;
            }
            if (z.b != z.c) {
                return -1L;
            }
            p5176232750190581838.a = z.a();
            B14689168980551717317.a(z);
            return -1L;
        } catch (AssertionError e) {
            if (Y13582060529021210230.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
