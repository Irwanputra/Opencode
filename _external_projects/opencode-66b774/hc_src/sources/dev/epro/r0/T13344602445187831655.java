package dev.epro.r0;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T13344602445187831655 implements J6206369225411265287 {
    public final S7370861580758580261 a;
    public final P5176232750190581838 b;
    public boolean c;

    public T13344602445187831655(S7370861580758580261 s7370861580758580261) {
        s7370861580758580261.getClass();
        this.a = s7370861580758580261;
        this.b = new P5176232750190581838();
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.a.a();
    }

    public final boolean b() {
        if (this.c) {
            S10973172697741180971.m("closed");
            return false;
        }
        P5176232750190581838 p5176232750190581838 = this.b;
        return p5176232750190581838.c() && this.a.m(p5176232750190581838, 8192L) == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(byte r23, long r24, long r26) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.T13344602445187831655.c(byte, long, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.b();
    }

    public final byte d() {
        q(1L);
        return this.b.e();
    }

    public final P5124777957357031757 e(long j) {
        q(j);
        return this.b.h(j);
    }

    public final int g() {
        q(4L);
        return this.b.o();
    }

    public final int h() {
        q(4L);
        int o2 = this.b.o();
        return ((o2 & 255) << 24) | (((-16777216) & o2) >>> 24) | ((16711680 & o2) >>> 8) | ((65280 & o2) << 8);
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final int i(P12327795811052477724 p12327795811052477724) {
        p12327795811052477724.getClass();
        if (this.c) {
            S10973172697741180971.m("closed");
            return 0;
        }
        while (true) {
            P5176232750190581838 p5176232750190581838 = this.b;
            int b = Y6921797927338498306.b(p5176232750190581838, p12327795811052477724, true);
            if (b != -2) {
                if (b != -1) {
                    p5176232750190581838.u(p12327795811052477724.a[b].b());
                    return b;
                }
            } else if (this.a.m(p5176232750190581838, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final short j() {
        q(2L);
        return this.b.p();
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final byte[] k() {
        S7370861580758580261 s7370861580758580261 = this.a;
        P5176232750190581838 p5176232750190581838 = this.b;
        p5176232750190581838.C(s7370861580758580261);
        return p5176232750190581838.g(p5176232750190581838.b);
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        p5176232750190581838.getClass();
        if (j < 0) {
            S10973172697741180971.i(E12098517352909843120.k(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            S10973172697741180971.m("closed");
            return 0L;
        }
        P5176232750190581838 p51762327501905818382 = this.b;
        if (p51762327501905818382.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.m(p51762327501905818382, 8192L) == -1) {
                return -1L;
            }
        }
        return p51762327501905818382.m(p5176232750190581838, Math.min(j, p51762327501905818382.b));
    }

    public final String o(long j) {
        if (j < 0) {
            S10973172697741180971.i(E12098517352909843120.k(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long c = c((byte) 10, 0L, j2);
        P5176232750190581838 p5176232750190581838 = this.b;
        if (c != -1) {
            return Y6921797927338498306.a(p5176232750190581838, c);
        }
        if (j2 < Long.MAX_VALUE && p(j2) && p5176232750190581838.d(j2 - 1) == 13 && p(j2 + 1) && p5176232750190581838.d(j2) == 10) {
            return Y6921797927338498306.a(p5176232750190581838, j2);
        }
        P5176232750190581838 p51762327501905818382 = new P5176232750190581838();
        long min = Math.min(32L, p5176232750190581838.b);
        long j3 = 0;
        E12775674050813925581.t(p5176232750190581838.b, 0L, min);
        if (min != 0) {
            p51762327501905818382.b += min;
            P5586796822028136504 p5586796822028136504 = p5176232750190581838.a;
            while (true) {
                p5586796822028136504.getClass();
                long j4 = p5586796822028136504.c - p5586796822028136504.b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                p5586796822028136504 = p5586796822028136504.f;
            }
            long j5 = j3;
            long j6 = min;
            while (j6 > 0) {
                p5586796822028136504.getClass();
                P5586796822028136504 c2 = p5586796822028136504.c();
                int i = c2.b + ((int) j5);
                c2.b = i;
                c2.c = Math.min(i + ((int) j6), c2.c);
                P5586796822028136504 p55867968220281365042 = p51762327501905818382.a;
                if (p55867968220281365042 == null) {
                    c2.g = c2;
                    c2.f = c2;
                    p51762327501905818382.a = c2;
                } else {
                    P5586796822028136504 p55867968220281365043 = p55867968220281365042.g;
                    p55867968220281365043.getClass();
                    p55867968220281365043.b(c2);
                }
                j6 -= c2.c - c2.b;
                p5586796822028136504 = p5586796822028136504.f;
                j5 = 0;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(p5176232750190581838.b, j) + " content=" + p51762327501905818382.h(p51762327501905818382.b).c() + (char) 8230);
    }

    public final boolean p(long j) {
        P5176232750190581838 p5176232750190581838;
        if (j < 0) {
            S10973172697741180971.i(E12098517352909843120.k(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            S10973172697741180971.m("closed");
            return false;
        }
        do {
            p5176232750190581838 = this.b;
            if (p5176232750190581838.b >= j) {
                return true;
            }
        } while (this.a.m(p5176232750190581838, 8192L) != -1);
        return false;
    }

    public final void q(long j) {
        if (!p(j)) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        P5176232750190581838 p5176232750190581838 = this.b;
        if (p5176232750190581838.b == 0 && this.a.m(p5176232750190581838, 8192L) == -1) {
            return -1;
        }
        return p5176232750190581838.read(byteBuffer);
    }

    public final void s(long j) {
        if (this.c) {
            S10973172697741180971.m("closed");
            return;
        }
        while (j > 0) {
            P5176232750190581838 p5176232750190581838 = this.b;
            if (p5176232750190581838.b == 0 && this.a.m(p5176232750190581838, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, p5176232750190581838.b);
            p5176232750190581838.u(min);
            j -= min;
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final String w(Charset charset) {
        charset.getClass();
        S7370861580758580261 s7370861580758580261 = this.a;
        P5176232750190581838 p5176232750190581838 = this.b;
        p5176232750190581838.C(s7370861580758580261);
        return p5176232750190581838.q(p5176232750190581838.b, charset);
    }

    @Override // dev.epro.r0.J6206369225411265287
    public final InputStream x() {
        return new Z2424751835619950177(this, (byte) 1);
    }
}
