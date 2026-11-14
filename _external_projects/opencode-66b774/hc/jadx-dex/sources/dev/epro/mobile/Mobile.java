package dev.epro.mobile;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class Mobile {

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyDestinationObserver implements dev.epro.go.Seq.Proxy, dev.epro.mobile.DestinationObserver {
        private final int refnum;

        public proxyDestinationObserver(int i) {
            this.refnum = i;
            dev.epro.go.Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.mobile.DestinationObserver
        public native boolean canReportDestination();

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            dev.epro.go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.mobile.DestinationObserver
        public native void onDestination(java.lang.String str, int i);
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyFileDescriptorProtector implements dev.epro.go.Seq.Proxy, dev.epro.mobile.FileDescriptorProtector {
        private final int refnum;

        public proxyFileDescriptorProtector(int i) {
            this.refnum = i;
            dev.epro.go.Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            dev.epro.go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.mobile.FileDescriptorProtector
        public native boolean protect(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyRetryHandler implements dev.epro.go.Seq.Proxy, dev.epro.mobile.RetryHandler {
        private final int refnum;

        public proxyRetryHandler(int i) {
            this.refnum = i;
            dev.epro.go.Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            dev.epro.go.Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.mobile.RetryHandler
        public native void onRetry(int i, int i2);
    }

    static {
        dev.epro.go.Seq.touch();
        dev.epro.session.Session.touch();
        _init();
    }

    private Mobile() {
    }

    private static native void _init();

    public static native dev.epro.mobile.ClientSession newClientSession();

    public static native void runConfig(java.lang.String str);

    public static native void setFileDescriptorProtector(dev.epro.mobile.FileDescriptorProtector fileDescriptorProtector);

    public static native void startConfig(java.lang.String str);

    public static native void stop();

    public static void touch() {
    }
}
