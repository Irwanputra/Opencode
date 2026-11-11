package dev.epro.v2ray.model.protocols.freedom;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutboundConfigurationObject {
    public String domainStrategy;
    public String redirect;
    public int userLevel;

    public String getDomainStrategy() {
        return this.domainStrategy;
    }

    public String getRedirect() {
        return this.redirect;
    }

    public int getUserLevel() {
        return this.userLevel;
    }

    public void setDomainStrategy(String str) {
        this.domainStrategy = str;
    }

    public void setRedirect(String str) {
        this.redirect = str;
    }

    public void setUserLevel(int i) {
        this.userLevel = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("OutboundConfigurationObject{domainStrategy='");
        C2098.m4202(m4207, this.domainStrategy, '\'', ", redirect='");
        C2098.m4202(m4207, this.redirect, '\'', ", userLevel=");
        return C2098.m4203(m4207, this.userLevel, '}');
    }
}
