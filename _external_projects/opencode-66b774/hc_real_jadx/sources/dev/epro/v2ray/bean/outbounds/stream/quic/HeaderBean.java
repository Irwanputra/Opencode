package dev.epro.v2ray.bean.outbounds.stream.quic;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HeaderBean {
    public String type = "none";

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return C2098.m4194(C2098.m4207("HeaderBean{type='"), this.type, '\'', '}');
    }
}
