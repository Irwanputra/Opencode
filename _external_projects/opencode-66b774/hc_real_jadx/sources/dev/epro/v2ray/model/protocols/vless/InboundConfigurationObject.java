package dev.epro.v2ray.model.protocols.vless;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public List<ClientObject> clients;
    public String decryption;
    public List<FallbackObject> fallbacks;

    public List<ClientObject> getClients() {
        return this.clients;
    }

    public String getDecryption() {
        return this.decryption;
    }

    public List<FallbackObject> getFallbacks() {
        return this.fallbacks;
    }

    public void setClients(List<ClientObject> list) {
        this.clients = list;
    }

    public void setDecryption(String str) {
        this.decryption = str;
    }

    public void setFallbacks(List<FallbackObject> list) {
        this.fallbacks = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{clients=");
        m4207.append(this.clients);
        m4207.append(", decryption='");
        C2098.m4202(m4207, this.decryption, '\'', ", fallbacks=");
        return C2098.m4178(m4207, this.fallbacks, '}');
    }
}
