package dev.epro.v2ray.model.policy;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LevelPolicyObject {
    public int bufferSize;
    public int connIdle;
    public int downlinkOnly;
    public int handshake;
    public boolean statsUserDownlink;
    public boolean statsUserUplink;
    public int uplinkOnly;

    public int getBufferSize() {
        return this.bufferSize;
    }

    public int getConnIdle() {
        return this.connIdle;
    }

    public int getDownlinkOnly() {
        return this.downlinkOnly;
    }

    public int getHandshake() {
        return this.handshake;
    }

    public boolean getStatsUserDownlink() {
        return this.statsUserDownlink;
    }

    public boolean getStatsUserUplink() {
        return this.statsUserUplink;
    }

    public int getUplinkOnly() {
        return this.uplinkOnly;
    }

    public void setBufferSize(int i) {
        this.bufferSize = i;
    }

    public void setConnIdle(int i) {
        this.connIdle = i;
    }

    public void setDownlinkOnly(int i) {
        this.downlinkOnly = i;
    }

    public void setHandshake(int i) {
        this.handshake = i;
    }

    public void setStatsUserDownlink(boolean z) {
        this.statsUserDownlink = z;
    }

    public void setStatsUserUplink(boolean z) {
        this.statsUserUplink = z;
    }

    public void setUplinkOnly(int i) {
        this.uplinkOnly = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("LevelPolicyObject{handshake=");
        m4207.append(this.handshake);
        m4207.append(", connIdle=");
        m4207.append(this.connIdle);
        m4207.append(", uplinkOnly=");
        m4207.append(this.uplinkOnly);
        m4207.append(", downlinkOnly=");
        m4207.append(this.downlinkOnly);
        m4207.append(", statsUserUplink=");
        m4207.append(this.statsUserUplink);
        m4207.append(", statsUserDownlink=");
        m4207.append(this.statsUserDownlink);
        m4207.append(", bufferSize=");
        return C2098.m4203(m4207, this.bufferSize, '}');
    }
}
