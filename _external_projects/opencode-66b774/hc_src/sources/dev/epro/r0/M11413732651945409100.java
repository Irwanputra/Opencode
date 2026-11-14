package dev.epro.r0;

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
import java.util.OptionalInt;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M11413732651945409100 {
    public final Y12887846282176508602 a;
    public final J13328905385734298453 b;
    public final P3161324327665759195 c;
    public final Set d;
    public final int e;
    public final int f;
    public final int g;
    public final OptionalInt h;
    public ByteBuffer i;

    public M11413732651945409100(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453, Set set, P3161324327665759195 p3161324327665759195, int i, int i2, int i3, OptionalInt optionalInt) {
        int i4 = B8970794335431581539.Vo;
        this.a = y12887846282176508602;
        this.b = j13328905385734298453;
        this.d = set;
        this.c = p3161324327665759195;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = optionalInt;
    }

    public final void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, P5799335319119159120 p5799335319119159120) {
        byte[] encoded;
        OptionalInt optionalInt;
        int i;
        ByteBuffer byteBuffer2;
        G15471856606567993098 g15471856606567993098 = G15471856606567993098.V3_SIG_POR_CERT_MISMATCH;
        ByteBuffer G = V12319504402545346730.G(byteBuffer);
        G.get(new byte[G.remaining()]);
        G.flip();
        ArrayList arrayList = p5799335319119159120.g;
        ArrayList arrayList2 = p5799335319119159120.b;
        ArrayList arrayList3 = p5799335319119159120.i;
        int i2 = byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        p5799335319119159120.l = i2;
        p5799335319119159120.m = i3;
        if (i2 < 0 || i2 > i3) {
            p5799335319119159120.f(G15471856606567993098.V3_SIG_INVALID_SDK_VERSIONS, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        ByteBuffer G2 = V12319504402545346730.G(byteBuffer);
        byte[] U = V12319504402545346730.U(byteBuffer);
        int i4 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        int i5 = 0;
        while (G2.hasRemaining()) {
            i5 += i4;
            try {
                ByteBuffer G3 = V12319504402545346730.G(G2);
                int i6 = G3.getInt();
                byte[] U2 = V12319504402545346730.U(G3);
                arrayList3.add(new B3691971677827467518(i6));
                Y16631409940158714280 a = Y16631409940158714280.a(i6);
                if (a == null) {
                    byteBuffer2 = G2;
                    p5799335319119159120.g(G15471856606567993098.V3_SIG_UNKNOWN_SIG_ALGORITHM, Integer.valueOf(i6));
                } else {
                    byteBuffer2 = G2;
                    arrayList4.add(new I3044347181392176607(a, U2));
                }
                G2 = byteBuffer2;
                i4 = 1;
            } catch (C15632080896631311437 | BufferUnderflowException unused) {
                p5799335319119159120.f(G15471856606567993098.V3_SIG_MALFORMED_SIGNATURE, Integer.valueOf(i5));
                return;
            }
        }
        if (arrayList3.isEmpty()) {
            p5799335319119159120.f(G15471856606567993098.V3_SIG_NO_SIGNATURES, new Object[0]);
            return;
        }
        try {
            try {
                ArrayList I = V12319504402545346730.I(arrayList4, p5799335319119159120.l, p5799335319119159120.m, false);
                int size = I.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = I.get(i7);
                    i7++;
                    I3044347181392176607 i3044347181392176607 = (I3044347181392176607) obj;
                    Y16631409940158714280 y16631409940158714280 = i3044347181392176607.a;
                    C16290937579972779475 c16290937579972779475 = y16631409940158714280.d;
                    int i8 = size;
                    String str = (String) c16290937579972779475.a;
                    AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) c16290937579972779475.b;
                    try {
                        ArrayList arrayList5 = I;
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
                                p5799335319119159120.f(G15471856606567993098.V3_SIG_DID_NOT_VERIFY, y16631409940158714280);
                                return;
                            }
                            p5799335319119159120.j.put(y16631409940158714280, bArr);
                            this.d.add(y16631409940158714280.c);
                            size = i8;
                            I = arrayList5;
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            p5799335319119159120.f(G15471856606567993098.V3_SIG_VERIFY_EXCEPTION, y16631409940158714280, e);
                            return;
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            p5799335319119159120.f(G15471856606567993098.V3_SIG_VERIFY_EXCEPTION, y16631409940158714280, e);
                            return;
                        } catch (SignatureException e3) {
                            e = e3;
                            p5799335319119159120.f(G15471856606567993098.V3_SIG_VERIFY_EXCEPTION, y16631409940158714280, e);
                            return;
                        }
                    } catch (Exception e4) {
                        p5799335319119159120.f(G15471856606567993098.V3_SIG_MALFORMED_PUBLIC_KEY, e4);
                        return;
                    }
                }
                G.position(0);
                ByteBuffer G4 = V12319504402545346730.G(G);
                ByteBuffer G5 = V12319504402545346730.G(G);
                int i9 = G.getInt();
                if (i9 != i2) {
                    p5799335319119159120.f(G15471856606567993098.V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD, Integer.valueOf(i2), Integer.valueOf(i9));
                }
                int i10 = G.getInt();
                if (i10 != i3) {
                    p5799335319119159120.f(G15471856606567993098.V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD, Integer.valueOf(i3), Integer.valueOf(i10));
                }
                ByteBuffer G6 = V12319504402545346730.G(G);
                int i11 = -1;
                while (G5.hasRemaining()) {
                    int i12 = i11 + 1;
                    byte[] U3 = V12319504402545346730.U(G5);
                    try {
                        arrayList2.add(new T14597605096299173136(N6415941970858904263.b(U3, certificateFactory), U3));
                        i11 = i12;
                    } catch (CertificateException e5) {
                        p5799335319119159120.f(G15471856606567993098.V3_SIG_MALFORMED_CERTIFICATE, Integer.valueOf(i12), Integer.valueOf(i11 + 2), e5);
                        return;
                    }
                }
                if (arrayList2.isEmpty()) {
                    p5799335319119159120.f(G15471856606567993098.V3_SIG_NO_CERTIFICATES, new Object[0]);
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
                    p5799335319119159120.f(G15471856606567993098.V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD, V12319504402545346730.Y(encoded), V12319504402545346730.Y(U));
                    return;
                }
                int i13 = 0;
                while (G4.hasRemaining()) {
                    i13++;
                    try {
                        ByteBuffer G7 = V12319504402545346730.G(G4);
                        arrayList.add(new N10165880154438570497(G7.getInt(), V12319504402545346730.U(G7)));
                    } catch (C15632080896631311437 | BufferUnderflowException unused2) {
                        p5799335319119159120.f(G15471856606567993098.V3_SIG_MALFORMED_DIGEST, Integer.valueOf(i13));
                        return;
                    }
                }
                ArrayList arrayList6 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList3.get(i14);
                    i14++;
                    arrayList6.add(Integer.valueOf(((B3691971677827467518) obj2).a));
                }
                ArrayList arrayList7 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList.get(i15);
                    i15++;
                    arrayList7.add(Integer.valueOf(((N10165880154438570497) obj3).a));
                }
                if (!arrayList6.equals(arrayList7)) {
                    p5799335319119159120.f(G15471856606567993098.V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS, arrayList6, arrayList7);
                    return;
                }
                int i16 = 0;
                boolean z = false;
                while (true) {
                    boolean hasRemaining = G6.hasRemaining();
                    optionalInt = this.h;
                    if (!hasRemaining) {
                        break;
                    }
                    i16++;
                    try {
                        ByteBuffer G8 = V12319504402545346730.G(G6);
                        int i17 = G8.getInt();
                        byte[] bArr2 = new byte[G8.remaining()];
                        G8.get(bArr2);
                        p5799335319119159120.k.add(new Z11815101760950193698(i17, bArr2));
                        if (i17 == 1000370060) {
                            try {
                                try {
                                    V8767056641518014226 c = V8767056641518014226.c(bArr2);
                                    p5799335319119159120.n = c;
                                    i = 0;
                                    try {
                                        if (p5799335319119159120.n.b.size() != c.b((X509Certificate) arrayList2.get(0)).b.size()) {
                                            p5799335319119159120.f(g15471856606567993098, new Object[0]);
                                        }
                                    } catch (IllegalArgumentException unused3) {
                                        p5799335319119159120.f(g15471856606567993098, new Object[i]);
                                    }
                                } catch (IllegalArgumentException unused4) {
                                    i = 0;
                                }
                            } catch (SecurityException unused5) {
                                p5799335319119159120.f(G15471856606567993098.V3_SIG_POR_DID_NOT_VERIFY, new Object[0]);
                            } catch (Exception unused6) {
                                p5799335319119159120.f(G15471856606567993098.V3_SIG_MALFORMED_LINEAGE, new Object[0]);
                            }
                        } else if (i17 == 1436519170) {
                            if (this.f >= 33) {
                                int i18 = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt();
                                if (optionalInt.isPresent()) {
                                    int asInt = optionalInt.getAsInt();
                                    if (i18 != asInt) {
                                        p5799335319119159120.f(G15471856606567993098.V31_ROTATION_MIN_SDK_MISMATCH, Integer.valueOf(i18), Integer.valueOf(asInt));
                                    }
                                } else {
                                    p5799335319119159120.f(G15471856606567993098.V31_BLOCK_MISSING, Integer.valueOf(i18));
                                }
                            }
                            z = true;
                        } else if (i17 != -1029262406) {
                            p5799335319119159120.g(G15471856606567993098.V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i17));
                        } else if (this.g != 462663009) {
                            p5799335319119159120.g(G15471856606567993098.V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER, new Object[0]);
                        }
                    } catch (C15632080896631311437 | BufferUnderflowException unused7) {
                        p5799335319119159120.f(G15471856606567993098.V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i16));
                        return;
                    }
                }
                if (!optionalInt.isPresent() || z) {
                    return;
                }
                p5799335319119159120.g(G15471856606567993098.V31_ROTATION_MIN_SDK_ATTR_MISSING, Integer.valueOf(optionalInt.getAsInt()));
            } catch (N5580838516609915046 e7) {
                throw new G16421604151151493810(e7.getMessage());
            }
        } catch (G16421604151151493810 unused8) {
            p5799335319119159120.f(G15471856606567993098.V3_SIG_NO_SUPPORTED_SIGNATURES, new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0139, code lost:
    
        if (r4 < (r0.isPresent() ? r0.getAsInt() - 1 : r14.f)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        r2.d(dev.epro.r0.G15471856606567993098.V3_INCONSISTENT_SDK_VERSIONS, new java.lang.Object[0]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.P3161324327665759195 b() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M11413732651945409100.b():dev.epro.r0.P3161324327665759195");
    }
}
