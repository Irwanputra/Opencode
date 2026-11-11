package dev.epro.v2ray.model.routing;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RuleObject {
    public String attrs;
    public String balancerTag;
    public List<String> domain;
    public List<String> inboundTag;
    public List<String> ip;
    public String network;
    public String outboundTag;
    public String port;
    public List<String> protocol;
    public List<String> source;
    public String sourcePort;
    public String type;
    public List<String> user;

    public String getAttrs() {
        return this.attrs;
    }

    public String getBalancerTag() {
        return this.balancerTag;
    }

    public List<String> getDomain() {
        return this.domain;
    }

    public List<String> getInboundTag() {
        return this.inboundTag;
    }

    public List<String> getIp() {
        return this.ip;
    }

    public String getNetwork() {
        return this.network;
    }

    public String getOutboundTag() {
        return this.outboundTag;
    }

    public String getPort() {
        return this.port;
    }

    public List<String> getProtocol() {
        return this.protocol;
    }

    public List<String> getSource() {
        return this.source;
    }

    public String getSourcePort() {
        return this.sourcePort;
    }

    public String getType() {
        return this.type;
    }

    public List<String> getUser() {
        return this.user;
    }

    public void setAttrs(String str) {
        this.attrs = str;
    }

    public void setBalancerTag(String str) {
        this.balancerTag = str;
    }

    public void setDomain(List<String> list) {
        this.domain = list;
    }

    public void setInboundTag(List<String> list) {
        this.inboundTag = list;
    }

    public void setIp(List<String> list) {
        this.ip = list;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setOutboundTag(String str) {
        this.outboundTag = str;
    }

    public void setPort(String str) {
        this.port = str;
    }

    public void setProtocol(List<String> list) {
        this.protocol = list;
    }

    public void setSource(List<String> list) {
        this.source = list;
    }

    public void setSourcePort(String str) {
        this.sourcePort = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUser(List<String> list) {
        this.user = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("RuleObject{type='");
        C2098.m4202(m4207, this.type, '\'', ", domain=");
        m4207.append(this.domain);
        m4207.append(", ip=");
        m4207.append(this.ip);
        m4207.append(", port='");
        C2098.m4202(m4207, this.port, '\'', ", sourcePort='");
        C2098.m4202(m4207, this.sourcePort, '\'', ", network='");
        C2098.m4202(m4207, this.network, '\'', ", source=");
        m4207.append(this.source);
        m4207.append(", user=");
        m4207.append(this.user);
        m4207.append(", inboundTag=");
        m4207.append(this.inboundTag);
        m4207.append(", protocol=");
        m4207.append(this.protocol);
        m4207.append(", attrs='");
        C2098.m4202(m4207, this.attrs, '\'', ", outboundTag='");
        C2098.m4202(m4207, this.outboundTag, '\'', ", balancerTag='");
        return C2098.m4194(m4207, this.balancerTag, '\'', '}');
    }
}
