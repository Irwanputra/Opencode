package dev.epro.r0;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V8767056641518014226 {
    public final int a;
    public final ArrayList b;

    public V8767056641518014226(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    public static V8767056641518014226 a(ArrayList arrayList) {
        V8767056641518014226 v8767056641518014226;
        V8767056641518014226 v87670566415180142262;
        if (arrayList.isEmpty()) {
            return null;
        }
        V8767056641518014226 v87670566415180142263 = (V8767056641518014226) arrayList.get(0);
        int i = 1;
        while (i < arrayList.size()) {
            V8767056641518014226 v87670566415180142264 = (V8767056641518014226) arrayList.get(i);
            T14597605096299173136 t14597605096299173136 = ((V1455815485744983495) v87670566415180142263.b.get(0)).a;
            ArrayList arrayList2 = v87670566415180142264.b;
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    v8767056641518014226 = v87670566415180142263;
                    v87670566415180142262 = v87670566415180142264;
                    break;
                }
                if (((V1455815485744983495) arrayList2.get(i2)).a.equals(t14597605096299173136)) {
                    v87670566415180142262 = v87670566415180142263;
                    v8767056641518014226 = v87670566415180142264;
                    break;
                }
                i2++;
            }
            ArrayList arrayList3 = v8767056641518014226.b;
            ArrayList arrayList4 = v87670566415180142262.b;
            V1455815485744983495 v1455815485744983495 = (V1455815485744983495) arrayList4.get(0);
            ArrayList arrayList5 = new ArrayList();
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    break;
                }
                int i4 = i3 + 1;
                V1455815485744983495 v14558154857449834952 = (V1455815485744983495) arrayList3.get(i3);
                if (v14558154857449834952.a.equals(v1455815485744983495.a)) {
                    i3 = i4;
                    break;
                }
                arrayList5.add(v14558154857449834952);
                i3 = i4;
            }
            if (i3 == arrayList5.size()) {
                S10973172697741180971.j("The provided lineage is not a descendant or an ancestor of this lineage");
                return null;
            }
            arrayList5.add(v1455815485744983495);
            int i5 = 1;
            while (i3 < arrayList3.size() && i5 < arrayList4.size()) {
                int i6 = i3 + 1;
                V1455815485744983495 v14558154857449834953 = (V1455815485744983495) arrayList3.get(i3);
                int i7 = i5 + 1;
                V1455815485744983495 v14558154857449834954 = (V1455815485744983495) arrayList4.get(i5);
                if (!v14558154857449834953.a.equals(v14558154857449834954.a)) {
                    S10973172697741180971.j("The provided lineage diverges from this lineage");
                    return null;
                }
                arrayList5.add(v14558154857449834954);
                i3 = i6;
                i5 = i7;
            }
            while (i3 < arrayList3.size()) {
                arrayList5.add((V1455815485744983495) arrayList3.get(i3));
                i3++;
            }
            while (i5 < arrayList4.size()) {
                arrayList5.add((V1455815485744983495) arrayList4.get(i5));
                i5++;
            }
            i++;
            v87670566415180142263 = new V8767056641518014226(arrayList5, Math.min(v87670566415180142263.a, v87670566415180142264.a));
        }
        return v87670566415180142263;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static V8767056641518014226 c(byte[] bArr) throws IOException {
        V8767056641518014226 v8767056641518014226;
        byte b;
        V8767056641518014226 v87670566415180142262;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferWrap.order(byteOrder);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (byteBufferOrder == null || !byteBufferOrder.hasRemaining()) {
            v8767056641518014226 = null;
            arrayList = null;
        } else {
            if (byteBufferOrder.order() != byteOrder) {
                S10973172697741180971.j("ByteBuffer byte order must be little endian");
                return null;
            }
            try {
                try {
                    try {
                        if (byteBufferOrder.getInt() != 1) {
                            throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                        }
                        HashSet hashSet = new HashSet();
                        int i2 = 0;
                        int i3 = 0;
                        T14597605096299173136 t14597605096299173136 = null;
                        while (byteBufferOrder.hasRemaining()) {
                            try {
                                i2++;
                                ByteBuffer byteBufferG = V12319504402545346730.G(byteBufferOrder);
                                ByteBuffer byteBufferG2 = V12319504402545346730.G(byteBufferG);
                                int i4 = byteBufferG.getInt();
                                int i5 = byteBufferG.getInt();
                                Y16631409940158714280 y16631409940158714280A = Y16631409940158714280.a(i3);
                                byte[] bArrU = V12319504402545346730.U(byteBufferG);
                                if (t14597605096299173136 != null) {
                                    C16290937579972779475 c16290937579972779475 = y16631409940158714280A.d;
                                    String str = (String) c16290937579972779475.a;
                                    AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) c16290937579972779475.b;
                                    PublicKey publicKey = t14597605096299173136.a.getPublicKey();
                                    Signature signature = Signature.getInstance(str);
                                    signature.initVerify(publicKey);
                                    if (algorithmParameterSpec != null) {
                                        signature.setParameter(algorithmParameterSpec);
                                    }
                                    signature.update(byteBufferG2);
                                    if (!signature.verify(bArrU)) {
                                        throw new SecurityException("Unable to verify signature of certificate #" + i2 + " using " + str + " when verifying V3SigningCertificateLineage object");
                                    }
                                }
                                byteBufferG2.rewind();
                                byte[] bArrU2 = V12319504402545346730.U(byteBufferG2);
                                int i6 = byteBufferG2.getInt();
                                if (t14597605096299173136 != null && i3 != i6) {
                                    throw new SecurityException("Signing algorithm ID mismatch for certificate #" + byteBufferG + " when verifying V3SigningCertificateLineage object");
                                }
                                T14597605096299173136 t145976050962991731362 = new T14597605096299173136(N6415941970858904263.a(bArrU2), bArrU2);
                                if (hashSet.contains(t145976050962991731362)) {
                                    throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i2 + ".  All signing certificates should be unique");
                                }
                                hashSet.add(t145976050962991731362);
                                arrayList.add(new V1455815485744983495(t145976050962991731362, Y16631409940158714280.a(i6), Y16631409940158714280.a(i5), bArrU, i4));
                                t14597605096299173136 = t145976050962991731362;
                                i3 = i5;
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                i = i2;
                                throw new SecurityException(G6547577305291411977.o(i, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                i = i2;
                                throw new SecurityException(G6547577305291411977.o(i, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                            } catch (NoSuchAlgorithmException e3) {
                                e = e3;
                                i = i2;
                                throw new SecurityException(G6547577305291411977.o(i, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                            } catch (SignatureException e4) {
                                e = e4;
                                i = i2;
                                throw new SecurityException(G6547577305291411977.o(i, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
                            } catch (CertificateException e5) {
                                e = e5;
                                i = i2;
                                throw new SecurityException(G6547577305291411977.o(i, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e);
                            }
                        }
                        v8767056641518014226 = null;
                    } catch (C15632080896631311437 e6) {
                        e = e6;
                        v87670566415180142262 = bArr;
                    } catch (BufferUnderflowException e7) {
                        e = e7;
                        v87670566415180142262 = bArr;
                    }
                } catch (C15632080896631311437 e8) {
                    e = e8;
                    v87670566415180142262 = 0;
                } catch (BufferUnderflowException e9) {
                    e = e9;
                    v87670566415180142262 = 0;
                }
                Z3383101362411723454.q("Failed to parse V3SigningCertificateLineage object", e);
                return v87670566415180142262;
            } catch (InvalidAlgorithmParameterException e10) {
                e = e10;
            } catch (InvalidKeyException e11) {
                e = e11;
            } catch (NoSuchAlgorithmException e12) {
                e = e12;
            } catch (SignatureException e13) {
                e = e13;
            } catch (CertificateException e14) {
                e = e14;
            }
        }
        if (arrayList == null) {
            S10973172697741180971.j("Can't calculate minimum SDK version of null nodes");
            return v8767056641518014226;
        }
        int size = arrayList.size();
        byte b2 = 28;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Y16631409940158714280 y16631409940158714280 = ((V1455815485744983495) obj).c;
            if (y16631409940158714280 != null && (b = y16631409940158714280.e) > b2) {
                b2 = b;
            }
        }
        return new V8767056641518014226(arrayList, b2);
    }

    public final V8767056641518014226 b(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            Z3383101362411723454.k("x509Certificate == null");
            return null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                S10973172697741180971.j("Certificate not found in SigningCertificateLineage");
                return null;
            }
            if (((V1455815485744983495) arrayList.get(i)).a.equals(x509Certificate)) {
                return new V8767056641518014226(new ArrayList(arrayList.subList(0, i + 1)), this.a);
            }
            i++;
        }
    }
}
