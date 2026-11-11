package org.jasypt.salt;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.jasypt.exceptions.EncryptionInitializationException;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RandomSaltGenerator implements SaltGenerator {
    public static final String DEFAULT_SECURE_RANDOM_ALGORITHM = "SHA1PRNG";
    private final SecureRandom random;

    public RandomSaltGenerator() {
        this(DEFAULT_SECURE_RANDOM_ALGORITHM);
    }

    public RandomSaltGenerator(String str) {
        try {
            this.random = SecureRandom.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new EncryptionInitializationException(e);
        }
    }

    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i) {
        byte[] bArr = new byte[i];
        synchronized (this.random) {
            this.random.nextBytes(bArr);
        }
        return bArr;
    }

    @Override // org.jasypt.salt.SaltGenerator
    public boolean includePlainSaltInEncryptionResults() {
        return true;
    }
}
