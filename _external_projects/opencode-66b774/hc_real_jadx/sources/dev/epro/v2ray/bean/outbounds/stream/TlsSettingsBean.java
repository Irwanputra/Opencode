package dev.epro.v2ray.bean.outbounds.stream;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TlsSettingsBean {
    public boolean allowInsecure = true;
    public String serverName = "";

    public String getServerName() {
        return this.serverName;
    }

    public boolean isAllowInsecure() {
        return this.allowInsecure;
    }

    public void setAllowInsecure(boolean z) {
        this.allowInsecure = z;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("TlsSettingsBean{allowInsecure=");
        m4207.append(this.allowInsecure);
        m4207.append(", serverName='");
        return C2098.m4194(m4207, this.serverName, '\'', '}');
    }
}
