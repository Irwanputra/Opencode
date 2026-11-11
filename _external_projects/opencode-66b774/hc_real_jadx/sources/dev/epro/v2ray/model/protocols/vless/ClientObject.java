package dev.epro.v2ray.model.protocols.vless;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ClientObject {
    public String email;
    public String id;
    public int level;

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ClientObject{id='");
        C2098.m4202(m4207, this.id, '\'', ", level=");
        m4207.append(this.level);
        m4207.append(", email='");
        return C2098.m4194(m4207, this.email, '\'', '}');
    }
}
