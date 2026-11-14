package dev.epro.slowdns;

import dev.epro.go.Seq;
import dev.epro.session.Session;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public abstract class Slowdns {

    /* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
    public static final class proxyDestinationObserver implements Seq.Proxy, DestinationObserver {
        private final int refnum;

        public proxyDestinationObserver(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        @Override // dev.epro.slowdns.DestinationObserver
        public native boolean canReportDestination();

        @Override // dev.epro.go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // dev.epro.slowdns.DestinationObserver
        public native void onDestination(String str, int i);
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

        @Override // dev.epro.slowdns.SocketProtector
        public native boolean protect(long j);
    }

    static {
        Seq.touch();
        Session.touch();
        _init();
    }

    private Slowdns() {
    }

    private static native void _init();

    public static native boolean isCalibrationPending(String str);

    public static native boolean isReady(String str);

    public static native void start(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6);

    public static native void startAutomaticWithSocketProtector(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver, SocketProtector socketProtector, String str7);

    public static native void startBondedSessionsWithSocketProtector(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver, SocketProtector socketProtector, String str7, String str8, long j2);

    public static native void startCalibratedSessionsWithSocketProtector(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver, SocketProtector socketProtector, String str7, String str8, long j2, boolean z2);

    public static native void startConfiguredSessionsWithSocketProtector(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver, SocketProtector socketProtector, String str7, String str8, long j2);

    public static native void startConfiguredWithSocketProtector(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver, SocketProtector socketProtector, String str7, String str8);

    public static native void startLimitedSessionsWithSocketProtector(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver, SocketProtector socketProtector, String str7, String str8, long j2, boolean z2, long j3, long j4);

    public static native void startWithDestinationObserver(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver);

    public static native void startWithSocketProtector(String str, String str2, String str3, String str4, String str5, long j, boolean z, String str6, DestinationObserver destinationObserver, SocketProtector socketProtector);

    public static native void stop();

    public static native void stopByListen(String str);

    public static void touch() {
    }
}
