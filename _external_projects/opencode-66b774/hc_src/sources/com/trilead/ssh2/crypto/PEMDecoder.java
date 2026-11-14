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
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class PEMDecoder {
    private static final Logger LOGGER = Logger.getLogger(PEMDecoder.class.getName());
    private static final int PEM_DSA_PRIVATE_KEY = 2;
    private static final int PEM_RSA_PRIVATE_KEY = 1;

    @Deprecated
    public static Object decode(char[] cArr, String str) {
        LOGGER.getClass();
        PEMStructure parsePEM = parsePEM(cArr);
        if (isPEMEncrypted(parsePEM)) {
            if (str == null) {
                Q11088980322693754445.h("PEM is encrypted, but no password was specified");
                return null;
            }
            decryptPEM(parsePEM, str);
        }
        int i = parsePEM.pemType;
        if (i != 2) {
            if (i != 1) {
                Q11088980322693754445.h("PEM problem: it is of unknown type");
                return null;
            }
            SimpleDERReader simpleDERReader = new SimpleDERReader(parsePEM.data);
            byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                Q11088980322693754445.h("Padding in RSA PRIVATE KEY DER stream.");
                return null;
            }
            simpleDERReader.resetInput(readSequenceAsByteArray);
            BigInteger readInt = simpleDERReader.readInt();
            if (readInt.compareTo(BigInteger.ZERO) != 0 && readInt.compareTo(BigInteger.ONE) != 0) {
                Q11088980322693754445.h(G6547577305291411977.s("Wrong version (", String.valueOf(readInt), ") in RSA PRIVATE KEY DER stream."));
                return null;
            }
            BigInteger readInt2 = simpleDERReader.readInt();
            return new RSAPrivateKey(simpleDERReader.readInt(), simpleDERReader.readInt(), readInt2);
        }
        SimpleDERReader simpleDERReader2 = new SimpleDERReader(parsePEM.data);
        byte[] readSequenceAsByteArray2 = simpleDERReader2.readSequenceAsByteArray();
        if (simpleDERReader2.available() != 0) {
            Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
            return null;
        }
        simpleDERReader2.resetInput(readSequenceAsByteArray2);
        BigInteger readInt3 = simpleDERReader2.readInt();
        if (readInt3.compareTo(BigInteger.ZERO) != 0) {
            Q11088980322693754445.h(G6547577305291411977.s("Wrong version (", String.valueOf(readInt3), ") in DSA PRIVATE KEY DER stream."));
            return null;
        }
        BigInteger readInt4 = simpleDERReader2.readInt();
        BigInteger readInt5 = simpleDERReader2.readInt();
        BigInteger readInt6 = simpleDERReader2.readInt();
        BigInteger readInt7 = simpleDERReader2.readInt();
        BigInteger readInt8 = simpleDERReader2.readInt();
        if (simpleDERReader2.available() == 0) {
            return new DSAPrivateKey(readInt4, readInt5, readInt6, readInt7, readInt8);
        }
        Q11088980322693754445.h("Padding in DSA PRIVATE KEY DER stream.");
        return null;
    }

    public static KeyPair decodeKeyPair(char[] cArr, String str) {
        Iterator<KeyAlgorithm<PublicKey, PrivateKey>> it = KeyAlgorithmManager.getSupportedAlgorithms().iterator();
        while (it.hasNext()) {
            for (CertificateDecoder certificateDecoder : it.next().getCertificateDecoders()) {
                try {
                    PEMStructure parsePEM = parsePEM(cArr, certificateDecoder);
                    if (isPEMEncrypted(parsePEM)) {
                        if (str == null) {
                            throw new IOException("PEM is encrypted, but no password was specified");
                        }
                        decryptPEM(parsePEM, str);
                    }
                    return certificateDecoder.createKeyPair(parsePEM, str);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r3.equals("AES-256-CBC") == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void decryptPEM(com.trilead.ssh2.crypto.PEMStructure r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.trilead.ssh2.crypto.PEMDecoder.decryptPEM(com.trilead.ssh2.crypto.PEMStructure, java.lang.String):void");
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

    public static boolean isPEMEncrypted(PEMStructure pEMStructure) {
        String[] strArr = pEMStructure.procType;
        if (strArr == null) {
            return false;
        }
        if (strArr.length != 2) {
            Q11088980322693754445.h("Unknown Proc-Type field.");
            return false;
        }
        boolean equals = "4".equals(strArr[0]);
        String[] strArr2 = pEMStructure.procType;
        if (equals) {
            return "ENCRYPTED".equals(strArr2[1]);
        }
        Q11088980322693754445.h(G6547577305291411977.s("Unknown Proc-Type field (", strArr2[0], ")"));
        return false;
    }

    public static PEMStructure parsePEM(char[] cArr) {
        String str;
        PEMStructure pEMStructure = new PEMStructure();
        BufferedReader bufferedReader = new BufferedReader(new CharArrayReader(cArr));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                Q11088980322693754445.h("Invalid PEM structure, '-----BEGIN...' missing");
                return null;
            }
            String trim = readLine.trim();
            if (trim.startsWith("-----BEGIN DSA PRIVATE KEY-----")) {
                pEMStructure.pemType = 2;
                str = "-----END DSA PRIVATE KEY-----";
                break;
            }
            if (trim.startsWith("-----BEGIN RSA PRIVATE KEY-----")) {
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

    private static void parsePEMContent(PEMStructure pEMStructure, BufferedReader bufferedReader, String str) {
        Base64.Decoder decoder;
        byte[] decode;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                Q11088980322693754445.h(G6547577305291411977.s("Invalid PEM structure, ", str, " missing"));
                return;
            }
            String trim = readLine.trim();
            int indexOf = trim.indexOf(58);
            if (indexOf == -1) {
                StringBuilder sb = new StringBuilder();
                while (trim != null) {
                    String trim2 = trim.trim();
                    if (trim2.startsWith(str)) {
                        decoder = java.util.Base64.getDecoder();
                        decode = decoder.decode(sb.toString().replaceAll("\\s", ""));
                        pEMStructure.data = decode;
                        return;
                    }
                    sb.append(trim2);
                    trim = bufferedReader.readLine();
                }
                Q11088980322693754445.h(G6547577305291411977.s("Invalid PEM structure, ", str, " missing"));
                return;
            }
            int i = indexOf + 1;
            String substring = trim.substring(0, i);
            String[] split = trim.substring(i).split(",");
            for (int i2 = 0; i2 < split.length; i2++) {
                split[i2] = split[i2].trim();
            }
            if ("Proc-Type:".equals(substring)) {
                pEMStructure.procType = split;
            } else if ("DEK-Info:".equals(substring)) {
                pEMStructure.dekInfo = split;
            }
        }
    }

    private static PEMStructure parsePEM(char[] cArr, CertificateDecoder certificateDecoder) {
        String readLine;
        PEMStructure pEMStructure = new PEMStructure();
        BufferedReader bufferedReader = new BufferedReader(new CharArrayReader(cArr));
        do {
            readLine = bufferedReader.readLine();
            if (readLine == null) {
                Q11088980322693754445.h("Invalid PEM structure, '-----BEGIN...' missing");
                return null;
            }
        } while (!readLine.trim().startsWith(certificateDecoder.getStartLine()));
        parsePEMContent(pEMStructure, bufferedReader, certificateDecoder.getEndLine());
        if (pEMStructure.data.length != 0) {
            return pEMStructure;
        }
        Q11088980322693754445.h("Invalid PEM structure, no data available");
        return null;
    }
}
