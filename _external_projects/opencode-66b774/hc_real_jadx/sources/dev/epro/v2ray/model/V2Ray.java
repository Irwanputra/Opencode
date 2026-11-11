package dev.epro.v2ray.model;

import dev.epro.v2ray.model.api.ApiObject;
import dev.epro.v2ray.model.dns.DnsObject;
import dev.epro.v2ray.model.inbounds.InboundObject;
import dev.epro.v2ray.model.log.LogObject;
import dev.epro.v2ray.model.outbounds.OutboundObject;
import dev.epro.v2ray.model.policy.PolicyObject;
import dev.epro.v2ray.model.reverse.ReverseObject;
import dev.epro.v2ray.model.routing.RoutingObject;
import dev.epro.v2ray.model.stats.StatsObject;
import dev.epro.v2ray.model.transport.TransportObject;
import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class V2Ray {
    public ApiObject api;
    public DnsObject dns;
    public List<InboundObject> inbounds;
    public LogObject log;
    public List<OutboundObject> outbounds;
    public PolicyObject policy;
    public ReverseObject reverse;
    public RoutingObject routing;
    public StatsObject stats;
    public TransportObject transport;

    public ApiObject getApi() {
        return this.api;
    }

    public DnsObject getDns() {
        return this.dns;
    }

    public List<InboundObject> getInbounds() {
        return this.inbounds;
    }

    public LogObject getLog() {
        return this.log;
    }

    public List<OutboundObject> getOutbounds() {
        return this.outbounds;
    }

    public PolicyObject getPolicy() {
        return this.policy;
    }

    public ReverseObject getReverse() {
        return this.reverse;
    }

    public RoutingObject getRouting() {
        return this.routing;
    }

    public StatsObject getStats() {
        return this.stats;
    }

    public TransportObject getTransport() {
        return this.transport;
    }

    public void setApi(ApiObject apiObject) {
        this.api = apiObject;
    }

    public void setDns(DnsObject dnsObject) {
        this.dns = dnsObject;
    }

    public void setInbounds(List<InboundObject> list) {
        this.inbounds = list;
    }

    public void setLog(LogObject logObject) {
        this.log = logObject;
    }

    public void setOutbounds(List<OutboundObject> list) {
        this.outbounds = list;
    }

    public void setPolicy(PolicyObject policyObject) {
        this.policy = policyObject;
    }

    public void setReverse(ReverseObject reverseObject) {
        this.reverse = reverseObject;
    }

    public void setRouting(RoutingObject routingObject) {
        this.routing = routingObject;
    }

    public void setStats(StatsObject statsObject) {
        this.stats = statsObject;
    }

    public void setTransport(TransportObject transportObject) {
        this.transport = transportObject;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("V2Ray{log=");
        m4207.append(this.log);
        m4207.append(", api=");
        m4207.append(this.api);
        m4207.append(", dns=");
        m4207.append(this.dns);
        m4207.append(", stats=");
        m4207.append(this.stats);
        m4207.append(", routing=");
        m4207.append(this.routing);
        m4207.append(", policy=");
        m4207.append(this.policy);
        m4207.append(", inbounds=");
        m4207.append(this.inbounds);
        m4207.append(", outbounds=");
        m4207.append(this.outbounds);
        m4207.append(", transport=");
        m4207.append(this.transport);
        m4207.append(", reverse=");
        m4207.append(this.reverse);
        m4207.append('}');
        return m4207.toString();
    }
}
