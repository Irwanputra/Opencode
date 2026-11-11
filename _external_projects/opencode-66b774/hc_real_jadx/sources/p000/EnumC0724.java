package p000;

import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぺづげぺが, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public enum EnumC0724 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4805;

    EnumC0724(String str) {
        this.f4805 = str;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static EnumC0724 m1983(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "TLSv1.1":
                return TLS_1_1;
            case "TLSv1.2":
                return TLS_1_2;
            case "TLSv1.3":
                return TLS_1_3;
            case "SSLv3":
                return SSL_3_0;
            case "TLSv1":
                return TLS_1_0;
            default:
                throw new IllegalArgumentException(C2098.m4205("Unexpected TLS version: ", str));
        }
    }
}
