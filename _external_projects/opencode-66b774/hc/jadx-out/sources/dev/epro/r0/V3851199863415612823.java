package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V3851199863415612823 {
    public static final X7410747940286448830 a;

    static {
        a = (Z3287610729711297369.e && Z3287610729711297369.d && !E6993330184355272251.a()) ? new X7410747940286448830((byte) 1) : new X7410747940286448830((byte) 0);
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
                i++;
            } else {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new A12427038762635094204(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        S10973172697741180971.j(E12098517352909843120.k(((long) i2) + 4294967296L, "UTF-8 length does not fit in int: "));
        return 0;
    }

    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int c(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int d(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return b(b, bArr[i]);
        }
        if (i3 == 2) {
            return c(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
