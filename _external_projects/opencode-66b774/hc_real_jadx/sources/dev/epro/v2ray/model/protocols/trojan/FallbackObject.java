package dev.epro.v2ray.model.protocols.trojan;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class FallbackObject {
    public String alpn;
    public String dest;
    public String path;
    public int xver;

    public String getAlpn() {
        return this.alpn;
    }

    public String getDest() {
        return this.dest;
    }

    public String getPath() {
        return this.path;
    }

    public int getXver() {
        return this.xver;
    }

    public void setAlpn(String str) {
        this.alpn = str;
    }

    public void setDest(String str) {
        this.dest = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setXver(int i) {
        this.xver = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("FallbackObject{alpn='");
        C2098.m4202(m4207, this.alpn, '\'', ", path='");
        C2098.m4202(m4207, this.path, '\'', ", dest='");
        C2098.m4202(m4207, this.dest, '\'', ", xver=");
        return C2098.m4203(m4207, this.xver, '}');
    }
}
