package dev.epro.v2ray.model.transport.tls;

import java.util.List;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CertificateObject {
    public List<String> certificate;
    public String certificateFile;
    public List<String> key;
    public String keyFile;
    public String usage;

    public List<String> getCertificate() {
        return this.certificate;
    }

    public String getCertificateFile() {
        return this.certificateFile;
    }

    public List<String> getKey() {
        return this.key;
    }

    public String getKeyFile() {
        return this.keyFile;
    }

    public String getUsage() {
        return this.usage;
    }

    public void setCertificate(List<String> list) {
        this.certificate = list;
    }

    public void setCertificateFile(String str) {
        this.certificateFile = str;
    }

    public void setKey(List<String> list) {
        this.key = list;
    }

    public void setKeyFile(String str) {
        this.keyFile = str;
    }

    public void setUsage(String str) {
        this.usage = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("CertificateObject{usage='");
        C2098.m4202(m4207, this.usage, '\'', ", certificateFile='");
        C2098.m4202(m4207, this.certificateFile, '\'', ", certificate=");
        m4207.append(this.certificate);
        m4207.append(", keyFile='");
        C2098.m4202(m4207, this.keyFile, '\'', ", key=");
        return C2098.m4178(m4207, this.key, '}');
    }
}
