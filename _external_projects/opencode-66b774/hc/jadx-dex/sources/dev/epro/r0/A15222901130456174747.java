package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class A15222901130456174747 {
    public static dev.epro.r0.Z7022156542152740569 a;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(167);
    }

    public static final ads_mobile_sdk.bq a(java.lang.String str) {
        dev.epro.r0.G17382531225519199574 g17382531225519199574O = ads_mobile_sdk.bq.o();
        g17382531225519199574O.getClass();
        java.util.List listP0 = str != null ? dev.epro.r0.M8927913404651150384.p0(str, new java.lang.String[]{"."}, 6) : dev.epro.r0.O2161699089510411363.a;
        if (listP0.size() == 3) {
            java.lang.Long lJ = dev.epro.r0.Z13168519540281190457.J((java.lang.String) listP0.get(0));
            long jLongValue = lJ != null ? lJ.longValue() : 0L;
            g17382531225519199574O.b();
            ads_mobile_sdk.bq bqVar = (ads_mobile_sdk.bq) g17382531225519199574O.b;
            bqVar.bitField0_ |= 1;
            bqVar.major_ = jLongValue;
            java.lang.Long lJ2 = dev.epro.r0.Z13168519540281190457.J((java.lang.String) listP0.get(1));
            long jLongValue2 = lJ2 != null ? lJ2.longValue() : 0L;
            g17382531225519199574O.b();
            ads_mobile_sdk.bq bqVar2 = (ads_mobile_sdk.bq) g17382531225519199574O.b;
            bqVar2.bitField0_ |= 2;
            bqVar2.minor_ = jLongValue2;
            java.lang.Long lJ3 = dev.epro.r0.Z13168519540281190457.J((java.lang.String) listP0.get(2));
            long jLongValue3 = lJ3 != null ? lJ3.longValue() : 0L;
            g17382531225519199574O.b();
            ads_mobile_sdk.bq bqVar3 = (ads_mobile_sdk.bq) g17382531225519199574O.b;
            bqVar3.bitField0_ |= 4;
            bqVar3.micro_ = jLongValue3;
        }
        return (ads_mobile_sdk.bq) g17382531225519199574O.a();
    }

    public static java.lang.Boolean b(dev.epro.r0.K15572083692188606544 k15572083692188606544, boolean z) {
        boolean z2;
        boolean z3 = k15572083692188606544 instanceof dev.epro.r0.D16457379462628768197;
        if (z3 && (k15572083692188606544.m().a instanceof java.lang.Boolean)) {
            return java.lang.Boolean.valueOf(k15572083692188606544.b() == z);
        }
        if (z3 && (k15572083692188606544.m().a instanceof java.lang.Number)) {
            return java.lang.Boolean.valueOf(z == ((k15572083692188606544.m().o().longValue() > 0L ? 1 : (k15572083692188606544.m().o().longValue() == 0L ? 0 : -1)) > 0));
        }
        java.lang.String strP = (z3 && (k15572083692188606544.m().a instanceof java.lang.String)) ? k15572083692188606544.p() : k15572083692188606544.toString();
        strP.getClass();
        java.lang.String lowerCase = strP.toLowerCase(java.util.Locale.ROOT);
        lowerCase.getClass();
        if (dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"1", "t", "true"}).contains(lowerCase)) {
            z2 = true;
        } else {
            if (!dev.epro.r0.K5751602218013079365.V(new java.lang.String[]{"0", "f", "false"}).contains(lowerCase)) {
                return null;
            }
            z2 = false;
        }
        return java.lang.Boolean.valueOf(z == z2);
    }

    public static java.lang.String c(double d, ads_mobile_sdk.a41 a41Var) {
        java.lang.Object objValueOf;
        double dY = d * (a41Var.H() ? a41Var.y() : 1.0d);
        if (a41Var.I()) {
            iA = a41Var.A() >= 0 ? a41Var.A() : 5;
            objValueOf = java.lang.Double.valueOf(((long) (dY * r2)) / java.lang.Math.pow(10.0d, a41Var.A()));
        } else {
            objValueOf = a41Var.D() ? java.lang.Long.valueOf(((long) (dY / ((double) a41Var.p()))) * ((long) a41Var.p())) : dY == java.lang.Math.floor(dY) ? java.lang.Long.valueOf(dev.epro.r0.T18016951143603335921.a0(dY)) : java.lang.Double.valueOf(dY);
        }
        java.lang.String str = ((objValueOf instanceof java.lang.Double) || (objValueOf instanceof java.lang.Float)) ? java.lang.String.format(java.util.Locale.US, dev.epro.r0.G6547577305291411977.o(iA, "%.", "f"), java.util.Arrays.copyOf(new java.lang.Object[]{objValueOf}, 1)) : java.lang.String.format(java.util.Locale.US, "%d", java.util.Arrays.copyOf(new java.lang.Object[]{objValueOf}, 1));
        if (!dev.epro.r0.M8927913404651150384.L(str, ".", false)) {
            return str;
        }
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("0*$");
        patternCompile.getClass();
        java.lang.String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        strReplaceAll.getClass();
        java.util.regex.Pattern patternCompile2 = java.util.regex.Pattern.compile("\\.$");
        patternCompile2.getClass();
        java.lang.String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        strReplaceAll2.getClass();
        return strReplaceAll2;
    }

    public static final void d(android.net.Uri.Builder builder, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            if ((str2.length() > 0 ? str2 : null) != null) {
                builder.appendQueryParameter(str, str2);
            }
        }
    }

    public static void e(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, int i, ads_mobile_sdk.jr0 jr0Var) {
        jr0Var.getClass();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        threadPoolExecutor.setKeepAliveTime(dev.epro.r0.E17093345031926825464.e(((dev.epro.r0.E17093345031926825464) jr0Var.a("gad:thread_keep_alive_time", new dev.epro.r0.E17093345031926825464(dev.epro.r0.M9216324016624295870.Z(10, dev.epro.r0.N13798149404328803870.e)), ads_mobile_sdk.ao.a)).a), java.util.concurrent.TimeUnit.MILLISECONDS);
        if (i > threadPoolExecutor.getMaximumPoolSize()) {
            threadPoolExecutor.setMaximumPoolSize(i);
            threadPoolExecutor.setCorePoolSize(i);
        } else {
            threadPoolExecutor.setCorePoolSize(i);
            threadPoolExecutor.setMaximumPoolSize(i);
        }
    }

    public static boolean f(ads_mobile_sdk.mn1 mn1Var, double d) {
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

    public static boolean g(dev.epro.r0.K15572083692188606544 k15572083692188606544, ads_mobile_sdk.mn1 mn1Var) {
        if (mn1Var.B()) {
            java.lang.String strU = mn1Var.u();
            strU.getClass();
            boolean z = k15572083692188606544 instanceof dev.epro.r0.D16457379462628768197;
            java.lang.String strP = (z && (k15572083692188606544.m().a instanceof java.lang.String)) ? k15572083692188606544.p() : (z && (k15572083692188606544.m().a instanceof java.lang.Boolean)) ? k15572083692188606544.b() ? "1" : "0" : k15572083692188606544.toString();
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(strU);
            patternCompile.getClass();
            strP.getClass();
            return patternCompile.matcher(strP).matches();
        }
        if (mn1Var.x()) {
            java.lang.Boolean boolB = b(k15572083692188606544, mn1Var.p());
            if (boolB != null) {
                return boolB.booleanValue();
            }
        } else if (mn1Var.A()) {
            boolean z2 = k15572083692188606544 instanceof dev.epro.r0.D16457379462628768197;
            if (z2 && (k15572083692188606544.m().a instanceof java.lang.Number)) {
                return f(mn1Var, k15572083692188606544.o().doubleValue());
            }
            if (z2 && (k15572083692188606544.m().a instanceof java.lang.Number)) {
                return f(mn1Var, k15572083692188606544.b() ? 1.0d : 0.0d);
            }
            java.lang.String strP2 = (z2 && (k15572083692188606544.m().a instanceof java.lang.String)) ? k15572083692188606544.p() : k15572083692188606544.toString();
            strP2.getClass();
            java.lang.String lowerCase = strP2.toLowerCase(java.util.Locale.ROOT);
            lowerCase.getClass();
            java.lang.Double dW = dev.epro.r0.P16125534692405119660.w(lowerCase);
            if (dW != null) {
                return f(mn1Var, dW.doubleValue());
            }
        } else {
            if (!mn1Var.v()) {
                return true;
            }
            ads_mobile_sdk.mn1 mn1VarO = mn1Var.o();
            mn1VarO.getClass();
            if (k15572083692188606544 instanceof dev.epro.r0.P16422848101170923038) {
                java.util.Collection collectionK = k15572083692188606544.k();
                if (!(collectionK instanceof java.util.Collection) || !collectionK.isEmpty()) {
                    java.util.ArrayList arrayList = ((dev.epro.r0.P16422848101170923038) collectionK).a;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList.get(i);
                        i++;
                        dev.epro.r0.K15572083692188606544 k155720836921886065442 = (dev.epro.r0.K15572083692188606544) obj;
                        if (mn1VarO.t().isEmpty()) {
                            k155720836921886065442.getClass();
                            if (g(k155720836921886065442, mn1VarO)) {
                                return true;
                            }
                        } else {
                            k155720836921886065442.getClass();
                            if ((k155720836921886065442 instanceof dev.epro.r0.I16631908410500040363) && h(k155720836921886065442.l(), mn1VarO)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean h(dev.epro.r0.I16631908410500040363 i16631908410500040363, ads_mobile_sdk.mn1 mn1Var) {
        if (mn1Var.t().isEmpty()) {
            return false;
        }
        dev.epro.r0.O6641393078261985068 o6641393078261985068T = mn1Var.t();
        o6641393078261985068T.getClass();
        dev.epro.r0.K15572083692188606544 k15572083692188606544I = i(i16631908410500040363, o6641393078261985068T);
        if (k15572083692188606544I == null) {
            return false;
        }
        return g(k15572083692188606544I, mn1Var);
    }

    public static dev.epro.r0.K15572083692188606544 i(dev.epro.r0.I16631908410500040363 i16631908410500040363, dev.epro.r0.O6641393078261985068 o6641393078261985068) {
        java.util.Iterator it = o6641393078261985068.iterator();
        dev.epro.r0.K15572083692188606544 k15572083692188606544W = null;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (k15572083692188606544W != null && !(k15572083692188606544W instanceof dev.epro.r0.I16631908410500040363)) {
                return null;
            }
            if (k15572083692188606544W == null || (k15572083692188606544W = k15572083692188606544W.l().w(str)) == null) {
                k15572083692188606544W = i16631908410500040363.w(str);
            }
        }
        return k15572083692188606544W;
    }

    public static java.lang.String j(dev.epro.r0.K15572083692188606544 k15572083692188606544, ads_mobile_sdk.a41 a41Var) {
        java.lang.String str;
        java.lang.CharSequence charSequenceSubSequence = "";
        if (k15572083692188606544 instanceof dev.epro.r0.I16631908410500040363) {
            dev.epro.r0.I16631908410500040363 i16631908410500040363L = k15572083692188606544.l();
            int iX = a41Var.G() ? a41Var.x() : -1;
            dev.epro.r0.S11564727846197427291 s11564727846197427291KeySet = i16631908410500040363L.a.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            dev.epro.r0.L622219180424329983 it = s11564727846197427291KeySet.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.a().f;
                dev.epro.r0.K15572083692188606544 k15572083692188606544W = i16631908410500040363L.w(str2);
                k15572083692188606544W.getClass();
                java.lang.String strJ = j(k15572083692188606544W, a41Var);
                if (a41Var.r() <= 0 || strJ.length() <= a41Var.r()) {
                    str = str2 + a41Var.v() + strJ;
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            java.lang.String strU = a41Var.u();
            strU.getClass();
            java.lang.String strJ0 = dev.epro.r0.R9411874267597469228.J0(arrayList, strU, (java.lang.String) null, (java.lang.String) null, iX, (dev.epro.r0.F4096073349764486348) null, 38);
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
        if (!(k15572083692188606544 instanceof dev.epro.r0.P16422848101170923038)) {
            boolean z = k15572083692188606544 instanceof dev.epro.r0.D16457379462628768197;
            if (!z || !(k15572083692188606544.m().a instanceof java.lang.String)) {
                return (z && (k15572083692188606544.m().a instanceof java.lang.Boolean)) ? k15572083692188606544.m().b() ? "1" : "0" : k15572083692188606544.toString();
            }
            java.lang.String strP = k15572083692188606544.p();
            strP.getClass();
            return strP;
        }
        dev.epro.r0.P16422848101170923038 p16422848101170923038K = k15572083692188606544.k();
        int iX2 = a41Var.G() ? a41Var.x() : -1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = p16422848101170923038K.a;
        int size = arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList3.get(i2);
            i2++;
            dev.epro.r0.K15572083692188606544 k155720836921886065442 = (dev.epro.r0.K15572083692188606544) obj;
            k155720836921886065442.getClass();
            java.lang.String strJ2 = j(k155720836921886065442, a41Var);
            if (a41Var.r() > 0 && strJ2.length() > a41Var.r()) {
                strJ2 = null;
            }
            if (strJ2 != null) {
                arrayList2.add(strJ2);
            }
        }
        java.lang.String strO = a41Var.o();
        strO.getClass();
        java.lang.String strJ02 = dev.epro.r0.R9411874267597469228.J0(arrayList2, strO, (java.lang.String) null, (java.lang.String) null, iX2, (dev.epro.r0.F4096073349764486348) null, 38);
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

    public static final native java.lang.String k(java.lang.String str);

    public static final dev.epro.r0.Z7022156542152740569 l() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.Security", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        dev.epro.r0.V14323974914327418545 v14323974914327418545 = new dev.epro.r0.V14323974914327418545((byte) 3);
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
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final boolean m(dev.epro.r0.M11181104712105445833 m11181104712105445833) {
        int length = m11181104712105445833.b.length();
        java.util.List list = m11181104712105445833.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dev.epro.r0.F14378331124810887321 f14378331124810887321 = (dev.epro.r0.F14378331124810887321) list.get(i);
                if ((f14378331124810887321.a instanceof dev.epro.r0.J11984637636147625377) && dev.epro.r0.Z15472362586437216226.b(0, length, f14378331124810887321.b, f14378331124810887321.c)) {
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

    public static final native boolean p(java.lang.String str);

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
    public static final dev.epro.r0.S18102156289003884608 q(android.content.res.Resources.Theme r53, android.content.res.Resources r54, android.content.res.XmlResourceParser r55, int r56) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A15222901130456174747.q(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):dev.epro.r0.S18102156289003884608");
    }

    public static final native dev.epro.r0.Q7430090668634766253 r(java.lang.String str);

    public static dev.epro.r0.S790996689653940400 s(java.lang.String str) {
        try {
            return dev.epro.r0.S790996689653940400.j(new dev.epro.r0.J6579077889109668233(new java.io.ByteArrayInputStream(str.getBytes(dev.epro.r0.J6579077889109668233.b))));
        } catch (java.io.IOException unused) {
            dev.epro.r0.W4415201450379021245.c("Parse keyset failed");
            return null;
        }
    }

    public static final native dev.epro.r0.Q7430090668634766253 t(java.lang.String str);

    public static final native dev.epro.r0.Q7430090668634766253 u(java.lang.String str, dev.epro.r0.B5333895829159759522 b5333895829159759522);

    public static void v(dev.epro.r0.M10846389789027735899 m10846389789027735899) {
        dev.epro.r0.S17255966974483065294 s17255966974483065294;
        dev.epro.r0.I9221312866721349709 i9221312866721349709;
        dev.epro.r0.I9221312866721349709 i92213128667213497092;
        do {
            s17255966974483065294 = dev.epro.r0.W5596570651735549214.z;
            i9221312866721349709 = (dev.epro.r0.I9221312866721349709) s17255966974483065294.getValue();
            dev.epro.r0.C560824835210562156 c560824835210562156A = i9221312866721349709.c;
            dev.epro.r0.H6096100481828783755 h6096100481828783755 = (dev.epro.r0.H6096100481828783755) c560824835210562156A.get(m10846389789027735899);
            if (h6096100481828783755 == null) {
                i92213128667213497092 = i9221312866721349709;
            } else {
                java.lang.Object obj = h6096100481828783755.a;
                java.lang.Object obj2 = h6096100481828783755.b;
                dev.epro.r0.B14108412273878533248 b14108412273878533248 = c560824835210562156A.a;
                dev.epro.r0.B14108412273878533248 b14108412273878533248V = b14108412273878533248.v(m10846389789027735899 != null ? m10846389789027735899.hashCode() : 0, 0, m10846389789027735899);
                if (b14108412273878533248 != b14108412273878533248V) {
                    c560824835210562156A = b14108412273878533248V == null ? dev.epro.r0.C560824835210562156.c : new dev.epro.r0.C560824835210562156(b14108412273878533248V, c560824835210562156A.b - 1);
                }
                dev.epro.r0.B14824868959299866349 b14824868959299866349 = dev.epro.r0.B14824868959299866349.g;
                if (obj != b14824868959299866349) {
                    java.lang.Object obj3 = c560824835210562156A.get(obj);
                    obj3.getClass();
                    c560824835210562156A = c560824835210562156A.a(obj, new dev.epro.r0.H6096100481828783755(((dev.epro.r0.H6096100481828783755) obj3).a, obj2));
                }
                if (obj2 != b14824868959299866349) {
                    java.lang.Object obj4 = c560824835210562156A.get(obj2);
                    obj4.getClass();
                    c560824835210562156A = c560824835210562156A.a(obj2, new dev.epro.r0.H6096100481828783755(obj, ((dev.epro.r0.H6096100481828783755) obj4).b));
                }
                java.lang.Object obj5 = obj != b14824868959299866349 ? i9221312866721349709.a : obj2;
                if (obj2 != b14824868959299866349) {
                    obj = i9221312866721349709.b;
                }
                i92213128667213497092 = new dev.epro.r0.I9221312866721349709(obj5, obj, c560824835210562156A);
            }
            if (i9221312866721349709 == i92213128667213497092) {
                return;
            }
        } while (!s17255966974483065294.i(i9221312866721349709, i92213128667213497092));
    }

    public static final native dev.epro.r0.H9594781759364688001 w(java.util.Map map);

    public static final native java.util.LinkedHashMap x(dev.epro.r0.H9594781759364688001 h9594781759364688001);

    public static final dev.epro.r0.Z7022156542152740569 y(int i, dev.epro.r0.M3727281027331139839 m3727281027331139839) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.Context context = (android.content.Context) m3727281027331139839.j(dev.epro.r0.T15795698139970521497.b);
        android.content.res.Resources resources = (android.content.res.Resources) m3727281027331139839.j(dev.epro.r0.T15795698139970521497.c);
        android.content.res.Resources.Theme theme = context.getTheme();
        android.content.res.Configuration configuration = resources.getConfiguration();
        boolean zF = m3727281027331139839.f(configuration) | m3727281027331139839.d(i) | m3727281027331139839.f(resources) | m3727281027331139839.f(theme);
        java.lang.Object objM = m3727281027331139839.M();
        if (zF || objM == dev.epro.r0.O9023047933786425027.a) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            resources.getValue(i, typedValue, true);
            android.content.res.XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            }
            objM = q(theme, resources, xml, typedValue.changingConfigurations).a;
            m3727281027331139839.k0(objM);
        }
        return (dev.epro.r0.Z7022156542152740569) objM;
    }

    public static final java.lang.Object z(dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        dev.epro.r0.O9245300239821758723 o9245300239821758723;
        dev.epro.r0.G8001132634698687269 context = k14749510448791472029.getContext();
        dev.epro.r0.J8045362843799184672.K(context);
        dev.epro.r0.N16152488056535110728 n16152488056535110728H = dev.epro.r0.E18444280280170001567.H(k14749510448791472029);
        dev.epro.r0.N16152488056535110728 n16152488056535110728 = n16152488056535110728H instanceof dev.epro.r0.N16152488056535110728 ? n16152488056535110728H : null;
        dev.epro.r0.O9245300239821758723 o92453002398217587232 = dev.epro.r0.Z3437138737604933638.a;
        dev.epro.r0.O9245300239821758723 o92453002398217587233 = dev.epro.r0.O9245300239821758723.a;
        if (n16152488056535110728 == null) {
            o9245300239821758723 = o92453002398217587233;
        } else {
            dev.epro.r0.D11883231851729262595 d11883231851729262595 = n16152488056535110728.d;
            if (d11883231851729262595.B(context)) {
                n16152488056535110728.f = o92453002398217587233;
                ((dev.epro.r0.H14047115090875094711) n16152488056535110728).c = 1;
                d11883231851729262595.A(context, n16152488056535110728);
            } else {
                dev.epro.r0.R10581505017215614416 r10581505017215614416 = new dev.epro.r0.R10581505017215614416(dev.epro.r0.R10581505017215614416.c);
                dev.epro.r0.G8001132634698687269 g8001132634698687269Plus = context.plus(r10581505017215614416);
                n16152488056535110728.f = o92453002398217587233;
                ((dev.epro.r0.H14047115090875094711) n16152488056535110728).c = 1;
                d11883231851729262595.A(g8001132634698687269Plus, n16152488056535110728);
                if (r10581505017215614416.b) {
                    dev.epro.r0.I17129535152515035455 i17129535152515035455A = dev.epro.r0.P13752028179861838617.a();
                    dev.epro.r0.N11678082982039175888 n11678082982039175888 = i17129535152515035455A.e;
                    if (!(n11678082982039175888 != null ? n11678082982039175888.isEmpty() : true)) {
                        if (i17129535152515035455A.c >= 4294967296L) {
                            n16152488056535110728.f = o92453002398217587233;
                            ((dev.epro.r0.H14047115090875094711) n16152488056535110728).c = 1;
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
                    o9245300239821758723 = o92453002398217587233;
                }
            }
            o9245300239821758723 = o92453002398217587232;
        }
        return o9245300239821758723 == o92453002398217587232 ? o9245300239821758723 : o92453002398217587233;
    }
}
