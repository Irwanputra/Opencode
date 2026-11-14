package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N12175049621887677679 extends UrlResponseInfo {
    public final List a;
    public final int b;
    public final String c;
    public final String d;
    public final String e = "";
    public final AtomicLong f = new AtomicLong(0);
    public final A15099318540142210187 g;

    public N12175049621887677679(ArrayList arrayList, int i, String str, List list, String str2) {
        this.a = Collections.unmodifiableList(arrayList);
        this.b = i;
        this.c = str;
        this.g = new A15099318540142210187(Collections.unmodifiableList(list));
        this.d = str2;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        return this.g.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.g.a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return (String) this.a.get(r1.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String url = getUrl();
        String string = this.a.toString();
        String string2 = this.g.a.toString();
        long j = this.f.get();
        StringBuilder sbY = G6547577305291411977.y("UrlResponseInfo@[", hexString, "][", url, "]: urlChain = ");
        X2485016533998461232.k(sbY, string, ", httpStatus = ", this.b, " ");
        G6547577305291411977.B(sbY, this.c, ", headers = ", string2, ", wasCached = false, negotiatedProtocol = ");
        G6547577305291411977.B(sbY, this.d, ", proxyServer= ", this.e, ", receivedByteCount = ");
        sbY.append(j);
        return sbY.toString();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
