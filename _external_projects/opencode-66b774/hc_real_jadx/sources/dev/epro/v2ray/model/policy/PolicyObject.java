package dev.epro.v2ray.model.policy;

import java.util.Map;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PolicyObject {
    public Map<String, LevelPolicyObject> levels;
    public SystemPolicyObject system;

    public Map<String, LevelPolicyObject> getLevels() {
        return this.levels;
    }

    public SystemPolicyObject getSystem() {
        return this.system;
    }

    public void setLevels(Map<String, LevelPolicyObject> map) {
        this.levels = map;
    }

    public void setSystem(SystemPolicyObject systemPolicyObject) {
        this.system = systemPolicyObject;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("PolicyObject{levels=");
        m4207.append(this.levels);
        m4207.append(", system=");
        m4207.append(this.system);
        m4207.append('}');
        return m4207.toString();
    }
}
