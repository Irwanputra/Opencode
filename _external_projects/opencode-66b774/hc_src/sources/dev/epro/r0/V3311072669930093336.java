package dev.epro.r0;

import ads_mobile_sdk.d62;
import ads_mobile_sdk.im0;
import ads_mobile_sdk.jh3;
import ads_mobile_sdk.ug2;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public abstract class V3311072669930093336 {
    public static Z7022156542152740569 a = null;
    public static final int b = 9;
    public static final int c = 6;
    public static final int d = 10;
    public static final int e = 5;
    public static final int f = 15;
    public static final int g = 48;

    static {
        izmyclvb.qgayjvbiagej2(396);
    }

    public static final native void a(boolean z, boolean z2, boolean z3, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i);

    public static P9515452679798920290 b() {
        return new P9515452679798920290(null);
    }

    public static final native void c(Set set, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i);

    public static final native void d(Q7430090668634766253 q7430090668634766253, M3727281027331139839 m3727281027331139839, int i);

    public static final native void e(Q7430090668634766253 q7430090668634766253, M3727281027331139839 m3727281027331139839, int i);

    public static jh3 f(I16631908410500040363 i16631908410500040363) {
        im0 im0Var;
        if (i16631908410500040363 != null) {
            K15572083692188606544 w = i16631908410500040363.w("fill_definition");
            int j = w != null ? w.j() : 0;
            im0[] values = im0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    im0Var = null;
                    break;
                }
                im0Var = values[i];
                if (im0Var.a == j) {
                    break;
                }
                i++;
            }
            im0 im0Var2 = im0.INVALID;
            im0 im0Var3 = im0Var == null ? im0Var2 : im0Var;
            if (im0Var3 != im0Var2) {
                K15572083692188606544 w2 = i16631908410500040363.w("nofill_retention_time_ms");
                long n = w2 != null ? w2.n() : 0L;
                K15572083692188606544 w3 = i16631908410500040363.w("callback_delay_ms");
                long n2 = w3 != null ? w3.n() : 50L;
                K15572083692188606544 w4 = i16631908410500040363.w("nofills_before_throttle");
                int j2 = w4 != null ? w4.j() : 0;
                K15572083692188606544 w5 = i16631908410500040363.w("post_throttle_nofills_before_throttle");
                Integer valueOf = w5 != null ? Integer.valueOf(w5.j()) : null;
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
                return new jh3(j2, valueOf, M9216324016624295870.a0(n, n13798149404328803870), M9216324016624295870.a0(n2, n13798149404328803870), im0Var3);
            }
        }
        return null;
    }

    public static ug2 g(I16631908410500040363 i16631908410500040363) {
        Map map;
        try {
            Object b2 = new F14240031463097426304().b(I16631908410500040363.class, d62.a(i16631908410500040363, "extra_query_params", "{}"));
            b2.getClass();
            map = new LinkedHashMap();
            Iterator it = ((S11564727846197427291) ((I16631908410500040363) b2).a.entrySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                S8064361206571326475 a2 = ((L622219180424329983) it).a();
                String str = (String) a2.getKey();
                K15572083692188606544 k15572083692188606544 = (K15572083692188606544) a2.getValue();
                str.getClass();
                String p = k15572083692188606544.p();
                p.getClass();
                map.put(str, p);
            }
        } catch (Exception e2) {
            ArrayList arrayList = G6547577305291411977.l(e2).s;
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            arrayList.add(message);
            map = null;
        }
        if (map == null) {
            map = X9852054718446117252.a;
        }
        return new ug2(d62.a(i16631908410500040363, "enable_prewarming", false), d62.a(i16631908410500040363, "prefetch_url", ""), d62.a(i16631908410500040363, "skip_offline_notification_flow", false), d62.a(i16631908410500040363, "enable_hsdp_service", false), d62.a(i16631908410500040363, "target_package", ""), d62.a(i16631908410500040363, "hsdp_invocation_callback_bitmask", 0), d62.a(i16631908410500040363, "referrer", ""), map);
    }

    public static final void h(long j) {
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        if ((j & 1095216660480L) == 0) {
            N17315172036749737048.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final native String i(String str, String str2);

    public static final Z7022156542152740569 j() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Public", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 d2 = G11450220448113054352.d(12.0f, 2.0f);
        d2.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        d2.o(4.48f, 10.0f, 10.0f, 10.0f);
        d2.o(10.0f, -4.48f, 10.0f, -10.0f);
        d2.n(17.52f, 2.0f, 12.0f, 2.0f);
        d2.c();
        d2.j(4.0f, 12.0f);
        d2.e(0.0f, -0.61f, 0.08f, -1.21f, 0.21f, -1.78f);
        d2.h(8.99f, 15.0f);
        d2.s(1.0f);
        d2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d2.s(1.93f);
        d2.d(7.06f, 19.43f, 4.0f, 16.07f, 4.0f, 12.0f);
        d2.c();
        d2.j(17.89f, 17.4f);
        d2.e(-0.26f, -0.81f, -1.0f, -1.4f, -1.9f, -1.4f);
        d2.g(-1.0f);
        d2.s(-3.0f);
        d2.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d2.g(-6.0f);
        d2.s(-2.0f);
        d2.g(2.0f);
        d2.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d2.h(10.99f, 7.0f);
        d2.g(2.0f);
        d2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d2.s(-0.41f);
        d2.d(17.92f, 5.77f, 20.0f, 8.65f, 20.0f, 12.0f);
        d2.e(0.0f, 2.08f, -0.81f, 3.98f, -2.11f, 5.4f);
        d2.c();
        Q17593287602150918564.a(q17593287602150918564, d2.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        a = b2;
        return b2;
    }

    public static final long k(double d2) {
        return n((float) d2, 4294967296L);
    }

    public static final long l(int i) {
        return n(i, 4294967296L);
    }

    public static final native boolean m(String str);

    public static final long n(float f2, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f2) & 4294967295L);
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        return floatToRawIntBits;
    }

    public static final native D10030753892766079115 o(String str);

    public static void p(byte[] bArr, T14597605096299173136 t14597605096299173136, P15728539964912394135 p15728539964912394135) {
        ArrayList arrayList;
        try {
            ArrayList m = E7125458317232359087.m(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
            int i = 0;
            while (true) {
                int size = m.size();
                arrayList = p15728539964912394135.c;
                if (i >= size) {
                    break;
                }
                arrayList.add(((D6018894238196613627) m.get(i)).a);
                i++;
            }
            if (t14597605096299173136.equals(arrayList.get(arrayList.size() - 1))) {
                return;
            }
            p15728539964912394135.a(34, new Object[0]);
        } catch (IllegalArgumentException unused) {
            p15728539964912394135.a(34, new Object[0]);
        } catch (SecurityException unused2) {
            p15728539964912394135.a(35, new Object[0]);
        } catch (Exception unused3) {
            p15728539964912394135.a(33, new Object[0]);
        }
    }

    public static final I1722681268793429505 q(I1722681268793429505 i1722681268793429505, float f2) {
        return f2 == 0.0f ? i1722681268793429505 : M18113111391818111737.K(i1722681268793429505, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0L, null, false, 0L, 0L, 1048319);
    }

    public static final native Integer r(String str);

    public static final void s(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static void t(byte[] bArr, int i, int i2, T14597605096299173136 t14597605096299173136, ByteBuffer byteBuffer, P15728539964912394135 p15728539964912394135) {
        ArrayList arrayList = new ArrayList(1);
        int i3 = 0;
        int i4 = 0;
        while (byteBuffer.hasRemaining()) {
            i4++;
            try {
                ByteBuffer G = V12319504402545346730.G(byteBuffer);
                int i5 = G.getInt();
                byte[] U = V12319504402545346730.U(G);
                Y16631409940158714280 a2 = Y16631409940158714280.a(i5);
                if (a2 == null) {
                    p15728539964912394135.d.add(new A1073272897716769208(19, Integer.valueOf(i5)));
                } else {
                    arrayList.add(new S10055171720181493248(a2, U));
                }
            } catch (C15632080896631311437 | BufferUnderflowException unused) {
                p15728539964912394135.a(20, Integer.valueOf(i4));
                return;
            }
        }
        if (arrayList.isEmpty()) {
            p15728539964912394135.a(17, new Object[0]);
            return;
        }
        try {
            ArrayList I = V12319504402545346730.I(arrayList, i, i2, true);
            int size = I.size();
            while (i3 < size) {
                Object obj = I.get(i3);
                i3++;
                S10055171720181493248 s10055171720181493248 = (S10055171720181493248) obj;
                Y16631409940158714280 y16631409940158714280 = s10055171720181493248.a;
                C16290937579972779475 c16290937579972779475 = y16631409940158714280.d;
                String str = (String) c16290937579972779475.a;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) c16290937579972779475.b;
                PublicKey publicKey = t14597605096299173136.a.getPublicKey();
                try {
                    Signature signature = Signature.getInstance(str);
                    signature.initVerify(publicKey);
                    if (algorithmParameterSpec != null) {
                        signature.setParameter(algorithmParameterSpec);
                    }
                    signature.update(bArr);
                    if (!signature.verify(s10055171720181493248.b)) {
                        p15728539964912394135.a(21, y16631409940158714280);
                        return;
                    }
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    p15728539964912394135.a(22, y16631409940158714280, e);
                    return;
                } catch (InvalidKeyException e3) {
                    e = e3;
                    p15728539964912394135.a(22, y16631409940158714280, e);
                    return;
                } catch (NoSuchAlgorithmException e4) {
                    e = e4;
                    p15728539964912394135.a(22, y16631409940158714280, e);
                    return;
                } catch (SignatureException e5) {
                    e = e5;
                    p15728539964912394135.a(22, y16631409940158714280, e);
                    return;
                }
            }
        } catch (N5580838516609915046 e6) {
            StringBuilder sb = new StringBuilder();
            int size2 = arrayList.size();
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                S10055171720181493248 s100551717201814932482 = (S10055171720181493248) obj2;
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(s100551717201814932482.a);
            }
            p15728539964912394135.a(26, sb.toString(), e6);
        }
    }

    public static void u(ByteBuffer byteBuffer, CertificateFactory certificateFactory, P15728539964912394135 p15728539964912394135, HashMap hashMap, byte[] bArr, int i, int i2) {
        T14597605096299173136 t14597605096299173136;
        T14597605096299173136 t145976050962991731362;
        byte[] digest;
        ArrayList arrayList = p15728539964912394135.d;
        byte[] U = V12319504402545346730.U(byteBuffer);
        try {
            t145976050962991731362 = new T14597605096299173136((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(U)), U);
            p15728539964912394135.b.add(t145976050962991731362);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(U);
            digest = messageDigest.digest();
        } catch (CertificateException e2) {
            p15728539964912394135.a(18, e2);
        }
        if (Arrays.equals(bArr, digest)) {
            t14597605096299173136 = t145976050962991731362;
            if (p15728539964912394135.c()) {
                return;
            } else {
                return;
            }
        }
        p15728539964912394135.a(27, V12319504402545346730.Y(digest), V12319504402545346730.Y(bArr));
        t14597605096299173136 = null;
        if (p15728539964912394135.c() || p15728539964912394135.b()) {
            return;
        }
        ByteBuffer G = V12319504402545346730.G(byteBuffer);
        HashMap hashMap2 = new HashMap();
        while (G.hasRemaining()) {
            ByteBuffer G2 = V12319504402545346730.G(G);
            hashMap2.put(Integer.valueOf(G2.getInt()), V12319504402545346730.G(G2));
        }
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                P15728539964912394135 p157285399649123941352 = p15728539964912394135;
                int i4 = i;
                int i5 = i2;
                if (byteBuffer.hasRemaining()) {
                    ByteBuffer G3 = V12319504402545346730.G(byteBuffer);
                    ByteBuffer G4 = V12319504402545346730.G(byteBuffer);
                    byte[] bArr2 = new byte[G3.remaining()];
                    G3.get(bArr2);
                    G3.flip();
                    t(bArr2, i4, i5, t14597605096299173136, G4, p157285399649123941352);
                    if (p157285399649123941352.b() || p157285399649123941352.c()) {
                        return;
                    }
                    ByteBuffer G5 = V12319504402545346730.G(G3);
                    while (G5.hasRemaining()) {
                        i3++;
                        try {
                            ByteBuffer G6 = V12319504402545346730.G(G5);
                            int i6 = G6.getInt();
                            byte[] bArr3 = new byte[G6.remaining()];
                            G6.get(bArr3);
                            if (i6 == -1654455305) {
                                p(bArr3, t14597605096299173136, p157285399649123941352);
                            } else if (i6 == -465807034) {
                                long j = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN).getLong();
                                if (j <= 0) {
                                    p157285399649123941352.a(38, Long.valueOf(j));
                                }
                            } else {
                                arrayList.add(new A1073272897716769208(32, Integer.valueOf(i6)));
                            }
                        } catch (C15632080896631311437 | BufferUnderflowException unused) {
                            p157285399649123941352.a(31, Integer.valueOf(i3));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Integer) entry.getKey()).intValue() == 31) {
                arrayList.add(new A1073272897716769208(39, 31));
            } else {
                if (!hashMap2.containsKey(entry.getKey())) {
                    p15728539964912394135.a(17, new Object[0]);
                    return;
                }
                P15728539964912394135 p157285399649123941353 = p15728539964912394135;
                int i7 = i;
                int i8 = i2;
                t((byte[]) entry.getValue(), i7, i8, t14597605096299173136, (ByteBuffer) hashMap2.get(entry.getKey()), p157285399649123941353);
                if (p157285399649123941353.c() || p157285399649123941353.b()) {
                    return;
                }
                i = i7;
                i2 = i8;
                p15728539964912394135 = p157285399649123941353;
            }
        }
    }

    public static final void v(R6653624393204003746 r6653624393204003746, int i, T5263956386065402565 t5263956386065402565) {
        R6653624393204003746 r66536243932040037462;
        D389890677992184566 d389890677992184566 = new D389890677992184566(0, new R6653624393204003746[16]);
        List i2 = r6653624393204003746.i(false, false);
        while (true) {
            d389890677992184566.d(d389890677992184566.c, i2);
            while (true) {
                int i3 = d389890677992184566.c;
                if (i3 == 0) {
                    return;
                }
                r66536243932040037462 = (R6653624393204003746) d389890677992184566.m(i3 - 1);
                boolean T = U15853425786981391261.T(r66536243932040037462);
                E10198359844879945462 e10198359844879945462 = r66536243932040037462.d;
                A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
                if (!T && !a4559761392562572984.c(D10671166500636893138.j)) {
                    Y4989033692226475498 d2 = r66536243932040037462.d();
                    if (d2 == null) {
                        throw L11610354117192841236.j("Expected semantics node to have a coordinator.");
                    }
                    I11366018238968599357 V = C775827382551829194.V(V12319504402545346730.u(d2, true));
                    if (V.a < V.c && V.b < V.d) {
                        Object g2 = e10198359844879945462.a.g(E5458822993765169982.e);
                        if (g2 == null) {
                            g2 = null;
                        }
                        L12639328004344855510 l12639328004344855510 = (L12639328004344855510) g2;
                        Object g3 = a4559761392562572984.g(D10671166500636893138.w);
                        T16405881657594259547 t16405881657594259547 = (T16405881657594259547) (g3 != null ? g3 : null);
                        if (l12639328004344855510 != null && t16405881657594259547 != null && ((Number) t16405881657594259547.b.invoke()).floatValue() > 0.0f) {
                            int i4 = 1 + i;
                            t5263956386065402565.invoke(new C2125664928892034905(r66536243932040037462, i4, V, d2));
                            v(r66536243932040037462, i4, t5263956386065402565);
                        }
                    }
                }
            }
            i2 = r66536243932040037462.i(false, false);
        }
    }
}
