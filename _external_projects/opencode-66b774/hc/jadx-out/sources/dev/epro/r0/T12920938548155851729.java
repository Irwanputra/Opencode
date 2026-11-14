package dev.epro.r0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public final class T12920938548155851729 {
    public final ConnectivityManager a;
    public final ConcurrentHashMap b;
    public final M14974071691098198889 c;

    public static final class Z11244019023321623390 extends ConnectivityManager.NetworkCallback {
        static {
            izmyclvb.qgayjvbiagej2(1106);
        }

        private native void xyhmhaddkkjk(T12920938548155851729 t12920938548155851729);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onLinkPropertiesChanged(Network network, LinkProperties linkProperties);

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final native void onLost(Network network);

        public Z11244019023321623390() {
            xyhmhaddkkjk(T12920938548155851729.this);
        }
    }

    static {
        izmyclvb.qgayjvbiagej2(1576);
    }

    private native void qkmmjaureemm(Context context);

    public final native List a();

    public final native Object b(K14749510448791472029 k14749510448791472029);

    public final native Set c();

    public final native String d();

    public T12920938548155851729(Context context) {
        context.getClass();
        qkmmjaureemm(context);
    }
}
