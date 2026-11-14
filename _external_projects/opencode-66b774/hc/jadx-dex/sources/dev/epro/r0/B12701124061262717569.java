package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B12701124061262717569 implements android.net.http.BidirectionalStream$Callback {
    public final org.chromium.net.BidirectionalStream.Callback a;
    public dev.epro.r0.J3014650008080165576 b;

    public B12701124061262717569(org.chromium.net.BidirectionalStream.Callback callback) {
        java.util.Objects.requireNonNull(callback, "Callback is required.");
        this.a = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo) {
        dev.epro.r0.V14822036933104273045 v14822036933104273045A = dev.epro.r0.V14822036933104273045.a(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, v14822036933104273045A);
        } finally {
            this.b.a(2, v14822036933104273045A, (org.chromium.net.CronetException) null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, android.net.http.HttpException httpException) {
        dev.epro.r0.V14822036933104273045 v14822036933104273045A = dev.epro.r0.V14822036933104273045.a(urlResponseInfo);
        org.chromium.net.CronetException cronetExceptionF = dev.epro.r0.D1286559660607336098.F(httpException);
        try {
            this.a.onFailed(this.b, v14822036933104273045A, cronetExceptionF);
        } finally {
            this.b.a(1, v14822036933104273045A, cronetExceptionF);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
        this.a.onReadCompleted(this.b, dev.epro.r0.V14822036933104273045.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo) {
        this.a.onResponseHeadersReceived(this.b, dev.epro.r0.V14822036933104273045.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, android.net.http.HeaderBlock headerBlock) {
        this.a.onResponseTrailersReceived(this.b, dev.epro.r0.V14822036933104273045.a(urlResponseInfo), new dev.epro.r0.X4716980523994233821(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.a.onStreamReady(this.b);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo) {
        dev.epro.r0.V14822036933104273045 v14822036933104273045A = dev.epro.r0.V14822036933104273045.a(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, v14822036933104273045A);
        } finally {
            this.b.a(0, v14822036933104273045A, (org.chromium.net.CronetException) null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, android.net.http.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
        this.a.onWriteCompleted(this.b, dev.epro.r0.V14822036933104273045.a(urlResponseInfo), byteBuffer, z);
    }
}
