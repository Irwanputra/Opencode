package dev.epro.r0;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O3191191885859682845 implements S7370861580758580261 {
    public byte a;
    public final T13344602445187831655 b;
    public final Inflater c;
    public final H12194688973272326050 d;
    public final CRC32 e;

    public O3191191885859682845(J6206369225411265287 j6206369225411265287) {
        j6206369225411265287.getClass();
        T13344602445187831655 t13344602445187831655 = new T13344602445187831655(j6206369225411265287);
        this.b = t13344602445187831655;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new H12194688973272326050(t13344602445187831655, inflater);
        this.e = new CRC32();
    }

    public static void b(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + M8927913404651150384.f0(E12775674050813925581.M(i2), 8, '0') + " != expected 0x" + M8927913404651150384.f0(E12775674050813925581.M(i), 8, '0'));
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final O12329764647113144543 a() {
        return this.b.a.a();
    }

    public final void c(P5176232750190581838 p5176232750190581838, long j, long j2) {
        P5586796822028136504 p5586796822028136504 = p5176232750190581838.a;
        p5586796822028136504.getClass();
        while (true) {
            long j3 = p5586796822028136504.c - p5586796822028136504.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            p5586796822028136504 = p5586796822028136504.f;
            p5586796822028136504.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(p5586796822028136504.c - r6, j2);
            this.e.update(p5586796822028136504.a, (int) (p5586796822028136504.b + j), min);
            j2 -= min;
            p5586796822028136504 = p5586796822028136504.f;
            p5586796822028136504.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // dev.epro.r0.S7370861580758580261
    public final long m(P5176232750190581838 p5176232750190581838, long j) {
        long j2;
        P5176232750190581838 p51762327501905818382;
        long j3;
        P5176232750190581838 p51762327501905818383;
        O3191191885859682845 o3191191885859682845 = this;
        T13344602445187831655 t13344602445187831655 = o3191191885859682845.b;
        P5176232750190581838 p51762327501905818384 = t13344602445187831655.b;
        p5176232750190581838.getClass();
        byte b = o3191191885859682845.a;
        CRC32 crc32 = o3191191885859682845.e;
        if (b == 0) {
            t13344602445187831655.q(10L);
            byte d = p51762327501905818384.d(3L);
            boolean z = ((d >> 1) & 1) == 1;
            if (z) {
                o3191191885859682845.c(p51762327501905818384, 0L, 10L);
            }
            b(8075, t13344602445187831655.j(), "ID1ID2");
            t13344602445187831655.s(8L);
            if (((d >> 2) & 1) == 1) {
                t13344602445187831655.q(2L);
                if (z) {
                    j2 = -1;
                    j3 = 2;
                    c(p51762327501905818384, 0L, 2L);
                } else {
                    j3 = 2;
                    j2 = -1;
                }
                short p = p51762327501905818384.p();
                long j4 = ((short) (((p & 255) << 8) | ((p & 65280) >>> 8))) & 65535;
                t13344602445187831655.q(j4);
                if (z) {
                    c(p51762327501905818384, 0L, j4);
                }
                p51762327501905818382 = p51762327501905818384;
                t13344602445187831655.s(j4);
            } else {
                p51762327501905818382 = p51762327501905818384;
                j3 = 2;
                j2 = -1;
            }
            if (((d >> 3) & 1) == 1) {
                long c = t13344602445187831655.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c == j2) {
                    throw new EOFException();
                }
                if (z) {
                    c(p51762327501905818382, 0L, c + 1);
                }
                t13344602445187831655.s(c + 1);
            }
            if (((d >> 4) & 1) == 1) {
                long c2 = t13344602445187831655.c((byte) 0, 0L, Long.MAX_VALUE);
                if (c2 == j2) {
                    throw new EOFException();
                }
                if (z) {
                    o3191191885859682845 = this;
                    p51762327501905818383 = p51762327501905818382;
                    o3191191885859682845.c(p51762327501905818383, 0L, c2 + 1);
                } else {
                    o3191191885859682845 = this;
                    p51762327501905818383 = p51762327501905818382;
                }
                t13344602445187831655.s(c2 + 1);
            } else {
                o3191191885859682845 = this;
                p51762327501905818383 = p51762327501905818382;
            }
            if (z) {
                t13344602445187831655.q(j3);
                short p2 = p51762327501905818383.p();
                b((short) (((p2 & 255) << 8) | ((p2 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            o3191191885859682845.a = (byte) 1;
            b = 1;
        } else {
            j2 = -1;
        }
        if (b == 1) {
            long j5 = p5176232750190581838.b;
            long m = o3191191885859682845.d.m(p5176232750190581838, 8192L);
            if (m != j2) {
                o3191191885859682845.c(p5176232750190581838, j5, m);
                return m;
            }
            o3191191885859682845.a = (byte) 2;
            b = 2;
        }
        if (b == 2) {
            b(t13344602445187831655.h(), (int) crc32.getValue(), "CRC");
            b(t13344602445187831655.h(), (int) o3191191885859682845.c.getBytesWritten(), "ISIZE");
            o3191191885859682845.a = (byte) 3;
            if (!t13344602445187831655.b()) {
                Q11088980322693754445.h("gzip finished without exhausting source");
                return 0L;
            }
        }
        return j2;
    }
}
