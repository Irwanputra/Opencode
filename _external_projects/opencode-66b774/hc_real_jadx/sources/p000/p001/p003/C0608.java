package p000.p001.p003;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p000.AbstractC0719;
import p000.C0595;
import p000.C0694;
import p000.C0698;
import p000.C0702;
import p000.C0706;
import p000.C0712;
import p000.InterfaceC0717;
import p000.p001.p007.C0643;
import p000.p001.p007.C0648;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.ぁごぐすすぃ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0608 implements InterfaceC0717 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean f4283;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public volatile C0643 f4284;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C0706 f4285;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public volatile boolean f4286;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Object f4287;

    public C0608(C0706 c0706, boolean z) {
        this.f4285 = c0706;
        this.f4283 = z;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C0694 m1766(C0698 c0698) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C0702 c0702;
        if (c0698.f4647.equals("https")) {
            C0706 c0706 = this.f4285;
            SSLSocketFactory sSLSocketFactory2 = c0706.f4693;
            HostnameVerifier hostnameVerifier2 = c0706.f4684;
            c0702 = c0706.f4681;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c0702 = null;
        }
        String str = c0698.f4650;
        int i = c0698.f4648;
        C0706 c07062 = this.f4285;
        return new C0694(str, i, c07062.f4686, c07062.f4690, sSLSocketFactory, hostnameVerifier, c0702, c07062.f4683, c07062.f4685, c07062.f4696, c07062.f4689, c07062.f4699);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m1767(IOException iOException, C0643 c0643, boolean z, C0595 c0595) {
        C0648.C0649 c0649;
        c0643.m1847(iOException);
        if (!this.f4285.f4697) {
            return false;
        }
        if (z) {
            AbstractC0719 abstractC0719 = c0595.f4251;
        }
        if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return c0643.f4375 != null || (((c0649 = c0643.f4372) != null && c0649.m1869()) || c0643.f4371.m1866());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x008d, code lost:
    
        if (m1770(r0, 0) > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00c2, code lost:
    
        r2 = r0.f4753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00b5, code lost:
    
        if (r2.f4761 == 503) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00c0, code lost:
    
        if (m1770(r0, Integer.MAX_VALUE) != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00da, code lost:
    
        if (r5.equals("HEAD") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0085, code lost:
    
        if (r3.f4761 == 408) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0180 A[SYNTHETIC] */
    @Override // p000.InterfaceC0717
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000.C0712 mo1768(p000.InterfaceC0717.InterfaceC0718 r15) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.p003.C0608.mo1768(〳ぜぞぜべっ.は〲ぱなで$げつ〴ぬぐ):〳ぜぞぜべっ.なぶひせが");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final boolean m1769(C0712 c0712, C0698 c0698) {
        C0698 c06982 = c0712.f4753.f4248;
        return c06982.f4650.equals(c0698.f4650) && c06982.f4648 == c0698.f4648 && c06982.f4647.equals(c0698.f4647);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int m1770(C0712 c0712, int i) {
        String m1743 = c0712.f4754.m1743("Retry-After");
        if (m1743 == null) {
            m1743 = null;
        }
        if (m1743 == null) {
            return i;
        }
        if (m1743.matches("\\d+")) {
            return Integer.valueOf(m1743).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
