package dev.epro.v2ray.util;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class VmessBean {
    public String guid = "123456";
    public String address = "v2ray.cool";
    public int port = 10086;
    public String id = "a3482e88-686a-4a58-8126-99c9df64b7bf";
    public int alterId = 64;
    public String security = "aes-128-cfb";
    public String network = "tcp";
    public String remarks = "def";
    public String headerType = "";
    public String requestHost = "";
    public String path = "";
    public String streamSecurity = "none";
    public int configType = 1;
    public int configVersion = 1;
    public String testResult = "";
    public String subid = "";

    public String getAddress() {
        return this.address;
    }

    public int getAlterId() {
        return this.alterId;
    }

    public int getConfigType() {
        return this.configType;
    }

    public int getConfigVersion() {
        return this.configVersion;
    }

    public String getGuid() {
        return this.guid;
    }

    public String getHeaderType() {
        return this.headerType;
    }

    public String getId() {
        return this.id;
    }

    public String getNetwork() {
        return this.network;
    }

    public String getPath() {
        return this.path;
    }

    public int getPort() {
        return this.port;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getRequestHost() {
        return this.requestHost;
    }

    public String getSecurity() {
        return this.security;
    }

    public String getStreamSecurity() {
        return this.streamSecurity;
    }

    public String getSubid() {
        return this.subid;
    }

    public String getTestResult() {
        return this.testResult;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setAlterId(int i) {
        this.alterId = i;
    }

    public void setConfigType(int i) {
        this.configType = i;
    }

    public void setConfigVersion(int i) {
        this.configVersion = i;
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public void setHeaderType(String str) {
        this.headerType = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public void setRequestHost(String str) {
        this.requestHost = str;
    }

    public void setSecurity(String str) {
        this.security = str;
    }

    public void setStreamSecurity(String str) {
        this.streamSecurity = str;
    }

    public void setSubid(String str) {
        this.subid = str;
    }

    public void setTestResult(String str) {
        this.testResult = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("VmessBean{guid='");
        C2098.m4202(m4207, this.guid, '\'', ", address='");
        C2098.m4202(m4207, this.address, '\'', ", port=");
        m4207.append(this.port);
        m4207.append(", id='");
        C2098.m4202(m4207, this.id, '\'', ", alterId=");
        m4207.append(this.alterId);
        m4207.append(", security='");
        C2098.m4202(m4207, this.security, '\'', ", network='");
        C2098.m4202(m4207, this.network, '\'', ", remarks='");
        C2098.m4202(m4207, this.remarks, '\'', ", headerType='");
        C2098.m4202(m4207, this.headerType, '\'', ", requestHost='");
        C2098.m4202(m4207, this.requestHost, '\'', ", path='");
        C2098.m4202(m4207, this.path, '\'', ", streamSecurity='");
        C2098.m4202(m4207, this.streamSecurity, '\'', ", configType=");
        m4207.append(this.configType);
        m4207.append(", configVersion=");
        m4207.append(this.configVersion);
        m4207.append(", testResult='");
        C2098.m4202(m4207, this.testResult, '\'', ", subid='");
        return C2098.m4194(m4207, this.subid, '\'', '}');
    }
}
