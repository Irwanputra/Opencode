package dev.epro.v2ray.bean.outbounds.settings.vnext;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class VnextBean {
    public String address;
    public int port;
    public List<UsersBean> users;

    public String getAddress() {
        return this.address;
    }

    public int getPort() {
        return this.port;
    }

    public List<UsersBean> getUsers() {
        return this.users;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setUsers(List<UsersBean> list) {
        this.users = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("VnextBean{address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", users=");
        return C2098.m4178(m4207, this.users, '}');
    }
}
