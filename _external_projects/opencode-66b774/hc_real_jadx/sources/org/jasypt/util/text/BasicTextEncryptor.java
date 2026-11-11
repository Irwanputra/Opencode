package org.jasypt.util.text;

import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class BasicTextEncryptor implements TextEncryptor {
    private final StandardPBEStringEncryptor encryptor;

    public BasicTextEncryptor() {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        this.encryptor = standardPBEStringEncryptor;
        standardPBEStringEncryptor.setAlgorithm(StandardPBEByteEncryptor.DEFAULT_ALGORITHM);
    }

    @Override // org.jasypt.util.text.TextEncryptor
    public String decrypt(String str) {
        return this.encryptor.decrypt(str);
    }

    @Override // org.jasypt.util.text.TextEncryptor
    public String encrypt(String str) {
        return this.encryptor.encrypt(str);
    }

    public void setPassword(String str) {
        this.encryptor.setPassword(str);
    }

    public void setPasswordCharArray(char[] cArr) {
        this.encryptor.setPasswordCharArray(cArr);
    }
}
