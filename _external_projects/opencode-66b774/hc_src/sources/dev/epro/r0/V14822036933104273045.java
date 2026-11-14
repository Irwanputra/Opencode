package dev.epro.r0;

import android.net.http.HeaderBlock;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        HeaderBlock headers;
        Map asMap;
        headers = this.a.getHeaders();
        asMap = headers.getAsMap();
        return asMap;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        HeaderBlock headers;
        List asList;
        headers = this.a.getHeaders();
        asList = headers.getAsList();
        return asList;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        int httpStatusCode;
        httpStatusCode = this.a.getHttpStatusCode();
        return httpStatusCode;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        String httpStatusText;
        httpStatusText = this.a.getHttpStatusText();
        return httpStatusText;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        String negotiatedProtocol;
        negotiatedProtocol = this.a.getNegotiatedProtocol();
        return negotiatedProtocol;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        long receivedByteCount;
        receivedByteCount = this.a.getReceivedByteCount();
        return receivedByteCount;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        String url;
        url = this.a.getUrl();
        return url;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        List urlChain;
        urlChain = this.a.getUrlChain();
        return urlChain;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        boolean wasCached;
        wasCached = this.a.wasCached();
        return wasCached;
    }
}
