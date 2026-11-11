package dev.epro.v2ray.model.transport.sock;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SockoptObject {
    public int mark;
    public boolean tcpFastOpen;
    public String tproxy;

    public int getMark() {
        return this.mark;
    }

    public boolean getTcpFastOpen() {
        return this.tcpFastOpen;
    }

    public String getTproxy() {
        return this.tproxy;
    }

    public void setMark(int i) {
        this.mark = i;
    }

    public void setTcpFastOpen(boolean z) {
        this.tcpFastOpen = z;
    }

    public void setTproxy(String str) {
        this.tproxy = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("SockoptObject{mark=");
        m4207.append(this.mark);
        m4207.append(", tcpFastOpen=");
        m4207.append(this.tcpFastOpen);
        m4207.append(", tproxy='");
        return C2098.m4194(m4207, this.tproxy, '\'', '}');
    }
}
