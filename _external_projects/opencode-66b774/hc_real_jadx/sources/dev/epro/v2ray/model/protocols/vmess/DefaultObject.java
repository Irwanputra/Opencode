package dev.epro.v2ray.model.protocols.vmess;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DefaultObject {
    public int alterId;
    public int level;

    public int getAlterId() {
        return this.alterId;
    }

    public int getLevel() {
        return this.level;
    }

    public void setAlterId(int i) {
        this.alterId = i;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("DetourObject{level=");
        m4207.append(this.level);
        m4207.append(", alterId=");
        return C2098.m4203(m4207, this.alterId, '}');
    }
}
