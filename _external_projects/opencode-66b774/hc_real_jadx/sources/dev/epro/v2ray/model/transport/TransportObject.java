package dev.epro.v2ray.model.transport;

import dev.epro.v2ray.model.transport.ds.DomainSocketObject;
import dev.epro.v2ray.model.transport.http.HttpObject;
import dev.epro.v2ray.model.transport.kcp.KcpObject;
import dev.epro.v2ray.model.transport.quic.QuicObject;
import dev.epro.v2ray.model.transport.tcp.TcpObject;
import dev.epro.v2ray.model.transport.ws.WebSocketObject;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TransportObject {
    public DomainSocketObject dsSettings;
    public HttpObject httpSettings;
    public KcpObject kcpSettings;
    public QuicObject quicSettings;
    public TcpObject tcpSettings;
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

    public QuicObject getQuicSettings() {
        return this.quicSettings;
    }

    public TcpObject getTcpSettings() {
        return this.tcpSettings;
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

    public void setQuicSettings(QuicObject quicObject) {
        this.quicSettings = quicObject;
    }

    public void setTcpSettings(TcpObject tcpObject) {
        this.tcpSettings = tcpObject;
    }

    public void setWsSettings(WebSocketObject webSocketObject) {
        this.wsSettings = webSocketObject;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("TransportObject{tcpSettings=");
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
        m4207.append('}');
        return m4207.toString();
    }
}
