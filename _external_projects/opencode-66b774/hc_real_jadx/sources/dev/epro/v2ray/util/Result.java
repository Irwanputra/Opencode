package dev.epro.v2ray.util;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class Result {
    public String content;
    public Boolean status;

    public Result(Boolean bool, String str) {
        this.status = bool;
        this.content = str;
    }

    public String getContent() {
        return this.content;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(Boolean bool) {
        this.status = bool;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Result{status=");
        m4207.append(this.status);
        m4207.append(", content='");
        return C2098.m4194(m4207, this.content, '\'', '}');
    }
}
