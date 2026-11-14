package dev.epro.r0;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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

    public final void c(P5124777957357031757 p5124777957357031757) throws EOFException {
        p5124777957357031757.getClass();
        int[] iArr = P6705665351656413042.a;
        int iB = p5124777957357031757.b();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < iB; i++) {
            byte bE = p5124777957357031757.e(i);
            byte[] bArr = L14928198200995638215.a;
            j2 += (long) P6705665351656413042.b[bE & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int iB2 = p5124777957357031757.b();
        P5176232750190581838 p5176232750190581838 = this.a;
        if (i2 >= iB2) {
            e(p5124777957357031757.b(), 127, 0);
            p5176232750190581838.B(p5124777957357031757);
            return;
        }
        P5176232750190581838 p51762327501905818382 = new P5176232750190581838();
        int[] iArr2 = P6705665351656413042.a;
        int iB3 = p5124777957357031757.b();
        int i3 = 0;
        for (int i4 = 0; i4 < iB3; i4++) {
            byte bE2 = p5124777957357031757.e(i4);
            byte[] bArr2 = L14928198200995638215.a;
            int i5 = bE2 & 255;
            int i6 = P6705665351656413042.a[i5];
            byte b = P6705665351656413042.b[i5];
            j = (j << b) | ((long) i6);
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                p51762327501905818382.D((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            p51762327501905818382.D((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        P5124777957357031757 p5124777957357031757H = p51762327501905818382.h(p51762327501905818382.b);
        e(p5124777957357031757H.b(), 127, 128);
        p5176232750190581838.B(p5124777957357031757H);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G4640088786804747587.d(java.util.ArrayList):void");
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
