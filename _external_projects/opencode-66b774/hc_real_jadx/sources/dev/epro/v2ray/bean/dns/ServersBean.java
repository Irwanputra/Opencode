package dev.epro.v2ray.bean.dns;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ServersBean {
    public String address;
    public List<String> domains;
    public int port;

    public ServersBean() {
    }

    public ServersBean(String str, int i, List<String> list) {
        this.address = str;
        this.port = i;
        this.domains = list;
    }

    public String getAddress() {
        return this.address;
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public int getPort() {
        return this.port;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setDomains(List<String> list) {
        this.domains = list;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ServersBean{address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", domains=");
        return C2098.m4178(m4207, this.domains, '}');
    }
}
