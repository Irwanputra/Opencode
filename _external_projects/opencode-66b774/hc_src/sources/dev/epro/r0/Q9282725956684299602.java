package dev.epro.r0;

import ads_mobile_sdk.d62;
import ads_mobile_sdk.k61;
import ads_mobile_sdk.x23;
import java.io.PrintStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.zetetic.database.CursorWindow;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class Q9282725956684299602 {
    static {
        izmyclvb.qgayjvbiagej2(1462);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r12, dev.epro.r0.I1722681268793429505 r13, final long r14, final long r16, dev.epro.r0.J12078565427869724451 r18, dev.epro.r0.L12639328004344855510 r19, final dev.epro.r0.T15443218846549482730 r20, dev.epro.r0.M3727281027331139839 r21, final int r22, final int r23) {
        /*
            r8 = r21
            r10 = r22
            r0 = 563434725(0x219554e5, float:1.0119104E-18)
            r8.b0(r0)
            boolean r0 = r8.d(r12)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r10
            r0 = r0 | 48
            boolean r3 = r8.e(r14)
            if (r3 == 0) goto L1f
            r3 = 256(0x100, float:3.59E-43)
            goto L21
        L1f:
            r3 = 128(0x80, float:1.794E-43)
        L21:
            r0 = r0 | r3
            r5 = r16
            boolean r3 = r8.e(r5)
            if (r3 == 0) goto L2d
            r3 = 2048(0x800, float:2.87E-42)
            goto L2f
        L2d:
            r3 = 1024(0x400, float:1.435E-42)
        L2f:
            r0 = r0 | r3
            r3 = r23 & 16
            if (r3 == 0) goto L39
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L36:
            r4 = r18
            goto L4b
        L39:
            r4 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L36
            r4 = r18
            boolean r7 = r8.h(r4)
            if (r7 == 0) goto L48
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L4a
        L48:
            r7 = 8192(0x2000, float:1.14794E-41)
        L4a:
            r0 = r0 | r7
        L4b:
            r7 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r7
            r7 = 599187(0x92493, float:8.3964E-40)
            r7 = r7 & r0
            r9 = 599186(0x92492, float:8.39638E-40)
            if (r7 == r9) goto L59
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            r9 = r0 & 1
            boolean r7 = r8.R(r9, r7)
            if (r7 == 0) goto La4
            r8.W()
            r7 = r10 & 1
            if (r7 == 0) goto L77
            boolean r7 = r8.z()
            if (r7 == 0) goto L70
            goto L77
        L70:
            r8.U()
            r6 = r19
        L75:
            r5 = r4
            goto L8d
        L77:
            if (r3 == 0) goto L86
            dev.epro.r0.E8491669934080931073 r13 = new dev.epro.r0.E8491669934080931073
            r13.<init>(r12)
            r3 = 959948692(0x3937a794, float:1.7514668E-4)
            dev.epro.r0.T15443218846549482730 r13 = dev.epro.r0.S10823041268949770285.T(r3, r13, r8)
            r4 = r13
        L86:
            dev.epro.r0.T15443218846549482730 r13 = dev.epro.r0.N7010860449649123655.a
            dev.epro.r0.V10993962107938880611 r3 = dev.epro.r0.V10993962107938880611.a
            r6 = r13
            r13 = r3
            goto L75
        L8d:
            r8.r()
            int r0 = r0 >> 3
            r3 = 524286(0x7fffe, float:7.34681E-40)
            r9 = r0 & r3
            r0 = r13
            r1 = r14
            r3 = r16
            r7 = r20
            b(r0, r1, r3, r5, r6, r7, r8, r9)
            r2 = r0
            r7 = r5
            r8 = r6
            goto Lab
        La4:
            r21.U()
            r2 = r13
            r8 = r19
            r7 = r4
        Lab:
            dev.epro.r0.V4878375136513573151 r13 = r21.t()
            if (r13 == 0) goto Lc0
            dev.epro.r0.T15197506908989642293 r0 = new dev.epro.r0.T15197506908989642293
            r1 = r12
            r3 = r14
            r5 = r16
            r9 = r20
            r11 = r23
            r0.<init>()
            r13.d = r0
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.Q9282725956684299602.a(int, dev.epro.r0.I1722681268793429505, long, long, dev.epro.r0.J12078565427869724451, dev.epro.r0.L12639328004344855510, dev.epro.r0.T15443218846549482730, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final void b(I1722681268793429505 i1722681268793429505, final long j, final long j2, final J12078565427869724451 j12078565427869724451, final L12639328004344855510 l12639328004344855510, final T15443218846549482730 t15443218846549482730, M3727281027331139839 m3727281027331139839, final int i) {
        I1722681268793429505 i17226812687934295052;
        int i2;
        m3727281027331139839.b0(1955286154);
        if ((i & 6) == 0) {
            i17226812687934295052 = i1722681268793429505;
            i2 = (m3727281027331139839.f(i17226812687934295052) ? 4 : 2) | i;
        } else {
            i17226812687934295052 = i1722681268793429505;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= m3727281027331139839.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= m3727281027331139839.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= m3727281027331139839.h(j12078565427869724451) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= m3727281027331139839.h(l12639328004344855510) ? CursorWindow.DEFAULT_CURSOR_WINDOW_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= m3727281027331139839.h(t15443218846549482730) ? 131072 : 65536;
        }
        byte b = 0;
        if (m3727281027331139839.R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            X15668192874961033526.a(X7410747940286448830.s(i17226812687934295052), null, j, j2, 0.0f, 0.0f, null, S10823041268949770285.T(830280655, new V8104000428493290582(t15443218846549482730, l12639328004344855510, j12078565427869724451, b), m3727281027331139839), m3727281027331139839, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 t = m3727281027331139839.t();
        if (t != null) {
            final I1722681268793429505 i17226812687934295053 = i17226812687934295052;
            t.d = new L12639328004344855510() { // from class: dev.epro.r0.S13581998069245461633
                @Override // dev.epro.r0.L12639328004344855510
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    Q9282725956684299602.b(I1722681268793429505.this, j, j2, j12078565427869724451, l12639328004344855510, t15443218846549482730, (M3727281027331139839) obj, V16504496955554646429.p(i | 1));
                    return O9245300239821758723.a;
                }
            };
        }
    }

    public static k61 c(I16631908410500040363 i16631908410500040363, X11644140690951955496 x11644140690951955496) {
        P16422848101170923038 e;
        I16631908410500040363 a;
        P16422848101170923038 e2;
        I16631908410500040363 a2;
        I16631908410500040363 a3;
        K15572083692188606544 w = i16631908410500040363.w("ad_html");
        String str = null;
        String p = w != null ? w.p() : null;
        K15572083692188606544 w2 = i16631908410500040363.w("ad_base_url");
        String p2 = w2 != null ? w2.p() : null;
        K15572083692188606544 w3 = i16631908410500040363.w("ad_json");
        I16631908410500040363 l = w3 != null ? w3.l() : null;
        K15572083692188606544 w4 = i16631908410500040363.w("ad_json");
        P16422848101170923038 e3 = d62.e(w4 != null ? w4.l() : null, "ads");
        if (e3 != null && (a3 = d62.a(e3, 0)) != null) {
            str = d62.a(a3, "ad_mid", "");
        }
        K15572083692188606544 w5 = i16631908410500040363.w("ad_json");
        return new k61(p, x11644140690951955496, p2, l, str, (w5 == null || (e = d62.e(w5.l(), "slots")) == null || (a = d62.a(e, 0)) == null || (e2 = d62.e(a, "ads")) == null || (a2 = d62.a(e2, 0)) == null || !(M8927913404651150384.Y(d62.a(a2, "ad_mid", "")) ^ true)) ? false : true);
    }

    public static x23 d(I16631908410500040363 i16631908410500040363) {
        try {
            String p = i16631908410500040363.w("name").p();
            p.getClass();
            K15572083692188606544 w = i16631908410500040363.w("info");
            return new x23(w != null ? w.l() : null, p);
        } catch (Exception e) {
            ArrayList arrayList = G6547577305291411977.l(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static final String e(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final native JSONObject f(E1055664632160129736 e1055664632160129736, String str, int i, int i2, int i3);

    public static final long g() {
        return Thread.currentThread().getId();
    }

    public static final native String h(String str);

    public static final native byte[] i(String str);

    public static final native String j(String str);

    public static final T4643696886244492064 k(L16425900549479658727 l16425900549479658727) {
        l16425900549479658727.getClass();
        return new T4643696886244492064(l16425900549479658727.a, l16425900549479658727.t);
    }

    public static final X1840570513157370182 l(G17613326942144185441 g17613326942144185441) {
        Object k = g17613326942144185441.k();
        if (k instanceof X1840570513157370182) {
            return (X1840570513157370182) k;
        }
        return null;
    }

    public static final float m(X1840570513157370182 x1840570513157370182) {
        if (x1840570513157370182 != null) {
            return x1840570513157370182.a;
        }
        return 0.0f;
    }

    public static final native Map n(String str);

    public static final native B1213711264876699071 o(int i, String str, boolean z);

    public static void p(ByteBuffer byteBuffer, CertificateFactory certificateFactory, P5799335319119159120 p5799335319119159120, HashSet hashSet, Map map, HashSet hashSet2, int i, int i2) {
        byte[] encoded;
        int i3;
        ByteBuffer G = V12319504402545346730.G(byteBuffer);
        G.get(new byte[G.remaining()]);
        G.flip();
        ArrayList arrayList = p5799335319119159120.g;
        ArrayList arrayList2 = p5799335319119159120.b;
        ArrayList arrayList3 = p5799335319119159120.i;
        ByteBuffer G2 = V12319504402545346730.G(byteBuffer);
        byte[] U = V12319504402545346730.U(byteBuffer);
        int i4 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        int i5 = 0;
        while (G2.hasRemaining()) {
            i5++;
            try {
                ByteBuffer G3 = V12319504402545346730.G(G2);
                int i6 = G3.getInt();
                byte[] U2 = V12319504402545346730.U(G3);
                arrayList3.add(new B3691971677827467518(i6));
                Y16631409940158714280 a = Y16631409940158714280.a(i6);
                if (a == null) {
                    p5799335319119159120.g(G15471856606567993098.V2_SIG_UNKNOWN_SIG_ALGORITHM, Integer.valueOf(i6));
                } else {
                    arrayList4.add(new I3044347181392176607(a, U2));
                }
            } catch (C15632080896631311437 | BufferUnderflowException unused) {
                p5799335319119159120.f(G15471856606567993098.V2_SIG_MALFORMED_SIGNATURE, Integer.valueOf(i5));
                return;
            }
        }
        if (arrayList3.isEmpty()) {
            p5799335319119159120.f(G15471856606567993098.V2_SIG_NO_SIGNATURES, new Object[0]);
            return;
        }
        try {
            ArrayList I = V12319504402545346730.I(arrayList4, i, i2, false);
            int size = I.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = I.get(i7);
                i7++;
                I3044347181392176607 i3044347181392176607 = (I3044347181392176607) obj;
                Y16631409940158714280 y16631409940158714280 = i3044347181392176607.a;
                C16290937579972779475 c16290937579972779475 = y16631409940158714280.d;
                String str = (String) c16290937579972779475.a;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) c16290937579972779475.b;
                try {
                    int i8 = i4;
                    PublicKey generatePublic = KeyFactory.getInstance(y16631409940158714280.b).generatePublic(new X509EncodedKeySpec(U));
                    try {
                        Signature signature = Signature.getInstance(str);
                        signature.initVerify(generatePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        G.position(0);
                        signature.update(G);
                        byte[] bArr = i3044347181392176607.b;
                        if (!signature.verify(bArr)) {
                            p5799335319119159120.f(G15471856606567993098.V2_SIG_DID_NOT_VERIFY, y16631409940158714280);
                            return;
                        } else {
                            p5799335319119159120.j.put(y16631409940158714280, bArr);
                            hashSet.add(y16631409940158714280.c);
                            i4 = i8;
                        }
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        p5799335319119159120.f(G15471856606567993098.V2_SIG_VERIFY_EXCEPTION, y16631409940158714280, e);
                        return;
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        p5799335319119159120.f(G15471856606567993098.V2_SIG_VERIFY_EXCEPTION, y16631409940158714280, e);
                        return;
                    } catch (SignatureException e3) {
                        e = e3;
                        p5799335319119159120.f(G15471856606567993098.V2_SIG_VERIFY_EXCEPTION, y16631409940158714280, e);
                        return;
                    }
                } catch (Exception e4) {
                    p5799335319119159120.f(G15471856606567993098.V2_SIG_MALFORMED_PUBLIC_KEY, e4);
                    return;
                }
            }
            int i9 = i4;
            G.position(0);
            ByteBuffer G4 = V12319504402545346730.G(G);
            ByteBuffer G5 = V12319504402545346730.G(G);
            ByteBuffer G6 = V12319504402545346730.G(G);
            int i10 = -1;
            while (G5.hasRemaining()) {
                int i11 = i10 + 1;
                byte[] U3 = V12319504402545346730.U(G5);
                try {
                    arrayList2.add(new T14597605096299173136(N6415941970858904263.b(U3, certificateFactory), U3));
                    i10 = i11;
                } catch (CertificateException e5) {
                    p5799335319119159120.f(G15471856606567993098.V2_SIG_MALFORMED_CERTIFICATE, Integer.valueOf(i11), Integer.valueOf(i10 + 2), e5);
                    return;
                }
            }
            if (arrayList2.isEmpty()) {
                p5799335319119159120.f(G15471856606567993098.V2_SIG_NO_CERTIFICATES, new Object[0]);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) arrayList2.get(0);
            try {
                encoded = V933048422416352811.n(x509Certificate.getPublicKey());
            } catch (InvalidKeyException e6) {
                PrintStream printStream = F4537322127226430183.a;
                e6.toString();
                printStream.getClass();
                encoded = x509Certificate.getPublicKey().getEncoded();
            }
            if (!Arrays.equals(U, encoded)) {
                p5799335319119159120.f(G15471856606567993098.V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD, V12319504402545346730.Y(encoded), V12319504402545346730.Y(U));
                return;
            }
            int i12 = 0;
            while (G4.hasRemaining()) {
                i12++;
                try {
                    ByteBuffer G7 = V12319504402545346730.G(G4);
                    arrayList.add(new N10165880154438570497(G7.getInt(), V12319504402545346730.U(G7)));
                } catch (C15632080896631311437 | BufferUnderflowException unused2) {
                    p5799335319119159120.f(G15471856606567993098.V2_SIG_MALFORMED_DIGEST, Integer.valueOf(i12));
                    return;
                }
            }
            ArrayList arrayList5 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList3.get(i13);
                i13++;
                arrayList5.add(Integer.valueOf(((B3691971677827467518) obj2).a));
            }
            ArrayList arrayList6 = new ArrayList(arrayList.size());
            int size3 = arrayList.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList.get(i14);
                i14++;
                arrayList6.add(Integer.valueOf(((N10165880154438570497) obj3).a));
            }
            if (!arrayList5.equals(arrayList6)) {
                p5799335319119159120.f(G15471856606567993098.V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS, arrayList5, arrayList6);
                return;
            }
            Set keySet = map.keySet();
            int i15 = i9;
            HashSet hashSet3 = new HashSet(i15);
            int i16 = 0;
            while (G6.hasRemaining()) {
                i16 += i15;
                try {
                    ByteBuffer G8 = V12319504402545346730.G(G6);
                    int i17 = G8.getInt();
                    byte[] bArr2 = new byte[G8.remaining()];
                    G8.get(bArr2);
                    p5799335319119159120.k.add(new Z11815101760950193698(i17, bArr2));
                    if (i17 != -1091571699) {
                        p5799335319119159120.g(G15471856606567993098.V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i17));
                    } else {
                        int i18 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt();
                        if (keySet.contains(Integer.valueOf(i18))) {
                            hashSet3.add(Integer.valueOf(i18));
                        } else {
                            i3 = 1;
                            p5799335319119159120.g(G15471856606567993098.V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID, Integer.valueOf(p5799335319119159120.a), Integer.valueOf(i18));
                            i15 = i3;
                        }
                    }
                    i3 = 1;
                    i15 = i3;
                } catch (C15632080896631311437 | BufferUnderflowException unused3) {
                    p5799335319119159120.f(G15471856606567993098.V2_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i16));
                    return;
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                num.getClass();
                if (!hashSet2.contains(num)) {
                    p5799335319119159120.f(G15471856606567993098.V2_SIG_MISSING_APK_SIG_REFERENCED, Integer.valueOf(p5799335319119159120.a), (String) map.get(num));
                }
            }
        } catch (N5580838516609915046 e7) {
            try {
                throw new G16421604151151493810(e7.getMessage());
            } catch (G16421604151151493810 e8) {
                p5799335319119159120.f(G15471856606567993098.V2_SIG_NO_SUPPORTED_SIGNATURES, e8);
            }
        }
    }

    public static final native Q7430090668634766253 q(Q7430090668634766253 q7430090668634766253, Map map);

    public static final native String r(Map map, String... strArr);

    public static final native String s(String str);

    public static final double t(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static P3161324327665759195 u(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453, Map map, HashSet hashSet, int i, int i2) {
        int i3 = B8970794335431581539.Vo;
        P3161324327665759195 p3161324327665759195 = new P3161324327665759195(2);
        try {
            X7650711929610928530 A = V12319504402545346730.A(y12887846282176508602, j13328905385734298453, 1896449818);
            B11059234153875532973 e = y12887846282176508602.e(0L, A.b);
            long j = A.c;
            B11059234153875532973 e2 = y12887846282176508602.e(j, A.d - j);
            ByteBuffer byteBuffer = A.e;
            ByteBuffer byteBuffer2 = A.a;
            HashSet hashSet2 = new HashSet(1);
            try {
                ByteBuffer G = V12319504402545346730.G(byteBuffer2);
                if (G.hasRemaining()) {
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        int i4 = 0;
                        while (G.hasRemaining()) {
                            int i5 = i4 + 1;
                            P5799335319119159120 p5799335319119159120 = new P5799335319119159120();
                            p5799335319119159120.a = i4;
                            p3161324327665759195.g.add(p5799335319119159120);
                            try {
                                p(V12319504402545346730.G(G), certificateFactory, p5799335319119159120, hashSet2, map, hashSet, i, i2);
                                i4 = i5;
                            } catch (C15632080896631311437 | BufferUnderflowException unused) {
                                p5799335319119159120.f(G15471856606567993098.V2_SIG_MALFORMED_SIGNER, new Object[0]);
                            }
                        }
                        if (i4 > 10) {
                            p3161324327665759195.d(G15471856606567993098.V2_SIG_MAX_SIGNATURES_EXCEEDED, 10, Integer.valueOf(i4));
                        }
                    } catch (CertificateException e3) {
                        Z3383101362411723454.m("Failed to obtain X.509 CertificateFactory", e3);
                        return null;
                    }
                } else {
                    p3161324327665759195.d(G15471856606567993098.V2_SIG_NO_SIGNERS, new Object[0]);
                }
            } catch (C15632080896631311437 unused2) {
                p3161324327665759195.d(G15471856606567993098.V2_SIG_MALFORMED_SIGNERS, new Object[0]);
            }
            if (!p3161324327665759195.a()) {
                V933048422416352811.O(e, e2, byteBuffer, hashSet2, p3161324327665759195);
                if (!p3161324327665759195.a()) {
                    p3161324327665759195.b = true;
                }
            }
            return p3161324327665759195;
        } catch (I14711110190789567685 e4) {
            throw new P9812297241659113668(e4.getMessage());
        }
    }

    public static final native Object v(D11883231851729262595 d11883231851729262595, P2330619457548885700 p2330619457548885700, K14749510448791472029 k14749510448791472029);
}
