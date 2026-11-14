package com.trilead.ssh2.crypto.cipher;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.S10973172697741180971;
import java.util.Vector;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class BlockCipherFactory {
    static Vector ciphers;

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static class CipherEntry {
        int blocksize;
        String cipherClass;
        int keysize;
        String type;

        public CipherEntry(String str, int i, int i2, String str2) {
            this.type = str;
            this.blocksize = i;
            this.keysize = i2;
            this.cipherClass = str2;
        }
    }

    static {
        Vector vector = new Vector();
        ciphers = vector;
        vector.addElement(new CipherEntry("aes256-ctr", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes192-ctr", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes128-ctr", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("blowfish-ctr", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new CipherEntry("aes256-cbc", 16, 32, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes192-cbc", 16, 24, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("aes128-cbc", 16, 16, "com.trilead.ssh2.crypto.cipher.AES"));
        ciphers.addElement(new CipherEntry("blowfish-cbc", 8, 16, "com.trilead.ssh2.crypto.cipher.BlowFish"));
        ciphers.addElement(new CipherEntry("3des-ctr", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
        ciphers.addElement(new CipherEntry("3des-cbc", 8, 24, "com.trilead.ssh2.crypto.cipher.DESede"));
    }

    public static void checkCipherList(String[] strArr) {
        for (String str : strArr) {
            getEntry(str);
        }
    }

    public static BlockCipher createCipher(String str, boolean z, byte[] bArr, byte[] bArr2) {
        try {
            BlockCipher blockCipher = (BlockCipher) Class.forName(getEntry(str).cipherClass).newInstance();
            if (str.endsWith("-cbc")) {
                blockCipher.init(z, bArr);
                return new CBCMode(blockCipher, bArr2, z);
            }
            if (!str.endsWith("-ctr")) {
                throw new IllegalArgumentException("Cannot instantiate ".concat(str));
            }
            blockCipher.init(true, bArr);
            return new CTRMode(blockCipher, bArr2, z);
        } catch (Exception unused) {
            S10973172697741180971.j(G6547577305291411977.C("Cannot instantiate ", str));
            return null;
        }
    }

    public static int getBlockSize(String str) {
        return getEntry(str).blocksize;
    }

    public static String[] getDefaultCipherList() {
        String[] strArr = new String[ciphers.size()];
        for (int i = 0; i < ciphers.size(); i++) {
            strArr[i] = new String(((CipherEntry) ciphers.elementAt(i)).type);
        }
        return strArr;
    }

    private static CipherEntry getEntry(String str) {
        for (int i = 0; i < ciphers.size(); i++) {
            CipherEntry cipherEntry = (CipherEntry) ciphers.elementAt(i);
            if (cipherEntry.type.equals(str)) {
                return cipherEntry;
            }
        }
        S10973172697741180971.j(G6547577305291411977.C("Unkown algorithm ", str));
        return null;
    }

    public static int getKeySize(String str) {
        return getEntry(str).keysize;
    }
}
