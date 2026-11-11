package dev.epro.v2ray.model.transport.quic;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class QuicObject {
    public HeaderObject header;
    public String key;
    public String security;

    public HeaderObject getHeader() {
        return this.header;
    }

    public String getKey() {
        return this.key;
    }

    public String getSecurity() {
        return this.security;
    }

    public void setHeader(HeaderObject headerObject) {
        this.header = headerObject;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setSecurity(String str) {
        this.security = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("QuicObject{security='");
        C2098.m4202(m4207, this.security, '\'', ", key='");
        C2098.m4202(m4207, this.key, '\'', ", header=");
        m4207.append(this.header);
        m4207.append('}');
        return m4207.toString();
    }
}
