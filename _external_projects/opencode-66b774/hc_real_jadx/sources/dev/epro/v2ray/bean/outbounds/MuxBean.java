package dev.epro.v2ray.bean.outbounds;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MuxBean {
    public boolean enabled;

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("MuxBean{enabled=");
        m4207.append(this.enabled);
        m4207.append('}');
        return m4207.toString();
    }
}
