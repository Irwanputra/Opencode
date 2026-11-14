package dev.epro.r0;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N13075059653793055028 extends ConnectivityManager.NetworkCallback {
    public static final N13075059653793055028 a = new N13075059653793055028();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static void a() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    Iterator it = c.entrySet().iterator();
                    while (true) {
                        i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        F4096073349764486348 f4096073349764486348 = (F4096073349764486348) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        N13075059653793055028 n13075059653793055028 = a;
                        NetworkCapabilities networkCapabilities = d;
                        n13075059653793055028.getClass();
                        Boolean bool = f;
                        bool.getClass();
                        if (!bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities)) {
                            i = 1;
                        }
                        arrayList.add(new H9390398899829886498(f4096073349764486348, i != 0 ? P3556858185158226376.a : new A6522995672858297071(7)));
                    }
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        H9390398899829886498 h9390398899829886498 = (H9390398899829886498) obj;
                        ((F4096073349764486348) h9390398899829886498.a).invoke((G11493083415162978130) h9390398899829886498.b);
                    }
                    return;
                }
                B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
                int i2 = T975435490942095199.a;
                b14824868959299866349N.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
        int i = T975435490942095199.a;
        b14824868959299866349N.getClass();
        synchronized (b) {
            if (S10823041268949770285.t(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
        int i = T975435490942095199.a;
        b14824868959299866349N.getClass();
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
        int i = T975435490942095199.a;
        b14824868959299866349N.getClass();
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((F4096073349764486348) it.next()).invoke(new A6522995672858297071(7));
            }
        }
    }
}
