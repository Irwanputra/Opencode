package dev.epro.v2ray.model.protocols.blackhole;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutboundConfigurationObject {
    public ResponseObject response;

    public ResponseObject getResponse() {
        return this.response;
    }

    public void setResponse(ResponseObject responseObject) {
        this.response = responseObject;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ConfigurationObject{response=");
        m4207.append(this.response);
        m4207.append('}');
        return m4207.toString();
    }
}
