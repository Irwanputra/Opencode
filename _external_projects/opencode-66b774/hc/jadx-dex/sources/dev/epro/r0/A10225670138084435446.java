package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class A10225670138084435446 {
    public static final dev.epro.r0.B6440366792515411106 a;
    public static final dev.epro.r0.L12293142626931145046 b;
    public static final dev.epro.r0.X18244299380549586254 c;
    public static final dev.epro.r0.X17873598080297061904 d;
    public static final dev.epro.r0.V14115061890849225617 e;
    public static final dev.epro.r0.P5733283974459951585 f;
    public static final dev.epro.r0.J18325703078859211263 g;
    public static final dev.epro.r0.J18325703078859211263[] h;
    public static dev.epro.r0.Z7022156542152740569 i;
    public static dev.epro.r0.Z7022156542152740569 j;
    public static dev.epro.r0.Z7022156542152740569 k;
    public static dev.epro.r0.Z7022156542152740569 l;
    public static java.lang.Boolean m;

    public static final dev.epro.r0.S5282637534609503170 A(dev.epro.r0.G5298154673482189769 g5298154673482189769, dev.epro.r0.G5298154673482189769 g52981546734821897692) {
        return g5298154673482189769 == g52981546734821897692 ? new dev.epro.r0.C7472389330091974750(g5298154673482189769, g5298154673482189769, 1) : (dev.epro.r0.R7033599853981556291.v(g5298154673482189769.b, 12884901888L) && dev.epro.r0.R7033599853981556291.v(g52981546734821897692.b, 12884901888L)) ? new dev.epro.r0.A12309777863353766241((dev.epro.r0.H8745424616867554108) g5298154673482189769, (dev.epro.r0.H8745424616867554108) g52981546734821897692) : new dev.epro.r0.S5282637534609503170(g5298154673482189769, g52981546734821897692, 0);
    }

    public static dev.epro.r0.J14024120050125738337 B(java.lang.Class cls) throws java.lang.reflect.InvocationTargetException {
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (dev.epro.r0.J14024120050125738337) objNewInstance;
            } catch (java.lang.IllegalAccessException e2) {
                dev.epro.r0.K2042933864045806308.m("Cannot create an instance of ", cls, e2);
                return null;
            } catch (java.lang.InstantiationException e3) {
                dev.epro.r0.K2042933864045806308.m("Cannot create an instance of ", cls, e3);
                return null;
            }
        } catch (java.lang.NoSuchMethodException e4) {
            dev.epro.r0.K2042933864045806308.m("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static final dev.epro.r0.J12043550928838212009 C(dev.epro.r0.B14841931160204392628 b14841931160204392628) {
        return new dev.epro.r0.G6219617120344415229(new dev.epro.r0.L9616574562717589094(new dev.epro.r0.V10450421848591554621((byte) 24), b14841931160204392628, (dev.epro.r0.R4833348786910499294) null), (byte) 2);
    }

    public static final dev.epro.r0.Z7022156542152740569 D() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = k;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.DeleteOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        dev.epro.r0.V14323974914327418545 v14323974914327418545D = dev.epro.r0.G11450220448113054352.d(6.0f, 19.0f);
        v14323974914327418545D.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v14323974914327418545D.g(8.0f);
        v14323974914327418545D.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545D.h(18.0f, 7.0f);
        dev.epro.r0.G11450220448113054352.o(v14323974914327418545D, 6.0f, 7.0f, 12.0f);
        dev.epro.r0.G11450220448113054352.u(v14323974914327418545D, 8.0f, 9.0f, 8.0f, 10.0f);
        dev.epro.r0.G11450220448113054352.p(v14323974914327418545D, 8.0f, 19.0f, 8.0f, 9.0f);
        v14323974914327418545D.j(15.5f, 4.0f);
        v14323974914327418545D.i(-1.0f, -1.0f);
        v14323974914327418545D.g(-5.0f);
        v14323974914327418545D.i(-1.0f, 1.0f);
        v14323974914327418545D.h(5.0f, 4.0f);
        v14323974914327418545D.s(2.0f);
        v14323974914327418545D.g(14.0f);
        v14323974914327418545D.h(19.0f, 4.0f);
        v14323974914327418545D.g(-3.5f);
        v14323974914327418545D.c();
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        k = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final float[] E(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final float[] F(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] G(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final native java.lang.Object H(java.lang.String str, dev.epro.r0.Z6112298763105579796 z6112298763105579796, dev.epro.r0.F6812482237731188212 f6812482237731188212, dev.epro.r0.S2634279721334480828 s2634279721334480828, dev.epro.r0.Y4821112808043229943 y4821112808043229943, dev.epro.r0.C5358198448794955302 c5358198448794955302, dev.epro.r0.Z9825991673536453298 z9825991673536453298, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public static byte[] I(java.io.InputStream inputStream, int i2) throws java.io.IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 < 0) {
                dev.epro.r0.S10973172697741180971.m(dev.epro.r0.G6547577305291411977.n(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += i4;
        }
        return bArr;
    }

    public static final int J(int i2, java.lang.String str) {
        char cCharAt = str.charAt(i2);
        return (cCharAt << 7) + str.charAt(i2 + 1);
    }

    public static final native java.lang.Object K(java.lang.String str, dev.epro.r0.Z6112298763105579796 z6112298763105579796, dev.epro.r0.A11690045053661555424 a11690045053661555424, dev.epro.r0.Z9825991673536453298 z9825991673536453298, dev.epro.r0.Q14987615617507388651 q14987615617507388651, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public static final byte[] L(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(java.lang.Math.max(8192, inputStream.available()));
        z(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static byte[] M(java.io.FileInputStream fileInputStream, int i2, int i3) {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int i5 = fileInputStream.read(bArr2);
                if (i5 < 0) {
                    throw new java.lang.IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, i5);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i3 - iInflate);
                    i4 += i5;
                } catch (java.util.zip.DataFormatException e2) {
                    throw new java.lang.IllegalStateException(e2.getMessage());
                }
            }
            if (i4 == i2) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new java.lang.IllegalStateException("Inflater did not finish");
            }
            throw new java.lang.IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static long N(java.io.InputStream inputStream, int i2) throws java.io.IOException {
        byte[] bArrI = I(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += ((long) (bArrI[i3] & 255)) << (i3 * 8);
        }
        return j2;
    }

    public static final native dev.epro.r0.U7462775155658476208 O(dev.epro.r0.F2652319623815706820 f2652319623815706820, dev.epro.r0.G5908860263237596133 g5908860263237596133, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.L12639328004344855510 l126393280043448555102, dev.epro.r0.M3727281027331139839 m3727281027331139839);

    public static dev.epro.r0.D14731132657808549702 P(dev.epro.r0.D14731132657808549702 d14731132657808549702) throws java.security.GeneralSecurityException {
        if (d14731132657808549702.equals(dev.epro.r0.D14731132657808549702.r)) {
            return dev.epro.r0.D14731132657808549702.k0;
        }
        if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.s) {
            return dev.epro.r0.D14731132657808549702.n0;
        }
        if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.t) {
            return dev.epro.r0.D14731132657808549702.m0;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(java.lang.String.valueOf(d14731132657808549702)));
    }

    public static dev.epro.r0.D14731132657808549702 Q(dev.epro.r0.D14731132657808549702 d14731132657808549702) throws java.security.GeneralSecurityException {
        dev.epro.r0.D14731132657808549702 d147311326578085497022 = dev.epro.r0.D14731132657808549702.s;
        if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.k0) {
            return dev.epro.r0.D14731132657808549702.r;
        }
        if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.n0 || d14731132657808549702 == dev.epro.r0.D14731132657808549702.l0) {
            return d147311326578085497022;
        }
        if (d14731132657808549702 == dev.epro.r0.D14731132657808549702.m0) {
            return dev.epro.r0.D14731132657808549702.t;
        }
        throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(d14731132657808549702)));
    }

    public static void R(dev.epro.r0.T1031997469743650177 t1031997469743650177) throws java.security.GeneralSecurityException {
        int i2 = t1031997469743650177.c;
        int i3 = t1031997469743650177.b;
        if (i2 != 16) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", java.lang.Integer.valueOf(t1031997469743650177.c)));
        }
        if (i3 != 12) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", java.lang.Integer.valueOf(i3)));
        }
    }

    public static void S(java.io.OutputStream outputStream, long j2, int i2) throws java.io.IOException {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void T(java.io.ByteArrayOutputStream byteArrayOutputStream, int i2) throws java.io.IOException {
        S(byteArrayOutputStream, i2, 2);
    }

    public static final void a(int i2, dev.epro.r0.M3727281027331139839 m3727281027331139839) {
        dev.epro.r0.M3727281027331139839 m37272810273311398392;
        dev.epro.r0.V4878375136513573151 v4878375136513573151T;
        dev.epro.r0.L2311487989567145532 l2311487989567145532;
        m3727281027331139839.b0(-1160448874);
        if (m3727281027331139839.R(i2 & 1, i2 != 0)) {
            android.content.Context context = (android.content.Context) m3727281027331139839.j(dev.epro.r0.T15795698139970521497.b);
            boolean zF = m3727281027331139839.f(context);
            java.lang.Object objM = m3727281027331139839.M();
            if (zF || objM == dev.epro.r0.O9023047933786425027.a) {
                dev.epro.r0.N7165486080938201066.a.getClass();
                objM = java.lang.Boolean.valueOf(dev.epro.r0.N7165486080938201066.a(context));
                m3727281027331139839.k0(objM);
            }
            if (((java.lang.Boolean) objM).booleanValue()) {
                m3727281027331139839.a0(-740504141);
                dev.epro.r0.K5751602218013079365.o(0, m3727281027331139839);
                m3727281027331139839.q(false);
                v4878375136513573151T = m3727281027331139839.t();
                if (v4878375136513573151T != null) {
                    l2311487989567145532 = new dev.epro.r0.L2311487989567145532(i2, (byte) 19);
                    v4878375136513573151T.d = l2311487989567145532;
                }
                return;
            }
            m3727281027331139839.a0(-740449364);
            m3727281027331139839.q(false);
            dev.epro.r0.I1722681268793429505 i1722681268793429505P = dev.epro.r0.M9216324016624295870.p(dev.epro.r0.V16747615581620678882.c, dev.epro.r0.U16229988784104357932.A(2131099762, m3727281027331139839), dev.epro.r0.R7033599853981556291.n);
            dev.epro.r0.A10838822263452390785 a10838822263452390785C = dev.epro.r0.Z6714950837425363575.c(dev.epro.r0.T13350664027331345869.f, false);
            int iHashCode = java.lang.Long.hashCode(m3727281027331139839.T);
            dev.epro.r0.P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
            dev.epro.r0.I1722681268793429505 i1722681268793429505N = dev.epro.r0.V12319504402545346730.N(m3727281027331139839, i1722681268793429505P);
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
            m37272810273311398392 = m3727281027331139839;
            dev.epro.r0.Q3181834110876746778.k(dev.epro.r0.Q13169198992966610970.k0(2131230909, m3727281027331139839), (java.lang.String) null, dev.epro.r0.V16747615581620678882.k(dev.epro.r0.V10993962107938880611.a, 216.0f), (dev.epro.r0.G15527156457921655762) null, (dev.epro.r0.C1267176524613794288) null, 0.0f, m37272810273311398392, 440, 120);
            m37272810273311398392.q(true);
        } else {
            m37272810273311398392 = m3727281027331139839;
            m37272810273311398392.U();
        }
        v4878375136513573151T = m37272810273311398392.t();
        if (v4878375136513573151T != null) {
            l2311487989567145532 = new dev.epro.r0.L2311487989567145532(i2, (byte) 20);
            v4878375136513573151T.d = l2311487989567145532;
        }
    }

    public static final native void b(java.lang.String str, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void c(dev.epro.r0.G2190230421268324049 g2190230421268324049, boolean z, boolean z2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void d(dev.epro.r0.Y1142897021974398355 y1142897021974398355, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void e(dev.epro.r0.A15234621907337682254 a15234621907337682254, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(-954926513);
        int i3 = (m3727281027331139839.h(a15234621907337682254) ? 4 : 2) | i2;
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            dev.epro.r0.Q3181834110876746778.d(a15234621907337682254, t15443218846549482730, m3727281027331139839, i3 & 126);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.W16113315444181017053(a15234621907337682254, t15443218846549482730, i2, (byte) 1);
        }
    }

    public static final void f(dev.epro.r0.L9852841107405549527 l9852841107405549527, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(l9852841107405549527) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 32 : 16;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            dev.epro.r0.Q3181834110876746778.e(l9852841107405549527, t15443218846549482730, m3727281027331139839, i3 & 126);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.P15866186340528208810(l9852841107405549527, t15443218846549482730, i2, (byte) 1);
        }
    }

    public static final void g(dev.epro.r0.D2717688760023469083 d2717688760023469083, boolean z, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(-579239002);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(d2717688760023469083) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(t15443218846549482730) ? 256 : 128;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            dev.epro.r0.Q3181834110876746778.f(d2717688760023469083, z, t15443218846549482730, m3727281027331139839, i3 & 1022);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.Y1691096943284422636(d2717688760023469083, z, t15443218846549482730, i2, (byte) 1);
        }
    }

    public static final native void h(dev.epro.r0.U7462775155658476208 u7462775155658476208, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(dev.epro.r0.E9947071562186447382 e9947071562186447382, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void j(dev.epro.r0.G16768067413993841943 g16768067413993841943, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.T1241271073913685060 t1241271073913685060, dev.epro.r0.P2382941533350862833 p2382941533350862833, int i2, dev.epro.r0.O15869581661108952313 o15869581661108952313, dev.epro.r0.Q12103736865181728683 q12103736865181728683, boolean z, dev.epro.r0.J13386303774951932313 j13386303774951932313, dev.epro.r0.E12579343433108873398 e12579343433108873398, dev.epro.r0.N11829648573770870927 n11829648573770870927, dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3) {
        int i4;
        dev.epro.r0.O15869581661108952313 o158695816611089523132;
        dev.epro.r0.T1241271073913685060 t12412710739136850602;
        dev.epro.r0.P2382941533350862833 p23829415333508628332;
        dev.epro.r0.Q12103736865181728683 q121037368651817286832;
        dev.epro.r0.J13386303774951932313 j133863037749519323132;
        dev.epro.r0.E12579343433108873398 e125793434331088733982;
        dev.epro.r0.N11829648573770870927 n118296485737708709272;
        dev.epro.r0.J13386303774951932313 j133863037749519323133;
        dev.epro.r0.N11829648573770870927 n11829648573770870927B;
        dev.epro.r0.Q12103736865181728683 q121037368651817286833;
        int i5;
        dev.epro.r0.T1241271073913685060 t12412710739136850603;
        dev.epro.r0.P2382941533350862833 p23829415333508628333;
        m3727281027331139839.b0(1860873769);
        if ((i3 & 6) == 0) {
            i4 = (m3727281027331139839.f(g16768067413993841943) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= m3727281027331139839.f(i1722681268793429505) ? 32 : 16;
        }
        int i6 = i4 | 3456;
        if ((i3 & 24576) == 0) {
            i6 |= m3727281027331139839.d(i2) ? 16384 : 8192;
        }
        int i7 = i6 | 196608;
        if ((1572864 & i3) == 0) {
            o158695816611089523132 = o15869581661108952313;
            i7 |= m3727281027331139839.f(o158695816611089523132) ? 1048576 : 524288;
        } else {
            o158695816611089523132 = o15869581661108952313;
        }
        if ((12582912 & i3) == 0) {
            i7 |= 4194304;
        }
        if ((100663296 & i3) == 0) {
            i7 |= m3727281027331139839.g(z) ? 67108864 : 33554432;
        }
        int i8 = i7 | 805306368;
        if (m3727281027331139839.R(i8 & 1, (306783379 & i8) != 306783378)) {
            m3727281027331139839.W();
            if ((i3 & 1) == 0 || m3727281027331139839.z()) {
                dev.epro.r0.D6962450040782876658 d6962450040782876658 = new dev.epro.r0.D6962450040782876658(0.0f, 0.0f, 0.0f, 0.0f);
                dev.epro.r0.P2382941533350862833 p23829415333508628334 = dev.epro.r0.P2382941533350862833.r;
                int i9 = (i8 & 14) | 196608;
                dev.epro.r0.T5458736918376364276 t5458736918376364276 = new dev.epro.r0.T5458736918376364276();
                dev.epro.r0.X14364139104409853146 x14364139104409853146A = dev.epro.r0.O13877966917012660236.a(m3727281027331139839);
                java.util.Map map = dev.epro.r0.I12271177246410047083.a;
                dev.epro.r0.M7102034154292440921 m7102034154292440921Q = dev.epro.r0.O4077903568229246.Q(0.0f, 400.0f, java.lang.Float.valueOf(1.0f), 1);
                dev.epro.r0.R8540738700654750557 r8540738700654750557 = (dev.epro.r0.R8540738700654750557) m3727281027331139839.j(dev.epro.r0.Y238707362170117896.h);
                dev.epro.r0.X354568553596380848 x354568553596380848 = dev.epro.r0.Y238707362170117896.n;
                dev.epro.r0.F10342546226345611902 f10342546226345611902 = (dev.epro.r0.F10342546226345611902) m3727281027331139839.j(x354568553596380848);
                boolean zF = m3727281027331139839.f(r8540738700654750557) | ((((i9 & 14) ^ 6) > 4 && m3727281027331139839.f(g16768067413993841943)) || (i9 & 6) == 4) | m3727281027331139839.f(x14364139104409853146A) | m3727281027331139839.f(m7102034154292440921Q) | m3727281027331139839.f(t5458736918376364276) | m3727281027331139839.d(f10342546226345611902.ordinal());
                java.lang.Object objM = m3727281027331139839.M();
                dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.O9023047933786425027.a;
                if (zF || objM == e17149812035295265804) {
                    dev.epro.r0.Q12103736865181728683 q121037368651817286834 = new dev.epro.r0.Q12103736865181728683(new dev.epro.r0.V10300877997588547986(g16768067413993841943, new dev.epro.r0.T16680511889760403724(g16768067413993841943, f10342546226345611902, (byte) 8), t5458736918376364276), x14364139104409853146A, m7102034154292440921Q);
                    m3727281027331139839.k0(q121037368651817286834);
                    objM = q121037368651817286834;
                }
                dev.epro.r0.Q12103736865181728683 q121037368651817286835 = (dev.epro.r0.Q12103736865181728683) objM;
                int i10 = i8 & (-29360129);
                int i11 = (i8 & 14) | 432;
                dev.epro.r0.F10342546226345611902 f103425462263456119022 = (dev.epro.r0.F10342546226345611902) m3727281027331139839.j(x354568553596380848);
                boolean zD = m3727281027331139839.d(f103425462263456119022.ordinal()) | ((((i11 & 14) ^ 6) > 4 && m3727281027331139839.f(g16768067413993841943)) || (i11 & 6) == 4);
                java.lang.Object objM2 = m3727281027331139839.M();
                if (zD || objM2 == e17149812035295265804) {
                    objM2 = new dev.epro.r0.B1517373391234519490(g16768067413993841943, f103425462263456119022);
                    m3727281027331139839.k0(objM2);
                }
                j133863037749519323133 = (dev.epro.r0.B1517373391234519490) objM2;
                e125793434331088733982 = dev.epro.r0.P2382941533350862833.u;
                n11829648573770870927B = dev.epro.r0.F12841283984235263986.b(m3727281027331139839);
                q121037368651817286833 = q121037368651817286835;
                i5 = i10;
                t12412710739136850603 = d6962450040782876658;
                p23829415333508628333 = p23829415333508628334;
            } else {
                m3727281027331139839.U();
                i5 = i8 & (-29360129);
                t12412710739136850603 = t1241271073913685060;
                p23829415333508628333 = p2382941533350862833;
                q121037368651817286833 = q12103736865181728683;
                j133863037749519323133 = j13386303774951932313;
                e125793434331088733982 = e12579343433108873398;
                n11829648573770870927B = n11829648573770870927;
            }
            m3727281027331139839.r();
            int i12 = i5 >> 6;
            int i13 = i5 << 12;
            dev.epro.r0.U15853425786981391261.m(i1722681268793429505, g16768067413993841943, t12412710739136850603, q121037368651817286833, z, n11829648573770870927B, i2, p23829415333508628333, j133863037749519323133, o158695816611089523132, e125793434331088733982, t15443218846549482730, m3727281027331139839, ((i5 >> 3) & 14) | 24576 | ((i5 << 3) & 112) | (i5 & 896) | ((i5 >> 18) & 7168) | (3670016 & i12) | (234881024 & i13) | (i13 & 1879048192), ((i5 >> 9) & 14) | 3456 | (57344 & i12) | 1769472);
            n118296485737708709272 = n11829648573770870927B;
            p23829415333508628332 = p23829415333508628333;
            j133863037749519323132 = j133863037749519323133;
            q121037368651817286832 = q121037368651817286833;
            t12412710739136850602 = t12412710739136850603;
        } else {
            m3727281027331139839.U();
            t12412710739136850602 = t1241271073913685060;
            p23829415333508628332 = p2382941533350862833;
            q121037368651817286832 = q12103736865181728683;
            j133863037749519323132 = j13386303774951932313;
            e125793434331088733982 = e12579343433108873398;
            n118296485737708709272 = n11829648573770870927;
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.K15777201973635170315(g16768067413993841943, i1722681268793429505, t12412710739136850602, p23829415333508628332, i2, o15869581661108952313, q121037368651817286832, z, j133863037749519323132, e125793434331088733982, n118296485737708709272, t15443218846549482730, i3);
        }
    }

    public static final native void k(dev.epro.r0.Z1656773070093558724 z1656773070093558724, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void l(dev.epro.r0.T15443218846549482730 t15443218846549482730, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(java.lang.String str, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(int i2, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.M3727281027331139839 m3727281027331139839, dev.epro.r0.I1722681268793429505 i1722681268793429505, java.lang.String str, boolean z);

    public static final native void o(dev.epro.r0.F16705069398168805061 f16705069398168805061, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(int i2, dev.epro.r0.Z7022156542152740569 z7022156542152740569, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3);

    public static final native void q(dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.B13729205492206812220 b137292054922068122204, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void r(dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static dev.epro.r0.G5298154673482189769 s(dev.epro.r0.G5298154673482189769 g5298154673482189769) {
        dev.epro.r0.Q9435736031653407531 q9435736031653407531 = dev.epro.r0.C9869900372345142877.d;
        dev.epro.r0.H12843822278061842084 h12843822278061842084 = dev.epro.r0.H12843822278061842084.e;
        if (dev.epro.r0.R7033599853981556291.v(g5298154673482189769.b, 12884901888L)) {
            dev.epro.r0.H8745424616867554108 h8745424616867554108 = (dev.epro.r0.H8745424616867554108) g5298154673482189769;
            dev.epro.r0.Q9435736031653407531 q94357360316534075312 = h8745424616867554108.d;
            if (!w(q94357360316534075312, q9435736031653407531)) {
                return new dev.epro.r0.H8745424616867554108(((dev.epro.r0.G5298154673482189769) h8745424616867554108).a, h8745424616867554108.h, q9435736031653407531, F(v((float[]) h12843822278061842084.b, q94357360316534075312.a(), q9435736031653407531.a()), h8745424616867554108.i), h8745424616867554108.k, h8745424616867554108.n, h8745424616867554108.e, h8745424616867554108.f, h8745424616867554108.g, -1);
            }
        }
        return g5298154673482189769;
    }

    public static final void t(dev.epro.r0.P11546267793636643785 p11546267793636643785, dev.epro.r0.R6653624393204003746 r6653624393204003746) {
        dev.epro.r0.E10198359844879945462 e10198359844879945462 = r6653624393204003746.d;
        dev.epro.r0.A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
        java.lang.Object objG = e10198359844879945462.a.g(dev.epro.r0.D10671166500636893138.z);
        if (objG == null) {
            objG = null;
        }
        dev.epro.r0.H10924029057425269323 h10924029057425269323 = (dev.epro.r0.H10924029057425269323) objG;
        if (dev.epro.r0.Z1953481206310471956.H(r6653624393204003746)) {
            if (h10924029057425269323 != null && h10924029057425269323.a == 8) {
                return;
            }
            java.lang.Object objG2 = a4559761392562572984.g(dev.epro.r0.E5458822993765169982.y);
            if (objG2 == null) {
                objG2 = null;
            }
            dev.epro.r0.R17587901753867651123 r17587901753867651123 = (dev.epro.r0.R17587901753867651123) objG2;
            if (r17587901753867651123 != null) {
                p11546267793636643785.a(new dev.epro.r0.D7243704389450209436(android.R.id.accessibilityActionPageUp, r17587901753867651123.a));
            }
            java.lang.Object objG3 = a4559761392562572984.g(dev.epro.r0.E5458822993765169982.A);
            if (objG3 == null) {
                objG3 = null;
            }
            dev.epro.r0.R17587901753867651123 r175879017538676511232 = (dev.epro.r0.R17587901753867651123) objG3;
            if (r175879017538676511232 != null) {
                p11546267793636643785.a(new dev.epro.r0.D7243704389450209436(android.R.id.accessibilityActionPageDown, r175879017538676511232.a));
            }
            java.lang.Object objG4 = a4559761392562572984.g(dev.epro.r0.E5458822993765169982.z);
            if (objG4 == null) {
                objG4 = null;
            }
            dev.epro.r0.R17587901753867651123 r175879017538676511233 = (dev.epro.r0.R17587901753867651123) objG4;
            if (r175879017538676511233 != null) {
                p11546267793636643785.a(new dev.epro.r0.D7243704389450209436(android.R.id.accessibilityActionPageLeft, r175879017538676511233.a));
            }
            java.lang.Object objG5 = a4559761392562572984.g(dev.epro.r0.E5458822993765169982.B);
            dev.epro.r0.R17587901753867651123 r175879017538676511234 = (dev.epro.r0.R17587901753867651123) (objG5 != null ? objG5 : null);
            if (r175879017538676511234 != null) {
                p11546267793636643785.a(new dev.epro.r0.D7243704389450209436(android.R.id.accessibilityActionPageRight, r175879017538676511234.a));
            }
        }
    }

    public static final dev.epro.r0.I1722681268793429505 u(dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.L12639328004344855510 l12639328004344855510) {
        return i1722681268793429505.Q0(new dev.epro.r0.Y10438447880603048266(l12639328004344855510));
    }

    public static final float[] v(float[] fArr, float[] fArr2, float[] fArr3) {
        G(fArr, fArr2);
        G(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrE = E(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return F(fArrE, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean w(dev.epro.r0.Q9435736031653407531 q9435736031653407531, dev.epro.r0.Q9435736031653407531 q94357360316534075312) {
        if (q9435736031653407531 == q94357360316534075312) {
            return true;
        }
        return java.lang.Math.abs(q9435736031653407531.a - q94357360316534075312.a) < 0.001f && java.lang.Math.abs(q9435736031653407531.b - q94357360316534075312.b) < 0.001f;
    }

    public static byte[] x(byte[] bArr) {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final boolean y(dev.epro.r0.S6349823729575121924 s6349823729575121924, float f2, float f3) {
        float f4 = s6349823729575121924.a;
        if (f2 > s6349823729575121924.c || f4 > f2) {
            return false;
        }
        return f3 <= s6349823729575121924.d && s6349823729575121924.b <= f3;
    }

    public static final long z(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i2) throws java.io.IOException {
        byte[] bArr = new byte[i2];
        int i3 = inputStream.read(bArr);
        long j2 = 0;
        while (i3 >= 0) {
            outputStream.write(bArr, 0, i3);
            j2 += (long) i3;
            i3 = inputStream.read(bArr);
        }
        return j2;
    }

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(1009);
        a = new dev.epro.r0.B6440366792515411106(dev.epro.r0.T1031997469743650177.class, new dev.epro.r0.U15384774985926769650((byte) 18));
        b = new dev.epro.r0.L12293142626931145046("type.googleapis.com/google.crypto.tink.AesGcmKey", new dev.epro.r0.U15384774985926769650((byte) 19));
        c = new dev.epro.r0.X18244299380549586254(dev.epro.r0.W12607600500791010704.class, new dev.epro.r0.U15384774985926769650((byte) 20));
        d = new dev.epro.r0.X17873598080297061904("type.googleapis.com/google.crypto.tink.AesGcmKey", new dev.epro.r0.U15384774985926769650((byte) 21));
        e = new dev.epro.r0.V14115061890849225617(1.0f, 1.0f);
        f = new dev.epro.r0.P5733283974459951585((byte) 7);
        dev.epro.r0.J18325703078859211263 j18325703078859211263 = new dev.epro.r0.J18325703078859211263("CLIENT_TELEMETRY");
        g = j18325703078859211263;
        h = new dev.epro.r0.J18325703078859211263[]{j18325703078859211263};
    }
}
