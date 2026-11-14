package com.trilead.ssh2.crypto;

import com.trilead.ssh2.signature.DSAPrivateKey;
import com.trilead.ssh2.signature.KeyAlgorithm;
import com.trilead.ssh2.signature.KeyAlgorithmManager;
import com.trilead.ssh2.signature.RSAPrivateKey;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.I10051424186108607289;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.S10973172697741180971;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class PEMDecoder {
    private static final Logger LOGGER = Logger.getLogger(PEMDecoder.class.getName());
    private static final int PEM_DSA_PRIVATE_KEY = 2;
    private static final int PEM_RSA_PRIVATE_KEY = 1;

    @Deprecated
    public static Object decode(char[] cArr, String str) throws IOException {
        LOGGER.getClass();
        PEMStructure pem = parsePEM(cArr);
        if (isPEMEncrypted(pem)) {
            if (str == null) {
                Q11088980322693754445.h("PEM is encrypted, but no password was specified");
                return null;
            }
            decryptPEM(pem, str);
        }
        int i = pem.pemType;
        if (i != 2) {
            if (i != 1) {
                Q11088980322693754445.h("PEM problem: it is of unknown type");
                return null;
            }
            SimpleDERReader simpleDERReader = new SimpleDERReader(pem.data);
            byte[] sequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                Q11088980322693754445.h("Padding in RSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(sequenceAsByteArray);
            BigInteger bigInteger = simpleDERReader.readInt();
            if (bigInteger.compareTo(BigInteger.ZERO) != 0 && bigInteger.compareTo(BigInteger.ONE) != 0) {
                Q11088980322693754445.h(G6547577305291411977.s("Wrong version (", String.valueOf(bigInteger), ") in RSA PRIVATE KEY DER stream."));
                return null;
            }
            BigInteger bigInteger2 = simpleDERReader.readInt();
            return new RSAPrivateKey(simpleDERReader.readInt(), simpleDERReader.readInt(), bigInteger2);
        }
        SimpleDERReader simpleDERReader2 = new SimpleDERReader(pem.data);
        byte[] sequenceAsByteArray2 = simpleDERReader2.readSequenceAsByteArray();
        if (simpleDERReader2.available() != 0) {
            Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
            return null;
        }
        simpleDERReader2.resetInput(sequenceAsByteArray2);
        BigInteger bigInteger3 = simpleDERReader2.readInt();
        if (bigInteger3.compareTo(BigInteger.ZERO) != 0) {
            Q11088980322693754445.h(G6547577305291411977.s("Wrong version (", String.valueOf(bigInteger3), ") in DSA PRIVATE KEY DER stream."));
            return null;
        }
        BigInteger bigInteger4 = simpleDERReader2.readInt();
        BigInteger bigInteger5 = simpleDERReader2.readInt();
        BigInteger bigInteger6 = simpleDERReader2.readInt();
        BigInteger bigInteger7 = simpleDERReader2.readInt();
        BigInteger bigInteger8 = simpleDERReader2.readInt();
        if (simpleDERReader2.available() == 0) {
            return new DSAPrivateKey(bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8);
        }
        Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
        return null;
    }

    public static KeyPair decodeKeyPair(char[] cArr, String str) throws IOException {
        Iterator<KeyAlgorithm<PublicKey, PrivateKey>> it = KeyAlgorithmManager.getSupportedAlgorithms().iterator();
        while (it.hasNext()) {
            for (CertificateDecoder certificateDecoder : it.next().getCertificateDecoders()) {
                try {
                    PEMStructure pem = parsePEM(cArr, certificateDecoder);
                    if (isPEMEncrypted(pem)) {
                        if (str == null) {
                            throw new IOException("PEM is encrypted, but no password was specified");
                        }
                        decryptPEM(pem, str);
                    }
                    return certificateDecoder.createKeyPair(pem, str);
                } catch (IOException unused) {
                    Logger logger = LOGGER;
                    Level level = Level.FINE;
                    certificateDecoder.getClass();
                    logger.getClass();
                }
            }
        }
        Q11088980322693754445.h(G6547577305291411977.C("PEM problem: it is of unknown type. Supported algorithms are :", ((List) KeyAlgorithmManager.getSupportedAlgorithms().stream().map(new I10051424186108607289((byte) 1)).collect(Collectors.toList())).toString()));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void decryptPEM(PEMStructure pEMStructure, String str) throws IOException {
        SecretKeySpec secretKeySpec;
        SecretKeySpec secretKeySpec2;
        String[] strArr = pEMStructure.dekInfo;
        if (strArr == null) {
            Q11088980322693754445.h("Broken PEM, no mode and salt given, but encryption enabled");
            return;
        }
        if (strArr.length != 2) {
            Q11088980322693754445.h("Broken PEM, DEK-Info is incomplete!");
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        String[] strArr2 = pEMStructure.dekInfo;
        String str2 = strArr2[0];
        byte b = 1;
        byte[] bArrHexToByteArray = hexToByteArray(strArr2[1]);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
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
            String str3 = "AES/CBC/PKCS5Padding";
            switch (b) {
                case 0:
                    byte[] bArr = new byte[8];
                    System.arraycopy(bArrDigest, 0, bArr, 0, 8);
                    secretKeySpec = new SecretKeySpec(bArr, "DES");
                    str3 = "DES/CBC/PKCS5Padding";
                    secretKeySpec2 = secretKeySpec;
                    try {
                        Cipher cipher = Cipher.getInstance(str3);
                        cipher.init(2, secretKeySpec2, new IvParameterSpec(bArrHexToByteArray));
                        pEMStructure.data = cipher.doFinal(pEMStructure.data);
                        break;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                        new IOException(e);
                    }
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 1:
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(bArrDigest, 0, bArr2, 0, 16);
                    System.arraycopy(bArrDigest2, 0, bArr2, 16, 16);
                    secretKeySpec2 = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher2 = Cipher.getInstance(str3);
                    cipher2.init(2, secretKeySpec2, new IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher2.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 2:
                    byte[] bArr3 = new byte[24];
                    System.arraycopy(bArrDigest, 0, bArr3, 0, 16);
                    System.arraycopy(bArrDigest2, 0, bArr3, 16, 8);
                    secretKeySpec2 = new SecretKeySpec(bArr3, "DESede");
                    str3 = "DESede/CBC/PKCS5Padding";
                    Cipher cipher22 = Cipher.getInstance(str3);
                    cipher22.init(2, secretKeySpec2, new IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher22.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 3:
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(bArrDigest, 0, bArr4, 0, 16);
                    secretKeySpec = new SecretKeySpec(bArr4, "AES");
                    secretKeySpec2 = secretKeySpec;
                    Cipher cipher222 = Cipher.getInstance(str3);
                    cipher222.init(2, secretKeySpec2, new IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher222.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                case 4:
                    byte[] bArr5 = new byte[24];
                    System.arraycopy(bArrDigest, 0, bArr5, 0, 16);
                    System.arraycopy(bArrDigest2, 0, bArr5, 16, 8);
                    secretKeySpec2 = new SecretKeySpec(bArr5, "AES");
                    Cipher cipher2222 = Cipher.getInstance(str3);
                    cipher2222.init(2, secretKeySpec2, new IvParameterSpec(bArrHexToByteArray));
                    pEMStructure.data = cipher2222.doFinal(pEMStructure.data);
                    pEMStructure.dekInfo = null;
                    pEMStructure.procType = null;
                    return;
                default:
                    Q11088980322693754445.h("Cannot decrypt PEM structure, unknown cipher ".concat(str2));
                    return;
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new IOException(e2);
        }
    }

    public static byte[] hexToByteArray(String str) {
        if (str == null) {
            S10973172697741180971.j("null argument");
            return null;
        }
        if (str.length() % 2 != 0) {
            S10973172697741180971.j("Uneven string length in hex encoding.");
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
        S10973172697741180971.j("Need hex char");
        return 0;
    }

    public static boolean isPEMEncrypted(PEMStructure pEMStructure) throws IOException {
        String[] strArr = pEMStructure.procType;
        if (strArr == null) {
            return false;
        }
        if (strArr.length != 2) {
            Q11088980322693754445.h("Unknown Proc-Type field.");
            return false;
        }
        boolean zEquals = "4".equals(strArr[0]);
        String[] strArr2 = pEMStructure.procType;
        if (zEquals) {
            return "ENCRYPTED".equals(strArr2[1]);
        }
        Q11088980322693754445.h(G6547577305291411977.s("Unknown Proc-Type field (", strArr2[0], ")"));
        return false;
    }

    public static PEMStructure parsePEM(char[] cArr) throws IOException {
        String str;
        PEMStructure pEMStructure = new PEMStructure();
        BufferedReader bufferedReader = new BufferedReader(new CharArrayReader(cArr));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Q11088980322693754445.h("Invalid PEM structure, '-----BEGIN...' missing");
                return null;
            }
            String strTrim = line.trim();
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
        Q11088980322693754445.h("Invalid PEM structure, no data available");
        return null;
    }

    private static void parsePEMContent(PEMStructure pEMStructure, BufferedReader bufferedReader, String str) throws IOException {
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Q11088980322693754445.h(G6547577305291411977.s("Invalid PEM structure, ", str, " missing"));
                return;
            }
            String strTrim = line.trim();
            int iIndexOf = strTrim.indexOf(58);
            if (iIndexOf == -1) {
                StringBuilder sb = new StringBuilder();
                while (strTrim != null) {
                    String strTrim2 = strTrim.trim();
                    if (strTrim2.startsWith(str)) {
                        pEMStructure.data = java.util.Base64.getDecoder().decode(sb.toString().replaceAll("\\s", ""));
                        return;
                    } else {
                        sb.append(strTrim2);
                        strTrim = bufferedReader.readLine();
                    }
                }
                Q11088980322693754445.h(G6547577305291411977.s("Invalid PEM structure, ", str, " missing"));
                return;
            }
            int i = iIndexOf + 1;
            String strSubstring = strTrim.substring(0, i);
            String[] strArrSplit = strTrim.substring(i).split(",");
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

    private static PEMStructure parsePEM(char[] cArr, CertificateDecoder certificateDecoder) throws IOException {
        String line;
        PEMStructure pEMStructure = new PEMStructure();
        BufferedReader bufferedReader = new BufferedReader(new CharArrayReader(cArr));
        do {
            line = bufferedReader.readLine();
            if (line == null) {
                Q11088980322693754445.h("Invalid PEM structure, '-----BEGIN...' missing");
                return null;
            }
        } while (!line.trim().startsWith(certificateDecoder.getStartLine()));
        parsePEMContent(pEMStructure, bufferedReader, certificateDecoder.getEndLine());
        if (pEMStructure.data.length != 0) {
            return pEMStructure;
        }
        Q11088980322693754445.h("Invalid PEM structure, no data available");
        return null;
    }
}
