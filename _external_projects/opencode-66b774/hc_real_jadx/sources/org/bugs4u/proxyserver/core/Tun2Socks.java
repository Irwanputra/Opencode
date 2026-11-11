package org.bugs4u.proxyserver.core;

import android.annotation.TargetApi;
import android.os.ParcelFileDescriptor;
import java.net.Socket;
import xyz.easypro.ecrypt.utils.Crypt;

@TargetApi(12)
/* loaded from: /tmp/opencode/hc_real.dex */
public class Tun2Socks {
    private static final boolean LOGD = false;
    private static final String TAG = "Tun2Socks";
    private static String mDnsgwServerAddress;
    private static String mSocksServerAddress;
    private static String mUdpgwServerAddress;
    private static boolean mUdpgwTransparentDNS;
    private static ParcelFileDescriptor mVpnInterfaceFileDescriptor;
    private static int mVpnInterfaceMTU;
    private static String mVpnIpAddress;
    private static String mVpnNetMask;

    public interface IProtectSocket {
        boolean doVpnProtect(Socket socket);
    }

    public static void Start(ParcelFileDescriptor parcelFileDescriptor, int i, String str, String str2, String str3, String str4, String str5, boolean z) {
        mVpnInterfaceFileDescriptor = parcelFileDescriptor;
        mVpnInterfaceMTU = i;
        mVpnIpAddress = str;
        mVpnNetMask = str2;
        mSocksServerAddress = str3;
        mDnsgwServerAddress = str4;
        mUdpgwServerAddress = str5;
        mUdpgwTransparentDNS = z;
        if (parcelFileDescriptor != null) {
            runTun2Socks(parcelFileDescriptor.detachFd(), mVpnInterfaceMTU, mVpnIpAddress, mVpnNetMask, mSocksServerAddress, mDnsgwServerAddress, mUdpgwServerAddress, mUdpgwTransparentDNS ? 1 : 0);
        }
    }

    public static void Stop() {
        terminateTun2Socks();
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        str.compareTo(Crypt.a(Crypt.xrc("Og<\u001ddfLglAboHdnAejL1>Icg@0=N4lJa")));
    }

    private static native int runTun2Socks(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3);

    private static native void terminateTun2Socks();
}
