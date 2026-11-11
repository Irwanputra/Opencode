package com.trilead.ssh2.crypto.cipher;

import java.util.Vector;
import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BlockCipherFactory {
    public static Vector ciphers;

    public static class CipherEntry {
        public int blocksize;
        public String cipherClass;
        public int keysize;
        public String type;

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
        String a = Crypt.a(Crypt.xrc("\u001eggIg;\u001dc;Okl@coKa<LghAaf\u001b3=\u0019b<Og"));
        String a2 = Crypt.a(Crypt.xrc("H6nA49Jf:Hcl\u001e4f@knLjhOa9\u001dbfJkmIk9L1h\u00196j\u001daj\u001edhM6iH4<KehHkmNdo\u001e4<\u001d`<\u0019c;@ehNcnO6h\u001bb:AdiM49@dmKe;\u001ce>"));
        vector.addElement(new CipherEntry(a, 16, 32, a2));
        ciphers.addElement(new CipherEntry(Crypt.a(Crypt.xrc("\u001b1<H1oL1i\u001dj:\u001adhAa;K49Oe<\u001a`mH6lNe")), 16, 24, a2));
        ciphers.addElement(new CipherEntry(Crypt.a(Crypt.xrc("Md<\u001acm\u00194m\u00191f@diJb;\u0019bl\u001a4;Ie;Aag\u001df")), 16, 16, a2));
        Vector vector2 = ciphers;
        String a3 = Crypt.a(Crypt.xrc("N19\u001ajnL4iM3h\u001cbm\u001b7:M1;\u001a4jJg>\u00197g\u001ae"));
        String a4 = Crypt.a(Crypt.xrc("H6nA49Jf:Hcl\u001e4f@knLjhOa9\u001dbfJkmIk9@anAe9La>AkoHki@7kMg;\u001d4nOg:\u001dciIah\u001dkg\u001b0kJe>\u001d4<\u001c7kK1;\u001djkId=Kg9O6m"));
        vector2.addElement(new CipherEntry(a3, 8, 16, a4));
        ciphers.addElement(new CipherEntry(Crypt.a(Crypt.xrc("\u001cc=L4<\u001d79KckH7l\u001c3jN0>\u001ee:Hbm\u001a7gLd")), 16, 32, a2));
        ciphers.addElement(new CipherEntry(Crypt.a(Crypt.xrc("\u001db=JdoO0;\u001bg>\u001ea9AcoMkm\u001cbi\u001e0mIjh\u001e6")), 16, 24, a2));
        ciphers.addElement(new CipherEntry(Crypt.a(Crypt.xrc("Ndi@j9\u001bkn\u001bg:I6:\u001b0n\u001ee<J09\u001ce:\u00191h\u001a1")), 16, 16, a2));
        ciphers.addElement(new CipherEntry(Crypt.a(Crypt.xrc("\u001b1jKck@k>K`9\u001c`>Hc:@0<\u00190j\u0019`j\u001a0k\u001bb")), 8, 16, a4));
        Vector vector3 = ciphers;
        String a5 = Crypt.a(Crypt.xrc("\u001ajlI1oLj9K3;KgiL3m@d;\u001ad:I7>\u001a4kHk"));
        String a6 = Crypt.a(Crypt.xrc("H6nA49Jf:Hcl\u001e4f@knLjhOa9\u001dbfJkmIkg\u00193j\u0019blNe>Id=\u001c6f\u001ce>\u001d7=Od;\u001d3hL1mM1l\u001c1k\u001ec9L6>\u001e1mJ`jM`m\u001b0j\u001bbh\u001bk=Lji"));
        vector3.addElement(new CipherEntry(a5, 8, 24, a6));
        ciphers.addElement(new CipherEntry(Crypt.a(Crypt.xrc("Akf\u001eenJf>\u001e0g\u001d1k\u001b3=Lc=JgmN7<Ngm\u001cb")), 8, 24, a6));
    }

    public static void checkCipherList(String[] strArr) {
        for (String str : strArr) {
            getEntry(str);
        }
    }

    public static BlockCipher createCipher(String str, boolean z, byte[] bArr, byte[] bArr2) {
        String a = Crypt.a(Crypt.xrc("N0lIaf@fo\u001ajh\u0019f>\u001dg9\u001bf9K6jN1<\u001e0mO`iOfi\u001ccoIj9I4;I0>Lc9@09\u0019goK7k@j>\u001e"));
        try {
            BlockCipher blockCipher = (BlockCipher) Class.forName(getEntry(str).cipherClass).newInstance();
            if (str.endsWith(Crypt.a(Crypt.xrc("H`<\u001ekiH69Ocl\u0019gk\u001aciHefK0hAd;Hg<\u00196")))) {
                blockCipher.init(z, bArr);
                return new CBCMode(blockCipher, bArr2, z);
            }
            if (str.endsWith(Crypt.a(Crypt.xrc("Jj<O1<\u0019jj\u00196jIa=\u001e69Le9K6:\u001dcj\u001dchI0")))) {
                blockCipher.init(true, bArr);
                return new CTRMode(blockCipher, bArr2, z);
            }
            throw new IllegalArgumentException(a + str);
        } catch (Exception unused) {
            throw new IllegalArgumentException(C2098.m4205(a, str));
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
        throw new IllegalArgumentException(C2098.m4205(Crypt.a(Crypt.xrc("Idl\u001d6iOc>\u001d3>HjgLf;Oj<\u001belJk:Ij9K7gAghNahOd;J0>K3:@6o\u001ekh\u001e3lKdiOf:\u001d")), str));
    }

    public static int getKeySize(String str) {
        return getEntry(str).keysize;
    }
}
