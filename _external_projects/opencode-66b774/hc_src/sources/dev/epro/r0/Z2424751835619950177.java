package dev.epro.r0;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z2424751835619950177 extends InputStream {
    public final /* synthetic */ byte a;
    public final /* synthetic */ J6206369225411265287 b;

    public /* synthetic */ Z2424751835619950177(J6206369225411265287 j6206369225411265287, byte b) {
        this.a = b;
        this.b = j6206369225411265287;
    }

    @Override // java.io.InputStream
    public final int available() {
        byte b = this.a;
        J6206369225411265287 j6206369225411265287 = this.b;
        switch (b) {
            case 0:
                return (int) Math.min(((P5176232750190581838) j6206369225411265287).b, 2147483647L);
            default:
                T13344602445187831655 t13344602445187831655 = (T13344602445187831655) j6206369225411265287;
                if (!t13344602445187831655.c) {
                    return (int) Math.min(t13344602445187831655.b.b, 2147483647L);
                }
                Q11088980322693754445.h("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((T13344602445187831655) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte b = this.a;
        J6206369225411265287 j6206369225411265287 = this.b;
        switch (b) {
            case 0:
                P5176232750190581838 p5176232750190581838 = (P5176232750190581838) j6206369225411265287;
                if (p5176232750190581838.b > 0) {
                    return p5176232750190581838.e() & 255;
                }
                return -1;
            default:
                T13344602445187831655 t13344602445187831655 = (T13344602445187831655) j6206369225411265287;
                P5176232750190581838 p51762327501905818382 = t13344602445187831655.b;
                if (t13344602445187831655.c) {
                    Q11088980322693754445.h("closed");
                    return 0;
                }
                if (p51762327501905818382.b == 0 && t13344602445187831655.a.m(p51762327501905818382, 8192L) == -1) {
                    return -1;
                }
                return p51762327501905818382.e() & 255;
        }
    }

    public final String toString() {
        byte b = this.a;
        J6206369225411265287 j6206369225411265287 = this.b;
        switch (b) {
            case 0:
                return ((P5176232750190581838) j6206369225411265287) + ".inputStream()";
            default:
                return ((T13344602445187831655) j6206369225411265287) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        switch (this.a) {
            case 1:
                outputStream.getClass();
                T13344602445187831655 t13344602445187831655 = (T13344602445187831655) this.b;
                P5176232750190581838 p5176232750190581838 = t13344602445187831655.b;
                if (t13344602445187831655.c) {
                    Q11088980322693754445.h("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (p5176232750190581838.b == 0 && t13344602445187831655.a.m(p5176232750190581838, 8192L) == -1) {
                        return j;
                    }
                    long j2 = p5176232750190581838.b;
                    j += j2;
                    E12775674050813925581.t(j2, 0L, j2);
                    P5586796822028136504 p5586796822028136504 = p5176232750190581838.a;
                    while (j2 > 0) {
                        p5586796822028136504.getClass();
                        int min = (int) Math.min(j2, p5586796822028136504.c - p5586796822028136504.b);
                        outputStream.write(p5586796822028136504.a, p5586796822028136504.b, min);
                        int i = p5586796822028136504.b + min;
                        p5586796822028136504.b = i;
                        long j3 = min;
                        p5176232750190581838.b -= j3;
                        j2 -= j3;
                        if (i == p5586796822028136504.c) {
                            P5586796822028136504 a = p5586796822028136504.a();
                            p5176232750190581838.a = a;
                            B14689168980551717317.a(p5586796822028136504);
                            p5586796822028136504 = a;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte b = this.a;
        J6206369225411265287 j6206369225411265287 = this.b;
        bArr.getClass();
        switch (b) {
            case 0:
                return ((P5176232750190581838) j6206369225411265287).read(bArr, i, i2);
            default:
                T13344602445187831655 t13344602445187831655 = (T13344602445187831655) j6206369225411265287;
                P5176232750190581838 p5176232750190581838 = t13344602445187831655.b;
                if (!t13344602445187831655.c) {
                    E12775674050813925581.t(bArr.length, i, i2);
                    if (p5176232750190581838.b == 0 && t13344602445187831655.a.m(p5176232750190581838, 8192L) == -1) {
                        return -1;
                    }
                    return p5176232750190581838.read(bArr, i, i2);
                }
                Q11088980322693754445.h("closed");
                return 0;
        }
    }

    private final void b() {
    }
}
