package dev.epro.v2ray.model.transport.http;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HttpObject {
    public List<String> host;
    public String path;

    public List<String> getHost() {
        return this.host;
    }

    public String getPath() {
        return this.path;
    }

    public void setHost(List<String> list) {
        this.host = list;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("HttpObject{host=");
        m4207.append(this.host);
        m4207.append(", path='");
        return C2098.m4194(m4207, this.path, '\'', '}');
    }
}
