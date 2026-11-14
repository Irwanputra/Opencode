package dev.epro.r0;

import ads_mobile_sdk.ii;
import ads_mobile_sdk.l6;
import android.app.Application;
import android.webkit.WebView;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R6320827706769103704 implements I3673563500665330592 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public R6320827706769103704(ii iiVar, WebView webView, String str, String str2, l6 l6Var) {
        this.c = new ArrayList();
        this.d = new HashMap();
        this.a = iiVar;
        this.b = webView;
        this.g = l6Var;
        this.f = str;
        this.e = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113 A[Catch: all -> 0x005c, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x0039, B:57:0x010d, B:59:0x0113, B:60:0x0128, B:19:0x004d, B:53:0x00e6, B:22:0x0058, B:44:0x00ad, B:46:0x00b3, B:49:0x00bf), top: B:95:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #2 {all -> 0x005c, blocks: (B:14:0x0039, B:57:0x010d, B:59:0x0113, B:60:0x0128, B:19:0x004d, B:53:0x00e6, B:22:0x0058, B:44:0x00ad, B:46:0x00b3, B:49:0x00bf), top: B:95:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.z1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ads_mobile_sdk.th3, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [ads_mobile_sdk.th3] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ads_mobile_sdk.th3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(dev.epro.r0.R6320827706769103704 r18, ads_mobile_sdk.z1 r19, dev.epro.r0.K14749510448791472029 r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.R6320827706769103704.a(dev.epro.r0.R6320827706769103704, ads_mobile_sdk.z1, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static R6320827706769103704 b(ii iiVar, WebView webView, String str, String str2) {
        if (iiVar == null) {
            S10973172697741180971.j("Partner is null");
            return null;
        }
        if (webView == null) {
            S10973172697741180971.j("WebView is null");
            return null;
        }
        if (str2 == null || str2.length() <= 256) {
            return new R6320827706769103704(iiVar, webView, str, str2, l6.c);
        }
        S10973172697741180971.j("CustomReferenceData is greater than 256 characters");
        return null;
    }

    public V16000071791783281652 c() throws GeneralSecurityException {
        M9197813449740923653 m9197813449740923653;
        M9197813449740923653 m91978134497409236532;
        G5183794802785878636 g5183794802785878636 = (G5183794802785878636) this.a;
        if (g5183794802785878636 == null) {
            W4415201450379021245.c("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        M9197813449740923653 m91978134497409236533 = (M9197813449740923653) this.c;
        if (m91978134497409236533 == null || (m9197813449740923653 = (M9197813449740923653) this.d) == null) {
            W4415201450379021245.c("Cannot build without prime factors");
            return null;
        }
        M9197813449740923653 m91978134497409236534 = (M9197813449740923653) this.b;
        if (m91978134497409236534 == null) {
            W4415201450379021245.c("Cannot build without private exponent");
            return null;
        }
        M9197813449740923653 m91978134497409236535 = (M9197813449740923653) this.e;
        if (m91978134497409236535 == null || (m91978134497409236532 = (M9197813449740923653) this.f) == null) {
            W4415201450379021245.c("Cannot build without prime exponents");
            return null;
        }
        M9197813449740923653 m91978134497409236536 = (M9197813449740923653) this.g;
        if (m91978134497409236536 == null) {
            W4415201450379021245.c("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = g5183794802785878636.j.b;
        BigInteger bigInteger2 = g5183794802785878636.k;
        BigInteger bigInteger3 = (BigInteger) m91978134497409236533.b;
        BigInteger bigInteger4 = (BigInteger) m9197813449740923653.b;
        BigInteger bigInteger5 = (BigInteger) m91978134497409236534.b;
        BigInteger bigInteger6 = (BigInteger) m91978134497409236535.b;
        BigInteger bigInteger7 = (BigInteger) m91978134497409236532.b;
        BigInteger bigInteger8 = (BigInteger) m91978134497409236536.b;
        if (!bigInteger3.isProbablePrime(10)) {
            W4415201450379021245.c("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            W4415201450379021245.c("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            W4415201450379021245.c("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            W4415201450379021245.c("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            W4415201450379021245.c("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            W4415201450379021245.c("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new V16000071791783281652((G5183794802785878636) this.a, (M9197813449740923653) this.c, (M9197813449740923653) this.d, (M9197813449740923653) this.b, (M9197813449740923653) this.e, (M9197813449740923653) this.f, (M9197813449740923653) this.g);
        }
        W4415201450379021245.c("qInv is invalid.");
        return null;
    }

    public S7434432239944054875 d() throws GeneralSecurityException {
        M9197813449740923653 m9197813449740923653;
        M9197813449740923653 m91978134497409236532;
        S14902715661559460346 s14902715661559460346 = (S14902715661559460346) this.a;
        if (s14902715661559460346 == null) {
            W4415201450379021245.c("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        M9197813449740923653 m91978134497409236533 = (M9197813449740923653) this.c;
        if (m91978134497409236533 == null || (m9197813449740923653 = (M9197813449740923653) this.d) == null) {
            W4415201450379021245.c("Cannot build without prime factors");
            return null;
        }
        M9197813449740923653 m91978134497409236534 = (M9197813449740923653) this.b;
        if (m91978134497409236534 == null) {
            W4415201450379021245.c("Cannot build without private exponent");
            return null;
        }
        M9197813449740923653 m91978134497409236535 = (M9197813449740923653) this.e;
        if (m91978134497409236535 == null || (m91978134497409236532 = (M9197813449740923653) this.f) == null) {
            W4415201450379021245.c("Cannot build without prime exponents");
            return null;
        }
        M9197813449740923653 m91978134497409236536 = (M9197813449740923653) this.g;
        if (m91978134497409236536 == null) {
            W4415201450379021245.c("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = s14902715661559460346.j.b;
        BigInteger bigInteger2 = s14902715661559460346.k;
        BigInteger bigInteger3 = (BigInteger) m91978134497409236533.b;
        BigInteger bigInteger4 = (BigInteger) m9197813449740923653.b;
        BigInteger bigInteger5 = (BigInteger) m91978134497409236534.b;
        BigInteger bigInteger6 = (BigInteger) m91978134497409236535.b;
        BigInteger bigInteger7 = (BigInteger) m91978134497409236532.b;
        BigInteger bigInteger8 = (BigInteger) m91978134497409236536.b;
        if (!bigInteger3.isProbablePrime(10)) {
            W4415201450379021245.c("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            W4415201450379021245.c("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            W4415201450379021245.c("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            W4415201450379021245.c("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            W4415201450379021245.c("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            W4415201450379021245.c("dQ is invalid.");
            return null;
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new S7434432239944054875((S14902715661559460346) this.a, (M9197813449740923653) this.c, (M9197813449740923653) this.d, (M9197813449740923653) this.b, (M9197813449740923653) this.e, (M9197813449740923653) this.f, (M9197813449740923653) this.g);
        }
        W4415201450379021245.c("qInv is invalid.");
        return null;
    }

    @Override // dev.epro.r0.I3673563500665330592
    public Object h() {
        Application application = (Application) ((I3673563500665330592) this.a).h();
        return new X17123927029532314696(application, (O6655543165492094776) ((D9201356603168736774) this.c).h(), (G5446205426701161097) ((I3673563500665330592) this.d).h(), (O3923701449542713850) ((Z6787503239643758223) this.e).a, (F6353700998356592239) this.f, (A7202329723792933819) ((I3673563500665330592) this.g).h());
    }

    public R6320827706769103704(Z6787503239643758223 z6787503239643758223, D9201356603168736774 d9201356603168736774, D9201356603168736774 d92013566031687367742, D9201356603168736774 d92013566031687367743, Z6787503239643758223 z67875032396437582232, F6353700998356592239 f6353700998356592239, D9201356603168736774 d92013566031687367744) {
        this.a = z6787503239643758223;
        this.b = d9201356603168736774;
        this.c = d92013566031687367742;
        this.d = d92013566031687367743;
        this.e = z67875032396437582232;
        this.f = f6353700998356592239;
        this.g = d92013566031687367744;
    }

    public static R6320827706769103704 a(ii iiVar, WebView webView, String str, String str2) {
        if (iiVar == null) {
            S10973172697741180971.j("Partner is null");
            return null;
        }
        if (webView != null) {
            if (str2 != null && str2.length() > 256) {
                S10973172697741180971.j("CustomReferenceData is greater than 256 characters");
                return null;
            }
            return new R6320827706769103704(iiVar, webView, str, str2, l6.b);
        }
        S10973172697741180971.j("WebView is null");
        return null;
    }
}
