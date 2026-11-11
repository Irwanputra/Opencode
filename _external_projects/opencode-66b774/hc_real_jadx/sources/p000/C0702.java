package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import p000.p001.C0629;
import p000.p001.p006.AbstractC0638;
import p131.p155.p156.p157.C2098;
import p243.C2801;

/* renamed from: 〳ぜぞぜべっ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0702 {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final C0702 f4669 = new C0702(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    @Nullable
    public final AbstractC0638 f4670;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Set<C0703> f4671;

    /* renamed from: 〳ぜぞぜべっ.づざかべべ$げつ〴ぬぐ, reason: contains not printable characters */
    public static final class C0703 {
        public boolean equals(Object obj) {
            if (!(obj instanceof C0703)) {
                return false;
            }
            ((C0703) obj).getClass();
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public C0702(Set<C0703> set, @Nullable AbstractC0638 abstractC0638) {
        this.f4671 = set;
        this.f4670 = abstractC0638;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String m1967(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder m4207 = C2098.m4207("sha256/");
        m4207.append(C2801.m4840(((X509Certificate) certificate).getPublicKey().getEncoded()).m4852("SHA-256").mo4848());
        return m4207.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0702) {
            C0702 c0702 = (C0702) obj;
            if (C0629.m1817(this.f4670, c0702.f4670) && this.f4671.equals(c0702.f4671)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC0638 abstractC0638 = this.f4670;
        return this.f4671.hashCode() + ((abstractC0638 != null ? abstractC0638.hashCode() : 0) * 31);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1968(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<C0703> it = this.f4671.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        if (emptyList.isEmpty()) {
            return;
        }
        AbstractC0638 abstractC0638 = this.f4670;
        if (abstractC0638 != null) {
            list = abstractC0638.mo1795(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (emptyList.size() > 0) {
                ((C0703) emptyList.get(0)).getClass();
                throw null;
            }
        }
        StringBuilder m4179 = C2098.m4179("Certificate pinning failure!", "\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            m4179.append("\n    ");
            m4179.append(m1967(x509Certificate));
            m4179.append(": ");
            m4179.append(x509Certificate.getSubjectDN().getName());
        }
        m4179.append("\n  Pinned certificates for ");
        m4179.append(str);
        m4179.append(":");
        int size3 = emptyList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C0703 c0703 = (C0703) emptyList.get(i3);
            m4179.append("\n    ");
            m4179.append(c0703);
        }
        throw new SSLPeerUnverifiedException(m4179.toString());
    }
}
