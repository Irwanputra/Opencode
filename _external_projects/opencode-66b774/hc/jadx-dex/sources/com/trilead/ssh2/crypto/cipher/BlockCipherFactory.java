package com.trilead.ssh2.crypto.cipher;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class BlockCipherFactory {
    static java.util.Vector ciphers;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class CipherEntry {
        int blocksize;
        java.lang.String cipherClass;
        int keysize;
        java.lang.String type;

        public CipherEntry(java.lang.String str, int i, int i2, java.lang.String str2) {
            this.type = str;
            this.blocksize = i;
            this.keysize = i2;
            this.cipherClass = str2;
        }
    }

    static {
        java.util.Vector vector = new java.util.Vector();
        ciphers = vector;
        vector.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("aes256-ctr", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("aes192-ctr", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("aes128-ctr", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("blowfish-ctr", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("aes256-cbc", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("aes192-cbc", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("aes128-cbc", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("blowfish-cbc", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("3des-ctr", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
        ciphers.addElement(new com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry("3des-cbc", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
    }

    public static void checkCipherList(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            getEntry(str);
        }
    }

    public static com.trilead.ssh2.crypto.cipher.BlockCipher createCipher(java.lang.String str, boolean z, byte[] bArr, byte[] bArr2) {
        try {
            com.trilead.ssh2.crypto.cipher.BlockCipher blockCipher = (com.trilead.ssh2.crypto.cipher.BlockCipher) java.lang.Class.forName(getEntry(str).cipherClass).newInstance();
            if (str.endsWith("-cbc")) {
                blockCipher.init(z, bArr);
                return new com.trilead.ssh2.crypto.cipher.CBCMode(blockCipher, bArr2, z);
            }
            if (!str.endsWith("-ctr")) {
                throw new java.lang.IllegalArgumentException("Cannot instantiate ".concat(str));
            }
            blockCipher.init(true, bArr);
            return new com.trilead.ssh2.crypto.cipher.CTRMode(blockCipher, bArr2, z);
        } catch (java.lang.Exception unused) {
            dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.C("Cannot instantiate ", str));
            return null;
        }
    }

    public static int getBlockSize(java.lang.String str) {
        return getEntry(str).blocksize;
    }

    public static java.lang.String[] getDefaultCipherList() {
        java.lang.String[] strArr = new java.lang.String[ciphers.size()];
        for (int i = 0; i < ciphers.size(); i++) {
            strArr[i] = new java.lang.String(((com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry) ciphers.elementAt(i)).type);
        }
        return strArr;
    }

    private static com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry getEntry(java.lang.String str) {
        for (int i = 0; i < ciphers.size(); i++) {
            com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry cipherEntry = (com.trilead.ssh2.crypto.cipher.BlockCipherFactory.CipherEntry) ciphers.elementAt(i);
            if (cipherEntry.type.equals(str)) {
                return cipherEntry;
            }
        }
        dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.C("Unkown algorithm ", str));
        return null;
    }

    public static int getKeySize(java.lang.String str) {
        return getEntry(str).keysize;
    }
}
