package dev.epro.r0;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public final class G8362827300072514641 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ B13729205492206812220 a;
    public final /* synthetic */ boolean b;

    static {
        izmyclvb.dpqpjfpoanwt1(1000);
    }

    private native void cjevfpvmndfr(B13729205492206812220 b13729205492206812220, boolean z);

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final native void onAvailable(Network network);

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final native void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities);

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final native void onLinkPropertiesChanged(Network network, LinkProperties linkProperties);

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final native void onLost(Network network);

    public G8362827300072514641(B13729205492206812220 b13729205492206812220, boolean z) {
        this.a = b13729205492206812220;
        this.b = z;
        cjevfpvmndfr(b13729205492206812220, z);
    }
}
