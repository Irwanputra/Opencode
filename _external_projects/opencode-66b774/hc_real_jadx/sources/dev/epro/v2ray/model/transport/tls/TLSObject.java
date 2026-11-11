package dev.epro.v2ray.model.transport.tls;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TLSObject {
    public boolean allowInsecure;
    public boolean allowInsecureCiphers;
    public List<String> alpn;
    public CertificateObject certificates;
    public boolean disableSystemRoot;
    public String serverName;

    public boolean getAllowInsecure() {
        return this.allowInsecure;
    }

    public boolean getAllowInsecureCiphers() {
        return this.allowInsecureCiphers;
    }

    public List<String> getAlpn() {
        return this.alpn;
    }

    public CertificateObject getCertificates() {
        return this.certificates;
    }

    public boolean getDisableSystemRoot() {
        return this.disableSystemRoot;
    }

    public String getServerName() {
        return this.serverName;
    }

    public void setAllowInsecure(boolean z) {
        this.allowInsecure = z;
    }

    public void setAllowInsecureCiphers(boolean z) {
        this.allowInsecureCiphers = z;
    }

    public void setAlpn(List<String> list) {
        this.alpn = list;
    }

    public void setCertificates(CertificateObject certificateObject) {
        this.certificates = certificateObject;
    }

    public void setDisableSystemRoot(boolean z) {
        this.disableSystemRoot = z;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("TLSObject{serverName='");
        C2098.m4202(m4207, this.serverName, '\'', ", alpn=");
        m4207.append(this.alpn);
        m4207.append(", allowInsecure=");
        m4207.append(this.allowInsecure);
        m4207.append(", allowInsecureCiphers=");
        m4207.append(this.allowInsecureCiphers);
        m4207.append(", disableSystemRoot=");
        m4207.append(this.disableSystemRoot);
        m4207.append(", certificates=");
        m4207.append(this.certificates);
        m4207.append('}');
        return m4207.toString();
    }
}
