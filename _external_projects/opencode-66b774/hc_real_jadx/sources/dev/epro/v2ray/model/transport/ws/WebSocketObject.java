package dev.epro.v2ray.model.transport.ws;

import java.util.HashMap;
import java.util.Map;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class WebSocketObject {
    public boolean acceptProxyProtocol;
    public Map<String, String> headers = new HashMap();
    public String path;

    public boolean getAcceptProxyProtocol() {
        return this.acceptProxyProtocol;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getPath() {
        return this.path;
    }

    public void setAcceptProxyProtocol(boolean z) {
        this.acceptProxyProtocol = z;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("WebSocketObject{acceptProxyProtocol=");
        m4207.append(this.acceptProxyProtocol);
        m4207.append(", path='");
        C2098.m4202(m4207, this.path, '\'', ", headers=");
        m4207.append(this.headers);
        m4207.append('}');
        return m4207.toString();
    }
}
