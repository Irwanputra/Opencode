package dev.epro.r0;

import ads_mobile_sdk.fh1;
import ads_mobile_sdk.mi3;
import ads_mobile_sdk.s8;
import ads_mobile_sdk.tu2;
import ads_mobile_sdk.ur2;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.chromium.net.ApiVersion;

/* JADX INFO: loaded from: classes3.dex */
public final class X7410747940286448830 {
    public final /* synthetic */ byte a;

    static {
        izmyclvb.qgayjvbiagej2(846);
    }

    public static mi3 a() {
        return new mi3(new ur2(), new fh1(), new tu2(), new s8());
    }

    public static final native boolean b(Map map, String str, boolean z);

    public static final void c(V14323974914327418545 v14323974914327418545, String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = v14323974914327418545.a;
        arrayList.add(str);
        arrayList.add(M8927913404651150384.D0(str2).toString());
    }

    public static final F12902864952249894497 d(V14323974914327418545 v14323974914327418545) {
        v14323974914327418545.getClass();
        return new F12902864952249894497((String[]) v14323974914327418545.a.toArray(new String[0]));
    }

    public static final String e(F12902864952249894497 f12902864952249894497, int i) {
        f12902864952249894497.getClass();
        String str = (String) O5378677881740157249.I0(i * 2, f12902864952249894497.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public static final V14323974914327418545 f(F12902864952249894497 f12902864952249894497) {
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 2);
        String[] strArr = f12902864952249894497.a;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        v14323974914327418545.a.addAll(listAsList);
        return v14323974914327418545;
    }

    public static final String g(F12902864952249894497 f12902864952249894497, int i) {
        f12902864952249894497.getClass();
        String str = (String) O5378677881740157249.I0((i * 2) + 1, f12902864952249894497.a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public static int j() {
        return Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? ApiVersion.getApiLevel() : ApiVersion.getMaximumAvailableApiLevel();
    }

    public static final void k(String str) {
        str.getClass();
        if (str.length() <= 0) {
            S10973172697741180971.j("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                M9216324016624295870.q(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                X2485016533998461232.k(sb, string, " at ", i, " in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void l(String str, String str2) {
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                M9216324016624295870.q(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                X2485016533998461232.k(sb, string, " at ", i, " in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(L14928198200995638215.j(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final native Integer m(H9594781759364688001 h9594781759364688001);

    public static final native Object n(String str, E18264047742178737806 e18264047742178737806, F6422910147558944029 f6422910147558944029, K14749510448791472029 k14749510448791472029);

    public static final long o(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : U10174709222559481877.b(U10174709222559481877.c(j) * f, j);
    }

    public static String[] p(String str, char c) {
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        String[] strArr = new String[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (i3 >= str.length()) {
                strArr[i4] = "";
            } else {
                int iIndexOf = str.indexOf(c, i3);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                strArr[i4] = str.substring(i3, iIndexOf);
                i3 = iIndexOf + 1;
            }
        }
        return strArr;
    }

    public static final native Integer r(Map map, String str);

    public static final I1722681268793429505 s(I1722681268793429505 i1722681268793429505) {
        return J11170665878571083300.b(i1722681268793429505, false, new Y13361005827119333637((byte) 0));
    }

    public static final native Integer t(String str);

    public static final Rect u(I11366018238968599357 i11366018238968599357) {
        return new Rect(i11366018238968599357.a, i11366018238968599357.b, i11366018238968599357.c, i11366018238968599357.d);
    }

    public static final RectF v(S6349823729575121924 s6349823729575121924) {
        return new RectF(s6349823729575121924.a, s6349823729575121924.b, s6349823729575121924.c, s6349823729575121924.d);
    }

    public static final S6349823729575121924 w(RectF rectF) {
        return new S6349823729575121924(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static int x(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            X7410747940286448830 x7410747940286448830 = V3851199863415612823.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return V3851199863415612823.b(i, Z3287610729711297369.e(j, bArr));
        }
        if (i2 == 2) {
            return V3851199863415612823.c(i, Z3287610729711297369.e(j, bArr), Z3287610729711297369.e(j + 1, bArr));
        }
        throw new AssertionError();
    }

    public static void y(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(int r10, byte[] r11, int r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7410747940286448830.h(int, byte[], int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(int r25, int r26, java.lang.String r27, byte[] r28) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7410747940286448830.i(int, int, java.lang.String, byte[]):int");
    }

    public final int q(int i, byte[] bArr, int i2) {
        long j;
        int i3;
        long j2;
        int i4 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j3 = i4;
                int i5 = (int) (((long) i2) - j3);
                long j4 = 1;
                if (i5 < 16) {
                    j = j3;
                    j2 = 1;
                    i3 = 0;
                } else {
                    int i6 = 8 - (((int) j3) & 7);
                    j = j3;
                    i3 = 0;
                    long j5 = j;
                    while (true) {
                        if (i3 < i6) {
                            long j6 = j5 + 1;
                            if (Z3287610729711297369.e(j5, bArr) < 0) {
                                j2 = 1;
                            } else {
                                i3++;
                                j5 = j6;
                            }
                        } else {
                            while (true) {
                                int i7 = i3 + 8;
                                if (i7 <= i5) {
                                    j2 = j4;
                                    if ((Z3287610729711297369.i(Z3287610729711297369.f + j5, bArr) & (-9187201950435737472L)) == 0) {
                                        j5 += 8;
                                        i3 = i7;
                                        j4 = j2;
                                    }
                                } else {
                                    j2 = j4;
                                }
                            }
                            while (true) {
                                if (i3 < i5) {
                                    long j7 = j5 + j2;
                                    if (Z3287610729711297369.e(j5, bArr) >= 0) {
                                        i3++;
                                        j5 = j7;
                                    }
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                    }
                }
                int i8 = i5 - i3;
                long j8 = j + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j9 = j8 + j2;
                            byte bE = Z3287610729711297369.e(j8, bArr);
                            if (bE >= 0) {
                                i8--;
                                j8 = j9;
                                b = bE;
                            } else {
                                j8 = j9;
                                b = bE;
                            }
                        }
                    }
                    if (i8 == 0) {
                        return 0;
                    }
                    int i9 = i8 - 1;
                    if (b < -32) {
                        if (i9 == 0) {
                            return b;
                        }
                        i8 -= 2;
                        if (b < -62) {
                            return -1;
                        }
                        long j10 = j8 + j2;
                        if (Z3287610729711297369.e(j8, bArr) > -65) {
                            return -1;
                        }
                        j8 = j10;
                    } else if (b < -16) {
                        if (i9 < 2) {
                            return x(j8, bArr, b, i9);
                        }
                        i8 -= 3;
                        long j11 = j8 + j2;
                        byte bE2 = Z3287610729711297369.e(j8, bArr);
                        if (bE2 > -65) {
                            return -1;
                        }
                        if (b == -32 && bE2 < -96) {
                            return -1;
                        }
                        if (b == -19 && bE2 >= -96) {
                            return -1;
                        }
                        j8 += 2;
                        if (Z3287610729711297369.e(j11, bArr) > -65) {
                            return -1;
                        }
                    } else {
                        if (i9 < 3) {
                            return x(j8, bArr, b, i9);
                        }
                        i8 -= 4;
                        long j12 = j8 + j2;
                        byte bE3 = Z3287610729711297369.e(j8, bArr);
                        if (bE3 > -65) {
                            return -1;
                        }
                        if ((((bE3 + 112) + (b << 28)) >> 30) != 0) {
                            return -1;
                        }
                        long j13 = j8 + 2;
                        if (Z3287610729711297369.e(j12, bArr) > -65) {
                            return -1;
                        }
                        j8 += 3;
                        if (Z3287610729711297369.e(j13, bArr) > -65) {
                            return -1;
                        }
                    }
                }
                break;
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b2 = bArr[i4];
                if (b2 >= 0) {
                    i4 = i10;
                } else if (b2 < -32) {
                    if (i10 >= i2) {
                        return b2;
                    }
                    if (b2 < -62) {
                        return -1;
                    }
                    i4 += 2;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    if (i10 >= i2 - 1) {
                        return V3851199863415612823.d(i10, bArr, i2);
                    }
                    int i11 = i4 + 2;
                    byte b3 = bArr[i10];
                    if (b3 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b3 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b3 >= -96) {
                        return -1;
                    }
                    i4 += 3;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                } else {
                    if (i10 >= i2 - 2) {
                        return V3851199863415612823.d(i10, bArr, i2);
                    }
                    int i12 = i4 + 2;
                    byte b4 = bArr[i10];
                    if (b4 > -65) {
                        return -1;
                    }
                    if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i13 = i4 + 3;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                    i4 += 4;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
