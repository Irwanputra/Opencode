package dev.epro.v2ray.util;

import dev.epro.v2ray.bean.LogBean;
import dev.epro.v2ray.bean.dns.DnsBean;
import dev.epro.v2ray.bean.inbounds.InboundBean;
import dev.epro.v2ray.bean.outbounds.OutboundBean;
import dev.epro.v2ray.bean.policy.PolicyBean;
import dev.epro.v2ray.bean.routing.RoutingBean;
import java.util.ArrayList;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class V2rayConfig {
    public DnsBean dns;
    public ArrayList<InboundBean> inbounds;
    public LogBean log;
    public ArrayList<OutboundBean> outbounds;
    public PolicyBean policy;
    public RoutingBean routing;
    public Object stats;

    public DnsBean getDns() {
        return this.dns;
    }

    public ArrayList<InboundBean> getInbounds() {
        return this.inbounds;
    }

    public LogBean getLog() {
        return this.log;
    }

    public ArrayList<OutboundBean> getOutbounds() {
        return this.outbounds;
    }

    public PolicyBean getPolicy() {
        return this.policy;
    }

    public RoutingBean getRouting() {
        return this.routing;
    }

    public Object getStats() {
        return this.stats;
    }

    public void setDns(DnsBean dnsBean) {
        this.dns = dnsBean;
    }

    public void setInbounds(ArrayList<InboundBean> arrayList) {
        this.inbounds = arrayList;
    }

    public void setLog(LogBean logBean) {
        this.log = logBean;
    }

    public void setOutbounds(ArrayList<OutboundBean> arrayList) {
        this.outbounds = arrayList;
    }

    public void setPolicy(PolicyBean policyBean) {
        this.policy = policyBean;
    }

    public void setRouting(RoutingBean routingBean) {
        this.routing = routingBean;
    }

    public void setStats(Object obj) {
        this.stats = obj;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("V2rayConfig{stats=");
        m4207.append(this.stats);
        m4207.append(", log=");
        m4207.append(this.log);
        m4207.append(", policy=");
        m4207.append(this.policy);
        m4207.append(", inbounds=");
        m4207.append(this.inbounds);
        m4207.append(", outbounds=");
        m4207.append(this.outbounds);
        m4207.append(", dns=");
        m4207.append(this.dns);
        m4207.append(", routing=");
        m4207.append(this.routing);
        m4207.append('}');
        return m4207.toString();
    }
}
