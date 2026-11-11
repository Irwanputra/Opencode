package dev.epro.v2ray.model.protocols.mtproto;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public UserObject user;

    public UserObject getUser() {
        return this.user;
    }

    public void setUser(UserObject userObject) {
        this.user = userObject;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{user=");
        m4207.append(this.user);
        m4207.append('}');
        return m4207.toString();
    }
}
