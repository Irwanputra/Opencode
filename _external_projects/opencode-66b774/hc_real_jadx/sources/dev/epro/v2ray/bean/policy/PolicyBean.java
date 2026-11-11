package dev.epro.v2ray.bean.policy;

import java.util.Map;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PolicyBean {
    public Map<String, LevelBean> levels;
    public Object system;

    public Map<String, LevelBean> getLevels() {
        return this.levels;
    }

    public Object getSystem() {
        return this.system;
    }

    public void setLevels(Map<String, LevelBean> map) {
        this.levels = map;
    }

    public void setSystem(Object obj) {
        this.system = obj;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("PolicyBean{levels=");
        m4207.append(this.levels);
        m4207.append(", system=");
        m4207.append(this.system);
        m4207.append('}');
        return m4207.toString();
    }
}
