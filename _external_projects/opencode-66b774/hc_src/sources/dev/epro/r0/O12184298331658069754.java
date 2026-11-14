package dev.epro.r0;

import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O12184298331658069754 implements H11646813293457574213 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ H11646813293457574213 b;
    public final /* synthetic */ A12581365276667340144 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ H11646813293457574213 e;

    public /* synthetic */ O12184298331658069754(H11646813293457574213 h11646813293457574213, A12581365276667340144 a12581365276667340144, int i, H11646813293457574213 h116468132934575742132, byte b) {
        this.a = b;
        this.c = a12581365276667340144;
        this.d = i;
        this.e = h116468132934575742132;
        this.b = h11646813293457574213;
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final void b() {
        int i;
        byte b = this.a;
        H11646813293457574213 h11646813293457574213 = this.e;
        int i2 = this.d;
        A12581365276667340144 a12581365276667340144 = this.c;
        switch (b) {
            case 0:
                a12581365276667340144.e = i2;
                h11646813293457574213.b();
                D389890677992184566 d389890677992184566 = a12581365276667340144.m;
                A4559761392562572984 a4559761392562572984 = a12581365276667340144.l;
                long[] jArr = a4559761392562572984.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = a4559761392562572984.b[i7];
                                    N12973910657118401350 n12973910657118401350 = (N12973910657118401350) a4559761392562572984.c[i7];
                                    int k = d389890677992184566.k(obj);
                                    if (k < 0 || k >= a12581365276667340144.e) {
                                        if (k >= 0) {
                                            Object obj2 = Z860808776098365610.j;
                                            i = i4;
                                            Object[] objArr = d389890677992184566.a;
                                            Object obj3 = objArr[k];
                                            objArr[k] = obj2;
                                        } else {
                                            i = i4;
                                        }
                                        if (a12581365276667340144.j.b(obj)) {
                                            n12973910657118401350.a();
                                        }
                                        a4559761392562572984.m(i7);
                                        j >>= i;
                                        i6++;
                                        i4 = i;
                                    }
                                }
                                i = i4;
                                j >>= i;
                                i6++;
                                i4 = i;
                            }
                            if (i5 != i4) {
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        }
                    }
                }
                a12581365276667340144.d(a12581365276667340144.d);
                break;
            default:
                a12581365276667340144.d = i2;
                h11646813293457574213.b();
                if (a12581365276667340144.a.h == null) {
                    a12581365276667340144.d(a12581365276667340144.d);
                    break;
                }
                break;
        }
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final L12639328004344855510 c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int d() {
        switch (this.a) {
        }
        return this.b.d();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final F4096073349764486348 e() {
        switch (this.a) {
        }
        return this.b.e();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final F4096073349764486348 f() {
        switch (this.a) {
        }
        return this.b.f();
    }

    @Override // dev.epro.r0.H11646813293457574213
    public final int g() {
        switch (this.a) {
        }
        return this.b.g();
    }
}
