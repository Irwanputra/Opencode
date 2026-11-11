package dev.epro.v2ray.model.transport.tcp;

import java.util.Map;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HTTPResponseObject {
    public Map<String, String> headers;
    public String reason;
    public String status;
    public String version;

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getReason() {
        return this.reason;
    }

    public String getStatus() {
        return this.status;
    }

    public String getVersion() {
        return this.version;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("HTTPResponseObject{version='");
        C2098.m4202(m4207, this.version, '\'', ", status='");
        C2098.m4202(m4207, this.status, '\'', ", reason='");
        C2098.m4202(m4207, this.reason, '\'', ", headers=");
        m4207.append(this.headers);
        m4207.append('}');
        return m4207.toString();
    }
}
