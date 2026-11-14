package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C468629748621011703 {
    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(526);
    }

    public static int A(android.os.Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static android.content.Intent B(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", C(str, str2, map));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static android.net.Uri C(java.lang.String str, java.lang.String str2, java.util.Map map) {
        android.net.Uri.Builder builderAppendQueryParameter = new android.net.Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry.getKey();
            if (!str3.equals("id") && !str3.equals("referrer")) {
                builderAppendQueryParameter.appendQueryParameter(str3, (java.lang.String) entry.getValue());
            }
        }
        return builderAppendQueryParameter.build();
    }

    public static void D(android.os.Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void a(final java.lang.String str, final dev.epro.r0.F4096073349764486348 f4096073349764486348, final dev.epro.r0.I1722681268793429505 i1722681268793429505, boolean z, final dev.epro.r0.S16571168858015125610 s16571168858015125610, final dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.H14763425654620554740 h14763425654620554740, dev.epro.r0.W17015830374102496917 w17015830374102496917, dev.epro.r0.O12013896688000893502 o12013896688000893502, final boolean z2, int i, int i2, dev.epro.r0.I5573661370475160895 i5573661370475160895, final dev.epro.r0.M15706644554150934798 m15706644554150934798, dev.epro.r0.M3727281027331139839 m3727281027331139839, final int i3) {
        final boolean z3;
        final dev.epro.r0.H14763425654620554740 h147634256546205547402;
        final dev.epro.r0.W17015830374102496917 w170158303741024969172;
        final dev.epro.r0.O12013896688000893502 o120138966880008935022;
        final int i4;
        final int i5;
        final dev.epro.r0.I5573661370475160895 i55736613704751608952;
        dev.epro.r0.H14763425654620554740 h147634256546205547403;
        dev.epro.r0.W17015830374102496917 w170158303741024969173;
        dev.epro.r0.O12013896688000893502 o120138966880008935023;
        int i6;
        int i7;
        dev.epro.r0.I5573661370475160895 i5573661370475160895B;
        m3727281027331139839.b0(-154966360);
        int i8 = i3 | (m3727281027331139839.f(str) ? 4 : 2) | (m3727281027331139839.h(f4096073349764486348) ? 32 : 16) | (m3727281027331139839.f(i1722681268793429505) ? 256 : 128) | 27648 | (m3727281027331139839.f(s16571168858015125610) ? 131072 : 65536) | 907542528;
        boolean z4 = true;
        if (m3727281027331139839.R(i8 & 1, ((306783379 & i8) == 306783378 && ((22 | (m3727281027331139839.f(m15706644554150934798) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            m3727281027331139839.W();
            if ((i3 & 1) == 0 || m3727281027331139839.z()) {
                dev.epro.r0.H14763425654620554740 h147634256546205547404 = dev.epro.r0.P2382941533350862833.y;
                h147634256546205547403 = h147634256546205547404;
                w170158303741024969173 = dev.epro.r0.W17015830374102496917.g;
                o120138966880008935023 = dev.epro.r0.O12013896688000893502.c;
                i6 = z2 ? 1 : Integer.MAX_VALUE;
                i7 = 1;
                i5573661370475160895B = dev.epro.r0.N13258083306148085703.b(dev.epro.r0.M2066880349381062048.f, m3727281027331139839);
            } else {
                m3727281027331139839.U();
                z4 = z;
                h147634256546205547403 = h14763425654620554740;
                w170158303741024969173 = w17015830374102496917;
                o120138966880008935023 = o12013896688000893502;
                i6 = i;
                i7 = i2;
                i5573661370475160895B = i5573661370475160895;
            }
            m3727281027331139839.r();
            m3727281027331139839.a0(488210003);
            java.lang.Object objM = m3727281027331139839.M();
            if (objM == dev.epro.r0.O9023047933786425027.a) {
                objM = dev.epro.r0.L11610354117192841236.m(m3727281027331139839);
            }
            dev.epro.r0.S9385204271696540760 s9385204271696540760 = (dev.epro.r0.S9385204271696540760) objM;
            m3727281027331139839.q(false);
            m3727281027331139839.a0(1401227490);
            long jB = s16571168858015125610.b();
            if (jB == 16) {
                jB = m15706644554150934798.d(z4, false, ((java.lang.Boolean) dev.epro.r0.V933048422416352811.h(s9385204271696540760, m3727281027331139839, 0).getValue()).booleanValue());
            }
            long j = jB;
            m3727281027331139839.q(false);
            dev.epro.r0.D1286559660607336098.a(dev.epro.r0.L9437793152864500530.a.a(m15706644554150934798.k), dev.epro.r0.S10823041268949770285.T(1459735400, new dev.epro.r0.J15832103478856926005(i1722681268793429505, m15706644554150934798, str, f4096073349764486348, z4, s16571168858015125610.d(new dev.epro.r0.S16571168858015125610(j, 0L, (dev.epro.r0.R6694982557896913324) null, 0L, 0, 0, 0L, 16777214)), w170158303741024969173, o120138966880008935023, z2, i6, i7, h147634256546205547403, s9385204271696540760, l12639328004344855510, i5573661370475160895B), m3727281027331139839), m3727281027331139839, 56);
            z3 = z4;
            w170158303741024969172 = w170158303741024969173;
            o120138966880008935022 = o120138966880008935023;
            i4 = i6;
            i5 = i7;
            h147634256546205547402 = h147634256546205547403;
            i55736613704751608952 = i5573661370475160895B;
        } else {
            m3727281027331139839.U();
            z3 = z;
            h147634256546205547402 = h14763425654620554740;
            w170158303741024969172 = w17015830374102496917;
            o120138966880008935022 = o12013896688000893502;
            i4 = i;
            i5 = i2;
            i55736613704751608952 = i5573661370475160895;
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.L12639328004344855510(str, f4096073349764486348, i1722681268793429505, z3, s16571168858015125610, l12639328004344855510, h147634256546205547402, w170158303741024969172, o120138966880008935022, z2, i4, i5, i55736613704751608952, m15706644554150934798, i3) { // from class: dev.epro.r0.E4492470697927889032
                public final /* synthetic */ java.lang.String a;
                public final /* synthetic */ dev.epro.r0.F4096073349764486348 b;
                public final /* synthetic */ dev.epro.r0.I1722681268793429505 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ dev.epro.r0.S16571168858015125610 e;
                public final /* synthetic */ dev.epro.r0.L12639328004344855510 f;
                public final /* synthetic */ dev.epro.r0.H14763425654620554740 g;
                public final /* synthetic */ dev.epro.r0.W17015830374102496917 h;
                public final /* synthetic */ dev.epro.r0.O12013896688000893502 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ int k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ dev.epro.r0.I5573661370475160895 m;
                public final /* synthetic */ dev.epro.r0.M15706644554150934798 n;

                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int iP = dev.epro.r0.V16504496955554646429.p(12582913);
                    java.lang.String str2 = this.a;
                    dev.epro.r0.F4096073349764486348 f40960733497644863482 = this.b;
                    dev.epro.r0.I1722681268793429505 i17226812687934295052 = this.c;
                    boolean z5 = this.d;
                    dev.epro.r0.S16571168858015125610 s165711688580151256102 = this.e;
                    dev.epro.r0.L12639328004344855510 l126393280043448555102 = this.f;
                    dev.epro.r0.H14763425654620554740 h147634256546205547405 = this.g;
                    dev.epro.r0.W17015830374102496917 w170158303741024969174 = this.h;
                    dev.epro.r0.O12013896688000893502 o120138966880008935024 = this.i;
                    boolean z6 = this.j;
                    int i9 = this.k;
                    boolean z7 = this.l;
                    dev.epro.r0.I5573661370475160895 i55736613704751608953 = this.m;
                    dev.epro.r0.M15706644554150934798 m157066445541509347982 = this.n;
                    dev.epro.r0.C468629748621011703.a(str2, f40960733497644863482, i17226812687934295052, z5, s165711688580151256102, l126393280043448555102, h147634256546205547405, w170158303741024969174, o120138966880008935024, z6, i9, z7 ? 1 : 0, i55736613704751608953, m157066445541509347982, (dev.epro.r0.M3727281027331139839) obj, iP);
                    return dev.epro.r0.O9245300239821758723.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x062b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(dev.epro.r0.L12639328004344855510 r41, dev.epro.r0.L12639328004344855510 r42, dev.epro.r0.J12078565427869724451 r43, dev.epro.r0.L12639328004344855510 r44, dev.epro.r0.L12639328004344855510 r45, dev.epro.r0.L12639328004344855510 r46, dev.epro.r0.L12639328004344855510 r47, boolean r48, dev.epro.r0.O8448855611469183895 r49, dev.epro.r0.V1146169337721842405 r50, dev.epro.r0.T15443218846549482730 r51, dev.epro.r0.L12639328004344855510 r52, dev.epro.r0.T1241271073913685060 r53, dev.epro.r0.M3727281027331139839 r54, int r55, int r56) {
        /*
            Method dump skipped, instruction units count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C468629748621011703.b(dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.J12078565427869724451, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, dev.epro.r0.L12639328004344855510, boolean, dev.epro.r0.O8448855611469183895, dev.epro.r0.V1146169337721842405, dev.epro.r0.T15443218846549482730, dev.epro.r0.L12639328004344855510, dev.epro.r0.T1241271073913685060, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void c(java.util.List list, java.util.List list2, long j, long j2, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i);

    public static int d(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    public static java.lang.String e(int i, java.lang.String str) {
        return dev.epro.r0.G6547577305291411977.n(i, str);
    }

    public static final native dev.epro.r0.B1061516154492673368 f(java.util.List list, float f, float f2, float f3);

    public static final java.lang.String g(java.lang.Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final dev.epro.r0.F18341548724281518495 h(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(2131296819);
            dev.epro.r0.F18341548724281518495 f18341548724281518495 = tag instanceof dev.epro.r0.F18341548724281518495 ? (dev.epro.r0.F18341548724281518495) tag : null;
            if (f18341548724281518495 != null) {
                return f18341548724281518495;
            }
            java.lang.Object objG = dev.epro.r0.P13747563277035175218.g(view);
            view = objG instanceof android.view.View ? (android.view.View) objG : null;
        }
        return null;
    }

    public static final java.lang.Object i(dev.epro.r0.E10198359844879945462 e10198359844879945462, dev.epro.r0.P14992748401341948828 p14992748401341948828) {
        java.lang.Object objG = e10198359844879945462.a.g(p14992748401341948828);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final dev.epro.r0.W1972671267364756056 j(java.lang.Object[] objArr, dev.epro.r0.Z8888095354249304160 z8888095354249304160, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        z8888095354249304160.getClass();
        return (dev.epro.r0.W1972671267364756056) l(objArrCopyOf, new dev.epro.r0.V10300877997588547986(new dev.epro.r0.Q15027034467569330017(z8888095354249304160, (byte) 14), new dev.epro.r0.H8734584053421516944(z8888095354249304160, (byte) 20), (byte) 20), b13729205492206812220, m3727281027331139839, ((i << 3) & 7168) | 384);
    }

    public static final java.lang.Object k(java.lang.Object[] objArr, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i) {
        return l(java.util.Arrays.copyOf(objArr, objArr.length), dev.epro.r0.I3887072968740112330.a0, b13729205492206812220, m3727281027331139839, ((i << 6) & 7168) | 384);
    }

    public static final java.lang.Object l(java.lang.Object[] objArr, dev.epro.r0.Z8888095354249304160 z8888095354249304160, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i) {
        java.lang.Object[] objArr2;
        dev.epro.r0.Z8888095354249304160 z88880953542493041602;
        java.lang.Object obj;
        java.lang.Object objE;
        long j = m3727281027331139839.T;
        dev.epro.r0.M9216324016624295870.q(36);
        java.lang.String string = java.lang.Long.toString(j, 36);
        string.getClass();
        z8888095354249304160.getClass();
        dev.epro.r0.P14826151584039718691 p14826151584039718691 = (dev.epro.r0.P14826151584039718691) m3727281027331139839.j(dev.epro.r0.T1414416723643307303.a);
        java.lang.Object objM = m3727281027331139839.M();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.O9023047933786425027.a;
        if (objM == e17149812035295265804) {
            java.lang.Object objF = (p14826151584039718691 == null || (objE = p14826151584039718691.e(string)) == null) ? null : z8888095354249304160.f(objE);
            if (objF == null) {
                objF = b13729205492206812220.invoke();
            }
            objArr2 = objArr;
            z88880953542493041602 = z8888095354249304160;
            dev.epro.r0.E13808449687169887804 e13808449687169887804 = new dev.epro.r0.E13808449687169887804(z88880953542493041602, p14826151584039718691, string, objF, objArr2);
            m3727281027331139839.k0(e13808449687169887804);
            objM = e13808449687169887804;
        } else {
            objArr2 = objArr;
            z88880953542493041602 = z8888095354249304160;
        }
        dev.epro.r0.E13808449687169887804 e138084496871698878042 = (dev.epro.r0.E13808449687169887804) objM;
        java.lang.Object objInvoke = java.util.Arrays.equals(objArr2, e138084496871698878042.e) ? e138084496871698878042.d : null;
        if (objInvoke == null) {
            objInvoke = b13729205492206812220.invoke();
        }
        boolean zH = m3727281027331139839.h(e138084496871698878042) | ((((i & 112) ^ 48) > 32 && m3727281027331139839.h(z88880953542493041602)) || (i & 48) == 32) | m3727281027331139839.h(p14826151584039718691) | m3727281027331139839.f(string) | m3727281027331139839.h(objInvoke) | m3727281027331139839.h(objArr2);
        java.lang.Object objM2 = m3727281027331139839.M();
        if (zH || objM2 == e17149812035295265804) {
            java.lang.Object[] objArr3 = objArr2;
            obj = objInvoke;
            dev.epro.r0.H5218391517692938989 h5218391517692938989 = new dev.epro.r0.H5218391517692938989(e138084496871698878042, z88880953542493041602, p14826151584039718691, string, obj, objArr3, (byte) 2);
            m3727281027331139839.k0(h5218391517692938989);
            objM2 = h5218391517692938989;
        } else {
            obj = objInvoke;
        }
        dev.epro.r0.Q13169198992966610970.B((dev.epro.r0.B13729205492206812220) objM2, m3727281027331139839);
        return obj;
    }

    public static final java.lang.Object m(java.lang.Object[] objArr, dev.epro.r0.Z8888095354249304160 z8888095354249304160, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i) {
        return l(java.util.Arrays.copyOf(objArr, objArr.length), z8888095354249304160, b13729205492206812220, m3727281027331139839, ((i << 3) & 7168) | (i & 112) | 384);
    }

    public static final native java.lang.String n(java.lang.String str);

    public static final native void o(dev.epro.r0.L13135072960070674001 l13135072960070674001, dev.epro.r0.H9594781759364688001 h9594781759364688001, boolean z);

    public static final native int p(dev.epro.r0.X7961873132089763176 x7961873132089763176);

    public static final native java.lang.String q(int i, java.lang.String str, java.lang.String str2);

    public static final native dev.epro.r0.Q7430090668634766253 r(dev.epro.r0.Q7430090668634766253 q7430090668634766253, dev.epro.r0.Q7430090668634766253 q74300906686347662532);

    public static final native dev.epro.r0.Q7430090668634766253 s(dev.epro.r0.Q7430090668634766253 q7430090668634766253);

    public static final native dev.epro.r0.Q7430090668634766253 t(dev.epro.r0.Q7430090668634766253 q7430090668634766253, java.lang.String str);

    public static void u(android.os.Parcel parcel, int i, android.os.Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iA = A(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        D(parcel, iA);
    }

    public static void v(android.os.Parcel parcel, java.lang.String str, int i) {
        if (str == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeString(str);
        D(parcel, iA);
    }

    public static void w(android.os.Parcel parcel, int i, android.os.Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iA = A(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (android.os.Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        D(parcel, iA);
    }

    public static void x(android.os.Parcel parcel, int i, java.util.List list) {
        if (list == null) {
            return;
        }
        int iA = A(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            android.os.Parcelable parcelable = (android.os.Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        D(parcel, iA);
    }

    public static android.content.Intent y(java.lang.String str, java.lang.String str2, java.util.Map map) {
        android.net.Uri.Builder builderAppendQueryParameter = new android.net.Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    builderAppendQueryParameter.appendQueryParameter(str3, (java.lang.String) entry.getValue());
                }
            }
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", builderAppendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static void z(android.os.Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }
}
