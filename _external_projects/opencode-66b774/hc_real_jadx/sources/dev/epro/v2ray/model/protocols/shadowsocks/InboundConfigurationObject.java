package dev.epro.v2ray.model.protocols.shadowsocks;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public String email;
    public int level;
    public String method;
    public String network;
    public String password;

    public String getEmail() {
        return this.email;
    }

    public int getLevel() {
        return this.level;
    }

    public String getMethod() {
        return this.method;
    }

    public String getNetwork() {
        return this.network;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{email='");
        C2098.m4202(m4207, this.email, '\'', ", method='");
        C2098.m4202(m4207, this.method, '\'', ", password='");
        C2098.m4202(m4207, this.password, '\'', ", level=");
        m4207.append(this.level);
        m4207.append(", network='");
        return C2098.m4194(m4207, this.network, '\'', '}');
    }
}
