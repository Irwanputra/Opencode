package dev.epro.r0;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O6180150081584389963 implements A8947685337014270457 {
    public static final byte[] f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    public final /* synthetic */ byte a = 1;
    public final byte[] b;
    public final byte[] c;
    public final PublicKey d;
    public final Serializable e;

    public O6180150081584389963(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (!G6547577305291411977.c(1)) {
            W4415201450379021245.c("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            S10973172697741180971.j("Given public key's length is not 32.");
            throw null;
        }
        this.d = KeyFactory.getInstance(EdDSANamedCurveTable.ED_25519, provider).generatePublic(new X509EncodedKeySpec(Z1953481206310471956.B(f, bArr)));
        this.b = bArr2;
        this.c = bArr3;
        this.e = provider;
    }

    public static O6180150081584389963 b(E17338338377881930138 e17338338377881930138) {
        Provider U = C775827382551829194.U();
        if (U == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (G6547577305291411977.c(1)) {
            return new O6180150081584389963(e17338338377881930138.k.b(), e17338338377881930138.l.b(), e17338338377881930138.j.a != D14731132657808549702.L ? new byte[0] : new byte[]{0}, U);
        }
        W4415201450379021245.c("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) {
        boolean z;
        byte b = this.a;
        byte[] bArr3 = this.b;
        switch (b) {
            case 0:
                if (bArr.length != bArr3.length + 64) {
                    W4415201450379021245.c("Invalid signature length: 64");
                    break;
                } else if (!Z12670897225348479586.b(bArr3, bArr)) {
                    W4415201450379021245.c("Invalid signature (output prefix mismatch)");
                    break;
                } else {
                    Signature signature = Signature.getInstance(EdDSANamedCurveTable.ED_25519, (Provider) this.e);
                    signature.initVerify(this.d);
                    signature.update(bArr2);
                    signature.update(this.c);
                    try {
                        z = signature.verify(bArr, bArr3.length, 64);
                    } catch (RuntimeException unused) {
                        z = false;
                    }
                    if (!z) {
                        W4415201450379021245.c("Signature check failed.");
                        break;
                    }
                }
                break;
            default:
                if (bArr3.length != 0) {
                    if (!Z12670897225348479586.b(bArr3, bArr)) {
                        W4415201450379021245.c("Invalid signature (output prefix mismatch)");
                        break;
                    } else {
                        c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
                        break;
                    }
                } else {
                    c(bArr, bArr2);
                    break;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) {
        byte[] p;
        S14062146164092607729 s14062146164092607729 = (S14062146164092607729) this.e;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            W4415201450379021245.c("invalid signature's length");
            return;
        }
        BigInteger A = G16660188620551127941.A(bArr);
        if (A.compareTo(modulus) >= 0) {
            W4415201450379021245.c("signature out of range");
            return;
        }
        byte[] M = G16660188620551127941.M(A.modPow(publicExponent, modulus), bitLength);
        M3250598633778217966.d(s14062146164092607729);
        MessageDigest messageDigest = (MessageDigest) W8357658991043002609.e.a.a(E7125458317232359087.r(s14062146164092607729));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = s14062146164092607729.ordinal();
        int i = 2;
        if (ordinal == 2) {
            p = B11964701839924937722.p("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            p = B11964701839924937722.p("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(String.valueOf(s14062146164092607729)));
            }
            p = B11964701839924937722.p("3051300d060960864801650304020305000440");
        }
        int length = p.length + digest.length;
        if (bitLength < length + 11) {
            W4415201450379021245.c("intended encoded message length too short");
            return;
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i2 = 0;
        while (i2 < (bitLength - length) - 3) {
            bArr4[i] = -1;
            i2++;
            i++;
        }
        int i3 = i + 1;
        bArr4[i] = 0;
        System.arraycopy(p, 0, bArr4, i3, p.length);
        System.arraycopy(digest, 0, bArr4, i3 + p.length, digest.length);
        if (MessageDigest.isEqual(M, bArr4)) {
            return;
        }
        W4415201450379021245.c("invalid signature");
    }

    public O6180150081584389963(RSAPublicKey rSAPublicKey, S14062146164092607729 s14062146164092607729, byte[] bArr, byte[] bArr2) {
        if (!I7816358627352036208.a()) {
            M3250598633778217966.d(s14062146164092607729);
            M3250598633778217966.b(rSAPublicKey.getModulus().bitLength());
            M3250598633778217966.c(rSAPublicKey.getPublicExponent());
            this.d = rSAPublicKey;
            this.e = s14062146164092607729;
            this.b = bArr;
            this.c = bArr2;
            return;
        }
        W4415201450379021245.c("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        throw null;
    }
}
