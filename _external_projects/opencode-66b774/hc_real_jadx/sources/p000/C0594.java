package p000;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p000.p001.C0629;

/* renamed from: 〳ぜぞぜべっ.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0594 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0710 f4242;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final List<Certificate> f4243;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final EnumC0724 f4244;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final List<Certificate> f4245;

    public C0594(EnumC0724 enumC0724, C0710 c0710, List<Certificate> list, List<Certificate> list2) {
        this.f4244 = enumC0724;
        this.f4242 = c0710;
        this.f4243 = list;
        this.f4245 = list2;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C0594 m1732(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        C0710 m1972 = C0710.m1972(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        EnumC0724 m1983 = EnumC0724.m1983(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List m1808 = certificateArr != null ? C0629.m1808(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C0594(m1983, m1972, m1808, localCertificates != null ? C0629.m1808(localCertificates) : Collections.emptyList());
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0594)) {
            return false;
        }
        C0594 c0594 = (C0594) obj;
        return this.f4244.equals(c0594.f4244) && this.f4242.equals(c0594.f4242) && this.f4243.equals(c0594.f4243) && this.f4245.equals(c0594.f4245);
    }

    public int hashCode() {
        return this.f4245.hashCode() + ((this.f4243.hashCode() + ((this.f4242.hashCode() + ((this.f4244.hashCode() + 527) * 31)) * 31)) * 31);
    }
}
