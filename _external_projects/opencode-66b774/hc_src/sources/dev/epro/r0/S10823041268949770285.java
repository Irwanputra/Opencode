package dev.epro.r0;

import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.util.TypedValue;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.CursorWindow;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class S10823041268949770285 {
    public static final M14716691558468128220 a;
    public static final T15443218846549482730 b;
    public static final Y10675828910133495542 c;
    public static final D14731132657808549702 d;
    public static final D14731132657808549702 e;
    public static final R15397193384711361242 f;
    public static final R15397193384711361242 g;
    public static final R15397193384711361242 h;
    public static final Z14997871575210439922 i;
    public static final float j = 32.0f;
    public static Z7022156542152740569 k;

    public static int A(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static final native void B(String str, LinkedHashMap linkedHashMap, JSONObject jSONObject);

    public static final native void C(String str, LinkedHashMap linkedHashMap, JSONObject jSONObject);

    public static final native void D(String str, LinkedHashMap linkedHashMap, JSONObject jSONObject);

    public static final native void E(String str, LinkedHashMap linkedHashMap, JSONObject jSONObject);

    public static final void F(V11538895333762958192 v11538895333762958192, V1715405128288489768 v1715405128288489768, D14208870094104617988 d14208870094104617988, float f2, H7281108764511748709 h7281108764511748709, W7621125212597703960 w7621125212597703960, Q15653065705375360223 q15653065705375360223) {
        ArrayList arrayList = v11538895333762958192.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Z2489793023059154243 z2489793023059154243 = (Z2489793023059154243) arrayList.get(i2);
            z2489793023059154243.a.f(v1715405128288489768, d14208870094104617988, f2, h7281108764511748709, w7621125212597703960, q15653065705375360223);
            v1715405128288489768.i(0.0f, z2489793023059154243.a.f);
        }
    }

    public static W10545060672287394780 G(W10545060672287394780 w10545060672287394780) {
        return (((((double) Math.round(w10545060672287394780.a)) > 90.0d ? 1 : (((double) Math.round(w10545060672287394780.a)) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(w10545060672287394780.a)) > 111.0d ? 1 : (((double) Math.round(w10545060672287394780.a)) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(w10545060672287394780.b)) > 16.0d ? 1 : (((double) Math.round(w10545060672287394780.b)) == 16.0d ? 0 : -1)) > 0) && (((double) Math.round(w10545060672287394780.c)) < 65.0d)) ? W10545060672287394780.a(w10545060672287394780.a, w10545060672287394780.b, 70.0d) : w10545060672287394780;
    }

    public static final String H(long j2, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j2));
    }

    public static H7323971265464188398 I(H7323971265464188398 h7323971265464188398, R12081023847482212386 r12081023847482212386) {
        r12081023847482212386.getClass();
        if (t(h7323971265464188398.getKey(), r12081023847482212386)) {
            return h7323971265464188398;
        }
        return null;
    }

    public static Object J(Object obj, Class cls) {
        if (obj instanceof S10427662877350613711) {
            return cls.cast(obj);
        }
        if (obj instanceof A18195026813295081326) {
            return J(((A18195026813295081326) obj).d(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + S10427662877350613711.class + " or " + A18195026813295081326.class);
    }

    public static final boolean K(S16571168858015125610 s16571168858015125610) {
        M3397403720270972864 m3397403720270972864;
        G15798799497496144130 g15798799497496144130 = s16571168858015125610.c;
        K971002982358050436 k971002982358050436 = (g15798799497496144130 == null || (m3397403720270972864 = g15798799497496144130.b) == null) ? null : new K971002982358050436(m3397403720270972864.b);
        boolean z = false;
        if (k971002982358050436 != null && k971002982358050436.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final Z7022156542152740569 L() {
        Z7022156542152740569 z7022156542152740569 = k;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("AutoMirrored.Outlined.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(19.0f, 19.0f);
        v14323974914327418545.f(5.0f);
        v14323974914327418545.r(5.0f);
        v14323974914327418545.g(7.0f);
        v14323974914327418545.r(3.0f);
        v14323974914327418545.f(5.0f);
        v14323974914327418545.e(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        v14323974914327418545.s(14.0f);
        v14323974914327418545.e(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        v14323974914327418545.g(14.0f);
        v14323974914327418545.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545.s(-7.0f);
        v14323974914327418545.g(-2.0f);
        v14323974914327418545.s(7.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(14.0f, 3.0f);
        v14323974914327418545.s(2.0f);
        v14323974914327418545.g(3.59f);
        v14323974914327418545.i(-9.83f, 9.83f);
        v14323974914327418545.i(1.41f, 1.41f);
        v14323974914327418545.h(19.0f, 6.41f);
        v14323974914327418545.r(10.0f);
        v14323974914327418545.g(2.0f);
        v14323974914327418545.r(3.0f);
        v14323974914327418545.g(-7.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        k = b2;
        return b2;
    }

    public static G8001132634698687269 M(H7323971265464188398 h7323971265464188398, R12081023847482212386 r12081023847482212386) {
        r12081023847482212386.getClass();
        return t(h7323971265464188398.getKey(), r12081023847482212386) ? I3826119971291161142.a : h7323971265464188398;
    }

    public static I1722681268793429505 N(I1722681268793429505 i1722681268793429505, L1256556220631237103 l1256556220631237103, G15527156457921655762 g15527156457921655762, C1267176524613794288 c1267176524613794288, float f2, R3103059035698929241 r3103059035698929241, int i2) {
        if ((i2 & 4) != 0) {
            g15527156457921655762 = T13350664027331345869.f;
        }
        G15527156457921655762 g155271564579216557622 = g15527156457921655762;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return i1722681268793429505.Q0(new H2623464436645747492(l1256556220631237103, g155271564579216557622, c1267176524613794288, f2, r3103059035698929241));
    }

    public static G8001132634698687269 O(H7323971265464188398 h7323971265464188398, G8001132634698687269 g8001132634698687269) {
        g8001132634698687269.getClass();
        return g8001132634698687269 == I3826119971291161142.a ? h7323971265464188398 : (G8001132634698687269) g8001132634698687269.fold(new X4712621039624176170((byte) 24), h7323971265464188398);
    }

    public static final long P(V12527742189361867087 v12527742189361867087, R7000310675073492254 r7000310675073492254, L11375348705951955702 l11375348705951955702, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        long j3 = v12527742189361867087.g;
        if (r7000310675073492254 != null) {
            int i2 = l11375348705951955702.a;
            if (i2 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            } else if (i2 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
            }
            if (r7000310675073492254 == R7000310675073492254.b) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j2 = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j2 = floatToRawIntBits3 << 32;
            }
            j3 = j2 | (floatToRawIntBits & 4294967295L);
        }
        long e2 = L2216691091636065972.e(Q(v12527742189361867087, r7000310675073492254, l11375348705951955702), j3);
        if (z || !v12527742189361867087.i) {
            return e2;
        }
        return 0L;
    }

    public static final long Q(V12527742189361867087 v12527742189361867087, R7000310675073492254 r7000310675073492254, L11375348705951955702 l11375348705951955702) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j2;
        if (r7000310675073492254 == null) {
            return v12527742189361867087.c;
        }
        int i2 = l11375348705951955702.a;
        if (i2 == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (v12527742189361867087.c >> 32));
        } else {
            if (i2 != 2) {
                return v12527742189361867087.c;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (v12527742189361867087.c & 4294967295L));
        }
        if (r7000310675073492254 == R7000310675073492254.b) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j2 = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j2 = floatToRawIntBits3 << 32;
        }
        return j2 | (4294967295L & floatToRawIntBits);
    }

    public static final native ArrayList R(ArrayList arrayList);

    public static final native String S(InputStream inputStream, X879555298858532581 x879555298858532581);

    public static final T15443218846549482730 T(int i2, S8977162183056139880 s8977162183056139880, M3727281027331139839 m3727281027331139839) {
        Object M = m3727281027331139839.M();
        if (M == O9023047933786425027.a) {
            M = new T15443218846549482730(i2, true, s8977162183056139880);
            m3727281027331139839.k0(M);
        }
        T15443218846549482730 t15443218846549482730 = (T15443218846549482730) M;
        if (!t(t15443218846549482730.c, s8977162183056139880)) {
            boolean z = t15443218846549482730.c == null;
            t15443218846549482730.c = s8977162183056139880;
            if (!z && t15443218846549482730.b) {
                V4878375136513573151 v4878375136513573151 = t15443218846549482730.d;
                if (v4878375136513573151 != null) {
                    V8232844453216786975 v8232844453216786975 = v4878375136513573151.a;
                    if (v8232844453216786975 != null) {
                        v8232844453216786975.e(v4878375136513573151, null);
                    }
                    t15443218846549482730.d = null;
                }
                ArrayList arrayList = t15443218846549482730.e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        V4878375136513573151 v48783751365135731512 = (V4878375136513573151) arrayList.get(i3);
                        V8232844453216786975 v82328444532167869752 = v48783751365135731512.a;
                        if (v82328444532167869752 != null) {
                            v82328444532167869752.e(v48783751365135731512, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return t15443218846549482730;
    }

    public static final E3889562084885881810 U(H11725168162114556860 h11725168162114556860) {
        E3889562084885881810 e3889562084885881810 = h11725168162114556860.f262o;
        if (e3889562084885881810 != null) {
            return e3889562084885881810;
        }
        throw L11610354117192841236.j("Required value was null.");
    }

    public static TypedValue V(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean W(Resources.Theme theme, int i2, boolean z) {
        TypedValue V = V(theme, i2);
        return (V == null || V.type != 18) ? z : V.data != 0;
    }

    public static final void X(G8001132634698687269 g8001132634698687269, Object obj) {
        if (obj == e) {
            return;
        }
        if (!(obj instanceof E13225724216532610954)) {
            Object fold = g8001132634698687269.fold(g, null);
            fold.getClass();
            ((G17379711782311227394) fold).restoreThreadContext(g8001132634698687269, obj);
            return;
        }
        E13225724216532610954 e13225724216532610954 = (E13225724216532610954) obj;
        G17379711782311227394[] g17379711782311227394Arr = e13225724216532610954.c;
        int length = g17379711782311227394Arr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            G17379711782311227394 g17379711782311227394 = g17379711782311227394Arr[length];
            g17379711782311227394.getClass();
            g17379711782311227394.restoreThreadContext(g8001132634698687269, e13225724216532610954.b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    public static void Y(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static final int Z(F5390871378632077601 f5390871378632077601, int i2) {
        int i3;
        int[] iArr = f5390871378632077601.f;
        int i4 = i2 + 1;
        int length = f5390871378632077601.e.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= length) {
                i3 = (i5 + length) >>> 1;
                int i6 = iArr[i3];
                if (i6 >= i4) {
                    if (i6 <= i4) {
                        break;
                    }
                    length = i3 - 1;
                } else {
                    i5 = i3 + 1;
                }
            } else {
                i3 = (-i5) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(dev.epro.r0.F4096073349764486348 r21, dev.epro.r0.I1722681268793429505 r22, dev.epro.r0.F4096073349764486348 r23, dev.epro.r0.F4096073349764486348 r24, dev.epro.r0.M3727281027331139839 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S10823041268949770285.a(dev.epro.r0.F4096073349764486348, dev.epro.r0.I1722681268793429505, dev.epro.r0.F4096073349764486348, dev.epro.r0.F4096073349764486348, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final Object a0(G8001132634698687269 g8001132634698687269) {
        Object fold = g8001132634698687269.fold(f, 0);
        fold.getClass();
        return fold;
    }

    public static final void b(F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-1783766393);
        int i3 = (m3727281027331139839.h(f4096073349764486348) ? 4 : 2) | i2 | (m3727281027331139839.f(i1722681268793429505) ? 32 : 16) | (m3727281027331139839.h(f40960733497644863482) ? 256 : 128);
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            a(f4096073349764486348, i1722681268793429505, a, f40960733497644863482, m3727281027331139839, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new B7025542336834056064(f4096073349764486348, i1722681268793429505, f40960733497644863482, i2, (byte) 3);
        }
    }

    public static void b0(String str) {
        M8821877208104636290 m8821877208104636290 = new M8821877208104636290(G6547577305291411977.s("lateinit property ", str, " has not been initialized"));
        Y(m8821877208104636290, S10823041268949770285.class.getName());
        throw m8821877208104636290;
    }

    public static final native void c(String str, String str2, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    public static final Object c0(G8001132634698687269 g8001132634698687269, Object obj) {
        if (obj == null) {
            obj = a0(g8001132634698687269);
        }
        if (obj == 0) {
            return e;
        }
        if (!(obj instanceof Integer)) {
            return ((G17379711782311227394) obj).updateThreadContext(g8001132634698687269);
        }
        return g8001132634698687269.fold(h, new E13225724216532610954(((Number) obj).intValue(), g8001132634698687269));
    }

    public static final native void d(Map map, Set set, O4156515168131106712 o4156515168131106712, M3727281027331139839 m3727281027331139839, int i2);

    public static final void e(int i2, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, C7416942744136327252 c7416942744136327252, I1722681268793429505 i1722681268793429505, I5573661370475160895 i5573661370475160895, boolean z) {
        C7416942744136327252 c74169427441363272522;
        I5573661370475160895 i55736613704751608952;
        boolean z2;
        int i3;
        C7416942744136327252 c74169427441363272523;
        int i4;
        I5573661370475160895 i55736613704751608953;
        C7416942744136327252 c74169427441363272524;
        boolean z3;
        m3727281027331139839.b0(-399178234);
        int i5 = i2 | (m3727281027331139839.h(b13729205492206812220) ? 4 : 2) | 206208;
        if (m3727281027331139839.R(i5 & 1, (599187 & i5) != 599186)) {
            m3727281027331139839.W();
            if ((i2 & 1) == 0 || m3727281027331139839.z()) {
                I5573661370475160895 b2 = N13258083306148085703.b(O4077903568229246.t, m3727281027331139839);
                J3745674191043464657 j3745674191043464657 = (J3745674191043464657) m3727281027331139839.j(J5654975781851244064.a);
                C7416942744136327252 c74169427441363272525 = j3745674191043464657.i0;
                if (c74169427441363272525 == null) {
                    i3 = -64513;
                    c74169427441363272523 = new C7416942744136327252(J5654975781851244064.d(j3745674191043464657, C775827382551829194.c), J5654975781851244064.d(j3745674191043464657, C775827382551829194.h), U10174709222559481877.b(C775827382551829194.e, J5654975781851244064.d(j3745674191043464657, C775827382551829194.d)), U10174709222559481877.b(C775827382551829194.g, J5654975781851244064.d(j3745674191043464657, C775827382551829194.f)));
                    j3745674191043464657.i0 = c74169427441363272523;
                } else {
                    i3 = -64513;
                    c74169427441363272523 = c74169427441363272525;
                }
                i4 = i5 & i3;
                i55736613704751608953 = b2;
                c74169427441363272524 = c74169427441363272523;
                z3 = true;
            } else {
                m3727281027331139839.U();
                i4 = i5 & (-64513);
                c74169427441363272524 = c7416942744136327252;
                i55736613704751608953 = i5573661370475160895;
                z3 = z;
            }
            m3727281027331139839.r();
            s((i4 & 14) | 14352816, b13729205492206812220, l12639328004344855510, m3727281027331139839, c74169427441363272524, i1722681268793429505, i55736613704751608953, z3);
            i55736613704751608952 = i55736613704751608953;
            c74169427441363272522 = c74169427441363272524;
            z2 = z3;
        } else {
            m3727281027331139839.U();
            c74169427441363272522 = c7416942744136327252;
            i55736613704751608952 = i5573661370475160895;
            z2 = z;
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new A11195982617557152770(b13729205492206812220, i1722681268793429505, z2, i55736613704751608952, c74169427441363272522, l12639328004344855510, i2, (byte) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(dev.epro.r0.B13729205492206812220 r29, dev.epro.r0.I1722681268793429505 r30, boolean r31, dev.epro.r0.C7416942744136327252 r32, dev.epro.r0.I5573661370475160895 r33, dev.epro.r0.L12639328004344855510 r34, dev.epro.r0.M3727281027331139839 r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S10823041268949770285.f(dev.epro.r0.B13729205492206812220, dev.epro.r0.I1722681268793429505, boolean, dev.epro.r0.C7416942744136327252, dev.epro.r0.I5573661370475160895, dev.epro.r0.L12639328004344855510, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void g(int i2, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, C7416942744136327252 c7416942744136327252, I1722681268793429505 i1722681268793429505, I5573661370475160895 i5573661370475160895, boolean z) {
        int i3;
        m3727281027331139839.b0(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(b13729205492206812220) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.f(i5573661370475160895) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.f(c7416942744136327252) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m3727281027331139839.h(l12639328004344855510) ? 1048576 : 524288;
        }
        if (m3727281027331139839.R(i3 & 1, (599187 & i3) != 599186)) {
            m3727281027331139839.a0(977045485);
            Object M = m3727281027331139839.M();
            if (M == O9023047933786425027.a) {
                M = L11610354117192841236.m(m3727281027331139839);
            }
            S9385204271696540760 s9385204271696540760 = (S9385204271696540760) M;
            m3727281027331139839.q(false);
            F7206147944927503893 f7206147944927503893 = E11606037000563084849.a;
            I1722681268793429505 Q0 = i1722681268793429505.Q0(D15216840398887440549.a);
            float f2 = O4077903568229246.u;
            long c2 = D1286559660607336098.c(O4077903568229246.v + f2 + f2, 40.0f);
            E15199111381077736750 e15199111381077736750 = V16747615581620678882.a;
            I1722681268793429505 N = C12265524002282074474.N(O5354877807466160604.E(M9216324016624295870.p(R7033599853981556291.p(V16747615581620678882.l(Q0, T17307533667608403708.b(c2), T17307533667608403708.a(c2)), i5573661370475160895), z ? c7416942744136327252.a : c7416942744136327252.c, i5573661370475160895), s9385204271696540760, M3862790495145116409.a(0.0f, 7, 0L, false), z, new H10924029057425269323(0), b13729205492206812220, 8));
            A10838822263452390785 c3 = Z6714950837425363575.c(T13350664027331345869.f, false);
            int A = E12775674050813925581.A(m3727281027331139839);
            P3648740535677465818 l = m3727281027331139839.l();
            I1722681268793429505 N2 = V12319504402545346730.N(m3727281027331139839, N);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, c3);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, l);
            X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
            if (m3727281027331139839.S || !t(m3727281027331139839.M(), Integer.valueOf(A))) {
                L11610354117192841236.t(A, m3727281027331139839, A, x4712621039624176170);
            }
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, N2);
            D1286559660607336098.a(L11610354117192841236.n(z ? c7416942744136327252.b : c7416942744136327252.d, F14501669313667597110.a), l12639328004344855510, m3727281027331139839, ((i3 >> 15) & 112) | 8);
            m3727281027331139839.q(true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new S16361031386497838954(i1722681268793429505, b13729205492206812220, z, i5573661370475160895, c7416942744136327252, l12639328004344855510, i2);
        }
    }

    public static final long h(int i2) {
        long j2 = i2 << 32;
        int i3 = N6199192456012754706.O;
        return j2;
    }

    public static final void i(Boolean bool, Object obj, I4293432593871965076 i4293432593871965076, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(696924721);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.h(f4096073349764486348) ? 2048 : 1024;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 1171) != 1170)) {
            m3727281027331139839.W();
            if ((i2 & 1) == 0 || m3727281027331139839.z()) {
                i4293432593871965076 = (I4293432593871965076) m3727281027331139839.j(G7911722858908282497.a);
            } else {
                m3727281027331139839.U();
            }
            int i4 = i3 & (-897);
            m3727281027331139839.r();
            boolean f2 = m3727281027331139839.f(bool) | m3727281027331139839.f(obj) | m3727281027331139839.f(i4293432593871965076);
            Object M = m3727281027331139839.M();
            if (f2 || M == O9023047933786425027.a) {
                M = new C16329111919086058141(i4293432593871965076.j());
                m3727281027331139839.k0(M);
            }
            j(i4293432593871965076, (C16329111919086058141) M, f4096073349764486348, m3727281027331139839, (i4 >> 3) & 896);
        } else {
            m3727281027331139839.U();
        }
        I4293432593871965076 i42934325938719650762 = i4293432593871965076;
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new G18133890210511251283((Object) bool, obj, (Object) i42934325938719650762, (S8977162183056139880) f4096073349764486348, i2, (byte) 5);
        }
    }

    public static final void j(I4293432593871965076 i4293432593871965076, C16329111919086058141 c16329111919086058141, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(228371534);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(i4293432593871965076) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(c16329111919086058141) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(f4096073349764486348) ? 256 : 128;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            boolean h2 = m3727281027331139839.h(c16329111919086058141) | ((i3 & 896) == 256) | m3727281027331139839.h(i4293432593871965076);
            Object M = m3727281027331139839.M();
            if (h2 || M == O9023047933786425027.a) {
                M = new C2148711509933735908((Object) i4293432593871965076, (Object) c16329111919086058141, (Object) f4096073349764486348, (byte) 20);
                m3727281027331139839.k0(M);
            }
            Q13169198992966610970.d(i4293432593871965076, c16329111919086058141, (F4096073349764486348) M, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new N18429394832860979851((Object) i4293432593871965076, (Object) c16329111919086058141, (Object) f4096073349764486348, i2, (byte) 12);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void k(dev.epro.r0.R11406268294969300236 r44, dev.epro.r0.Q4132023691817090890 r45, dev.epro.r0.I1722681268793429505 r46, dev.epro.r0.G15527156457921655762 r47, dev.epro.r0.F4096073349764486348 r48, dev.epro.r0.F4096073349764486348 r49, dev.epro.r0.F4096073349764486348 r50, dev.epro.r0.F4096073349764486348 r51, dev.epro.r0.L12639328004344855510 r52, dev.epro.r0.L12639328004344855510 r53, dev.epro.r0.M3727281027331139839 r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 3110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S10823041268949770285.k(dev.epro.r0.R11406268294969300236, dev.epro.r0.Q4132023691817090890, dev.epro.r0.I1722681268793429505, dev.epro.r0.G15527156457921655762, dev.epro.r0.F4096073349764486348, dev.epro.r0.F4096073349764486348, dev.epro.r0.F4096073349764486348, dev.epro.r0.F4096073349764486348, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void l(final R11406268294969300236 r11406268294969300236, final String str, final I1722681268793429505 i1722681268793429505, G15527156457921655762 g15527156457921655762, final F4096073349764486348 f4096073349764486348, final F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, L12639328004344855510 l12639328004344855510, L12639328004344855510 l126393280043448555102, final F4096073349764486348 f40960733497644863485, M3727281027331139839 m3727281027331139839, final int i2) {
        int i3;
        I1722681268793429505 i17226812687934295052;
        F4096073349764486348 f40960733497644863486;
        F4096073349764486348 f40960733497644863487;
        final G15527156457921655762 g155271564579216557622;
        final F4096073349764486348 f40960733497644863488;
        final F4096073349764486348 f40960733497644863489;
        final L12639328004344855510 l126393280043448555103;
        final L12639328004344855510 l126393280043448555104;
        G15527156457921655762 g155271564579216557623;
        int i4;
        L12639328004344855510 l126393280043448555105;
        int i5;
        L12639328004344855510 l126393280043448555106;
        m3727281027331139839.b0(621695386);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(r11406268294969300236) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i17226812687934295052 = i1722681268793429505;
            i3 |= m3727281027331139839.f(i17226812687934295052) ? 256 : 128;
        } else {
            i17226812687934295052 = i1722681268793429505;
        }
        int i6 = i3 | 27648;
        if ((196608 & i2) == 0) {
            f40960733497644863486 = f4096073349764486348;
            i6 |= m3727281027331139839.h(f40960733497644863486) ? 131072 : 65536;
        } else {
            f40960733497644863486 = f4096073349764486348;
        }
        if ((1572864 & i2) == 0) {
            f40960733497644863487 = f40960733497644863482;
            i6 |= m3727281027331139839.h(f40960733497644863487) ? 1048576 : 524288;
        } else {
            f40960733497644863487 = f40960733497644863482;
        }
        if ((12582912 & i2) == 0) {
            i6 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= 33554432;
        }
        int i7 = i6 | 805306368;
        int i8 = (m3727281027331139839.h(f40960733497644863485) ? (char) 256 : (char) 128) | '6';
        if (m3727281027331139839.R(i7 & 1, ((306783379 & i7) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            m3727281027331139839.W();
            if ((i2 & 1) == 0 || m3727281027331139839.z()) {
                g155271564579216557623 = T13350664027331345869.b;
                i4 = i7 & (-264241153);
                X4712621039624176170 x4712621039624176170 = M18113111391818111737.h;
                l126393280043448555105 = M18113111391818111737.i;
                i5 = 805306368;
                l126393280043448555106 = x4712621039624176170;
            } else {
                m3727281027331139839.U();
                i4 = i7 & (-264241153);
                g155271564579216557623 = g15527156457921655762;
                f40960733497644863486 = f40960733497644863483;
                f40960733497644863487 = f40960733497644863484;
                l126393280043448555105 = l126393280043448555102;
                i5 = 805306368;
                l126393280043448555106 = l12639328004344855510;
            }
            m3727281027331139839.r();
            int i9 = i5;
            boolean z = ((i4 & 112) == 32) | ((i4 & 57344) == 16384) | ((i8 & 896) == 256);
            Object M = m3727281027331139839.M();
            if (z || M == O9023047933786425027.a) {
                Y1644299864327434647 y1644299864327434647 = new Y1644299864327434647(r11406268294969300236.b.s, str);
                f40960733497644863485.invoke(y1644299864327434647);
                M = y1644299864327434647.g();
                m3727281027331139839.k0(M);
            }
            int i10 = i4 & 8078;
            int i11 = i4 >> 3;
            int i12 = (i11 & 234881024) | i10 | (i11 & 57344) | (458752 & i11) | i9;
            G15527156457921655762 g155271564579216557624 = g155271564579216557623;
            L12639328004344855510 l126393280043448555107 = l126393280043448555105;
            k(r11406268294969300236, (Q4132023691817090890) M, i17226812687934295052, g155271564579216557624, f4096073349764486348, f40960733497644863482, f40960733497644863486, f40960733497644863487, l126393280043448555106, l126393280043448555107, m3727281027331139839, i12, 6);
            g155271564579216557622 = g155271564579216557624;
            l126393280043448555104 = l126393280043448555107;
            l126393280043448555103 = l126393280043448555106;
            f40960733497644863489 = f40960733497644863487;
            f40960733497644863488 = f40960733497644863486;
        } else {
            m3727281027331139839.U();
            g155271564579216557622 = g15527156457921655762;
            f40960733497644863488 = f40960733497644863483;
            f40960733497644863489 = f40960733497644863484;
            l126393280043448555103 = l12639328004344855510;
            l126393280043448555104 = l126393280043448555102;
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new L12639328004344855510() { // from class: dev.epro.r0.K6791233211305741247
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    S10823041268949770285.l(R11406268294969300236.this, str, i1722681268793429505, g155271564579216557622, f4096073349764486348, f40960733497644863482, f40960733497644863488, f40960733497644863489, l126393280043448555103, l126393280043448555104, f40960733497644863485, (M3727281027331139839) obj, V16504496955554646429.p(i2 | 1));
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final native void m(F328346499417384150 f328346499417384150, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(Q3156151770218362234 q3156151770218362234, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(F328346499417384150 f328346499417384150, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(int i2, P876860906586710855 p876860906586710855, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void q(boolean z, int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void r(K1152907396623558498 k1152907396623558498, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    public static final void s(int i2, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, C7416942744136327252 c7416942744136327252, I1722681268793429505 i1722681268793429505, I5573661370475160895 i5573661370475160895, boolean z) {
        int i3;
        m3727281027331139839.b0(-171935091);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(b13729205492206812220) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.f(i5573661370475160895) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.f(c7416942744136327252) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.f(null) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m3727281027331139839.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= m3727281027331139839.h(l12639328004344855510) ? 8388608 : 4194304;
        }
        byte b2 = 0;
        if (m3727281027331139839.R(i3 & 1, (4793491 & i3) != 4793490)) {
            Object M = m3727281027331139839.M();
            if (M == O9023047933786425027.a) {
                M = new U3828252728192849465((byte) 24);
                m3727281027331139839.k0(M);
            }
            int i4 = i3 & 8078;
            int i5 = i3 << 9;
            X15668192874961033526.c(b13729205492206812220, J11170665878571083300.b(i1722681268793429505, false, (F4096073349764486348) M), z, i5573661370475160895, z ? c7416942744136327252.a : c7416942744136327252.c, z ? c7416942744136327252.b : c7416942744136327252.d, 0.0f, 0.0f, null, null, T(669231714, new O1599548299235767477(l12639328004344855510, b2), m3727281027331139839), m3727281027331139839, i4 | (234881024 & i5) | (i5 & 1879048192), 192);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new S16361031386497838954(b13729205492206812220, i1722681268793429505, z, i5573661370475160895, c7416942744136327252, l12639328004344855510, i2);
        }
    }

    public static boolean t(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final int u(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static final boolean v(V12527742189361867087 v12527742189361867087) {
        return !v12527742189361867087.h && v12527742189361867087.d;
    }

    public static final boolean w(V12527742189361867087 v12527742189361867087) {
        return v12527742189361867087.h && !v12527742189361867087.d;
    }

    public static final K12650811430861268746 x(J12043550928838212009 j12043550928838212009, J12043550928838212009 j120435509288382120092, J12043550928838212009 j120435509288382120093, J12043550928838212009 j120435509288382120094, J12043550928838212009 j120435509288382120095, V9261584529168786349 v9261584529168786349) {
        return new K12650811430861268746(new J12043550928838212009[]{j12043550928838212009, j120435509288382120092, j120435509288382120093, j120435509288382120094, j120435509288382120095}, v9261584529168786349, (byte) 5);
    }

    public static final K12650811430861268746 y(J12043550928838212009 j12043550928838212009, J12043550928838212009 j120435509288382120092, J12043550928838212009 j120435509288382120093, G13792465322404021864 g13792465322404021864) {
        return new K12650811430861268746(new J12043550928838212009[]{j12043550928838212009, j120435509288382120092, j120435509288382120093}, g13792465322404021864, (byte) 3);
    }

    public static int z(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    static {
        izmyclvb.qgayjvbiagej2(754);
        a = new M14716691558468128220((byte) 26);
        b = new T15443218846549482730(-1131826196, false, new H4191455248956457601((byte) 21));
        c = new Y10675828910133495542(false);
        byte b2 = 25;
        d = new D14731132657808549702("NO_OWNER", b2);
        e = new D14731132657808549702("NO_THREAD_ELEMENTS", b2);
        f = new R15397193384711361242((byte) 27);
        g = new R15397193384711361242((byte) 28);
        h = new R15397193384711361242((byte) 29);
        i = new Z14997871575210439922((byte) 11);
    }
}
