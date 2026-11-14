package com.trilead.ssh2.signature;

import com.trilead.ssh2.crypto.CertificateDecoder;
import com.trilead.ssh2.crypto.PEMStructure;
import com.trilead.ssh2.crypto.cipher.BlockCipher;
import com.trilead.ssh2.crypto.cipher.BlockCipherFactory;
import com.trilead.ssh2.crypto.cipher.CBCMode;
import com.trilead.ssh2.crypto.cipher.DES;
import dev.epro.r0.C9142879380583651391;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Y16648110901821727512;
import dev.epro.r0.Z3383101362411723454;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
abstract class OpenSshCertificateDecoder extends CertificateDecoder {
    private final String keyAlgorithm;

    public OpenSshCertificateDecoder(String str) {
        this.keyAlgorithm = str;
    }

    private static byte[] decryptData(byte[] bArr, byte[] bArr2, SshCipher sshCipher) {
        int keyLength = sshCipher.getKeyLength();
        byte[] bArr3 = new byte[keyLength];
        int blockSize = sshCipher.getBlockSize();
        byte[] bArr4 = new byte[blockSize];
        System.arraycopy(bArr2, 0, bArr3, 0, keyLength);
        System.arraycopy(bArr2, keyLength, bArr4, 0, blockSize);
        BlockCipher blockCipherCreateBlockCipher = sshCipher.createBlockCipher(bArr3, bArr4, false);
        byte[] bArr5 = new byte[bArr.length];
        for (int i = 0; i < bArr.length / blockCipherCreateBlockCipher.getBlockSize(); i++) {
            blockCipherCreateBlockCipher.transformBlock(bArr, blockCipherCreateBlockCipher.getBlockSize() * i, bArr5, blockCipherCreateBlockCipher.getBlockSize() * i);
        }
        return bArr5;
    }

