package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D3909889792577220704 {
    public static final dev.epro.r0.Y2666402291564931474 a;

    static {
        a = (dev.epro.r0.P4046997492550522548.e && dev.epro.r0.P4046997492550522548.d && !dev.epro.r0.A8141988655906277116.a()) ? new dev.epro.r0.N12664064975553951886((byte) 1) : new dev.epro.r0.N12664064975553951886((byte) 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.F7230653200702688167 */
    public static int a(java.lang.String str) throws dev.epro.r0.F7230653200702688167 {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i2) < 65536) {
                                throw new dev.epro.r0.F7230653200702688167(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }
}
