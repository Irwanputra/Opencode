package dev.epro.v2ray.model.protocols.vmess;

import java.util.List;
import p131.p155.p156.p157.C2098;
import p131.p161.p211.p212.InterfaceC2525;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public List<ClientObject> clients;

    @InterfaceC2525("default")
    public DefaultObject defaultObject;
    public DetourObject detour;
    public boolean disableInsecureEncryption;

    public List<ClientObject> getClients() {
        return this.clients;
    }

    public DefaultObject getDefaultObject() {
        return this.defaultObject;
    }

    public DetourObject getDetour() {
        return this.detour;
    }

    public boolean getDisableInsecureEncryption() {
        return this.disableInsecureEncryption;
    }

    public void setClients(List<ClientObject> list) {
        this.clients = list;
    }

    public void setDefaultObject(DefaultObject defaultObject) {
        this.defaultObject = defaultObject;
    }

    public void setDetour(DetourObject detourObject) {
        this.detour = detourObject;
    }

    public void setDisableInsecureEncryption(boolean z) {
        this.disableInsecureEncryption = z;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{clients=");
        m4207.append(this.clients);
        m4207.append(", detour=");
        m4207.append(this.detour);
        m4207.append(", defaultObject=");
        m4207.append(this.defaultObject);
        m4207.append(", disableInsecureEncryption=");
        m4207.append(this.disableInsecureEncryption);
        m4207.append('}');
        return m4207.toString();
    }
}
