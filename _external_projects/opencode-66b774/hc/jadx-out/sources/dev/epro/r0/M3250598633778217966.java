package dev.epro.r0;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M3250598633778217966 {
    static {
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    }

    public static void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }

    public static void b(int i) {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (I7816358627352036208.a() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public static void c(BigInteger bigInteger) {
        if (!bigInteger.testBit(0)) {
            W4415201450379021245.c("Public exponent must be odd.");
        } else {
            if (bigInteger.compareTo(BigInteger.valueOf(65536L)) > 0) {
                return;
            }
            W4415201450379021245.c("Public exponent must be greater than 65536.");
        }
    }

    public static void d(S14062146164092607729 s14062146164092607729) {
        int iOrdinal = s14062146164092607729.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException(G6547577305291411977.C("Unsupported hash: ", s14062146164092607729.name()));
        }
    }
}
