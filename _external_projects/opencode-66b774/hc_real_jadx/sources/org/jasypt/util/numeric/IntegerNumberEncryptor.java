package org.jasypt.util.numeric;

import java.math.BigInteger;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface IntegerNumberEncryptor {
    BigInteger decrypt(BigInteger bigInteger);

    BigInteger encrypt(BigInteger bigInteger);
}
