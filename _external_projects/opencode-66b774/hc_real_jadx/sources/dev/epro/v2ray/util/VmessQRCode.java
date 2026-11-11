package dev.epro.v2ray.util;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class VmessQRCode {
    public String v = "";
    public String ps = "";
    public String add = "";
    public String port = "";
    public String id = "";
    public String aid = "";

    /* renamed from: net, reason: collision with root package name */
    public String f10540net = "";
    public String type = "";
    public String host = "";
    public String path = "";
    public String tls = "";

    public String getAdd() {
        return this.add;
    }

    public String getAid() {
        return this.aid;
    }

    public String getHost() {
        return this.host;
    }

    public String getId() {
        return this.id;
    }

    public String getNet() {
        return this.f10540net;
    }

    public String getPath() {
        return this.path;
    }

    public String getPort() {
        return this.port;
    }

    public String getPs() {
        return this.ps;
    }

    public String getTls() {
        return this.tls;
    }

    public String getType() {
        return this.type;
    }

    public String getV() {
        return this.v;
    }

    public void setAdd(String str) {
        this.add = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNet(String str) {
        this.f10540net = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPort(String str) {
        this.port = str;
    }

    public void setPs(String str) {
        this.ps = str;
    }

    public void setTls(String str) {
        this.tls = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setV(String str) {
        this.v = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("VmessQRCode{v='");
        C2098.m4202(m4207, this.v, '\'', ", ps='");
        C2098.m4202(m4207, this.ps, '\'', ", add='");
        C2098.m4202(m4207, this.add, '\'', ", port='");
        C2098.m4202(m4207, this.port, '\'', ", id='");
        C2098.m4202(m4207, this.id, '\'', ", aid='");
        C2098.m4202(m4207, this.aid, '\'', ", net='");
        C2098.m4202(m4207, this.f10540net, '\'', ", type='");
        C2098.m4202(m4207, this.type, '\'', ", host='");
        C2098.m4202(m4207, this.host, '\'', ", path='");
        C2098.m4202(m4207, this.path, '\'', ", tls='");
        return C2098.m4194(m4207, this.tls, '\'', '}');
    }
}
