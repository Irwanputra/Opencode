package com.trilead.ssh2.signature;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
abstract class OpenSshCertificateDecoder extends com.trilead.ssh2.crypto.CertificateDecoder {
    private final java.lang.String keyAlgorithm;

    public OpenSshCertificateDecoder(java.lang.String str) {
        this.keyAlgorithm = str;
    }

    private static byte[] decryptData(byte[] bArr, byte[] bArr2, com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher sshCipher) {
        int keyLength = sshCipher.getKeyLength();
        byte[] bArr3 = new byte[keyLength];
        int blockSize = sshCipher.getBlockSize();
        byte[] bArr4 = new byte[blockSize];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, keyLength);
        java.lang.System.arraycopy(bArr2, keyLength, bArr4, 0, blockSize);
        com.trilead.ssh2.crypto.cipher.BlockCipher blockCipherCreateBlockCipher = sshCipher.createBlockCipher(bArr3, bArr4, false);
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
        dev.epro.r0.Y16648110901821727512 y16648110901821727512 = new dev.epro.r0.Y16648110901821727512();
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-512");
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
                    java.lang.System.arraycopy(bArr6, 0, bArr7, 0, 32);
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
                } catch (java.security.DigestException e) {
                    e = e;
                    dev.epro.r0.Q11088980322693754445.k(e);
                    return bArr3;
                } catch (java.security.NoSuchAlgorithmException e2) {
                    e = e2;
                    dev.epro.r0.Q11088980322693754445.k(e);
                    return bArr3;
                }
            }
            return bArr4;
        } catch (java.security.DigestException e3) {
            e = e3;
            bArr3 = null;
        } catch (java.security.NoSuchAlgorithmException e4) {
            e = e4;
            bArr3 = null;
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public java.security.KeyPair createKeyPair(com.trilead.ssh2.crypto.PEMStructure pEMStructure, java.lang.String str) throws java.io.IOException {
        dev.epro.r0.C9142879380583651391 c9142879380583651391 = new dev.epro.r0.C9142879380583651391(pEMStructure.getData());
        byte[] bArrD = c9142879380583651391.d(15);
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        if (!"openssh-key-v1".equals(new java.lang.String(bArrD, charset).trim())) {
            dev.epro.r0.Q11088980322693754445.h("Could not find openssh header in key");
            return null;
        }
        java.lang.String strG = c9142879380583651391.g();
        java.lang.String strG2 = c9142879380583651391.g();
        byte[] bArrC = c9142879380583651391.c();
        if (c9142879380583651391.i() != 1) {
            dev.epro.r0.Q11088980322693754445.h("Only single OpenSSH keys are supported");
            return null;
        }
        c9142879380583651391.c();
        byte[] bArrC2 = c9142879380583651391.c();
        if ("bcrypt".equals(strG2)) {
            if (str == null) {
                dev.epro.r0.Q11088980322693754445.h("PEM is encrypted but password has not been specified");
                return null;
            }
            dev.epro.r0.C9142879380583651391 c91428793805836513912 = new dev.epro.r0.C9142879380583651391(bArrC);
            byte[] bArrC3 = c91428793805836513912.c();
            int i = c91428793805836513912.i();
            com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher sshCipher = com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.getInstance(strG);
            bArrC2 = decryptData(bArrC2, generateKayAndIvPbkdf2(str.getBytes(charset), bArrC3, i, sshCipher.getKeyLength(), sshCipher.getBlockSize()), sshCipher);
        } else if (!"none".equals(strG) || !"none".equals(strG2)) {
            dev.epro.r0.Q11088980322693754445.h("Unexpected encryption method for key");
            return null;
        }
        dev.epro.r0.C9142879380583651391 c91428793805836513913 = new dev.epro.r0.C9142879380583651391(bArrC2);
        if (c91428793805836513913.i() != c91428793805836513913.i()) {
            dev.epro.r0.Q11088980322693754445.h("Check integers didn't match");
            return null;
        }
        java.lang.String strG3 = c91428793805836513913.g();
        if (!strG3.equals(this.keyAlgorithm)) {
            dev.epro.r0.Q11088980322693754445.h("Invalid key type: ".concat(strG3));
            return null;
        }
        try {
            java.security.KeyPair keyPairGenerateKeyPair = generateKeyPair(c91428793805836513913);
            c91428793805836513913.c();
            int i2 = 0;
            while (i2 < c9142879380583651391.j()) {
                i2++;
                if (i2 != c9142879380583651391.b()) {
                    throw new java.io.IOException("Incorrect padding on private keys");
                }
            }
            return keyPairGenerateKeyPair;
        } catch (java.security.GeneralSecurityException e) {
            dev.epro.r0.Z3383101362411723454.q("Could not create key pair", e);
            return null;
        }
    }

    public abstract java.security.KeyPair generateKeyPair(dev.epro.r0.C9142879380583651391 c9142879380583651391);

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public java.lang.String getEndLine() {
        return "-----END OPENSSH PRIVATE KEY-----";
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public java.lang.String getStartLine() {
        return "-----BEGIN OPENSSH PRIVATE KEY-----";
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static abstract class SshCipher {
        private final int blockSize;
        private final int keyLength;
        private final java.lang.String[] sshCipherNames;
        public static final com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher DESEDE_CBC = new com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.AnonymousClass1(new java.lang.String[0]);
        public static final com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher DES_CBC = new com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.AnonymousClass2(new java.lang.String[0]);
        public static final com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher AES128_CBC = new com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.AnonymousClass3(new java.lang.String[]{"aes128-cbc"});
        public static final com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher AES192_CBC = new com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.AnonymousClass4(new java.lang.String[]{"aes192-cbc"});
        public static final com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher AES256_CBC = new com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.AnonymousClass5(new java.lang.String[]{"aes256-cbc"});
        public static final com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher AES256_CTR = new com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.AnonymousClass6(new java.lang.String[]{"aes256-ctr"});
        private static final /* synthetic */ com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher[] $VALUES = $values();

        private static /* synthetic */ com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher[] $values() {
            return new com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher[]{DESEDE_CBC, DES_CBC, AES128_CBC, AES192_CBC, AES256_CBC, AES256_CTR};
        }

        private SshCipher(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String... strArr) {
            this.keyLength = i2;
            this.blockSize = i3;
            java.lang.String[] strArr2 = new java.lang.String[(strArr == null ? 0 : strArr.length) + 1];
            strArr2[0] = str2;
            if (strArr != null) {
                java.lang.System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            }
            this.sshCipherNames = strArr2;
        }

        public static com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher getInstance(java.lang.String str) {
            for (com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher sshCipher : values()) {
                for (java.lang.String str2 : sshCipher.sshCipherNames) {
                    if (str2.equalsIgnoreCase(str)) {
                        return sshCipher;
                    }
                }
            }
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.C("Unknown Cipher: ", str));
            return null;
        }

        public static com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher valueOf(java.lang.String str) {
            return (com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher) java.lang.Enum.valueOf(com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher.class, str);
        }

        public static com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher[] values() {
            return (com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher[]) $VALUES.clone();
        }

        public abstract com.trilead.ssh2.crypto.cipher.BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z);

        public int getBlockSize() {
            return this.blockSize;
        }

        public int getKeyLength() {
            return this.keyLength;
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass1 extends com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher {
            public /* synthetic */ AnonymousClass1(java.lang.String[] strArr) {
                this("DESEDE_CBC", 0, 24, 8, "des-ede3-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public com.trilead.ssh2.crypto.cipher.BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return com.trilead.ssh2.crypto.cipher.BlockCipherFactory.createCipher("3des-cbc", z, bArr, bArr2);
            }

            private AnonymousClass1(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass2 extends com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher {
            public /* synthetic */ AnonymousClass2(java.lang.String[] strArr) {
                this("DES_CBC", 1, 8, 8, "des-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public com.trilead.ssh2.crypto.cipher.BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                com.trilead.ssh2.crypto.cipher.DES des = new com.trilead.ssh2.crypto.cipher.DES();
                des.init(z, bArr);
                return new com.trilead.ssh2.crypto.cipher.CBCMode(des, bArr2, z);
            }

            private AnonymousClass2(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass3 extends com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher {
            public /* synthetic */ AnonymousClass3(java.lang.String[] strArr) {
                this("AES128_CBC", 2, 16, 16, "aes-128-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public com.trilead.ssh2.crypto.cipher.BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return com.trilead.ssh2.crypto.cipher.BlockCipherFactory.createCipher("aes128-cbc", z, bArr, bArr2);
            }

            private AnonymousClass3(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass4 extends com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher {
            public /* synthetic */ AnonymousClass4(java.lang.String[] strArr) {
                this("AES192_CBC", 3, 24, 16, "aes-192-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public com.trilead.ssh2.crypto.cipher.BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return com.trilead.ssh2.crypto.cipher.BlockCipherFactory.createCipher("aes192-cbc", z, bArr, bArr2);
            }

            private AnonymousClass4(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass5 extends com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher {
            public /* synthetic */ AnonymousClass5(java.lang.String[] strArr) {
                this("AES256_CBC", 4, 32, 16, "aes-256-cbc", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public com.trilead.ssh2.crypto.cipher.BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return com.trilead.ssh2.crypto.cipher.BlockCipherFactory.createCipher("aes256-cbc", z, bArr, bArr2);
            }

            private AnonymousClass5(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        /* JADX INFO: renamed from: com.trilead.ssh2.signature.OpenSshCertificateDecoder$SshCipher$6, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
        public enum AnonymousClass6 extends com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher {
            public /* synthetic */ AnonymousClass6(java.lang.String[] strArr) {
                this("AES256_CTR", 5, 32, 16, "aes-256-ctr", strArr);
            }

            @Override // com.trilead.ssh2.signature.OpenSshCertificateDecoder.SshCipher
            public com.trilead.ssh2.crypto.cipher.BlockCipher createBlockCipher(byte[] bArr, byte[] bArr2, boolean z) {
                return com.trilead.ssh2.crypto.cipher.BlockCipherFactory.createCipher("aes256-ctr", z, bArr, bArr2);
            }

            private AnonymousClass6(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String... strArr) {
                super(str, i, i2, i3, str2, strArr, 0);
            }
        }

        public /* synthetic */ SshCipher(java.lang.String str, int i, int i2, int i3, java.lang.String str2, java.lang.String[] strArr, int i4) {
            this(str, i, i2, i3, str2, strArr);
        }
    }

    @Override // com.trilead.ssh2.crypto.CertificateDecoder
    public java.security.KeyPair createKeyPair(com.trilead.ssh2.crypto.PEMStructure pEMStructure) {
        return null;
    }
}
