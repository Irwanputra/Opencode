package dev.epro.v2ray.bean.outbounds.stream.ws;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HeadersBean {
    public String Host = "";

    public String getHost() {
        return this.Host;
    }

    public void setHost(String str) {
        this.Host = str;
    }

    public String toString() {
        return C2098.m4194(C2098.m4207("HeadersBean{Host='"), this.Host, '\'', '}');
    }
}
