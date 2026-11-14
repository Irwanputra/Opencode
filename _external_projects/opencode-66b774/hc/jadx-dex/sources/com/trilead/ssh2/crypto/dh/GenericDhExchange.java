package com.trilead.ssh2.crypto.dh;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class GenericDhExchange {
    private static final dev.epro.r0.Z17301329922361444493 log = dev.epro.r0.Z17301329922361444493.a(com.trilead.ssh2.crypto.dh.GenericDhExchange.class);
    java.math.BigInteger sharedSecret;

    public static com.trilead.ssh2.crypto.dh.GenericDhExchange getInstance(java.lang.String str) {
        return (com.trilead.ssh2.crypto.dh.Curve25519Exchange.NAME.equals(str) || com.trilead.ssh2.crypto.dh.Curve25519Exchange.ALT_NAME.equals(str)) ? new com.trilead.ssh2.crypto.dh.Curve25519Exchange() : str.startsWith("ecdh-sha2-") ? new com.trilead.ssh2.crypto.dh.EcDhExchange() : new com.trilead.ssh2.crypto.dh.DhExchange();
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.trilead.ssh2.crypto.digest.HashForSSH2Types hashForSSH2Types = new com.trilead.ssh2.crypto.digest.HashForSSH2Types(getHashAlgo());
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
        hashForSSH2Types.updateByteString(getE());
        hashForSSH2Types.updateByteString(getServerE());
        hashForSSH2Types.updateBigInt(this.sharedSecret);
        return hashForSSH2Types.getDigest();
    }

    public abstract byte[] getE();

    public abstract java.lang.String getHashAlgo();

    public java.math.BigInteger getK() {
        java.math.BigInteger bigInteger = this.sharedSecret;
        if (bigInteger != null) {
            return bigInteger;
        }
        dev.epro.r0.S10973172697741180971.m("Shared secret not yet known, need f first!");
        return null;
    }

    public abstract byte[] getServerE();

    public abstract void init(java.lang.String str);

    public abstract void setF(byte[] bArr);
}
