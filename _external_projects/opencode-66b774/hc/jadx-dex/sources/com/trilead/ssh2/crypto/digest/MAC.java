package com.trilead.ssh2.crypto.digest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class MAC {

    @java.lang.Deprecated
    com.trilead.ssh2.crypto.digest.Digest mac;

    @java.lang.Deprecated
    int size;

    public MAC(java.lang.String str, byte[] bArr) {
        com.trilead.ssh2.crypto.digest.HMAC hmac;
        if (str.equals("hmac-sha1")) {
            hmac = new com.trilead.ssh2.crypto.digest.HMAC(new com.trilead.ssh2.crypto.digest.SHA1(), bArr, 20);
            this.mac = hmac;
        } else if (str.equals("hmac-sha1-96")) {
            hmac = new com.trilead.ssh2.crypto.digest.HMAC(new com.trilead.ssh2.crypto.digest.SHA1(), bArr, 12);
            this.mac = hmac;
        } else if (str.equals("hmac-md5")) {
            hmac = new com.trilead.ssh2.crypto.digest.HMAC(new com.trilead.ssh2.crypto.digest.MD5(), bArr, 16);
            this.mac = hmac;
        } else {
            if (!str.equals("hmac-md5-96")) {
                return;
            }
            hmac = new com.trilead.ssh2.crypto.digest.HMAC(new com.trilead.ssh2.crypto.digest.MD5(), bArr, 12);
            this.mac = hmac;
        }
        this.size = hmac.getDigestLength();
    }

    @java.lang.Deprecated
    public static void checkMacList(java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            getKeyLen(str);
        }
    }

    @java.lang.Deprecated
    public static int getKeyLen(java.lang.String str) {
        if (str.equals("hmac-sha1") || str.equals("hmac-sha1-96")) {
            return 20;
        }
        if (str.equals("hmac-md5") || str.equals("hmac-md5-96")) {
            return 16;
        }
        dev.epro.r0.S10973172697741180971.j("Unkown algorithm ".concat(str));
        return 0;
    }

    @java.lang.Deprecated
    public static java.lang.String[] getMacList() {
        return new java.lang.String[]{"hmac-sha1-96", "hmac-sha1", "hmac-md5-96", "hmac-md5"};
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
