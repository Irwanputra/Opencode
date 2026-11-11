package dev.epro.v2ray.model.transport.ds;

import p131.p155.p156.p157.C2098;
import p131.p161.p211.p212.InterfaceC2525;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DomainSocketObject {

    @InterfaceC2525("abstract")
    public boolean abstractObject;
    public boolean padding;
    public String path;

    public boolean getAbstractObject() {
        return this.abstractObject;
    }

    public boolean getPadding() {
        return this.padding;
    }

    public String getPath() {
        return this.path;
    }

    public void setAbstractObject(boolean z) {
        this.abstractObject = z;
    }

    public void setPadding(boolean z) {
        this.padding = z;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("DomainSocketObject{path='");
        C2098.m4202(m4207, this.path, '\'', ", abstractObject=");
        m4207.append(this.abstractObject);
        m4207.append(", padding=");
        m4207.append(this.padding);
        m4207.append('}');
        return m4207.toString();
    }
}
