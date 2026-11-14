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

/* JADX INFO: loaded from: classes3.dex */
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
            K15572083692188606544 k15572083692188606544W = i16631908410500040363.w("fill_definition");
            int iJ = k15572083692188606544W != null ? k15572083692188606544W.j() : 0;
            im0[] im0VarArrValues = im0.values();
            int length = im0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    im0Var = null;
                    break;
                }
                im0Var = im0VarArrValues[i];
                if (im0Var.a == iJ) {
                    break;
                }
                i++;
            }
            im0 im0Var2 = im0.INVALID;
            im0 im0Var3 = im0Var == null ? im0Var2 : im0Var;
            if (im0Var3 != im0Var2) {
                K15572083692188606544 k15572083692188606544W2 = i16631908410500040363.w("nofill_retention_time_ms");
                long jN = k15572083692188606544W2 != null ? k15572083692188606544W2.n() : 0L;
                K15572083692188606544 k15572083692188606544W3 = i16631908410500040363.w("callback_delay_ms");
                long jN2 = k15572083692188606544W3 != null ? k15572083692188606544W3.n() : 50L;
                K15572083692188606544 k15572083692188606544W4 = i16631908410500040363.w("nofills_before_throttle");
                int iJ2 = k15572083692188606544W4 != null ? k15572083692188606544W4.j() : 0;
                K15572083692188606544 k15572083692188606544W5 = i16631908410500040363.w("post_throttle_nofills_before_throttle");
                Integer numValueOf = k15572083692188606544W5 != null ? Integer.valueOf(k15572083692188606544W5.j()) : null;
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
                return new jh3(iJ2, numValueOf, M9216324016624295870.a0(jN, n13798149404328803870), M9216324016624295870.a0(jN2, n13798149404328803870), im0Var3);
            }
        }
        return null;
    }

    public static ug2 g(I16631908410500040363 i16631908410500040363) {
        Map linkedHashMap;
        try {
            Object objB = new F14240031463097426304().b(I16631908410500040363.class, d62.a(i16631908410500040363, "extra_query_params", "{}"));
            objB.getClass();
            linkedHashMap = new LinkedHashMap();
            Iterator it = ((S11564727846197427291) ((I16631908410500040363) objB).a.entrySet()).iterator();
            while (((L622219180424329983) it).hasNext()) {
                S8064361206571326475 s8064361206571326475A = ((L622219180424329983) it).a();
                String str = (String) s8064361206571326475A.getKey();
                K15572083692188606544 k15572083692188606544 = (K15572083692188606544) s8064361206571326475A.getValue();
                str.getClass();
                String strP = k15572083692188606544.p();
                strP.getClass();
                linkedHashMap.put(str, strP);
            }
        } catch (Exception e2) {
            ArrayList arrayList = G6547577305291411977.l(e2).s;
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            arrayList.add(message);
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = X9852054718446117252.a;
        }
        return new ug2(d62.a(i16631908410500040363, "enable_prewarming", false), d62.a(i16631908410500040363, "prefetch_url", ""), d62.a(i16631908410500040363, "skip_offline_notification_flow", false), d62.a(i16631908410500040363, "enable_hsdp_service", false), d62.a(i16631908410500040363, "target_package", ""), d62.a(i16631908410500040363, "hsdp_invocation_callback_bitmask", 0), d62.a(i16631908410500040363, "referrer", ""), linkedHashMap);
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
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(12.0f, 2.0f);
        v14323974914327418545D.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        v14323974914327418545D.o(4.48f, 10.0f, 10.0f, 10.0f);
        v14323974914327418545D.o(10.0f, -4.48f, 10.0f, -10.0f);
        v14323974914327418545D.n(17.52f, 2.0f, 12.0f, 2.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(4.0f, 12.0f);
        v14323974914327418545D.e(0.0f, -0.61f, 0.08f, -1.21f, 0.21f, -1.78f);
        v14323974914327418545D.h(8.99f, 15.0f);
        v14323974914327418545D.s(1.0f);
        v14323974914327418545D.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v14323974914327418545D.s(1.93f);
        v14323974914327418545D.d(7.06f, 19.43f, 4.0f, 16.07f, 4.0f, 12.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(17.89f, 17.4f);
        v14323974914327418545D.e(-0.26f, -0.81f, -1.0f, -1.4f, -1.9f, -1.4f);
        v14323974914327418545D.g(-1.0f);
        v14323974914327418545D.s(-3.0f);
        v14323974914327418545D.e(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        v14323974914327418545D.g(-6.0f);
        v14323974914327418545D.s(-2.0f);
        v14323974914327418545D.g(2.0f);
        v14323974914327418545D.e(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        v14323974914327418545D.h(10.99f, 7.0f);
        v14323974914327418545D.g(2.0f);
        v14323974914327418545D.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v14323974914327418545D.s(-0.41f);
        v14323974914327418545D.d(17.92f, 5.77f, 20.0f, 8.65f, 20.0f, 12.0f);
        v14323974914327418545D.e(0.0f, 2.08f, -0.81f, 3.98f, -2.11f, 5.4f);
        v14323974914327418545D.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final long k(double d2) {
        return n((float) d2, 4294967296L);
    }

    public static final long l(int i) {
        return n(i, 4294967296L);
    }

    public static final native boolean m(String str);

    public static final long n(float f2, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        E6417708602094478350[] e6417708602094478350Arr = J5593409210068682756.b;
        return jFloatToRawIntBits;
    }

    public static final native D10030753892766079115 o(String str);

    public static void p(byte[] bArr, T14597605096299173136 t14597605096299173136, P15728539964912394135 p15728539964912394135) {
        ArrayList arrayList;
        try {
            ArrayList arrayListM = E7125458317232359087.m(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
            int i = 0;
            while (true) {
                int size = arrayListM.size();
                arrayList = p15728539964912394135.c;
                if (i >= size) {
                    break;
                }
                arrayList.add(((D6018894238196613627) arrayListM.get(i)).a);
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
                ByteBuffer byteBufferG = V12319504402545346730.G(byteBuffer);
                int i5 = byteBufferG.getInt();
                byte[] bArrU = V12319504402545346730.U(byteBufferG);
                Y16631409940158714280 y16631409940158714280A = Y16631409940158714280.a(i5);
                if (y16631409940158714280A == null) {
                    p15728539964912394135.d.add(new A1073272897716769208(19, Integer.valueOf(i5)));
                } else {
                    arrayList.add(new S10055171720181493248(y16631409940158714280A, bArrU));
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
            ArrayList arrayListI = V12319504402545346730.I(arrayList, i, i2, true);
            int size = arrayListI.size();
            while (i3 < size) {
                Object obj = arrayListI.get(i3);
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

    public static void u(ByteBuffer byteBuffer, CertificateFactory certificateFactory, P15728539964912394135 p15728539964912394135, HashMap map, byte[] bArr, int i, int i2) {
        T14597605096299173136 t14597605096299173136;
        T14597605096299173136 t145976050962991731362;
        byte[] bArrDigest;
        ArrayList arrayList = p15728539964912394135.d;
        byte[] bArrU = V12319504402545346730.U(byteBuffer);
        try {
            t145976050962991731362 = new T14597605096299173136((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrU)), bArrU);
            p15728539964912394135.b.add(t145976050962991731362);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrU);
            bArrDigest = messageDigest.digest();
        } catch (CertificateException e2) {
            p15728539964912394135.a(18, e2);
        }
        if (Arrays.equals(bArr, bArrDigest)) {
            t14597605096299173136 = t145976050962991731362;
            if (p15728539964912394135.c()) {
                return;
            } else {
                return;
            }
        }
        p15728539964912394135.a(27, V12319504402545346730.Y(bArrDigest), V12319504402545346730.Y(bArr));
        t14597605096299173136 = null;
        if (p15728539964912394135.c() || p15728539964912394135.b()) {
            return;
        }
        ByteBuffer byteBufferG = V12319504402545346730.G(byteBuffer);
        HashMap map2 = new HashMap();
        while (byteBufferG.hasRemaining()) {
            ByteBuffer byteBufferG2 = V12319504402545346730.G(byteBufferG);
            map2.put(Integer.valueOf(byteBufferG2.getInt()), V12319504402545346730.G(byteBufferG2));
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                P15728539964912394135 p157285399649123941352 = p15728539964912394135;
                int i4 = i;
                int i5 = i2;
                if (byteBuffer.hasRemaining()) {
                    ByteBuffer byteBufferG3 = V12319504402545346730.G(byteBuffer);
                    ByteBuffer byteBufferG4 = V12319504402545346730.G(byteBuffer);
                    byte[] bArr2 = new byte[byteBufferG3.remaining()];
                    byteBufferG3.get(bArr2);
                    byteBufferG3.flip();
                    t(bArr2, i4, i5, t14597605096299173136, byteBufferG4, p157285399649123941352);
                    if (p157285399649123941352.b() || p157285399649123941352.c()) {
                        return;
                    }
                    ByteBuffer byteBufferG5 = V12319504402545346730.G(byteBufferG3);
                    while (byteBufferG5.hasRemaining()) {
                        i3++;
                        try {
                            ByteBuffer byteBufferG6 = V12319504402545346730.G(byteBufferG5);
                            int i6 = byteBufferG6.getInt();
                            byte[] bArr3 = new byte[byteBufferG6.remaining()];
                            byteBufferG6.get(bArr3);
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
                if (!map2.containsKey(entry.getKey())) {
                    p15728539964912394135.a(17, new Object[0]);
                    return;
                }
                P15728539964912394135 p157285399649123941353 = p15728539964912394135;
                int i7 = i;
                int i8 = i2;
                t((byte[]) entry.getValue(), i7, i8, t14597605096299173136, (ByteBuffer) map2.get(entry.getKey()), p157285399649123941353);
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
        List listI = r6653624393204003746.i(false, false);
        while (true) {
            d389890677992184566.d(d389890677992184566.c, listI);
            while (true) {
                int i2 = d389890677992184566.c;
                if (i2 == 0) {
                    return;
                }
                r66536243932040037462 = (R6653624393204003746) d389890677992184566.m(i2 - 1);
                boolean zT = U15853425786981391261.T(r66536243932040037462);
                E10198359844879945462 e10198359844879945462 = r66536243932040037462.d;
                A4559761392562572984 a4559761392562572984 = e10198359844879945462.a;
                if (!zT && !a4559761392562572984.c(D10671166500636893138.j)) {
                    Y4989033692226475498 y4989033692226475498D = r66536243932040037462.d();
                    if (y4989033692226475498D == null) {
                        throw L11610354117192841236.j("Expected semantics node to have a coordinator.");
                    }
                    I11366018238968599357 i11366018238968599357V = C775827382551829194.V(V12319504402545346730.u(y4989033692226475498D, true));
                    if (i11366018238968599357V.a < i11366018238968599357V.c && i11366018238968599357V.b < i11366018238968599357V.d) {
                        Object objG = e10198359844879945462.a.g(E5458822993765169982.e);
                        if (objG == null) {
                            objG = null;
                        }
                        L12639328004344855510 l12639328004344855510 = (L12639328004344855510) objG;
                        Object objG2 = a4559761392562572984.g(D10671166500636893138.w);
                        T16405881657594259547 t16405881657594259547 = (T16405881657594259547) (objG2 != null ? objG2 : null);
                        if (l12639328004344855510 == null || t16405881657594259547 == null || ((Number) t16405881657594259547.b.invoke()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i3 = 1 + i;
                        t5263956386065402565.invoke(new C2125664928892034905(r66536243932040037462, i3, i11366018238968599357V, y4989033692226475498D));
                        v(r66536243932040037462, i3, t5263956386065402565);
                    }
                }
            }
            listI = r66536243932040037462.i(false, false);
        }
    }
}
