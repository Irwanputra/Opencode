package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import dev.epro.r0.C9142879380583651391;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I8626815837691735180;
import dev.epro.r0.L11610354117192841236;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.T17032536773975598836;
import dev.epro.r0.Z3383101362411723454;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.DSAParams;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class DSAKeyAlgorithm extends KeyAlgorithm<java.security.interfaces.DSAPublicKey, java.security.interfaces.DSAPrivateKey> {
    public DSAKeyAlgorithm() {
        super("SHA1WithDSA", "ssh-dss", java.security.interfaces.DSAPrivateKey.class);
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public java.security.interfaces.DSAPublicKey decodePublicKey(byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        String g = c9142879380583651391.g();
        if (!g.equals(getKeyFormat())) {
            throw new I8626815837691735180(G6547577305291411977.t("Unsupported key format found '", g, "' while expecting ", getKeyFormat()));
        }
        BigInteger e = c9142879380583651391.e();
        BigInteger e2 = c9142879380583651391.e();
        BigInteger e3 = c9142879380583651391.e();
        BigInteger e4 = c9142879380583651391.e();
        if (c9142879380583651391.j() != 0) {
            Q11088980322693754445.h("Padding in DSA public key!");
            return null;
        }
        try {
            return (java.security.interfaces.DSAPublicKey) KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(e4, e, e2, e3));
        } catch (GeneralSecurityException e5) {
            Z3383101362411723454.q("Could not generate DSA Key", e5);
            return null;
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length != 40) {
            C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
            if (!c9142879380583651391.g().equals(getKeyFormat())) {
                Q11088980322693754445.h("Peer sent wrong signature format");
                return null;
            }
            bArr = c9142879380583651391.c();
            if (bArr.length != 40) {
                Q11088980322693754445.h("Peer sent corrupt signature");
                return null;
            }
            if (c9142879380583651391.j() != 0) {
                Q11088980322693754445.h("Padding in DSA signature!");
                return null;
            }
        }
        byte b3 = bArr[0];
        if (b3 == 0 && (b = bArr[1]) == 0 && (b2 = bArr[2]) == 0) {
            int i = ((b3 << 24) & (-16777216)) | ((b << 16) & 16711680) | ((b2 << 8) & 65280) | (bArr[3] & 255);
            int i2 = ((bArr[4 + i] << 24) & (-16777216)) | (16711680 & (bArr[i + 5] << 16)) | (65280 & (bArr[i + 6] << 8)) | (bArr[i + 7] & 255);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i + 8, bArr2, 0, i2);
            bArr = bArr2;
        }
        int i3 = (bArr[0] & 128) != 0 ? 1 : 0;
        byte b4 = (bArr[20] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte[] bArr3 = new byte[L11610354117192841236.e(bArr.length, 6, i3, b4)];
        bArr3[0] = 48;
        if (bArr.length != 40) {
            Q11088980322693754445.h("Peer sent corrupt signature");
            return null;
        }
        bArr3[1] = 44;
        byte b5 = (byte) (44 + i3);
        bArr3[1] = b5;
        bArr3[1] = (byte) (b5 + b4);
        bArr3[2] = 2;
        bArr3[3] = 20;
        bArr3[3] = (byte) (20 + i3);
        System.arraycopy(bArr, 0, bArr3, i3 + 4, 20);
        bArr3[bArr3[3] + 4] = 2;
        bArr3[bArr3[3] + 5] = 20;
        int i4 = bArr3[3] + 5;
        bArr3[i4] = (byte) (bArr3[i4] + b4);
        System.arraycopy(bArr, 20, bArr3, bArr3[3] + 6 + b4, 20);
        return bArr3;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(java.security.interfaces.DSAPublicKey dSAPublicKey) {
        DSAParams params = dSAPublicKey.getParams();
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        t17032536773975598836.q(params.getP());
        t17032536773975598836.q(params.getQ());
        t17032536773975598836.q(params.getG());
        t17032536773975598836.q(dSAPublicKey.getY());
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        int i = bArr[3] & 255;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 4, bArr2, 0, i);
        int i2 = bArr[i + 5] & 255;
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i + 6, bArr3, 0, i2);
        byte[] bArr4 = new byte[40];
        int i3 = i < 20 ? i : 20;
        int i4 = i2 < 20 ? i2 : 20;
        System.arraycopy(bArr2, i - i3, bArr4, 20 - i3, i3);
        System.arraycopy(bArr3, i2 - i4, bArr4, 40 - i4, i4);
        t17032536773975598836.s(0, bArr4, 40);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public List<CertificateDecoder> getCertificateDecoders() {
        return Arrays.asList(new DsaCertificateDecoder(0), new OpenSshCertificateDecoder(getKeyFormat()) { // from class: com.trilead.ssh2.signature.DSAKeyAlgorithm.1
            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
            public KeyPair generateKeyPair(C9142879380583651391 c9142879380583651391) {
                BigInteger e = c9142879380583651391.e();
                BigInteger e2 = c9142879380583651391.e();
                BigInteger e3 = c9142879380583651391.e();
                BigInteger e4 = c9142879380583651391.e();
                DSAPrivateKeySpec dSAPrivateKeySpec = new DSAPrivateKeySpec(c9142879380583651391.e(), e, e2, e3);
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(e4, e, e2, e3);
                KeyFactory keyFactory = KeyFactory.getInstance("DSA");
                return new KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
            }
        });
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class DsaCertificateDecoder extends CertificateDecoder {
        public /* synthetic */ DsaCertificateDecoder(int i) {
            this();
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public KeyPair createKeyPair(PEMStructure pEMStructure) {
            SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
            byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(readSequenceAsByteArray);
            BigInteger readInt = simpleDERReader.readInt();
            if (readInt.compareTo(BigInteger.ZERO) != 0) {
                Q11088980322693754445.h(G6547577305291411977.s("Wrong version (", String.valueOf(readInt), ") in DSA PRIVATE KEY DER stream."));
                return null;
            }
            BigInteger readInt2 = simpleDERReader.readInt();
            BigInteger readInt3 = simpleDERReader.readInt();
            BigInteger readInt4 = simpleDERReader.readInt();
            BigInteger readInt5 = simpleDERReader.readInt();
            BigInteger readInt6 = simpleDERReader.readInt();
            if (simpleDERReader.available() != 0) {
                Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
                return null;
            }
            try {
                DSAPrivateKeySpec dSAPrivateKeySpec = new DSAPrivateKeySpec(readInt6, readInt2, readInt3, readInt4);
                DSAPublicKeySpec dSAPublicKeySpec = new DSAPublicKeySpec(readInt5, readInt2, readInt3, readInt4);
                KeyFactory keyFactory = KeyFactory.getInstance("DSA");
                return new KeyPair(keyFactory.generatePublic(dSAPublicKeySpec), keyFactory.generatePrivate(dSAPrivateKeySpec));
            } catch (GeneralSecurityException unused) {
                Q11088980322693754445.h("Could not decode DSA key pair");
                return null;
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getEndLine() {
            return "-----END DSA PRIVATE KEY-----";
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getStartLine() {
            return "-----BEGIN DSA PRIVATE KEY-----";
        }

        private DsaCertificateDecoder() {
        }
    }
}
