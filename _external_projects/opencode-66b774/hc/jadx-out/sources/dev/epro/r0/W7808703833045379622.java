package dev.epro.r0;

import ads_mobile_sdk.c7;
import ads_mobile_sdk.fg;
import ads_mobile_sdk.hg;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import o.bwmna.gdrqkg.izmyclvb;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class W7808703833045379622 {
    public static Z7022156542152740569 a;

    static {
        izmyclvb.qgayjvbiagej2(992);
    }

    public static final Y6144095862626460568 A(int i) {
        if (i == 0) {
            return Y6144095862626460568.a;
        }
        if (i == 1) {
            return Y6144095862626460568.b;
        }
        S10973172697741180971.j(G6547577305291411977.o(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final M12733718480826052124 B(int i) {
        if (i == 0) {
            return M12733718480826052124.a;
        }
        if (i == 1) {
            return M12733718480826052124.b;
        }
        if (i == 2) {
            return M12733718480826052124.c;
        }
        if (i == 3) {
            return M12733718480826052124.d;
        }
        if (i == 4) {
            return M12733718480826052124.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return M12733718480826052124.f;
        }
        S10973172697741180971.j(G6547577305291411977.o(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final W17497847401432715949 C(int i) {
        if (i == 0) {
            return W17497847401432715949.a;
        }
        if (i == 1) {
            return W17497847401432715949.b;
        }
        S10973172697741180971.j(G6547577305291411977.o(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final Y8203071358079267502 D(int i) {
        if (i == 0) {
            return Y8203071358079267502.a;
        }
        if (i == 1) {
            return Y8203071358079267502.b;
        }
        if (i == 2) {
            return Y8203071358079267502.c;
        }
        if (i == 3) {
            return Y8203071358079267502.d;
        }
        if (i == 4) {
            return Y8203071358079267502.e;
        }
        if (i == 5) {
            return Y8203071358079267502.f;
        }
        S10973172697741180971.j(G6547577305291411977.o(i, "Could not convert ", " to State"));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.H11646813293457574213 E(dev.epro.r0.K4412820318670641327 r25, int r26, int r27, int r28, int r29, int r30, dev.epro.r0.I5164649337253478959 r31, java.util.List r32, dev.epro.r0.Z17471428274427141949[] r33, int r34, int r35, int[] r36, int r37) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W7808703833045379622.E(dev.epro.r0.K4412820318670641327, int, int, int, int, int, dev.epro.r0.I5164649337253478959, java.util.List, dev.epro.r0.Z17471428274427141949[], int, int, int[], int):dev.epro.r0.H11646813293457574213");
    }

    public static final native Q7430090668634766253 F(String str);

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e0, code lost:
    
        r0 = dev.epro.r0.T8598786036980488824.d(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e4, code lost:
    
        dev.epro.r0.T18016951143603335921.y(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.W12092042239787071323 G(androidx.sqlite.SQLiteConnection r31, java.lang.String r32) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W7808703833045379622.G(androidx.sqlite.SQLiteConnection, java.lang.String):dev.epro.r0.W12092042239787071323");
    }

    public static final void H(M3727281027331139839 m3727281027331139839) {
        m3727281027331139839.b(new D13299261369809117014((byte) 2), O9245300239821758723.a);
    }

    public static final native P16268714776081031153 I(JSONObject jSONObject);

    public static final void J(L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, Object obj) {
        if (m3727281027331139839.S || !S10823041268949770285.t(m3727281027331139839.M(), obj)) {
            m3727281027331139839.k0(obj);
            m3727281027331139839.b(l12639328004344855510, obj);
        }
    }

    public static final int K(Y8203071358079267502 y8203071358079267502) {
        y8203071358079267502.getClass();
        int iOrdinal = y8203071358079267502.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        Z3383101362411723454.g();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static I12982432556619280823 L(P8646985343900033725 p8646985343900033725, int i) {
        p8646985343900033725.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            D11988991656201568495.l("Step must be positive, was: ", numValueOf, 46);
            return null;
        }
        int i2 = p8646985343900033725.a;
        int i3 = p8646985343900033725.b;
        if (p8646985343900033725.c <= 0) {
            i = -i;
        }
        return new I12982432556619280823(i2, i3, i);
    }

    public static final N13222963410360886453 M(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new N13222963410360886453(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                N13222963410360886453 n13222963410360886453S = D1286559660607336098.s(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return n13222963410360886453S;
            } finally {
            }
        } finally {
        }
    }

    public static P8646985343900033725 N(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new P8646985343900033725(i, i2 - 1, 1);
        }
        P8646985343900033725 p8646985343900033725 = P8646985343900033725.d;
        return P8646985343900033725.d;
    }

    public static F11254987978987383037 O(Y12887846282176508602 y12887846282176508602, J13328905385734298453 j13328905385734298453, byte[] bArr, HashMap map, int i, int i2) {
        F11254987978987383037 f11254987978987383037 = new F11254987978987383037(0);
        ByteBuffer byteBuffer = V12319504402545346730.A(y12887846282176508602, j13328905385734298453, 1845461005).a;
        P15728539964912394135 p15728539964912394135 = new P15728539964912394135();
        ((ArrayList) f11254987978987383037.c).add(p15728539964912394135);
        try {
            V3311072669930093336.u(V12319504402545346730.G(byteBuffer), CertificateFactory.getInstance("X.509"), p15728539964912394135, y(map), bArr, i, i2);
            f11254987978987383037.b = (f11254987978987383037.a() || f11254987978987383037.b()) ? false : true;
            return f11254987978987383037;
        } catch (C15632080896631311437 | BufferUnderflowException unused) {
            p15728539964912394135.a(20, new Object[0]);
            return f11254987978987383037;
        } catch (CertificateException e) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e);
        }
    }

    public static int a(int i, int i2) {
        int iK = k(i);
        int iK2 = k(i2);
        if (iK == 1) {
            if (iK2 == 1) {
                return 0;
            }
            if (iK2 == 2) {
                return -1;
            }
            S10973172697741180971.j(C468629748621011703.e(iK2, "Unknown digestAlgorithm2: "));
            return 0;
        }
        if (iK != 2) {
            S10973172697741180971.j(C468629748621011703.e(iK, "Unknown digestAlgorithm1: "));
            return 0;
        }
        if (iK2 == 1) {
            return 1;
        }
        if (iK2 == 2) {
            return 0;
        }
        S10973172697741180971.j(C468629748621011703.e(iK2, "Unknown digestAlgorithm2: "));
        return 0;
    }

    public static String b(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        S10973172697741180971.j(C468629748621011703.e(i, "Unknown content digest algorthm: "));
        return null;
    }

    public static String c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            S10973172697741180971.j("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return e(byteBuffer, i);
        }
        StringBuilder sbQ = E12098517352909843120.q(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        sbQ.append(byteBuffer.remaining());
        throw new IOException(sbQ.toString());
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            S10973172697741180971.j(C468629748621011703.e(i, "size: "));
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static void f(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) ((i >>> 24) & 255);
    }

    public static X509Certificate[] g(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferD = d(byteBuffer);
        ByteBuffer byteBufferD2 = d(byteBuffer);
        byte[] bArrL = l(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = -1;
        byte[] bArrL2 = null;
        while (byteBufferD2.hasRemaining()) {
            i++;
            try {
                ByteBuffer byteBufferD3 = d(byteBufferD2);
                if (byteBufferD3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferD3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 == -1 || a(i3, i2) > 0) {
                    bArrL2 = l(byteBufferD3);
                    i2 = i3;
                }
            } catch (IOException e) {
                e = e;
                throw new SecurityException(C468629748621011703.e(i, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(C468629748621011703.e(i, "Failed to parse signature record #"), e);
            }
        }
        if (i2 == -1) {
            if (i == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    Z3383101362411723454.p("Unknown signature algorithm: 0x", Long.toHexString(i2));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    Z3383101362411723454.p("Unknown signature algorithm: 0x", Long.toHexString(i2));
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrL));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferD);
            if (!signature.verify(bArrL2)) {
                throw new SecurityException(G6547577305291411977.r(str2, " signature did not verify"));
            }
            byteBufferD.clear();
            ByteBuffer byteBufferD4 = d(byteBufferD);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            byte[] bArrL3 = null;
            while (byteBufferD4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferD5 = d(byteBufferD4);
                    if (byteBufferD5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferD5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i2) {
                        bArrL3 = l(byteBufferD5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    Z3383101362411723454.q(C468629748621011703.e(i4, "Failed to parse digest record #"), e);
                    return null;
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    Z3383101362411723454.q(C468629748621011703.e(i4, "Failed to parse digest record #"), e);
                    return null;
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iK = k(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iK), bArrL3);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrL3)) {
                throw new SecurityException(b(iK).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferD6 = d(byteBufferD);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferD6.hasRemaining()) {
                i6++;
                byte[] bArrL4 = l(byteBufferD6);
                try {
                    arrayList3.add(new hg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrL4)), bArrL4));
                } catch (CertificateException e5) {
                    throw new SecurityException(C468629748621011703.e(i6, "Failed to decode certificate #"), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrL, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(G6547577305291411977.s("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(G6547577305291411977.s("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(G6547577305291411977.s("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(G6547577305291411977.s("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(G6547577305291411977.s("Failed to verify ", str2, " signature"), e);
        }
    }

    public static byte[][] h(int[] iArr, K16859880908517287624[] k16859880908517287624Arr) throws DigestException {
        long j;
        byte[][] bArr;
        String str;
        int i;
        int i2;
        K16859880908517287624[] k16859880908517287624Arr2 = k16859880908517287624Arr;
        int length = k16859880908517287624Arr2.length;
        int i3 = 0;
        long size = 0;
        while (true) {
            j = 1048576;
            if (i3 >= length) {
                break;
            }
            size += (k16859880908517287624Arr2[i3].size() + 1048575) / 1048576;
            i3++;
        }
        if (size >= 2097151) {
            throw new DigestException(E12098517352909843120.k(size, "Too many chunks: "));
        }
        int i4 = (int) size;
        byte[][] bArr2 = new byte[iArr.length][];
        int i5 = 0;
        while (true) {
            byte[][] bArr3 = null;
            if (i5 >= iArr.length) {
                byte[] bArr4 = new byte[5];
                bArr4[0] = -91;
                int length2 = iArr.length;
                MessageDigest[] messageDigestArr = new MessageDigest[length2];
                int i6 = 0;
                while (true) {
                    bArr = bArr3;
                    str = " digest not supported";
                    if (i6 >= iArr.length) {
                        break;
                    }
                    String strB = b(iArr[i6]);
                    try {
                        messageDigestArr[i6] = MessageDigest.getInstance(strB);
                        i6++;
                        bArr3 = bArr;
                    } catch (NoSuchAlgorithmException e) {
                        Z3383101362411723454.m(strB.concat(" digest not supported"), e);
                        return bArr;
                    }
                }
                int length3 = k16859880908517287624Arr2.length;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < length3) {
                    K16859880908517287624 k16859880908517287624 = k16859880908517287624Arr2[i7];
                    int i10 = i7;
                    long size2 = k16859880908517287624.size();
                    long j2 = 0;
                    int i11 = i9;
                    while (size2 > 0) {
                        String str2 = str;
                        int i12 = i8;
                        int iMin = (int) Math.min(size2, j);
                        f(iMin, bArr4);
                        for (int i13 = 0; i13 < length2; i13++) {
                            messageDigestArr[i13].update(bArr4);
                        }
                        long j3 = j2;
                        try {
                            k16859880908517287624.a(messageDigestArr, j3, iMin);
                            int i14 = 0;
                            while (i14 < iArr.length) {
                                int i15 = iArr[i14];
                                byte[] bArr5 = bArr2[i14];
                                byte[] bArr6 = bArr4;
                                if (i15 == 1) {
                                    i = 32;
                                } else {
                                    if (i15 != 2) {
                                        S10973172697741180971.j(C468629748621011703.e(i15, "Unknown content digest algorthm: "));
                                        return bArr;
                                    }
                                    i = 64;
                                }
                                MessageDigest messageDigest = messageDigestArr[i14];
                                int i16 = length3;
                                int i17 = i11;
                                long j4 = size2;
                                int iDigest = messageDigest.digest(bArr5, (i17 * i) + 5, i);
                                if (iDigest != i) {
                                    throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                                }
                                i14++;
                                i11 = i17;
                                bArr4 = bArr6;
                                length3 = i16;
                                size2 = j4;
                            }
                            long j5 = iMin;
                            i11++;
                            bArr4 = bArr4;
                            j2 = j3 + j5;
                            size2 -= j5;
                            str = str2;
                            i8 = i12;
                            length3 = length3;
                            j = 1048576;
                        } catch (IOException e2) {
                            throw new DigestException(E12098517352909843120.l("Failed to digest chunk #", i11, i12, " of section #"), e2);
                        }
                    }
                    i8++;
                    i7 = i10 + 1;
                    k16859880908517287624Arr2 = k16859880908517287624Arr;
                    i9 = i11;
                    length3 = length3;
                    j = 1048576;
                }
                String str3 = str;
                byte[][] bArr7 = new byte[iArr.length][];
                for (int i18 = 0; i18 < iArr.length; i18++) {
                    int i19 = iArr[i18];
                    byte[] bArr8 = bArr2[i18];
                    String strB2 = b(i19);
                    try {
                        bArr7[i18] = MessageDigest.getInstance(strB2).digest(bArr8);
                    } catch (NoSuchAlgorithmException e3) {
                        Z3383101362411723454.m(strB2.concat(str3), e3);
                        return bArr;
                    }
                }
                return bArr7;
            }
            int i20 = iArr[i5];
            if (i20 == 1) {
                i2 = 32;
            } else {
                if (i20 != 2) {
                    S10973172697741180971.j(C468629748621011703.e(i20, "Unknown content digest algorthm: "));
                    return null;
                }
                i2 = 64;
            }
            byte[] bArr9 = new byte[(i2 * i4) + 5];
            bArr9[0] = 90;
            f(i4, bArr9);
            bArr2[i5] = bArr9;
            i5++;
        }
    }

    public static X509Certificate[][] i(RandomAccessFile randomAccessFile) throws Z12698456576814114874, IOException {
        Pair pairD;
        if (randomAccessFile.length() < 22) {
            pairD = null;
        } else {
            pairD = G7713175901684004489.d(randomAccessFile, 0);
            if (pairD == null) {
                pairD = G7713175901684004489.d(randomAccessFile, 65535);
            }
        }
        if (pairD == null) {
            throw new Z12698456576814114874("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        }
        ByteBuffer byteBuffer = (ByteBuffer) pairD.first;
        long jLongValue = ((Long) pairD.second).longValue();
        long j = jLongValue - 20;
        if (j >= 0) {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == 1347094023) {
                throw new Z12698456576814114874("ZIP64 APK not supported");
            }
        }
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (byteOrderOrder != byteOrder) {
            S10973172697741180971.j("ByteBuffer byte order must be little endian");
            return null;
        }
        long j2 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
        if (j2 >= jLongValue) {
            StringBuilder sbR = E12098517352909843120.r("ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: ", j2);
            sbR.append(jLongValue);
            throw new Z12698456576814114874(sbR.toString());
        }
        if (byteBuffer.order() != byteOrder) {
            S10973172697741180971.j("ByteBuffer byte order must be little endian");
            return null;
        }
        if (j2 + (((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) != jLongValue) {
            throw new Z12698456576814114874("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        if (j2 < 32) {
            throw new Z12698456576814114874(E12098517352909843120.k(j2, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j2 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int i = 8;
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new Z12698456576814114874("No APK Signing Block before ZIP Central Directory");
        }
        long j3 = byteBufferAllocate.getLong(0);
        if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
            throw new Z12698456576814114874(E12098517352909843120.k(j3, "APK Signing Block size out of range: "));
        }
        int i2 = (int) (8 + j3);
        long j4 = j2 - ((long) i2);
        if (j4 < 0) {
            throw new Z12698456576814114874(E12098517352909843120.k(j4, "APK Signing Block offset out of range: "));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j5 = byteBufferAllocate2.getLong(0);
        if (j5 != j3) {
            StringBuilder sbR2 = E12098517352909843120.r("APK Signing Block sizes in header and footer do not match: ", " vs ", j5);
            sbR2.append(j3);
            throw new Z12698456576814114874(sbR2.toString());
        }
        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
        long jLongValue2 = ((Long) pairCreate.second).longValue();
        if (byteBuffer2.order() != byteOrder) {
            S10973172697741180971.j("ByteBuffer byte order must be little endian");
            return null;
        }
        int iCapacity = byteBuffer2.capacity() - 24;
        if (iCapacity < 8) {
            S10973172697741180971.j(G6547577305291411977.o(iCapacity, "end < start: ", " < 8"));
            return null;
        }
        int iCapacity2 = byteBuffer2.capacity();
        if (iCapacity > byteBuffer2.capacity()) {
            S10973172697741180971.j(E12098517352909843120.l("end > capacity: ", iCapacity, iCapacity2, " > "));
            return null;
        }
        int iLimit = byteBuffer2.limit();
        int iPosition = byteBuffer2.position();
        try {
            byteBuffer2.position(0);
            byteBuffer2.limit(iCapacity);
            byteBuffer2.position(8);
            ByteBuffer byteBufferSlice = byteBuffer2.slice();
            byteBufferSlice.order(byteBuffer2.order());
            byteBuffer2.position(0);
            byteBuffer2.limit(iLimit);
            byteBuffer2.position(iPosition);
            int i3 = 0;
            while (byteBufferSlice.hasRemaining()) {
                i3++;
                if (byteBufferSlice.remaining() < i) {
                    throw new Z12698456576814114874(C468629748621011703.e(i3, "Insufficient data to read size of APK Signing Block entry #"));
                }
                long j6 = byteBufferSlice.getLong();
                if (j6 < 4 || j6 > 2147483647L) {
                    throw new Z12698456576814114874("APK Signing Block entry #" + i3 + " size out of range: " + j6);
                }
                int i4 = (int) j6;
                int iPosition2 = byteBufferSlice.position() + i4;
                if (i4 > byteBufferSlice.remaining()) {
                    StringBuilder sbP = E12098517352909843120.p(i3, i4, "APK Signing Block entry #", " size out of range: ", ", available: ");
                    sbP.append(byteBufferSlice.remaining());
                    throw new Z12698456576814114874(sbP.toString());
                }
                if (byteBufferSlice.getInt() == 1896449818) {
                    ByteBuffer byteBufferE = e(byteBufferSlice, i4 - 4);
                    FileChannel channel = randomAccessFile.getChannel();
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        try {
                            ByteBuffer byteBufferD = d(byteBufferE);
                            int i5 = 0;
                            while (byteBufferD.hasRemaining()) {
                                i5++;
                                try {
                                    arrayList.add(g(d(byteBufferD), map, certificateFactory));
                                } catch (IOException | SecurityException | BufferUnderflowException e) {
                                    throw new SecurityException(G6547577305291411977.o(i5, "Failed to parse/verify signer #", " block"), e);
                                }
                            }
                            if (i5 < 1) {
                                throw new SecurityException("No signers found");
                            }
                            if (map.isEmpty()) {
                                throw new SecurityException("No content digests found");
                            }
                            if (map.isEmpty()) {
                                throw new SecurityException("No digests provided");
                            }
                            fg fgVar = new fg(channel, 0L, jLongValue2);
                            fg fgVar2 = new fg(channel, j2, jLongValue - j2);
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                            byteBufferDuplicate.order(byteOrder2);
                            if (byteBufferDuplicate.order() != byteOrder2) {
                                S10973172697741180971.j("ByteBuffer byte order must be little endian");
                                return null;
                            }
                            int iPosition3 = byteBufferDuplicate.position() + 16;
                            if (jLongValue2 < 0 || jLongValue2 > 4294967295L) {
                                S10973172697741180971.j(E12098517352909843120.k(jLongValue2, "uint32 value of out range: "));
                                return null;
                            }
                            byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition3, (int) jLongValue2);
                            c7 c7Var = new c7(byteBufferDuplicate);
                            int size = map.size();
                            int[] iArr = new int[size];
                            Iterator it = map.keySet().iterator();
                            int i6 = 0;
                            while (it.hasNext()) {
                                iArr[i6] = ((Integer) it.next()).intValue();
                                i6++;
                            }
                            try {
                                byte[][] bArrH = h(iArr, new K16859880908517287624[]{fgVar, fgVar2, c7Var});
                                for (int i7 = 0; i7 < size; i7++) {
                                    int i8 = iArr[i7];
                                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i8)), bArrH[i7])) {
                                        throw new SecurityException(b(i8).concat(" digest of contents did not verify"));
                                    }
                                }
                                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                            } catch (DigestException e2) {
                                throw new SecurityException("Failed to compute digest(s) of contents", e2);
                            }
                        } catch (IOException e3) {
                            throw new SecurityException("Failed to read list of signers", e3);
                        }
                    } catch (CertificateException e4) {
                        Z3383101362411723454.m("Failed to obtain X.509 CertificateFactory", e4);
                        return null;
                    }
                }
                byteBufferSlice.position(iPosition2);
                i = 8;
            }
            throw new Z12698456576814114874("No APK Signature Scheme v2 block in APK Signing Block");
        } catch (Throwable th) {
            byteBuffer2.position(0);
            byteBuffer2.limit(iLimit);
            byteBuffer2.position(iPosition);
            throw th;
        }
    }

    public static X509Certificate[][] j(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            X509Certificate[][] x509CertificateArrI = i(randomAccessFile);
            randomAccessFile.close();
            return x509CertificateArrI;
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int k(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                Z3383101362411723454.p("Unknown signature algorithm: 0x", Long.toHexString(i));
                return 0;
        }
    }

    public static byte[] l(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            Q11088980322693754445.h("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbQ = E12098517352909843120.q(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbQ.append(byteBuffer.remaining());
        throw new IOException(sbQ.toString());
    }

    public static final LinkedHashSet m(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z = objectInputStream.readBoolean();
                    uri.getClass();
                    linkedHashSet.add(new D12564639665095693399(uri, z));
                }
                objectInputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Z1953481206310471956.z(byteArrayInputStream, th);
                throw th2;
            }
        }
        byteArrayInputStream.close();
        return linkedHashSet;
    }

    public static Comparable n(A891803927997771281 a891803927997771281, A891803927997771281 a8918039279977712812) {
        return a891803927997771281.compareTo(a8918039279977712812) < 0 ? a8918039279977712812 : a891803927997771281;
    }

    public static double o(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float p(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int q(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static int r(int i, T12706830675561353559 t12706830675561353559) {
        if (t12706830675561353559 instanceof W11178805066658661419) {
            return ((Number) v(Integer.valueOf(i), (W11178805066658661419) t12706830675561353559)).intValue();
        }
        if (!t12706830675561353559.isEmpty()) {
            return i < ((Number) t12706830675561353559.a()).intValue() ? ((Number) t12706830675561353559.a()).intValue() : i > ((Number) t12706830675561353559.b()).intValue() ? ((Number) t12706830675561353559.b()).intValue() : i;
        }
        D11988991656201568495.l("Cannot coerce value to an empty range: ", t12706830675561353559, 46);
        return 0;
    }

    public static long s(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder sbR = E12098517352909843120.r("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j3);
        sbR.append(j2);
        sbR.append('.');
        throw new IllegalArgumentException(sbR.toString());
    }

    public static long t(long j, B1946763318172869485 b1946763318172869485) {
        long j2 = b1946763318172869485.b;
        long j3 = b1946763318172869485.a;
        if (!b1946763318172869485.isEmpty()) {
            return j < Long.valueOf(j3).longValue() ? Long.valueOf(j3).longValue() : j > Long.valueOf(j2).longValue() ? Long.valueOf(j2).longValue() : j;
        }
        D11988991656201568495.l("Cannot coerce value to an empty range: ", b1946763318172869485, 46);
        return 0L;
    }

    public static Comparable u(A891803927997771281 a891803927997771281, A891803927997771281 a8918039279977712812, A891803927997771281 a8918039279977712813) {
        if (a8918039279977712812.compareTo(a8918039279977712813) <= 0) {
            return a891803927997771281.compareTo(a8918039279977712812) < 0 ? a8918039279977712812 : a891803927997771281.compareTo(a8918039279977712813) > 0 ? a8918039279977712813 : a891803927997771281;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + a8918039279977712813 + " is less than minimum " + a8918039279977712812 + '.');
    }

    public static final Comparable v(Comparable comparable, W11178805066658661419 w11178805066658661419) {
        float f = w11178805066658661419.a;
        Float fValueOf = Float.valueOf(0.0f);
        if (!w11178805066658661419.isEmpty()) {
            return (!W11178805066658661419.c(comparable, fValueOf) || W11178805066658661419.c(fValueOf, comparable)) ? (!W11178805066658661419.c(Float.valueOf(f), comparable) || W11178805066658661419.c(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f) : fValueOf;
        }
        D11988991656201568495.l("Cannot coerce value to an empty range: ", w11178805066658661419, 46);
        return null;
    }

    public static L6149251032718914612 w(M3727281027331139839 m3727281027331139839) {
        J3745674191043464657 j3745674191043464657 = (J3745674191043464657) m3727281027331139839.j(J5654975781851244064.a);
        L6149251032718914612 l6149251032718914612 = j3745674191043464657.q0;
        if (l6149251032718914612 != null) {
            return l6149251032718914612;
        }
        L6149251032718914612 l61492510327189146122 = new L6149251032718914612(J5654975781851244064.d(j3745674191043464657, T18016951143603335921.l), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.q), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.u), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.y), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.f501o), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.t), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.A), U10174709222559481877.g, J5654975781851244064.d(j3745674191043464657, T18016951143603335921.B), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.C), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.J), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.L), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.K), J5654975781851244064.d(j3745674191043464657, T18016951143603335921.M));
        j3745674191043464657.q0 = l61492510327189146122;
        return l61492510327189146122;
    }

    public static final Z7022156542152740569 x() {
        Z7022156542152740569 z7022156542152740569 = a;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(15.5f, 14.0f);
        v14323974914327418545.g(-0.79f);
        v14323974914327418545.i(-0.28f, -0.27f);
        v14323974914327418545.d(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        v14323974914327418545.d(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        v14323974914327418545.n(3.0f, 5.91f, 3.0f, 9.5f);
        v14323974914327418545.n(5.91f, 16.0f, 9.5f, 16.0f);
        v14323974914327418545.e(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        v14323974914327418545.i(0.27f, 0.28f);
        v14323974914327418545.s(0.79f);
        v14323974914327418545.i(5.0f, 4.99f);
        v14323974914327418545.h(20.49f, 19.0f);
        v14323974914327418545.i(-4.99f, -5.0f);
        v14323974914327418545.c();
        v14323974914327418545.j(9.5f, 14.0f);
        v14323974914327418545.d(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        v14323974914327418545.n(7.01f, 5.0f, 9.5f, 5.0f);
        v14323974914327418545.n(14.0f, 7.01f, 14.0f, 9.5f);
        v14323974914327418545.n(11.99f, 14.0f, 9.5f, 14.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        a = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static HashMap y(HashMap map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Map map3 = (Map) entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry2 : map3.entrySet()) {
                arrayList.add(new C16290937579972779475(Integer.valueOf(((Y4733161976867834422) entry2.getKey()).a), (byte[]) entry2.getValue()));
            }
            Collections.sort(arrayList, new J10770752472956524045((byte) 17));
            Integer num = (Integer) entry.getKey();
            int size = arrayList.size();
            int i = 0;
            int length = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                length += ((byte[]) ((C16290937579972779475) obj).b).length + 12;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                C16290937579972779475 c16290937579972779475 = (C16290937579972779475) obj2;
                byte[] bArr = (byte[]) c16290937579972779475.b;
                byteBufferAllocate.putInt(bArr.length + 8);
                byteBufferAllocate.putInt(((Integer) c16290937579972779475.a).intValue());
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            map2.put(num, byteBufferAllocate.array());
        }
        return map2;
    }

    public static final void z(M3727281027331139839 m3727281027331139839, Integer num) {
        X4712621039624176170 x4712621039624176170 = P2382941533350862833.j;
        if (m3727281027331139839.S) {
            m3727281027331139839.b(x4712621039624176170, num);
        }
    }
}
