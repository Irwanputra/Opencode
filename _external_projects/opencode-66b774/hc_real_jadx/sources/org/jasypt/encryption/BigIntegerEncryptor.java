package org.jasypt.encryption;

import java.math.BigInteger;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface BigIntegerEncryptor {
    BigInteger decrypt(BigInteger bigInteger);

    BigInteger encrypt(BigInteger bigInteger);
}
