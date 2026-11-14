package dev.epro.r0;

import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V14822036933104273045 extends UrlResponseInfo {
    public final android.net.http.UrlResponseInfo a;
    public final String b;

    public V14822036933104273045(android.net.http.UrlResponseInfo urlResponseInfo, String str) {
        this.a = urlResponseInfo;
        this.b = str;
    }

    public static V14822036933104273045 a(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return null;
        }
        try {
            urlResponseInfo.getUrl();
            return new V14822036933104273045(urlResponseInfo, null);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static V14822036933104273045 b(android.net.http.UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null) {
            return null;
        }
        try {
            urlResponseInfo.getUrl();
            return new V14822036933104273045(urlResponseInfo, ":0");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        return this.a.getHeaders().getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.a.getHeaders().getAsList();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.a.getHttpStatusCode();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.a.getHttpStatusText();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.a.getNegotiatedProtocol();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.a.getReceivedByteCount();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        return this.a.getUrl();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.a.getUrlChain();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return this.a.wasCached();
    }
}
