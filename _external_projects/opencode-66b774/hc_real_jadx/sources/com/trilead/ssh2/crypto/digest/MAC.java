package com.trilead.ssh2.crypto.digest;

import p131.p155.p156.p157.C2098;
import xyz.easypro.ecrypt.utils.Crypt;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MAC {

    @Deprecated
    public Digest mac;

    @Deprecated
    public int size;

    public MAC(String str, byte[] bArr) {
        HMAC hmac;
        if (str.equals(Crypt.a(Crypt.xrc("L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194")))) {
            hmac = new HMAC(new SHA1(), bArr, 20);
        } else if (str.equals(Crypt.a(Crypt.xrc("\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf")))) {
            hmac = new HMAC(new SHA1(), bArr, 12);
        } else if (str.equals(Crypt.a(Crypt.xrc("\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de")))) {
            hmac = new HMAC(new MD5(), bArr, 16);
        } else if (!str.equals(Crypt.a(Crypt.xrc("M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf")))) {
            return;
        } else {
            hmac = new HMAC(new MD5(), bArr, 12);
        }
        this.mac = hmac;
        this.size = this.mac.getDigestLength();
    }

    @Deprecated
    public static void checkMacList(String[] strArr) {
        for (String str : strArr) {
            getKeyLen(str);
        }
    }

    @Deprecated
    public static int getKeyLen(String str) {
        if (str.equals(Crypt.a(Crypt.xrc("L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194"))) || str.equals(Crypt.a(Crypt.xrc("\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf")))) {
            return 20;
        }
        if (str.equals(Crypt.a(Crypt.xrc("\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de"))) || str.equals(Crypt.a(Crypt.xrc("M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf")))) {
            return 16;
        }
        throw new IllegalArgumentException(C2098.m4205(Crypt.a(Crypt.xrc("Idl\u001d6iOc>\u001d3>HjgLf;Oj<\u001belJk:Ij9K7gAghNahOd;J0>K3:@6o\u001ekh\u001e3lKdiOf:\u001d")), str));
    }

    @Deprecated
    public static String[] getMacList() {
        return new String[]{Crypt.a(Crypt.xrc("\u001de>N`gHgi\u001c7oMgl\u001ee>M3l\u001d7g\u001aciOgkIf")), Crypt.a(Crypt.xrc("L7n@gn\u001d1iLgi\u001d3>\u001ebfOc9Nd9\u001dfiLj=\u00194")), Crypt.a(Crypt.xrc("M0=\u0019agNg;J3>\u001bdhOal\u001acl\u00193f\u001cgg\u001e`:Lf")), Crypt.a(Crypt.xrc("\u001ckf\u001ca=\u001b1<OfnA0f\u001adgOflJ3mA1=L0=\u001de"))};
    }

    public void getMac(byte[] bArr, int i) {
        this.mac.digest(bArr, i);
    }

    public void initMac(int i) {
        this.mac.reset();
        this.mac.update((byte) (i >> 24));
        this.mac.update((byte) (i >> 16));
        this.mac.update((byte) (i >> 8));
        this.mac.update((byte) i);
    }

    public int size() {
        return this.size;
    }

    public void update(byte[] bArr, int i, int i2) {
        this.mac.update(bArr, i, i2);
    }
}
