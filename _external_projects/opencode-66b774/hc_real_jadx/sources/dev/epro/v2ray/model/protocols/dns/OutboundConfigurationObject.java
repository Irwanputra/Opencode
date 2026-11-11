package dev.epro.v2ray.model.protocols.dns;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutboundConfigurationObject {
    public String address;
    public String network;
    public int port;

    public String getAddress() {
        return this.address;
    }

    public String getNetwork() {
        return this.network;
    }

    public int getPort() {
        return this.port;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("OutboundConfigurationObject{network='");
        C2098.m4202(m4207, this.network, '\'', ", address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        return C2098.m4203(m4207, this.port, '}');
    }
}
