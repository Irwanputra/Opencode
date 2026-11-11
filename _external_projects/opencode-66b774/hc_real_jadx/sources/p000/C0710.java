package p000;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: 〳ぜぞぜべっ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C0710 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final C0710 f4730;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final Comparator<String> f4731;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final C0710 f4732;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public static final C0710 f4733;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final C0710 f4734;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public static final C0710 f4735;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final C0710 f4736;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final Map<String, C0710> f4737;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public static final C0710 f4738;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public static final C0710 f4739;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public static final C0710 f4740;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final C0710 f4741;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final C0710 f4742;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static final C0710 f4743;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final C0710 f4744;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final C0710 f4745;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public static final C0710 f4746;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final C0710 f4747;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final C0710 f4748;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final C0710 f4749;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static final C0710 f4750;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final String f4751;

    /* renamed from: 〳ぜぞぜべっ.なぎぱいぢぎ$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0711 implements Comparator<String> {
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        
            return 1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L11:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L27
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L24
                if (r4 >= r5) goto L22
                goto L35
            L22:
                r2 = 1
                goto L35
            L24:
                int r1 = r1 + 1
                goto L11
            L27:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L34
                if (r7 >= r8) goto L22
                goto L35
            L34:
                r2 = 0
            L35:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0710.C0711.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    static {
        C0711 c0711 = new C0711();
        f4731 = c0711;
        f4737 = new TreeMap(c0711);
        m1972("SSL_RSA_WITH_NULL_MD5");
        m1972("SSL_RSA_WITH_NULL_SHA");
        m1972("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m1972("SSL_RSA_WITH_RC4_128_MD5");
        m1972("SSL_RSA_WITH_RC4_128_SHA");
        m1972("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m1972("SSL_RSA_WITH_DES_CBC_SHA");
        f4747 = m1972("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m1972("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m1972("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m1972("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m1972("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m1972("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m1972("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m1972("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m1972("SSL_DH_anon_WITH_RC4_128_MD5");
        m1972("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m1972("SSL_DH_anon_WITH_DES_CBC_SHA");
        m1972("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m1972("TLS_KRB5_WITH_DES_CBC_SHA");
        m1972("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m1972("TLS_KRB5_WITH_RC4_128_SHA");
        m1972("TLS_KRB5_WITH_DES_CBC_MD5");
        m1972("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m1972("TLS_KRB5_WITH_RC4_128_MD5");
        m1972("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m1972("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m1972("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m1972("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f4741 = m1972("TLS_RSA_WITH_AES_128_CBC_SHA");
        m1972("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m1972("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m1972("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f4744 = m1972("TLS_RSA_WITH_AES_256_CBC_SHA");
        m1972("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        f4732 = m1972("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m1972("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m1972("TLS_RSA_WITH_NULL_SHA256");
        m1972("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m1972("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m1972("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m1972("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m1972("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m1972("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m1972("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m1972("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m1972("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m1972("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m1972("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m1972("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m1972("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m1972("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m1972("TLS_PSK_WITH_RC4_128_SHA");
        m1972("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m1972("TLS_PSK_WITH_AES_128_CBC_SHA");
        m1972("TLS_PSK_WITH_AES_256_CBC_SHA");
        m1972("TLS_RSA_WITH_SEED_CBC_SHA");
        f4730 = m1972("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f4749 = m1972("TLS_RSA_WITH_AES_256_GCM_SHA384");
        f4733 = m1972("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        f4750 = m1972("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m1972("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m1972("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m1972("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m1972("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m1972("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m1972("TLS_FALLBACK_SCSV");
        m1972("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m1972("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m1972("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m1972("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m1972("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m1972("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m1972("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m1972("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        f4742 = m1972("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        f4745 = m1972("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m1972("TLS_ECDH_RSA_WITH_NULL_SHA");
        m1972("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m1972("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m1972("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m1972("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m1972("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m1972("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m1972("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f4748 = m1972("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f4736 = m1972("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m1972("TLS_ECDH_anon_WITH_NULL_SHA");
        m1972("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m1972("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m1972("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m1972("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m1972("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m1972("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m1972("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m1972("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m1972("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        f4734 = m1972("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m1972("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m1972("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f4735 = m1972("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f4740 = m1972("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m1972("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m1972("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f4746 = m1972("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f4738 = m1972("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m1972("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m1972("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m1972("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m1972("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f4739 = m1972("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f4743 = m1972("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    }

    public C0710(String str) {
        str.getClass();
        this.f4751 = str;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static synchronized C0710 m1972(String str) {
        C0710 c0710;
        synchronized (C0710.class) {
            Map<String, C0710> map = f4737;
            c0710 = map.get(str);
            if (c0710 == null) {
                c0710 = new C0710(str);
                map.put(str, c0710);
            }
        }
        return c0710;
    }

    public String toString() {
        return this.f4751;
    }
}
