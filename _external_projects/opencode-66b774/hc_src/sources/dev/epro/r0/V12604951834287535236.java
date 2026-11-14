package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V12604951834287535236 implements W5605385477019102368 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final byte[] i = {1, 2, 3};
    public final RSAPrivateCrtKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final A8947685337014270457 e;
    public final Provider f;

    public V12604951834287535236(RSAPrivateCrtKey rSAPrivateCrtKey, V11865174435555805371 v11865174435555805371, byte[] bArr, byte[] bArr2, A8947685337014270457 a8947685337014270457, Provider provider) {
        if (!G6547577305291411977.d(2)) {
            W4415201450379021245.c("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (v11865174435555805371 != V11865174435555805371.b && v11865174435555805371 != V11865174435555805371.c && v11865174435555805371 != V11865174435555805371.d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(v11865174435555805371)));
        }
        M3250598633778217966.b(rSAPrivateCrtKey.getModulus().bitLength());
        M3250598633778217966.c(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        this.b = F493162347567989037.c(v11865174435555805371);
        this.c = bArr;
        this.d = bArr2;
        this.e = a8947685337014270457;
        this.f = provider;
    }
}
