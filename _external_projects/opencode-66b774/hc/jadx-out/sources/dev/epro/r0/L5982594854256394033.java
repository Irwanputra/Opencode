package dev.epro.r0;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) throws IOException {
        p5176232750190581838.getClass();
        try {
            this.b.f();
            P5586796822028136504 p5586796822028136504Z = p5176232750190581838.z(1);
            int i = this.a.read(p5586796822028136504Z.a, p5586796822028136504Z.c, (int) Math.min(8192L, 8192 - p5586796822028136504Z.c));
            if (i != -1) {
                p5586796822028136504Z.c += i;
                long j2 = i;
                p5176232750190581838.b += j2;
                return j2;
            }
            if (p5586796822028136504Z.b != p5586796822028136504Z.c) {
                return -1L;
            }
            p5176232750190581838.a = p5586796822028136504Z.a();
            B14689168980551717317.a(p5586796822028136504Z);
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
