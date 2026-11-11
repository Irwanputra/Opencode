package dev.epro.v2ray.model.transport.tcp;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NoneHeaderObject {
    public String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return C2098.m4194(C2098.m4207("NoneHeaderObject{type='"), this.type, '\'', '}');
    }
}
