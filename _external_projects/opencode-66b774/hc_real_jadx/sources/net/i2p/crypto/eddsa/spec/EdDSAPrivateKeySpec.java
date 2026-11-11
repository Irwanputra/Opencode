package net.i2p.crypto.eddsa.spec;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.GroupElement;

/* loaded from: /tmp/opencode/hc_real.dex */
public class EdDSAPrivateKeySpec implements KeySpec {
    private final GroupElement A;
    private final byte[] a;
    private final byte[] h;
    private final byte[] seed;
    private final EdDSAParameterSpec spec;

    public EdDSAPrivateKeySpec(EdDSAParameterSpec edDSAParameterSpec, byte[] bArr) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 4) {
            throw new IllegalArgumentException("hash length is wrong");
        }
        this.seed = null;
        this.h = bArr;
        this.spec = edDSAParameterSpec;
        int bVar = edDSAParameterSpec.getCurve().getField().getb();
        bArr[0] = (byte) (bArr[0] & 248);
        int i = bVar / 8;
        int i2 = i - 1;
        bArr[i2] = (byte) (bArr[i2] & 63);
        bArr[i2] = (byte) (bArr[i2] | 64);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.a = copyOfRange;
        this.A = edDSAParameterSpec.getB().scalarMultiply(copyOfRange);
    }

    public EdDSAPrivateKeySpec(byte[] bArr, EdDSAParameterSpec edDSAParameterSpec) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 8) {
            throw new IllegalArgumentException("seed length is wrong");
        }
        this.spec = edDSAParameterSpec;
        this.seed = bArr;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(edDSAParameterSpec.getHashAlgorithm());
            int bVar = edDSAParameterSpec.getCurve().getField().getb();
            byte[] digest = messageDigest.digest(bArr);
            this.h = digest;
            digest[0] = (byte) (digest[0] & 248);
            int i = (bVar / 8) - 1;
            digest[i] = (byte) (digest[i] & 63);
            int i2 = (bVar / 8) - 1;
            digest[i2] = (byte) (digest[i2] | 64);
            byte[] copyOfRange = Arrays.copyOfRange(digest, 0, bVar / 8);
            this.a = copyOfRange;
            this.A = edDSAParameterSpec.getB().scalarMultiply(copyOfRange);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalArgumentException("Unsupported hash algorithm");
        }
    }

    public EdDSAPrivateKeySpec(byte[] bArr, byte[] bArr2, byte[] bArr3, GroupElement groupElement, EdDSAParameterSpec edDSAParameterSpec) {
        this.seed = bArr;
        this.h = bArr2;
        this.a = bArr3;
        this.A = groupElement;
        this.spec = edDSAParameterSpec;
    }

    public GroupElement getA() {
        return this.A;
    }

    public byte[] getH() {
        return this.h;
    }

    public EdDSAParameterSpec getParams() {
        return this.spec;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public byte[] geta() {
        return this.a;
    }
}
