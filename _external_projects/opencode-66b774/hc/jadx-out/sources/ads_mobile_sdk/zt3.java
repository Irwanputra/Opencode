package ads_mobile_sdk;

import dev.epro.r0.C468629748621011703;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class zt3 {
    public static final zt3 b = new zt3(new byte[0]);
    public final byte[] a;

    public zt3(byte[] bArr) {
        this.a = bArr;
    }

    public final byte a(int i) {
        int iD = C468629748621011703.d(1537442946, 980299645, -2054635237, 102375994) ^ 379786517;
        byte[] bArr = this.a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) >= 0) {
            return bArr[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + iD);
            sb.append(xt3.a("Akelqh1fajntGgo="));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(length).length());
        String strA = xt3.a("Akelqh1faDmxRUSK1T9GeQ==");
        String strA2 = xt3.a("Zwk=");
        sb2.append(strA);
        sb2.append(i);
        sb2.append(strA2);
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zt3) {
            return Arrays.equals(this.a, ((zt3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int iD = C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        String string = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + iD);
        sb.append(xt3.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(xt3.a("Ng=="));
        return sb.toString();
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final zt3 a(zt3 zt3Var) {
        byte[] bArr;
        byte[] bArr2 = this.a;
        int length = bArr2.length + zt3Var.a.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        byte[] bArr4 = zt3Var.a;
        System.arraycopy(bArr4, 0, bArr3, bArr2.length, bArr4.length);
        if (length == 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[length];
            System.arraycopy(bArr3, 0, bArr, 0, length);
        }
        return new zt3(bArr);
    }

    public static zt3 a(String str) {
        byte[] bArr;
        byte[] bytes = str.getBytes(Charset.forName(xt3.a("Hn2H4l0=")));
        int length = bytes.length;
        if (length == 0) {
            bArr = new byte[0];
        } else {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bytes, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        return new zt3(bArr);
    }

    public static int a(byte b2) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        return b2 & (C468629748621011703.d((i2 & (~i)) | i3, (i & i4) | i5, iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]));
    }
}
