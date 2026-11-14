package dev.epro.r0;

import ads_mobile_sdk.v1;
import ads_mobile_sdk.xv;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class C775827382551829194 {
    public static final byte[] a;
    public static final String[] b;
    public static final Y4261039727803185691 c;
    public static final Y4261039727803185691 d;
    public static final float e;
    public static final Y4261039727803185691 f;
    public static final float g;
    public static final Y4261039727803185691 h;
    public static final M5459415309190684092 i;
    public static final J3301701597851028733 j;
    public static final M10846389789027735899 k;
    public static final T15504973625601650233 l;
    public static final Z14997871575210439922 m;
    public static Z7022156542152740569 n;

    /* renamed from: o, reason: collision with root package name */
    public static Z7022156542152740569 f190o;
    public static Z7022156542152740569 p;

    static {
        izmyclvb.oeynnivvrnts0(198);
        a = new byte[0];
        b = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        c = Y4261039727803185691.q;
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.h;
        d = y4261039727803185691;
        e = 0.1f;
        f = y4261039727803185691;
        g = 0.38f;
        h = Y4261039727803185691.g;
        i = new M5459415309190684092((byte) 6);
        j = new J3301701597851028733((byte) 27);
        byte b2 = 28;
        k = new M10846389789027735899(b2);
        l = new T15504973625601650233(b2);
        m = new Z14997871575210439922((byte) 25);
    }

    public static E6758797890281795541 A(Context context, int i2, int i3) {
        return new E6758797890281795541(null, i2, Math.max(Math.min(i2 > 655 ? T18016951143603335921.Z((i2 / 728.0f) * 90.0f) : i2 > 632 ? 81 : i2 > 526 ? T18016951143603335921.Z((i2 / 468.0f) * 60.0f) : i2 > 432 ? 68 : T18016951143603335921.Z((i2 / 320.0f) * 50.0f), Math.min(90, T18016951143603335921.Y(y(context, i3) * 0.15d))), 50), 52);
    }

    public static final native void B(HttpURLConnection httpURLConnection, H7229686696833581033 h7229686696833581033);

    public static E6758797890281795541 C(Context context, int i2, int i3) {
        return new E6758797890281795541(null, i2, Math.max(Math.min(Math.max(100, T18016951143603335921.Z((i2 / 320.0f) * 100.0f)), Math.min(150, T18016951143603335921.Y(y(context, i3) * 0.2d))), 50), 28);
    }

    public static long D(int i2, R7332211110819204002 r7332211110819204002) {
        int i3 = H7629649715776350322.a[r7332211110819204002.ordinal()];
        int i4 = -1;
        if (i3 != -1) {
            i4 = 1;
            if (i3 == 1) {
                i4 = 0;
            } else if (i3 != 2) {
                Z3383101362411723454.g();
                return 0L;
            }
        }
        return (i2 << 32) | (i4 & 4294967295L);
    }

    public static W1972671267364756056 E() {
        return new V697849047308847220(O9245300239821758723.a, B14824868959299866349.k);
    }

    public static Object F(Q9140341247415722307 q9140341247415722307, I15162792415829416729 i15162792415829416729, Class cls) {
        if (ByteBuffer.class.equals(cls)) {
            return ((ByteBuffer) i15162792415829416729.e).slice();
        }
        if (byte[].class.equals(cls)) {
            ByteBuffer slice = ((ByteBuffer) i15162792415829416729.e).slice();
            if (!slice.hasRemaining()) {
                return a;
            }
            byte[] bArr = new byte[slice.remaining()];
            slice.get(bArr);
            return bArr;
        }
        if (V12599130403671467129.class.equals(cls)) {
            return new V12599130403671467129(((ByteBuffer) i15162792415829416729.d).slice());
        }
        ByteBuffer slice2 = ((ByteBuffer) i15162792415829416729.e).slice();
        int ordinal = q9140341247415722307.ordinal();
        if (ordinal == 1) {
            L13834037291440535306 l13834037291440535306 = (L13834037291440535306) cls.getDeclaredAnnotation(L13834037291440535306.class);
            if (l13834037291440535306 != null && l13834037291440535306.type() == Q9140341247415722307.b) {
                return S2941385686793915703.R(i15162792415829416729, cls);
            }
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 5) {
                    switch (ordinal) {
                        case 9:
                        case 10:
                            if (String.class.equals(cls)) {
                                byte[] bArr2 = new byte[slice2.remaining()];
                                slice2.get(bArr2);
                                return new String(bArr2);
                            }
                            break;
                        case 11:
                            if (Boolean.TYPE.equals(cls)) {
                                if (slice2.remaining() == 1) {
                                    return new Boolean(slice2.get() != 0);
                                }
                                throw new K6445406877359976829("Incorrect encoded size of boolean value: " + slice2.remaining());
                            }
                            break;
                    }
                } else {
                    L13834037291440535306 l138340372914405353062 = (L13834037291440535306) cls.getDeclaredAnnotation(L13834037291440535306.class);
                    if (l138340372914405353062 != null && l138340372914405353062.type() == Q9140341247415722307.c) {
                        return S2941385686793915703.S(i15162792415829416729, cls, false);
                    }
                }
            } else if (String.class.equals(cls)) {
                if (!slice2.hasRemaining()) {
                    throw new K6445406877359976829("Empty OBJECT IDENTIFIER");
                }
                long A = S2941385686793915703.A(slice2);
                int min = (int) Math.min(A / 40, 2L);
                StringBuilder sb = new StringBuilder();
                sb.append(Long.toString(min));
                sb.append('.');
                sb.append(Long.toString(A - (min * 40)));
                while (slice2.hasRemaining()) {
                    long A2 = S2941385686793915703.A(slice2);
                    sb.append('.');
                    sb.append(Long.toString(A2));
                }
                return sb.toString();
            }
        } else {
            if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                BigInteger M = S2941385686793915703.M(slice2);
                if (M.compareTo(BigInteger.valueOf(-2147483648L)) < 0 || M.compareTo(BigInteger.valueOf(2147483647L)) > 0) {
                    throw new K6445406877359976829(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", M));
                }
                return Integer.valueOf(M.intValue());
            }
            if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                BigInteger M2 = S2941385686793915703.M(slice2);
                if (M2.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || M2.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                    throw new K6445406877359976829(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", M2));
                }
                return Long.valueOf(M2.longValue());
            }
            if (BigInteger.class.equals(cls)) {
                return S2941385686793915703.M(slice2);
            }
        }
        StringBuilder sb2 = new StringBuilder("Unsupported conversion: ASN.1 ");
        sb2.append(q9140341247415722307);
        String name = cls.getName();
        sb2.append(" to ");
        sb2.append(name);
        throw new K6445406877359976829(sb2.toString());
    }

    public static final native Enum G(List list, Z569352264951016144 z569352264951016144, U3828252728192849465 u3828252728192849465, X7679275776392143441 x7679275776392143441, K14749510448791472029 k14749510448791472029);

    public static final L13135072960070674001 H(L14576235570718031614 l14576235570718031614) {
        L13135072960070674001 l13135072960070674001;
        l14576235570718031614.getClass();
        F18341548724281518495 f18341548724281518495 = (F18341548724281518495) l14576235570718031614.a(j);
        Bundle bundle = null;
        if (f18341548724281518495 == null) {
            S10973172697741180971.j("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        J5715778638296486773 j5715778638296486773 = (J5715778638296486773) l14576235570718031614.a(k);
        if (j5715778638296486773 == null) {
            S10973172697741180971.j("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) l14576235570718031614.a(l);
        String str = (String) l14576235570718031614.a(Z860808776098365610.k);
        if (str == null) {
            S10973172697741180971.j("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        L469992840463392687 q = f18341548724281518495.b().q("androidx.lifecycle.internal.SavedStateHandlesProvider");
        P14299581306856531209 p14299581306856531209 = q instanceof P14299581306856531209 ? (P14299581306856531209) q : null;
        if (p14299581306856531209 == null) {
            S10973172697741180971.m("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = N(j5715778638296486773).b;
        L13135072960070674001 l131350729600706740012 = (L13135072960070674001) linkedHashMap.get(str);
        if (l131350729600706740012 != null) {
            return l131350729600706740012;
        }
        p14299581306856531209.b();
        Bundle bundle3 = p14299581306856531209.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
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
            l13135072960070674001 = new L13135072960070674001();
        } else {
            ClassLoader classLoader = L13135072960070674001.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            H6457936572911484476 h6457936572911484476 = new H6457936572911484476(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                str2.getClass();
                h6457936572911484476.put(str2, bundle2.get(str2));
            }
            l13135072960070674001 = new L13135072960070674001(h6457936572911484476.b());
        }
        linkedHashMap.put(str, l13135072960070674001);
        return l13135072960070674001;
    }

    public static final native JSONObject I(H7229686696833581033 h7229686696833581033);

    public static final void J(F18341548724281518495 f18341548724281518495) {
        Q14196755420833223976 q14196755420833223976 = ((I1283052979100930176) f18341548724281518495.j()).h;
        if (q14196755420833223976 != Q14196755420833223976.b && q14196755420833223976 != Q14196755420833223976.c) {
            D11988991656201568495.t("Failed to enable `SavedStateHandle` for `", f18341548724281518495, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", q14196755420833223976, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (f18341548724281518495.b().q("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            P14299581306856531209 p14299581306856531209 = new P14299581306856531209(f18341548724281518495.b(), (J5715778638296486773) f18341548724281518495);
            f18341548724281518495.b().y("androidx.lifecycle.internal.SavedStateHandlesProvider", p14299581306856531209);
            f18341548724281518495.j().a(new E13936048342664803406(p14299581306856531209, (byte) 3));
        }
    }

    public static P11184147566986477297 K(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453) {
        long j2 = j13328905385734298453.a;
        long j3 = j13328905385734298453.b + j2;
        long j4 = j13328905385734298453.d;
        if (j3 != j4) {
            StringBuilder r = E12098517352909843120.r("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: ", ", EoCD start: ", j3);
            r.append(j4);
            throw new C5444222462668790382(r.toString());
        }
        if (j2 < 32) {
            throw new C5444222462668790382(E12098517352909843120.k(j2, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
        }
        ByteBuffer b2 = y12887846282176508602.b(24, j2 - 24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b2.order(byteOrder);
        if (b2.getLong(8) != 2334950737559900225L || b2.getLong(16) != 3617552046287187010L) {
            throw new C5444222462668790382("No APK Signing Block before ZIP Central Directory");
        }
        long j5 = b2.getLong(0);
        if (j5 < b2.capacity() || j5 > 2147483639) {
            throw new C5444222462668790382(E12098517352909843120.k(j5, "APK Signing Block size out of range: "));
        }
        long j6 = (int) (8 + j5);
        long j7 = j2 - j6;
        if (j7 < 0) {
            throw new C5444222462668790382(E12098517352909843120.k(j7, "APK Signing Block offset out of range: "));
        }
        ByteBuffer b3 = y12887846282176508602.b(8, j7);
        b3.order(byteOrder);
        long j8 = b3.getLong(0);
        if (j8 != j5) {
            StringBuilder r2 = E12098517352909843120.r("APK Signing Block sizes in header and footer do not match: ", " vs ", j8);
            r2.append(j5);
            throw new C5444222462668790382(r2.toString());
        }
        B11059234153875532973 e2 = y12887846282176508602.e(j7, j6);
        P11184147566986477297 p11184147566986477297 = new P11184147566986477297();
        p11184147566986477297.a = j7;
        p11184147566986477297.b = e2;
        return p11184147566986477297;
    }

    public static final Z7022156542152740569 L() {
        Z7022156542152740569 z7022156542152740569 = n;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.CloudOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 d2 = G11450220448113054352.d(24.0f, 15.0f);
        d2.e(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        d2.d(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        d2.e(-1.33f, 0.0f, -2.57f, 0.36f, -3.65f, 0.97f);
        d2.i(1.49f, 1.49f);
        d2.d(10.51f, 6.17f, 11.23f, 6.0f, 12.0f, 6.0f);
        d2.e(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        d2.s(0.5f);
        d2.f(19.0f);
        d2.e(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        d2.e(0.0f, 0.99f, -0.48f, 1.85f, -1.21f, 2.4f);
        d2.i(1.41f, 1.41f);
        d2.e(1.09f, -0.92f, 1.8f, -2.27f, 1.8f, -3.81f);
        G11450220448113054352.w(d2, 4.41f, 3.86f, 3.0f, 5.27f);
        d2.i(2.77f, 2.77f);
        d2.g(-0.42f);
        d2.d(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        d2.e(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        d2.g(11.73f);
        d2.i(2.0f, 2.0f);
        d2.i(1.41f, -1.41f);
        d2.h(4.41f, 3.86f);
        d2.c();
        d2.j(6.0f, 18.0f);
        d2.e(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        d2.o(1.79f, -4.0f, 4.0f, -4.0f);
        d2.g(1.73f);
        d2.i(8.0f, 8.0f);
        d2.f(6.0f);
        d2.c();
        Q17593287602150918564.a(q17593287602150918564, d2.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        n = b2;
        return b2;
    }

    public static E6758797890281795541 M(int i2, int i3) {
        if (i3 < 50) {
            xv.c("The maximum height set for the inline adaptive ad size was " + i3 + " dp, which is below the minimum recommended value of 50 dp.", null);
        }
        if (i3 >= 1) {
            return new E6758797890281795541(null, i2, i3, 44);
        }
        S10973172697741180971.i(G6547577305291411977.n(i3, "Invalid maxHeight for inline adaptive banner: "));
        return null;
    }

    public static final T12832465072585023763 N(J5715778638296486773 j5715778638296486773) {
        M7109848523774693442 m7109848523774693442 = new M7109848523774693442();
        L14576235570718031614 p2 = S12227320117525376577.p(j5715778638296486773);
        p2.getClass();
        L3530692241870850490 i2 = j5715778638296486773.i();
        i2.getClass();
        return (T12832465072585023763) new J15730374346044043770(i2, m7109848523774693442, p2).L(J17975719213314763068.a(T12832465072585023763.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static int O(Q4387574467995849280 q4387574467995849280) {
        int ordinal = q4387574467995849280.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                Q11088980322693754445.l("Unsupported tag class: ", q4387574467995849280);
                return 0;
            }
        }
        return i2;
    }

    public static int P(Q9140341247415722307 q9140341247415722307) {
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
                Q11088980322693754445.l("Unsupported data type: ", q9140341247415722307);
                return 0;
        }
    }

    public static final R7332211110819204002 Q(long j2) {
        int i2 = (int) (j2 & 4294967295L);
        if (i2 < 0) {
            return null;
        }
        return i2 == 0 ? R7332211110819204002.a : R7332211110819204002.b;
    }

    public static final native K3663149408946465593 R(int i2, String str, String str2);

    public static Provider U() {
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(b[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static final I11366018238968599357 V(S6349823729575121924 s6349823729575121924) {
        return new I11366018238968599357(Math.round(s6349823729575121924.a), Math.round(s6349823729575121924.b), Math.round(s6349823729575121924.c), Math.round(s6349823729575121924.d));
    }

    public static native boolean W(Exception exc);

    public static String X(int i2, int i3) {
        String str;
        String Y = Y(i2);
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
                    str = "0x" + Integer.toHexString(i3);
                    break;
            }
        } else {
            str = "GENERALIZED TIME";
        }
        return Y.isEmpty() ? str : G6547577305291411977.s(Y, " ", str);
    }

    public static String Y(int i2) {
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
        S10973172697741180971.j(G6547577305291411977.n(i2, "Unsupported type class: "));
        return null;
    }

    public static final native String Z(A16842337154698931828 a16842337154698931828);

    public static final native K3663149408946465593 a0(Z12230432157744414222 z12230432157744414222);

    public static final native K6255634571546489463 b0(A16842337154698931828 a16842337154698931828, String str);

    public static final native A16842337154698931828 c0(K6255634571546489463 k6255634571546489463);

    public static final native void d(String str, String str2, String str3, String str4, boolean z, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final Object d0(G8001132634698687269 g8001132634698687269, Object obj, Object obj2, L12639328004344855510 l12639328004344855510, R4833348786910499294 r4833348786910499294) {
        Object c0 = S10823041268949770285.c0(g8001132634698687269, obj2);
        try {
            P4401478981656030991 p4401478981656030991 = new P4401478981656030991(r4833348786910499294, g8001132634698687269);
            V12319504402545346730.s(2, l12639328004344855510);
            Object invoke = l12639328004344855510.invoke(obj, p4401478981656030991);
            S10823041268949770285.X(g8001132634698687269, c0);
            if (invoke == Z3437138737604933638.a) {
                r4833348786910499294.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            S10823041268949770285.X(g8001132634698687269, c0);
            throw th;
        }
    }

    public static final native void e(int i2, int i3, boolean z, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i4);

    public static final native Z12230432157744414222 e0(Z12230432157744414222 z12230432157744414222);

    public static final native void f(K13211986169097943562 k13211986169097943562, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(int i2, M3727281027331139839 m3727281027331139839);

    public static final I11366018238968599357 k(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new I11366018238968599357(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0275, code lost:
    
        if (r46.g(false) != false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02f6  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, byte] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(dev.epro.r0.I1722681268793429505 r36, dev.epro.r0.W5896017744614017491 r37, dev.epro.r0.Y11743982849937672487 r38, dev.epro.r0.T1241271073913685060 r39, dev.epro.r0.J3971902247911265635 r40, boolean r41, dev.epro.r0.N11829648573770870927 r42, dev.epro.r0.A6527624962738679687 r43, dev.epro.r0.B13906740428466697912 r44, dev.epro.r0.F4096073349764486348 r45, dev.epro.r0.M3727281027331139839 r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.C775827382551829194.l(dev.epro.r0.I1722681268793429505, dev.epro.r0.W5896017744614017491, dev.epro.r0.Y11743982849937672487, dev.epro.r0.T1241271073913685060, dev.epro.r0.J3971902247911265635, boolean, dev.epro.r0.N11829648573770870927, dev.epro.r0.A6527624962738679687, dev.epro.r0.B13906740428466697912, dev.epro.r0.F4096073349764486348, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void m(Q10906850697363992683 q10906850697363992683, boolean z, boolean z2, boolean z3, boolean z4, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, B13729205492206812220 b137292054922068122204, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final void n(final B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, final int i2) {
        int i3;
        m3727281027331139839.b0(-1646555525);
        if ((i2 & 6) == 0) {
            i3 = (m3727281027331139839.h(b13729205492206812220) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (m3727281027331139839.R(i3 & 1, (i3 & 3) != 2)) {
            t((View) m3727281027331139839.j(T15795698139970521497.f), (R8540738700654750557) m3727281027331139839.j(Y238707362170117896.h), b13729205492206812220, m3727281027331139839, (i3 << 6) & 896);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new L12639328004344855510() { // from class: dev.epro.r0.E1616756771583307978
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = V16504496955554646429.p(i2 | 1);
                    C775827382551829194.n(b13729205492206812220, (M3727281027331139839) obj, p2);
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static final native void o(boolean z, boolean z2, boolean z3, boolean z4, int i2, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, B13729205492206812220 b137292054922068122204, B13729205492206812220 b137292054922068122205, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void p(boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, B13729205492206812220 b137292054922068122204, B13729205492206812220 b137292054922068122205, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void q(boolean z, boolean z2, int i2, boolean z3, boolean z4, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void r(K6255634571546489463 k6255634571546489463, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122204, B13729205492206812220 b137292054922068122205, B13729205492206812220 b137292054922068122206, F4096073349764486348 f40960733497644863482, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(boolean z, Set set, String str, String str2, String str3, String str4, boolean z2, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, F4096073349764486348 f40960733497644863484, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final void t(View view, R8540738700654750557 r8540738700654750557, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2) {
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
            boolean h2 = m3727281027331139839.h(view) | ((i3 & 896) == 256);
            Object M = m3727281027331139839.M();
            if (h2 || M == O9023047933786425027.a) {
                M = new B2138252231653711516((Object) view, (Object) b13729205492206812220, (byte) 3);
                m3727281027331139839.k0(M);
            }
            Q13169198992966610970.d(view, r8540738700654750557, (F4096073349764486348) M, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            t.d = new N18429394832860979851((Object) view, (Object) r8540738700654750557, (Object) b13729205492206812220, i2, (byte) 8);
        }
    }

    public static final native void u(String str, String str2, String str3, String str4, boolean z, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void v(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, boolean z);

    public static final native void w(String str, int i2, List list, F4096073349764486348 f4096073349764486348, B13729205492206812220 b13729205492206812220, Integer num, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static final native void x(String str, int i2, F4096073349764486348 f4096073349764486348, boolean z, Integer num, String str2, boolean z2, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i3, int i4);

    public static int y(Context context, int i2) {
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (i2 == resources.getConfiguration().orientation || i2 == 0) ? T18016951143603335921.Z(displayMetrics.heightPixels / displayMetrics.density) : T18016951143603335921.Z(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static v1 z(int i2) {
        v1 v1Var = (v1) v1.c.get(Integer.valueOf(i2));
        if (v1Var != null) {
            return v1Var;
        }
        throw new Exception("Invalid value for enum " + C775827382551829194.class.getName() + ": " + i2);
    }

    public abstract View S(int i2);

    public abstract boolean T();
}
