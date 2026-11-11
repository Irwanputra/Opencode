package dev.epro.v2ray.model.reverse;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PortalObject {
    public String domain;
    public String tag;

    public String getDomain() {
        return this.domain;
    }

    public String getTag() {
        return this.tag;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("PortalObject{tag='");
        C2098.m4202(m4207, this.tag, '\'', ", domain='");
        return C2098.m4194(m4207, this.domain, '\'', '}');
    }
}
