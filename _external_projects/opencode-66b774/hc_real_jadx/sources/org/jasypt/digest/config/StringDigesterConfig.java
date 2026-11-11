package org.jasypt.digest.config;

/* loaded from: /tmp/opencode/hc_real.dex */
public interface StringDigesterConfig extends DigesterConfig {
    String getPrefix();

    String getStringOutputType();

    String getSuffix();

    Boolean isUnicodeNormalizationIgnored();
}
