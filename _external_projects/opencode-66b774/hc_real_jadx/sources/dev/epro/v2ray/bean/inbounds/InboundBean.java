package dev.epro.v2ray.bean.inbounds;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundBean {
    public String listen;
    public int port;
    public String protocol;
    public InSettingsBean settings;
    public SniffingBean sniffing;
    public String tag;

    public String getListen() {
        return this.listen;
    }

    public int getPort() {
        return this.port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public InSettingsBean getSettings() {
        return this.settings;
    }

    public SniffingBean getSniffing() {
        return this.sniffing;
    }

    public String getTag() {
        return this.tag;
    }

    public void setListen(String str) {
        this.listen = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setSettings(InSettingsBean inSettingsBean) {
        this.settings = inSettingsBean;
    }

    public void setSniffing(SniffingBean sniffingBean) {
        this.sniffing = sniffingBean;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundBean{tag='");
        C2098.m4202(m4207, this.tag, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", protocol='");
        C2098.m4202(m4207, this.protocol, '\'', ", listen='");
        C2098.m4202(m4207, this.listen, '\'', ", settings=");
        m4207.append(this.settings);
        m4207.append(", sniffing=");
        m4207.append(this.sniffing);
        m4207.append('}');
        return m4207.toString();
    }
}
