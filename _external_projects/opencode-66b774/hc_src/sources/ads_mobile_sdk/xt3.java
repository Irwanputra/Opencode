package ads_mobile_sdk;

import android.util.Base64;
import dev.epro.r0.C468629748621011703;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class xt3 {
    public static final int[] a;

    static {
        int[] iArr = new int[C468629748621011703.d(((~783368690) & 1480833986) | 1027924228, (783368690 & 1108040386) | 324812860, -1842830590, 189893399) ^ (1189641421 % 1025202362)];
        iArr[0] = 1612548114;
        iArr[1] = 48721154;
        iArr[2] = -644182789;
        iArr[3] = 1279563090;
        a = iArr;
    }

    public static String a(String str) {
        int i;
        int d = C468629748621011703.d(1282602894, 1058515395, -2143848605, 250071570) ^ 440071176;
        int i2 = 0;
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[d];
        int i3 = 0;
        while (i3 < decode.length) {
            int i4 = i3 % d;
            if (i4 == 0) {
                int i5 = i3 >>> 3;
                int i6 = i2;
                int i7 = i6;
                int i8 = i7;
                int i9 = i8;
                int i10 = i9;
                int i11 = i10;
                int i12 = i11;
                int i13 = i12;
                int i14 = i13;
                int i15 = i14;
                int i16 = i15;
                int i17 = i16;
                int i18 = i17;
                int i19 = i18;
                int i20 = i19;
                int i21 = i20;
                int i22 = i21;
                i = i22;
                int i23 = 1821351989;
                while (true) {
                    if (i23 == 91464932) {
                        int i24 = 751433995 + i23;
                        i23 += 1234789214;
                        if (i6 >= i7) {
                            i23 = i24;
                        }
                    } else if (i23 == 1326254146) {
                        int i25 = i8 >>> i13;
                        int[] iArr = a;
                        i9 += ((i8 << i10) ^ (i25 + i8)) ^ (i11 + iArr[i11 & i12]);
                        i11 += i14;
                        i8 += ((i9 << i10) ^ (i25 + i9)) ^ (i11 + iArr[(i11 >> i15) & i12]);
                        i6++;
                        i23 -= 1234789214;
                    } else {
                        if (i23 != 1821351989) {
                            break;
                        }
                        i9 = C468629748621011703.d(175107337, -47385642, 329249954, 47050943) ^ 119739257;
                        i23 -= 1729887057;
                        i12 = 3;
                        i7 = 64;
                        i10 = 4;
                        i13 = 5;
                        i14 = 1340169305;
                        i15 = 11;
                        i21 = 255;
                        i20 = 8;
                        i22 = 2;
                        i19 = 16;
                        i18 = 6;
                        i16 = 7;
                        i17 = 24;
                        i8 = i5;
                        i6 = i;
                        i11 = i6;
                    }
                }
                bArr[i] = (byte) (((i9 & i21) << i17) >> i17);
                bArr[1] = (byte) ((((i9 >> i20) & i21) << i17) >> i17);
                bArr[i22] = (byte) ((((i9 >> i19) & i21) << i17) >> i17);
                bArr[i12] = (byte) (i9 >> i17);
                bArr[i10] = (byte) (((i8 & i21) << i17) >> i17);
                bArr[i13] = (byte) ((((i8 >> i20) & i21) << i17) >> i17);
                bArr[i18] = (byte) ((((i8 >> i19) & i21) << i17) >> i17);
                bArr[i16] = (byte) (i8 >> i17);
            } else {
                i = i2;
            }
            decode[i3] = (byte) (((decode[i3] ^ bArr[i4]) << 24) >> 24);
            i3++;
            i2 = i;
        }
        return new String(decode, Charset.defaultCharset());
    }
}
