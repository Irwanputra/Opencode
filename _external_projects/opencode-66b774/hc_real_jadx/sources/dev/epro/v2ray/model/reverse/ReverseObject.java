package dev.epro.v2ray.model.reverse;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ReverseObject {
    public List<BridgeObject> bridges;
    public List<PortalObject> portals;

    public List<BridgeObject> getBridges() {
        return this.bridges;
    }

    public List<PortalObject> getPortals() {
        return this.portals;
    }

    public void setBridges(List<BridgeObject> list) {
        this.bridges = list;
    }

    public void setPortals(List<PortalObject> list) {
        this.portals = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ReverseObject{bridges=");
        m4207.append(this.bridges);
        m4207.append(", portals=");
        return C2098.m4178(m4207, this.portals, '}');
    }
}
