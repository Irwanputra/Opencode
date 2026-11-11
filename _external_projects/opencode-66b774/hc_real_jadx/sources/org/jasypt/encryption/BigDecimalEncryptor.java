package org.jasypt.encryption;

import java.math.BigDecimal;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface BigDecimalEncryptor {
    BigDecimal decrypt(BigDecimal bigDecimal);

    BigDecimal encrypt(BigDecimal bigDecimal);
}
