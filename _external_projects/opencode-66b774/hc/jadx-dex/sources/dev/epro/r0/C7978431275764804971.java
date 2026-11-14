package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C7978431275764804971 extends org.chromium.net.ExperimentalCronetEngine {
    public abstract org.chromium.net.ExperimentalUrlRequest a(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, int i, java.util.ArrayList arrayList, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, org.chromium.net.RequestFinishedInfo.Listener listener, long j, java.lang.String str2, java.util.ArrayList arrayList2, org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor2);

    public final org.chromium.net.ExperimentalUrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return new dev.epro.r0.J13885975656665877910(str, callback, executor, this);
    }
}
