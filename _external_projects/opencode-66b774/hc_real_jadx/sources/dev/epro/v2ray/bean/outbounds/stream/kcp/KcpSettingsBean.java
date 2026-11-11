package dev.epro.v2ray.bean.outbounds.stream.kcp;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class KcpSettingsBean {
    public int mtu = 1350;
    public int tti = 20;
    public int uplinkCapacity = 12;
    public int downlinkCapacity = 100;
    public boolean congestion = false;
    public int readBufferSize = 1;
    public int writeBufferSize = 1;
    public HeaderBean header = new HeaderBean();

    public int getDownlinkCapacity() {
        return this.downlinkCapacity;
    }

    public HeaderBean getHeader() {
        return this.header;
    }

    public int getMtu() {
        return this.mtu;
    }

    public int getReadBufferSize() {
        return this.readBufferSize;
    }

    public int getTti() {
        return this.tti;
    }

    public int getUplinkCapacity() {
        return this.uplinkCapacity;
    }

    public int getWriteBufferSize() {
        return this.writeBufferSize;
    }

    public boolean isCongestion() {
        return this.congestion;
    }

    public void setCongestion(boolean z) {
        this.congestion = z;
    }

    public void setDownlinkCapacity(int i) {
        this.downlinkCapacity = i;
    }

    public void setHeader(HeaderBean headerBean) {
        this.header = headerBean;
    }

    public void setMtu(int i) {
        this.mtu = i;
    }

    public void setReadBufferSize(int i) {
        this.readBufferSize = i;
    }

    public void setTti(int i) {
        this.tti = i;
    }

    public void setUplinkCapacity(int i) {
        this.uplinkCapacity = i;
    }

    public void setWriteBufferSize(int i) {
        this.writeBufferSize = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("KcpSettingsBean{mtu=");
        m4207.append(this.mtu);
        m4207.append(", tti=");
        m4207.append(this.tti);
        m4207.append(", uplinkCapacity=");
        m4207.append(this.uplinkCapacity);
        m4207.append(", downlinkCapacity=");
        m4207.append(this.downlinkCapacity);
        m4207.append(", congestion=");
        m4207.append(this.congestion);
        m4207.append(", readBufferSize=");
        m4207.append(this.readBufferSize);
        m4207.append(", writeBufferSize=");
        m4207.append(this.writeBufferSize);
        m4207.append(", header=");
        m4207.append(this.header);
        m4207.append('}');
        return m4207.toString();
    }
}
