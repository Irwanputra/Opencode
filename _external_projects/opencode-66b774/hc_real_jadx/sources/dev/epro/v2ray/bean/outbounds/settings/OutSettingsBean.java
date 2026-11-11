package dev.epro.v2ray.bean.outbounds.settings;

import dev.epro.v2ray.bean.outbounds.settings.vnext.VnextBean;
import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutSettingsBean {
    public Response response;
    public List<ServersBean> servers;
    public List<VnextBean> vnext;

    public Response getResponse() {
        return this.response;
    }

    public List<ServersBean> getServers() {
        return this.servers;
    }

    public List<VnextBean> getVnext() {
        return this.vnext;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public void setServers(List<ServersBean> list) {
        this.servers = list;
    }

    public void setVnext(List<VnextBean> list) {
        this.vnext = list;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("OutSettingsBean{vnext=");
        m4207.append(this.vnext);
        m4207.append(", servers=");
        m4207.append(this.servers);
        m4207.append(", response=");
        m4207.append(this.response);
        m4207.append('}');
        return m4207.toString();
    }
}
