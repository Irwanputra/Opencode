package com.trilead.ssh2.crypto.dh;

import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.Z17301329922361444493;
import java.math.BigInteger;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class GenericDhExchange {
    private static final Z17301329922361444493 log = Z17301329922361444493.a(GenericDhExchange.class);
    BigInteger sharedSecret;

    public static GenericDhExchange getInstance(String str) {
        return (Curve25519Exchange.NAME.equals(str) || Curve25519Exchange.ALT_NAME.equals(str)) ? new Curve25519Exchange() : str.startsWith("ecdh-sha2-") ? new EcDhExchange() : new DhExchange();
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(getHashAlgo());
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

    public abstract String getHashAlgo();

    public BigInteger getK() {
        BigInteger bigInteger = this.sharedSecret;
        if (bigInteger != null) {
            return bigInteger;
        }
        S10973172697741180971.m("Shared secret not yet known, need f first!");
        return null;
    }

    public abstract byte[] getServerE();

    public abstract void init(String str);

    public abstract void setF(byte[] bArr);
}
