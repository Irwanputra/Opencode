package dev.epro.v2ray.model.protocols.socks;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ServerObject {
    public String address;
    public int port;
    public UserObject users;

    public String getAddress() {
        return this.address;
    }

    public int getPort() {
        return this.port;
    }

    public UserObject getUsers() {
        return this.users;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setUsers(UserObject userObject) {
        this.users = userObject;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ServerObject{address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", users=");
        m4207.append(this.users);
        m4207.append('}');
        return m4207.toString();
    }
}
