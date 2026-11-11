package dev.epro.v2ray.model.transport.tcp;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TcpObject {
    public boolean acceptProxyProtocol;
    public Object header;

    public boolean getAcceptProxyProtocol() {
        return this.acceptProxyProtocol;
    }

    public Object getHeader() {
        return this.header;
    }

    public void setAcceptProxyProtocol(boolean z) {
        this.acceptProxyProtocol = z;
    }

    public void setHeader(Object obj) {
        this.header = obj;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("TcpObject{acceptProxyProtocol=");
        m4207.append(this.acceptProxyProtocol);
        m4207.append(", header=");
        m4207.append(this.header);
        m4207.append('}');
        return m4207.toString();
    }
}
