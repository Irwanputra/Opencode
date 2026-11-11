package dev.epro.v2ray.model.protocols.http;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundConfigurationObject {
    public List<AccountObject> accounts;
    public boolean allowTransparent;
    public int timeout;
    public int userLevel;

    public List<AccountObject> getAccounts() {
        return this.accounts;
    }

    public boolean getAllowTransparent() {
        return this.allowTransparent;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public int getUserLevel() {
        return this.userLevel;
    }

    public void setAccounts(List<AccountObject> list) {
        this.accounts = list;
    }

    public void setAllowTransparent(boolean z) {
        this.allowTransparent = z;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public void setUserLevel(int i) {
        this.userLevel = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundConfigurationObject{timeout=");
        m4207.append(this.timeout);
        m4207.append(", accounts=");
        m4207.append(this.accounts);
        m4207.append(", allowTransparent=");
        m4207.append(this.allowTransparent);
        m4207.append(", userLevel=");
        return C2098.m4203(m4207, this.userLevel, '}');
    }
}
