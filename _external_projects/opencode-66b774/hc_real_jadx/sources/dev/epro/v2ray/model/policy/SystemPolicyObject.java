package dev.epro.v2ray.model.policy;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SystemPolicyObject {
    public boolean statsInboundDownlink;
    public boolean statsInboundUplink;
    public boolean statsOutboundDownlink;
    public boolean statsOutboundUplink;

    public boolean getStatsInboundDownlink() {
        return this.statsInboundDownlink;
    }

    public boolean getStatsInboundUplink() {
        return this.statsInboundUplink;
    }

    public boolean getStatsOutboundDownlink() {
        return this.statsOutboundDownlink;
    }

    public boolean getStatsOutboundUplink() {
        return this.statsOutboundUplink;
    }

    public void setStatsInboundDownlink(boolean z) {
        this.statsInboundDownlink = z;
    }

    public void setStatsInboundUplink(boolean z) {
        this.statsInboundUplink = z;
    }

    public void setStatsOutboundDownlink(boolean z) {
        this.statsOutboundDownlink = z;
    }

    public void setStatsOutboundUplink(boolean z) {
        this.statsOutboundUplink = z;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("SystemPolicyObject{statsInboundUplink=");
        m4207.append(this.statsInboundUplink);
        m4207.append(", statsInboundDownlink=");
        m4207.append(this.statsInboundDownlink);
        m4207.append(", statsOutboundUplink=");
        m4207.append(this.statsOutboundUplink);
        m4207.append(", statsOutboundDownlink=");
        m4207.append(this.statsOutboundDownlink);
        m4207.append('}');
        return m4207.toString();
    }
}
