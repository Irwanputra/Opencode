package dev.epro.r0;

import ads_mobile_sdk.pd;
import ads_mobile_sdk.qu0;
import ads_mobile_sdk.su0;
import ads_mobile_sdk.xu0;
import ads_mobile_sdk.yu0;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract class D6215562826263076784 {
    public static Z7022156542152740569 a;

    static {
        izmyclvb.oeynnivvrnts0(1202);
    }

    public static final void a(T15443218846549482730 t15443218846549482730, T15443218846549482730 t154432188465494827302, T15443218846549482730 t154432188465494827303, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.b0(-493479138);
        int i2 = (m3727281027331139839.h(t15443218846549482730) ? 4 : 2) | i | (m3727281027331139839.h(t154432188465494827303) ? 256 : 128);
        if (m3727281027331139839.R(i2 & 1, (i2 & 147) != 146)) {
            T15443218846549482730 t15443218846549482730T = S10823041268949770285.T(468305759, new V8104000428493290582((Object) t154432188465494827303, (Object) t15443218846549482730, (Object) t154432188465494827302, (byte) 5), m3727281027331139839);
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                objM = D4887919054349991205.k;
                m3727281027331139839.k0(objM);
            }
            A10838822263452390785 a10838822263452390785 = (A10838822263452390785) objM;
            int iA = E12775674050813925581.A(m3727281027331139839);
            P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            I1722681268793429505 i1722681268793429505N = V12319504402545346730.N(m3727281027331139839, V10993962107938880611.a);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
            if (m3727281027331139839.S || !S10823041268949770285.t(m3727281027331139839.M(), Integer.valueOf(iA))) {
                L11610354117192841236.t(iA, m3727281027331139839, iA, x4712621039624176170);
            }
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            G11450220448113054352.m(6, t15443218846549482730T, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new L8467694984959092745(t15443218846549482730, t154432188465494827302, t154432188465494827303, i, (byte) 20);
        }
    }

    public static final void b(B13729205492206812220 b13729205492206812220, T15443218846549482730 t15443218846549482730, T15443218846549482730 t154432188465494827302, I1722681268793429505 i1722681268793429505, V11842483535419227802 v11842483535419227802, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, I5573661370475160895 i5573661370475160895, long j, T15443218846549482730 t154432188465494827303, M3727281027331139839 m3727281027331139839, int i) {
        B13729205492206812220 b137292054922068122202;
        int i2;
        I1722681268793429505 i17226812687934295052;
        V11842483535419227802 v118424835354192278022;
        I5573661370475160895 i55736613704751608952;
        long j2;
        int i3;
        V11842483535419227802 v118424835354192278023;
        I1722681268793429505 i17226812687934295053;
        I5573661370475160895 i55736613704751608953;
        long j3;
        m3727281027331139839.b0(951250327);
        if ((i & 6) == 0) {
            b137292054922068122202 = b13729205492206812220;
            i2 = (m3727281027331139839.h(b137292054922068122202) ? 4 : 2) | i;
        } else {
            b137292054922068122202 = b13729205492206812220;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= m3727281027331139839.h(t154432188465494827302) ? 256 : 128;
        }
        int i4 = i2 | 27648;
        if ((196608 & i) == 0) {
            i4 |= m3727281027331139839.h(l12639328004344855510) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= m3727281027331139839.h(l126393280043448555102) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= m3727281027331139839.h(t154432188465494827303) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : SQLiteDatabase.CREATE_IF_NECESSARY;
        }
        if (m3727281027331139839.R(i4 & 1, (306783379 & i4) != 306783378)) {
            m3727281027331139839.W();
            if ((i & 1) == 0 || m3727281027331139839.z()) {
                V11842483535419227802 v118424835354192278024 = new V11842483535419227802(3);
                I5573661370475160895 i5573661370475160895B = N13258083306148085703.b(K5751602218013079365.k, m3727281027331139839);
                long jE = J5654975781851244064.e(K5751602218013079365.i, m3727281027331139839);
                i3 = i4 & (-264241153);
                v118424835354192278023 = v118424835354192278024;
                i17226812687934295053 = V10993962107938880611.a;
                i55736613704751608953 = i5573661370475160895B;
                j3 = jE;
            } else {
                m3727281027331139839.U();
                i17226812687934295053 = i1722681268793429505;
                i55736613704751608953 = i5573661370475160895;
                j3 = j;
                i3 = i4 & (-264241153);
                v118424835354192278023 = v11842483535419227802;
            }
            m3727281027331139839.r();
            D15445857918358799638.b(b137292054922068122202, v118424835354192278023, S10823041268949770285.T(296331566, new H18085229718876362219(t15443218846549482730, t154432188465494827302, i17226812687934295053, l12639328004344855510, l126393280043448555102, i55736613704751608953, j3, t154432188465494827303), m3727281027331139839), m3727281027331139839, ((i3 >> 9) & 112) | (i3 & 14) | 384, 0);
            v118424835354192278022 = v118424835354192278023;
            i17226812687934295052 = i17226812687934295053;
            i55736613704751608952 = i55736613704751608953;
            j2 = j3;
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            v118424835354192278022 = v11842483535419227802;
            i55736613704751608952 = i5573661370475160895;
            j2 = j;
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new V780500219332703036(b13729205492206812220, t15443218846549482730, t154432188465494827302, i17226812687934295052, v118424835354192278022, l12639328004344855510, l126393280043448555102, i55736613704751608952, j2, t154432188465494827303, i);
        }
    }

    public static final void c(T15443218846549482730 t15443218846549482730, T15443218846549482730 t154432188465494827302, I1722681268793429505 i1722681268793429505, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, I5573661370475160895 i5573661370475160895, long j, T15443218846549482730 t154432188465494827303, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.b0(-401873644);
        int i2 = i | (m3727281027331139839.h(t15443218846549482730) ? 4 : 2) | (m3727281027331139839.h(t154432188465494827302) ? 32 : 16) | (m3727281027331139839.f(i1722681268793429505) ? 256 : 128) | (m3727281027331139839.h(l12639328004344855510) ? 2048 : 1024) | (m3727281027331139839.h(l126393280043448555102) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192) | (m3727281027331139839.f(i5573661370475160895) ? 131072 : 65536) | (m3727281027331139839.e(j) ? 1048576 : 524288) | (m3727281027331139839.h(t154432188465494827303) ? 8388608 : 4194304);
        if (m3727281027331139839.R(i2 & 1, (4793491 & i2) != 4793490)) {
            m3727281027331139839.W();
            if ((i & 1) != 0 && !m3727281027331139839.z()) {
                m3727281027331139839.U();
            }
            m3727281027331139839.r();
            X15668192874961033526.a(M9216324016624295870.p(i1722681268793429505, j, i5573661370475160895), i5573661370475160895, 0L, 0L, K5751602218013079365.j, 0.0f, null, S10823041268949770285.T(1522143641, new N9708030297098270558(t154432188465494827302, t154432188465494827303, l12639328004344855510, l126393280043448555102, t15443218846549482730), m3727281027331139839), m3727281027331139839, ((i2 >> 12) & 112) | 12607488, pd.i1);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new F12290693731179532198(t15443218846549482730, t154432188465494827302, i1722681268793429505, l12639328004344855510, l126393280043448555102, i5573661370475160895, j, t154432188465494827303, i);
        }
    }

    public static int d(M16184408391440927034 m16184408391440927034) {
        m16184408391440927034.getClass();
        if (m16184408391440927034 instanceof xu0) {
            return 1;
        }
        if (m16184408391440927034 instanceof yu0) {
            return 3;
        }
        if (m16184408391440927034 instanceof qu0) {
            return ((qu0) m16184408391440927034).c instanceof CancellationException ? 5 : 6;
        }
        if (m16184408391440927034 instanceof su0) {
            int iIntValue = ((su0) m16184408391440927034).c.L().intValue();
            if (iIntValue == 7) {
                return 4;
            }
            if (iIntValue == 3) {
                return 2;
            }
        }
        return 7;
    }

    public static A10855252310988578378 e(B10755433227221787048 b10755433227221787048, String str, int i) {
        b10755433227221787048.getClass();
        str.getClass();
        return new A10855252310988578378(b10755433227221787048, str, i);
    }

    public static void f(K15438463641018513946 k15438463641018513946, List list, V8232844453216786975 v8232844453216786975) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = k15438463641018513946.c((M7798980774515057476) list.get(i));
            int iO = k15438463641018513946.O(k15438463641018513946.b, k15438463641018513946.q(iC));
            Object obj = iO < k15438463641018513946.f(k15438463641018513946.b, k15438463641018513946.q(iC + 1)) ? k15438463641018513946.c[k15438463641018513946.g(iO)] : O9023047933786425027.a;
            V4878375136513573151 v4878375136513573151 = obj instanceof V4878375136513573151 ? (V4878375136513573151) obj : null;
            if (v4878375136513573151 != null) {
                v4878375136513573151.a = v8232844453216786975;
            }
        }
    }

    public static final native Q7430090668634766253 g(Q7430090668634766253 q7430090668634766253, Map map);

    public static final native Q7430090668634766253 h(Q7430090668634766253 q7430090668634766253, Map map, boolean z);

    public static /* synthetic */ A10855252310988578378 i(B10755433227221787048 b10755433227221787048, String str, int i) {
        if ((i & 1) != 0) {
            b10755433227221787048 = B10755433227221787048.a;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return e(b10755433227221787048, str, 0);
    }

    public static byte[] j(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b;
        bArrCopyOf[31] = (byte) (b | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        int i2 = 0;
        while (true) {
            byte[][] bArr3 = M9216324016624295870.a;
            if (i2 >= 7) {
                long[] jArrN = O4077903568229246.n(bArrCopyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i3 = 10;
                System.arraycopy(jArrN, 0, jArr2, 0, 10);
                for (int i4 = 32; i < i4; i4 = 32) {
                    int i5 = bArrCopyOf[31 - i] & 255;
                    int i6 = 0;
                    while (i6 < 8) {
                        int i7 = (i5 >> (7 - i6)) & 1;
                        M9216324016624295870.Y(jArr4, jArr2, i7);
                        M9216324016624295870.Y(jArr5, jArr3, i7);
                        byte[] bArr4 = bArrCopyOf;
                        long[] jArrCopyOf = Arrays.copyOf(jArr4, 10);
                        int i8 = i5;
                        long[] jArr10 = new long[19];
                        int i9 = i;
                        long[] jArr11 = new long[19];
                        int i10 = i6;
                        long[] jArr12 = new long[19];
                        long[] jArr13 = jArr;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = new long[19];
                        long[] jArr16 = jArr9;
                        long[] jArr17 = new long[19];
                        long[] jArr18 = new long[19];
                        O4077903568229246.T(jArr4, jArr4, jArr5);
                        O4077903568229246.S(jArr5, jArrCopyOf, jArr5);
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                        O4077903568229246.T(jArr2, jArr2, jArr3);
                        O4077903568229246.S(jArr3, jArrCopyOf2, jArr3);
                        O4077903568229246.J(jArr14, jArr2, jArr5);
                        O4077903568229246.J(jArr15, jArr4, jArr3);
                        O4077903568229246.N(jArr14);
                        O4077903568229246.M(jArr14);
                        O4077903568229246.N(jArr15);
                        O4077903568229246.M(jArr15);
                        long[] jArr19 = jArr2;
                        System.arraycopy(jArr14, 0, jArrCopyOf2, 0, 10);
                        O4077903568229246.T(jArr14, jArr14, jArr15);
                        O4077903568229246.S(jArr15, jArrCopyOf2, jArr15);
                        O4077903568229246.R(jArr18, jArr14);
                        O4077903568229246.R(jArr17, jArr15);
                        O4077903568229246.J(jArr15, jArr17, jArrN);
                        O4077903568229246.N(jArr15);
                        O4077903568229246.M(jArr15);
                        System.arraycopy(jArr18, 0, jArr6, 0, 10);
                        System.arraycopy(jArr15, 0, jArr7, 0, 10);
                        O4077903568229246.R(jArr11, jArr4);
                        O4077903568229246.R(jArr12, jArr5);
                        O4077903568229246.J(jArr8, jArr11, jArr12);
                        O4077903568229246.N(jArr8);
                        O4077903568229246.M(jArr8);
                        O4077903568229246.S(jArr12, jArr11, jArr12);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        int i11 = 0;
                        for (int i12 = 10; i11 < i12; i12 = 10) {
                            jArr10[i11] = jArr12[i11] * 121665;
                            i11++;
                        }
                        O4077903568229246.M(jArr10);
                        O4077903568229246.T(jArr10, jArr10, jArr11);
                        O4077903568229246.J(jArr16, jArr12, jArr10);
                        O4077903568229246.N(jArr16);
                        O4077903568229246.M(jArr16);
                        M9216324016624295870.Y(jArr8, jArr6, i7);
                        M9216324016624295870.Y(jArr16, jArr7, i7);
                        i6 = i10 + 1;
                        long[] jArr20 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr20;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr5;
                        jArr5 = jArr16;
                        jArr9 = jArr22;
                        jArr2 = jArr6;
                        i5 = i8;
                        bArrCopyOf = bArr4;
                        i = i9;
                        jArr = jArr13;
                        jArr6 = jArr19;
                    }
                    i++;
                    i3 = 10;
                }
                int i13 = i3;
                long[] jArr23 = jArr;
                long[] jArr24 = new long[i13];
                O4077903568229246.w(jArr24, jArr5);
                O4077903568229246.E(jArr23, jArr4, jArr24);
                long[] jArr25 = new long[i13];
                long[] jArr26 = new long[i13];
                long[] jArr27 = new long[11];
                long[] jArr28 = new long[11];
                long[] jArr29 = new long[11];
                O4077903568229246.E(jArr25, jArrN, jArr23);
                O4077903568229246.T(jArr26, jArrN, jArr23);
                long[] jArr30 = new long[i13];
                jArr30[0] = 486662;
                O4077903568229246.T(jArr28, jArr26, jArr30);
                O4077903568229246.E(jArr28, jArr28, jArr3);
                O4077903568229246.T(jArr28, jArr28, jArr2);
                O4077903568229246.E(jArr28, jArr28, jArr25);
                O4077903568229246.E(jArr28, jArr28, jArr2);
                for (int i14 = 0; i14 < i13; i14++) {
                    jArr27[i14] = jArr28[i14] * 4;
                }
                O4077903568229246.M(jArr27);
                O4077903568229246.E(jArr28, jArr25, jArr3);
                O4077903568229246.S(jArr28, jArr28, jArr3);
                O4077903568229246.E(jArr29, jArr26, jArr2);
                O4077903568229246.T(jArr28, jArr28, jArr29);
                O4077903568229246.R(jArr28, jArr28);
                if (MessageDigest.isEqual(O4077903568229246.l(jArr27), O4077903568229246.l(jArr28))) {
                    return O4077903568229246.l(jArr23);
                }
                S10973172697741180971.m("Arithmetic error in curve multiplication with the public key: ".concat(B11964701839924937722.r(bArr2)));
                return null;
            }
            if (MessageDigest.isEqual(bArr3[i2], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(B11964701839924937722.r(bArr3[i2])));
            }
            i2++;
        }
    }

    public static final boolean k(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return S10823041268949770285.t(M8927913404651150384.D0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static final String m(Collection collection) {
        return !collection.isEmpty() ? G5759126466240281083.s(R9411874267597469228.J0(collection, ",\n", "\n", "\n", 0, null, 56)).concat("},") : " }";
    }

    public static final String n(Collection collection) {
        return G5759126466240281083.s(R9411874267597469228.J0(collection, ",", null, null, 0, null, 62)).concat(G5759126466240281083.s(" }"));
    }

    public static final String o(Collection collection) {
        return G5759126466240281083.s(R9411874267597469228.J0(collection, ",", null, null, 0, null, 62)).concat(G5759126466240281083.s("},"));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float p(dev.epro.r0.Y2066038017114788875 r6, boolean r7, dev.epro.r0.D9734197463427655843[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.a(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D6215562826263076784.p(dev.epro.r0.Y2066038017114788875, boolean, dev.epro.r0.D9734197463427655843[], float):float");
    }

    public static final native D17804905324242984786 q(String str);

    public static final native K7508260863238719352 r(String str, K7508260863238719352 k7508260863238719352);

    public static final native Object s(L12602321637077960189 l12602321637077960189, K14749510448791472029 k14749510448791472029);

    public static final native J10546292767352264156 t(Throwable th);
}
