package dev.epro.v2ray.model.routing;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RoutingObject {
    public List<BalancerObject> balancerObject;
    public String domainStrategy;
    public List<RuleObject> ruleObject;

    public List<BalancerObject> getBalancerObject() {
        return this.balancerObject;
    }

    public String getDomainStrategy() {
        return this.domainStrategy;
    }

    public List<RuleObject> getRuleObject() {
        return this.ruleObject;
    }

    public void setBalancerObject(List<BalancerObject> list) {
        this.balancerObject = list;
    }

    public void setDomainStrategy(String str) {
        this.domainStrategy = str;
    }

    public void setRuleObject(List<RuleObject> list) {
        this.ruleObject = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("RoutingObject{domainStrategy='");
        C2098.m4202(m4207, this.domainStrategy, '\'', ", ruleObject=");
        m4207.append(this.ruleObject);
        m4207.append(", balancerObject=");
        return C2098.m4178(m4207, this.balancerObject, '}');
    }
}
