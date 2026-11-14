package dev.epro.r0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class J16075655124062498270 implements AutoCloseable {
    public final ConnectivityManager a;
    public final ConcurrentHashMap b;
    public volatile CountDownLatch c;
    public volatile boolean d;
    public final Z11244019023321623390 e;

    public static final class Z11244019023321623390 extends ConnectivityManager.NetworkCallback {
        static {
            izmyclvb.dpqpjfpoanwt1(892);
        }

        private native void hajjniohbude(J16075655124062498270 j16075655124062498270);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onAvailable(Network network);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onLost(Network network);

        public Z11244019023321623390() {
            hajjniohbude(J16075655124062498270.this);
        }
    }

    static {
        izmyclvb.dpqpjfpoanwt1(303);
    }

    private native void vydrjlrqppls(Context context);

    public final native ArrayList b();

    public final native void c();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native void d(Network network, NetworkCapabilities networkCapabilities);

    public J16075655124062498270(Context context) {
        context.getClass();
        vydrjlrqppls(context);
    }
}
