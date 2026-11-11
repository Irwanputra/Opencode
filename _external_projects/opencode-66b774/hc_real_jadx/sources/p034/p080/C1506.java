package p034.p080;

/* renamed from: づざかべべ.づざかべべ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1506 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final int[] f6953 = new int[0];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final long[] f6951 = new long[0];

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Object[] f6952 = new Object[0];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m3287(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return i3 ^ (-1);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static boolean m3288(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static int m3289(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return i4 ^ (-1);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static int m3290(int i) {
        return m3292(i * 4) / 4;
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static int m3291(int i) {
        return m3292(i * 8) / 8;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static int m3292(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }
}
