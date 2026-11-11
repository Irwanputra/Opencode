package dev.epro.v2ray.model.transport.kcp;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class KcpObject {
    public boolean congestion;
    public int downlinkCapacity;
    public HeaderObject header;
    public int mtu;
    public int readBufferSize;
    public String seed;
    public int tti;
    public int uplinkCapacity;
    public int writeBufferSize;

    public boolean getCongestion() {
        return this.congestion;
    }

    public int getDownlinkCapacity() {
        return this.downlinkCapacity;
    }

    public HeaderObject getHeader() {
        return this.header;
    }

    public int getMtu() {
        return this.mtu;
    }

    public int getReadBufferSize() {
        return this.readBufferSize;
    }

    public String getSeed() {
        return this.seed;
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

    public void setCongestion(boolean z) {
        this.congestion = z;
    }

    public void setDownlinkCapacity(int i) {
        this.downlinkCapacity = i;
    }

    public void setHeader(HeaderObject headerObject) {
        this.header = headerObject;
    }

    public void setMtu(int i) {
        this.mtu = i;
    }

    public void setReadBufferSize(int i) {
        this.readBufferSize = i;
    }

    public void setSeed(String str) {
        this.seed = str;
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
        StringBuilder m4207 = C2098.m4207("KcpObject{mtu=");
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
        m4207.append(", seed='");
        return C2098.m4194(m4207, this.seed, '\'', '}');
    }
}
