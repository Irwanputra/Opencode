package dev.epro.r0;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R6413645163672196790 implements UrlRequest$Callback {
    public final UrlRequest.Callback a;
    public N862882876691965823 b;

    public R6413645163672196790(UrlRequest.Callback callback) {
        Objects.requireNonNull(callback, "Callback is required.");
        this.a = callback;
    }

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        V14822036933104273045 v14822036933104273045B = V14822036933104273045.b(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, v14822036933104273045B);
        } finally {
            this.b.a(2, v14822036933104273045B, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        V14822036933104273045 v14822036933104273045B = V14822036933104273045.b(urlResponseInfo);
        CronetException cronetExceptionF = D1286559660607336098.F(httpException);
        try {
            this.a.onFailed(this.b, v14822036933104273045B, cronetExceptionF);
        } finally {
            this.b.a(1, v14822036933104273045B, cronetExceptionF);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        D1286559660607336098.u(new M11115334227134251595(this, urlResponseInfo, byteBuffer, (byte) 0), Exception.class);
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        D1286559660607336098.u(new M11115334227134251595(this, urlResponseInfo, str, (byte) 1), Exception.class);
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        D1286559660607336098.u(new A12732730042960812466(this, urlResponseInfo, (byte) 1), Exception.class);
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        V14822036933104273045 v14822036933104273045B = V14822036933104273045.b(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, v14822036933104273045B);
        } finally {
            this.b.a(0, v14822036933104273045B, null);
        }
    }
}
