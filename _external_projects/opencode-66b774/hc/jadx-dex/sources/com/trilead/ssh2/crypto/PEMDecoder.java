package com.trilead.ssh2.crypto;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class PEMDecoder {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(com.trilead.ssh2.crypto.PEMDecoder.class.getName());
    private static final int PEM_DSA_PRIVATE_KEY = 2;
    private static final int PEM_RSA_PRIVATE_KEY = 1;

    @java.lang.Deprecated
    public static java.lang.Object decode(char[] cArr, java.lang.String str) throws java.io.IOException {
        LOGGER.getClass();
        com.trilead.ssh2.crypto.PEMStructure pem = parsePEM(cArr);
        if (isPEMEncrypted(pem)) {
            if (str == null) {
                dev.epro.r0.Q11088980322693754445.h("PEM is encrypted, but no password was specified");
                return null;
            }
            decryptPEM(pem, str);
        }
        int i = pem.pemType;
        if (i != 2) {
            if (i != 1) {
                dev.epro.r0.Q11088980322693754445.h("PEM problem: it is of unknown type");
                return null;
            }
            com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader = new com.trilead.ssh2.crypto.SimpleDERReader(pem.data);
            byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                dev.epro.r0.Q11088980322693754445.h("Padding in RSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(sequenceAsByteArray);
            java.math.BigInteger bigInteger = simpleDERReader.readInt();
            if (bigInteger.compareTo(java.math.BigInteger.ZERO) != 0 && bigInteger.compareTo(java.math.BigInteger.ONE) != 0) {
                dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.s("Wrong version (", java.lang.String.valueOf(bigInteger), ") in RSA PRIVATE KEY DER stream."));
                return null;
            }
            java.math.BigInteger bigInteger2 = simpleDERReader.readInt();
            return new com.trilead.ssh2.signature.RSAPrivateKey(simpleDERReader.readInt(), simpleDERReader.readInt(), bigInteger2);
        }
        com.trilead.ssh2.crypto.SimpleDERReader simpleDERReader2 = new com.trilead.ssh2.crypto.SimpleDERReader(pem.data);
        byte[] sequenceAsByteArray2 = simpleDERReader2.readSequenceAsByteArray();
        if (simpleDERReader2.available() != 0) {
            dev.epro.r0.Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
            return null;
        }
        simpleDERReader2.resetInput(sequenceAsByteArray2);
        java.math.BigInteger bigInteger3 = simpleDERReader2.readInt();
        if (bigInteger3.compareTo(java.math.BigInteger.ZERO) != 0) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.s("Wrong version (", java.lang.String.valueOf(bigInteger3), ") in DSA PRIVATE KEY DER stream."));
            return null;
        }
        java.math.BigInteger bigInteger4 = simpleDERReader2.readInt();
        java.math.BigInteger bigInteger5 = simpleDERReader2.readInt();
        java.math.BigInteger bigInteger6 = simpleDERReader2.readInt();
        java.math.BigInteger bigInteger7 = simpleDERReader2.readInt();
        java.math.BigInteger bigInteger8 = simpleDERReader2.readInt();
        if (simpleDERReader2.available() == 0) {
            return new com.trilead.ssh2.signature.DSAPrivateKey(bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8);
        }
        dev.epro.r0.Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
        return null;
    }

    public static java.security.KeyPair decodeKeyPair(char[] cArr, java.lang.String str) {
        java.util.Iterator<com.trilead.ssh2.signature.KeyAlgorithm<java.security.PublicKey, java.security.PrivateKey>> it = com.trilead.ssh2.signature.KeyAlgorithmManager.getSupportedAlgorithms().iterator();
        while (it.hasNext()) {
            for (com.trilead.ssh2.crypto.CertificateDecoder certificateDecoder : it.next().getCertificateDecoders()) {
                try {
                    com.trilead.ssh2.crypto.PEMStructure pem = parsePEM(cArr, certificateDecoder);
                    if (isPEMEncrypted(pem)) {
                        if (str == null) {
                            throw new java.io.IOException("PEM is encrypted, but no password was specified");
                        }
                        decryptPEM(pem, str);
                    }
                    return certificateDecoder.createKeyPair(pem, str);
                } catch (java.io.IOException unused) {
                    java.util.logging.Logger logger = LOGGER;
                    java.util.logging.Level level = java.util.logging.Level.FINE;
                    certificateDecoder.getClass();
                    logger.getClass();
                }
            }
        }
        dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.C("PEM problem: it is of unknown type. Supported algorithms are :", ((java.util.List) com.trilead.ssh2.signature.KeyAlgorithmManager.getSupportedAlgorithms().stream().map(new dev.epro.r0.I10051424186108607289((byte) 1)).collect(java.util.stream.Collectors.toList())).toString()));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void decryptPEM(com.trilead.ssh2.crypto.PEMStructure pEMStructure, java.lang.String str) throws java.io.IOException {
        javax.crypto.spec.SecretKeySpec secretKeySpec;
        javax.crypto.spec.SecretKeySpec secretKeySpec2;
        java.lang.String[] strArr = pEMStructure.dekInfo;
        if (strArr == null) {
            dev.epro.r0.Q11088980322693754445.h("Broken PEM, no mode and salt given, but encryption enabled");
            return;
        }
        if (strArr.length != 2) {
            dev.epro.r0.Q11088980322693754445.h("Broken PEM, DEK-Info is incomplete!");
            return;
        }
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String[] strArr2 = pEMStructure.dekInfo;
        java.lang.String str2 = strArr2[0];
        byte b = 1;
        byte[] bArrHexToByteArray = hexToByteArray(strArr2[1]);
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            messageDigest.update(bArrHexToByteArray, 0, 8);
            byte[] bArrDigest = messageDigest.digest();
            messageDigest.update(bArrDigest);
            messageDigest.update(bytes);
            messageDigest.update(bArrHexToByteArray, 0, 8);
            byte[] bArrDigest2 = messageDigest.digest();
            str2.getClass();
            switch (str2.hashCode()) {
                case -2020788375:
                    b = !str2.equals("DES-CBC") ? (byte) -1 : (byte) 0;
                    break;
                case -1390896596:
                    if (!str2.equals("AES-256-CBC")) {
                        b = -1;
                    }
                    break;
                case -165238049:
                    b = !str2.equals("DES-EDE3-CBC") ? (byte) -1 : (byte) 2;
                    break;
                case 1932526608:
                    b = !str2.equals("AES-128-CBC") ? (byte) -1 : (byte) 3;
                    break;
                case 2127389539:
                    b = !str2.equals("AES-192-CBC") ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            java.lang.String str3 = "AES/CBC/PKCS5Padding";
            switch (b) {
                case 0:
                    byte[] bArr = new byte[8];
                    java.lang.System.arraycopy(bArrDigest, 0, bArr, 0, 8);
                    secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "DES");
                    str3 = "DES/CBC/PKCS5Padding";
                    secretKeySpec2 = secretKeySpec;
                    try {
                        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(str3);
                        cipher.init(2, secretKeySpec2, new javax.crypto.spec.IvParameterSpec(bArrHexToByteArray));
                        pEMStructure.data = cipher.doFinal(pEMStructure.data);
                        break;
                    } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException | javax.crypto.NoSuchPaddingException e) {
                        new java.io.IOException(e);
                    }
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 1:
                    byte[] bArr2 = new byte[32];
                    java.lang.System.arraycopy(bArrDigest, 0, bArr2, 0, 16);
                    java.lang.System.arraycopy(bArrDigest2, 0, bArr2, 16, 16);
                    secretKeySpec2 = new javax.crypto.spec.SecretKeySpec(bArr2, "AES");
                    javax.crypto.Cipher cipher2 = javax.crypto.Cipher.getInstance(str3);
                    cipher2.init(2, secretKeySpec2, new javax.crypto.spec.IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher2.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 2:
                    byte[] bArr3 = new byte[24];
                    java.lang.System.arraycopy(bArrDigest, 0, bArr3, 0, 16);
                    java.lang.System.arraycopy(bArrDigest2, 0, bArr3, 16, 8);
                    secretKeySpec2 = new javax.crypto.spec.SecretKeySpec(bArr3, "DESede");
                    str3 = "DESede/CBC/PKCS5Padding";
                    javax.crypto.Cipher cipher22 = javax.crypto.Cipher.getInstance(str3);
                    cipher22.init(2, secretKeySpec2, new javax.crypto.spec.IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher22.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 3:
                    byte[] bArr4 = new byte[16];
                    java.lang.System.arraycopy(bArrDigest, 0, bArr4, 0, 16);
                    secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr4, "AES");
                    secretKeySpec2 = secretKeySpec;
                    javax.crypto.Cipher cipher222 = javax.crypto.Cipher.getInstance(str3);
                    cipher222.init(2, secretKeySpec2, new javax.crypto.spec.IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher222.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 4:
                    byte[] bArr5 = new byte[24];
                    java.lang.System.arraycopy(bArrDigest, 0, bArr5, 0, 16);
                    java.lang.System.arraycopy(bArrDigest2, 0, bArr5, 16, 8);
                    secretKeySpec2 = new javax.crypto.spec.SecretKeySpec(bArr5, "AES");
                    javax.crypto.Cipher cipher2222 = javax.crypto.Cipher.getInstance(str3);
                    cipher2222.init(2, secretKeySpec2, new javax.crypto.spec.IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher2222.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                default:
                    dev.epro.r0.Q11088980322693754445.h("Cannot decrypt PEM structure, unknown cipher ".concat(str2));
                    return;
            }
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new java.io.IOException(e2);
        }
    }

    public static byte[] hexToByteArray(java.lang.String str) {
        if (str == null) {
            dev.epro.r0.S10973172697741180971.j("null argument");
            return null;
        }
        if (str.length() % 2 != 0) {
            dev.epro.r0.S10973172697741180971.j("Uneven string length in hex encoding.");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((hexToInt(str.charAt(i2)) * 16) + hexToInt(str.charAt(i2 + 1)));
        }
        return bArr;
    }

    private static int hexToInt(char c) {
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        dev.epro.r0.S10973172697741180971.j("Need hex char");
        return 0;
    }

    public static boolean isPEMEncrypted(com.trilead.ssh2.crypto.PEMStructure pEMStructure) {
        java.lang.String[] strArr = pEMStructure.procType;
        if (strArr == null) {
            return false;
        }
        if (strArr.length != 2) {
            dev.epro.r0.Q11088980322693754445.h("Unknown Proc-Type field.");
            return false;
        }
        boolean zEquals = "4".equals(strArr[0]);
        java.lang.String[] strArr2 = pEMStructure.procType;
        if (zEquals) {
            return "ENCRYPTED".equals(strArr2[1]);
        }
        dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.s("Unknown Proc-Type field (", strArr2[0], ")"));
        return false;
    }

    public static com.trilead.ssh2.crypto.PEMStructure parsePEM(char[] cArr) throws java.io.IOException {
        java.lang.String str;
        com.trilead.ssh2.crypto.PEMStructure pEMStructure = new com.trilead.ssh2.crypto.PEMStructure();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.CharArrayReader(cArr));
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line == null) {
                dev.epro.r0.Q11088980322693754445.h("Invalid PEM structure, '-----BEGIN...' missing");
                return null;
            }
            java.lang.String strTrim = line.trim();
            if (strTrim.startsWith("-----BEGIN DSA PRIVATE KEY-----")) {
                pEMStructure.pemType = 2;
                str = "-----END DSA PRIVATE KEY-----";
                break;
            }
            if (strTrim.startsWith("-----BEGIN RSA PRIVATE KEY-----")) {
                pEMStructure.pemType = 1;
                str = "-----END RSA PRIVATE KEY-----";
                break;
            }
        }
        parsePEMContent(pEMStructure, bufferedReader, str);
        if (pEMStructure.data.length != 0) {
            return pEMStructure;
        }
        dev.epro.r0.Q11088980322693754445.h("Invalid PEM structure, no data available");
        return null;
    }

    private static void parsePEMContent(com.trilead.ssh2.crypto.PEMStructure pEMStructure, java.io.BufferedReader bufferedReader, java.lang.String str) throws java.io.IOException {
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line == null) {
                dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.s("Invalid PEM structure, ", str, " missing"));
                return;
            }
            java.lang.String strTrim = line.trim();
            int iIndexOf = strTrim.indexOf(58);
            if (iIndexOf == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (strTrim != null) {
                    java.lang.String strTrim2 = strTrim.trim();
                    if (strTrim2.startsWith(str)) {
                        pEMStructure.data = dev.epro.r0.T15589241373902147015.x(dev.epro.r0.T15589241373902147015.n(), sb.toString().replaceAll("\\s", ""));
                        return;
                    } else {
                        sb.append(strTrim2);
                        strTrim = bufferedReader.readLine();
                    }
                }
                dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.s("Invalid PEM structure, ", str, " missing"));
                return;
            }
            int i = iIndexOf + 1;
            java.lang.String strSubstring = strTrim.substring(0, i);
            java.lang.String[] strArrSplit = strTrim.substring(i).split(",");
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                strArrSplit[i2] = strArrSplit[i2].trim();
            }
            if ("Proc-Type:".equals(strSubstring)) {
                pEMStructure.procType = strArrSplit;
            } else if ("DEK-Info:".equals(strSubstring)) {
                pEMStructure.dekInfo = strArrSplit;
            }
        }
    }

    private static com.trilead.ssh2.crypto.PEMStructure parsePEM(char[] cArr, com.trilead.ssh2.crypto.CertificateDecoder certificateDecoder) throws java.io.IOException {
        java.lang.String line;
        com.trilead.ssh2.crypto.PEMStructure pEMStructure = new com.trilead.ssh2.crypto.PEMStructure();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.CharArrayReader(cArr));
        do {
            line = bufferedReader.readLine();
            if (line == null) {
                dev.epro.r0.Q11088980322693754445.h("Invalid PEM structure, '-----BEGIN...' missing");
                return null;
            }
        } while (!line.trim().startsWith(certificateDecoder.getStartLine()));
        parsePEMContent(pEMStructure, bufferedReader, certificateDecoder.getEndLine());
        if (pEMStructure.data.length != 0) {
            return pEMStructure;
        }
        dev.epro.r0.Q11088980322693754445.h("Invalid PEM structure, no data available");
        return null;
    }
}
