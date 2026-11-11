package dev.epro.v2ray.model.outbounds;

import dev.epro.v2ray.model.inbounds.StreamSettingsObject;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutboundObject {
    public MuxObject mux;
    public String protocol;
    public ProxySettingsObject proxySettings;
    public String sendThrough;
    public Object settings;
    public StreamSettingsObject streamSettings;
    public String tag;

    public MuxObject getMux() {
        return this.mux;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public ProxySettingsObject getProxySettings() {
        return this.proxySettings;
    }

    public String getSendThrough() {
        return this.sendThrough;
    }

    public Object getSettings() {
        return this.settings;
    }

    public StreamSettingsObject getStreamSettings() {
        return this.streamSettings;
    }

    public String getTag() {
        return this.tag;
    }

    public void setMux(MuxObject muxObject) {
        this.mux = muxObject;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setProxySettings(ProxySettingsObject proxySettingsObject) {
        this.proxySettings = proxySettingsObject;
    }

    public void setSendThrough(String str) {
        this.sendThrough = str;
    }

    public void setSettings(Object obj) {
        this.settings = obj;
    }

    public void setStreamSettings(StreamSettingsObject streamSettingsObject) {
        this.streamSettings = streamSettingsObject;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("OutboundObject{sendThrough='");
        C2098.m4202(m4207, this.sendThrough, '\'', ", protocol='");
        C2098.m4202(m4207, this.protocol, '\'', ", settings=");
        m4207.append(this.settings);
        m4207.append(", tag='");
        C2098.m4202(m4207, this.tag, '\'', ", streamSettings=");
        m4207.append(this.streamSettings);
        m4207.append(", proxySettings=");
        m4207.append(this.proxySettings);
        m4207.append(", mux=");
        m4207.append(this.mux);
        m4207.append('}');
        return m4207.toString();
    }
}
