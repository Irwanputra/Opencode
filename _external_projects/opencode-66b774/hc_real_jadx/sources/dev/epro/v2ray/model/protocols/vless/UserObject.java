package dev.epro.v2ray.model.protocols.vless;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class UserObject {
    public String encryption;
    public String id;
    public int level;

    public String getEncryption() {
        return this.encryption;
    }

    public String getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public void setEncryption(String str) {
        this.encryption = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("UserObject{id='");
        C2098.m4202(m4207, this.id, '\'', ", encryption='");
        C2098.m4202(m4207, this.encryption, '\'', ", level=");
        return C2098.m4203(m4207, this.level, '}');
    }
}
