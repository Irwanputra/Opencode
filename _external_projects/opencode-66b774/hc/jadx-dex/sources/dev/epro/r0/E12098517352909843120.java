package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract /* synthetic */ class E12098517352909843120 {
    public static int _a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static final int _getNumber(int i) {
        if (i == 8) {
            byte[] bArr = ads_mobile_sdk.rb1.a;
            dev.epro.r0.S10973172697741180971.j("Can't get the number of an unknown enum value.");
            return 0;
        }
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return -1;
            default:
                throw null;
        }
    }

    public static final int _getNumber$1(int i) {
        if (i != 8) {
            return d(i);
        }
        byte[] bArr = ads_mobile_sdk.rb1.a;
        dev.epro.r0.S10973172697741180971.j("Can't get the number of an unknown enum value.");
        return 0;
    }

    public static /* synthetic */ byte a(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i == 4) {
            return (byte) 3;
        }
        throw null;
    }

    public static /* synthetic */ byte b(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 9;
            case 11:
                return (byte) 10;
            case 12:
                return (byte) 11;
            case 13:
                return (byte) 12;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 7;
            case 5:
                return 9;
            case 6:
                return 11;
            case 7:
                return 13;
            case 8:
                return 15;
            case 9:
                return 17;
            case 10:
                return 19;
            case 11:
                return 2;
            case 12:
                return 4;
            case 13:
                return 8;
            case 14:
                return 16;
            case 15:
                return 32;
            case 16:
                return 64;
            case 17:
                return 128;
            case 18:
                return 256;
            case 19:
                return 512;
            case 20:
                return 1024;
            case 21:
                return 2048;
            case 22:
                return 4096;
            case 23:
                return 8192;
            case 24:
                return 16384;
            case 25:
                return 32768;
            case 26:
                return 65536;
            case 27:
                return 131072;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return -1;
            default:
                throw null;
        }
    }

    public static int e(float f, int i, int i2) {
        return (java.lang.Float.hashCode(f) + i) * i2;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static int g(int i, int i2, int i3, int i4, int i5) {
        return java.lang.Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int h(int i, int i2, java.lang.String str) {
        return (str.hashCode() + i) * i2;
    }

    public static ads_mobile_sdk.fn1 i(java.util.LinkedHashMap linkedHashMap, java.lang.String str, dev.epro.r0.V2597580950516131749 v2597580950516131749, java.util.LinkedHashMap linkedHashMap2) {
        linkedHashMap.put(str, v2597580950516131749);
        return new ads_mobile_sdk.fn1(linkedHashMap2);
    }

    public static dev.epro.r0.Z1085125311131623997 j(dev.epro.r0.M665231115116566295 m665231115116566295, dev.epro.r0.M665231115116566295 m6652311151165662952) {
        m665231115116566295.getClass();
        return new dev.epro.r0.Z1085125311131623997(m6652311151165662952, (byte) 0);
    }

    public static java.lang.String k(long j, java.lang.String str) {
        return str + j;
    }

    public static java.lang.String l(java.lang.String str, int i, int i2, java.lang.String str2) {
        return str + i + str2 + i2;
    }

    public static java.lang.String m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static java.lang.String n(java.lang.StringBuilder sb, int i, java.lang.String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String o(java.lang.StringBuilder sb, boolean z, java.lang.String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.StringBuilder p(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static java.lang.StringBuilder q(int i, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static java.lang.StringBuilder r(java.lang.String str, java.lang.String str2, long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static void s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void t(java.lang.String str, java.util.ArrayList arrayList) {
        arrayList.add(dev.epro.r0.M8927913404651150384.D0(str).toString());
    }

    public static void u(java.lang.StringBuilder sb, boolean z, java.lang.String str, boolean z2, java.lang.String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static /* synthetic */ java.lang.String v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NOTIFICATION_CLICK" : "CLICK" : "UNDEFINED";
    }
}
