package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P14774717930487319108 implements N12402914283838705413 {
    public final S2825552134743079771 a;

    public P14774717930487319108(S2825552134743079771 s2825552134743079771) {
        this.a = s2825552134743079771;
    }

    @Override // dev.epro.r0.M15459437176959963354
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C15068980819508120478 a(R3937090736490516115 r3937090736490516115) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        S2825552134743079771 s2825552134743079771 = this.a;
        Q9908018528090167751 q9908018528090167751 = s2825552134743079771.b;
        G1892398518770611911 g1892398518770611911 = new G1892398518770611911(q9908018528090167751.e + 2);
        Q9908018528090167751 q99080185280901677512 = new Q9908018528090167751(q9908018528090167751.e);
        int[] iArr3 = q9908018528090167751.b;
        Object[] objArr3 = q9908018528090167751.c;
        long[] jArr = q9908018528090167751.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            X14437668849694674461 x14437668849694674461 = (X14437668849694674461) objArr3[i6];
                            g1892398518770611911.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            q99080185280901677512.i(i7, new L1995871430852137122((Z13251062865217617579) ((O3410298526443296213) r3937090736490516115).a.invoke(x14437668849694674461.a), x14437668849694674461.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!q9908018528090167751.a(0)) {
            int i8 = g1892398518770611911.b;
            if (i8 < 0) {
                W4415201450379021245.a("Index must be between 0 and size");
                return null;
            }
            g1892398518770611911.b(i8 + 1);
            int[] iArr4 = g1892398518770611911.a;
            int i9 = g1892398518770611911.b;
            if (i9 != 0) {
                O5378677881740157249.m0(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            g1892398518770611911.b++;
        }
        if (!q9908018528090167751.a(s2825552134743079771.a)) {
            g1892398518770611911.a(s2825552134743079771.a);
        }
        int i10 = g1892398518770611911.b;
        if (i10 != 0) {
            int[] iArr5 = g1892398518770611911.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new C15068980819508120478(g1892398518770611911, q99080185280901677512, s2825552134743079771.a, W10816543021280842737.d);
    }
}
