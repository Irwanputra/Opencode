package dev.epro.xray;

import dev.epro.go.Seq;
import dev.epro.session.Session;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public abstract class Xray {

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyConnectionDestinationListener implements Seq.Proxy, ConnectionDestinationListener {
        private final int refnum;

        public proxyConnectionDestinationListener(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.xray.ConnectionDestinationListener
        public native boolean canReportDestination();

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.xray.ConnectionDestinationListener
        public native void onConnectionDestination(String str, long j);
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyRuntimeCallback implements Seq.Proxy, RuntimeCallback {
        private final int refnum;

        public proxyRuntimeCallback(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.xray.RuntimeCallback
        public native long onStarted();

        @Override // dev.epro.xray.RuntimeCallback
        public native long onStatus(long j, String str);

        @Override // dev.epro.xray.RuntimeCallback
        public native long onStopped();
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

        @Override // dev.epro.xray.ServerAddressResolver
        public native String lookup(String str);
    }

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxySocketProtector implements Seq.Proxy, SocketProtector {
        private final int refnum;

        public proxySocketProtector(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.xray.SocketProtector
        public native boolean protect(long j);
    }

    static {
        Seq.touch();
        Session.touch();
        _init();
    }

    private Xray() {
    }

    private static native void _init();

    public static native void clearSocketProtector();

    public static native void initEnvironment(String str, String str2);

    public static native long measureOutboundDelay(String str, String str2);

    public static native long measureOutboundDelayWithResolver(String str, String str2, ServerAddressResolver serverAddressResolver);

    public static native Controller newController(RuntimeCallback runtimeCallback);

    public static native void setSocketProtector(SocketProtector socketProtector);

    public static native String validateConfig(String str);

    public static void touch() {
    }
}
