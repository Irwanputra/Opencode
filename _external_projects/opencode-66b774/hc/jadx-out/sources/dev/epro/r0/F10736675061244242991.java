package dev.epro.r0;

import android.net.Network;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class F10736675061244242991 extends C7978431275764804971 {
    public static boolean c;
    public static boolean d;
    public final HttpEngine a;
    public final Map b = Collections.synchronizedMap(new HashMap());

    public F10736675061244242991(HttpEngine httpEngine) {
        this.a = httpEngine;
    }

    @Override // dev.epro.r0.C7978431275764804971
    public final ExperimentalUrlRequest a(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2) {
        R6413645163672196790 r6413645163672196790 = new R6413645163672196790(callback);
        UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, r6413645163672196790);
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
        builderNewUrlRequestBuilder.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            Map.Entry entry = (Map.Entry) obj;
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new Y11784639962352443012(uploadDataProvider), executor2);
        }
        N862882876691965823 n862882876691965823 = new N862882876691965823(builderNewUrlRequestBuilder.build(), this, str, arrayList, listener);
        r6413645163672196790.b = n862882876691965823;
        return n862882876691965823;
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.b.put(listener, new N16832371728954486047(listener));
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!d) {
            d = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new U7451168681643155854(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new J13885975656665877910(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            Z3383101362411723454.t();
            return null;
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        D11988991656201568495.j(G6547577305291411977.C("Unexpected protocol:", protocol));
        return null;
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.b.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (c) {
            return;
        }
        c = true;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new U7451168681643155854(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return (URLConnection) D1286559660607336098.u(new A12732730042960812466(this, url, (byte) 0), IOException.class);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }
}
