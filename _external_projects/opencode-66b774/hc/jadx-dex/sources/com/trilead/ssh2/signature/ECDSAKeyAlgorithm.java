package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class ECDSAKeyAlgorithm extends com.trilead.ssh2.signature.KeyAlgorithm<java.security.interfaces.ECPublicKey, java.security.interfaces.ECPrivateKey> {
    private static final byte ANS1_INTEGER = 2;
    private static final byte ANS1_ZERO = 0;
    private static final java.lang.String ECDSA_SHA2_PREFIX = "ecdsa-sha2-";
    private final java.lang.String curveName;
    private final java.security.spec.ECParameterSpec ecParameterSpec;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class ECDSASha2Nistp256 extends com.trilead.ssh2.signature.ECDSAKeyAlgorithm {
        private static final java.lang.String KEY_FORMAT = "ecdsa-sha2-nistp256";
        private static final java.lang.String NISTP256 = "nistp256";

        public ECDSASha2Nistp256() {
            super("SHA256withECDSA", NISTP256, new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(new java.math.BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF", 16)), new java.math.BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC", 16), new java.math.BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)), new java.security.spec.ECPoint(new java.math.BigInteger("6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296", 16), new java.math.BigInteger("4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5", 16)), new java.math.BigInteger("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551", 16), 1), 0);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ java.security.PublicKey decodePublicKey(byte[] bArr) {
            return super.decodePublicKey(bArr);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ byte[] encodePublicKey(java.security.PublicKey publicKey) {
            return super.encodePublicKey((java.security.interfaces.ECPublicKey) publicKey);
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public java.util.List<com.trilead.ssh2.crypto.CertificateDecoder> getCertificateDecoders() {
            return java.util.Arrays.asList(new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.EcdsaCertificateDecoder("1.2.840.10045.3.1.7", getEcParameterSpec(), 0), new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.OpenSshEcdsaCertificateDecoder(getKeyFormat(), getCurveName(), getEcParameterSpec()));
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm
        public java.lang.String getDigestAlgorithm() {
            return "SHA-256";
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public java.lang.String getKeyFormat() {
            return KEY_FORMAT;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class ECDSASha2Nistp384 extends com.trilead.ssh2.signature.ECDSAKeyAlgorithm {
        private static final java.lang.String KEY_FORMAT = "ecdsa-sha2-nistp384";
        private static final java.lang.String NISTP384 = "nistp384";

        public ECDSASha2Nistp384() {
            super("SHA384withECDSA", NISTP384, new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(new java.math.BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF", 16)), new java.math.BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC", 16), new java.math.BigInteger("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF", 16)), new java.security.spec.ECPoint(new java.math.BigInteger("AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7", 16), new java.math.BigInteger("3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F", 16)), new java.math.BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973", 16), 1), 0);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ java.security.PublicKey decodePublicKey(byte[] bArr) {
            return super.decodePublicKey(bArr);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ byte[] encodePublicKey(java.security.PublicKey publicKey) {
            return super.encodePublicKey((java.security.interfaces.ECPublicKey) publicKey);
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public java.util.List<com.trilead.ssh2.crypto.CertificateDecoder> getCertificateDecoders() {
            return java.util.Arrays.asList(new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.EcdsaCertificateDecoder("1.3.132.0.34", getEcParameterSpec(), 0), new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.OpenSshEcdsaCertificateDecoder(getKeyFormat(), getCurveName(), getEcParameterSpec()));
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm
        public java.lang.String getDigestAlgorithm() {
            return "SHA-384";
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public java.lang.String getKeyFormat() {
            return KEY_FORMAT;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class ECDSASha2Nistp521 extends com.trilead.ssh2.signature.ECDSAKeyAlgorithm {
        private static final java.lang.String KEY_FORMAT = "ecdsa-sha2-nistp521";
        private static final java.lang.String NISTP521 = "nistp521";

        public ECDSASha2Nistp521() {
            super("SHA512withECDSA", NISTP521, new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(new java.math.BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF", 16)), new java.math.BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC", 16), new java.math.BigInteger("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00", 16)), new java.security.spec.ECPoint(new java.math.BigInteger("00C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66", 16), new java.math.BigInteger("011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650", 16)), new java.math.BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409", 16), 1), 0);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ java.security.PublicKey decodePublicKey(byte[] bArr) {
            return super.decodePublicKey(bArr);
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm, com.trilead.ssh2.signature.KeyAlgorithm
        public /* bridge */ /* synthetic */ byte[] encodePublicKey(java.security.PublicKey publicKey) {
            return super.encodePublicKey((java.security.interfaces.ECPublicKey) publicKey);
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public java.util.List<com.trilead.ssh2.crypto.CertificateDecoder> getCertificateDecoders() {
            return java.util.Arrays.asList(new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.EcdsaCertificateDecoder("1.3.132.0.35", getEcParameterSpec(), 0), new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.OpenSshEcdsaCertificateDecoder(getKeyFormat(), getCurveName(), getEcParameterSpec()));
        }

        @Override // com.trilead.ssh2.signature.ECDSAKeyAlgorithm
        public java.lang.String getDigestAlgorithm() {
            return "SHA-512";
        }

        @Override // com.trilead.ssh2.signature.KeyAlgorithm
        public java.lang.String getKeyFormat() {
            return KEY_FORMAT;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class OpenSshEcdsaCertificateDecoder extends com.trilead.ssh2.signature.OpenSshCertificateDecoder {
        private final java.lang.String curveName;
        private final java.security.spec.ECParameterSpec ecParameterSpec;

        public OpenSshEcdsaCertificateDecoder(java.lang.String str, java.lang.String str2, java.security.spec.ECParameterSpec eCParameterSpec) {
            super(str);
            this.curveName = str2;
            this.ecParameterSpec = eCParameterSpec;
        }

        @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder
        public java.security.KeyPair generateKeyPair(dev.epro.r0.C9142879380583651391 c9142879380583651391) throws java.security.NoSuchAlgorithmException {
            java.lang.String strG = c9142879380583651391.g();
            if (!strG.equals(this.curveName)) {
                dev.epro.r0.Q11088980322693754445.h("Incorrect curve name: ".concat(strG));
                return null;
            }
            byte[] bArrC = c9142879380583651391.c();
            java.math.BigInteger bigIntegerE = c9142879380583651391.e();
            java.security.spec.ECPoint eCPointDecodePoint = com.trilead.ssh2.signature.ECDSAKeyAlgorithm.decodePoint(bArrC, this.ecParameterSpec.getCurve());
            if (eCPointDecodePoint == null) {
                dev.epro.r0.Q11088980322693754445.h("Invalid ECDSA group");
                return null;
            }
            java.security.spec.ECPublicKeySpec eCPublicKeySpec = new java.security.spec.ECPublicKeySpec(eCPointDecodePoint, this.ecParameterSpec);
            java.security.spec.ECPrivateKeySpec eCPrivateKeySpec = new java.security.spec.ECPrivateKeySpec(bigIntegerE, this.ecParameterSpec);
            java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("EC");
            return new java.security.KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
        }
    }

    private ECDSAKeyAlgorithm(java.lang.String str, java.lang.String str2, java.security.spec.ECParameterSpec eCParameterSpec) {
        super(str, dev.epro.r0.G6547577305291411977.C(ECDSA_SHA2_PREFIX, str2), java.security.interfaces.ECPrivateKey.class);
        this.curveName = str2;
        this.ecParameterSpec = eCParameterSpec;
    }

    public static java.security.spec.ECPoint decodePoint(byte[] bArr, java.security.spec.EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) / 8;
        if (bArr.length != (fieldSize * 2) + 1 || bArr[0] != 4 || bArr.length == 0) {
            return null;
        }
        byte[] bArr2 = new byte[fieldSize];
        java.lang.System.arraycopy(bArr, 1, bArr2, 0, fieldSize);
        byte[] bArr3 = new byte[fieldSize];
        java.lang.System.arraycopy(bArr, fieldSize + 1, bArr3, 0, fieldSize);
        return new java.security.spec.ECPoint(new java.math.BigInteger(1, bArr2), new java.math.BigInteger(1, bArr3));
    }

    public static byte[] encodePoint(java.security.spec.ECPoint eCPoint, java.security.spec.EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) / 8;
        byte[] bArr = new byte[(fieldSize * 2) + 1];
        bArr[0] = 4;
        byte[] bArrRemoveLeadingZeroes = removeLeadingZeroes(eCPoint.getAffineX().toByteArray());
        int i = fieldSize + 1;
        java.lang.System.arraycopy(bArrRemoveLeadingZeroes, 0, bArr, i - bArrRemoveLeadingZeroes.length, bArrRemoveLeadingZeroes.length);
        byte[] bArrRemoveLeadingZeroes2 = removeLeadingZeroes(eCPoint.getAffineY().toByteArray());
        java.lang.System.arraycopy(bArrRemoveLeadingZeroes2, 0, bArr, (i + fieldSize) - bArrRemoveLeadingZeroes2.length, bArrRemoveLeadingZeroes2.length);
        return bArr;
    }

    public static java.lang.String getDigestAlgorithmForParams(java.security.interfaces.ECKey eCKey) {
        com.trilead.ssh2.signature.ECDSAKeyAlgorithm verifierForKey = getVerifierForKey(eCKey);
        if (verifierForKey == null) {
            return null;
        }
        return verifierForKey.getDigestAlgorithm();
    }

    public static com.trilead.ssh2.signature.ECDSAKeyAlgorithm getVerifierForKey(java.security.interfaces.ECKey eCKey) {
        int fieldSize = eCKey.getParams().getCurve().getField().getFieldSize();
        if (fieldSize == 256) {
            return new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp256();
        }
        if (fieldSize == 384) {
            return new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp384();
        }
        if (fieldSize != 521) {
            return null;
        }
        return new com.trilead.ssh2.signature.ECDSAKeyAlgorithm.ECDSASha2Nistp521();
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
        java.lang.System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    private static void writeLength(int i, java.io.OutputStream outputStream) throws java.io.IOException {
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
    public java.security.interfaces.ECPublicKey decodePublicKey(byte[] bArr) {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        if (!c9142879380583651391.g().equals(getKeyFormat())) {
            dev.epro.r0.Q11088980322693754445.h("Invalid key format");
            return null;
        }
        c9142879380583651391.g();
        byte[] bArrC = c9142879380583651391.c();
        if (c9142879380583651391.j() != 0) {
            dev.epro.r0.Q11088980322693754445.h("Unexpected adding in ECDSA public key");
            return null;
        }
        java.security.spec.ECParameterSpec ecParameterSpec = getEcParameterSpec();
        java.security.spec.ECPoint eCPointDecodePoint = decodePoint(bArrC, ecParameterSpec.getCurve());
        if (eCPointDecodePoint == null) {
            dev.epro.r0.Q11088980322693754445.h("Invalid ECDSA group");
            return null;
        }
        try {
            return (java.security.interfaces.ECPublicKey) java.security.KeyFactory.getInstance("EC").generatePublic(new java.security.spec.ECPublicKeySpec(eCPointDecodePoint, ecParameterSpec));
        } catch (java.security.GeneralSecurityException e) {
            dev.epro.r0.Z3383101362411723454.q("Could not decode ECDSA key", e);
            return null;
        }
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] decodeSignature(byte[] bArr) throws java.io.IOException {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(bArr);
        java.lang.String strG = c9142879380583651391.g();
        if (!strG.equals(getKeyFormat())) {
            dev.epro.r0.Q11088980322693754445.h("Unsupported signature format: ".concat(strG));
            return null;
        }
        byte[] bArrC = c9142879380583651391.c();
        if (c9142879380583651391.j() != 0) {
            dev.epro.r0.Q11088980322693754445.h("Unexpected padding in ECDSA signature");
            return null;
        }
        dev.epro.r0.C9142879380583651391 c91428793805836513912 = new dev.epro.r0.C9142879380583651391(bArrC);
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
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i);
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
    public byte[] encodePublicKey(java.security.interfaces.ECPublicKey eCPublicKey) {
        byte[] bArrEncodePoint = encodePoint(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.t(getKeyFormat());
        t17032536773975598836.t(getCurveName());
        t17032536773975598836.s(0, bArrEncodePoint, bArrEncodePoint.length);
        return t17032536773975598836.f();
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public byte[] encodeSignature(byte[] bArr) {
        com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader = new com.trilead.ssh2.crypto.SimpleDERReader(new com.trilead.ssh2.crypto.SimpleDERReader(bArr).readSequenceAsByteArray());
        java.math.BigInteger bigInteger = simpleDERReader.readInt();
        java.math.BigInteger bigInteger2 = simpleDERReader.readInt();
        dev.epro.r0.T17032536773975598836 t17032536773975598836 = new dev.epro.r0.T17032536773975598836();
        t17032536773975598836.q(bigInteger);
        t17032536773975598836.q(bigInteger2);
        byte[] bArrF = t17032536773975598836.f();
        dev.epro.r0.T17032536773975598836 t170325367739755988362 = new dev.epro.r0.T17032536773975598836();
        t170325367739755988362.t(getKeyFormat());
        t170325367739755988362.s(0, bArrF, bArrF.length);
        return t170325367739755988362.f();
    }

    public java.lang.String getCurveName() {
        return this.curveName;
    }

    public abstract java.lang.String getDigestAlgorithm();

    public java.security.spec.ECParameterSpec getEcParameterSpec() {
        return this.ecParameterSpec;
    }

    @Override // com.trilead.ssh2.signature.KeyAlgorithm
    public boolean supportsKey(java.security.PrivateKey privateKey) {
        if (!(privateKey instanceof java.security.interfaces.ECPrivateKey)) {
            return false;
        }
        java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) privateKey;
        return super.supportsKey(eCPrivateKey) && eCPrivateKey.getParams().getCurve().getField().getFieldSize() == getEcParameterSpec().getCurve().getField().getFieldSize();
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class EcdsaCertificateDecoder extends com.trilead.ssh2.crypto.CertificateDecoder {
        private final java.security.spec.ECParameterSpec ecParameterSpec;
        private final java.lang.String oid;

        private EcdsaCertificateDecoder(java.lang.String str, java.security.spec.ECParameterSpec eCParameterSpec) {
            this.oid = str;
            this.ecParameterSpec = eCParameterSpec;
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.security.KeyPair createKeyPair(com.trilead.ssh2.crypto.PEMStructure pEMStructure) {
            com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader = new com.trilead.ssh2.crypto.SimpleDERReader(pEMStructure.getData());
            byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                dev.epro.r0.Q11088980322693754445.h("Unexpected padding in EC private key");
                return null;
            }
            com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader2 = new com.trilead.ssh2.crypto.SimpleDERReader(sequenceAsByteArray);
            java.math.BigInteger bigInteger = simpleDERReader2.readInt();
            if (bigInteger.compareTo(java.math.BigInteger.ONE) != 0) {
                dev.epro.r0.Q11088980322693754445.h("Unexpected version number in EC private key: ".concat(java.lang.String.valueOf(bigInteger)));
                return null;
            }
            byte[] octetString = simpleDERReader2.readOctetString();
            java.lang.String oid = null;
            byte[] octetString2 = null;
            while (simpleDERReader2.available() > 0) {
                int constructedType = simpleDERReader2.readConstructedType();
                com.trilead.ssh2.crypto.SimpleDERReader constructed = simpleDERReader2.readConstructed();
                if (constructedType == 0) {
                    oid = constructed.readOid();
                } else if (constructedType == 1) {
                    octetString2 = constructed.readOctetString();
                }
            }
            if (!this.oid.equals(oid)) {
                dev.epro.r0.Q11088980322693754445.h("Incorrect OID for current curve");
                return null;
            }
            java.math.BigInteger bigInteger2 = new java.math.BigInteger(1, octetString);
            int length = octetString2.length - 1;
            byte[] bArr = new byte[length];
            java.lang.System.arraycopy(octetString2, 1, bArr, 0, length);
            java.security.spec.ECPoint eCPointDecodePoint = com.trilead.ssh2.signature.ECDSAKeyAlgorithm.decodePoint(bArr, this.ecParameterSpec.getCurve());
            java.security.spec.ECPrivateKeySpec eCPrivateKeySpec = new java.security.spec.ECPrivateKeySpec(bigInteger2, this.ecParameterSpec);
            java.security.spec.ECPublicKeySpec eCPublicKeySpec = new java.security.spec.ECPublicKeySpec(eCPointDecodePoint, this.ecParameterSpec);
            try {
                java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("EC");
                return new java.security.KeyPair(keyFactory.generatePublic(eCPublicKeySpec), keyFactory.generatePrivate(eCPrivateKeySpec));
            } catch (java.security.GeneralSecurityException unused) {
                dev.epro.r0.Q11088980322693754445.h("Could not generate EC key pair");
                return null;
            }
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.lang.String getEndLine() {
            return "-----END EC PRIVATE KEY-----";
        }

        @Override // com.trilead.ssh2.crypto.CertificateDecoder
        public java.lang.String getStartLine() {
            return "-----BEGIN EC PRIVATE KEY-----";
        }

        public /* synthetic */ EcdsaCertificateDecoder(java.lang.String str, java.security.spec.ECParameterSpec eCParameterSpec, int i) {
            this(str, eCParameterSpec);
        }
    }

    public /* synthetic */ ECDSAKeyAlgorithm(java.lang.String str, java.lang.String str2, java.security.spec.ECParameterSpec eCParameterSpec, int i) {
        this(str, str2, eCParameterSpec);
    }
}
