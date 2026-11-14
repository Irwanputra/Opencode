package dev.epro.r0;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P14068990878373664744 {
    public long c;
    public final T13344602445187831655 d;
    public int g;
    public int h;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public O12229768880637238015[] e = new O12229768880637238015[8];
    public int f = 7;

    public P14068990878373664744(B4727321331707555656 b4727321331707555656) {
        this.d = new T13344602445187831655(b4727321331707555656);
    }

    public final void a(O12229768880637238015 o12229768880637238015) {
        this.b.add(o12229768880637238015);
        long b = this.c + o12229768880637238015.b.b() + o12229768880637238015.a.b();
        this.c = b;
        if (b <= 262144) {
            return;
        }
        Q11088980322693754445.h("header byte count limit of 262144 exceeded");
    }

    public final int b(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                O12229768880637238015 o12229768880637238015 = this.e[length];
                o12229768880637238015.getClass();
                int i4 = o12229768880637238015.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            O12229768880637238015[] o12229768880637238015Arr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(o12229768880637238015Arr, i5, o12229768880637238015Arr, i5 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final P5124777957357031757 c(int i) {
        if (i >= 0) {
            O12229768880637238015[] o12229768880637238015Arr = C17517635496846834643.a;
            if (i <= o12229768880637238015Arr.length - 1) {
                return o12229768880637238015Arr[i].a;
            }
        }
        int length = this.f + 1 + (i - C17517635496846834643.a.length);
        if (length >= 0) {
            O12229768880637238015[] o12229768880637238015Arr2 = this.e;
            if (length < o12229768880637238015Arr2.length) {
                O12229768880637238015 o12229768880637238015 = o12229768880637238015Arr2[length];
                o12229768880637238015.getClass();
                return o12229768880637238015.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void d(O12229768880637238015 o12229768880637238015) {
        a(o12229768880637238015);
        int i = o12229768880637238015.c;
        int i2 = this.a;
        if (i > i2) {
            O12229768880637238015[] o12229768880637238015Arr = this.e;
            O5378677881740157249.x0(0, o12229768880637238015Arr.length, null, o12229768880637238015Arr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
        int i3 = this.g + 1;
        O12229768880637238015[] o12229768880637238015Arr2 = this.e;
        if (i3 > o12229768880637238015Arr2.length) {
            O12229768880637238015[] o12229768880637238015Arr3 = new O12229768880637238015[o12229768880637238015Arr2.length * 2];
            System.arraycopy(o12229768880637238015Arr2, 0, o12229768880637238015Arr3, o12229768880637238015Arr2.length, o12229768880637238015Arr2.length);
            this.f = this.e.length - 1;
            this.e = o12229768880637238015Arr3;
            o12229768880637238015Arr2 = o12229768880637238015Arr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        o12229768880637238015Arr2[i4] = o12229768880637238015;
        this.g++;
        this.h += i;
    }

    public final P5124777957357031757 e() {
        T13344602445187831655 t13344602445187831655 = this.d;
        byte d = t13344602445187831655.d();
        byte[] bArr = L14928198200995638215.a;
        int i = d & 255;
        int i2 = 0;
        boolean z = (d & 128) == 128;
        long f = f(i, 127);
        if (this.c + f > 262144) {
            Q11088980322693754445.h("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return t13344602445187831655.e(f);
        }
        P5176232750190581838 p5176232750190581838 = new P5176232750190581838();
        Y16414919402539525744 y16414919402539525744 = P6705665351656413042.c;
        Y16414919402539525744 y164149194025395257442 = y16414919402539525744;
        int i3 = 0;
        for (long j = 0; j < f; j++) {
            byte d2 = t13344602445187831655.d();
            byte[] bArr2 = L14928198200995638215.a;
            i2 = (i2 << 8) | (d2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                Y16414919402539525744[] y16414919402539525744Arr = (Y16414919402539525744[]) y164149194025395257442.c;
                y16414919402539525744Arr.getClass();
                y164149194025395257442 = y16414919402539525744Arr[(i2 >>> (i3 - 8)) & 255];
                y164149194025395257442.getClass();
                if (((Y16414919402539525744[]) y164149194025395257442.c) == null) {
                    p5176232750190581838.D(y164149194025395257442.a);
                    i3 -= y164149194025395257442.b;
                    y164149194025395257442 = y16414919402539525744;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            Y16414919402539525744[] y16414919402539525744Arr2 = (Y16414919402539525744[]) y164149194025395257442.c;
            y16414919402539525744Arr2.getClass();
            Y16414919402539525744 y164149194025395257443 = y16414919402539525744Arr2[(i2 << (8 - i3)) & 255];
            y164149194025395257443.getClass();
            int i4 = y164149194025395257443.b;
            if (((Y16414919402539525744[]) y164149194025395257443.c) != null || i4 > i3) {
                break;
            }
            p5176232750190581838.D(y164149194025395257443.a);
            i3 -= i4;
            y164149194025395257442 = y16414919402539525744;
        }
        return p5176232750190581838.h(p5176232750190581838.b);
    }

    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte d = this.d.d();
            byte[] bArr = L14928198200995638215.a;
            i4++;
            long j2 = (d & Byte.MAX_VALUE) << i5;
            if (j2 > 2147483647L - j) {
                Q11088980322693754445.h("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((d & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        Q11088980322693754445.h("HPACK integer overflow");
        return 0;
    }
}
