package dev.epro.tun2socks;

import android.os.ParcelFileDescriptor;
import dev.epro.r0.I1632105416032993715;
import dev.epro.r0.S10973172697741180971;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public class Tun2Socks {
    public static volatile boolean a;
    public static final I1632105416032993715 b = new I1632105416032993715((byte) 15);

    public static long[] a() {
        if (a) {
            return readTrafficStats();
        }
        return null;
    }

    private static native boolean armSession(long j);

    public static /* synthetic */ void b(long j, ParcelFileDescriptor parcelFileDescriptor, int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        if (!a) {
            System.loadLibrary("tun2socks");
            a = true;
        }
        I1632105416032993715 i1632105416032993715 = b;
        if (i1632105416032993715.r(j)) {
            return;
        }
        if (armSession(j)) {
            try {
                runTun2Socks(parcelFileDescriptor.detachFd(), i, str, str2, str3, "127.0.0.1:1080", str4, str5, z ? 1 : 0, z2 ? 1 : 0, z3 ? 1 : 0, z4 ? 1 : 0);
            } finally {
                finishSession(j);
            }
        } else {
            if (i1632105416032993715.r(j)) {
                return;
            }
            S10973172697741180971.m("tun2socks session is still active");
        }
    }

    public static void c(long j) {
        long j2;
        AtomicLong atomicLong = (AtomicLong) b.d;
        do {
            j2 = atomicLong.get();
            if (j <= j2) {
                break;
            }
        } while (!atomicLong.compareAndSet(j2, j));
        if (a) {
            cancelSession(j);
        }
    }

    private static native void cancelSession(long j);

    private static native void finishSession(long j);

    public static void logTun2Socks(String str, String str2, String str3) {
        str.compareTo("ERROR");
    }

    private static native long[] readTrafficStats();

    private static native int runTun2Socks(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4, int i5, int i6);
}
