package dev.epro.v2ray.model.protocols.trojan;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ServerObject {
    public String address;
    public String email;
    public int level;
    public String password;
    public int port;

    public String getAddress() {
        return this.address;
    }

    public String getEmail() {
        return this.email;
    }

    public int getLevel() {
        return this.level;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPort() {
        return this.port;
    }

    public void setAddress(String str) {
        this.address = str;
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

    public void setPort(int i) {
        this.port = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ServerObject{address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", password='");
        C2098.m4202(m4207, this.password, '\'', ", email='");
        C2098.m4202(m4207, this.email, '\'', ", level=");
        return C2098.m4203(m4207, this.level, '}');
    }
}
