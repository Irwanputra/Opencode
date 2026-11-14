package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N12634487253252232083 extends C4265577456082395953 {
    public boolean e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (!this.e) {
            b(V13312380994896612392.f);
        }
        this.c = true;
    }

    @Override // dev.epro.r0.C4265577456082395953, dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) throws IOException {
        p5176232750190581838.getClass();
        if (this.c) {
            S10973172697741180971.m("closed");
            return 0L;
        }
        if (this.e) {
            return -1L;
        }
        long jM = super.m(p5176232750190581838, 8192L);
        if (jM != -1) {
            return jM;
        }
        this.e = true;
        b(F12902864952249894497.b);
        return -1L;
    }
}
