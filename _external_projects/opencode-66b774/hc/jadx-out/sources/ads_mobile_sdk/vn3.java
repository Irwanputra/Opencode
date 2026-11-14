package ads_mobile_sdk;

import dev.epro.r0.A1303980761988566567;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.O17574792317020433029;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class vn3 {
    public static final O17574792317020433029 a;
    public static final boolean b;

    static {
        boolean z;
        O17574792317020433029 o17574792317020433029 = qe.b() ? new O17574792317020433029((byte) 0) : System.getenv("PROTOBUF_FORCE_MOBILE_UTF8_PROCESSOR_FOR_TESTING") != null ? new O17574792317020433029((byte) 0) : tn3.a != null ? new tn3((byte) 1) : new O17574792317020433029((byte) 1);
        a = o17574792317020433029;
        switch (o17574792317020433029.b) {
            case 0:
                z = false;
                break;
            default:
                z = true;
                break;
        }
        b = z;
    }

    public static int a(int i, String str) throws A1303980761988566567 {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new A1303980761988566567(E12098517352909843120.l("Unpaired surrogate at index ", i, length, " of "));
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static boolean b(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                i = i3;
            } else if (b2 < -32) {
                if (i3 >= i2 || b2 < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return false;
                }
            } else if (b2 < -16) {
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i4 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return false;
                }
                if (b2 == -32 && b3 < -96) {
                    return false;
                }
                if (b2 == -19 && b3 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return false;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return false;
                }
                int i5 = i + 2;
                byte b4 = bArr[i3];
                if (b4 > -65) {
                    return false;
                }
                if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                    return false;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return false;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
