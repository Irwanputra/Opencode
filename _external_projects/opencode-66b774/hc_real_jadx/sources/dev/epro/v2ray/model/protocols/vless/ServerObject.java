package dev.epro.v2ray.model.protocols.vless;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ServerObject {
    public String address;
    public int number;

    public String getAddress() {
        return this.address;
    }

    public int getNumber() {
        return this.number;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setNumber(int i) {
        this.number = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ServerObject{address='");
        C2098.m4202(m4207, this.address, '\'', ", number=");
        return C2098.m4203(m4207, this.number, '}');
    }
}
