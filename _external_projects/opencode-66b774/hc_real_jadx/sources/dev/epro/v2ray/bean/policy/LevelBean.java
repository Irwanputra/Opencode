package dev.epro.v2ray.bean.policy;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LevelBean {
    public Integer connIdle;
    public Integer downlinkOnly;
    public Integer handshake;
    public Integer uplinkOnly;

    public Integer getConnIdle() {
        return this.connIdle;
    }

    public Integer getDownlinkOnly() {
        return this.downlinkOnly;
    }

    public Integer getHandshake() {
        return this.handshake;
    }

    public Integer getUplinkOnly() {
        return this.uplinkOnly;
    }

    public void setConnIdle(Integer num) {
        this.connIdle = num;
    }

    public void setDownlinkOnly(Integer num) {
        this.downlinkOnly = num;
    }

    public void setHandshake(Integer num) {
        this.handshake = num;
    }

    public void setUplinkOnly(Integer num) {
        this.uplinkOnly = num;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("LevelBean{handshake=");
        m4207.append(this.handshake);
        m4207.append(", connIdle=");
        m4207.append(this.connIdle);
        m4207.append(", uplinkOnly=");
        m4207.append(this.uplinkOnly);
        m4207.append(", downlinkOnly=");
        m4207.append(this.downlinkOnly);
        m4207.append('}');
        return m4207.toString();
    }
}
