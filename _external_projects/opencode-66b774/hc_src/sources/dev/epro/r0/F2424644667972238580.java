package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class F2424644667972238580 {
    public static final E2166724654553415323 a;

    static {
        a = (J3288146055636008296.e && J3288146055636008296.d && !G13422218907440197973.a()) ? new E2166724654553415323((byte) 1) : new E2166724654553415323((byte) 0);
    }

    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int c(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return a(b, bArr[i]);
        }
        if (i3 == 2) {
            return b(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
