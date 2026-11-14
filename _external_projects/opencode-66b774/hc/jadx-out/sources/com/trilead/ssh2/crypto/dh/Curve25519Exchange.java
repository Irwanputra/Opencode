package com.trilead.ssh2.crypto.dh;

import dev.epro.r0.D6215562826263076784;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.O16195544586002825960;
import dev.epro.r0.Q11088980322693754445;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class Curve25519Exchange extends GenericDhExchange {
    public static final String ALT_NAME = "curve25519-sha256@libssh.org";
    public static final int KEY_SIZE = 32;
    public static final String NAME = "curve25519-sha256";
    private byte[] clientPrivate;
    private byte[] clientPublic;
    private byte[] serverPublic;

    public Curve25519Exchange(byte[] bArr) {
        if (bArr.length != 32) {
            throw new AssertionError("secret must be key size");
        }
        this.clientPrivate = (byte[]) bArr.clone();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getE() {
        return (byte[]) this.clientPublic.clone();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public String getHashAlgo() {
        return "SHA-256";
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public byte[] getServerE() {
        return (byte[]) this.serverPublic.clone();
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void init(String str) throws IOException {
        if (!NAME.equals(str) && !ALT_NAME.equals(str)) {
            Q11088980322693754445.h(G6547577305291411977.C("Invalid name ", str));
            return;
        }
        byte[] bArrA = O16195544586002825960.a(32);
        bArrA[0] = (byte) (bArrA[0] | 7);
        byte b = (byte) (bArrA[31] & 63);
        bArrA[31] = b;
        bArrA[31] = (byte) (b | 128);
        this.clientPrivate = bArrA;
        try {
            if (bArrA.length != 32) {
                throw new InvalidKeyException("Private key must have 32 bytes.");
            }
            byte[] bArr = new byte[32];
            bArr[0] = 9;
            this.clientPublic = D6215562826263076784.j(bArrA, bArr);
        } catch (InvalidKeyException e) {
            throw new IOException(e);
        }
    }

    @Override // com.trilead.ssh2.crypto.dh.GenericDhExchange
    public void setF(byte[] bArr) throws IOException {
        if (bArr.length != 32) {
            Q11088980322693754445.h(G6547577305291411977.o(bArr.length, "Server sent invalid key length ", " (expected 32)"));
            return;
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        this.serverPublic = bArr2;
        try {
            byte[] bArrJ = D6215562826263076784.j(this.clientPrivate, bArr2);
            int i = 0;
            for (int i2 = 0; i2 < 32; i2++) {
                i |= bArrJ[i2];
            }
            if (i == 0) {
                throw new IOException("Invalid key computed; all zeroes");
            }
            this.sharedSecret = new BigInteger(1, bArrJ);
        } catch (InvalidKeyException e) {
            throw new IOException(e);
        }
    }

    public Curve25519Exchange() {
    }
}
