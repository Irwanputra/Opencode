package dev.epro.v2ray.model.dns;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ServerObject {
    public String address;
    public String clientIp;
    public List<String> domains;
    public List<String> expectIPs;
    public int port;

    public String getAddress() {
        return this.address;
    }

    public String getClientIp() {
        return this.clientIp;
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public List<String> getExpectIPs() {
        return this.expectIPs;
    }

    public int getPort() {
        return this.port;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setClientIp(String str) {
        this.clientIp = str;
    }

    public void setDomains(List<String> list) {
        this.domains = list;
    }

    public void setExpectIPs(List<String> list) {
        this.expectIPs = list;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ServerObject{address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", clientIp='");
        C2098.m4202(m4207, this.clientIp, '\'', ", domains=");
        m4207.append(this.domains);
        m4207.append(", expectIPs=");
        return C2098.m4178(m4207, this.expectIPs, '}');
    }
}
