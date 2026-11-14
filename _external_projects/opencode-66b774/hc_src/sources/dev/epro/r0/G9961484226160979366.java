package dev.epro.r0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Arrays;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class G9961484226160979366 {
    public static final byte c;
    public final ConnectivityManager a;
    public final S17255966974483065294 b;

    public static final class Y6921797927338498306 extends ConnectivityManager.NetworkCallback {
        static {
            izmyclvb.dpqpjfpoanwt1(67);
        }

        private native void xwpzvzxbmsbf(G9961484226160979366 g9961484226160979366);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onAvailable(Network network);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onLost(Network network);

        public Y6921797927338498306() {
            xwpzvzxbmsbf(G9961484226160979366.this);
        }
    }

    static {
        int zrxsibrdtgqz;
        izmyclvb.dpqpjfpoanwt1(1124);
        Object[] objArr = new Object[4];
        while (true) {
            try {
                zrxsibrdtgqz = zrxsibrdtgqz(objArr);
            } finally {
                Arrays.fill(objArr, (Object) null);
            }
            if (zrxsibrdtgqz != 0) {
                switch (zrxsibrdtgqz) {
                    case 1:
                        c = ((Byte) objArr[1]).byteValue();
                    default:
                        throw null;
                }
                Arrays.fill(objArr, (Object) null);
            }
            return;
        }
    }

    private native void jyjdsrposatr(Context context);

    private static native int zrxsibrdtgqz(Object[] objArr);

    public final native Object a(R14062301455140331524 r14062301455140331524);

    public static final class Z11244019023321623390 {
        static {
            izmyclvb.dpqpjfpoanwt1(1457);
        }

        private native void tgqzzlwmvhqn();

        private native void womolrhgcnxi(O18369580107802500074 o18369580107802500074);

        public /* synthetic */ Z11244019023321623390(O18369580107802500074 o18369580107802500074) {
            this();
            womolrhgcnxi(o18369580107802500074);
        }

        private Z11244019023321623390() {
            tgqzzlwmvhqn();
        }
    }

    public G9961484226160979366(Context context) {
        context.getClass();
        jyjdsrposatr(context);
    }
}
