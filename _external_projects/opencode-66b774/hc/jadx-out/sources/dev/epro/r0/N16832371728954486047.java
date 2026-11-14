package dev.epro.r0;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N16832371728954486047 extends RequestFinishedInfo.Listener {
    public final RequestFinishedInfo.Listener a;

    public N16832371728954486047(RequestFinishedInfo.Listener listener) {
        super(listener.getExecutor());
        this.a = listener;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final Executor getExecutor() {
        return this.a.getExecutor();
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.a.onRequestFinished(requestFinishedInfo);
    }
}
