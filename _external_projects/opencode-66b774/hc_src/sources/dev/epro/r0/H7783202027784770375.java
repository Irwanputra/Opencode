package dev.epro.r0;

import org.chromium.net.UrlRequest;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H7783202027784770375 extends UrlRequest.StatusListener {
    public final UrlRequest.StatusListener a;

    public H7783202027784770375(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
