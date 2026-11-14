package dev.epro.r0;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N862882876691965823 extends ExperimentalUrlRequest {
    public final UrlRequest a;
    public final F10736675061244242991 b;
    public final String c;
    public final Collection d;
    public final N16832371728954486047 e;

    public N862882876691965823(UrlRequest urlRequest, F10736675061244242991 f10736675061244242991, String str, Collection collection, RequestFinishedInfo.Listener listener) {
        this.a = urlRequest;
        this.b = f10736675061244242991;
        this.c = str;
        this.d = collection;
        this.e = listener == null ? null : new N16832371728954486047(listener);
    }

    public final void a(int i, V14822036933104273045 v14822036933104273045, CronetException cronetException) {
        W13904991817818359627.a(this.b, this.c, this.d, this.e, i, v14822036933104273045, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        this.a.getStatus(new M17827527648345072545(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean isDone;
        isDone = this.a.isDone();
        return isDone;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.a.start();
    }
}
