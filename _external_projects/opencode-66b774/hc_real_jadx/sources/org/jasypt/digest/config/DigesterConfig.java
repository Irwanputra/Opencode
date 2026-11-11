package org.jasypt.digest.config;

import java.security.Provider;
import org.jasypt.salt.SaltGenerator;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface DigesterConfig {
    String getAlgorithm();

    Boolean getInvertPositionOfPlainSaltInEncryptionResults();

    Boolean getInvertPositionOfSaltInMessageBeforeDigesting();

    Integer getIterations();

    Integer getPoolSize();

    Provider getProvider();

    String getProviderName();

    SaltGenerator getSaltGenerator();

    Integer getSaltSizeBytes();

    Boolean getUseLenientSaltSizeCheck();
}
