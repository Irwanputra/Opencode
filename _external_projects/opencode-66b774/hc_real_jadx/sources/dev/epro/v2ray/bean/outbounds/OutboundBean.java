package dev.epro.v2ray.bean.outbounds;

import dev.epro.v2ray.bean.outbounds.settings.OutSettingsBean;
import dev.epro.v2ray.bean.outbounds.stream.StreamSettingsBean;
import dev.epro.v2ray.util.EConfigType;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class OutboundBean {
    public MuxBean mux;
    public String protocol;
    public OutSettingsBean settings;
    public StreamSettingsBean streamSettings;
    public String tag;

    public MuxBean getMux() {
        return this.mux;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getServerAddress() {
        if (this.protocol.equals(EConfigType.VMESS.name().toLowerCase())) {
            return this.settings.getVnext().get(0).getAddress();
        }
        if (this.protocol.equals(EConfigType.SHADOWSOCKS.name().toLowerCase()) || this.protocol.equals(EConfigType.SOCKS.name().toLowerCase())) {
            return this.settings.getServers().get(0).getAddress();
        }
        return null;
    }

    public Integer getServerPort() {
        int port;
        if (this.protocol.equals(EConfigType.VMESS.name().toLowerCase())) {
            port = this.settings.getVnext().get(0).getPort();
        } else {
            if (!this.protocol.equals(EConfigType.SHADOWSOCKS.name().toLowerCase()) && !this.protocol.equals(EConfigType.SOCKS.name().toLowerCase())) {
                return null;
            }
            port = this.settings.getServers().get(0).getPort();
        }
        return Integer.valueOf(port);
    }

    public OutSettingsBean getSettings() {
        return this.settings;
    }

    public StreamSettingsBean getStreamSettings() {
        return this.streamSettings;
    }

    public String getTag() {
        return this.tag;
    }

    public void setMux(MuxBean muxBean) {
        this.mux = muxBean;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setSettings(OutSettingsBean outSettingsBean) {
        this.settings = outSettingsBean;
    }

    public void setStreamSettings(StreamSettingsBean streamSettingsBean) {
        this.streamSettings = streamSettingsBean;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("OutboundBean{tag='");
        C2098.m4202(m4207, this.tag, '\'', ", protocol='");
        C2098.m4202(m4207, this.protocol, '\'', ", settings=");
        m4207.append(this.settings);
        m4207.append(", streamSettings=");
        m4207.append(this.streamSettings);
        m4207.append(", mux=");
        m4207.append(this.mux);
        m4207.append('}');
        return m4207.toString();
    }
}
