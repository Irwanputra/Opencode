package dev.epro.v2ray.model.inbounds;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class InboundObject {
    public AllocateObject allocate;
    public String listen;
    public String port;
    public String protocol;
    public Object settings;
    public SniffingObject sniffing;
    public StreamSettingsObject streamSettings;
    public String tag;

    public AllocateObject getAllocate() {
        return this.allocate;
    }

    public String getListen() {
        return this.listen;
    }

    public String getPort() {
        return this.port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public Object getSettings() {
        return this.settings;
    }

    public SniffingObject getSniffing() {
        return this.sniffing;
    }

    public StreamSettingsObject getStreamSettings() {
        return this.streamSettings;
    }

    public String getTag() {
        return this.tag;
    }

    public void setAllocate(AllocateObject allocateObject) {
        this.allocate = allocateObject;
    }

    public void setListen(String str) {
        this.listen = str;
    }

    public void setPort(String str) {
        this.port = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setSettings(Object obj) {
        this.settings = obj;
    }

    public void setSniffing(SniffingObject sniffingObject) {
        this.sniffing = sniffingObject;
    }

    public void setStreamSettings(StreamSettingsObject streamSettingsObject) {
        this.streamSettings = streamSettingsObject;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("InboundObject{port='");
        C2098.m4202(m4207, this.port, '\'', ", listen='");
        C2098.m4202(m4207, this.listen, '\'', ", protocol='");
        C2098.m4202(m4207, this.protocol, '\'', ", settings=");
        m4207.append(this.settings);
        m4207.append(", streamSettings=");
        m4207.append(this.streamSettings);
        m4207.append(", tag='");
        C2098.m4202(m4207, this.tag, '\'', ", sniffing=");
        m4207.append(this.sniffing);
        m4207.append(", allocate=");
        m4207.append(this.allocate);
        m4207.append('}');
        return m4207.toString();
    }
}
