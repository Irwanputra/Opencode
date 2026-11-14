package dev.epro.r0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class Y5336564566379632555 implements AutoCloseable {
    public static final /* synthetic */ int j = 0;
    public final ConnectivityManager a;
    public final Object b;
    public final Object c;
    public final LinkedHashMap d;
    public long e;
    public final CountDownLatch f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final Y6921797927338498306 i;

    public static final class Y6921797927338498306 extends ConnectivityManager.NetworkCallback {
        static {
            izmyclvb.qgayjvbiagej2(1083);
        }

        private native void sjdctorngvtt(Y5336564566379632555 y5336564566379632555);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onAvailable(Network network);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onLost(Network network);

        public Y6921797927338498306() {
            sjdctorngvtt(Y5336564566379632555.this);
        }
    }

    static {
        izmyclvb.qgayjvbiagej2(756);
        pwxekowvjzfi();
    }

    private static native void pwxekowvjzfi();

    private native void yxzulksankvi(Context context);

    public final native B74543127509826493 b();

    public final native void c();

    @Override // java.lang.AutoCloseable
    public final native void close();

    public final native void d(Network network, NetworkCapabilities networkCapabilities);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.qgayjvbiagej2(1420);
        }

        private native void tauuiemajttu(O18369580107802500074 o18369580107802500074);

        private native void xvzgozqjqlmh();

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            tauuiemajttu(o18369580107802500074);
        }

        private Z11244019023321623390() {
            xvzgozqjqlmh();
        }
    }

    public Y5336564566379632555(Context context) {
        context.getClass();
        yxzulksankvi(context);
    }
}
