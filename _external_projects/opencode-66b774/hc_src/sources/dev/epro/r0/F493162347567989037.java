package dev.epro.r0;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F493162347567989037 implements A8947685337014270457 {
    public static final byte[] f = new byte[0];
    public static final byte[] g = {0};
    public final RSAPublicKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final Provider e;

    public F493162347567989037(RSAPublicKey rSAPublicKey, V11865174435555805371 v11865174435555805371, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!G6547577305291411977.d(2)) {
            W4415201450379021245.c("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        M3250598633778217966.b(rSAPublicKey.getModulus().bitLength());
        M3250598633778217966.c(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = c(v11865174435555805371);
        this.c = bArr;
        this.d = bArr2;
        this.e = provider;
    }

    public static F493162347567989037 b(G5183794802785878636 g5183794802785878636, Provider provider) {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = g5183794802785878636.k;
        C5880096771922761272 c5880096771922761272 = g5183794802785878636.j;
        return new F493162347567989037((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c5880096771922761272.b)), c5880096771922761272.d, g5183794802785878636.l.b(), c5880096771922761272.c.equals(D14731132657808549702.r0) ? g : f, provider);
    }

    public static String c(V11865174435555805371 v11865174435555805371) {
        if (v11865174435555805371 == V11865174435555805371.b) {
            return "SHA256withRSA";
        }
        if (v11865174435555805371 == V11865174435555805371.c) {
            return "SHA384withRSA";
        }
        if (v11865174435555805371 == V11865174435555805371.d) {
            return "SHA512withRSA";
        }
        W4415201450379021245.c("unknown hash type");
        return null;
    }

    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) {
        boolean z;
        byte[] bArr3 = this.c;
        if (!Z12670897225348479586.b(bArr3, bArr)) {
            W4415201450379021245.c("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.e);
        signature.initVerify(this.a);
        signature.update(bArr2);
        byte[] bArr4 = this.d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            z = signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length));
        } catch (RuntimeException unused) {
            z = false;
        }
        if (z) {
            return;
        }
        W4415201450379021245.c("Invalid signature");
    }
}
