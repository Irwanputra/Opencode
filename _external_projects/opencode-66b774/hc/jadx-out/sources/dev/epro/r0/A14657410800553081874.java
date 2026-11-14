package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A14657410800553081874 implements L15260231637027815334 {
    public final T13746734976263530825 a;
    public final String b;
    public final SecretKeySpec c;
    public final byte d;

    public A14657410800553081874(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        T13746734976263530825 t13746734976263530825 = new T13746734976263530825(this);
        this.a = t13746734976263530825;
        if (!G6547577305291411977.d(2)) {
            W4415201450379021245.c("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.b = str;
        this.c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                this.d = (byte) 20;
                break;
            case "HMACSHA224":
                this.d = (byte) 28;
                break;
            case "HMACSHA256":
                this.d = (byte) 32;
                break;
            case "HMACSHA384":
                this.d = (byte) 48;
                break;
            case "HMACSHA512":
                this.d = (byte) 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        t13746734976263530825.get();
    }
}
