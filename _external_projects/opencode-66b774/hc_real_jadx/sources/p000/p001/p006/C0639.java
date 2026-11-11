package p000.p001.p006;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.てぜきぽく.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0639 extends AbstractC0638 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final InterfaceC0640 f4365;

    public C0639(InterfaceC0640 interfaceC0640) {
        this.f4365 = interfaceC0640;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0639) && ((C0639) obj).f4365.equals(this.f4365);
    }

    public int hashCode() {
        return this.f4365.hashCode();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m1842(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p000.p001.p006.AbstractC0638
    /* renamed from: げつ〴ぬぐ */
    public List<Certificate> mo1795(List<Certificate> list, String str) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate mo1794 = this.f4365.mo1794(x509Certificate);
            if (mo1794 == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (m1842(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(mo1794)) {
                arrayList.add(mo1794);
            }
            if (m1842(mo1794, mo1794)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
