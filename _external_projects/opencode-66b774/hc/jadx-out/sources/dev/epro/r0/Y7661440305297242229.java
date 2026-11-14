package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y7661440305297242229 {
    public static Y7661440305297242229 a(D900858212461245428 d900858212461245428, Provider provider) throws GeneralSecurityException {
        Y7661440305297242229 y7661440305297242229 = new Y7661440305297242229();
        if (!G6547577305291411977.c(1)) {
            W4415201450379021245.c("Cannot use AES-CMAC in FIPS-mode.");
            return null;
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            d900858212461245428.l.b();
            new SecretKeySpec(((J4250663911053539605) d900858212461245428.k.b).b(), "AES");
            return y7661440305297242229;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
