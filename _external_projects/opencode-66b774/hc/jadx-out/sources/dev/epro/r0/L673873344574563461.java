package dev.epro.r0;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L673873344574563461 implements U14714184180717932172 {
    public final U10510841700634832156 a;
    public final P5176232750190581838 b;
    public boolean c;

    public L673873344574563461(U10510841700634832156 u10510841700634832156) {
        u10510841700634832156.getClass();
        this.a = u10510841700634832156;
        this.b = new P5176232750190581838();
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final O12329764647113144543 a() {
        return this.a.a();
    }

    public final U14714184180717932172 b() {
        if (this.c) {
            S10973172697741180971.m("closed");
            return null;
        }
        P5176232750190581838 p5176232750190581838 = this.b;
        long j = p5176232750190581838.b;
        if (j == 0) {
            j = 0;
        } else {
            P5586796822028136504 p5586796822028136504 = p5176232750190581838.a;
            p5586796822028136504.getClass();
            P5586796822028136504 p55867968220281365042 = p5586796822028136504.g;
            p55867968220281365042.getClass();
            int i = p55867968220281365042.c;
            if (i < 8192 && p55867968220281365042.e) {
                j -= (long) (i - p55867968220281365042.b);
            }
        }
        if (j > 0) {
            this.a.y(p5176232750190581838, j);
        }
        return this;
    }

    public final U14714184180717932172 c(int i) {
        if (this.c) {
            S10973172697741180971.m("closed");
            return null;
        }
        this.b.D(i);
        b();
        return this;
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        U10510841700634832156 u10510841700634832156 = this.a;
        if (this.c) {
            return;
        }
        try {
            P5176232750190581838 p5176232750190581838 = this.b;
            long j = p5176232750190581838.b;
            if (j > 0) {
                u10510841700634832156.y(p5176232750190581838, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            u10510841700634832156.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    public final U14714184180717932172 d(int i) {
        if (this.c) {
            S10973172697741180971.m("closed");
            return null;
        }
        this.b.G(i);
        b();
        return this;
    }

    @Override // dev.epro.r0.U10510841700634832156, java.io.Flushable
    public final void flush() {
        if (this.c) {
            S10973172697741180971.m("closed");
            return;
        }
        P5176232750190581838 p5176232750190581838 = this.b;
        long j = p5176232750190581838.b;
        U10510841700634832156 u10510841700634832156 = this.a;
        if (j > 0) {
            u10510841700634832156.y(p5176232750190581838, j);
        }
        u10510841700634832156.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // dev.epro.r0.U14714184180717932172
    public final U14714184180717932172 t(String str) {
        if (this.c) {
            S10973172697741180971.m("closed");
            return null;
        }
        this.b.I(str);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            S10973172697741180971.m("closed");
            return 0;
        }
        int iWrite = this.b.write(byteBuffer);
        b();
        return iWrite;
    }

    @Override // dev.epro.r0.U10510841700634832156
    public final void y(P5176232750190581838 p5176232750190581838, long j) {
        p5176232750190581838.getClass();
        if (this.c) {
            S10973172697741180971.m("closed");
        } else {
            this.b.y(p5176232750190581838, j);
            b();
        }
    }
}
