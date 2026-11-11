package dev.epro.v2ray.model.protocols.vmess;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutboundConfigurationObject {
    public List<ServerObject> vnext;

    public List<ServerObject> getVnext() {
        return this.vnext;
    }

    public void setVnext(List<ServerObject> list) {
        this.vnext = list;
    }

    public String toString() {
        return C2098.m4178(C2098.m4207("OutboundConfigurationObject{vnext="), this.vnext, '}');
    }
}
