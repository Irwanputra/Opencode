package dev.epro.v2ray.bean.routing;

import java.util.ArrayList;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RulesBean {
    public ArrayList<String> domain;
    public ArrayList<String> inboundTag;
    public ArrayList<String> ip;
    public String outboundTag;
    public String port;
    public String type;

    public RulesBean() {
    }

    public RulesBean(String str, ArrayList<String> arrayList, String str2) {
        this.type = str;
        this.domain = arrayList;
        this.outboundTag = str2;
    }

    public ArrayList<String> getDomain() {
        return this.domain;
    }

    public ArrayList<String> getInboundTag() {
        return this.inboundTag;
    }

    public ArrayList<String> getIp() {
        return this.ip;
    }

    public String getOutboundTag() {
        return this.outboundTag;
    }

    public String getPort() {
        return this.port;
    }

    public String getType() {
        return this.type;
    }

    public void setDomain(ArrayList<String> arrayList) {
        this.domain = arrayList;
    }

    public void setInboundTag(ArrayList<String> arrayList) {
        this.inboundTag = arrayList;
    }

    public void setIp(ArrayList<String> arrayList) {
        this.ip = arrayList;
    }

    public void setOutboundTag(String str) {
        this.outboundTag = str;
    }

    public void setPort(String str) {
        this.port = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("RulesBean{type='");
        C2098.m4202(m4207, this.type, '\'', ", ip=");
        m4207.append(this.ip);
        m4207.append(", domain=");
        m4207.append(this.domain);
        m4207.append(", outboundTag='");
        C2098.m4202(m4207, this.outboundTag, '\'', ", port='");
        C2098.m4202(m4207, this.port, '\'', ", inboundTag=");
        m4207.append(this.inboundTag);
        m4207.append('}');
        return m4207.toString();
    }
}
