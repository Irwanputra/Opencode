package com.trilead.ssh2.crypto.digest;

import dev.epro.r0.S10973172697741180971;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class MAC {

    @Deprecated
    Digest mac;

    @Deprecated
    int size;

    public MAC(String str, byte[] bArr) {
        HMAC hmac;
        if (str.equals("hmac-sha1")) {
            hmac = new HMAC(new SHA1(), bArr, 20);
            this.mac = hmac;
        } else if (str.equals("hmac-sha1-96")) {
            hmac = new HMAC(new SHA1(), bArr, 12);
            this.mac = hmac;
        } else if (str.equals("hmac-md5")) {
            hmac = new HMAC(new MD5(), bArr, 16);
            this.mac = hmac;
        } else {
            if (!str.equals("hmac-md5-96")) {
                return;
            }
            hmac = new HMAC(new MD5(), bArr, 12);
            this.mac = hmac;
        }
        this.size = hmac.getDigestLength();
    }

    @Deprecated
    public static void checkMacList(String[] strArr) {
        for (String str : strArr) {
            getKeyLen(str);
        }
    }

    @Deprecated
    public static int getKeyLen(String str) {
        if (str.equals("hmac-sha1") || str.equals("hmac-sha1-96")) {
            return 20;
        }
        if (str.equals("hmac-md5") || str.equals("hmac-md5-96")) {
            return 16;
        }
        S10973172697741180971.j("Unkown algorithm ".concat(str));
        return 0;
    }

    @Deprecated
    public static String[] getMacList() {
        return new String[]{"hmac-sha1-96", "hmac-sha1", "hmac-md5-96", "hmac-md5"};
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
