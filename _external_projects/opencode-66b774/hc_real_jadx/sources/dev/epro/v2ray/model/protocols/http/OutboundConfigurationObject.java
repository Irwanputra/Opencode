package dev.epro.v2ray.model.protocols.http;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutboundConfigurationObject {
    public List<ServerObject> servers;

    public List<ServerObject> getServers() {
        return this.servers;
    }

    public void setServers(List<ServerObject> list) {
        this.servers = list;
    }

    public String toString() {
        return C2098.m4178(C2098.m4207("OutboundConfigurationObject{servers="), this.servers, '}');
    }
}
