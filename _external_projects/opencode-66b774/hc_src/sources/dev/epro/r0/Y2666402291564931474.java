package dev.epro.r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class Y2666402291564931474 implements K5640149205951865382 {
    static {
        izmyclvb.qgayjvbiagej2(32);
    }

    public static final void a(I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i, int i2) {
        int i3;
        m3727281027331139839.b0(1949207773);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                i1722681268793429505 = V10993962107938880611.a;
            }
            Object[] objArr = new Object[0];
            V10300877997588547986 v10300877997588547986 = I18373600287705206074.d;
            Object M = m3727281027331139839.M();
            if (M == O9023047933786425027.a) {
                M = new H475444086652660118((byte) 27);
                m3727281027331139839.k0(M);
            }
            b(i1722681268793429505, (I18373600287705206074) C468629748621011703.m(objArr, v10300877997588547986, (B13729205492206812220) M, m3727281027331139839, 384), t15443218846549482730, m3727281027331139839, (i3 & 14) | 3072);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new K16152036124330436916(i1722681268793429505, t15443218846549482730, i, i2);
        }
    }

    public static final void b(I1722681268793429505 i1722681268793429505, final I18373600287705206074 i18373600287705206074, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i) {
        int i2;
        m3727281027331139839.b0(-1922770793);
        byte b = 2;
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= m3727281027331139839.h(i18373600287705206074) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 2048 : 1024;
        }
        final byte b3 = 0;
        if (m3727281027331139839.R(i3 & 1, (i3 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object M = m3727281027331139839.M();
            Object obj = O9023047933786425027.a;
            if (M == obj) {
                M = new H475444086652660118((byte) 25);
                m3727281027331139839.k0(M);
            }
            A957273981459855795 a957273981459855795 = (A957273981459855795) C468629748621011703.m(objArr, A957273981459855795.l, (B13729205492206812220) M, m3727281027331139839, 384);
            Object M2 = m3727281027331139839.M();
            if (M2 == obj) {
                M2 = new A15234621907337682254(a957273981459855795);
                m3727281027331139839.k0(M2);
            }
            final A15234621907337682254 a15234621907337682254 = (A15234621907337682254) M2;
            m3727281027331139839.a0(714821931);
            m3727281027331139839.q(false);
            Object obj2 = (L3957284589981577691) m3727281027331139839.j(Y238707362170117896.f);
            Object M3 = m3727281027331139839.M();
            if (M3 == obj) {
                M3 = Q13169198992966610970.R(m3727281027331139839);
                m3727281027331139839.k0(M3);
            }
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) M3;
            a15234621907337682254.e = (I16162375839174538453) m3727281027331139839.j(Y238707362170117896.l);
            boolean f = m3727281027331139839.f(w5797197595347441198) | m3727281027331139839.f(obj2);
            Object M4 = m3727281027331139839.M();
            if (f || M4 == obj) {
                M4 = new F16051537739966011766((Object) w5797197595347441198, obj2, (byte) 10);
                m3727281027331139839.k0(M4);
            }
            a15234621907337682254.f = (F4096073349764486348) M4;
            a15234621907337682254.o(i18373600287705206074.a());
            boolean h = m3727281027331139839.h(i18373600287705206074) | m3727281027331139839.h(a15234621907337682254);
            Object M5 = m3727281027331139839.M();
            if (h || M5 == obj) {
                M5 = new F4096073349764486348() { // from class: dev.epro.r0.G11915415249283174245
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [dev.epro.r0.O2161699089510411363] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    @Override // dev.epro.r0.F4096073349764486348
                    public final Object invoke(Object obj3) {
                        Object obj4;
                        int i4;
                        byte b4 = b3;
                        A15234621907337682254 a152346219073376822542 = a15234621907337682254;
                        I18373600287705206074 i183736002877052060742 = i18373600287705206074;
                        switch (b4) {
                            case 0:
                                i183736002877052060742.a.setValue((V5656221289452463152) obj3);
                                A957273981459855795 a9572739814598557952 = a152346219073376822542.a;
                                if (a152346219073376822542.i() == null || a9572739814598557952.a().e == 0) {
                                    obj4 = O2161699089510411363.a;
                                } else {
                                    obj4 = new ArrayList();
                                    ArrayList e = a9572739814598557952.e(a152346219073376822542.m());
                                    ListIterator listIterator = e.listIterator(e.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            V5656221289452463152 v5656221289452463152 = (V5656221289452463152) a9572739814598557952.a().e(((U5234994727412699525) listIterator.previous()).a);
                                            if (v5656221289452463152 != null && v5656221289452463152.a.b != v5656221289452463152.b.b) {
                                                i4 = listIterator.nextIndex();
                                            }
                                        } else {
                                            i4 = -1;
                                        }
                                    }
                                    if (i4 != -1) {
                                        int size = e.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            U5234994727412699525 u5234994727412699525 = (U5234994727412699525) e.get(i5);
                                            V5656221289452463152 v56562212894524631522 = (V5656221289452463152) a9572739814598557952.a().e(u5234994727412699525.a);
                                            if (v56562212894524631522 != null) {
                                                M11181104712105445833 e2 = u5234994727412699525.e();
                                                long d = T1335862270807194835.d(v56562212894524631522.a.b, v56562212894524631522.b.b);
                                                obj4.add(e2.subSequence(F12478849263529740365.g(d), F12478849263529740365.f(d)));
                                            }
                                        }
                                    }
                                }
                                i183736002877052060742.c.setValue(obj4);
                                return O9245300239821758723.a;
                            default:
                                A15234621907337682254 a152346219073376822543 = i183736002877052060742.b;
                                if (a152346219073376822543 != null && a152346219073376822543 != a152346219073376822542) {
                                    S10973172697741180971.m("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                }
                                if (a152346219073376822543 == null || a152346219073376822543 == a152346219073376822542) {
                                    i183736002877052060742.b = a152346219073376822542;
                                    return new J16066275792042864572(i183736002877052060742, a152346219073376822542, (byte) 5);
                                }
                                S10973172697741180971.m("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                return null;
                        }
                    }
                };
                m3727281027331139839.k0(M5);
            }
            a15234621907337682254.d = new F16051537739966011766((Object) a15234621907337682254, M5, (byte) 11);
            if (T18016951143603335921.O) {
                m3727281027331139839.a0(715702021);
                a15234621907337682254.u = F6872943321507891134.b(L14432282451889478852.b, null, m3727281027331139839, 54);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(715830795);
                m3727281027331139839.q(false);
            }
            a15234621907337682254.t = w5797197595347441198;
            a15234621907337682254.k();
            W17298746467828202432 w17298746467828202432 = new W17298746467828202432(a15234621907337682254, new V10383417447826362791(a15234621907337682254, b), b);
            I1722681268793429505 i17226812687934295052 = V10993962107938880611.a;
            O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
            byte b4 = 5;
            I1722681268793429505 Q0 = B5998207562248239613.D(T7055906184043387232.b(G16660188620551127941.C(D15913187640519482289.w(O4077903568229246.H(T7055906184043387232.b(i17226812687934295052, o9245300239821758723, w17298746467828202432), new H285489298426063548(a15234621907337682254, b2)), a15234621907337682254.h), new H285489298426063548(a15234621907337682254, b4)).Q0(H1335492675503509791.a), 8675309, new J11977321013895313576(new H285489298426063548(a15234621907337682254, (byte) 6), b)), new L13891208534469225493(a15234621907337682254, b4)).Q0(T7055906184043387232.b(i17226812687934295052, o9245300239821758723, new J11977321013895313576(a15234621907337682254, (byte) 3)));
            if (a15234621907337682254.h() != null && a15234621907337682254.j()) {
                V5656221289452463152 i4 = a15234621907337682254.i();
                if (!(i4 == null ? true : S10823041268949770285.t(i4.a, i4.b)) && C3128094202652520619.a()) {
                    i17226812687934295052 = V12319504402545346730.w(i17226812687934295052, new Q2768324090487661247(a15234621907337682254, (byte) 20));
                }
            }
            c(i1722681268793429505.Q0(A10225670138084435446.u(Q0.Q0(i17226812687934295052), new Q15027034467569330017(a15234621907337682254, (byte) 27))), S10823041268949770285.T(464404577, new N16817068886562921204(a15234621907337682254, a957273981459855795, t15443218846549482730), m3727281027331139839), m3727281027331139839, 48);
            boolean h2 = m3727281027331139839.h(i18373600287705206074) | m3727281027331139839.h(a15234621907337682254);
            Object M6 = m3727281027331139839.M();
            if (h2 || M6 == obj) {
                final byte b5 = 1;
                M6 = new F4096073349764486348() { // from class: dev.epro.r0.G11915415249283174245
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v3, types: [dev.epro.r0.O2161699089510411363] */
                    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
                    @Override // dev.epro.r0.F4096073349764486348
                    public final Object invoke(Object obj3) {
                        Object obj4;
                        int i42;
                        byte b42 = b5;
                        A15234621907337682254 a152346219073376822542 = a15234621907337682254;
                        I18373600287705206074 i183736002877052060742 = i18373600287705206074;
                        switch (b42) {
                            case 0:
                                i183736002877052060742.a.setValue((V5656221289452463152) obj3);
                                A957273981459855795 a9572739814598557952 = a152346219073376822542.a;
                                if (a152346219073376822542.i() == null || a9572739814598557952.a().e == 0) {
                                    obj4 = O2161699089510411363.a;
                                } else {
                                    obj4 = new ArrayList();
                                    ArrayList e = a9572739814598557952.e(a152346219073376822542.m());
                                    ListIterator listIterator = e.listIterator(e.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            V5656221289452463152 v5656221289452463152 = (V5656221289452463152) a9572739814598557952.a().e(((U5234994727412699525) listIterator.previous()).a);
                                            if (v5656221289452463152 != null && v5656221289452463152.a.b != v5656221289452463152.b.b) {
                                                i42 = listIterator.nextIndex();
                                            }
                                        } else {
                                            i42 = -1;
                                        }
                                    }
                                    if (i42 != -1) {
                                        int size = e.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            U5234994727412699525 u5234994727412699525 = (U5234994727412699525) e.get(i5);
                                            V5656221289452463152 v56562212894524631522 = (V5656221289452463152) a9572739814598557952.a().e(u5234994727412699525.a);
                                            if (v56562212894524631522 != null) {
                                                M11181104712105445833 e2 = u5234994727412699525.e();
                                                long d = T1335862270807194835.d(v56562212894524631522.a.b, v56562212894524631522.b.b);
                                                obj4.add(e2.subSequence(F12478849263529740365.g(d), F12478849263529740365.f(d)));
                                            }
                                        }
                                    }
                                }
                                i183736002877052060742.c.setValue(obj4);
                                return O9245300239821758723.a;
                            default:
                                A15234621907337682254 a152346219073376822543 = i183736002877052060742.b;
                                if (a152346219073376822543 != null && a152346219073376822543 != a152346219073376822542) {
                                    S10973172697741180971.m("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                    return null;
                                }
                                if (a152346219073376822543 == null || a152346219073376822543 == a152346219073376822542) {
                                    i183736002877052060742.b = a152346219073376822542;
                                    return new J16066275792042864572(i183736002877052060742, a152346219073376822542, (byte) 5);
                                }
                                S10973172697741180971.m("A SelectionState can only be bound to one SelectionContainer. Please use rememberSelectionState() to create a unique state for each container.");
                                return null;
                        }
                    }
                };
                m3727281027331139839.k0(M6);
            }
            Q13169198992966610970.d(i18373600287705206074, a15234621907337682254, (F4096073349764486348) M6, m3727281027331139839);
            boolean h3 = m3727281027331139839.h(a15234621907337682254);
            Object M7 = m3727281027331139839.M();
            if (h3 || M7 == obj) {
                M7 = new H285489298426063548(a15234621907337682254, (byte) 0);
                m3727281027331139839.k0(M7);
            }
            Q13169198992966610970.c(a15234621907337682254, (F4096073349764486348) M7, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new N18429394832860979851(i1722681268793429505, i18373600287705206074, t15443218846549482730, i, (byte) 23);
        }
    }

    public static final void c(I1722681268793429505 i1722681268793429505, T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, int i) {
        m3727281027331139839.b0(-1854833411);
        int i2 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i;
        if (m3727281027331139839.R(i2 & 1, (i2 & 19) != 18)) {
            Object M = m3727281027331139839.M();
            if (M == O9023047933786425027.a) {
                M = D4887919054349991205.i;
                m3727281027331139839.k0(M);
            }
            A10838822263452390785 a10838822263452390785 = (A10838822263452390785) M;
            int hashCode = Long.hashCode(m3727281027331139839.T);
            P3648740535677465818 l = m3727281027331139839.l();
            I1722681268793429505 N = V12319504402545346730.N(m3727281027331139839, i1722681268793429505);
            X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, a10838822263452390785);
            W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, l);
            W7808703833045379622.J(P2382941533350862833.j, m3727281027331139839, Integer.valueOf(hashCode));
            W7808703833045379622.H(m3727281027331139839);
            W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, N);
            G11450220448113054352.m(6, t15443218846549482730, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new I17176798189566499417(i1722681268793429505, t15443218846549482730, i, (byte) 17);
        }
    }

    public static final native void d(L12639328004344855510 l12639328004344855510, String str, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, I1722681268793429505 i17226812687934295052, int i, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static String e(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(g(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(g(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static String g(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String s = G6547577305291411977.s(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger logger = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            "Exception during lenientFormat for ".concat(s);
            logger.getClass();
            return E12098517352909843120.m("<", s, " threw ", e.getClass().getName(), ">");
        }
    }

    public static final native T3983923074066333145 h(O10781065997450475496 o10781065997450475496, Context context, int i, String str, int i2, String str2, int i3, S8568872423891207546 s8568872423891207546, M13389864142310742121 m13389864142310742121, String str3, int i4);

    public static final int k(SQLiteStatement sQLiteStatement, String str) {
        sQLiteStatement.getClass();
        int g = P1789376955961125859.g(sQLiteStatement, str);
        if (g >= 0) {
            return g;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(sQLiteStatement.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + R9411874267597469228.J0(arrayList, null, null, null, 0, null, 63) + ']');
    }

    public static C15849213702011250340 l(Context context, AttributeSet attributeSet, int i, int i2) {
        C15849213702011250340 c15849213702011250340 = new C15849213702011250340();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V17440675085274646160.a, i, i2);
        c15849213702011250340.a = obtainStyledAttributes.getInt(0, 1);
        c15849213702011250340.b = obtainStyledAttributes.getInt(10, 1);
        c15849213702011250340.c = obtainStyledAttributes.getBoolean(9, false);
        c15849213702011250340.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return c15849213702011250340;
    }

    public static void m(F13241018602672925865 f13241018602672925865, I3583119498707957918 i3583119498707957918, Q17957571128037780363 q17957571128037780363, B1029012102904255937 b1029012102904255937, T17961989259024028332 t17961989259024028332, boolean z, R17143752899285419206 r17143752899285419206) {
        if (z) {
            int s = r17143752899285419206.s(F12478849263529740365.f(f13241018602672925865.b));
            String str = X16499811727614532856.a;
            S6349823729575121924 b = s < q17957571128037780363.a.a.b.length() ? q17957571128037780363.b(s) : s != 0 ? q17957571128037780363.b(s - 1) : new S6349823729575121924(0.0f, 0.0f, 1.0f, (int) (X16499811727614532856.a((S16571168858015125610) i3583119498707957918.c, (R8540738700654750557) i3583119498707957918.d, (U14340554418656580554) i3583119498707957918.e) & 4294967295L));
            float f = b.b;
            float f2 = b.a;
            long O = b1029012102904255937.O((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            S6349823729575121924 a = E2166724654553415323.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (O & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (O >> 32))) << 32), (Float.floatToRawIntBits(b.c - f2) << 32) | (Float.floatToRawIntBits(b.d - f) & 4294967295L));
            if (S10823041268949770285.t((T17961989259024028332) t17961989259024028332.a.b.get(), t17961989259024028332)) {
                t17961989259024028332.b.c(a);
            }
        }
    }

    public static boolean n() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public abstract String i(int i, byte[] bArr, int i2);

    public abstract int j(int i, int i2, String str, byte[] bArr);
}
