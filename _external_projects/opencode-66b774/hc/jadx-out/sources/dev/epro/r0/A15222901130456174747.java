package dev.epro.r0;

import ads_mobile_sdk.a41;
import ads_mobile_sdk.ao;
import ads_mobile_sdk.bq;
import ads_mobile_sdk.jr0;
import ads_mobile_sdk.mn1;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.util.TypedValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.bwmna.gdrqkg.izmyclvb;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class A15222901130456174747 {
    public static Z7022156542152740569 a;

    static {
        izmyclvb.oeynnivvrnts0(167);
    }

    public static final bq a(String str) {
        G17382531225519199574 g17382531225519199574O = bq.o();
        g17382531225519199574O.getClass();
        List listP0 = str != null ? M8927913404651150384.p0(str, new String[]{"."}, 6) : O2161699089510411363.a;
        if (listP0.size() == 3) {
            Long lJ = Z13168519540281190457.J((String) listP0.get(0));
            long jLongValue = lJ != null ? lJ.longValue() : 0L;
            g17382531225519199574O.b();
            bq bqVar = (bq) g17382531225519199574O.b;
            bqVar.bitField0_ |= 1;
            bqVar.major_ = jLongValue;
            Long lJ2 = Z13168519540281190457.J((String) listP0.get(1));
            long jLongValue2 = lJ2 != null ? lJ2.longValue() : 0L;
            g17382531225519199574O.b();
            bq bqVar2 = (bq) g17382531225519199574O.b;
            bqVar2.bitField0_ |= 2;
            bqVar2.minor_ = jLongValue2;
            Long lJ3 = Z13168519540281190457.J((String) listP0.get(2));
            long jLongValue3 = lJ3 != null ? lJ3.longValue() : 0L;
            g17382531225519199574O.b();
            bq bqVar3 = (bq) g17382531225519199574O.b;
            bqVar3.bitField0_ |= 4;
            bqVar3.micro_ = jLongValue3;
        }
        return (bq) g17382531225519199574O.a();
    }

    public static Boolean b(K15572083692188606544 k15572083692188606544, boolean z) {
        boolean z2;
        boolean z3 = k15572083692188606544 instanceof D16457379462628768197;
        if (z3 && (k15572083692188606544.m().a instanceof Boolean)) {
            return Boolean.valueOf(k15572083692188606544.b() == z);
        }
        if (z3 && (k15572083692188606544.m().a instanceof Number)) {
            return Boolean.valueOf(z == ((k15572083692188606544.m().o().longValue() > 0L ? 1 : (k15572083692188606544.m().o().longValue() == 0L ? 0 : -1)) > 0));
        }
        String strP = (z3 && (k15572083692188606544.m().a instanceof String)) ? k15572083692188606544.p() : k15572083692188606544.toString();
        strP.getClass();
        String lowerCase = strP.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (K5751602218013079365.V("1", "t", "true").contains(lowerCase)) {
            z2 = true;
        } else {
            if (!K5751602218013079365.V("0", "f", "false").contains(lowerCase)) {
                return null;
            }
            z2 = false;
        }
        return Boolean.valueOf(z == z2);
    }

    public static String c(double d, a41 a41Var) {
        Object objValueOf;
        double dY = d * (a41Var.H() ? a41Var.y() : 1.0d);
        if (a41Var.I()) {
            iA = a41Var.A() >= 0 ? a41Var.A() : 5;
            objValueOf = Double.valueOf(((long) (dY * r2)) / Math.pow(10.0d, a41Var.A()));
        } else {
            objValueOf = a41Var.D() ? Long.valueOf(((long) (dY / ((double) a41Var.p()))) * ((long) a41Var.p())) : dY == Math.floor(dY) ? Long.valueOf(T18016951143603335921.a0(dY)) : Double.valueOf(dY);
        }
        String str = ((objValueOf instanceof Double) || (objValueOf instanceof Float)) ? String.format(Locale.US, G6547577305291411977.o(iA, "%.", "f"), Arrays.copyOf(new Object[]{objValueOf}, 1)) : String.format(Locale.US, "%d", Arrays.copyOf(new Object[]{objValueOf}, 1));
        if (!M8927913404651150384.L(str, ".", false)) {
            return str;
        }
        Pattern patternCompile = Pattern.compile("0*$");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        Pattern patternCompile2 = Pattern.compile("\\.$");
        patternCompile2.getClass();
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        strReplaceAll2.getClass();
        return strReplaceAll2;
    }

    public static final void d(Uri.Builder builder, String str, String str2) {
        if (str2 != null) {
            if ((str2.length() > 0 ? str2 : null) != null) {
                builder.appendQueryParameter(str, str2);
            }
        }
    }

    public static void e(ThreadPoolExecutor threadPoolExecutor, int i, jr0 jr0Var) {
        jr0Var.getClass();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        threadPoolExecutor.setKeepAliveTime(E17093345031926825464.e(((E17093345031926825464) jr0Var.a("gad:thread_keep_alive_time", new E17093345031926825464(M9216324016624295870.Z(10, N13798149404328803870.SECONDS)), ao.a)).a), TimeUnit.MILLISECONDS);
        if (i > threadPoolExecutor.getMaximumPoolSize()) {
            threadPoolExecutor.setMaximumPoolSize(i);
            threadPoolExecutor.setCorePoolSize(i);
        } else {
            threadPoolExecutor.setCorePoolSize(i);
            threadPoolExecutor.setMaximumPoolSize(i);
        }
    }

    public static boolean f(mn1 mn1Var, double d) {
        boolean zR = mn1Var.r();
        double dS = mn1Var.s();
        if (mn1Var.y()) {
            return zR ? d >= dS : d > dS;
        }
        if (mn1Var.z()) {
            return zR ? d <= dS : d < dS;
        }
        if (mn1Var.w()) {
            return (((long) d) & ((long) dS)) > 0;
        }
        return dS == d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(K15572083692188606544 k15572083692188606544, mn1 mn1Var) {
        if (mn1Var.B()) {
            String strU = mn1Var.u();
            strU.getClass();
            boolean z = k15572083692188606544 instanceof D16457379462628768197;
            String strP = (z && (k15572083692188606544.m().a instanceof String)) ? k15572083692188606544.p() : (z && (k15572083692188606544.m().a instanceof Boolean)) ? k15572083692188606544.b() ? "1" : "0" : k15572083692188606544.toString();
            Pattern patternCompile = Pattern.compile(strU);
            patternCompile.getClass();
            strP.getClass();
            return patternCompile.matcher(strP).matches();
        }
        if (mn1Var.x()) {
            Boolean boolB = b(k15572083692188606544, mn1Var.p());
            if (boolB != null) {
                return boolB.booleanValue();
            }
        } else if (mn1Var.A()) {
            boolean z2 = k15572083692188606544 instanceof D16457379462628768197;
            if (z2 && (k15572083692188606544.m().a instanceof Number)) {
                return f(mn1Var, k15572083692188606544.o().doubleValue());
            }
            if (z2 && (k15572083692188606544.m().a instanceof Number)) {
                return f(mn1Var, k15572083692188606544.b() ? 1.0d : 0.0d);
            }
            String strP2 = (z2 && (k15572083692188606544.m().a instanceof String)) ? k15572083692188606544.p() : k15572083692188606544.toString();
            strP2.getClass();
            String lowerCase = strP2.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Double dW = P16125534692405119660.w(lowerCase);
            if (dW != null) {
                return f(mn1Var, dW.doubleValue());
            }
        } else {
            if (!mn1Var.v()) {
                return true;
            }
            mn1 mn1VarO = mn1Var.o();
            mn1VarO.getClass();
            if (k15572083692188606544 instanceof P16422848101170923038) {
                P16422848101170923038 p16422848101170923038K = k15572083692188606544.k();
                if (!(p16422848101170923038K instanceof Collection) || !((Collection) p16422848101170923038K).isEmpty()) {
                    ArrayList arrayList = p16422848101170923038K.a;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        K15572083692188606544 k155720836921886065442 = (K15572083692188606544) obj;
                        if (mn1VarO.t().isEmpty()) {
                            k155720836921886065442.getClass();
                            if (g(k155720836921886065442, mn1VarO)) {
                                return true;
                            }
                        } else {
                            k155720836921886065442.getClass();
                            if ((k155720836921886065442 instanceof I16631908410500040363) && h(k155720836921886065442.l(), mn1VarO)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean h(I16631908410500040363 i16631908410500040363, mn1 mn1Var) {
        if (mn1Var.t().isEmpty()) {
            return false;
        }
        O6641393078261985068 o6641393078261985068T = mn1Var.t();
        o6641393078261985068T.getClass();
        K15572083692188606544 k15572083692188606544I = i(i16631908410500040363, o6641393078261985068T);
        if (k15572083692188606544I == null) {
            return false;
        }
        return g(k15572083692188606544I, mn1Var);
    }

    public static K15572083692188606544 i(I16631908410500040363 i16631908410500040363, O6641393078261985068 o6641393078261985068) {
        Iterator it = o6641393078261985068.iterator();
        K15572083692188606544 k15572083692188606544W = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (k15572083692188606544W != null && !(k15572083692188606544W instanceof I16631908410500040363)) {
                return null;
            }
            if (k15572083692188606544W == null || (k15572083692188606544W = k15572083692188606544W.l().w(str)) == null) {
                k15572083692188606544W = i16631908410500040363.w(str);
            }
        }
        return k15572083692188606544W;
    }

    public static String j(K15572083692188606544 k15572083692188606544, a41 a41Var) {
        String str;
        CharSequence charSequenceSubSequence = "";
        if (k15572083692188606544 instanceof I16631908410500040363) {
            I16631908410500040363 i16631908410500040363L = k15572083692188606544.l();
            int iX = a41Var.G() ? a41Var.x() : -1;
            Set setKeySet = i16631908410500040363L.a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((S11564727846197427291) setKeySet).iterator();
            while (((L622219180424329983) it).hasNext()) {
                String str2 = (String) ((L622219180424329983) it).a().f;
                K15572083692188606544 k15572083692188606544W = i16631908410500040363L.w(str2);
                k15572083692188606544W.getClass();
                String strJ = j(k15572083692188606544W, a41Var);
                if (a41Var.r() <= 0 || strJ.length() <= a41Var.r()) {
                    str = str2 + a41Var.v() + strJ;
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            String strU = a41Var.u();
            strU.getClass();
            String strJ0 = R9411874267597469228.J0(arrayList, strU, null, null, iX, null, 38);
            int length = strJ0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (strJ0.charAt(length) != a41Var.o().charAt(0)) {
                        charSequenceSubSequence = strJ0.subSequence(0, length + 1);
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
            return charSequenceSubSequence.toString();
        }
        if (!(k15572083692188606544 instanceof P16422848101170923038)) {
            boolean z = k15572083692188606544 instanceof D16457379462628768197;
            if (!z || !(k15572083692188606544.m().a instanceof String)) {
                return (z && (k15572083692188606544.m().a instanceof Boolean)) ? k15572083692188606544.m().b() ? "1" : "0" : k15572083692188606544.toString();
            }
            String strP = k15572083692188606544.p();
            strP.getClass();
            return strP;
        }
        P16422848101170923038 p16422848101170923038K = k15572083692188606544.k();
        int iX2 = a41Var.G() ? a41Var.x() : -1;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = p16422848101170923038K.a;
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            K15572083692188606544 k155720836921886065442 = (K15572083692188606544) obj;
            k155720836921886065442.getClass();
            String strJ2 = j(k155720836921886065442, a41Var);
            if (a41Var.r() > 0 && strJ2.length() > a41Var.r()) {
                strJ2 = null;
            }
            if (strJ2 != null) {
                arrayList2.add(strJ2);
            }
        }
        String strO = a41Var.o();
        strO.getClass();
        String strJ02 = R9411874267597469228.J0(arrayList2, strO, null, null, iX2, null, 38);
        int length2 = strJ02.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (strJ02.charAt(length2) != a41Var.o().charAt(0)) {
                    charSequenceSubSequence = strJ02.subSequence(0, length2 + 1);
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                length2 = i3;
            }
        }
        return charSequenceSubSequence.toString();
    }

    public static final native String k(String str);

    public static final Z7022156542152740569 l() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Security", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(12.0f, 1.0f);
        v14323974914327418545.h(3.0f, 5.0f);
        v14323974914327418545.s(6.0f);
        v14323974914327418545.e(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        v14323974914327418545.e(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        v14323974914327418545.h(21.0f, 5.0f);
        v14323974914327418545.i(-9.0f, -4.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(12.0f, 11.99f);
        v14323974914327418545.g(7.0f);
        v14323974914327418545.e(-0.53f, 4.12f, -3.28f, 7.79f, -7.0f, 8.94f);
        v14323974914327418545.h(12.0f, 12.0f);
        v14323974914327418545.h(5.0f, 12.0f);
        v14323974914327418545.h(5.0f, 6.3f);
        v14323974914327418545.i(7.0f, -3.11f);
        v14323974914327418545.s(8.8f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final boolean m(M11181104712105445833 m11181104712105445833) {
        int length = m11181104712105445833.b.length();
        List list = m11181104712105445833.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                F14378331124810887321 f14378331124810887321 = (F14378331124810887321) list.get(i);
                if ((f14378331124810887321.a instanceof J11984637636147625377) && Z15472362586437216226.b(0, length, f14378331124810887321.b, f14378331124810887321.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final native void n();

    public static boolean o(byte b) {
        return b > -65;
    }

    public static final native boolean p(String str);

    /* JADX WARN: Removed duplicated region for block: B:113:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.S18102156289003884608 q(android.content.res.Resources.Theme r53, android.content.res.Resources r54, android.content.res.XmlResourceParser r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A15222901130456174747.q(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):dev.epro.r0.S18102156289003884608");
    }

    public static final native Q7430090668634766253 r(String str);

    public static S790996689653940400 s(String str) throws GeneralSecurityException {
        try {
            return S790996689653940400.j(new J6579077889109668233(new ByteArrayInputStream(str.getBytes(J6579077889109668233.b))));
        } catch (IOException unused) {
            W4415201450379021245.c("Parse keyset failed");
            return null;
        }
    }

    public static final native Q7430090668634766253 t(String str);

    public static final native Q7430090668634766253 u(String str, B5333895829159759522 b5333895829159759522);

    public static void v(M10846389789027735899 m10846389789027735899) {
        S17255966974483065294 s17255966974483065294;
        I9221312866721349709 i9221312866721349709;
        I9221312866721349709 i92213128667213497092;
        do {
            s17255966974483065294 = W5596570651735549214.z;
            i9221312866721349709 = (I9221312866721349709) s17255966974483065294.getValue();
            C560824835210562156 c560824835210562156A = i9221312866721349709.c;
            H6096100481828783755 h6096100481828783755 = (H6096100481828783755) c560824835210562156A.get(m10846389789027735899);
            if (h6096100481828783755 == null) {
                i92213128667213497092 = i9221312866721349709;
            } else {
                Object obj = h6096100481828783755.a;
                Object obj2 = h6096100481828783755.b;
                B14108412273878533248 b14108412273878533248 = c560824835210562156A.a;
                B14108412273878533248 b14108412273878533248V = b14108412273878533248.v(m10846389789027735899 != null ? m10846389789027735899.hashCode() : 0, 0, m10846389789027735899);
                if (b14108412273878533248 != b14108412273878533248V) {
                    c560824835210562156A = b14108412273878533248V == null ? C560824835210562156.c : new C560824835210562156(b14108412273878533248V, c560824835210562156A.b - 1);
                }
                B14824868959299866349 b14824868959299866349 = B14824868959299866349.g;
                if (obj != b14824868959299866349) {
                    Object obj3 = c560824835210562156A.get(obj);
                    obj3.getClass();
                    c560824835210562156A = c560824835210562156A.a(obj, new H6096100481828783755(((H6096100481828783755) obj3).a, obj2));
                }
                if (obj2 != b14824868959299866349) {
                    Object obj4 = c560824835210562156A.get(obj2);
                    obj4.getClass();
                    c560824835210562156A = c560824835210562156A.a(obj2, new H6096100481828783755(obj, ((H6096100481828783755) obj4).b));
                }
                Object obj5 = obj != b14824868959299866349 ? i9221312866721349709.a : obj2;
                if (obj2 != b14824868959299866349) {
                    obj = i9221312866721349709.b;
                }
                i92213128667213497092 = new I9221312866721349709(obj5, obj, c560824835210562156A);
            }
            if (i9221312866721349709 == i92213128667213497092) {
                return;
            }
        } while (!s17255966974483065294.i(i9221312866721349709, i92213128667213497092));
    }

    public static final native H9594781759364688001 w(Map map);

    public static final native LinkedHashMap x(H9594781759364688001 h9594781759364688001);

    public static final Z7022156542152740569 y(int i, M3727281027331139839 m3727281027331139839) throws XmlPullParserException, IOException {
        Context context = (Context) m3727281027331139839.j(T15795698139970521497.b);
        Resources resources = (Resources) m3727281027331139839.j(T15795698139970521497.c);
        Resources.Theme theme = context.getTheme();
        Object configuration = resources.getConfiguration();
        boolean zF = m3727281027331139839.f(configuration) | m3727281027331139839.d(i) | m3727281027331139839.f(resources) | m3727281027331139839.f(theme);
        Object objM = m3727281027331139839.M();
        if (zF || objM == O9023047933786425027.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            objM = q(theme, resources, xml, typedValue.changingConfigurations).a;
            m3727281027331139839.k0(objM);
        }
        return (Z7022156542152740569) objM;
    }

    public static final Object z(K14749510448791472029 k14749510448791472029) {
        Object obj;
        G8001132634698687269 context = k14749510448791472029.getContext();
        J8045362843799184672.K(context);
        R4833348786910499294 r4833348786910499294H = E18444280280170001567.H(k14749510448791472029);
        N16152488056535110728 n16152488056535110728 = r4833348786910499294H instanceof N16152488056535110728 ? (N16152488056535110728) r4833348786910499294H : null;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (n16152488056535110728 == null) {
            obj = o9245300239821758723;
        } else {
            D11883231851729262595 d11883231851729262595 = n16152488056535110728.d;
            if (d11883231851729262595.B(context)) {
                n16152488056535110728.f = o9245300239821758723;
                n16152488056535110728.c = 1;
                d11883231851729262595.A(context, n16152488056535110728);
            } else {
                R10581505017215614416 r10581505017215614416 = new R10581505017215614416(R10581505017215614416.c);
                G8001132634698687269 g8001132634698687269Plus = context.plus(r10581505017215614416);
                n16152488056535110728.f = o9245300239821758723;
                n16152488056535110728.c = 1;
                d11883231851729262595.A(g8001132634698687269Plus, n16152488056535110728);
                if (r10581505017215614416.b) {
                    I17129535152515035455 i17129535152515035455A = P13752028179861838617.a();
                    N11678082982039175888 n11678082982039175888 = i17129535152515035455A.e;
                    if (!(n11678082982039175888 != null ? n11678082982039175888.isEmpty() : true)) {
                        if (i17129535152515035455A.c >= 4294967296L) {
                            n16152488056535110728.f = o9245300239821758723;
                            n16152488056535110728.c = 1;
                            i17129535152515035455A.E(n16152488056535110728);
                        } else {
                            i17129535152515035455A.F(true);
                            try {
                                n16152488056535110728.run();
                                do {
                                } while (i17129535152515035455A.H());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = o9245300239821758723;
                }
            }
            obj = z3437138737604933638;
        }
        return obj == z3437138737604933638 ? obj : o9245300239821758723;
    }
}
