package p000.p001.p003;

import java.net.ProtocolException;
import p000.EnumC0721;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぁごぐすすぃ.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0618 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int f4309;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f4310;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final EnumC0721 f4311;

    public C0618(EnumC0721 enumC0721, int i, String str) {
        this.f4311 = enumC0721;
        this.f4309 = i;
        this.f4310 = str;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C0618 m1779(String str) {
        String str2;
        EnumC0721 enumC0721 = EnumC0721.HTTP_1_0;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(C2098.m4205("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException(C2098.m4205("Unexpected status line: ", str));
                }
                enumC0721 = EnumC0721.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException(C2098.m4205("Unexpected status line: ", str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException(C2098.m4205("Unexpected status line: ", str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException(C2098.m4205("Unexpected status line: ", str));
                }
                str2 = str.substring(i + 4);
            }
            return new C0618(enumC0721, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException(C2098.m4205("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4311 == EnumC0721.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f4309);
        if (this.f4310 != null) {
            sb.append(' ');
            sb.append(this.f4310);
        }
        return sb.toString();
    }
}
