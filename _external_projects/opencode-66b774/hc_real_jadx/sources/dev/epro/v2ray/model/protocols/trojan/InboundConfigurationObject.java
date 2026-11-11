package dev.epro.v2ray.model.protocols.trojan;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public List<ClientObject> clients;
    public List<FallbackObject> fallbacks;

    public List<ClientObject> getClients() {
        return this.clients;
    }

    public List<FallbackObject> getFallbacks() {
        return this.fallbacks;
    }

    public void setClients(List<ClientObject> list) {
        this.clients = list;
    }

    public void setFallbacks(List<FallbackObject> list) {
        this.fallbacks = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{clients=");
        m4207.append(this.clients);
        m4207.append(", fallbacks=");
        return C2098.m4178(m4207, this.fallbacks, '}');
    }
}
