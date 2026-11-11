package dev.epro.v2ray.model.protocols.socks;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public AccountObject accounts;
    public String auth;
    public String ip;
    public boolean udp;
    public int userLevel;

    public AccountObject getAccounts() {
        return this.accounts;
    }

    public String getAuth() {
        return this.auth;
    }

    public String getIp() {
        return this.ip;
    }

    public boolean getUdp() {
        return this.udp;
    }

    public int getUserLevel() {
        return this.userLevel;
    }

    public void setAccounts(AccountObject accountObject) {
        this.accounts = accountObject;
    }

    public void setAuth(String str) {
        this.auth = str;
    }

    public void setIp(String str) {
        this.ip = str;
    }

    public void setUdp(boolean z) {
        this.udp = z;
    }

    public void setUserLevel(int i) {
        this.userLevel = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{auth='");
        C2098.m4202(m4207, this.auth, '\'', ", accounts=");
        m4207.append(this.accounts);
        m4207.append(", udp=");
        m4207.append(this.udp);
        m4207.append(", ip='");
        C2098.m4202(m4207, this.ip, '\'', ", userLevel=");
        return C2098.m4203(m4207, this.userLevel, '}');
    }
}
