package com.trilead.ssh2.crypto.digest;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class HashForSSH2Types {

    @Deprecated
    Digest md;
    private final Digest messageDigest;

    public HashForSSH2Types(String str) {
        this(new JreMessageDigestWrapper(createMessageDigest(str)));
    }

    private static MessageDigest createMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("Could not get Message digest instance", e);
        }
    }

    public byte[] getDigest() {
        byte[] bArr = new byte[this.messageDigest.getDigestLength()];
        getDigest(bArr);
        return bArr;
    }

    public int getDigestLength() {
        return this.messageDigest.getDigestLength();
    }

    public void reset() {
        this.messageDigest.reset();
    }

    public void updateBigInt(BigInteger bigInteger) {
        updateByteString(bigInteger.toByteArray());
    }

    public void updateByte(byte b) {
        this.messageDigest.update(new byte[]{b});
    }

    public void updateByteString(byte[] bArr) {
        updateUINT32(bArr.length);
        updateBytes(bArr);
    }

    public void updateBytes(byte[] bArr) {
        this.messageDigest.update(bArr);
    }

    public void updateUINT32(int i) {
        this.messageDigest.update((byte) (i >> 24));
        this.messageDigest.update((byte) (i >> 16));
        this.messageDigest.update((byte) (i >> 8));
        this.messageDigest.update((byte) i);
    }

    public void getDigest(byte[] bArr) {
        getDigest(bArr, 0);
    }

    public HashForSSH2Types(Digest digest) {
        this.md = digest;
        this.messageDigest = digest;
    }

    public void getDigest(byte[] bArr, int i) {
        this.messageDigest.digest(bArr, i);
    }
}
