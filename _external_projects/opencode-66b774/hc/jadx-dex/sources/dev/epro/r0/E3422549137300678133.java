package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E3422549137300678133 {
    public static dev.epro.r0.M6051904797092768348 a;
    public static final float[] b;
    public static final dev.epro.r0.Y4261039727803185691 c;
    public static final dev.epro.r0.V10933700885381486763 d;
    public static final dev.epro.r0.Y4261039727803185691 e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final dev.epro.r0.F6942723054099263096 i;
    public static final dev.epro.r0.P10283164515565247229 j;
    public static final dev.epro.r0.P10283164515565247229 k;
    public static final dev.epro.r0.P10283164515565247229 l;
    public static final java.lang.Object m;
    public static final dev.epro.r0.Z14997871575210439922 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static dev.epro.r0.Z7022156542152740569 f220o;

    public static final native void A(dev.epro.r0.R6894569913291645384 r6894569913291645384, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void B(dev.epro.r0.A13182230205880306765 a13182230205880306765, dev.epro.r0.P5204863746366580363 p5204863746366580363, dev.epro.r0.W5797197595347441198 w5797197595347441198, boolean z, dev.epro.r0.W1972671267364756056 w1972671267364756056, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        dev.epro.r0.A13182230205880306765 a131822302058803067652;
        int i3;
        m3727281027331139839.b0(-1413720282);
        if ((i2 & 6) == 0) {
            a131822302058803067652 = a13182230205880306765;
            i3 = (m3727281027331139839.f(a131822302058803067652) ? 4 : 2) | i2;
        } else {
            a131822302058803067652 = a13182230205880306765;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? m3727281027331139839.f(p5204863746366580363) : m3727281027331139839.h(p5204863746366580363) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h((java.lang.Object) null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.h(w5797197595347441198) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.g(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.f(w1972671267364756056) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 1048576 : 524288;
        }
        if (m3727281027331139839.R(i3 & 1, (599187 & i3) != 599186)) {
            java.lang.String strQ = dev.epro.r0.T1335862270807194835.q(2131822340, m3727281027331139839);
            boolean zH = ((i3 & 112) == 32 || ((i3 & 64) != 0 && m3727281027331139839.h(p5204863746366580363))) | ((i3 & 896) == 256) | m3727281027331139839.h(w5797197595347441198) | ((458752 & i3) == 131072);
            java.lang.Object objM = m3727281027331139839.M();
            if (zH || objM == dev.epro.r0.O9023047933786425027.a) {
                objM = new dev.epro.r0.A7716877927750495196((java.lang.Object) p5204863746366580363, (java.lang.Object) w5797197595347441198, w1972671267364756056, (byte) 4);
                m3727281027331139839.k0(objM);
            }
            dev.epro.r0.W10645948712581465792.a(a131822302058803067652, (dev.epro.r0.B13729205492206812220) objM, new dev.epro.r0.R6081921892807856809(z), dev.epro.r0.S10823041268949770285.T(-1287705660, new dev.epro.r0.U8464449497680896203(strQ, t15443218846549482730, (byte) 0), m3727281027331139839), m3727281027331139839, (i3 & 14) | 3072, 0);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.W11516564711856301633(a13182230205880306765, p5204863746366580363, w5797197595347441198, z, w1972671267364756056, t15443218846549482730, i2);
        }
    }

    public static final native void C(java.lang.String str, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void D(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void E(dev.epro.r0.Z2479813363168291834 z2479813363168291834, boolean z, java.lang.String str, java.lang.String str2, boolean z2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void F(java.util.List list, java.lang.String str, dev.epro.r0.M310145413173941529 m310145413173941529, boolean z, java.util.Set set, java.lang.Integer num, boolean z2, boolean z3, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.F4096073349764486348 f40960733497644863483, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.F4096073349764486348 f40960733497644863484, dev.epro.r0.B13729205492206812220 b137292054922068122204, dev.epro.r0.B13729205492206812220 b137292054922068122205, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void G(dev.epro.r0.M310145413173941529 m310145413173941529, boolean z, java.lang.String str, java.util.LinkedHashMap linkedHashMap, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void H(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void I(dev.epro.r0.P5204863746366580363 p5204863746366580363, dev.epro.r0.W1972671267364756056 w1972671267364756056, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(1873232064);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? m3727281027331139839.f(p5204863746366580363) : m3727281027331139839.h(p5204863746366580363) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.f(w1972671267364756056) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m3727281027331139839.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 131072 : 65536;
        }
        if (m3727281027331139839.R(i3 & 1, (74899 & i3) != 74898)) {
            java.lang.Object objM = m3727281027331139839.M();
            if (objM == dev.epro.r0.O9023047933786425027.a) {
                objM = dev.epro.r0.Q13169198992966610970.R(m3727281027331139839);
                m3727281027331139839.k0(objM);
            }
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) objM;
            dev.epro.r0.I1722681268793429505 i1722681268793429505E = dev.epro.r0.B5998207562248239613.E(dev.epro.r0.G16660188620551127941.C(dev.epro.r0.T7055906184043387232.b(dev.epro.r0.T7055906184043387232.b(i1722681268793429505, p5204863746366580363, new dev.epro.r0.A2764358890551697978(p5204863746366580363, (byte) 0)), p5204863746366580363, new dev.epro.r0.A2764358890551697978(p5204863746366580363, (byte) 1)).Q0(new dev.epro.r0.S3426947254695259356(new dev.epro.r0.C2148711509933735908(dev.epro.r0.T1335862270807194835.q(2131822341, m3727281027331139839), (java.lang.Object) w5797197595347441198, (java.lang.Object) p5204863746366580363, (byte) 7))), new dev.epro.r0.J7403353095371830496(w5797197595347441198, p5204863746366580363, (byte) 16)), new dev.epro.r0.J3772078759892425500(p5204863746366580363, w1972671267364756056, (byte) 3));
            dev.epro.r0.A10838822263452390785 a10838822263452390785C = dev.epro.r0.Z6714950837425363575.c(dev.epro.r0.T13350664027331345869.b, false);
            int iA = dev.epro.r0.E12775674050813925581.A(m3727281027331139839);
            dev.epro.r0.P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            dev.epro.r0.I1722681268793429505 i1722681268793429505N = dev.epro.r0.V12319504402545346730.N(m3727281027331139839, i1722681268793429505E);
            dev.epro.r0.X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(dev.epro.r0.H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.i, m3727281027331139839, a10838822263452390785C);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            dev.epro.r0.X4712621039624176170 x4712621039624176170 = dev.epro.r0.P2382941533350862833.j;
            if (m3727281027331139839.S || !dev.epro.r0.S10823041268949770285.t(m3727281027331139839.M(), java.lang.Integer.valueOf(iA))) {
                dev.epro.r0.L11610354117192841236.t(iA, m3727281027331139839, iA, x4712621039624176170);
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            dev.epro.r0.G11450220448113054352.m((i3 >> 15) & 14, t15443218846549482730, m3727281027331139839, true);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.G18133890210511251283(p5204863746366580363, w1972671267364756056, i1722681268793429505, t15443218846549482730, i2);
        }
    }

    public static final native dev.epro.r0.Y10647802459566096560 J(int i2, java.lang.String str);

    public static final boolean K(dev.epro.r0.I4622425004907418771 i4622425004907418771, int i2, dev.epro.r0.A4783298371339261043 a4783298371339261043, boolean z) {
        boolean z2;
        synchronized (m) {
            try {
                int i3 = i4622425004907418771.d;
                if (i3 == i2) {
                    i4622425004907418771.c = a4783298371339261043;
                    z2 = true;
                    if (z) {
                        i4622425004907418771.e++;
                    }
                    i4622425004907418771.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.X11333337577019102532 */
    public static final java.lang.Object L(dev.epro.r0.D16915945238461757356 d16915945238461757356, dev.epro.r0.R14062301455140331524 r14062301455140331524) throws java.lang.Throwable {
        try {
            if (d16915945238461757356.isDone()) {
                return dev.epro.r0.P16078978668947144669.e(d16915945238461757356);
            }
            dev.epro.r0.H7219028874700587498 h7219028874700587498 = new dev.epro.r0.H7219028874700587498(1, dev.epro.r0.E18444280280170001567.H(r14062301455140331524));
            d16915945238461757356.a(new dev.epro.r0.M14623918774394739022(d16915945238461757356, h7219028874700587498, (byte) 1), dev.epro.r0.U16739955047530304491.a);
            h7219028874700587498.v(new dev.epro.r0.J3227772737003951788(d16915945238461757356, (byte) 12));
            return h7219028874700587498.r();
        } catch (java.util.concurrent.ExecutionException e2) {
            java.lang.Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            dev.epro.r0.X11333337577019102532 x11333337577019102532 = new dev.epro.r0.X11333337577019102532();
            dev.epro.r0.S10823041268949770285.Y(x11333337577019102532, dev.epro.r0.S10823041268949770285.class.getName());
            throw x11333337577019102532;
        }
    }

    public static void M(int i2, java.lang.Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                dev.epro.r0.Z3383101362411723454.k(dev.epro.r0.G6547577305291411977.n(i3, "at index "));
                return;
            }
        }
    }

    public static final dev.epro.r0.Z13251062865217617579 N(dev.epro.r0.Z13251062865217617579 z13251062865217617579) {
        dev.epro.r0.Z13251062865217617579 z13251062865217617579C = z13251062865217617579.c();
        int iB = z13251062865217617579C.b();
        for (int i2 = 0; i2 < iB; i2++) {
            z13251062865217617579C.e(i2, z13251062865217617579.a(i2));
        }
        return z13251062865217617579C;
    }

    public static final native long P(long j2, java.util.TimeZone timeZone);

    public static final native long Q(long j2, java.util.TimeZone timeZone);

    public static final long R(float f2, int i2, long j2, boolean z) {
        int i3 = ((z || i2 == 2 || i2 == 4 || i2 == 5) && dev.epro.r0.I16980768508151520658.e(j2)) ? dev.epro.r0.I16980768508151520658.i(j2) : Integer.MAX_VALUE;
        if (dev.epro.r0.I16980768508151520658.k(j2) != i3) {
            i3 = dev.epro.r0.W7808703833045379622.q(dev.epro.r0.T13998044911588922055.d(f2), dev.epro.r0.I16980768508151520658.k(j2), i3);
        }
        return dev.epro.r0.C12265524002282074474.R(0, i3, 0, dev.epro.r0.I16980768508151520658.h(j2));
    }

    public static final dev.epro.r0.I4622425004907418771 S(dev.epro.r0.R5670552972627103399 r5670552972627103399) {
        dev.epro.r0.I4622425004907418771 i4622425004907418771 = r5670552972627103399.a;
        i4622425004907418771.getClass();
        return dev.epro.r0.D459204867321966484.s(i4622425004907418771, r5670552972627103399);
    }

    public static final int T(dev.epro.r0.R5670552972627103399 r5670552972627103399) {
        dev.epro.r0.I4622425004907418771 i4622425004907418771 = r5670552972627103399.a;
        i4622425004907418771.getClass();
        return dev.epro.r0.D459204867321966484.f(i4622425004907418771).e;
    }

    public static final native boolean V(dev.epro.r0.Z12230432157744414222 z12230432157744414222, dev.epro.r0.Z12230432157744414222 z122304321577444142222);

    public static final boolean W(dev.epro.r0.R5670552972627103399 r5670552972627103399, dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        int i2;
        dev.epro.r0.A4783298371339261043 a4783298371339261043;
        java.lang.Object objInvoke;
        dev.epro.r0.M4722199849958580248 m4722199849958580248H;
        boolean zK;
        do {
            synchronized (m) {
                dev.epro.r0.I4622425004907418771 i4622425004907418771 = r5670552972627103399.a;
                i4622425004907418771.getClass();
                dev.epro.r0.I4622425004907418771 i4622425004907418771F = dev.epro.r0.D459204867321966484.f(i4622425004907418771);
                i2 = i4622425004907418771F.d;
                a4783298371339261043 = i4622425004907418771F.c;
            }
            a4783298371339261043.getClass();
            dev.epro.r0.J15049672055732829618 j15049672055732829618J = a4783298371339261043.j();
            objInvoke = f4096073349764486348.invoke(j15049672055732829618J);
            dev.epro.r0.A4783298371339261043 a4783298371339261043C = j15049672055732829618J.c();
            if (dev.epro.r0.S10823041268949770285.t(a4783298371339261043C, a4783298371339261043)) {
                break;
            }
            dev.epro.r0.I4622425004907418771 i46224250049074187712 = r5670552972627103399.a;
            i46224250049074187712.getClass();
            synchronized (dev.epro.r0.D459204867321966484.c) {
                m4722199849958580248H = dev.epro.r0.D459204867321966484.h();
                zK = K(dev.epro.r0.D459204867321966484.w(i46224250049074187712, r5670552972627103399, m4722199849958580248H), i2, a4783298371339261043C, true);
            }
            dev.epro.r0.D459204867321966484.l(m4722199849958580248H, r5670552972627103399);
        } while (!zK);
        return ((java.lang.Boolean) objInvoke).booleanValue();
    }

    public static final native dev.epro.r0.G13897809556106331572 X(dev.epro.r0.Z12230432157744414222 z12230432157744414222);

    public static dev.epro.r0.O2957401531134925886 Y(android.content.res.XmlResourceParser xmlResourceParser, android.content.res.Resources resources) throws java.lang.Throwable {
        int next;
        int i2;
        int i3;
        int i4;
        android.content.res.TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            d0(xmlResourceParser);
            return null;
        }
        android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), dev.epro.r0.G6619020464718317066.b);
        int i5 = 0;
        java.lang.String string = typedArrayObtainAttributes.getString(0);
        java.lang.String string2 = typedArrayObtainAttributes.getString(5);
        java.lang.String string3 = typedArrayObtainAttributes.getString(6);
        java.lang.String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i6 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        java.lang.String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        android.content.res.TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), dev.epro.r0.G6619020464718317066.c);
                        int i7 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        java.lang.String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i9 = typedArrayObtainAttributes2.getInt(i8, 0);
                        int i10 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i10, 0);
                        java.lang.String string7 = typedArrayObtainAttributes2.getString(i10);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            d0(xmlResourceParser);
                        }
                        arrayList.add(new dev.epro.r0.T13158771825442419349(i7, i9, resourceId2, string7, string6, z));
                    } else {
                        d0(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new dev.epro.r0.L933758655888641216((dev.epro.r0.T13158771825442419349[]) arrayList.toArray(new dev.epro.r0.T13158771825442419349[0]));
        }
        java.util.List listB0 = b0(resources, resourceId);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlResourceParser.next() != i6) {
            if (xmlResourceParser.getEventType() == i2) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    android.content.res.TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlResourceParser), dev.epro.r0.G6619020464718317066.d);
                    try {
                        java.lang.String string8 = typedArrayObtainAttributes3.getString(i5);
                        java.lang.String string9 = typedArrayObtainAttributes3.getString(1);
                        i4 = integer;
                        java.lang.String string10 = typedArrayObtainAttributes3.getString(i2);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new org.xmlpull.v1.XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i6) {
                            d0(xmlResourceParser);
                        }
                        try {
                            typedArray = typedArrayObtainAttributes3;
                            i3 = i6;
                            try {
                                dev.epro.r0.O5645052741531709506 o5645052741531709506 = new dev.epro.r0.O5645052741531709506(string, string2, string8, listB0, string9, string10);
                                typedArray.recycle();
                                arrayList2.add(o5645052741531709506);
                            } catch (java.lang.Throwable th) {
                                th = th;
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            typedArray = typedArrayObtainAttributes3;
                        }
                        th = th;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                i3 = i6;
                i4 = integer;
                d0(xmlResourceParser);
                i6 = i3;
                integer = i4;
                i2 = 2;
                i5 = 0;
            }
        }
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new dev.epro.r0.Z16564692815490596738(arrayList2, i11, integer2, string5);
        }
        if (string3 == null) {
            dev.epro.r0.S10973172697741180971.j("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new dev.epro.r0.O5645052741531709506(string, string2, string3, listB0, (java.lang.String) null, (java.lang.String) null));
        if (string4 != null) {
            arrayList2.add(new dev.epro.r0.O5645052741531709506(string, string2, string4, listB0, (java.lang.String) null, (java.lang.String) null));
        }
        return new dev.epro.r0.Z16564692815490596738(arrayList2, i11, integer2, string5);
    }

    public static final native void a(dev.epro.r0.G17854281415623469737 g17854281415623469737, float f2, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native dev.epro.r0.U1779235441444412014 a0(java.lang.String str);

    public static java.util.List b0(android.content.res.Resources resources, int i2) {
        if (i2 == 0) {
            return java.util.Collections.EMPTY_LIST;
        }
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return java.util.Collections.EMPTY_LIST;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        java.lang.String[] stringArray = resources.getStringArray(resourceId);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.String str : stringArray) {
                            arrayList2.add(android.util.Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                java.lang.String[] stringArray2 = resources.getStringArray(i2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str2 : stringArray2) {
                    arrayList3.add(android.util.Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void c(dev.epro.r0.A13182230205880306765 a13182230205880306765, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.P5204863746366580363 p5204863746366580363, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.T15443218846549482730 t154432188465494827302, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        dev.epro.r0.A13182230205880306765 a131822302058803067652;
        int i3;
        dev.epro.r0.W1972671267364756056 w1972671267364756056;
        boolean z;
        dev.epro.r0.M3727281027331139839 m37272810273311398392 = m3727281027331139839;
        m37272810273311398392.b0(-1221877520);
        if ((i2 & 6) == 0) {
            a131822302058803067652 = a13182230205880306765;
            i3 = (m37272810273311398392.f(a131822302058803067652) ? 4 : 2) | i2;
        } else {
            a131822302058803067652 = a13182230205880306765;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m37272810273311398392.h(t15443218846549482730) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? m37272810273311398392.f(p5204863746366580363) : m37272810273311398392.h(p5204863746366580363) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= m37272810273311398392.f(i1722681268793429505) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= m37272810273311398392.h((java.lang.Object) null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= m37272810273311398392.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= m37272810273311398392.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= m37272810273311398392.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= m37272810273311398392.h(t154432188465494827302) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (m37272810273311398392.R(i4 & 1, (38347923 & i4) != 38347922)) {
            java.lang.Object objM = m37272810273311398392.M();
            java.lang.Object obj = dev.epro.r0.O9023047933786425027.a;
            if (objM == obj) {
                objM = dev.epro.r0.Q13169198992966610970.R(m37272810273311398392);
                m37272810273311398392.k0(objM);
            }
            dev.epro.r0.W5797197595347441198 w5797197595347441198 = (dev.epro.r0.W5797197595347441198) objM;
            java.lang.Object objM2 = m37272810273311398392.M();
            if (objM2 == obj) {
                objM2 = dev.epro.r0.V4416135141588678913.t(java.lang.Boolean.FALSE);
                m37272810273311398392.k0(objM2);
            }
            dev.epro.r0.W1972671267364756056 w19726712673647560562 = (dev.epro.r0.W1972671267364756056) objM2;
            dev.epro.r0.A10838822263452390785 a10838822263452390785C = dev.epro.r0.Z6714950837425363575.c(dev.epro.r0.T13350664027331345869.b, false);
            int iA = dev.epro.r0.E12775674050813925581.A(m37272810273311398392);
            dev.epro.r0.P3648740535677465818 p3648740535677465818L = m37272810273311398392.l();
            dev.epro.r0.I1722681268793429505 i1722681268793429505N = dev.epro.r0.V12319504402545346730.N(m37272810273311398392, dev.epro.r0.V10993962107938880611.a);
            dev.epro.r0.X4572652335386916693.Po.getClass();
            m37272810273311398392.d0();
            if (m37272810273311398392.S) {
                m37272810273311398392.k(dev.epro.r0.H11725168162114556860.S);
            } else {
                m37272810273311398392.n0();
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.i, m37272810273311398392, a10838822263452390785C);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.h, m37272810273311398392, p3648740535677465818L);
            dev.epro.r0.X4712621039624176170 x4712621039624176170 = dev.epro.r0.P2382941533350862833.j;
            if (m37272810273311398392.S || !dev.epro.r0.S10823041268949770285.t(m37272810273311398392.M(), java.lang.Integer.valueOf(iA))) {
                dev.epro.r0.L11610354117192841236.t(iA, m37272810273311398392, iA, x4712621039624176170);
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.g, m37272810273311398392, i1722681268793429505N);
            if (p5204863746366580363.b()) {
                m37272810273311398392.a0(-1891243071);
                B(a131822302058803067652, p5204863746366580363, w5797197595347441198, false, w19726712673647560562, t15443218846549482730, m37272810273311398392, ((i4 << 15) & 3670016) | (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896));
                w1972671267364756056 = w19726712673647560562;
                m37272810273311398392 = m37272810273311398392;
                z = false;
                m37272810273311398392.q(false);
            } else {
                w1972671267364756056 = w19726712673647560562;
                z = false;
                m37272810273311398392.a0(-1890863476);
                m37272810273311398392.q(false);
            }
            I(p5204863746366580363, w1972671267364756056, i1722681268793429505, t154432188465494827302, m37272810273311398392, ((i4 >> 18) & 14) | 384 | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | (57344 & (i4 << 3)) | ((i4 >> 9) & 458752));
            m37272810273311398392.q(true);
            boolean z2 = ((i4 & 896) == 256 || ((i4 & 512) != 0 && m37272810273311398392.h(p5204863746366580363))) ? true : z;
            java.lang.Object objM3 = m37272810273311398392.M();
            if (z2 || objM3 == obj) {
                objM3 = new dev.epro.r0.A6662317080022852970(p5204863746366580363, (byte) 14);
                m37272810273311398392.k0(objM3);
            }
            dev.epro.r0.Q13169198992966610970.c(p5204863746366580363, (dev.epro.r0.F4096073349764486348) objM3, m37272810273311398392);
        } else {
            m37272810273311398392.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.Z11010316021731160528(a13182230205880306765, t15443218846549482730, p5204863746366580363, i1722681268793429505, t154432188465494827302, i2);
        }
    }

    public static final native java.util.Set c0(java.lang.String str);

    public static final native void d(dev.epro.r0.V3118049853945785650 v3118049853945785650, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static void d0(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final native void e(java.lang.String str, dev.epro.r0.W1413845473851472788 w1413845473851472788, long j2, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void e0(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.G11450220448113054352.h(i2, i3, "index (", ") is out of bound of [0, ", ")"));
        }
    }

    public static final native void f(int i2, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.M3727281027331139839 m3727281027331139839, java.lang.String str, boolean z);

    public static final void j(dev.epro.r0.W3656598099029166611 w3656598099029166611, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.A10693687560045094360 a10693687560045094360, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        dev.epro.r0.F4096073349764486348 f40960733497644863482;
        dev.epro.r0.L6855102173777462404 l6855102173777462404 = w3656598099029166611.a;
        m3727281027331139839.b0(-1877370462);
        int i3 = (i2 & 6) == 0 ? (m3727281027331139839.f(w3656598099029166611) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(a10693687560045094360) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= m3727281027331139839.h(t15443218846549482730) ? 16384 : 8192;
        }
        if (m3727281027331139839.R(i4 & 1, (i4 & 9363) != 9362)) {
            java.lang.Object objM = m3727281027331139839.M();
            java.lang.Object obj = dev.epro.r0.O9023047933786425027.a;
            if (objM == obj) {
                objM = dev.epro.r0.J6249063375258466235.p;
                m3727281027331139839.k0(objM);
            }
            dev.epro.r0.F4096073349764486348 f40960733497644863483 = (dev.epro.r0.F4096073349764486348) objM;
            java.lang.Object objM2 = m3727281027331139839.M();
            java.lang.Object obj2 = objM2;
            if (objM2 == obj) {
                dev.epro.r0.R5670552972627103399 r5670552972627103399 = new dev.epro.r0.R5670552972627103399();
                r5670552972627103399.add(l6855102173777462404.g());
                m3727281027331139839.k0(r5670552972627103399);
                obj2 = r5670552972627103399;
            }
            dev.epro.r0.R5670552972627103399 r56705529726271033992 = (dev.epro.r0.R5670552972627103399) obj2;
            java.lang.Object objM3 = m3727281027331139839.M();
            if (objM3 == obj) {
                long[] jArr = dev.epro.r0.X4026756943680612204.a;
                objM3 = new dev.epro.r0.A4559761392562572984();
                m3727281027331139839.k0(objM3);
            }
            dev.epro.r0.A4559761392562572984 a4559761392562572984 = (dev.epro.r0.A4559761392562572984) objM3;
            dev.epro.r0.V697849047308847220 v697849047308847220 = w3656598099029166611.d;
            if (dev.epro.r0.S10823041268949770285.t(l6855102173777462404.g(), v697849047308847220.getValue())) {
                m3727281027331139839.a0(321145192);
                if (r56705529726271033992.size() == 1 && dev.epro.r0.S10823041268949770285.t(r56705529726271033992.get(0), v697849047308847220.getValue())) {
                    m3727281027331139839.a0(321469824);
                    m3727281027331139839.q(false);
                } else {
                    m3727281027331139839.a0(321279546);
                    boolean z = (i4 & 14) == 4;
                    java.lang.Object objM4 = m3727281027331139839.M();
                    if (z || objM4 == obj) {
                        objM4 = new dev.epro.r0.J3227772737003951788(w3656598099029166611, (byte) 9);
                        m3727281027331139839.k0(objM4);
                    }
                    dev.epro.r0.P17571903987102865660.p0((dev.epro.r0.F4096073349764486348) objM4, r56705529726271033992);
                    a4559761392562572984.a();
                    m3727281027331139839.q(false);
                }
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(321475776);
                m3727281027331139839.q(false);
            }
            if (a4559761392562572984.b(v697849047308847220.getValue())) {
                m3727281027331139839.a0(322279296);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(321536443);
                java.util.ListIterator listIterator = r56705529726271033992.listIterator();
                int i5 = 0;
                while (true) {
                    dev.epro.r0.E12552353581788229419 e12552353581788229419 = (dev.epro.r0.E12552353581788229419) listIterator;
                    if (!e12552353581788229419.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (dev.epro.r0.S10823041268949770285.t(f40960733497644863483.invoke(e12552353581788229419.next()), f40960733497644863483.invoke(v697849047308847220.getValue()))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    r56705529726271033992.add(v697849047308847220.getValue());
                } else {
                    r56705529726271033992.set(i5, v697849047308847220.getValue());
                }
                a4559761392562572984.a();
                int size = r56705529726271033992.size();
                for (int i6 = 0; i6 < size; i6++) {
                    java.lang.Object obj3 = r56705529726271033992.get(i6);
                    a4559761392562572984.n(obj3, dev.epro.r0.S10823041268949770285.T(-934471669, new dev.epro.r0.M11969686331725811805(w3656598099029166611, a10693687560045094360, obj3, t15443218846549482730), m3727281027331139839));
                }
                m3727281027331139839.q(false);
            }
            dev.epro.r0.A10838822263452390785 a10838822263452390785C = dev.epro.r0.Z6714950837425363575.c(dev.epro.r0.T13350664027331345869.b, false);
            int iHashCode = java.lang.Long.hashCode(m3727281027331139839.T);
            dev.epro.r0.P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            dev.epro.r0.I1722681268793429505 i1722681268793429505N = dev.epro.r0.V12319504402545346730.N(m3727281027331139839, i1722681268793429505);
            dev.epro.r0.X4572652335386916693.Po.getClass();
            m3727281027331139839.d0();
            if (m3727281027331139839.S) {
                m3727281027331139839.k(dev.epro.r0.H11725168162114556860.S);
            } else {
                m3727281027331139839.n0();
            }
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.i, m3727281027331139839, a10838822263452390785C);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
            dev.epro.r0.W7808703833045379622.z(m3727281027331139839, java.lang.Integer.valueOf(iHashCode));
            dev.epro.r0.W7808703833045379622.H(m3727281027331139839);
            dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
            m3727281027331139839.a0(-1312707512);
            int size2 = r56705529726271033992.size();
            for (int i7 = 0; i7 < size2; i7++) {
                java.lang.Object obj4 = r56705529726271033992.get(i7);
                m3727281027331139839.Y(1171574969, f40960733497644863483.invoke(obj4));
                dev.epro.r0.L12639328004344855510 l12639328004344855510 = (dev.epro.r0.L12639328004344855510) a4559761392562572984.g(obj4);
                if (l12639328004344855510 == null) {
                    m3727281027331139839.a0(1959122128);
                } else {
                    m3727281027331139839.a0(1171576145);
                    l12639328004344855510.invoke(m3727281027331139839, 0);
                }
                m3727281027331139839.q(false);
                m3727281027331139839.q(false);
            }
            m3727281027331139839.q(false);
            m3727281027331139839.q(true);
            f40960733497644863482 = f40960733497644863483;
        } else {
            m3727281027331139839.U();
            f40960733497644863482 = f4096073349764486348;
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.B4826844404414046037(w3656598099029166611, i1722681268793429505, a10693687560045094360, f40960733497644863482, t15443218846549482730, i2);
        }
    }

    public static final void k(java.lang.Object obj, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.A10693687560045094360 a10693687560045094360, java.lang.String str, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2, int i3) {
        int i4;
        dev.epro.r0.I1722681268793429505 i17226812687934295052;
        java.lang.String str2;
        m3727281027331139839.b0(-513216493);
        int i5 = i2 | (m3727281027331139839.f(obj) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = i5 | 48;
        } else {
            i4 = i5 | (m3727281027331139839.f(i1722681268793429505) ? 32 : 16);
        }
        int i7 = i4 | (m3727281027331139839.h(a10693687560045094360) ? 256 : 128) | 3072;
        if (m3727281027331139839.R(i7 & 1, (i7 & 9363) != 9362)) {
            dev.epro.r0.I1722681268793429505 i17226812687934295053 = i6 != 0 ? dev.epro.r0.V10993962107938880611.a : i1722681268793429505;
            j(dev.epro.r0.V933048422416352811.M(obj, "Crossfade", m3727281027331139839, (i7 & 14) | 48, 0), i17226812687934295053, a10693687560045094360, null, t15443218846549482730, m3727281027331139839, i7 & 58352);
            i17226812687934295052 = i17226812687934295053;
            str2 = "Crossfade";
        } else {
            m3727281027331139839.U();
            i17226812687934295052 = i1722681268793429505;
            str2 = str;
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.W5376853193994691768(obj, i17226812687934295052, a10693687560045094360, str2, t15443218846549482730, i2, i3);
        }
    }

    public static final native void l(dev.epro.r0.X11638668447546090163 x11638668447546090163, dev.epro.r0.K2746982608131049817 k2746982608131049817, dev.epro.r0.X16042184966849612101 x16042184966849612101, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(dev.epro.r0.P18315010608309390908 p18315010608309390908, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(boolean z, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(dev.epro.r0.P18315010608309390908 p18315010608309390908, dev.epro.r0.C3072902849025492506 c3072902849025492506, dev.epro.r0.E9947071562186447382 e9947071562186447382, boolean z, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(dev.epro.r0.E10547862673625079010 e10547862673625079010, boolean z, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void r(dev.epro.r0.X12291102796058397370 x12291102796058397370, boolean z, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(dev.epro.r0.Z7022156542152740569 z7022156542152740569, java.lang.String str, long j2, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void t(long j2, long j3, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void u(java.lang.String str, long j2, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void v(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        dev.epro.r0.I1722681268793429505 i17226812687934295052;
        dev.epro.r0.T15443218846549482730 t154432188465494827302;
        m3727281027331139839.b0(790527681);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            java.lang.Object objM = m3727281027331139839.M();
            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.O9023047933786425027.a;
            if (objM == e17149812035295265804) {
                dev.epro.r0.V697849047308847220 v697849047308847220 = new dev.epro.r0.V697849047308847220((java.lang.Object) null, dev.epro.r0.B14824868959299866349.k);
                m3727281027331139839.k0(v697849047308847220);
                objM = v697849047308847220;
            }
            dev.epro.r0.W1972671267364756056 w1972671267364756056 = (dev.epro.r0.W1972671267364756056) objM;
            java.lang.Object objM2 = m3727281027331139839.M();
            if (objM2 == e17149812035295265804) {
                objM2 = new dev.epro.r0.H1387862205763836338(w1972671267364756056, (byte) 12);
                m3727281027331139839.k0(objM2);
            }
            dev.epro.r0.B13729205492206812220 b13729205492206812220 = (dev.epro.r0.B13729205492206812220) objM2;
            dev.epro.r0.R6081921892807856809 r6081921892807856809 = dev.epro.r0.I828473291849542367.a;
            dev.epro.r0.Q3290033537611024070 q3290033537611024070H = dev.epro.r0.O4077903568229246.h(dev.epro.r0.O8620973563946607355.b, m3727281027331139839, 6);
            i17226812687934295052 = i1722681268793429505;
            t154432188465494827302 = t15443218846549482730;
            dev.epro.r0.D1286559660607336098.b(new dev.epro.r0.P11507981277033739248[]{dev.epro.r0.M6666571459626975107.b.a(dev.epro.r0.O8620973563946607355.Q(b13729205492206812220, m3727281027331139839, 2)), dev.epro.r0.M6666571459626975107.a.a(q3290033537611024070H)}, dev.epro.r0.S10823041268949770285.T(1070596993, new dev.epro.r0.G989519692541748422(i17226812687934295052, w1972671267364756056, t154432188465494827302, q3290033537611024070H, b13729205492206812220), m3727281027331139839), m3727281027331139839, 56);
        } else {
            i17226812687934295052 = i1722681268793429505;
            t154432188465494827302 = t15443218846549482730;
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.S4441727196080009540(i17226812687934295052, t154432188465494827302, i2, (byte) 4);
        }
    }

    public static final void w(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(155925518);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.f(i1722681268793429505) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            boolean z = m3727281027331139839.j(dev.epro.r0.M6666571459626975107.a) != null;
            boolean z2 = m3727281027331139839.j(dev.epro.r0.M6666571459626975107.b) != null;
            if (z && z2) {
                m3727281027331139839.a0(-1977187922);
                dev.epro.r0.A10838822263452390785 a10838822263452390785C = dev.epro.r0.Z6714950837425363575.c(dev.epro.r0.T13350664027331345869.b, true);
                int iHashCode = java.lang.Long.hashCode(m3727281027331139839.T);
                dev.epro.r0.P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
                dev.epro.r0.I1722681268793429505 i1722681268793429505N = dev.epro.r0.V12319504402545346730.N(m3727281027331139839, i1722681268793429505);
                dev.epro.r0.X4572652335386916693.Po.getClass();
                m3727281027331139839.d0();
                if (m3727281027331139839.S) {
                    m3727281027331139839.k(dev.epro.r0.H11725168162114556860.S);
                } else {
                    m3727281027331139839.n0();
                }
                dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.i, m3727281027331139839, a10838822263452390785C);
                dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
                dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.j, m3727281027331139839, java.lang.Integer.valueOf(iHashCode));
                dev.epro.r0.W7808703833045379622.H(m3727281027331139839);
                dev.epro.r0.W7808703833045379622.J(dev.epro.r0.P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
                t15443218846549482730.invoke(m3727281027331139839, java.lang.Integer.valueOf((i3 >> 3) & 14));
                m3727281027331139839.q(true);
                m3727281027331139839.q(false);
            } else if (z) {
                m3727281027331139839.a0(-1976997706);
                dev.epro.r0.O8620973563946607355.i(i1722681268793429505, t15443218846549482730, m3727281027331139839, i3 & 126);
                m3727281027331139839.q(false);
            } else if (z2) {
                m3727281027331139839.a0(-1976846922);
                dev.epro.r0.I828473291849542367.d(i1722681268793429505, t15443218846549482730, m3727281027331139839, i3 & 126);
                m3727281027331139839.q(false);
            } else {
                m3727281027331139839.a0(-1976716505);
                v(i1722681268793429505, t15443218846549482730, m3727281027331139839, i3 & 126);
                m3727281027331139839.q(false);
            }
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.S4441727196080009540(i1722681268793429505, t15443218846549482730, i2, (byte) 3);
        }
    }

    public static final native void x(dev.epro.r0.A16842337154698931828 a16842337154698931828, dev.epro.r0.Y15427935686644244568 y15427935686644244568, dev.epro.r0.V9622388302629328265 v9622388302629328265, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void y(dev.epro.r0.R6894569913291645384 r6894569913291645384, dev.epro.r0.U14925992865883685656 u14925992865883685656, java.lang.String str, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void z(java.lang.String str, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public abstract android.content.Intent O(android.content.Context context, java.lang.Object obj);

    public dev.epro.r0.Z6787503239643758223 U(android.content.Context context, java.lang.Object obj) {
        return null;
    }

    public abstract java.lang.Object Z(android.content.Intent intent, int i2);

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1066);
        b = new float[91];
        c = dev.epro.r0.Y4261039727803185691.u;
        d = dev.epro.r0.V10933700885381486763.h;
        e = dev.epro.r0.Y4261039727803185691.w;
        f = 0.38f;
        g = 6.0f;
        h = 1.0f;
        i = new dev.epro.r0.F6942723054099263096(new dev.epro.r0.T15504973625601650233((byte) 15), (byte) 14);
        j = new dev.epro.r0.P10283164515565247229(1000);
        new dev.epro.r0.P10283164515565247229(1007);
        k = new dev.epro.r0.P10283164515565247229(1008);
        l = new dev.epro.r0.P10283164515565247229(1002);
        m = new java.lang.Object();
        n = new dev.epro.r0.Z14997871575210439922((byte) 22);
    }
}
