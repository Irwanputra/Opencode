package dev.epro.v2ray.model.inbounds;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AllocateObject {
    public int concurrency;
    public int refresh;
    public String strategy;

    public int getConcurrency() {
        return this.concurrency;
    }

    public int getRefresh() {
        return this.refresh;
    }

    public String getStrategy() {
        return this.strategy;
    }

    public void setConcurrency(int i) {
        this.concurrency = i;
    }

    public void setRefresh(int i) {
        this.refresh = i;
    }

    public void setStrategy(String str) {
        this.strategy = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("AllocateObject{strategy='");
        C2098.m4202(m4207, this.strategy, '\'', ", refresh=");
        m4207.append(this.refresh);
        m4207.append(", concurrency=");
        return C2098.m4203(m4207, this.concurrency, '}');
    }
}
