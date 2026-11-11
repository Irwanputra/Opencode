package p000.p001.p006;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: 〳ぜぞぜべっ.ぉひのべい.てぜきぽく.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0641 implements HostnameVerifier {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final C0641 f4366 = new C0641();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static List<String> m1843(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static List<String> m1844(X509Certificate x509Certificate) {
        List<String> m1843 = m1843(x509Certificate, 7);
        List<String> m18432 = m1843(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(m18432.size() + m1843.size());
        arrayList.addAll(m1843);
        arrayList.addAll(m18432);
        return arrayList;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m1845(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:1: B:14:0x003a->B:43:?, LOOP_END, SYNTHETIC] */
    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m1845(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p001.p006.C0641.m1845(java.lang.String, java.security.cert.X509Certificate):boolean");
    }
}
