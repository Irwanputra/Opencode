package net.i2p.crypto.eddsa.spec;

import dev.epro.r0.S10973172697741180971;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.math.GroupElement;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class EdDSAPrivateKeySpec implements KeySpec {
    private final GroupElement A;
    private final byte[] a;
    private final byte[] h;
    private final byte[] seed;
    private final EdDSAParameterSpec spec;

    public EdDSAPrivateKeySpec(byte[] bArr, EdDSAParameterSpec edDSAParameterSpec) {
        if (bArr.length != edDSAParameterSpec.getCurve().getField().getb() / 8) {
            S10973172697741180971.j("seed length is wrong");
            throw null;
        }
        this.spec = edDSAParameterSpec;
        this.seed = bArr;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(edDSAParameterSpec.getHashAlgorithm());
            int bVar = edDSAParameterSpec.getCurve().getField().getb();
            byte[] bArrDigest = messageDigest.digest(bArr);
            this.h = bArrDigest;
            bArrDigest[0] = (byte) (bArrDigest[0] & 248);
            int i = (bVar / 8) - 1;
            bArrDigest[i] = (byte) (bArrDigest[i] & 63);
            int i2 = (bVar / 8) - 1;
            bArrDigest[i2] = (byte) (bArrDigest[i2] | 64);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDigest, 0, bVar / 8);
            this.a = bArrCopyOfRange;
            this.A = edDSAParameterSpec.getB().scalarMultiply(bArrCopyOfRange);
        } catch (NoSuchAlgorithmException unused) {
            S10973172697741180971.j("Unsupported hash algorithm");
            throw null;
        }
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

    public EdDSAPrivateKeySpec(EdDSAParameterSpec edDSAParameterSpec, byte[] bArr) {
        if (bArr.length == edDSAParameterSpec.getCurve().getField().getb() / 4) {
            this.seed = null;
            this.h = bArr;
            this.spec = edDSAParameterSpec;
            int bVar = edDSAParameterSpec.getCurve().getField().getb();
            bArr[0] = (byte) (bArr[0] & 248);
            int i = bVar / 8;
            int i2 = i - 1;
            byte b = (byte) (bArr[i2] & 63);
            bArr[i2] = b;
            bArr[i2] = (byte) (b | 64);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.a = bArrCopyOfRange;
            this.A = edDSAParameterSpec.getB().scalarMultiply(bArrCopyOfRange);
            return;
        }
        S10973172697741180971.j("hash length is wrong");
        throw null;
    }

    public EdDSAPrivateKeySpec(byte[] bArr, byte[] bArr2, byte[] bArr3, GroupElement groupElement, EdDSAParameterSpec edDSAParameterSpec) {
        this.seed = bArr;
        this.h = bArr2;
        this.a = bArr3;
        this.A = groupElement;
        this.spec = edDSAParameterSpec;
    }
}
