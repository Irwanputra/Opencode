package com.trilead.ssh2.crypto.dh;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class Curve25519Exchange extends com.trilead.ssh2.crypto.dh.GenericDhExchange {
    public static final java.lang.String ALT_NAME = "curve25519-sha256@libssh.org";
    public static final int KEY_SIZE = 32;
    public static final java.lang.String NAME = "curve25519-sha256";
    private byte[] clientPrivate;
    private byte[] clientPublic;
    private byte[] serverPublic;

    public Curve25519Exchange(byte[] bArr) {
        if (bArr.length != 32) {
            throw new java.lang.AssertionError("secret must be key size");
        }
        this.clientPrivate = (byte[]) bArr.clone();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getE() {
        return (byte[]) this.clientPublic.clone();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public java.lang.String getHashAlgo() {
        return "SHA-256";
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getServerE() {
        return (byte[]) this.serverPublic.clone();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void init(java.lang.String str) throws java.io.IOException {
        if (!NAME.equals(str) && !ALT_NAME.equals(str)) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.C("Invalid name ", str));
            return;
        }
        byte[] bArrA = dev.epro.r0.O16195544586002825960.a(32);
        bArrA[0] = (byte) (bArrA[0] | 7);
        byte b = (byte) (bArrA[31] & 63);
        bArrA[31] = b;
        bArrA[31] = (byte) (b | 128);
        this.clientPrivate = bArrA;
        try {
            if (bArrA.length != 32) {
                throw new java.security.InvalidKeyException("Private key must have 32 bytes.");
            }
            byte[] bArr = new byte[32];
            bArr[0] = 9;
            this.clientPublic = dev.epro.r0.D6215562826263076784.j(bArrA, bArr);
        } catch (java.security.InvalidKeyException e) {
            throw new java.io.IOException(e);
        }
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void setF(byte[] bArr) throws java.io.IOException {
        if (bArr.length != 32) {
            dev.epro.r0.Q11088980322693754445.h(dev.epro.r0.G6547577305291411977.o(bArr.length, "Server sent invalid key length ", " (expected 32)"));
            return;
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        this.serverPublic = bArr2;
        try {
            byte[] bArrJ = dev.epro.r0.D6215562826263076784.j(this.clientPrivate, bArr2);
            int i = 0;
            for (int i2 = 0; i2 < 32; i2++) {
                i |= bArrJ[i2];
            }
            if (i == 0) {
                throw new java.io.IOException("Invalid key computed; all zeroes");
            }
            this.sharedSecret = new java.math.BigInteger(1, bArrJ);
        } catch (java.security.InvalidKeyException e) {
            throw new java.io.IOException(e);
        }
    }

    public Curve25519Exchange() {
    }
}
