package dev.epro.v2ray.bean.dns;

import java.util.List;
import java.util.Map;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DnsBean {
    public Map<String, String> hosts;
    public List<Object> servers;

    public DnsBean() {
    }

    public DnsBean(List<Object> list, Map<String, String> map) {
        this.servers = list;
        this.hosts = map;
    }

    public Map<String, String> getHosts() {
        return this.hosts;
    }

    public List<Object> getServers() {
        return this.servers;
    }

    public void setHosts(Map<String, String> map) {
        this.hosts = map;
    }

    public void setServers(List<Object> list) {
        this.servers = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("DnsBean{servers=");
        m4207.append(this.servers);
        m4207.append(", hosts=");
        m4207.append(this.hosts);
        m4207.append('}');
        return m4207.toString();
    }
}
