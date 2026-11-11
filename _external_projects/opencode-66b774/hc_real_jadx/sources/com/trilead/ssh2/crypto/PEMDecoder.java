package com.trilead.ssh2.crypto;

import com.trilead.ssh2.crypto.cipher.AES;
import com.trilead.ssh2.crypto.cipher.CBCMode;
import com.trilead.ssh2.crypto.cipher.DES;
import com.trilead.ssh2.crypto.cipher.DESede;
import com.trilead.ssh2.crypto.digest.MD5;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import p131.p155.p156.p157.C2098;
import p131.p225.p226.p227.AbstractC2723;
import p131.p225.p226.p227.C2704;
import p131.p225.p226.p227.C2724;
import p131.p225.p226.p227.C2727;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PEMDecoder {
    private static final Logger LOGGER = Logger.getLogger(PEMDecoder.class.getName());
    private static final int PEM_DSA_PRIVATE_KEY = 2;
    private static final int PEM_RSA_PRIVATE_KEY = 1;

    @Deprecated
    public static Object decode(char[] cArr, String str) {
        PEMStructure parsePEM = parsePEM(cArr);
        if (isPEMEncrypted(parsePEM)) {
            if (str == null) {
                throw new IOException(Crypt.a(Crypt.xrc("@jlAbh\u001ca<OjlOjoHa:Nj9Af;Ian\u001cjgJ3i@`h\u001c4<\u001ckhO`l\u001bkf\u001ck<@ei\u001a0:\u001b3oMd;@em@1<M`iMd<Ka;Nf<Id=Mc>KdlLkm\u001eb9")));
            }
            decryptPEM(parsePEM, str.getBytes(Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"))));
        }
        int i = parsePEM.pemType;
        String a = Crypt.a(Crypt.xrc("\u0019dl\u001e1>M`<\u001c7jKb>J1=M7kIcmM6n\u001del\u001cc"));
        if (i != 2) {
            if (i != 1) {
                throw new IOException(Crypt.a(Crypt.xrc("L3iK4gI0n\u001ebo\u001aelN6g\u001bg=\u0019fg\u001ajfJ`fMgl\u001b3nK`hLb9\u0019ci\u001bag\u001a`m\u001cbgAdlKg:O6h\u001acfKg;O3iAk:\u001ek<\u001c4g\u001a0g\u001e09\u001a6k\u001cb<J4g")));
            }
            SimpleDERReader simpleDERReader = new SimpleDERReader(parsePEM.data);
            byte[] readSequenceAsByteArray = simpleDERReader.readSequenceAsByteArray();
            if (simpleDERReader.available() != 0) {
                throw new IOException(Crypt.a(Crypt.xrc("\u001be<\u001edmHe9\u001b7:\u001dg:@kmLf>\u001b3;\u001cdkHdm\u001ckh@km\u001dd:J6oL3:I7kHf;Ka9\u001bjh@c<@1k\u001a4g\u001ab<\u001b1nHkj\u0019ch\u001bkkM`k\u001cc<\u0019kfKd;Ia<")));
            }
            simpleDERReader.resetInput(readSequenceAsByteArray);
            BigInteger readInt = simpleDERReader.readInt();
            if (readInt.compareTo(BigInteger.ZERO) == 0 || readInt.compareTo(BigInteger.ONE) == 0) {
                return new C2727(simpleDERReader.readInt(), simpleDERReader.readInt(), simpleDERReader.readInt());
            }
            throw new IOException(a + readInt + Crypt.a(Crypt.xrc("Jbf\u0019`;\u00193>NanI7nMc;IgnKcnIk=Lj>\u00197=L7nAjn\u001balH1gLgm\u001d3mK3oMd>\u001e4k@7;\u001dgjKj=O4=@4iJbhO7nMgoNgmO`iLfnLj9")));
        }
        SimpleDERReader simpleDERReader2 = new SimpleDERReader(parsePEM.data);
        byte[] readSequenceAsByteArray2 = simpleDERReader2.readSequenceAsByteArray();
        int available = simpleDERReader2.available();
        String a2 = Crypt.a(Crypt.xrc("Ij<L`n\u001d6hN3hKa:Mb=Aal\u001cdo@jgN`o\u001e4j@bnO6>A0l\u001dd>K0fIg9Jdo\u001bcgJd;\u001akiNemMbk\u001bb>Afk\u00194hM0mHb<L4g\u001c6j\u00196j\u001a4;"));
        if (available != 0) {
            throw new IOException(a2);
        }
        simpleDERReader2.resetInput(readSequenceAsByteArray2);
        BigInteger readInt2 = simpleDERReader2.readInt();
        if (readInt2.compareTo(BigInteger.ZERO) != 0) {
            throw new IOException(a + readInt2 + Crypt.a(Crypt.xrc("\u001b4<Kc=N0:M1oI7;J`g@ejNfk\u001dghM1<\u00194:\u001c0>K`;Hg<O1l\u001ee;Lc9Kk=MjfMcn\u001c6>I0m\u001c`:\u001e4>\u001bf9\u001a1:IkmA1kL6>L19Ac;Adk")));
        }
        BigInteger readInt3 = simpleDERReader2.readInt();
        BigInteger readInt4 = simpleDERReader2.readInt();
        BigInteger readInt5 = simpleDERReader2.readInt();
        BigInteger readInt6 = simpleDERReader2.readInt();
        BigInteger readInt7 = simpleDERReader2.readInt();
        if (simpleDERReader2.available() == 0) {
            return new C2704(readInt3, readInt4, readInt5, readInt6, readInt7);
        }
        throw new IOException(a2);
    }

    public static KeyPair decodeKeyPair(char[] cArr, String str) {
        Iterator<AbstractC2723<PublicKey, PrivateKey>> it = C2724.f10215.iterator();
        while (it.hasNext()) {
            for (CertificateDecoder certificateDecoder : it.next().mo4657()) {
                try {
                    PEMStructure parsePEM = parsePEM(cArr, certificateDecoder);
                    if (isPEMEncrypted(parsePEM)) {
                        if (str == null) {
                            throw new IOException(Crypt.a(Crypt.xrc("@jlAbh\u001ca<OjlOjoHa:Nj9Af;Ian\u001cjgJ3i@`h\u001c4<\u001ckhO`l\u001bkf\u001ck<@ei\u001a0:\u001b3oMd;@em@1<M`iMd<Ka;Nf<Id=Mc>KdlLkm\u001eb9")));
                        }
                        decryptPEM(parsePEM, str.getBytes(Crypt.a(Crypt.xrc("\u001c0<Jgf\u001b0<\u001dgf\u001db=\u001b`kL`m@a>Nkh\u001ecnH7"))));
                    }
                    return certificateDecoder.createKeyPair(parsePEM, str);
                } catch (IOException e) {
                    Logger logger = LOGGER;
                    Level level = Level.FINE;
                    StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("Lbo\u0019fmJ6o\u001abk\u001dd>O4m@7jMbkHjm\u001e3:@cf\u001c3>JkjN3kHj=\u001ak:\u001ad9H39\u001a7gOjo\u001b0g\u001aefId9Og:M3oJc=Ne9Hd<K6>A0gLfkN6m@g>H4:Idf\u001djk\u001a1hMg>Ok<HckI3<Od>La")));
                    m4207.append(certificateDecoder.getClass().getName());
                    logger.log(level, m4207.toString(), (Throwable) e);
                }
            }
        }
        throw new IOException(Crypt.a(Crypt.xrc("L3iK4gI0n\u001ebo\u001aelN6g\u001bg=\u0019fg\u001ajfJ`fMgl\u001b3nK`hLb9\u0019ci\u001bag\u001a`m\u001cbgAdlKg:O6h\u001acfKg;O3iAk:\u001ek<\u001c4g\u001a0g\u001e09\u001a6k\u001cb<J4g")));
    }

    private static void decryptPEM(PEMStructure pEMStructure, byte[] bArr) {
        CBCMode cBCMode;
        String[] strArr = pEMStructure.dekInfo;
        if (strArr == null) {
            throw new IOException(Crypt.a(Crypt.xrc("\u0019cnOgm@6jL`=\u001ec>\u0019bk\u001ef9\u001b6;McmIk=Ib:Lf<\u001d79I49\u001cb:KjkI`j\u001c4kHjgO1<J4jLgjJdjN7<\u001eagNagAem\u001e7;\u001bbgMjlM7<KgfOgk\u001c7jMem\u001a3l\u001d1nJj:\u0019k<L7:@ai\u001eg9Ma")));
        }
        if (strArr.length != 2) {
            throw new IOException(Crypt.a(Crypt.xrc("\u001dj>\u0019fm\u001abkMj;\u001ee=\u001e`hHc:AefLj9\u001djj@4<Aj;\u001e1k\u001bgkH3l\u001d1fMa:K`:\u001b3iAdlAb;@d<J`<Ad<Aj<@bjOg;\u001c`oLekIgjN6=\u001cji")));
        }
        String str = strArr[0];
        byte[] hexToByteArray = hexToByteArray(strArr[1]);
        if (str.equals(Crypt.a(Crypt.xrc("\u001c`gHa;@blIcn\u001e6oL3jKbgNd9HjiKd>Oe")))) {
            DESede dESede = new DESede();
            dESede.init(false, generateKeyFromPasswordSaltWithMD5(bArr, hexToByteArray, 24));
            cBCMode = new CBCMode(dESede, hexToByteArray, false);
        } else if (str.equals(Crypt.a(Crypt.xrc("@kfJf>@fmKkl\u001d`nAfiL1i\u001b4>\u001cjnH3m\u001cf")))) {
            DES des = new DES();
            des.init(false, generateKeyFromPasswordSaltWithMD5(bArr, hexToByteArray, 8));
            cBCMode = new CBCMode(des, hexToByteArray, false);
        } else if (str.equals(Crypt.a(Crypt.xrc("\u001ce=I4h\u001c0<\u0019b<K`9@3jLeh\u001efhKa<\u001dg=\u00196")))) {
            AES aes = new AES();
            aes.init(false, generateKeyFromPasswordSaltWithMD5(bArr, hexToByteArray, 16));
            cBCMode = new CBCMode(aes, hexToByteArray, false);
        } else if (str.equals(Crypt.a(Crypt.xrc("MfkJgh@6>\u001b4=K7fO`9J3;\u001e7kLenAkfLb")))) {
            AES aes2 = new AES();
            aes2.init(false, generateKeyFromPasswordSaltWithMD5(bArr, hexToByteArray, 24));
            cBCMode = new CBCMode(aes2, hexToByteArray, false);
        } else {
            if (!str.equals(Crypt.a(Crypt.xrc("I49L`<H4oO6:Ian\u001ddo\u001a1<\u001adk\u0019j:L6kHa")))) {
                throw new IOException(C2098.m4205(Crypt.a(Crypt.xrc("IfiL79\u001cc:\u001cfhM1;NggN3j\u001balJjgKdiJfkIboAbj\u001djkMb=I6<OdiMbiKe>OchNfoIbh\u00193hI39\u001b3;AkfLefAe:O6>L`f\u0019bg\u001a1l")), str));
            }
            AES aes3 = new AES();
            aes3.init(false, generateKeyFromPasswordSaltWithMD5(bArr, hexToByteArray, 32));
            cBCMode = new CBCMode(aes3, hexToByteArray, false);
        }
        if (pEMStructure.data.length % cBCMode.getBlockSize() != 0) {
            StringBuilder m4207 = C2098.m4207(Crypt.a(Crypt.xrc("\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>MkkA3>\u001a3l\u001ae=\u001acl\u001ddhHeo\u001ddj\u001dkmHa:K6=\u0019`nO4>\u001ab=\u001a`;\u001bd>IanAcnMgo\u001dc=AgiI1l\u0019`mK7gMa<N`9\u001ajkJ6jH7o\u001ab<Lb=\u001dkl@`h@di\u001b4>Okn\u001delN7gN3jHkmA1i\u001afkO1i\u0019")));
            m4207.append(cBCMode.getBlockSize());
            throw new IOException(m4207.toString());
        }
        byte[] bArr2 = new byte[pEMStructure.data.length];
        for (int i = 0; i < pEMStructure.data.length / cBCMode.getBlockSize(); i++) {
            cBCMode.transformBlock(pEMStructure.data, cBCMode.getBlockSize() * i, bArr2, cBCMode.getBlockSize() * i);
        }
        pEMStructure.data = removePadding(bArr2, cBCMode.getBlockSize());
        pEMStructure.dekInfo = null;
        pEMStructure.procType = null;
    }

    public static byte[] generateKeyFromPasswordSaltWithMD5(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length < 8) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("M0hJeh\u001b1i@jmHg:\u001b6fMdoI6h\u001e4:N7;@79\u001c1jL6nO`gL7o\u001bdi\u001ea>A0m\u001b7:K3:A3=Mcm\u0019j=\u001ceoA7:O`f\u001e1=AaiHjhL7:Mfi\u001a0mJfiId<\u001909\u001ejjAe=O3k\u001abnHdiO7nJ6:\u00191")));
        }
        MD5 md5 = new MD5();
        byte[] bArr3 = new byte[i];
        int digestLength = md5.getDigestLength();
        byte[] bArr4 = new byte[digestLength];
        int i2 = i;
        while (true) {
            md5.update(bArr, 0, bArr.length);
            md5.update(bArr2, 0, 8);
            int i3 = i2 < digestLength ? i2 : digestLength;
            md5.digest(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr3, i - i2, i3);
            i2 -= i3;
            if (i2 == 0) {
                return bArr3;
            }
            md5.update(bArr4, 0, digestLength);
        }
    }

    private static byte[] hexToByteArray(String str) {
        if (str == null) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("H3lM0lK3lOf<Og9JkhA6<\u0019b9Ij<A`hJd")));
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(Crypt.a(Crypt.xrc("NboO79@0<Hdg\u001cg<N0:OdiI6:JaiNggL0m\u001ajm\u001cd;L1nH4mN79J`h\u001b6<Na:O7oI3iK0fJ0oOe:H0;\u0019knKb>\u001b4k\u001bg=\u0019gnLcnA0<")));
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
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                if (c < '0' || c > '9') {
                    throw new IllegalArgumentException(Crypt.a(Crypt.xrc("Nkh\u001cb9\u001d`gNdj\u001c1:\u001dekK7o\u0019f9\u001cen\u001c7iO1")));
                }
                return c - '0';
            }
        }
        return (c - c2) + 10;
    }

    public static boolean isPEMEncrypted(PEMStructure pEMStructure) {
        String[] strArr = pEMStructure.procType;
        if (strArr == null) {
            return false;
        }
        if (strArr.length != 2) {
            throw new IOException(Crypt.a(Crypt.xrc("L6g@bo\u001ec=\u0019giI3oHf:N3fKek@co\u001ce9@1gMdl\u001c4;H6gJ0;@0n\u001afo\u001e6k@a9AeoOg=M")));
        }
        if (!Crypt.a(Crypt.xrc("@0gMflHdk\u001bamI`kA1g\u001ad=\u001ccgAk>NchHa")).equals(strArr[0])) {
            throw new IOException(C2098.m4198(C2098.m4207(Crypt.a(Crypt.xrc("L6g@bo\u001ec=\u0019giI3oHf:N3fKek@co\u001ce9@1fHc=\u001c4nOfg\u001cdm\u001aagNj<\u001a0n@dkJ4:N3kI"))), pEMStructure.procType[0], Crypt.a(Crypt.xrc("\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"))));
        }
        return Crypt.a(Crypt.xrc("\u001ae>\u0019ff\u001a79K3jJgjAdgAen\u0019df\u001ab>Lfh@b")).equals(pEMStructure.procType[1]);
    }

    private static PEMStructure parsePEM(char[] cArr) {
        String a;
        PEMStructure pEMStructure = new PEMStructure();
        BufferedReader bufferedReader = new BufferedReader(new CharArrayReader(cArr));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                throw new IOException("Invalid PEM structure, '-----BEGIN...' missing");
            }
            String trim = readLine.trim();
            if (trim.startsWith(Crypt.a(Crypt.xrc("\u00196oI`f\u001baj\u001cbiId=\u001b`f\u001c`oHkhHcmO0<H6i\u001cgn\u001b`g\u001ce9Hbo\u001ab:KamAdgMa=\u001aci\u001dg=H")))) {
                pEMStructure.pemType = 2;
                a = Crypt.a(Crypt.xrc("Ob:\u001ed:\u00194<M6kMboLc>H`jIb:Lg=\u001dj9\u001c3hOdgN6=Nd=\u0019d9\u001ccmMkiH`;\u0019a;\u001da:Meo\u001b"));
                break;
            }
            if (trim.startsWith(Crypt.a(Crypt.xrc("Ifm\u001b0hJghNc;Okf@djMf:@e<\u001e3=Hfh\u001ck:HbmH79Mj<Hjf\u001ce<\u001bekA0f\u001dcnMboJ4fJ")))) {
                pEMStructure.pemType = 1;
                a = Crypt.a(Crypt.xrc("I7;Hdh\u00191kNc:\u001ce=A4iHj>\u001d69\u001ceh\u001ea:AenNd<\u001cfj\u001djjLj>O4f\u001db<\u001cjnAe;@1fKdlI"));
                break;
            }
        }
        while (true) {
            String readLine2 = bufferedReader.readLine();
            String a2 = Crypt.a(Crypt.xrc("IgjO4o\u001a3<\u001aah\u001a3:\u0019g9A1=J`mAf9\u001cc>\u001cb"));
            String a3 = Crypt.a(Crypt.xrc("\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>MklK3hJcj\u0019el\u001cbi\u001a4m@kf\u001dckN3nAkmN6hI"));
            if (readLine2 == null) {
                throw new IOException(C2098.m4187(a3, a, a2));
            }
            String trim2 = readLine2.trim();
            int indexOf = trim2.indexOf(58);
            if (indexOf == -1) {
                StringBuilder sb = new StringBuilder();
                while (trim2 != null) {
                    String trim3 = trim2.trim();
                    if (trim3.startsWith(a)) {
                        int length = sb.length();
                        char[] cArr2 = new char[length];
                        sb.getChars(0, length, cArr2, 0);
                        byte[] decode = Base64.decode(cArr2);
                        pEMStructure.data = decode;
                        if (decode.length != 0) {
                            return pEMStructure;
                        }
                        throw new IOException(Crypt.a(Crypt.xrc("\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>Mk<Mcl@6f\u001bggL69L0fA0>Mg;O7j\u001ck;\u001a`m\u001a1:Nf>\u001dk>\u001dgoIa;\u001e0gI6:\u001e79Ajh\u001bgnKai")));
                    }
                    sb.append(trim3);
                    trim2 = bufferedReader.readLine();
                }
                throw new IOException(C2098.m4187(a3, a, a2));
            }
            int i = indexOf + 1;
            String substring = trim2.substring(0, i);
            String[] split = trim2.substring(i).split(Crypt.a(Crypt.xrc("\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3")));
            for (int i2 = 0; i2 < split.length; i2++) {
                split[i2] = split[i2].trim();
            }
            if (Crypt.a(Crypt.xrc("\u001b6;\u001dbo\u001b1oJjkNk>K1=Ld=@3<@bf\u001ad;\u001de")).equals(substring)) {
                pEMStructure.procType = split;
            } else if (Crypt.a(Crypt.xrc("\u001a`;N4;\u001db>\u001adk\u001cbl\u001a6jLfi\u001ajm\u001cafH1=\u0019e")).equals(substring)) {
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
                throw new IOException("Invalid PEM structure, '-----BEGIN...' missing");
            }
        } while (!readLine.trim().startsWith(certificateDecoder.getStartLine()));
        String endLine = certificateDecoder.getEndLine();
        while (true) {
            String readLine2 = bufferedReader.readLine();
            String a = Crypt.a(Crypt.xrc("IgjO4o\u001a3<\u001aah\u001a3:\u0019g9A1=J`mAf9\u001cc>\u001cb"));
            String a2 = Crypt.a(Crypt.xrc("\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>MklK3hJcj\u0019el\u001cbi\u001a4m@kf\u001dckN3nAkmN6hI"));
            if (readLine2 == null) {
                throw new IOException(C2098.m4187(a2, endLine, a));
            }
            String trim = readLine2.trim();
            int indexOf = trim.indexOf(58);
            if (indexOf == -1) {
                StringBuilder sb = new StringBuilder();
                while (trim != null) {
                    String trim2 = trim.trim();
                    if (trim2.startsWith(endLine)) {
                        int length = sb.length();
                        char[] cArr2 = new char[length];
                        sb.getChars(0, length, cArr2, 0);
                        byte[] decode = Base64.decode(cArr2);
                        pEMStructure.data = decode;
                        if (decode.length != 0) {
                            return pEMStructure;
                        }
                        throw new IOException(Crypt.a(Crypt.xrc("\u001dahOf>\u0019ji\u001dk<LjoAffHd:\u001a0hMdfN1>Mk<Mcl@6f\u001bggL69L0fA0>Mg;O7j\u001ck;\u001a`m\u001a1:Nf>\u001dk>\u001dgoIa;\u001e0gI6:\u001e79Ajh\u001bgnKai")));
                    }
                    sb.append(trim2);
                    trim = bufferedReader.readLine();
                }
                throw new IOException(C2098.m4187(a2, endLine, a));
            }
            int i = indexOf + 1;
            String substring = trim.substring(0, i);
            String[] split = trim.substring(i).split(Crypt.a(Crypt.xrc("\u0019j>A7;K4:\u001a6:@79IbkJ7fO3g\u00190hAbjO3")));
            for (int i2 = 0; i2 < split.length; i2++) {
                split[i2] = split[i2].trim();
            }
            if (Crypt.a(Crypt.xrc("\u001b6;\u001dbo\u001b1oJjkNk>K1=Ld=@3<@bf\u001ad;\u001de")).equals(substring)) {
                pEMStructure.procType = split;
            } else if (Crypt.a(Crypt.xrc("\u001a`;N4;\u001db>\u001adk\u001cbl\u001a6jLfi\u001ajm\u001cafH1=\u0019e")).equals(substring)) {
                pEMStructure.dekInfo = split;
            }
        }
    }

    private static byte[] removePadding(byte[] bArr, int i) {
        int i2 = bArr[bArr.length - 1] & org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64.BASELENGTH;
        String a = Crypt.a(Crypt.xrc("JgfIjh\u001akh\u001bf=H`9MgiOb:J`f@3mIjf\u001c1>\u001c`:@1o\u001c3:O1m\u001e4>HjfK39Nd<Idh\u001ebkA6l\u001dcfNajIfnM1>\u001a0:\u001dkh@aiMbgM7fLa>@3nI69\u001ee;\u001d4mAciO0g\u001eek@7:\u001d4:Obi@di\u001d6iJe>\u001c0fI7k\u001ben\u001e`jIghI`=OegN7>K"));
        if (i2 < 1 || i2 > i) {
            throw new IOException(a);
        }
        for (int i3 = 2; i3 <= i2; i3++) {
            if (bArr[bArr.length - i3] != i2) {
                throw new IOException(a);
            }
        }
        byte[] bArr2 = new byte[bArr.length - i2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length - i2);
        return bArr2;
    }
}
