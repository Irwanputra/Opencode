package dev.epro.v2ray.bean.outbounds.settings;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ServersBean {
    public String address;
    public int level;
    public String method;
    public boolean ota;
    public String password;
    public int port;

    public String getAddress() {
        return this.address;
    }

    public int getLevel() {
        return this.level;
    }

    public String getMethod() {
        return this.method;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPort() {
        return this.port;
    }

    public boolean isOta() {
        return this.ota;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setOta(boolean z) {
        this.ota = z;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ServersBean{address='");
        C2098.m4202(m4207, this.address, '\'', ", method='");
        C2098.m4202(m4207, this.method, '\'', ", ota=");
        m4207.append(this.ota);
        m4207.append(", password='");
        C2098.m4202(m4207, this.password, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", level=");
        return C2098.m4203(m4207, this.level, '}');
    }
}
