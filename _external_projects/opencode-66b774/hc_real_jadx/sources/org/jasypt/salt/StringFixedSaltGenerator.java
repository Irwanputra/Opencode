package org.jasypt.salt;

import java.io.UnsupportedEncodingException;
import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionInitializationException;

/* loaded from: /tmp/opencode/hc_real.dex */
public class StringFixedSaltGenerator implements FixedSaltGenerator {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private final String charset;
    private final String salt;
    private final byte[] saltBytes;

    public StringFixedSaltGenerator(String str) {
        this(str, null);
    }

    public StringFixedSaltGenerator(String str, String str2) {
        CommonUtils.validateNotNull(str, "Salt cannot be set null");
        this.salt = str;
        str2 = str2 == null ? "UTF-8" : str2;
        this.charset = str2;
        try {
            this.saltBytes = str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid charset specified: ");
            stringBuffer.append(this.charset);
            throw new EncryptionInitializationException(stringBuffer.toString());
        }
    }

    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i) {
        byte[] bArr = this.saltBytes;
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
