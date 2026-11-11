package p000.p001.p006;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.てぜきぽく.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0637 implements InterfaceC0640 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Map<X500Principal, Set<X509Certificate>> f4364 = new LinkedHashMap();

    public C0637(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f4364.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f4364.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0637) && ((C0637) obj).f4364.equals(this.f4364);
    }

    public int hashCode() {
        return this.f4364.hashCode();
    }

    @Override // p000.p001.p006.InterfaceC0640
    /* renamed from: げつ〴ぬぐ */
    public X509Certificate mo1794(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f4364.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
