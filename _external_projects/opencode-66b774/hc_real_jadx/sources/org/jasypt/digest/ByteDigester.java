package org.jasypt.digest;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface ByteDigester {
    byte[] digest(byte[] bArr);

    boolean matches(byte[] bArr, byte[] bArr2);
}
