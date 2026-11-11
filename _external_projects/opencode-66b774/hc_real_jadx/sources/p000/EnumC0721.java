package p000;

import java.io.IOException;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぶでにく〼〳, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public enum EnumC0721 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");


    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String f4784;

    EnumC0721(String str) {
        this.f4784 = str;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static EnumC0721 m1980(String str) {
        EnumC0721 enumC0721 = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return enumC0721;
        }
        EnumC0721 enumC07212 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return enumC07212;
        }
        EnumC0721 enumC07213 = HTTP_2;
        if (str.equals("h2")) {
            return enumC07213;
        }
        EnumC0721 enumC07214 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return enumC07214;
        }
        EnumC0721 enumC07215 = QUIC;
        if (str.equals("quic")) {
            return enumC07215;
        }
        throw new IOException(C2098.m4205("Unexpected protocol: ", str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f4784;
    }
}
