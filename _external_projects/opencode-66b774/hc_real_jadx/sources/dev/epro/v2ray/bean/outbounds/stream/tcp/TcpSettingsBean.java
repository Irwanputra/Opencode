package dev.epro.v2ray.bean.outbounds.stream.tcp;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TcpSettingsBean {
    public HeaderBean header = new HeaderBean();

    public HeaderBean getHeader() {
        return this.header;
    }

    public void setHeader(HeaderBean headerBean) {
        this.header = headerBean;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("TcpSettingsBean{header=");
        m4207.append(this.header);
        m4207.append('}');
        return m4207.toString();
    }
}
