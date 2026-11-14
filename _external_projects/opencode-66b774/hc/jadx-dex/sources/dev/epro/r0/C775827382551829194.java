package dev.epro.r0;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C775827382551829194 {
    public static final byte[] a;
    public static final java.lang.String[] b;
    public static final dev.epro.r0.Y4261039727803185691 c;
    public static final dev.epro.r0.Y4261039727803185691 d;
    public static final float e;
    public static final dev.epro.r0.Y4261039727803185691 f;
    public static final float g;
    public static final dev.epro.r0.Y4261039727803185691 h;
    public static final dev.epro.r0.M5459415309190684092 i;
    public static final dev.epro.r0.J3301701597851028733 j;
    public static final dev.epro.r0.M10846389789027735899 k;
    public static final dev.epro.r0.T15504973625601650233 l;
    public static final dev.epro.r0.Z14997871575210439922 m;
    public static dev.epro.r0.Z7022156542152740569 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static dev.epro.r0.Z7022156542152740569 f190o;
    public static dev.epro.r0.Z7022156542152740569 p;

    static {
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(198);
        a = new byte[0];
        b = new java.lang.String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        c = dev.epro.r0.Y4261039727803185691.q;
        dev.epro.r0.Y4261039727803185691 y4261039727803185691 = dev.epro.r0.Y4261039727803185691.h;
        d = y4261039727803185691;
        e = 0.1f;
        f = y4261039727803185691;
        g = 0.38f;
        h = dev.epro.r0.Y4261039727803185691.g;
        i = new dev.epro.r0.M5459415309190684092((byte) 6);
        j = new dev.epro.r0.J3301701597851028733((byte) 27);
        k = new dev.epro.r0.M10846389789027735899((byte) 28);
        l = new dev.epro.r0.T15504973625601650233((byte) 28);
        m = new dev.epro.r0.Z14997871575210439922((byte) 25);
    }

    public static dev.epro.r0.E6758797890281795541 A(android.content.Context context, int i2, int i3) {
        return new dev.epro.r0.E6758797890281795541(null, i2, java.lang.Math.max(java.lang.Math.min(i2 > 655 ? dev.epro.r0.T18016951143603335921.Z((i2 / 728.0f) * 90.0f) : i2 > 632 ? 81 : i2 > 526 ? dev.epro.r0.T18016951143603335921.Z((i2 / 468.0f) * 60.0f) : i2 > 432 ? 68 : dev.epro.r0.T18016951143603335921.Z((i2 / 320.0f) * 50.0f), java.lang.Math.min(90, dev.epro.r0.T18016951143603335921.Y(((double) y(context, i3)) * 0.15d))), 50), 52);
    }

    public static final native void B(java.net.HttpURLConnection httpURLConnection, dev.epro.r0.H7229686696833581033 h7229686696833581033);

    public static dev.epro.r0.E6758797890281795541 C(android.content.Context context, int i2, int i3) {
        return new dev.epro.r0.E6758797890281795541(null, i2, java.lang.Math.max(java.lang.Math.min(java.lang.Math.max(100, dev.epro.r0.T18016951143603335921.Z((i2 / 320.0f) * 100.0f)), java.lang.Math.min(150, dev.epro.r0.T18016951143603335921.Y(((double) y(context, i3)) * 0.2d))), 50), 28);
    }

    public static long D(int i2, dev.epro.r0.R7332211110819204002 r7332211110819204002) {
        int i3 = dev.epro.r0.H7629649715776350322.a[r7332211110819204002.ordinal()];
        int i4 = -1;
        if (i3 != -1) {
            i4 = 1;
            if (i3 == 1) {
                i4 = 0;
            } else if (i3 != 2) {
                dev.epro.r0.Z3383101362411723454.g();
                return 0L;
            }
        }
        return (((long) i2) << 32) | (((long) i4) & 4294967295L);
    }

    public static dev.epro.r0.W1972671267364756056 E() {
        return new dev.epro.r0.V697849047308847220(dev.epro.r0.O9245300239821758723.a, dev.epro.r0.B14824868959299866349.k);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.K6445406877359976829 */
    public static java.lang.Object F(dev.epro.r0.Q9140341247415722307 q9140341247415722307, dev.epro.r0.I15162792415829416729 i15162792415829416729, java.lang.Class cls) throws dev.epro.r0.K6445406877359976829 {
        if (java.nio.ByteBuffer.class.equals(cls)) {
            return ((java.nio.ByteBuffer) i15162792415829416729.e).slice();
        }
        if (byte[].class.equals(cls)) {
            java.nio.ByteBuffer byteBufferSlice = ((java.nio.ByteBuffer) i15162792415829416729.e).slice();
            if (!byteBufferSlice.hasRemaining()) {
                return a;
            }
            byte[] bArr = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr);
            return bArr;
        }
        if (dev.epro.r0.V12599130403671467129.class.equals(cls)) {
            return new dev.epro.r0.V12599130403671467129(((java.nio.ByteBuffer) i15162792415829416729.d).slice());
        }
        java.nio.ByteBuffer byteBufferSlice2 = ((java.nio.ByteBuffer) i15162792415829416729.e).slice();
        int iOrdinal = q9140341247415722307.ordinal();
        if (iOrdinal == 1) {
            dev.epro.r0.L13834037291440535306 declaredAnnotation = cls.getDeclaredAnnotation(dev.epro.r0.L13834037291440535306.class);
            if (declaredAnnotation != null && declaredAnnotation.type() == dev.epro.r0.Q9140341247415722307.b) {
                return dev.epro.r0.S2941385686793915703.R(i15162792415829416729, cls);
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 5) {
                    switch (iOrdinal) {
                        case 9:
                        case 10:
                            if (java.lang.String.class.equals(cls)) {
                                byte[] bArr2 = new byte[byteBufferSlice2.remaining()];
                                byteBufferSlice2.get(bArr2);
                                return new java.lang.String(bArr2);
                            }
                            break;
                        case 11:
                            if (java.lang.Boolean.TYPE.equals(cls)) {
                                if (byteBufferSlice2.remaining() == 1) {
                                    return new java.lang.Boolean(byteBufferSlice2.get() != 0);
                                }
                                throw new dev.epro.r0.K6445406877359976829("Incorrect encoded size of boolean value: " + byteBufferSlice2.remaining());
                            }
                            break;
                    }
                } else {
                    dev.epro.r0.L13834037291440535306 declaredAnnotation2 = cls.getDeclaredAnnotation(dev.epro.r0.L13834037291440535306.class);
                    if (declaredAnnotation2 != null && declaredAnnotation2.type() == dev.epro.r0.Q9140341247415722307.c) {
                        return dev.epro.r0.S2941385686793915703.S(i15162792415829416729, cls, false);
                    }
                }
            } else if (java.lang.String.class.equals(cls)) {
                if (!byteBufferSlice2.hasRemaining()) {
                    throw new dev.epro.r0.K6445406877359976829("Empty OBJECT IDENTIFIER");
                }
                long jA = dev.epro.r0.S2941385686793915703.A(byteBufferSlice2);
                int iMin = (int) java.lang.Math.min(jA / 40, 2L);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(java.lang.Long.toString(iMin));
                sb.append('.');
                sb.append(java.lang.Long.toString(jA - ((long) (iMin * 40))));
                while (byteBufferSlice2.hasRemaining()) {
                    long jA2 = dev.epro.r0.S2941385686793915703.A(byteBufferSlice2);
                    sb.append('.');
                    sb.append(java.lang.Long.toString(jA2));
                }
                return sb.toString();
            }
        } else {
            if (java.lang.Integer.TYPE.equals(cls) || java.lang.Integer.class.equals(cls)) {
                java.math.BigInteger bigIntegerM = dev.epro.r0.S2941385686793915703.M(byteBufferSlice2);
                if (bigIntegerM.compareTo(java.math.BigInteger.valueOf(-2147483648L)) < 0 || bigIntegerM.compareTo(java.math.BigInteger.valueOf(2147483647L)) > 0) {
                    throw new dev.epro.r0.K6445406877359976829(java.lang.String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerM));
                }
                return java.lang.Integer.valueOf(bigIntegerM.intValue());
            }
            if (java.lang.Long.TYPE.equals(cls) || java.lang.Long.class.equals(cls)) {
                java.math.BigInteger bigIntegerM2 = dev.epro.r0.S2941385686793915703.M(byteBufferSlice2);
                if (bigIntegerM2.compareTo(java.math.BigInteger.valueOf(Long.MIN_VALUE)) < 0 || bigIntegerM2.compareTo(java.math.BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                    throw new dev.epro.r0.K6445406877359976829(java.lang.String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerM2));
                }
                return java.lang.Long.valueOf(bigIntegerM2.longValue());
            }
            if (java.math.BigInteger.class.equals(cls)) {
                return dev.epro.r0.S2941385686793915703.M(byteBufferSlice2);
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported conversion: ASN.1 ");
        sb2.append(q9140341247415722307);
        java.lang.String name = cls.getName();
        sb2.append(" to ");
        sb2.append(name);
        throw new dev.epro.r0.K6445406877359976829(sb2.toString());
    }

    public static final native java.lang.Enum G(java.util.List list, dev.epro.r0.Z569352264951016144 z569352264951016144, dev.epro.r0.U3828252728192849465 u3828252728192849465, dev.epro.r0.X7679275776392143441 x7679275776392143441, dev.epro.r0.K14749510448791472029 k14749510448791472029);

    public static final dev.epro.r0.L13135072960070674001 H(dev.epro.r0.L14576235570718031614 l14576235570718031614) {
        dev.epro.r0.L13135072960070674001 l13135072960070674001;
        l14576235570718031614.getClass();
        dev.epro.r0.F18341548724281518495 f18341548724281518495 = (dev.epro.r0.F18341548724281518495) l14576235570718031614.a(j);
        android.os.Bundle bundle = null;
        if (f18341548724281518495 == null) {
            dev.epro.r0.S10973172697741180971.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        dev.epro.r0.J5715778638296486773 j5715778638296486773 = (dev.epro.r0.J5715778638296486773) l14576235570718031614.a(k);
        if (j5715778638296486773 == null) {
            dev.epro.r0.S10973172697741180971.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        android.os.Bundle bundle2 = (android.os.Bundle) l14576235570718031614.a(l);
        java.lang.String str = (java.lang.String) l14576235570718031614.a(dev.epro.r0.Z860808776098365610.k);
        if (str == null) {
            dev.epro.r0.S10973172697741180971.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        dev.epro.r0.P14299581306856531209 p14299581306856531209Q = f18341548724281518495.b().q("androidx.lifecycle.internal.SavedStateHandlesProvider");
        dev.epro.r0.P14299581306856531209 p14299581306856531209 = p14299581306856531209Q instanceof dev.epro.r0.P14299581306856531209 ? p14299581306856531209Q : null;
        if (p14299581306856531209 == null) {
            dev.epro.r0.S10973172697741180971.m("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = N(j5715778638296486773).b;
        dev.epro.r0.L13135072960070674001 l131350729600706740012 = (dev.epro.r0.L13135072960070674001) linkedHashMap.get(str);
        if (l131350729600706740012 != null) {
            return l131350729600706740012;
        }
        p14299581306856531209.b();
        android.os.Bundle bundle3 = p14299581306856531209.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            android.os.Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = dev.epro.r0.O5354877807466160604.z((dev.epro.r0.H9390398899829886498[]) java.util.Arrays.copyOf(new dev.epro.r0.H9390398899829886498[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                p14299581306856531209.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            l13135072960070674001 = new dev.epro.r0.L13135072960070674001();
        } else {
            java.lang.ClassLoader classLoader = dev.epro.r0.L13135072960070674001.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            dev.epro.r0.H6457936572911484476 h6457936572911484476 = new dev.epro.r0.H6457936572911484476(bundle2.size());
            for (java.lang.String str2 : bundle2.keySet()) {
                str2.getClass();
                h6457936572911484476.put(str2, bundle2.get(str2));
            }
            l13135072960070674001 = new dev.epro.r0.L13135072960070674001(h6457936572911484476.b());
        }
        linkedHashMap.put(str, l13135072960070674001);
        return l13135072960070674001;
    }

    public static final native org.json.JSONObject I(dev.epro.r0.H7229686696833581033 h7229686696833581033);

    public static final void J(dev.epro.r0.F18341548724281518495 f18341548724281518495) {
        dev.epro.r0.Q14196755420833223976 q14196755420833223976 = f18341548724281518495.j().h;
        if (q14196755420833223976 != dev.epro.r0.Q14196755420833223976.b && q14196755420833223976 != dev.epro.r0.Q14196755420833223976.c) {
            dev.epro.r0.D11988991656201568495.t("Failed to enable `SavedStateHandle` for `", f18341548724281518495, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", q14196755420833223976, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (f18341548724281518495.b().q("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            dev.epro.r0.P14299581306856531209 p14299581306856531209 = new dev.epro.r0.P14299581306856531209(f18341548724281518495.b(), (dev.epro.r0.J5715778638296486773) f18341548724281518495);
            f18341548724281518495.b().y("androidx.lifecycle.internal.SavedStateHandlesProvider", p14299581306856531209);
            f18341548724281518495.j().a(new dev.epro.r0.E13936048342664803406(p14299581306856531209, (byte) 3));
        }
    }

    public static dev.epro.r0.P11184147566986477297 K(dev.epro.r0.Y12887846282176508602 y12887846282176508602, dev.epro.r0.J13328905385734298453 j13328905385734298453) throws dev.epro.r0.C5444222462668790382 {
        long j2 = j13328905385734298453.a;
        long j3 = j13328905385734298453.b + j2;
        long j4 = j13328905385734298453.d;
        if (j3 != j4) {
            java.lang.StringBuilder sbR = dev.epro.r0.E12098517352909843120.r("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ", j3);
            sbR.append(j4);
            throw new dev.epro.r0.C5444222462668790382(sbR.toString());
        }
        if (j2 < 32) {
            throw new dev.epro.r0.C5444222462668790382(dev.epro.r0.E12098517352909843120.k(j2, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
        }
        java.nio.ByteBuffer byteBufferB = y12887846282176508602.b(24, j2 - 24);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
        byteBufferB.order(byteOrder);
        if (byteBufferB.getLong(8) != 2334950737559900225L || byteBufferB.getLong(16) != 3617552046287187010L) {
            throw new dev.epro.r0.C5444222462668790382("No APK Signing Block before ZIP Central Directory");
        }
        long j5 = byteBufferB.getLong(0);
        if (j5 < byteBufferB.capacity() || j5 > 2147483639) {
            throw new dev.epro.r0.C5444222462668790382(dev.epro.r0.E12098517352909843120.k(j5, "APK Signing Block size out of range: "));
        }
        long j6 = (int) (8 + j5);
        long j7 = j2 - j6;
        if (j7 < 0) {
            throw new dev.epro.r0.C5444222462668790382(dev.epro.r0.E12098517352909843120.k(j7, "APK Signing Block offset out of range: "));
        }
        java.nio.ByteBuffer byteBufferB2 = y12887846282176508602.b(8, j7);
        byteBufferB2.order(byteOrder);
        long j8 = byteBufferB2.getLong(0);
        if (j8 != j5) {
            java.lang.StringBuilder sbR2 = dev.epro.r0.E12098517352909843120.r("APK Signing Block sizes in header and footer do not match: ", " vs ", j8);
            sbR2.append(j5);
            throw new dev.epro.r0.C5444222462668790382(sbR2.toString());
        }
        dev.epro.r0.B11059234153875532973 b11059234153875532973E = y12887846282176508602.e(j7, j6);
        dev.epro.r0.P11184147566986477297 p11184147566986477297 = new dev.epro.r0.P11184147566986477297();
        p11184147566986477297.a = j7;
        p11184147566986477297.b = b11059234153875532973E;
        return p11184147566986477297;
    }

    public static final dev.epro.r0.Z7022156542152740569 L() {
        dev.epro.r0.Z7022156542152740569 z7022156542152740569 = n;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        dev.epro.r0.Q17593287602150918564 q17593287602150918564 = new dev.epro.r0.Q17593287602150918564("Outlined.CloudOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = dev.epro.r0.A5540824790408504619.a;
        dev.epro.r0.H10765568533039107979 h10765568533039107979 = new dev.epro.r0.H10765568533039107979(dev.epro.r0.U10174709222559481877.b);
        dev.epro.r0.V14323974914327418545 v14323974914327418545D = dev.epro.r0.G11450220448113054352.d(24.0f, 15.0f);
        v14323974914327418545D.e(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        v14323974914327418545D.d(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        v14323974914327418545D.e(-1.33f, 0.0f, -2.57f, 0.36f, -3.65f, 0.97f);
        v14323974914327418545D.i(1.49f, 1.49f);
        v14323974914327418545D.d(10.51f, 6.17f, 11.23f, 6.0f, 12.0f, 6.0f);
        v14323974914327418545D.e(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        v14323974914327418545D.s(0.5f);
        v14323974914327418545D.f(19.0f);
        v14323974914327418545D.e(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        v14323974914327418545D.e(0.0f, 0.99f, -0.48f, 1.85f, -1.21f, 2.4f);
        v14323974914327418545D.i(1.41f, 1.41f);
        v14323974914327418545D.e(1.09f, -0.92f, 1.8f, -2.27f, 1.8f, -3.81f);
        dev.epro.r0.G11450220448113054352.w(v14323974914327418545D, 4.41f, 3.86f, 3.0f, 5.27f);
        v14323974914327418545D.i(2.77f, 2.77f);
        v14323974914327418545D.g(-0.42f);
        v14323974914327418545D.d(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        v14323974914327418545D.e(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        v14323974914327418545D.g(11.73f);
        v14323974914327418545D.i(2.0f, 2.0f);
        v14323974914327418545D.i(1.41f, -1.41f);
        v14323974914327418545D.h(4.41f, 3.86f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(6.0f, 18.0f);
        v14323974914327418545D.e(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        v14323974914327418545D.o(1.79f, -4.0f, 4.0f, -4.0f);
        v14323974914327418545D.g(1.73f);
        v14323974914327418545D.i(8.0f, 8.0f);
        v14323974914327418545D.f(6.0f);
        v14323974914327418545D.c();
        dev.epro.r0.Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, (dev.epro.r0.H10765568533039107979) null, 1.0f, 14336);
        dev.epro.r0.Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        n = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static dev.epro.r0.E6758797890281795541 M(int i2, int i3) {
        if (i3 < 50) {
            ads_mobile_sdk.xv.c("The maximum height set for the inline adaptive ad size was " + i3 + " dp, which is below the minimum recommended value of 50 dp.", null);
        }
        if (i3 >= 1) {
            return new dev.epro.r0.E6758797890281795541(null, i2, i3, 44);
        }
        dev.epro.r0.S10973172697741180971.i(dev.epro.r0.G6547577305291411977.n(i3, "Invalid maxHeight for inline adaptive banner: "));
        return null;
    }

    public static final dev.epro.r0.T12832465072585023763 N(dev.epro.r0.J5715778638296486773 j5715778638296486773) {
        dev.epro.r0.M7109848523774693442 m7109848523774693442 = new dev.epro.r0.M7109848523774693442();
        dev.epro.r0.L14576235570718031614 l14576235570718031614P = dev.epro.r0.S12227320117525376577.p(j5715778638296486773);
        l14576235570718031614P.getClass();
        dev.epro.r0.L3530692241870850490 l3530692241870850490I = j5715778638296486773.i();
        l3530692241870850490I.getClass();
        return new dev.epro.r0.J15730374346044043770(l3530692241870850490I, m7109848523774693442, l14576235570718031614P).L(dev.epro.r0.J17975719213314763068.a(dev.epro.r0.T12832465072585023763.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static int O(dev.epro.r0.Q4387574467995849280 q4387574467995849280) {
        int iOrdinal = q4387574467995849280.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                dev.epro.r0.Q11088980322693754445.l("Unsupported tag class: ", q4387574467995849280);
                return 0;
            }
        }
        return i2;
    }

    public static int P(dev.epro.r0.Q9140341247415722307 q9140341247415722307) {
        switch (q9140341247415722307.ordinal()) {
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 4;
            case 5:
            case 6:
                return 16;
            case 7:
                return 17;
            case 8:
                return 3;
            case 9:
                return 23;
            case 10:
                return 24;
            case 11:
                return 1;
            default:
                dev.epro.r0.Q11088980322693754445.l("Unsupported data type: ", q9140341247415722307);
                return 0;
        }
    }

    public static final dev.epro.r0.R7332211110819204002 Q(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        return i2 == 0 ? dev.epro.r0.R7332211110819204002.a : dev.epro.r0.R7332211110819204002.b;
    }

    public static final native dev.epro.r0.K3663149408946465593 R(int i2, java.lang.String str, java.lang.String str2);

    public static java.security.Provider U() {
        for (int i2 = 0; i2 < 3; i2++) {
            java.security.Provider provider = java.security.Security.getProvider(b[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static final dev.epro.r0.I11366018238968599357 V(dev.epro.r0.S6349823729575121924 s6349823729575121924) {
        return new dev.epro.r0.I11366018238968599357(java.lang.Math.round(s6349823729575121924.a), java.lang.Math.round(s6349823729575121924.b), java.lang.Math.round(s6349823729575121924.c), java.lang.Math.round(s6349823729575121924.d));
    }

    public static native boolean W(java.lang.Exception exc);

    public static java.lang.String X(int i2, int i3) {
        java.lang.String str;
        java.lang.String strY = Y(i2);
        if (i3 == 16) {
            str = "SEQUENCE";
        } else if (i3 == 17) {
            str = "SET";
        } else if (i3 == 23) {
            str = "UTC TIME";
        } else if (i3 != 24) {
            switch (i3) {
                case 1:
                    str = "BOOLEAN";
                    break;
                case 2:
                    str = "INTEGER";
                    break;
                case 3:
                    str = "BIT STRING";
                    break;
                case 4:
                    str = "OCTET STRING";
                    break;
                case 5:
                    str = "NULL";
                    break;
                case 6:
                    str = "OBJECT IDENTIFIER";
                    break;
                default:
                    str = "0x" + java.lang.Integer.toHexString(i3);
                    break;
            }
        } else {
            str = "GENERALIZED TIME";
        }
        return strY.isEmpty() ? str : dev.epro.r0.G6547577305291411977.s(strY, " ", str);
    }

    public static java.lang.String Y(int i2) {
        if (i2 == 0) {
            return "UNIVERSAL";
        }
        if (i2 == 1) {
            return "APPLICATION";
        }
        if (i2 == 2) {
            return "";
        }
        if (i2 == 3) {
            return "PRIVATE";
        }
        dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.n(i2, "Unsupported type class: "));
        return null;
    }

    public static final native java.lang.String Z(dev.epro.r0.A16842337154698931828 a16842337154698931828);

    public static final native dev.epro.r0.K3663149408946465593 a0(dev.epro.r0.Z12230432157744414222 z12230432157744414222);

    public static final native dev.epro.r0.K6255634571546489463 b0(dev.epro.r0.A16842337154698931828 a16842337154698931828, java.lang.String str);

    public static final native dev.epro.r0.A16842337154698931828 c0(dev.epro.r0.K6255634571546489463 k6255634571546489463);

    public static final native void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.F4096073349764486348 f40960733497644863483, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final java.lang.Object d0(dev.epro.r0.G8001132634698687269 g8001132634698687269, java.lang.Object obj, java.lang.Object obj2, dev.epro.r0.L12639328004344855510 l12639328004344855510, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        java.lang.Object objC0 = dev.epro.r0.S10823041268949770285.c0(g8001132634698687269, obj2);
        try {
            dev.epro.r0.P4401478981656030991 p4401478981656030991 = new dev.epro.r0.P4401478981656030991(r4833348786910499294, g8001132634698687269);
            dev.epro.r0.V12319504402545346730.s(2, l12639328004344855510);
            java.lang.Object objInvoke = l12639328004344855510.invoke(obj, p4401478981656030991);
            dev.epro.r0.S10823041268949770285.X(g8001132634698687269, objC0);
            if (objInvoke == dev.epro.r0.Z3437138737604933638.a) {
                r4833348786910499294.getClass();
            }
            return objInvoke;
        } catch (java.lang.Throwable th) {
            dev.epro.r0.S10823041268949770285.X(g8001132634698687269, objC0);
            throw th;
        }
    }

    public static final native void e(int i2, int i3, boolean z, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i4);

    public static final native dev.epro.r0.Z12230432157744414222 e0(dev.epro.r0.Z12230432157744414222 z12230432157744414222);

    public static final native void f(dev.epro.r0.K13211986169097943562 k13211986169097943562, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(int i2, dev.epro.r0.M3727281027331139839 m3727281027331139839);

    public static final dev.epro.r0.I11366018238968599357 k(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new dev.epro.r0.I11366018238968599357(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027d  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(dev.epro.r0.I1722681268793429505 r36, dev.epro.r0.W5896017744614017491 r37, dev.epro.r0.Y11743982849937672487 r38, dev.epro.r0.T1241271073913685060 r39, dev.epro.r0.J3971902247911265635 r40, boolean r41, dev.epro.r0.N11829648573770870927 r42, dev.epro.r0.A6527624962738679687 r43, dev.epro.r0.B13906740428466697912 r44, dev.epro.r0.F4096073349764486348 r45, dev.epro.r0.M3727281027331139839 r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C775827382551829194.l(dev.epro.r0.I1722681268793429505, dev.epro.r0.W5896017744614017491, dev.epro.r0.Y11743982849937672487, dev.epro.r0.T1241271073913685060, dev.epro.r0.J3971902247911265635, boolean, dev.epro.r0.N11829648573770870927, dev.epro.r0.A6527624962738679687, dev.epro.r0.B13906740428466697912, dev.epro.r0.F4096073349764486348, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void m(dev.epro.r0.Q10906850697363992683 q10906850697363992683, boolean z, boolean z2, boolean z3, boolean z4, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.B13729205492206812220 b137292054922068122204, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void n(final dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, final int i2) {
        int i3;
        m3727281027331139839.b0(-1646555525);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(b13729205492206812220) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 3) != 2)) {
            t((android.view.View) m3727281027331139839.j(dev.epro.r0.T15795698139970521497.f), (dev.epro.r0.R8540738700654750557) m3727281027331139839.j(dev.epro.r0.Y238707362170117896.h), b13729205492206812220, m3727281027331139839, (i3 << 6) & 896);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.L12639328004344855510() { // from class: dev.epro.r0.E1616756771583307978
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int iP = dev.epro.r0.V16504496955554646429.p(i2 | 1);
                    dev.epro.r0.C775827382551829194.n(b13729205492206812220, (dev.epro.r0.M3727281027331139839) obj, iP);
                    return dev.epro.r0.O9245300239821758723.a;
                }
            };
        }
    }

    public static final native void o(boolean z, boolean z2, boolean z3, boolean z4, int i2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.B13729205492206812220 b137292054922068122204, dev.epro.r0.B13729205492206812220 b137292054922068122205, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3);

    public static final native void p(boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.B13729205492206812220 b137292054922068122204, dev.epro.r0.B13729205492206812220 b137292054922068122205, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3);

    public static final native void q(boolean z, boolean z2, int i2, boolean z3, boolean z4, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3);

    public static final native void r(dev.epro.r0.K6255634571546489463 k6255634571546489463, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.B13729205492206812220 b137292054922068122202, dev.epro.r0.B13729205492206812220 b137292054922068122203, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.B13729205492206812220 b137292054922068122204, dev.epro.r0.B13729205492206812220 b137292054922068122205, dev.epro.r0.B13729205492206812220 b137292054922068122206, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.I1722681268793429505 i1722681268793429505, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(boolean z, java.util.Set set, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.F4096073349764486348 f40960733497644863483, dev.epro.r0.F4096073349764486348 f40960733497644863484, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final void t(android.view.View view, dev.epro.r0.R8540738700654750557 r8540738700654750557, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2) {
        int i3;
        m3727281027331139839.b0(-1319522472);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(view) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= m3727281027331139839.f(r8540738700654750557) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= m3727281027331139839.h(b13729205492206812220) ? 256 : 128;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 147) != 146)) {
            boolean zH = m3727281027331139839.h(view) | ((i3 & 896) == 256);
            java.lang.Object objM = m3727281027331139839.M();
            if (zH || objM == dev.epro.r0.O9023047933786425027.a) {
                objM = new dev.epro.r0.B2138252231653711516(view, b13729205492206812220, (byte) 3);
                m3727281027331139839.k0(objM);
            }
            dev.epro.r0.Q13169198992966610970.d(view, r8540738700654750557, (dev.epro.r0.F4096073349764486348) objM, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        dev.epro.r0.V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new dev.epro.r0.N18429394832860979851(view, r8540738700654750557, b13729205492206812220, i2, (byte) 8);
        }
    }

    public static final native void u(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.F4096073349764486348 f40960733497644863483, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i2);

    public static final native void v(int i2, dev.epro.r0.B13729205492206812220 b13729205492206812220, dev.epro.r0.M3727281027331139839 m3727281027331139839, boolean z);

    public static final native void w(java.lang.String str, int i2, java.util.List list, dev.epro.r0.F4096073349764486348 f4096073349764486348, dev.epro.r0.B13729205492206812220 b13729205492206812220, java.lang.Integer num, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final native void x(java.lang.String str, int i2, dev.epro.r0.F4096073349764486348 f4096073349764486348, boolean z, java.lang.Integer num, java.lang.String str2, boolean z2, dev.epro.r0.F4096073349764486348 f40960733497644863482, dev.epro.r0.M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static int y(android.content.Context context, int i2) {
        android.content.res.Resources resources = context.getApplicationContext().getResources();
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (i2 == resources.getConfiguration().orientation || i2 == 0) ? dev.epro.r0.T18016951143603335921.Z(displayMetrics.heightPixels / displayMetrics.density) : dev.epro.r0.T18016951143603335921.Z(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static ads_mobile_sdk.v1 z(int i2) throws java.lang.Exception {
        ads_mobile_sdk.v1 v1Var = (ads_mobile_sdk.v1) ads_mobile_sdk.v1.c.get(java.lang.Integer.valueOf(i2));
        if (v1Var != null) {
            return v1Var;
        }
        throw new java.lang.Exception("Invalid value for enum " + dev.epro.r0.C775827382551829194.class.getName() + ": " + i2);
    }

    public abstract android.view.View S(int i2);

    public abstract boolean T();
}
