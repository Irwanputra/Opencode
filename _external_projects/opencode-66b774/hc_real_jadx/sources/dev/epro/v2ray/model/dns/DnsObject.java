package dev.epro.v2ray.model.dns;

import java.util.List;
import java.util.Map;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DnsObject {
    public String clientIp;
    public Map<String, String> hosts;
    public List<Object> servers;
    public String tag;

    public String getClientIp() {
        return this.clientIp;
    }

    public Map<String, String> getHosts() {
        return this.hosts;
    }

    public List<Object> getServers() {
        return this.servers;
    }

    public String getTag() {
        return this.tag;
    }

    public void setClientIp(String str) {
        this.clientIp = str;
    }

    public void setHosts(Map<String, String> map) {
        this.hosts = map;
    }

    public void setServers(List<Object> list) {
        this.servers = list;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("DnsObject{hosts=");
        m4207.append(this.hosts);
        m4207.append(", servers=");
        m4207.append(this.servers);
        m4207.append(", clientIp='");
        C2098.m4202(m4207, this.clientIp, '\'', ", tag='");
        return C2098.m4194(m4207, this.tag, '\'', '}');
    }
}
