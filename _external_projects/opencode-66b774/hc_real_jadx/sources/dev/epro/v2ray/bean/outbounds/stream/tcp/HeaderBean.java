package dev.epro.v2ray.bean.outbounds.stream.tcp;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HeaderBean {
    public Object request;
    public Object response;
    public String type = "none";

    public Object getRequest() {
        return this.request;
    }

    public Object getResponse() {
        return this.response;
    }

    public String getType() {
        return this.type;
    }

    public void setRequest(Object obj) {
        this.request = obj;
    }

    public void setResponse(Object obj) {
        this.response = obj;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("HeaderBean{type='");
        C2098.m4202(m4207, this.type, '\'', ", request=");
        m4207.append(this.request);
        m4207.append(", response=");
        m4207.append(this.response);
        m4207.append('}');
        return m4207.toString();
    }
}
