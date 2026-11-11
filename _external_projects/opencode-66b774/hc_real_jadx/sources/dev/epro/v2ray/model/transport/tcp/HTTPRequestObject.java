package dev.epro.v2ray.model.transport.tcp;

import java.util.List;
import java.util.Map;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HTTPRequestObject {
    public Map<String, List<String>> headers;
    public String method;
    public List<String> path;
    public String version;

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public List<String> getPath() {
        return this.path;
    }

    public String getVersion() {
        return this.version;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setPath(List<String> list) {
        this.path = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("HTTPRequestObject{version='");
        C2098.m4202(m4207, this.version, '\'', ", method='");
        C2098.m4202(m4207, this.method, '\'', ", path=");
        m4207.append(this.path);
        m4207.append(", headers=");
        m4207.append(this.headers);
        m4207.append('}');
        return m4207.toString();
    }
}
