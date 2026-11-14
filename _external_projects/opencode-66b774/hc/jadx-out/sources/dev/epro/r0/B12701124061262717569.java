package dev.epro.r0;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B12701124061262717569 implements BidirectionalStream$Callback {
    public final BidirectionalStream.Callback a;
    public J3014650008080165576 b;

    public B12701124061262717569(BidirectionalStream.Callback callback) {
        Objects.requireNonNull(callback, "Callback is required.");
        this.a = callback;
    }

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        V14822036933104273045 v14822036933104273045A = V14822036933104273045.a(urlResponseInfo);
        try {
            this.a.onCanceled(this.b, v14822036933104273045A);
        } finally {
            this.b.a(2, v14822036933104273045A, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        V14822036933104273045 v14822036933104273045A = V14822036933104273045.a(urlResponseInfo);
        CronetException cronetExceptionF = D1286559660607336098.F(httpException);
        try {
            this.a.onFailed(this.b, v14822036933104273045A, cronetExceptionF);
        } finally {
            this.b.a(1, v14822036933104273045A, cronetExceptionF);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.a.onReadCompleted(this.b, V14822036933104273045.a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.a.onResponseHeadersReceived(this.b, V14822036933104273045.a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        this.a.onResponseTrailersReceived(this.b, V14822036933104273045.a(urlResponseInfo), new X4716980523994233821(headerBlock));
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.a.onStreamReady(this.b);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        V14822036933104273045 v14822036933104273045A = V14822036933104273045.a(urlResponseInfo);
        try {
            this.a.onSucceeded(this.b, v14822036933104273045A);
        } finally {
            this.b.a(0, v14822036933104273045A, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.a.onWriteCompleted(this.b, V14822036933104273045.a(urlResponseInfo), byteBuffer, z);
    }
}
