package dev.epro.mobile;

import dev.epro.go.Seq;
import dev.epro.session.Session;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class Mobile {

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyDestinationObserver implements Seq.Proxy, DestinationObserver {
        private final int refnum;

        public proxyDestinationObserver(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.mobile.DestinationObserver
        public native boolean canReportDestination();

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.mobile.DestinationObserver
        public native void onDestination(String str, int i);
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyFileDescriptorProtector implements Seq.Proxy, FileDescriptorProtector {
        private final int refnum;

        public proxyFileDescriptorProtector(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.mobile.FileDescriptorProtector
        public native boolean protect(int i);
    }

    /* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyRetryHandler implements Seq.Proxy, RetryHandler {
        private final int refnum;

        public proxyRetryHandler(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.mobile.RetryHandler
        public native void onRetry(int i, int i2);
    }

    static {
        Seq.touch();
        Session.touch();
        _init();
    }

    private Mobile() {
    }

    private static native void _init();

    public static native ClientSession newClientSession();

    public static native void runConfig(String str);

    public static native void setFileDescriptorProtector(FileDescriptorProtector fileDescriptorProtector);

    public static native void startConfig(String str);

    public static native void stop();

    public static void touch() {
    }
}
