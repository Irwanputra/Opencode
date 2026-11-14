package dev.epro.r0;

import java.io.Serializable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F16470721565862751885 implements Serializable {
    public final int a;
    public final int b;
    public final int[] c;
    public final int d;

    public F16470721565862751885(int i, int i2, int[] iArr, int i3) {
        this.a = i;
        this.b = i2;
        this.c = iArr;
        this.d = i3;
    }

    public final String toString() {
        String str;
        int[] iArr;
        String str2;
        int i = this.d;
        int i2 = i;
        while (true) {
            str = " ... ";
            iArr = this.c;
            if (i2 <= 0) {
                break;
            }
            if (P14266383314427251510.e.a(iArr[i2 - 1])) {
                break;
            }
            int i3 = i2 - 1;
            if (i - i3 > 36.5f) {
                i2 += 4;
                str2 = " ... ";
                break;
            }
            i2 = i3;
        }
        str2 = "";
        int i4 = i;
        while (i4 < iArr.length) {
            if (P14266383314427251510.e.a(iArr[i4])) {
                break;
            }
            int i5 = i4 + 1;
            if (i5 - i > 36.5f) {
                i4 -= 4;
                break;
            }
            i4 = i5;
        }
        str = "";
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < 4; i6++) {
            sb.append(" ");
        }
        sb.append(str2);
        for (int i7 = i2; i7 < i4; i7++) {
            sb.appendCodePoint(iArr[i7]);
        }
        sb.append(str);
        sb.append("\n");
        for (int i8 = 0; i8 < str2.length() + ((4 + i) - i2); i8++) {
            sb.append(" ");
        }
        sb.append("^");
        return " in 'reader', line " + (this.a + 1) + ", column " + (this.b + 1) + ":\n" + sb.toString();
    }
}
