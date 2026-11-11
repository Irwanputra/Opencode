package dev.epro.v2ray.bean.outbounds.stream.ws;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class WsSettingsBean {
    public String path = "";
    public HeadersBean headers = new HeadersBean();

    public HeadersBean getHeaders() {
        return this.headers;
    }

    public String getPath() {
        return this.path;
    }

    public void setHeaders(HeadersBean headersBean) {
        this.headers = headersBean;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("WsSettingsBean{path='");
        C2098.m4202(m4207, this.path, '\'', ", headers=");
        m4207.append(this.headers);
        m4207.append('}');
        return m4207.toString();
    }
}
