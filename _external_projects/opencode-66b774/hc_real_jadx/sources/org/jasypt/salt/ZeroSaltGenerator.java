package org.jasypt.salt;

import java.util.Arrays;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ZeroSaltGenerator implements SaltGenerator {
    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i) {
        byte[] bArr = new byte[i];
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    @Override // org.jasypt.salt.SaltGenerator
    public boolean includePlainSaltInEncryptionResults() {
        return false;
    }
}
