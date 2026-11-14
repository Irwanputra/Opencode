package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G17795399428317025709 implements I1845098107738424918 {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final A4559761392562572984 d = new A4559761392562572984();

    public final void a() {
        A4559761392562572984 a4559761392562572984 = this.d;
        Object[] objArr = a4559761392562572984.c;
        long[] jArr = a4559761392562572984.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof U9803441765912152712) {
                                U9803441765912152712 u9803441765912152712 = (U9803441765912152712) obj;
                                Object[] objArr2 = u9803441765912152712.a;
                                int i4 = u9803441765912152712.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        a4559761392562572984.a();
    }
}
