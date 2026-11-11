package org.jasypt.salt;

import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionInitializationException;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ByteArrayFixedSaltGenerator implements FixedSaltGenerator {
    private final byte[] salt;

    public ByteArrayFixedSaltGenerator(byte[] bArr) {
        CommonUtils.validateNotNull(bArr, "Salt cannot be set null");
        this.salt = (byte[]) bArr.clone();
    }

    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i) {
        byte[] bArr = this.salt;
        if (bArr.length < i) {
            throw new EncryptionInitializationException("Requested salt larger than set");
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    @Override // org.jasypt.salt.SaltGenerator
    public boolean includePlainSaltInEncryptionResults() {
        return false;
    }
}
