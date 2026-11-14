package dev.epro.r0;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G4640088786804747587 {
    public final P5176232750190581838 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public O12229768880637238015[] e = new O12229768880637238015[8];
    public int f = 7;

    public G4640088786804747587(P5176232750190581838 p5176232750190581838) {
        this.a = p5176232750190581838;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                O12229768880637238015 o12229768880637238015 = this.e[length];
                o12229768880637238015.getClass();
                i -= o12229768880637238015.c;
                int i4 = this.h;
                O12229768880637238015 o122297688806372380152 = this.e[length];
                o122297688806372380152.getClass();
                this.h = i4 - o122297688806372380152.c;
                this.g--;
                i3++;
                length--;
            }
            O12229768880637238015[] o12229768880637238015Arr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(o12229768880637238015Arr, i5, o12229768880637238015Arr, i5 + i3, this.g);
            O12229768880637238015[] o12229768880637238015Arr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(o12229768880637238015Arr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(O12229768880637238015 o12229768880637238015) {
        int i = o12229768880637238015.c;
        int i2 = this.d;
        if (i > i2) {
            O12229768880637238015[] o12229768880637238015Arr = this.e;
            O5378677881740157249.x0(0, o12229768880637238015Arr.length, null, o12229768880637238015Arr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
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

    public final void c(P5124777957357031757 p5124777957357031757) {
        p5124777957357031757.getClass();
        int[] iArr = P6705665351656413042.a;
        int b = p5124777957357031757.b();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < b; i++) {
            byte e = p5124777957357031757.e(i);
            byte[] bArr = L14928198200995638215.a;
            j2 += P6705665351656413042.b[e & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int b2 = p5124777957357031757.b();
        P5176232750190581838 p5176232750190581838 = this.a;
        if (i2 >= b2) {
            e(p5124777957357031757.b(), 127, 0);
            p5176232750190581838.B(p5124777957357031757);
            return;
        }
        P5176232750190581838 p51762327501905818382 = new P5176232750190581838();
        int[] iArr2 = P6705665351656413042.a;
        int b3 = p5124777957357031757.b();
        int i3 = 0;
        for (int i4 = 0; i4 < b3; i4++) {
            byte e2 = p5124777957357031757.e(i4);
            byte[] bArr2 = L14928198200995638215.a;
            int i5 = e2 & 255;
            int i6 = P6705665351656413042.a[i5];
            byte b4 = P6705665351656413042.b[i5];
            j = (j << b4) | i6;
            i3 += b4;
            while (i3 >= 8) {
                i3 -= 8;
                p51762327501905818382.D((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            p51762327501905818382.D((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        P5124777957357031757 h = p51762327501905818382.h(p51762327501905818382.b);
        e(h.b(), 127, 128);
        p5176232750190581838.B(h);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            O12229768880637238015 o12229768880637238015 = (O12229768880637238015) arrayList.get(i4);
            P5124777957357031757 j = o12229768880637238015.a.j();
            P5124777957357031757 p5124777957357031757 = o12229768880637238015.b;
            Integer num = (Integer) C17517635496846834643.b.get(j);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    O12229768880637238015[] o12229768880637238015Arr = C17517635496846834643.a;
                    if (S10823041268949770285.t(o12229768880637238015Arr[intValue].b, p5124777957357031757)) {
                        i = i2;
                    } else if (S10823041268949770285.t(o12229768880637238015Arr[i2].b, p5124777957357031757)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    O12229768880637238015 o122297688806372380152 = this.e[i5];
                    o122297688806372380152.getClass();
                    if (S10823041268949770285.t(o122297688806372380152.a, j)) {
                        O12229768880637238015 o122297688806372380153 = this.e[i5];
                        o122297688806372380153.getClass();
                        if (S10823041268949770285.t(o122297688806372380153.b, p5124777957357031757)) {
                            i2 = C17517635496846834643.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + C17517635496846834643.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.D(64);
                c(j);
                c(p5124777957357031757);
                b(o12229768880637238015);
            } else {
                P5124777957357031757 p51247779573570317572 = O12229768880637238015.d;
                j.getClass();
                p51247779573570317572.getClass();
                if (!j.g(p51247779573570317572, p51247779573570317572.b()) || S10823041268949770285.t(O12229768880637238015.i, j)) {
                    e(i, 63, 64);
                    c(p5124777957357031757);
                    b(o12229768880637238015);
                } else {
                    e(i, 15, 0);
                    c(p5124777957357031757);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        P5176232750190581838 p5176232750190581838 = this.a;
        if (i < i2) {
            p5176232750190581838.D(i | i3);
            return;
        }
        p5176232750190581838.D(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            p5176232750190581838.D(128 | (i4 & 127));
            i4 >>>= 7;
        }
        p5176232750190581838.D(i4);
    }
}
