package org.jasypt.encryption.pbe.config;

import org.jasypt.commons.CommonUtils;

/* loaded from: /tmp/opencode/hc_real.dex */
public class WebStringPBEConfig extends WebPBEConfig implements StringPBEConfig {
    private String stringOutputType = null;

    @Override // org.jasypt.encryption.pbe.config.StringPBEConfig
    public String getStringOutputType() {
        return this.stringOutputType;
    }

    public void setStringOutputType(String str) {
        this.stringOutputType = CommonUtils.getStandardStringOutputType(str);
    }
}
