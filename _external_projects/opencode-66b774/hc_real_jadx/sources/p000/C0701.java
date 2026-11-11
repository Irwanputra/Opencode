package p000;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.じぜこほぱ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0701 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Proxy f4666;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InetSocketAddress f4667;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0694 f4668;

    public C0701(C0694 c0694, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0694 == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f4668 = c0694;
        this.f4666 = proxy;
        this.f4667 = inetSocketAddress;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C0701) {
            C0701 c0701 = (C0701) obj;
            if (c0701.f4668.equals(this.f4668) && c0701.f4666.equals(this.f4666) && c0701.f4667.equals(this.f4667)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f4667.hashCode() + ((this.f4666.hashCode() + ((this.f4668.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder m4207 = C2098.m4207("Route{");
        m4207.append(this.f4667);
        m4207.append("}");
        return m4207.toString();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m1966() {
        return this.f4668.f4624 != null && this.f4666.type() == Proxy.Type.HTTP;
    }
}
