package dev.epro.v2ray.util;

/* loaded from: /tmp/opencode/hc_real.dex */
public enum EConfigType {
    VMESS(1),
    CUSTOM(2),
    SHADOWSOCKS(3),
    SOCKS(4);

    public int value;

    EConfigType(int i) {
        this.value = i;
    }

    public static EConfigType fromInt(int i) {
        EConfigType[] values = values();
        for (int i2 = 0; i2 < 4; i2++) {
            EConfigType eConfigType = values[i2];
            if (eConfigType.value == i) {
                return eConfigType;
            }
        }
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
