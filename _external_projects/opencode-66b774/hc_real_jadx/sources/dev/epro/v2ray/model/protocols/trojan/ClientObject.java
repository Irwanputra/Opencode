package dev.epro.v2ray.model.protocols.trojan;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ClientObject {
    public String email;
    public int level;
    public String password;

    public String getEmail() {
        return this.email;
    }

    public int getLevel() {
        return this.level;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ClientObject{password='");
        C2098.m4202(m4207, this.password, '\'', ", email='");
        C2098.m4202(m4207, this.email, '\'', ", level=");
        return C2098.m4203(m4207, this.level, '}');
    }
}
