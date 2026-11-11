package dev.epro.v2ray.model.inbounds;

import dev.epro.v2ray.model.transport.ds.DomainSocketObject;
import dev.epro.v2ray.model.transport.http.HttpObject;
import dev.epro.v2ray.model.transport.kcp.KcpObject;
import dev.epro.v2ray.model.transport.quic.QuicObject;
import dev.epro.v2ray.model.transport.sock.SockoptObject;
import dev.epro.v2ray.model.transport.tcp.TcpObject;
import dev.epro.v2ray.model.transport.tls.TLSObject;
import dev.epro.v2ray.model.transport.ws.WebSocketObject;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class StreamSettingsObject {
    public DomainSocketObject dsSettings;
    public HttpObject httpSettings;
    public KcpObject kcpSettings;
    public String network;
    public QuicObject quicSettings;
    public String security;
    public SockoptObject sockopt;
    public TcpObject tcpSettings;
    public TLSObject tlsSettings;
    public WebSocketObject wsSettings;

    public DomainSocketObject getDsSettings() {
        return this.dsSettings;
    }

    public HttpObject getHttpSettings() {
        return this.httpSettings;
    }

    public KcpObject getKcpSettings() {
        return this.kcpSettings;
    }

    public String getNetwork() {
        return this.network;
    }

    public QuicObject getQuicSettings() {
        return this.quicSettings;
    }

    public String getSecurity() {
        return this.security;
    }

    public SockoptObject getSockopt() {
        return this.sockopt;
    }

    public TcpObject getTcpSettings() {
        return this.tcpSettings;
    }

    public TLSObject getTlsSettings() {
        return this.tlsSettings;
    }

    public WebSocketObject getWsSettings() {
        return this.wsSettings;
    }

    public void setDsSettings(DomainSocketObject domainSocketObject) {
        this.dsSettings = domainSocketObject;
    }

    public void setHttpSettings(HttpObject httpObject) {
        this.httpSettings = httpObject;
    }

    public void setKcpSettings(KcpObject kcpObject) {
        this.kcpSettings = kcpObject;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setQuicSettings(QuicObject quicObject) {
        this.quicSettings = quicObject;
    }

    public void setSecurity(String str) {
        this.security = str;
    }

    public void setSockopt(SockoptObject sockoptObject) {
        this.sockopt = sockoptObject;
    }

    public void setTcpSettings(TcpObject tcpObject) {
        this.tcpSettings = tcpObject;
    }

    public void setTlsSettings(TLSObject tLSObject) {
        this.tlsSettings = tLSObject;
    }

    public void setWsSettings(WebSocketObject webSocketObject) {
        this.wsSettings = webSocketObject;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("StreamSettingsObject{network='");
        C2098.m4202(m4207, this.network, '\'', ", security='");
        C2098.m4202(m4207, this.security, '\'', ", tlsSettings=");
        m4207.append(this.tlsSettings);
        m4207.append(", tcpSettings=");
        m4207.append(this.tcpSettings);
        m4207.append(", kcpSettings=");
        m4207.append(this.kcpSettings);
        m4207.append(", wsSettings=");
        m4207.append(this.wsSettings);
        m4207.append(", httpSettings=");
        m4207.append(this.httpSettings);
        m4207.append(", dsSettings=");
        m4207.append(this.dsSettings);
        m4207.append(", quicSettings=");
        m4207.append(this.quicSettings);
        m4207.append(", sockopt=");
        m4207.append(this.sockopt);
        m4207.append('}');
        return m4207.toString();
    }
}
