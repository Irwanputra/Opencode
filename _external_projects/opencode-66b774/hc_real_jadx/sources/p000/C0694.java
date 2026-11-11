package p000;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p000.C0698;
import p000.p001.C0629;
import p131.p155.p156.p157.C2098;

/* renamed from: 〳ぜぞぜべっ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0694 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    @Nullable
    public final Proxy f4615;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC0704 f4616;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final ProxySelector f4617;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    @Nullable
    public final HostnameVerifier f4618;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final SocketFactory f4619;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0698 f4620;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final List<EnumC0721> f4621;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final List<C0582> f4622;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final InterfaceC0584 f4623;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    @Nullable
    public final SSLSocketFactory f4624;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    @Nullable
    public final C0702 f4625;

    public C0694(String str, int i, InterfaceC0704 interfaceC0704, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C0702 c0702, InterfaceC0584 interfaceC0584, @Nullable Proxy proxy, List<EnumC0721> list, List<C0582> list2, ProxySelector proxySelector) {
        C0698.C0699 c0699 = new C0698.C0699();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (!str3.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException(C2098.m4205("unexpected scheme: ", str3));
        }
        c0699.f4656 = str2;
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String m1804 = C0629.m1804(C0698.m1952(str, 0, str.length(), false));
        if (m1804 == null) {
            throw new IllegalArgumentException(C2098.m4205("unexpected host: ", str));
        }
        c0699.f4659 = m1804;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(C2098.m4208("unexpected port: ", i));
        }
        c0699.f4657 = i;
        this.f4620 = c0699.m1965();
        if (interfaceC0704 == null) {
            throw new NullPointerException("dns == null");
        }
        this.f4616 = interfaceC0704;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f4619 = socketFactory;
        if (interfaceC0584 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f4623 = interfaceC0584;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f4621 = C0629.m1810(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f4622 = C0629.m1810(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f4617 = proxySelector;
        this.f4615 = proxy;
        this.f4624 = sSLSocketFactory;
        this.f4618 = hostnameVerifier;
        this.f4625 = c0702;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C0694) {
            C0694 c0694 = (C0694) obj;
            if (this.f4620.equals(c0694.f4620) && m1943(c0694)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f4617.hashCode() + ((this.f4622.hashCode() + ((this.f4621.hashCode() + ((this.f4623.hashCode() + ((this.f4616.hashCode() + ((this.f4620.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f4615;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f4624;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f4618;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C0702 c0702 = this.f4625;
        return hashCode4 + (c0702 != null ? c0702.hashCode() : 0);
    }

    public String toString() {
        Object obj;
        StringBuilder m4207 = C2098.m4207("Address{");
        m4207.append(this.f4620.f4650);
        m4207.append(":");
        m4207.append(this.f4620.f4648);
        if (this.f4615 != null) {
            m4207.append(", proxy=");
            obj = this.f4615;
        } else {
            m4207.append(", proxySelector=");
            obj = this.f4617;
        }
        m4207.append(obj);
        m4207.append("}");
        return m4207.toString();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean m1943(C0694 c0694) {
        return this.f4616.equals(c0694.f4616) && this.f4623.equals(c0694.f4623) && this.f4621.equals(c0694.f4621) && this.f4622.equals(c0694.f4622) && this.f4617.equals(c0694.f4617) && C0629.m1817(this.f4615, c0694.f4615) && C0629.m1817(this.f4624, c0694.f4624) && C0629.m1817(this.f4618, c0694.f4618) && C0629.m1817(this.f4625, c0694.f4625) && this.f4620.f4648 == c0694.f4620.f4648;
    }
}
