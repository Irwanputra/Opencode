package dev.epro.v2ray.bean.outbounds.stream.quic;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class QuicSettingBean {
    public String security = "none";
    public String key = "";
    public HeaderBean header = new HeaderBean();

    public HeaderBean getHeader() {
        return this.header;
    }

    public String getKey() {
        return this.key;
    }

    public String getSecurity() {
        return this.security;
    }

    public void setHeader(HeaderBean headerBean) {
        this.header = headerBean;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setSecurity(String str) {
        this.security = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("QuicSettingBean{security='");
        C2098.m4202(m4207, this.security, '\'', ", key='");
        C2098.m4202(m4207, this.key, '\'', ", header=");
        m4207.append(this.header);
        m4207.append('}');
        return m4207.toString();
    }
}
