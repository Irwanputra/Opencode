package org.jasypt.util.binary;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface BinaryEncryptor {
    byte[] decrypt(byte[] bArr);

    byte[] encrypt(byte[] bArr);
}
