package dev.epro.r0;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J16202216050578767584 {
    public static final /* synthetic */ int a = 0;

    static {
        B14824868959299866349.o("NetworkStateTracker");
    }

    public static final U4907063343750015025 a(ConnectivityManager connectivityManager, boolean z) {
        boolean z2;
        NetworkInfo activeNetworkInfo;
        boolean z3;
        boolean zHasCapability;
        NetworkCapabilities networkCapabilities;
        connectivityManager.getClass();
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException unused) {
                B14824868959299866349.n().getClass();
            }
            zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
            z2 = z;
        } catch (SecurityException unused2) {
            z2 = z;
        }
        try {
            return new U4907063343750015025(z3, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true, z2);
        } catch (SecurityException unused3) {
            B14824868959299866349.n().getClass();
            return new U4907063343750015025(false, false, false, true, z2);
        }
    }
}
