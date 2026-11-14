package dev.epro.relay;

import dev.epro.go.Seq;
import dev.epro.session.Session;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public abstract class Relay {

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyDestinationObserver implements Seq.Proxy, DestinationObserver {
        private final int refnum;

        public proxyDestinationObserver(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.relay.DestinationObserver
        public native boolean canReportDestination();

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.relay.DestinationObserver
        public native void onDestination(String str, int i);
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyRuntimeHost implements Seq.Proxy, RuntimeHost {
        private final int refnum;

        public proxyRuntimeHost(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.relay.RuntimeHost
        public native void onActive(String str);

        @Override // dev.epro.relay.RuntimeHost
        public native void onClientRegion(String str);

        @Override // dev.epro.relay.RuntimeHost
        public native void onDialing(String str);

        @Override // dev.epro.relay.RuntimeHost
        public native void onError(String str);

        @Override // dev.epro.relay.RuntimeHost
        public native void onListening(int i);

        @Override // dev.epro.relay.RuntimeHost
        public native void onReconnectLimitReached(int i);

        @Override // dev.epro.relay.RuntimeHost, dev.epro.mobile.RetryHandler
        public native void onRetry(int i, int i2);

        @Override // dev.epro.relay.RuntimeHost
        public native void onState(String str);

        @Override // dev.epro.relay.RuntimeHost
        public native void onTrafficRateLimits(long j, long j2);

        @Override // dev.epro.relay.RuntimeHost, dev.epro.xray.SocketProtector
        public native boolean protect(long j);
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyServerAddressResolver implements Seq.Proxy, ServerAddressResolver {
        private final int refnum;

        public proxyServerAddressResolver(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.relay.ServerAddressResolver
        public native String lookup(String str);
    }

    static {
        Seq.touch();
        Session.touch();
        _init();
    }

    private Relay() {
    }

    private static native void _init();

    public static native ClientSession newClientSession(RuntimeHost runtimeHost);

    public static void touch() {
    }
}
