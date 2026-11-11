package dev.epro.v2ray.bean.inbounds;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SniffingBean {
    public List<String> destOverride;
    public boolean enabled;

    public List<String> getDestOverride() {
        return this.destOverride;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setDestOverride(List<String> list) {
        this.destOverride = list;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("SniffingBean{enabled=");
        m4207.append(this.enabled);
        m4207.append(", destOverride=");
        return C2098.m4178(m4207, this.destOverride, '}');
    }
}
