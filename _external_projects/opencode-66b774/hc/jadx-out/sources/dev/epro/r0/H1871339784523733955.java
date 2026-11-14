package dev.epro.r0;

import android.content.Context;
import android.os.Trace;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H1871339784523733955 extends C7978431275764804971 {
    public final String a;
    public final ThreadPoolExecutor b;
    public final int c;
    public final O4077903568229246 d;
    public final AtomicInteger e = new AtomicInteger();
    public long f = -1;
    public final Context g;

    public H1871339784523733955(R5112989431472712448 r5112989431472712448) {
        U1748733558996603759.b("JavaCronetEngine#JavaCronetEngine");
        try {
            Context context = r5112989431472712448.b;
            this.g = context;
            int iHashCode = hashCode();
            this.c = iHashCode;
            this.a = r5112989431472712448.f;
            this.b = new ThreadPoolExecutor(10, 10, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new F13067510361649884247((byte) 0));
            O4077903568229246 o4077903568229246C = Z1953481206310471956.C(context, W13223114868094258148.d);
            this.d = o4077903568229246C;
            try {
                o4077903568229246C.B(iHashCode, r5112989431472712448.c(), b());
            } catch (RuntimeException unused) {
            }
            Trace.endSection();
        } finally {
        }
    }

    @Override // dev.epro.r0.C7978431275764804971
    public final ExperimentalUrlRequest a(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2) {
        if (j != -1) {
            this.f = j;
        }
        return new Z11821137052809198413(this, callback, this.b, executor, str, this.a, z2, z3, i2, z4, i3, this.f, str2, arrayList2, uploadDataProvider, executor2);
    }

    public final K17906237317018138803 b() {
        return new K17906237317018138803(getVersionString().split("/")[1].split("@")[0]);
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.f = j;
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new Q3474053796813962043();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.e.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        return 0;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return G6547577305291411977.C("CronetHttpURLConnection/", ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new J13885975656665877910(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return url.openConnection();
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.b.shutdown();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        newBidirectionalStreamBuilder(str, callback, executor);
        throw null;
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
    }
}
