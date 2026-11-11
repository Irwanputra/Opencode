package dev.epro.v2ray.model.routing;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BalancerObject {
    public List<String> selector;
    public String tag;

    public List<String> getSelector() {
        return this.selector;
    }

    public String getTag() {
        return this.tag;
    }

    public void setSelector(List<String> list) {
        this.selector = list;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("BalancerObject{tag='");
        C2098.m4202(m4207, this.tag, '\'', ", selector=");
        return C2098.m4178(m4207, this.selector, '}');
    }
}
