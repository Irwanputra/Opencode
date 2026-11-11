package dev.epro.v2ray.bean;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LogBean {
    private String access;
    private String error;
    private String loglevel;

    public String getAccess() {
        return this.access;
    }

    public String getError() {
        return this.error;
    }

    public String getLoglevel() {
        return this.loglevel;
    }

    public void setAccess(String str) {
        this.access = str;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setLoglevel(String str) {
        this.loglevel = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("LogBean{access='");
        C2098.m4202(m4207, this.access, '\'', ", error='");
        C2098.m4202(m4207, this.error, '\'', ", loglevel='");
        return C2098.m4194(m4207, this.loglevel, '\'', '}');
    }
}
