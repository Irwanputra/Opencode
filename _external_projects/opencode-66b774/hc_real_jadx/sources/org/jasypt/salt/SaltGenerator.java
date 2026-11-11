package org.jasypt.salt;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface SaltGenerator {
    byte[] generateSalt(int i);

    boolean includePlainSaltInEncryptionResults();
}
