package com.trilead.ssh2.crypto.dh;

import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import dev.epro.r0.A4620944990041811311;
import dev.epro.r0.S10973172697741180971;
import java.math.BigInteger;
import java.security.SecureRandom;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class DhGroupExchange {
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger k;
    private BigInteger p;
    private BigInteger x;

    public DhGroupExchange(BigInteger bigInteger, BigInteger bigInteger2) {
        this.p = bigInteger;
        this.g = bigInteger2;
    }

    public byte[] calculateH(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, A4620944990041811311 a4620944990041811311) {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(str);
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
        a4620944990041811311.getClass();
        hashForSSH2Types.updateUINT32(1024);
        hashForSSH2Types.updateUINT32(2048);
        hashForSSH2Types.updateUINT32(4096);
        hashForSSH2Types.updateBigInt(this.p);
        hashForSSH2Types.updateBigInt(this.g);
        hashForSSH2Types.updateBigInt(this.e);
        hashForSSH2Types.updateBigInt(this.f);
        hashForSSH2Types.updateBigInt(this.k);
        return hashForSSH2Types.getDigest();
    }

    public BigInteger getE() {
        BigInteger bigInteger = this.e;
        if (bigInteger != null) {
            return bigInteger;
        }
        S10973172697741180971.m("Not initialized!");
        return null;
    }

    public BigInteger getK() {
        BigInteger bigInteger = this.k;
        if (bigInteger != null) {
            return bigInteger;
        }
        S10973172697741180971.m("Shared secret not yet known, need f first!");
        return null;
    }

    public void init(SecureRandom secureRandom) {
        this.k = null;
        BigInteger bigInteger = new BigInteger(this.p.bitLength() - 1, secureRandom);
        this.x = bigInteger;
        this.e = this.g.modPow(bigInteger, this.p);
    }

    public void setF(BigInteger bigInteger) {
        if (this.e == null) {
            S10973172697741180971.m("Not initialized!");
        } else if (BigInteger.valueOf(0L).compareTo(bigInteger) >= 0 || this.p.compareTo(bigInteger) <= 0) {
            S10973172697741180971.j("Invalid f specified!");
        } else {
            this.f = bigInteger;
            this.k = bigInteger.modPow(this.x, this.p);
        }
    }
}
