package dev.epro.r0;

import ads_mobile_sdk.rb1;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class X2485016533998461232 {
    public static final E3361600325772812308 _a(int i) {
        switch (L11610354117192841236.A(i)) {
            case 0:
            case 7:
            case 8:
            case 10:
            case 11:
            case 17:
            case 18:
            case 19:
                return E3361600325772812308.INTERNAL_ERROR;
            case 1:
            case 5:
            case 6:
                return E3361600325772812308.INVALID_REQUEST;
            case 2:
            case 12:
                return E3361600325772812308.NO_FILL;
            case 3:
                return E3361600325772812308.APP_ID_MISSING;
            case 4:
                return E3361600325772812308.NETWORK_ERROR;
            case 9:
                return E3361600325772812308.AD_RESPONSE_ALREADY_USED;
            case 13:
                return E3361600325772812308.INVALID_AD_RESPONSE;
            case 14:
                return E3361600325772812308.REQUEST_ID_MISMATCH;
            case 15:
                return E3361600325772812308.TIMEOUT;
            case 16:
                return E3361600325772812308.CANCELLED;
            default:
                Z3383101362411723454.g();
                return null;
        }
    }

    public static final int _getNumber(int i) {
        if (i == 10) {
            byte[] bArr = rb1.a;
            S10973172697741180971.j("Can't get the number of an unknown enum value.");
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
                return 7;
            case 9:
                return 8;
            case 10:
                return -1;
            default:
                throw null;
        }
    }

    public static final int _getNumber$4(int i) {
        if (i == 8) {
            byte[] bArr = rb1.a;
            S10973172697741180971.j("Can't get the number of an unknown enum value.");
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

    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "_ac";
        }
        if (i == 2) {
            return "_ai";
        }
        if (i == 3) {
            return "_ar";
        }
        throw null;
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return -2;
            case 2:
                return -1;
            case 3:
                return 0;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 3;
            case 7:
                return 4;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int e(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 4;
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
                return 18;
            case 12:
                return 12;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return -1;
            default:
                throw null;
        }
    }

    public static int f(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static StringBuilder g(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder h(String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static void i(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
    }

    public static void j(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void k(StringBuilder sb, String str, String str2, int i, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REWARD" : "IMPRESSION" : "CLICK";
    }

    public static /* synthetic */ String m(int i) {
        switch (i) {
            case 1:
                return "INTERNAL_ERROR";
            case 2:
                return "INVALID_REQUEST";
            case 3:
                return "NO_FILL";
            case 4:
                return "APP_ID_MISSING";
            case 5:
                return "NETWORK_ERROR";
            case 6:
                return "INVALID_AD_UNIT_ID";
            case 7:
                return "INVALID_AD_SIZE";
            case 8:
                return "MEDIATION_SHOW_ERROR";
            case 9:
                return "NOT_READY";
            case 10:
                return "AD_RESPONSE_ALREADY_USED";
            case 11:
                return "APP_NOT_FOREGROUND";
            case 12:
                return "INTERNAL_SHOW_ERROR";
            case 13:
                return "MEDIATION_NO_FILL";
            case 14:
                return "INVALID_AD_RESPONSE";
            case 15:
                return "REQUEST_ID_MISMATCH";
            case 16:
                return "TIMEOUT";
            case 17:
                return "CANCELLED";
            case 18:
                return "WEB_VIEW_DESTROYED_ERROR";
            case 19:
                return "ADAPTER_INITIALIZATION_ERROR";
            case 20:
                return "INVALID_DATA_URL";
            default:
                return "null";
        }
    }
}