    private static byte[] generateKayAndIvPbkdf2(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        byte[] bArr3;
        int i4 = i2 + i3;
        byte[] bArr4 = new byte[i4];
        Y16648110901821727512 y16648110901821727512 = new Y16648110901821727512();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            int i5 = (i4 + 31) / 32;
            byte[] bArrDigest = messageDigest.digest(bArr);
            byte[] bArr5 = new byte[64];
            byte[] bArr6 = new byte[32];
            byte[] bArr7 = new byte[32];
            for (int i6 = 1; i6 <= i5; i6++) {
                bArr3 = null;
                try {
                    int i7 = 0;
                    messageDigest.reset();
                    messageDigest.update(bArr2);
                    messageDigest.update(new byte[]{(byte) ((i6 >> 24) & 255), (byte) ((i6 >> 16) & 255), (byte) ((i6 >> 8) & 255), (byte) (i6 & 255)});
                    messageDigest.digest(bArr5, 0, 64);
                    y16648110901821727512.b(bArrDigest, bArr5, bArr6);
                    System.arraycopy(bArr6, 0, bArr7, 0, 32);
                    int i8 = 1;
                    while (i8 < i) {
                        messageDigest.reset();
                        messageDigest.update(bArr7);
                        messageDigest.digest(bArr5, i7, 64);
                        y16648110901821727512.b(bArrDigest, bArr5, bArr7);
                        for (int i9 = i7; i9 < 32; i9++) {
                            bArr6[i9] = (byte) (bArr6[i9] ^ bArr7[i9]);
                        }
                        i8++;
                        i7 = 0;
                    }
                    for (int i10 = 0; i10 < 32; i10++) {
                        int i11 = (i6 - 1) + (i10 * i5);
                        if (i11 < i4) {
                            bArr4[i11] = bArr6[i10];
                        }
                    }
                } catch (DigestException e) {
                    e = e;
                    Q11088980322693754445.k(e);
                    return bArr3;
                } catch (NoSuchAlgorithmException e2) {
                    e = e2;
                    Q11088980322693754445.k(e);
                    return bArr3;
                }
            }
            return bArr4;
        } catch (DigestException e3) {
            e = e3;
            bArr3 = null;
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            bArr3 = null;
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public KeyPair createKeyPair(PEMStructure pEMStructure, String str) throws IOException {
        C9142879380583651391 c9142879380583651391 = new C9142879380583651391(pEMStructure.getData());
        byte[] bArrD = c9142879380583651391.d(15);
        Charset charset = StandardCharsets.UTF_8;
        if (!"openssh-key-v1".equals(new String(bArrD, charset).trim())) {
            Q11088980322693754445.h("Could not find openssh header in key");
            return null;
        }
        String strG = c9142879380583651391.g();
        String strG2 = c9142879380583651391.g();
        byte[] bArrC = c9142879380583651391.c();
        if (c9142879380583651391.i() != 1) {
            Q11088980322693754445.h("Only single OpenSSH keys are supported");
            return null;
        }
        c9142879380583651391.c();
        byte[] bArrC2 = c9142879380583651391.c();
        if ("bcrypt".equals(strG2)) {
            if (str == null) {
                Q11088980322693754445.h("PEM is encrypted but password has not been specified");
                return null;
            }
            C9142879380583651391 c91428793805836513912 = new C9142879380583651391(bArrC);
            byte[] bArrC3 = c91428793805836513912.c();
            int i = c91428793805836513912.i();
            SshCipher sshCipher = SshCipher.getInstance(strG);
            bArrC2 = decryptData(bArrC2, generateKayAndIvPbkdf2(str.getBytes(charset), bArrC3, i, sshCipher.getKeyLength(), sshCipher.getBlockSize()), sshCipher);
        } else if (!"none".equals(strG) || !"none".equals(strG2)) {
            Q11088980322693754445.h("Unexpected encryption method for key");
            return null;
        }
        C9142879380583651391 c91428793805836513913 = new C9142879380583651391(bArrC2);
        if (c91428793805836513913.i() != c91428793805836513913.i()) {
            Q11088980322693754445.h("Check integers didn't match");
            return null;
        }
        String strG3 = c91428793805836513913.g();
        if (!strG3.equals(this.keyAlgorithm)) {
            Q11088980322693754445.h("Invalid key type: ".concat(strG3));
            return null;
        }
        try {
            KeyPair keyPairGenerateKeyPair = generateKeyPair(c91428793805836513913);
            c91428793805836513913.c();
            int i2 = 0;
            while (i2 < c9142879380583651391.j()) {
                i2++;
                if (i2 != c9142879380583651391.b()) {
                    throw new IOException("Incorrect padding on private keys");
                }
            }
            return keyPairGenerateKeyPair;
        } catch (GeneralSecurityException e) {
            Z3383101362411723454.q("Could not create key pair", e);
            return null;
        }
    }

    public abstract KeyPair generateKeyPair(C9142879380583651391 c9142879380583651391);

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public String getEndLine() {
        return "-----END OPENSSH PRIVATE KEY-----";
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public String getStartLine() {
        return "-----BEGIN OPENSSH PRIVATE KEY-----";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static abstract class SshCipher {
        private final int blockSize;
        private final int keyLength;
        private final String[] sshCipherNames;
        public static final SshCipher DESEDE_CBC = new AnonymousClass1(new String[0]);
        public static final SshCipher DES_CBC = new AnonymousClass2(new String[0]);
        public static final SshCipher AES128_CBC = new AnonymousClass3(new String[]{"aes128-cbc"});
        public static final SshCipher AES192_CBC = new AnonymousClass4(new String[]{"aes192-cbc"});
        public static final SshCipher AES256_CBC = new AnonymousClass5(new String[]{"aes256-cbc"});
        public static final SshCipher AES256_CTR = new AnonymousClass6(new String[]{"aes256-ctr"});
        private static final /* synthetic */ SshCipher[] $VALUES = $values();

        private static /* synthetic */ SshCipher[] $values() {
            return new SshCipher[]{DESEDE_CBC, DES_CBC, AES128_CBC, AES192_CBC, AES256_CBC, AES256_CTR};
        }

        private SshCipher(String str, int i, int i2, int i3, String str2, String... strArr) {
            this.keyLength = i2;
            this.blockSize = i3;
            String[] strArr2 = new String[(strArr == null ? 0 : strArr.length) + 1];
            strArr2[0] = str2;
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            }
            this.sshCipherNames = strArr2;
        }

        public static SshCipher getInstance(String str) {
            for (SshCipher sshCipher : values()) {
                for (String str2 : sshCipher.sshCipherNames) {
                    if (str2.equalsIgnoreCase(str)) {
                        return sshCipher;
                    }
                }
            }
            S10973172697741180971.j(G6547577305291411977.C("Unknown Cipher: ", str));
            return null;
        }

        public static SshCipher valueOf(String str) {
            return (SshCipher) Enum.valueOf(SshCipher.class, str);
        }

        public static SshCipher[] values() {
            return (SshCipher[]) $VALUES.clone();
        }

        public abstract BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z);

        public int getBlockSize() {
            return this.blockSize;
        }

        public int getKeyLength() {
            return this.keyLength;
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass1 extends SshCipher {
            public /* synthetic */ AnonymousClass1(String[] strArr) {
                this("DESEDE_CBC", 0, 24, 8, "des-ede3-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("3des-cbc", z, bArr, bArr2);
            }

            private AnonymousClass1(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass2 extends SshCipher {
            public /* synthetic */ AnonymousClass2(String[] strArr) {
                this("DES_CBC", 1, 8, 8, "des-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                DES des = new DES();
                des.init(z, bArr);
                return new CBCMode(des, bArr2, z);
            }

            private AnonymousClass2(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass3 extends SshCipher {
            public /* synthetic */ AnonymousClass3(String[] strArr) {
                this("AES128_CBC", 2, 16, 16, "aes-128-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes128-cbc", z, bArr, bArr2);
            }

            private AnonymousClass3(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass4 extends SshCipher {
            public /* synthetic */ AnonymousClass4(String[] strArr) {
                this("AES192_CBC", 3, 24, 16, "aes-192-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes192-cbc", z, bArr, bArr2);
            }

            private AnonymousClass4(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass5 extends SshCipher {
            public /* synthetic */ AnonymousClass5(String[] strArr) {
                this("AES256_CBC", 4, 32, 16, "aes-256-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes256-cbc", z, bArr, bArr2);
            }

            private AnonymousClass5(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass6 extends SshCipher {
            public /* synthetic */ AnonymousClass6(String[] strArr) {
                this("AES256_CTR", 5, 32, 16, "aes-256-ctr", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return BlockCipherFactory.createCipher("aes256-ctr", z, bArr, bArr2);
            }

            private AnonymousClass6(String str, int i, int i2, int i3, String str2, String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        public /* synthetic */ SshCipher(String str, int i, int i2, int i3, String str2, String[] strArr, int i4) {
            this(str, i, i2, i3, str2, strArr);
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public KeyPair createKeyPair(PEMStructure pEMStructure) {
        return null;
    }
}
