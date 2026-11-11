package dev.epro.v2ray.model.transport.tcp;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HttpHeaderObject {
    public HTTPRequestObject request;
    public HTTPResponseObject response;
    public String type;

    public HTTPRequestObject getRequest() {
        return this.request;
    }

    public HTTPResponseObject getResponse() {
        return this.response;
    }

    public String getType() {
        return this.type;
    }

    public void setRequest(HTTPRequestObject hTTPRequestObject) {
        this.request = hTTPRequestObject;
    }

    public void setResponse(HTTPResponseObject hTTPResponseObject) {
        this.response = hTTPResponseObject;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("HttpHeaderObject{type='");
        C2098.m4202(m4207, this.type, '\'', ", request=");
        m4207.append(this.request);
        m4207.append(", response=");
        m4207.append(this.response);
        m4207.append('}');
        return m4207.toString();
    }
}
