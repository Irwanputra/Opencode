package dev.epro.r0;

import ads_mobile_sdk.f32;
import ads_mobile_sdk.q22;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L14793767707362067090 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public final Object b;

    public L14793767707362067090(B2138252231653711516 b2138252231653711516) {
        this.a = (byte) 0;
        this.b = b2138252231653711516;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 2:
                network.getClass();
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                q22 q22Var = (q22) this.b;
                q22Var.c.getClass();
                long a0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
                W5797197595347441198 w5797197595347441198 = q22Var.b;
                N9388237224661464957 n9388237224661464957 = new N9388237224661464957(q22Var, a0, network, null, (byte) 1);
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(n9388237224661464957, null, (byte) 1), 2);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 3:
                network.getClass();
                if (network.equals(((H16804135748878711746) this.b).f.getActiveNetwork())) {
                    B14824868959299866349 n = B14824868959299866349.n();
                    int i = J16202216050578767584.a;
                    n.getClass();
                    H16804135748878711746 h16804135748878711746 = (H16804135748878711746) this.b;
                    Object obj = h16804135748878711746.d;
                    if (obj == null) {
                        obj = h16804135748878711746.c();
                    }
                    U4907063343750015025 u4907063343750015025 = (U4907063343750015025) obj;
                    H16804135748878711746 h168041357488787117462 = (H16804135748878711746) this.b;
                    synchronized (h168041357488787117462.g) {
                        if (h168041357488787117462.h == z) {
                            return;
                        }
                        h168041357488787117462.h = z;
                        ((H16804135748878711746) this.b).d(new U4907063343750015025(u4907063343750015025.a, u4907063343750015025.b, u4907063343750015025.c, u4907063343750015025.d, z));
                        return;
                    }
                }
                return;
            default:
                super.onBlockedStatusChanged(network, z);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                B14824868959299866349 n = B14824868959299866349.n();
                int i = T975435490942095199.a;
                n.getClass();
                ((B2138252231653711516) this.b).invoke(P3556858185158226376.a);
                return;
            case 1:
                synchronized (((f32) this.b)) {
                    f32 f32Var = (f32) this.b;
                    f32Var.d = network;
                    f32Var.c = networkCapabilities;
                }
                return;
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                q22 q22Var = (q22) this.b;
                q22Var.c.getClass();
                long a0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
                W5797197595347441198 w5797197595347441198 = q22Var.b;
                O11111548397065333129 o11111548397065333129 = new O11111548397065333129(q22Var, a0, network, networkCapabilities, (R4833348786910499294) null);
                I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(o11111548397065333129, null, (byte) 1), 2);
                return;
            default:
                network.getClass();
                networkCapabilities.getClass();
                B14824868959299866349 n2 = B14824868959299866349.n();
                int i2 = J16202216050578767584.a;
                networkCapabilities.toString();
                n2.getClass();
                H16804135748878711746 h16804135748878711746 = (H16804135748878711746) this.b;
                h16804135748878711746.d(J16202216050578767584.a(h16804135748878711746.f, h16804135748878711746.h));
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                network.getClass();
                B14824868959299866349 n = B14824868959299866349.n();
                int i = T975435490942095199.a;
                n.getClass();
                ((B2138252231653711516) this.b).invoke(new A6522995672858297071(7));
                return;
            case 1:
                synchronized (((f32) this.b)) {
                    try {
                        if (network.equals(((f32) this.b).d)) {
                            f32 f32Var = (f32) this.b;
                            f32Var.d = null;
                            f32Var.c = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                network.getClass();
                E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                q22 q22Var = (q22) this.b;
                q22Var.c.getClass();
                long a0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
                W5797197595347441198 w5797197595347441198 = q22Var.b;
                R4833348786910499294 r4833348786910499294 = null;
                H1843233428029030203 h1843233428029030203 = new H1843233428029030203((byte) 2, a0, r4833348786910499294, q22Var);
                I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(h1843233428029030203, r4833348786910499294, (byte) 1), 2);
                return;
            default:
                network.getClass();
                B14824868959299866349 n2 = B14824868959299866349.n();
                int i2 = J16202216050578767584.a;
                n2.getClass();
                ((H16804135748878711746) this.b).d(new U4907063343750015025(false, false, false, false, false));
                return;
        }
    }

    public /* synthetic */ L14793767707362067090(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
