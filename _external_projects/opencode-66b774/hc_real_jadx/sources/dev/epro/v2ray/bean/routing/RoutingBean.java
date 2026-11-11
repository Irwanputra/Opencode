package dev.epro.v2ray.bean.routing;

import java.util.ArrayList;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RoutingBean {
    public String domainStrategy;
    public ArrayList<RulesBean> rules;

    public String getDomainStrategy() {
        return this.domainStrategy;
    }

    public ArrayList<RulesBean> getRules() {
        return this.rules;
    }

    public void setDomainStrategy(String str) {
        this.domainStrategy = str;
    }

    public void setRules(ArrayList<RulesBean> arrayList) {
        this.rules = arrayList;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("RoutingBean{domainStrategy='");
        C2098.m4202(m4207, this.domainStrategy, '\'', ", rules=");
        m4207.append(this.rules);
        m4207.append('}');
        return m4207.toString();
    }
}
