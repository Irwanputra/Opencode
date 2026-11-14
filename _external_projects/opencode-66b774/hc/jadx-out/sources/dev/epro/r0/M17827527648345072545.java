package dev.epro.r0;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M17827527648345072545 implements UrlRequest$StatusListener {
    public final UrlRequest.StatusListener a;

    public M17827527648345072545(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
