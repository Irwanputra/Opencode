package dev.epro.v2ray.bean.outbounds.stream;

import dev.epro.v2ray.bean.outbounds.stream.kcp.KcpSettingsBean;
import dev.epro.v2ray.bean.outbounds.stream.quic.QuicSettingBean;
import dev.epro.v2ray.bean.outbounds.stream.tcp.TcpSettingsBean;
import dev.epro.v2ray.bean.outbounds.stream.ws.WsSettingsBean;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class StreamSettingsBean {
    public HttpSettingsBean httpSettings;
    public KcpSettingsBean kcpSettings;
    public String network;
    public QuicSettingBean quicSettings;
    public String security;
    public TcpSettingsBean tcpSettings;
    public TlsSettingsBean tlsSettings;
    public WsSettingsBean wsSettings;

    public StreamSettingsBean(String str, String str2, TcpSettingsBean tcpSettingsBean, KcpSettingsBean kcpSettingsBean, WsSettingsBean wsSettingsBean, HttpSettingsBean httpSettingsBean, TlsSettingsBean tlsSettingsBean, QuicSettingBean quicSettingBean) {
        this.network = str;
        this.security = str2;
        this.tcpSettings = tcpSettingsBean;
        this.kcpSettings = kcpSettingsBean;
        this.wsSettings = wsSettingsBean;
        this.httpSettings = httpSettingsBean;
        this.tlsSettings = tlsSettingsBean;
        this.quicSettings = quicSettingBean;
    }

    public HttpSettingsBean getHttpSettings() {
        return this.httpSettings;
    }

    public KcpSettingsBean getKcpSettings() {
        return this.kcpSettings;
    }

    public String getNetwork() {
        return this.network;
    }

    public QuicSettingBean getQuicSettings() {
        return this.quicSettings;
    }

    public String getSecurity() {
        return this.security;
    }

    public TcpSettingsBean getTcpSettings() {
        return this.tcpSettings;
    }

    public TlsSettingsBean getTlsSettings() {
        return this.tlsSettings;
    }

    public WsSettingsBean getWsSettings() {
        return this.wsSettings;
    }

    public void setHttpSettings(HttpSettingsBean httpSettingsBean) {
        this.httpSettings = httpSettingsBean;
    }

    public void setKcpSettings(KcpSettingsBean kcpSettingsBean) {
        this.kcpSettings = kcpSettingsBean;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setQuicSettings(QuicSettingBean quicSettingBean) {
        this.quicSettings = quicSettingBean;
    }

    public void setSecurity(String str) {
        this.security = str;
    }

    public void setTcpSettings(TcpSettingsBean tcpSettingsBean) {
        this.tcpSettings = tcpSettingsBean;
    }

    public void setTlsSettings(TlsSettingsBean tlsSettingsBean) {
        this.tlsSettings = tlsSettingsBean;
    }

    public void setWsSettings(WsSettingsBean wsSettingsBean) {
        this.wsSettings = wsSettingsBean;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("StreamSettingsBean{network='");
        C2098.m4202(m4207, this.network, '\'', ", security='");
        C2098.m4202(m4207, this.security, '\'', ", tcpSettings=");
        m4207.append(this.tcpSettings);
        m4207.append(", kcpSettings=");
        m4207.append(this.kcpSettings);
        m4207.append(", wsSettings=");
        m4207.append(this.wsSettings);
        m4207.append(", httpSettings=");
        m4207.append(this.httpSettings);
        m4207.append(", tlsSettings=");
        m4207.append(this.tlsSettings);
        m4207.append(", quicSettings=");
        m4207.append(this.quicSettings);
        m4207.append('}');
        return m4207.toString();
    }
}
