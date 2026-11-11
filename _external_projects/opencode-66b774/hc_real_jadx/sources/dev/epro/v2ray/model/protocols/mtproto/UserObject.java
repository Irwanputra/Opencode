package dev.epro.v2ray.model.protocols.mtproto;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class UserObject {
    public String email;
    public int level;
    public String secret;

    public String getEmail() {
        return this.email;
    }

    public int getLevel() {
        return this.level;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setSecret(String str) {
        this.secret = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("UserObject{email='");
        C2098.m4202(m4207, this.email, '\'', ", level=");
        m4207.append(this.level);
        m4207.append(", secret='");
        return C2098.m4194(m4207, this.secret, '\'', '}');
    }
}
