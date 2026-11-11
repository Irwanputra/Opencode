package org.jasypt.util.password;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface PasswordEncryptor {
    boolean checkPassword(String str, String str2);

    String encryptPassword(String str);
}
