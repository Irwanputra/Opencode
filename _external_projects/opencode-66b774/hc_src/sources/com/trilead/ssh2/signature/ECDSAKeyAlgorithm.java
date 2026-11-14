package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.SimpleDERReader;
import dev.epro.r0.C9142879380583651391;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.T17032536773975598836;
import dev.epro.r0.Z3383101362411723454;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class ECDSAKeyAlgorithm extends KeyAlgorithm<ECPublicKey, ECPrivateKey> {
    private static final byte ANS1_INTEGER = 2;
    private static final byte ANS1_ZERO = 0;
    private static final String ECDSA_SHA2_PREFIX = "ecdsa-sha2-";
    private final String curveName;
    private final ECParameterSpec ecParameterSpec;

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class ECDSASha2Nistp256 extends ECDSAKeyAlgorithm {
        private static final String KEY_FORMAT = "ecdsa-sha2-nistp256";
        private static final String NISTP256 = "nistp256";

        public ECDSASha2Nistp256() {
            super("SHA256withECDSA", NISTP256, new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", 16)), new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", 16), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)), new ECPoint(new BigInteger("6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", 16), new BigInteger("4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", 16)), new BigInteger("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551", 16), 1), 0);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ PublicKey decodePublicKey(byte[] bArr) {
            return super.decodePublicKey(bArr);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ byte[] encodePublicKey(ECPublicKey eCPublicKey) {
            return super.encodePublicKey(eCPublicKey);
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public List<CertificateDecoder> getCertificateDecoders() {
            return Arrays.asList(new EcdsaCertificateDecoder("1.2.840.10045.3.1.7", getEcParameterSpec(), 0), new OpenSshEcdsaCertificateDecoder(getKeyFormat(), getCurveName(), getEcParameterSpec()));
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm
        public String getDigestAlgorithm() {
            return "SHA-256";
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public String getKeyFormat() {
            return KEY_FORMAT;
        }
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class ECDSASha2Nistp384 extends ECDSAKeyAlgorithm {
        private static final String KEY_FORMAT = "ecdsa-sha2-nistp384";
        private static final String NISTP384 = "nistp384";

        public ECDSASha2Nistp384() {
            super("SHA384withECDSA", NISTP384, new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", 16), new BigInteger("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", 16)), new ECPoint(new BigInteger("AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", 16), new BigInteger("3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", 16)), new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973", 16), 1), 0);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ PublicKey decodePublicKey(byte[] bArr) {
            return super.decodePublicKey(bArr);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ byte[] encodePublicKey(ECPublicKey eCPublicKey) {
            return super.encodePublicKey(eCPublicKey);
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public List<CertificateDecoder> getCertificateDecoders() {
            return Arrays.asList(new EcdsaCertificateDecoder("1.3.132.0.34", getEcParameterSpec(), 0), new OpenSshEcdsaCertificateDecoder(getKeyFormat(), getCurveName(), getEcParameterSpec()));
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm
        public String getDigestAlgorithm() {
            return "SHA-384";
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public String getKeyFormat() {
            return KEY_FORMAT;
        }
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class ECDSASha2Nistp521 extends ECDSAKeyAlgorithm {
        private static final String KEY_FORMAT = "ecdsa-sha2-nistp521";
        private static final String NISTP521 = "nistp521";

        public ECDSASha2Nistp521() {
            super("SHA512withECDSA", NISTP521, new ECParameterSpec(new EllipticCurve(new ECFieldFp(new BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 16)), new BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC", 16), new BigInteger("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00", 16)), new ECPoint(new BigInteger("00C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66", 16), new BigInteger("011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650", 16)), new BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409", 16), 1), 0);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ PublicKey decodePublicKey(byte[] bArr) {
            return super.decodePublicKey(bArr);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ byte[] encodePublicKey(ECPublicKey eCPublicKey) {
            return super.encodePublicKey(eCPublicKey);
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public List<CertificateDecoder> getCertificateDecoders() {
            return Arrays.asList(new EcdsaCertificateDecoder("1.3.132.0.35", getEcParameterSpec(), 0), new OpenSshEcdsaCertificateDecoder(getKeyFormat(), getCurveName(), getEcParameterSpec()));
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm
        public String getDigestAlgorithm() {
            return "SHA-512";
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public String getKeyFormat() {
            return KEY_FORMAT;
        }
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class OpenSshEcdsaCertificateDecoder extends OpenSshCertificateDecoder {
        private final String curveName;
        private final ECParameterSpec ecParameterSpec;

        public OpenSshEcdsaCertificateDecoder(String str, String str2, ECParameterSpec eCParameterSpec) {
            super(str);
            this.curveName = str2;
            this.ecParameterSpec = eCParameterSpec;
        }

        @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
        public KeyPair generateKeyPair(C9142879380583651391 c9142879380583651391) {
            String g = c9142879380583651391.g();
            if (!g.equals(this.curveName)) {
                Q11088980322693754445.h("Incorrect curve name: ".concat(g));
                return null;
            }
            byte[] c = c9142879380583651391.c();
            BigInteger e = c9142879380583651391.e();
            ECPoint decodePoint = ECDSAKeyAlgorithm.decodePoint(c, this.ecParameterSpec.getCurve());
            if (decodePoint == null) {
                Q11088980322693754445.h("Invalid ECDSA group");
                return null;
            }
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(decodePoint, this.ecParameterSpec);
            ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(e, this.ecParameterSpec);
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            return new KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
        }
    }

    private ECDSAKeyAlgorithm(String str, String str2, ECParameterSpec eCParameterSpec) {
        super(str, G6547577305291411977.C(ECDSA_SHA2_PREFIX, str2), ECPrivateKey.class);
        this.curveName = str2;
        this.ecParameterSpec = eCParameterSpec;
    }

    public static ECPoint decodePoint(byte[] bArr, EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) / 8;
        if (bArr.length != (fieldSize * 2) + 1 || bArr[0] != 4 || bArr.length == 0) {
            return null;
        }
        byte[] bArr2 = new byte[fieldSize];
        System.arraycopy(bArr, 1, bArr2, 0, fieldSize);
        byte[] bArr3 = new byte[fieldSize];
        System.arraycopy(bArr, fieldSize + 1, bArr3, 0, fieldSize);
        return new ECPoint(new BigInteger(1, bArr2), new BigInteger(1, bArr3));
    }

    public static byte[] encodePoint(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) / 8;
        byte[] bArr = new byte[(fieldSize * 2) + 1];
        bArr[0] = 4;
        byte[] removeLeadingZeroes = removeLeadingZeroes(eCPoint.getAffineX().toByteArray());
        int i = fieldSize + 1;
        System.arraycopy(removeLeadingZeroes, 0, bArr, i - removeLeadingZeroes.length, removeLeadingZeroes.length);
        byte[] removeLeadingZeroes2 = removeLeadingZeroes(eCPoint.getAffineY().toByteArray());
        System.arraycopy(removeLeadingZeroes2, 0, bArr, (i + fieldSize) - removeLeadingZeroes2.length, removeLeadingZeroes2.length);
        return bArr;
    }

    public static String getDigestAlgorithmForParams(ECKey eCKey) {
        ECDSAKeyAlgorithm verifierForKey = getVerifierForKey(eCKey);
        if (verifierForKey == null) {
            return null;
        }
        return verifierForKey.getDigestAlgorithm();
    }

    public static ECDSAKeyAlgorithm getVerifierForKey(ECKey eCKey) {
        int fieldSize = eCKey.getParams().getCurve().getField().getFieldSize();
        if (fieldSize == 256) {
            return new ECDSASha2Nistp256();
        }
        if (fieldSize == 384) {
            return new ECDSASha2Nistp384();
        }
        if (fieldSize != 521) {
            return null;
        }
        return new ECDSASha2Nistp521();
    }

    private static byte[] removeLeadingZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 1;
        while (i < bArr.length - 1 && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    private static void writeLength(int i, OutputStream outputStream) {
        if (i <= 127) {
            outputStream.write(i);
            return;
        }
        int i2 = 0;
        int i3 = i;
        while (i3 != 0) {
            i3 >>>= 8;
            i2++;
        }
        outputStream.write(i2 | 128);
        for (int i4 = (i2 - 1) * 8; i4 >= 0; i4 -= 8) {
            outputStream.write((byte) (i >> i4));
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public ECPublicKey decodePublicKey(byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(getKeyFormat())) {
            Q11088980322693754445.h("Invalid key format");
            return null;
        }
        c9142879380583651391.g();
        byte[] c = c9142879380583651391.c();
        if (c9142879380583651391.j() != 0) {
            Q11088980322693754445.h("Unexpected adding in ECDSA public key");
            return null;
        }
        ECParameterSpec ecParameterSpec = getEcParameterSpec();
        ECPoint decodePoint = decodePoint(c, ecParameterSpec.getCurve());
        if (decodePoint == null) {
            Q11088980322693754445.h("Invalid ECDSA group");
            return null;
        }
        try {
            return (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(decodePoint, ecParameterSpec));
        } catch (GeneralSecurityException e) {
            Z3383101362411723454.q("Could not decode ECDSA key", e);
            return null;
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(bArr);
        String g = c9142879380583651391.g();
        if (!g.equals(getKeyFormat())) {
            Q11088980322693754445.h("Unsupported signature format: ".concat(g));
            return null;
        }
        byte[] c = c9142879380583651391.c();
        if (c9142879380583651391.j() != 0) {
            Q11088980322693754445.h("Unexpected padding in ECDSA signature");
            return null;
        }
        C9142879380583651391 c91428793805836513912 = new C9142879380583651391(c);
        byte[] byteArray = c91428793805836513912.e().toByteArray();
        byte[] byteArray2 = c91428793805836513912.e().toByteArray();
        int length = byteArray.length;
        int length2 = byteArray2.length;
        if ((byteArray[0] & 128) != 0) {
            length++;
        }
        if ((byteArray2[0] & 128) != 0) {
            length2++;
        }
        int i = length + 6 + length2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        byteArrayOutputStream.write(48);
        writeLength(i - 2, byteArrayOutputStream);
        byteArrayOutputStream.write(2);
        writeLength(length, byteArrayOutputStream);
        if (length != byteArray.length) {
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.write(2);
        writeLength(length2, byteArrayOutputStream);
        if (length2 != byteArray2.length) {
            byteArrayOutputStream.write(0);
        }
        byteArrayOutputStream.write(byteArray2);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodePublicKey(ECPublicKey eCPublicKey) {
        byte[] encodePoint = encodePoint(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        t17032536773975598836.t(getCurveName());
        t17032536773975598836.s(0, encodePoint, encodePoint.length);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        SimpleDERReader simpleDERReader = new SimpleDERReader(new SimpleDERReader(bArr).readSequenceAsByteArray());
        BigInteger readInt = simpleDERReader.readInt();
        BigInteger readInt2 = simpleDERReader.readInt();
        T17032536773975598836 t17032536773975598836 = new T17032536773975598836();
        t17032536773975598836.q(readInt);
        t17032536773975598836.q(readInt2);
        byte[] f = t17032536773975598836.f();
        T17032536773975598836 t170325367739755988362 = new T17032536773975598836();
        t170325367739755988362.t(getKeyFormat());
        t170325367739755988362.s(0, f, f.length);
        return t170325367739755988362.f();
    }

    public String getCurveName() {
        return this.curveName;
    }

    public abstract String getDigestAlgorithm();

    public ECParameterSpec getEcParameterSpec() {
        return this.ecParameterSpec;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public boolean supportsKey(PrivateKey privateKey) {
        if (!(privateKey instanceof ECPrivateKey)) {
            return false;
        }
        ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
        return super.supportsKey(eCPrivateKey) && eCPrivateKey.getParams().getCurve().getField().getFieldSize() == getEcParameterSpec().getCurve().getField().getFieldSize();
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class EcdsaCertificateDecoder extends CertificateDecoder {
        private final ECParameterSpec ecParameterSpec;
        private final String oid;

        private EcdsaCertificateDecoder(String str, ECParameterSpec eCParameterSpec) {
            this.oid = str;
            this.ecParameterSpec = eCParameterSpec;
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public KeyPair createKeyPair(PEMStructure pEMStructure) {
            SimpleDERReader simpleDERReader = new SimpleDERReader(pEMStructure.getData());
            byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                Q11088980322693754445.h("Unexpected padding in EC private key");
                return null;
            }
            SimpleDERReader simpleDERReader2 = new SimpleDERReader(readSequenceAsByteArray);
            BigInteger readInt = simpleDERReader2.readInt();
            if (readInt.compareTo(BigInteger.ONE) != 0) {
                Q11088980322693754445.h("Unexpected version number in EC private key: ".concat(String.valueOf(readInt)));
                return null;
            }
            byte[] readOctetString = simpleDERReader2.readOctetString();
            String str = null;
            byte[] bArr = null;
            while (simpleDERReader2.available() > 0) {
                int readConstructedType = simpleDERReader2.readConstructedType();
                SimpleDERReader readConstructed = simpleDERReader2.readConstructed();
                if (readConstructedType == 0) {
                    str = readConstructed.readOid();
                } else if (readConstructedType == 1) {
                    bArr = readConstructed.readOctetString();
                }
            }
            if (!this.oid.equals(str)) {
                Q11088980322693754445.h("Incorrect OID for current curve");
                return null;
            }
            BigInteger bigInteger = new BigInteger(1, readOctetString);
            int length = bArr.length - 1;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 1, bArr2, 0, length);
            ECPoint decodePoint = ECDSAKeyAlgorithm.decodePoint(bArr2, this.ecParameterSpec.getCurve());
            ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(bigInteger, this.ecParameterSpec);
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(decodePoint, this.ecParameterSpec);
            try {
                KeyFactory keyFactory = KeyFactory.getInstance("EC");
                return new KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
            } catch (GeneralSecurityException unused) {
                Q11088980322693754445.h("Could not generate EC key pair");
                return null;
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getEndLine() {
            return "-----END EC PRIVATE KEY-----";
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public String getStartLine() {
            return "-----BEGIN EC PRIVATE KEY-----";
        }

        public /* synthetic */ EcdsaCertificateDecoder(String str, ECParameterSpec eCParameterSpec, int i) {
            this(str, eCParameterSpec);
        }
    }

    public /* synthetic */ ECDSAKeyAlgorithm(String str, String str2, ECParameterSpec eCParameterSpec, int i) {
        this(str, str2, eCParameterSpec);
    }
}
