package dev.epro.r0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import java.util.LinkedHashMap;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public final class H6880941267287297223 {
    public static final /* synthetic */ int l = 0;
    public final T12920938548155851729 a;
    public final Context b;
    public final ConnectivityManager c;
    public final WifiManager d;
    public final Object e;
    public final LinkedHashMap f;
    public boolean g;
    public final B18437066071346442440 h;
    public final Y6921797927338498306 i;
    public final Y11460403151847909905 j;
    public final O1495669038463313080 k;

    public static final class Y11460403151847909905 extends BroadcastReceiver {
        static {
            izmyclvb.dpqpjfpoanwt1(1069);
        }

        private native void blbysdshbeoh(H6880941267287297223 h6880941267287297223);

        @Override // android.content.BroadcastReceiver
        public final native void onReceive(Context context, Intent intent);

        public Y11460403151847909905() {
            blbysdshbeoh(H6880941267287297223.this);
        }
    }

    public static final class Y6921797927338498306 extends ConnectivityManager.NetworkCallback {
        static {
            izmyclvb.dpqpjfpoanwt1(1618);
        }

        private native void qkzafmllgzhu(H6880941267287297223 h6880941267287297223);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onAvailable(Network network);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onLost(Network network);

        public Y6921797927338498306() {
            qkzafmllgzhu(H6880941267287297223.this);
        }
    }

    static {
        izmyclvb.dpqpjfpoanwt1(1377);
        zuloubggykyd();
    }

    private final native void a();

    private final native void b();

    private final native void c();

    private native void pfdckydbarnb(Context context, T12920938548155851729 t12920938548155851729);

    private static native void zuloubggykyd();

    public final native void d(Network network, R18035714589640987170 r18035714589640987170, boolean z);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1616);
        }

        private native void fbbfzzhclcum();

        private native void nacqnqtrqtlk(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            nacqnqtrqtlk(o18369580107802500074);
        }

        private Z11244019023321623390() {
            fbbfzzhclcum();
        }
    }

    public H6880941267287297223(Context context, T12920938548155851729 t12920938548155851729) {
        context.getClass();
        t12920938548155851729.getClass();
        pfdckydbarnb(context, t12920938548155851729);
    }
}
