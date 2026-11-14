package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class F10736675061244242991 extends dev.epro.r0.C7978431275764804971 {
    public static boolean c;
    public static boolean d;
    public final android.net.http.HttpEngine a;
    public final java.util.Map b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public F10736675061244242991(android.net.http.HttpEngine httpEngine) {
        this.a = httpEngine;
    }

    @Override // dev.epro.r0.C7978431275764804971
    public final org.chromium.net.ExperimentalUrlRequest a(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, int i, java.util.ArrayList arrayList, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, org.chromium.net.RequestFinishedInfo.Listener listener, long j, java.lang.String str2, java.util.ArrayList arrayList2, org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor2) {
        dev.epro.r0.R6413645163672196790 r6413645163672196790 = new dev.epro.r0.R6413645163672196790(callback);
        android.net.http.UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, r6413645163672196790);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(z);
        }
        if (z2) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(z2);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(j == -1 ? null : dev.epro.r0.V5057341886547923963.c(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            java.lang.Object obj = arrayList2.get(i4);
            i4++;
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            builderNewUrlRequestBuilder.addHeader((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new dev.epro.r0.Y11784639962352443012(uploadDataProvider), executor2);
        }
        dev.epro.r0.N862882876691965823 n862882876691965823 = new dev.epro.r0.N862882876691965823(builderNewUrlRequestBuilder.build(), this, str, arrayList, listener);
        r6413645163672196790.b = n862882876691965823;
        return n862882876691965823;
    }

    public final void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.b.put(listener, new dev.epro.r0.N16832371728954486047(listener));
    }

    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(j == -1 ? null : dev.epro.r0.V5057341886547923963.c(j));
    }

    public final java.net.URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    public final byte[] getGlobalMetricsDeltas() {
        if (!d) {
            d = true;
        }
        return new byte[0];
    }

    public final java.lang.String getVersionString() {
        return android.net.http.HttpEngine.getVersionString();
    }

    public final org.chromium.net.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        return new dev.epro.r0.U7451168681643155854(str, callback, executor, this);
    }

    public final org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return new dev.epro.r0.J13885975656665877910(str, callback, executor, this);
    }

    public final java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        if (proxy.type() != java.net.Proxy.Type.DIRECT) {
            dev.epro.r0.Z3383101362411723454.t();
            return null;
        }
        java.lang.String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        dev.epro.r0.D11988991656201568495.j(dev.epro.r0.G6547577305291411977.C("Unexpected protocol:", protocol));
        return null;
    }

    public final void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        this.b.remove(listener);
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final void startNetLogToFile(java.lang.String str, boolean z) {
        if (c) {
            return;
        }
        c = true;
    }

    /* JADX INFO: renamed from: newBidirectionalStreamBuilder, reason: collision with other method in class */
    public final org.chromium.net.ExperimentalBidirectionalStream.Builder m26newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        return new dev.epro.r0.U7451168681643155854(str, callback, executor, this);
    }

    public final java.net.URLConnection openConnection(java.net.URL url) {
        return (java.net.URLConnection) dev.epro.r0.D1286559660607336098.u(new dev.epro.r0.A12732730042960812466(this, url, (byte) 0), java.io.IOException.class);
    }

    public final void stopNetLog() {
    }
}
