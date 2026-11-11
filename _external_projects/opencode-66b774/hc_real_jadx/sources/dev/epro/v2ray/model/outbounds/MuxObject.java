package dev.epro.v2ray.model.outbounds;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MuxObject {
    public int concurrency;
    public boolean enabled;

    public int getConcurrency() {
        return this.concurrency;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setConcurrency(int i) {
        this.concurrency = i;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("MuxObject{enabled=");
        m4207.append(this.enabled);
        m4207.append(", concurrency=");
        return C2098.m4203(m4207, this.concurrency, '}');
    }
}
