package p000.p001.p004;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;
import p000.EnumC0721;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.いいにぽつ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C0619 extends C0626 {
    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static C0626 m1780() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new C0619();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // p000.p001.p004.C0626
    @Nullable
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public String mo1781(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public SSLContext mo1782() {
        try {
            return SSLContext.getInstance("TLS", m1783());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final Provider m1783() {
        return new OpenSSLProvider();
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void mo1784(SSLSocket sSLSocket, String str, List<EnumC0721> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ((ArrayList) C0626.m1800(list)).toArray(new String[0]));
        }
    }

    @Override // p000.p001.p004.C0626
    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public X509TrustManager mo1785(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.mo1785(sSLSocketFactory);
        }
        try {
            Object m1801 = C0626.m1801(sSLSocketFactory, Object.class, "sslParameters");
            if (m1801 != null) {
                return (X509TrustManager) C0626.m1801(m1801, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }
}
