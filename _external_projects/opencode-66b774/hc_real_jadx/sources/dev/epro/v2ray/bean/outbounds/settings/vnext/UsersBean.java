package dev.epro.v2ray.bean.outbounds.settings.vnext;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class UsersBean {
    public int alterId;
    public String id;
    public int level;
    public String security;

    public int getAlterId() {
        return this.alterId;
    }

    public String getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public String getSecurity() {
        return this.security;
    }

    public void setAlterId(int i) {
        this.alterId = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setSecurity(String str) {
        this.security = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("UsersBean{id='");
        C2098.m4202(m4207, this.id, '\'', ", alterId=");
        m4207.append(this.alterId);
        m4207.append(", security='");
        C2098.m4202(m4207, this.security, '\'', ", level=");
        return C2098.m4203(m4207, this.level, '}');
    }
}
