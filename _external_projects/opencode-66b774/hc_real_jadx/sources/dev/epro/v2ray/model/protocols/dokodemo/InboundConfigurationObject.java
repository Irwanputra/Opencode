package dev.epro.v2ray.model.protocols.dokodemo;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public String address;
    public boolean followRedirect;
    public String network;
    public int port;
    public int timeout;
    public int userLevel;

    public String getAddress() {
        return this.address;
    }

    public boolean getFollowRedirect() {
        return this.followRedirect;
    }

    public String getNetwork() {
        return this.network;
    }

    public int getPort() {
        return this.port;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public int getUserLevel() {
        return this.userLevel;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setFollowRedirect(boolean z) {
        this.followRedirect = z;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public void setUserLevel(int i) {
        this.userLevel = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", network='");
        C2098.m4202(m4207, this.network, '\'', ", timeout=");
        m4207.append(this.timeout);
        m4207.append(", followRedirect=");
        m4207.append(this.followRedirect);
        m4207.append(", userLevel=");
        return C2098.m4203(m4207, this.userLevel, '}');
    }
}
