package dev.epro.r0;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y1681784425110360379 {
    public int a;
    public int[] b;
    public int c;
    public Object d;
    public Object e;

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.d;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            O5378677881740157249.q0(jArr, jArr2, 0, 0, jArr.length);
            O5378677881740157249.r0(0, 0, 14, this.b, iArr);
            this.d = jArr2;
            this.b = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int[] iArr2 = (int[]) this.e;
        int length2 = iArr2.length;
        if (this.c >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            O5378677881740157249.r0(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.c;
        this.c = iArr2[i7];
        long[] jArr3 = (long[]) this.d;
        jArr3[i3] = j;
        this.b[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (S10823041268949770285.A(jArr3[i8], j) <= 0) {
                break;
            }
            c(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public float b(TypedArray typedArray, String str, int i, float f) {
        if (O17574792317020433029.l((XmlPullParser) this.d, str)) {
            f = typedArray.getFloat(i, f);
        }
        d(typedArray.getChangingConfigurations());
        return f;
    }

    public void c(int i, int i2) {
        long[] jArr = (long[]) this.d;
        int[] iArr = this.b;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void d(int i) {
        this.a = i | this.a;
    }
}
