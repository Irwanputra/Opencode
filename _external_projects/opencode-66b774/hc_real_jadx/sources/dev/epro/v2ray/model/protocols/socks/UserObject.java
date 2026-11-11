package dev.epro.v2ray.model.protocols.socks;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class UserObject {
    public int level;
    public String pass;
    public String user;

    public int getLevel() {
        return this.level;
    }

    public String getPass() {
        return this.pass;
    }

    public String getUser() {
        return this.user;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setPass(String str) {
        this.pass = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("UserObject{user='");
        C2098.m4202(m4207, this.user, '\'', ", pass='");
        C2098.m4202(m4207, this.pass, '\'', ", level=");
        return C2098.m4203(m4207, this.level, '}');
    }
}
