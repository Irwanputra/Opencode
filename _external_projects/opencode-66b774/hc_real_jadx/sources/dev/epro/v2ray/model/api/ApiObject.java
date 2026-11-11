package dev.epro.v2ray.model.api;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ApiObject {
    public List<String> services;
    public String tag;

    public List<String> getServices() {
        return this.services;
    }

    public String getTag() {
        return this.tag;
    }

    public void setServices(List<String> list) {
        this.services = list;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("ApiObject{tag='");
        C2098.m4202(m4207, this.tag, '\'', ", services=");
        return C2098.m4178(m4207, this.services, '}');
    }
}
