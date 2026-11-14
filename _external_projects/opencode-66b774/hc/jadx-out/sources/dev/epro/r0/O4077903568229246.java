package dev.epro.r0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.zetetic.database.R;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O4077903568229246 {
    public static final Y4261039727803185691 a;
    public static final Y4261039727803185691 b;
    public static final Y4261039727803185691 c;
    public static final Y4261039727803185691 d;
    public static final Y4261039727803185691 e;
    public static final Y4261039727803185691 f;
    public static final D14731132657808549702 g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;
    public static final int[] k;
    public static final D14731132657808549702 l;
    public static final D14731132657808549702 m;
    public static final D14731132657808549702 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final D14731132657808549702 f409o;
    public static final D14731132657808549702 p;
    public static final S13297578932192364679 q;
    public static final S13297578932192364679 r;
    public static final StackTraceElement[] s;
    public static final V10933700885381486763 t;
    public static final float u;
    public static final float v;
    public static final Z14997871575210439922 w;
    public static Z7022156542152740569 x;

    public static final native List D(List list, ArrayList arrayList, Set set, int i2);

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        J(jArr4, jArr2, jArr3);
        L(jArr4, jArr);
    }

    public static final R15896830329318850690 G(R16749699847173633337 r16749699847173633337, int i2) {
        R15896830329318850690 r15896830329318850690 = ((R15896830329318850690) r16749699847173633337).a.f;
        if (r15896830329318850690 == null || (r15896830329318850690.d & i2) == 0) {
            return null;
        }
        while (r15896830329318850690 != null) {
            int i3 = r15896830329318850690.c;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return r15896830329318850690;
            }
            r15896830329318850690 = r15896830329318850690.f;
        }
        return null;
    }

    public static final I1722681268793429505 H(I1722681268793429505 i1722681268793429505, F4096073349764486348 f4096073349764486348) {
        return i1722681268793429505.Q0(new D5773346649611005745(f4096073349764486348));
    }

    public static U6155824110361579454 I(M3727281027331139839 m3727281027331139839) {
        m3727281027331139839.a0(2106932974);
        long jE = J5654975781851244064.e(Y582199805280922215.q, m3727281027331139839);
        m3727281027331139839.q(false);
        boolean zE = m3727281027331139839.e(jE);
        Object objM = m3727281027331139839.M();
        if (zE || objM == O9023047933786425027.a) {
            objM = M18113111391818111737.f(Y582199805280922215.r, jE);
            m3727281027331139839.k0(objM);
        }
        return (U6155824110361579454) objM;
    }

    public static void J(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j2 = jArr2[0];
        long j3 = jArr3[1] * j2;
        long j4 = jArr2[1];
        long j5 = jArr3[0];
        jArr[1] = (j4 * j5) + j3;
        long j6 = jArr2[1];
        long j7 = jArr3[1];
        jArr[2] = (jArr2[2] * j5) + (jArr3[2] * j2) + (j6 * 2 * j7);
        long j8 = jArr3[2];
        long j9 = jArr2[2];
        jArr[3] = (jArr2[3] * j5) + (jArr3[3] * j2) + (j9 * j7) + (j6 * j8);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        jArr[4] = (jArr2[4] * j5) + (jArr3[4] * j2) + (((j11 * j7) + (j6 * j10)) * 2) + (j9 * j8);
        long j12 = jArr3[4];
        long j13 = (j6 * j12) + (j11 * j8) + (j9 * j10);
        long j14 = jArr2[4];
        jArr[5] = (jArr2[5] * j5) + (jArr3[5] * j2) + (j14 * j7) + j13;
        long j15 = jArr3[5];
        long j16 = jArr2[5];
        jArr[6] = (jArr2[6] * j5) + (jArr3[6] * j2) + (j14 * j8) + (j9 * j12) + (((j16 * j7) + (j6 * j15) + (j11 * j10)) * 2);
        long j17 = (j16 * j8) + (j9 * j15) + (j14 * j10) + (j11 * j12);
        long j18 = jArr3[6];
        long j19 = (j6 * j18) + j17;
        long j20 = jArr2[6];
        jArr[7] = (jArr2[7] * j5) + (jArr3[7] * j2) + (j20 * j7) + j19;
        long j21 = jArr3[7];
        long j22 = (j6 * j21) + (j16 * j10) + (j11 * j15);
        long j23 = jArr2[7];
        long j24 = (((j23 * j7) + j22) * 2) + (j14 * j12);
        jArr[8] = (jArr2[8] * j5) + (jArr3[8] * j2) + (j20 * j8) + (j9 * j18) + j24;
        long j25 = (j23 * j8) + (j9 * j21) + (j20 * j10) + (j11 * j18) + (j16 * j12) + (j14 * j15);
        long j26 = jArr3[8];
        long j27 = (j6 * j26) + j25;
        long j28 = jArr2[8];
        jArr[9] = (jArr2[9] * j5) + (j2 * jArr3[9]) + (j28 * j7) + j27;
        long j29 = (j23 * j10) + (j11 * j21) + (j16 * j15);
        long j30 = jArr3[9];
        long j31 = jArr2[9];
        long j32 = j14 * j18;
        jArr[10] = (j28 * j8) + (j9 * j26) + (j20 * j12) + j32 + (((j7 * j31) + (j6 * j30) + j29) * 2);
        long j33 = j9 * j30;
        long j34 = j8 * j31;
        jArr[11] = j34 + j33 + (j28 * j10) + (j11 * j26) + (j23 * j12) + (j14 * j21) + (j20 * j15) + (j16 * j18);
        long j35 = j11 * j30;
        long j36 = j10 * j31;
        long j37 = j28 * j12;
        jArr[12] = j37 + (j14 * j26) + ((j36 + j35 + (j23 * j15) + (j16 * j21)) * 2) + (j20 * j18);
        long j38 = j14 * j30;
        long j39 = j12 * j31;
        jArr[13] = j39 + j38 + (j28 * j15) + (j16 * j26) + (j23 * j18) + (j20 * j21);
        long j40 = j15 * j31;
        long j41 = j28 * j18;
        jArr[14] = j41 + (j20 * j26) + ((j40 + (j16 * j30) + (j23 * j21)) * 2);
        long j42 = j20 * j30;
        long j43 = j18 * j31;
        jArr[15] = j43 + j42 + (j28 * j21) + (j23 * j26);
        jArr[16] = (((j21 * j31) + (j23 * j30)) * 2) + (j28 * j26);
        jArr[17] = (j26 * j31) + (j28 * j30);
        jArr[18] = j31 * 2 * j30;
    }

    public static final Object K(P3648740535677465818 p3648740535677465818, T5853297761459116769 t5853297761459116769) {
        t5853297761459116769.getClass();
        Object objB = p3648740535677465818.get(t5853297761459116769);
        if (objB == null) {
            objB = t5853297761459116769.b();
        }
        return ((R13778158386904154684) objB).a(p3648740535677465818);
    }

    public static void L(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        N(jArr);
        M(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void M(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j2 = jArr[i2];
            long j3 = j2 / 67108864;
            jArr[i2] = j2 - (j3 << 26);
            int i3 = i2 + 1;
            long j4 = jArr[i3] + j3;
            jArr[i3] = j4;
            long j5 = j4 / 33554432;
            jArr[i3] = j4 - (j5 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j5;
        }
        long j6 = jArr[0];
        long j7 = jArr[10];
        long j8 = j6 + (j7 << 4);
        jArr[0] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[0] = j9;
        long j10 = j9 + j7;
        jArr[0] = j10;
        jArr[10] = 0;
        long j11 = j10 / 67108864;
        jArr[0] = j10 - (j11 << 26);
        jArr[1] = jArr[1] + j11;
    }

    public static void N(long[] jArr) {
        long j2 = jArr[8];
        long j3 = jArr[18];
        long j4 = j2 + (j3 << 4);
        jArr[8] = j4;
        long j5 = j4 + (j3 << 1);
        jArr[8] = j5;
        jArr[8] = j5 + j3;
        long j6 = jArr[7];
        long j7 = jArr[17];
        long j8 = j6 + (j7 << 4);
        jArr[7] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[7] = j9;
        jArr[7] = j9 + j7;
        long j10 = jArr[6];
        long j11 = jArr[16];
        long j12 = j10 + (j11 << 4);
        jArr[6] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[6] = j13;
        jArr[6] = j13 + j11;
        long j14 = jArr[5];
        long j15 = jArr[15];
        long j16 = j14 + (j15 << 4);
        jArr[5] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[5] = j17;
        jArr[5] = j17 + j15;
        long j18 = jArr[4];
        long j19 = jArr[14];
        long j20 = j18 + (j19 << 4);
        jArr[4] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[4] = j21;
        jArr[4] = j21 + j19;
        long j22 = jArr[3];
        long j23 = jArr[13];
        long j24 = j22 + (j23 << 4);
        jArr[3] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[3] = j25;
        jArr[3] = j25 + j23;
        long j26 = jArr[2];
        long j27 = jArr[12];
        long j28 = j26 + (j27 << 4);
        jArr[2] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[2] = j29;
        jArr[2] = j29 + j27;
        long j30 = jArr[1];
        long j31 = jArr[11];
        long j32 = j30 + (j31 << 4);
        jArr[1] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[1] = j33;
        jArr[1] = j33 + j31;
        long j34 = jArr[0];
        long j35 = jArr[10];
        long j36 = j34 + (j35 << 4);
        jArr[0] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[0] = j37;
        jArr[0] = j37 + j35;
    }

    public static final native I2786896214680236851 O(Object obj, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static B10503278808216759809 P() {
        return new B10503278808216759809(0);
    }

    public static M7102034154292440921 Q(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new M7102034154292440921(f2, f3, obj);
    }

    public static void R(long[] jArr, long[] jArr2) {
        long j2 = jArr2[0];
        long j3 = j2 * 2;
        long j4 = jArr2[1];
        long j5 = jArr2[2];
        long j6 = jArr2[3];
        long j7 = jArr2[4];
        long j8 = jArr2[5];
        long j9 = jArr2[6];
        long j10 = jArr2[7];
        long j11 = jArr2[8];
        long j12 = jArr2[9];
        L(new long[]{j2 * j2, j3 * j4, ((j2 * j5) + (j4 * j4)) * 2, ((j2 * j6) + (j4 * j5)) * 2, (j3 * j7) + (j4 * 4 * j6) + (j5 * j5), ((j2 * j8) + (j4 * j7) + (j5 * j6)) * 2, ((j4 * 2 * j8) + (j2 * j9) + (j5 * j7) + (j6 * j6)) * 2, ((j2 * j10) + (j4 * j9) + (j5 * j8) + (j6 * j7)) * 2, (((((j6 * j8) + (j4 * j10)) * 2) + (j2 * j11) + (j5 * j9)) * 2) + (j7 * j7), ((j2 * j12) + (j4 * j11) + (j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, ((((j4 * j12) + (j6 * j10)) * 2) + (j5 * j11) + (j7 * j9) + (j8 * j8)) * 2, ((j5 * j12) + (j6 * j11) + (j7 * j10) + (j8 * j9)) * 2, (((((j6 * j12) + (j8 * j10)) * 2) + (j7 * j11)) * 2) + (j9 * j9), ((j7 * j12) + (j8 * j11) + (j9 * j10)) * 2, ((j8 * 2 * j12) + (j9 * j11) + (j10 * j10)) * 2, ((j9 * j12) + (j10 * j11)) * 2, (j10 * 4 * j12) + (j11 * j11), j11 * 2 * j12, 2 * j12 * j12}, jArr);
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static void T(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static final native LinkedHashMap U(JSONObject jSONObject);

    public static final native Object V(Object obj);

    public static J15264501749816156841 W(int i2, int i3, J6301524036964264730 j6301524036964264730) {
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            j6301524036964264730 = W10816543021280842737.a;
        }
        return new J15264501749816156841(i2, i4, j6301524036964264730);
    }

    public static final Object X(Object obj) {
        Q14579408259617852085 q14579408259617852085 = obj instanceof Q14579408259617852085 ? (Q14579408259617852085) obj : null;
        return q14579408259617852085 != null ? q14579408259617852085.a : obj;
    }

    public static final P3648740535677465818 Y(P11507981277033739248[] p11507981277033739248Arr, P3648740535677465818 p3648740535677465818, P3648740535677465818 p36487405356774658182) {
        D13190160240050003111 d13190160240050003111 = new D13190160240050003111(P3648740535677465818.d);
        for (P11507981277033739248 p11507981277033739248 : p11507981277033739248Arr) {
            T5853297761459116769 t5853297761459116769 = p11507981277033739248.a;
            if (p11507981277033739248.g || !p3648740535677465818.containsKey(t5853297761459116769)) {
                d13190160240050003111.put(t5853297761459116769, t5853297761459116769.d(p11507981277033739248, (R13778158386904154684) p36487405356774658182.get(t5853297761459116769)));
            }
        }
        return d13190160240050003111.e();
    }

    public static final native Object Z(boolean z, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, K14749510448791472029 k14749510448791472029);

    public static final long a(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32);
    }

    public static final native void b(Z12230432157744414222 z12230432157744414222, Y15427935686644244568 y15427935686644244568, N1174624271152536908 n1174624271152536908, X11638668447546090163 x11638668447546090163, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, float f2, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void c(Z12230432157744414222 z12230432157744414222, Y15427935686644244568 y15427935686644244568, N1174624271152536908 n1174624271152536908, X11638668447546090163 x11638668447546090163, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, float f2, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final void d(I1722681268793429505 i1722681268793429505, T5853297761459116769 t5853297761459116769, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        T15443218846549482730 t154432188465494827302 = O8620973563946607355.a;
        m3727281027331139839.b0(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(t5853297761459116769) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(t154432188465494827302) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 2048 : 1024;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM = m3727281027331139839.M();
            if (objM == O9023047933786425027.a) {
                Object v697849047308847220 = new V697849047308847220(null, B14824868959299866349.k);
                m3727281027331139839.k0(v697849047308847220);
                objM = v697849047308847220;
            }
            Q3290033537611024070 q3290033537611024070H = h(t154432188465494827302, m3727281027331139839, (i3 >> 6) & 14);
            D1286559660607336098.a(t5853297761459116769.a(q3290033537611024070H), S10823041268949770285.T(274270255, new I15182068337753965030((Object) i1722681268793429505, objM, (Object) t15443218846549482730, (Object) q3290033537611024070H, (byte) 2), m3727281027331139839), m3727281027331139839, 56);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new N18429394832860979851((Object) i1722681268793429505, (Object) t5853297761459116769, (Object) t15443218846549482730, i2, (byte) 2);
        }
    }

    public static final native void e(boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void f(R6894569913291645384 r6894569913291645384, boolean z, boolean z2, List list, List list2, H10681976249452161517 h10681976249452161517, I1722681268793429505 i1722681268793429505, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(int i2, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, String str);

    public static final Q3290033537611024070 h(T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i2) {
        boolean z = (((i2 & 14) ^ 6) > 4 && m3727281027331139839.f(t15443218846549482730)) || (i2 & 6) == 4;
        Object objM = m3727281027331139839.M();
        Object obj = O9023047933786425027.a;
        if (z || objM == obj) {
            objM = new Q3290033537611024070(t15443218846549482730);
            m3727281027331139839.k0(objM);
        }
        Q3290033537611024070 q3290033537611024070 = (Q3290033537611024070) objM;
        boolean zF = m3727281027331139839.f(q3290033537611024070);
        Object objM2 = m3727281027331139839.M();
        if (zF || objM2 == obj) {
            objM2 = new A6662317080022852970((Object) q3290033537611024070, (byte) 13);
            m3727281027331139839.k0(objM2);
        }
        Q13169198992966610970.c(q3290033537611024070, (F4096073349764486348) objM2, m3727281027331139839);
        return q3290033537611024070;
    }

    public static V13882211622155904359 i(long j2, M3727281027331139839 m3727281027331139839, int i2) {
        long jB = J5654975781851244064.b(j2, m3727281027331139839);
        long j3 = U10174709222559481877.h;
        long jB2 = U10174709222559481877.b(0.38f, jB);
        V13882211622155904359 v13882211622155904359S = s((J3745674191043464657) m3727281027331139839.j(J5654975781851244064.a));
        long j4 = j2 != 16 ? j2 : v13882211622155904359S.a;
        if (jB == 16) {
            jB = v13882211622155904359S.b;
        }
        long j5 = jB;
        if (j3 == 16) {
            j3 = v13882211622155904359S.c;
        }
        long j6 = j3;
        if (jB2 == 16) {
            jB2 = v13882211622155904359S.d;
        }
        return new V13882211622155904359(j4, j5, j6, jB2);
    }

    public static A4677720871826919358 j(int i2) {
        return new A4677720871826919358((i2 & 1) != 0 ? 0.0f : 3.0f, E3422549137300678133.h, E3422549137300678133.g);
    }

    public static final boolean k(X1076061028887460523 x1076061028887460523, long j2) {
        if (!x1076061028887460523.a.n) {
            return false;
        }
        I16141028645763443416 i16141028645763443416 = (I16141028645763443416) R7033599853981556291.R(x1076061028887460523).F.d;
        if (!i16141028645763443416.c0.n) {
            return false;
        }
        long jO = i16141028645763443416.O(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO & 4294967295L));
        long j3 = x1076061028887460523.r;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static byte[] l(long[] jArr) {
        long j2;
        int[] iArr;
        int i2;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j2 = 19;
            iArr = k;
            if (i4 >= 2) {
                break;
            }
            int i5 = 0;
            while (i5 < 9) {
                long j3 = jArrCopyOf[i5];
                int i6 = iArr[i5 & 1];
                int i7 = -((int) (((j3 >> 31) & j3) >> i6));
                jArrCopyOf[i5] = j3 + ((long) (i7 << i6));
                i5++;
                jArrCopyOf[i5] = jArrCopyOf[i5] - ((long) i7);
            }
            long j4 = jArrCopyOf[9];
            int i8 = -((int) (((j4 >> 31) & j4) >> 25));
            jArrCopyOf[9] = j4 + ((long) (i8 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i8) * 19);
            i4++;
        }
        long j5 = jArrCopyOf[0];
        int i9 = -((int) (((j5 >> 31) & j5) >> 26));
        jArrCopyOf[0] = j5 + ((long) (i9 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i9);
        int i10 = 0;
        while (true) {
            iArr2 = j;
            if (i10 >= 2) {
                break;
            }
            int i11 = i3;
            while (i11 < 9) {
                long j6 = jArrCopyOf[i11];
                int i12 = i11 & 1;
                int i13 = i3;
                int i14 = i10;
                int i15 = (int) (j6 >> iArr[i12]);
                jArrCopyOf[i11] = j6 & ((long) iArr2[i12]);
                i11++;
                jArrCopyOf[i11] = jArrCopyOf[i11] + ((long) i15);
                i3 = i13;
                j2 = j2;
                i10 = i14;
            }
            i10++;
        }
        int i16 = i3;
        long j7 = jArrCopyOf[9];
        jArrCopyOf[9] = j7 & 33554431;
        long j8 = (((long) ((int) (j7 >> 25))) * j2) + jArrCopyOf[i16];
        jArrCopyOf[i16] = j8;
        int i17 = ~((((int) j8) - 67108845) >> 31);
        for (int i18 = 1; i18 < 10; i18++) {
            int i19 = ~(((int) jArrCopyOf[i18]) ^ iArr2[i18 & 1]);
            int i20 = i19 & (i19 << 16);
            int i21 = i20 & (i20 << 8);
            int i22 = i21 & (i21 << 4);
            int i23 = i22 & (i22 << 2);
            i17 &= (i23 & (i23 << 1)) >> 31;
        }
        jArrCopyOf[i16] = jArrCopyOf[i16] - ((long) (67108845 & i17));
        long j9 = 33554431 & i17;
        jArrCopyOf[1] = jArrCopyOf[1] - j9;
        for (i2 = 2; i2 < 10; i2 += 2) {
            jArrCopyOf[i2] = jArrCopyOf[i2] - ((long) (67108863 & i17));
            int i24 = i2 + 1;
            jArrCopyOf[i24] = jArrCopyOf[i24] - j9;
        }
        for (int i25 = i16; i25 < 10; i25++) {
            jArrCopyOf[i25] = jArrCopyOf[i25] << i[i25];
        }
        byte[] bArr = new byte[32];
        for (int i26 = i16; i26 < 10; i26++) {
            int i27 = h[i26];
            long j10 = bArr[i27];
            long j11 = jArrCopyOf[i26];
            bArr[i27] = (byte) (j10 | (j11 & 255));
            bArr[i27 + 1] = (byte) (((long) bArr[r5]) | ((j11 >> 8) & 255));
            bArr[i27 + 2] = (byte) (((long) bArr[r5]) | ((j11 >> 16) & 255));
            bArr[i27 + 3] = (byte) (((long) bArr[r4]) | ((j11 >> 24) & 255));
        }
        return bArr;
    }

    public static final W13734796219485846113 m(Context context, W1977247516027959386 w1977247516027959386) {
        G5774777475416047446 g5774777475416047446H;
        context.getClass();
        w1977247516027959386.getClass();
        Q13914734507241918864 q13914734507241918864 = new Q13914734507241918864(w1977247516027959386.c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        V15499216873564893116 v15499216873564893116 = q13914734507241918864.a;
        v15499216873564893116.getClass();
        O12545633033254628644 o12545633033254628644 = w1977247516027959386.d;
        byte b2 = 11;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            g5774777475416047446H = new G5774777475416047446(applicationContext, WorkDatabase.class, null);
            g5774777475416047446H.i = true;
        } else {
            g5774777475416047446H = E7125458317232359087.h(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            g5774777475416047446H.h = new L4980660535418402690(applicationContext, b2);
        }
        g5774777475416047446H.f = v15499216873564893116;
        g5774777475416047446H.d.add(new H7275374765289012126());
        g5774777475416047446H.a(Y11786291788827544965.h);
        g5774777475416047446H.a(new R11897616633974001968(applicationContext, 2, 3));
        g5774777475416047446H.a(Y11786291788827544965.i);
        g5774777475416047446H.a(Y11786291788827544965.j);
        g5774777475416047446H.a(new R11897616633974001968(applicationContext, 5, 6));
        g5774777475416047446H.a(Y11786291788827544965.k);
        g5774777475416047446H.a(Y11786291788827544965.l);
        g5774777475416047446H.a(Y11786291788827544965.m);
        g5774777475416047446H.a(new R11897616633974001968(applicationContext));
        g5774777475416047446H.a(new R11897616633974001968(applicationContext, 10, 11));
        g5774777475416047446H.a(Y11786291788827544965.d);
        g5774777475416047446H.a(Y11786291788827544965.e);
        g5774777475416047446H.a(Y11786291788827544965.f);
        g5774777475416047446H.a(Y11786291788827544965.g);
        g5774777475416047446H.a(new R11897616633974001968(applicationContext, 21, 22));
        g5774777475416047446H.n = false;
        g5774777475416047446H.f255o = true;
        g5774777475416047446H.p = true;
        WorkDatabase workDatabase = (WorkDatabase) g5774777475416047446H.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        I6674524549538428163 i6674524549538428163 = new I6674524549538428163(applicationContext2, q13914734507241918864);
        N12253737202470468561 n12253737202470468561 = new N12253737202470468561(context.getApplicationContext(), w1977247516027959386, q13914734507241918864, workDatabase);
        return new W13734796219485846113(context.getApplicationContext(), w1977247516027959386, q13914734507241918864, workDatabase, (List) V10156126906264989283.h.a(context, w1977247516027959386, q13914734507241918864, workDatabase, i6674524549538428163, n12253737202470468561), n12253737202470468561, i6674524549538428163);
    }

    public static long[] n(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = h[i2];
            jArr[i2] = ((((((long) (bArr[i3] & 255)) | (((long) (bArr[i3 + 1] & 255)) << 8)) | (((long) (bArr[i3 + 2] & 255)) << 16)) | (((long) (bArr[i3 + 3] & 255)) << 24)) >> i[i2]) & ((long) j[i2 & 1]);
        }
        return jArr;
    }

    public static final Object o(X17453750288186724334 x17453750288186724334, long j2, L12639328004344855510 l12639328004344855510) {
        while (true) {
            X17453750288186724334 x174537502881867243342 = x17453750288186724334;
            while (true) {
                if (x174537502881867243342.d >= j2 && !x174537502881867243342.d()) {
                    return x174537502881867243342;
                }
                Object objectVolatile = T5284056093300834442.a.getObjectVolatile(x174537502881867243342, M2655555874565458115.a);
                D14731132657808549702 d14731132657808549702 = g;
                if (objectVolatile == d14731132657808549702) {
                    return d14731132657808549702;
                }
                x17453750288186724334 = (X17453750288186724334) ((M2655555874565458115) objectVolatile);
                if (x17453750288186724334 != null) {
                    break;
                }
                X17453750288186724334 x174537502881867243343 = (X17453750288186724334) l12639328004344855510.invoke(Long.valueOf(x174537502881867243342.d + 1), x174537502881867243342);
                while (true) {
                    Unsafe unsafe = T5284056093300834442.a;
                    long j3 = M2655555874565458115.a;
                    if (unsafe.compareAndSwapObject(x174537502881867243342, j3, (Object) null, x174537502881867243343)) {
                        if (x174537502881867243342.d()) {
                            x174537502881867243342.e();
                        }
                        x174537502881867243342 = x174537502881867243343;
                    } else if (unsafe.getObjectVolatile(x174537502881867243342, j3) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final native Object p(Object obj);

    public static final ArrayList r(J4720286603213127984 j4720286603213127984) {
        j4720286603213127984.getClass();
        H11725168162114556860 h11725168162114556860G0 = ((I11965759855724288421) j4720286603213127984).G0();
        boolean zX = x(h11725168162114556860G0);
        K7217096618580727896 k7217096618580727896 = (K7217096618580727896) h11725168162114556860G0.o();
        D389890677992184566 d389890677992184566 = (D389890677992184566) k7217096618580727896.b;
        ArrayList arrayList = new ArrayList(d389890677992184566.c);
        int i2 = d389890677992184566.c;
        for (int i3 = 0; i3 < i2; i3++) {
            H11725168162114556860 h11725168162114556860 = (H11725168162114556860) k7217096618580727896.get(i3);
            arrayList.add(zX ? h11725168162114556860.l() : h11725168162114556860.m());
        }
        return arrayList;
    }

    public static V13882211622155904359 s(J3745674191043464657 j3745674191043464657) {
        V13882211622155904359 v13882211622155904359 = j3745674191043464657.a0;
        if (v13882211622155904359 != null) {
            return v13882211622155904359;
        }
        Y4261039727803185691 y4261039727803185691 = E3422549137300678133.c;
        V13882211622155904359 v138822116221559043592 = new V13882211622155904359(J5654975781851244064.d(j3745674191043464657, y4261039727803185691), J5654975781851244064.a(j3745674191043464657, J5654975781851244064.d(j3745674191043464657, y4261039727803185691)), J8045362843799184672.x(U10174709222559481877.b(E3422549137300678133.f, J5654975781851244064.d(j3745674191043464657, E3422549137300678133.e)), J5654975781851244064.d(j3745674191043464657, y4261039727803185691)), U10174709222559481877.b(0.38f, J5654975781851244064.a(j3745674191043464657, J5654975781851244064.d(j3745674191043464657, y4261039727803185691))));
        j3745674191043464657.a0 = v138822116221559043592;
        return v138822116221559043592;
    }

    public static final Z7022156542152740569 t() {
        Z7022156542152740569 z7022156542152740569 = x;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.FolderOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(20.0f, 6.0f);
        v14323974914327418545.g(-8.0f);
        v14323974914327418545.i(-2.0f, -2.0f);
        v14323974914327418545.h(4.0f, 4.0f);
        v14323974914327418545.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        v14323974914327418545.h(2.0f, 18.0f);
        v14323974914327418545.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v14323974914327418545.g(16.0f);
        v14323974914327418545.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545.h(22.0f, 8.0f);
        v14323974914327418545.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        G11450220448113054352.w(v14323974914327418545, 20.0f, 18.0f, 4.0f, 18.0f);
        v14323974914327418545.h(4.0f, 8.0f);
        v14323974914327418545.g(16.0f);
        v14323974914327418545.s(10.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        x = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static S14520841167617591865 u(N12402914283838705413 n12402914283838705413, int i2) {
        return new S14520841167617591865(n12402914283838705413, T14358595426441148744.a);
    }

    public static final native Integer v(Map map, String str);

    public static void w(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        R(jArr3, jArr2);
        R(jArr12, jArr3);
        R(jArr11, jArr12);
        E(jArr4, jArr11, jArr2);
        E(jArr5, jArr4, jArr3);
        R(jArr11, jArr5);
        E(jArr6, jArr11, jArr4);
        R(jArr11, jArr6);
        R(jArr12, jArr11);
        R(jArr11, jArr12);
        R(jArr12, jArr11);
        R(jArr11, jArr12);
        E(jArr7, jArr11, jArr6);
        R(jArr11, jArr7);
        R(jArr12, jArr11);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            R(jArr11, jArr12);
            R(jArr12, jArr11);
        }
        E(jArr8, jArr12, jArr7);
        R(jArr11, jArr8);
        R(jArr12, jArr11);
        for (int i3 = 2; i3 < 20; i3 += 2) {
            R(jArr11, jArr12);
            R(jArr12, jArr11);
        }
        E(jArr11, jArr12, jArr8);
        R(jArr12, jArr11);
        R(jArr11, jArr12);
        for (int i4 = 2; i4 < 10; i4 += 2) {
            R(jArr12, jArr11);
            R(jArr11, jArr12);
        }
        E(jArr9, jArr11, jArr7);
        R(jArr11, jArr9);
        R(jArr12, jArr11);
        for (int i5 = 2; i5 < 50; i5 += 2) {
            R(jArr11, jArr12);
            R(jArr12, jArr11);
        }
        E(jArr10, jArr12, jArr9);
        R(jArr12, jArr10);
        R(jArr11, jArr12);
        for (int i6 = 2; i6 < 100; i6 += 2) {
            R(jArr12, jArr11);
            R(jArr11, jArr12);
        }
        E(jArr12, jArr11, jArr10);
        R(jArr11, jArr12);
        R(jArr12, jArr11);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            R(jArr11, jArr12);
            R(jArr12, jArr11);
        }
        E(jArr11, jArr12, jArr9);
        R(jArr12, jArr11);
        R(jArr11, jArr12);
        R(jArr12, jArr11);
        R(jArr11, jArr12);
        R(jArr12, jArr11);
        E(jArr, jArr12, jArr5);
    }

    public static final boolean x(H11725168162114556860 h11725168162114556860) {
        int iOrdinal = h11725168162114556860.G.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            Z3383101362411723454.g();
                            return false;
                        }
                        H11725168162114556860 h11725168162114556860U = h11725168162114556860.u();
                        if (h11725168162114556860U != null) {
                            return x(h11725168162114556860U);
                        }
                        S10973172697741180971.j("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean y(H11725168162114556860 h11725168162114556860) {
        if (h11725168162114556860.h == null) {
            return false;
        }
        H11725168162114556860 h11725168162114556860U = h11725168162114556860.u();
        return (h11725168162114556860U != null ? h11725168162114556860U.h : null) == null || h11725168162114556860.G.b;
    }

    public static final V10300877997588547986 z(L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348) {
        M17674070986420828893 m17674070986420828893 = new M17674070986420828893(l12639328004344855510, (byte) 0);
        f4096073349764486348.getClass();
        V12319504402545346730.s(1, f4096073349764486348);
        return new V10300877997588547986((Object) m17674070986420828893, (Object) f4096073349764486348, (byte) 20);
    }

    public abstract D1286559660607336098 F(int i2, byte[] bArr);

    public long q() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    static {
        izmyclvb.dpqpjfpoanwt1(652);
        a = Y4261039727803185691.r;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.h;
        b = y4261039727803185691;
        c = Y4261039727803185691.s;
        Y4261039727803185691 y42610397278031856912 = Y4261039727803185691.i;
        d = y42610397278031856912;
        e = y4261039727803185691;
        f = y42610397278031856912;
        byte b2 = 25;
        g = new D14731132657808549702("CLOSED", b2);
        h = new int[]{0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
        i = new int[]{0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
        j = new int[]{67108863, 33554431};
        k = new int[]{26, 25};
        l = new D14731132657808549702("COMPLETING_ALREADY", b2);
        m = new D14731132657808549702("COMPLETING_WAITING_CHILDREN", b2);
        n = new D14731132657808549702("COMPLETING_RETRY", b2);
        f409o = new D14731132657808549702("TOO_LATE_TO_CANCEL", b2);
        p = new D14731132657808549702("SEALED", b2);
        q = new S13297578932192364679(false);
        r = new S13297578932192364679(true);
        s = new StackTraceElement[0];
        t = V10933700885381486763.e;
        u = 8.0f;
        v = 24.0f;
        w = new Z14997871575210439922((byte) 20);
    }

    public void A(U10534498473358193554 u10534498473358193554) {
    }

    public void C(long j2, L3824616114245370575 l3824616114245370575) {
    }

    public void B(long j2, D11398891543882352014 d11398891543882352014, K17906237317018138803 k17906237317018138803) {
    }
}
