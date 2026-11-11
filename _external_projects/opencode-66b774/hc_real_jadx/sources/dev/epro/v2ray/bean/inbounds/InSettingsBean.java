package dev.epro.v2ray.bean.inbounds;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InSettingsBean {
    public String address;
    public String auth;
    public String network;
    public Integer port;
    public Boolean udp;
    public Integer userLevel;

    public String getAddress() {
        return this.address;
    }

    public String getAuth() {
        return this.auth;
    }

    public String getNetwork() {
        return this.network;
    }

    public Integer getPort() {
        return this.port;
    }

    public Boolean getUdp() {
        return this.udp;
    }

    public Integer getUserLevel() {
        return this.userLevel;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setAuth(String str) {
        this.auth = str;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setPort(Integer num) {
        this.port = num;
    }

    public void setUdp(Boolean bool) {
        this.udp = bool;
    }

    public void setUserLevel(Integer num) {
        this.userLevel = num;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InSettingsBean{auth='");
        C2098.m4202(m4207, this.auth, '\'', ", udp=");
        m4207.append(this.udp);
        m4207.append(", userLevel=");
        m4207.append(this.userLevel);
        m4207.append(", address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", network='");
        return C2098.m4194(m4207, this.network, '\'', '}');
    }
}
