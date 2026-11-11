package ca.psiphon;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.NetworkInfo;
import android.net.VpnService;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.TelephonyManager;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.jasypt.digest.StandardStringDigester;
import p131.p155.p156.p157.C2098;
import psi.Psi;
import psi.PsiphonProvider;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PsiphonTunnel {
    private static final String DEFAULT_PRIMARY_DNS_SERVER = "8.8.4.4";
    private static final String DEFAULT_SECONDARY_DNS_SERVER = "8.8.8.8";
    private static final int UDPGW_SERVER_PORT = 7300;
    private static final int VPN_INTERFACE_MTU = 1500;
    private static final String VPN_INTERFACE_NETMASK = "255.255.255.0";
    private static PsiphonTunnel mPsiphonTunnel;
    private final InterfaceC0327 mHostService;
    private C0330 mPrivateAddress;
    private final boolean mShouldRouteThroughTunnelAutomatically;
    private Thread mTun2SocksThread;
    private AtomicBoolean mVpnMode = new AtomicBoolean(false);
    private AtomicReference<ParcelFileDescriptor> mTunFd = new AtomicReference<>();
    private AtomicInteger mLocalSocksProxyPort = new AtomicInteger(0);
    private AtomicBoolean mRoutingThroughTunnel = new AtomicBoolean(false);
    private AtomicBoolean mIsWaitingForNetworkConnectivity = new AtomicBoolean(false);
    private AtomicReference<String> mClientPlatformPrefix = new AtomicReference<>("");
    private AtomicReference<String> mClientPlatformSuffix = new AtomicReference<>("");

    /* renamed from: ca.psiphon.PsiphonTunnel$〺つふすそ, reason: contains not printable characters */
    public static class C0326 extends Exception {
        public C0326(String str) {
            super(str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0326(java.lang.String r2, java.lang.Throwable r3) {
            /*
                r1 = this;
                java.lang.String r0 = ": "
                java.lang.StringBuilder r2 = p131.p155.p156.p157.C2098.m4179(r2, r0)
                java.lang.String r3 = r3.getMessage()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.C0326.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* renamed from: ca.psiphon.PsiphonTunnel$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0327 {
    }

    /* renamed from: ca.psiphon.PsiphonTunnel$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0328 implements Runnable {

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final /* synthetic */ boolean f1986;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ ParcelFileDescriptor f1987;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public final /* synthetic */ String f1988;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final /* synthetic */ int f1989;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public final /* synthetic */ String f1990;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public final /* synthetic */ String f1991;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final /* synthetic */ String f1992;

        public RunnableC0328(PsiphonTunnel psiphonTunnel, ParcelFileDescriptor parcelFileDescriptor, int i, String str, String str2, String str3, String str4, boolean z) {
            this.f1987 = parcelFileDescriptor;
            this.f1989 = i;
            this.f1992 = str;
            this.f1990 = str2;
            this.f1991 = str3;
            this.f1988 = str4;
            this.f1986 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            PsiphonTunnel.runTun2Socks(this.f1987.detachFd(), this.f1989, this.f1992, this.f1990, this.f1991, this.f1988, this.f1986 ? 1 : 0);
        }
    }

    /* renamed from: ca.psiphon.PsiphonTunnel$づざかべべ, reason: contains not printable characters */
    public class C0329 implements PsiphonProvider {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public PsiphonTunnel f1993;

        public C0329(PsiphonTunnel psiphonTunnel, PsiphonTunnel psiphonTunnel2) {
            this.f1993 = psiphonTunnel2;
        }

        @Override // psi.PsiphonProvider
        public String bindToDevice(long j) {
            return this.f1993.bindToDevice(j);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public String getNetworkID() {
            return this.f1993.getNetworkID();
        }

        @Override // psi.PsiphonProvider
        public String getPrimaryDnsServer() {
            return this.f1993.getPrimaryDnsServer();
        }

        @Override // psi.PsiphonProvider
        public String getSecondaryDnsServer() {
            return this.f1993.getSecondaryDnsServer();
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public long hasNetworkConnectivity() {
            return this.f1993.hasNetworkConnectivity();
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public String iPv6Synthesize(String str) {
            return this.f1993.iPv6Synthesize(str);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNoticeHandler
        public void notice(String str) {
            this.f1993.notice(str);
        }
    }

    /* renamed from: ca.psiphon.PsiphonTunnel$びぐびあび, reason: contains not printable characters */
    public static class C0330 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final String f1994;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public final int f1995;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public final String f1996;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public final String f1997;

        public C0330(String str, String str2, int i, String str3) {
            this.f1996 = str;
            this.f1994 = str2;
            this.f1995 = i;
            this.f1997 = str3;
        }
    }

    private PsiphonTunnel(InterfaceC0327 interfaceC0327, boolean z) {
        this.mHostService = interfaceC0327;
        this.mShouldRouteThroughTunnelAutomatically = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    public String bindToDevice(long j) {
        PsiphonVPNService psiphonVPNService = (PsiphonVPNService) this.mHostService;
        psiphonVPNService.getClass();
        if (psiphonVPNService.protect((int) j)) {
            return "";
        }
        throw new C0326("protect socket failed");
    }

    private static File defaultDataRootDirectory(Context context) {
        return context.getFileStreamPath("ca.psiphon.PsiphonTunnel.tunnel-core");
    }

    private static native int disableUdpGwKeepalive();

    private static native int enableUdpGwKeepalive();

    @TargetApi(21)
    private static Collection<InetAddress> getActiveNetworkDnsResolvers(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            Class<?> cls = Class.forName("android.net.LinkProperties");
            Object invoke = ConnectivityManager.class.getMethod("getActiveLinkProperties", new Class[0]).invoke(connectivityManager, new Object[0]);
            if (invoke != null) {
                if (Build.VERSION.SDK_INT < 21) {
                    Iterator it = ((Collection) cls.getMethod("getDnses", new Class[0]).invoke(invoke, new Object[0])).iterator();
                    while (it.hasNext()) {
                        arrayList.add((InetAddress) it.next());
                    }
                } else {
                    Iterator<InetAddress> it2 = ((LinkProperties) invoke).getDnsServers().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next());
                    }
                }
            }
            return arrayList;
        } catch (ClassNotFoundException e) {
            throw new C0326("getActiveNetworkDnsResolvers failed", e);
        } catch (IllegalAccessException e2) {
            throw new C0326("getActiveNetworkDnsResolvers failed", e2);
        } catch (IllegalArgumentException e3) {
            throw new C0326("getActiveNetworkDnsResolvers failed", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0326("getActiveNetworkDnsResolvers failed", e4);
        } catch (NullPointerException e5) {
            throw new C0326("getActiveNetworkDnsResolvers failed", e5);
        } catch (InvocationTargetException e6) {
            throw new C0326("getActiveNetworkDnsResolvers failed", e6);
        }
    }

    public static String getDefaultUpgradeDownloadFilePath(Context context) {
        return Psi.upgradeDownloadFilePath(defaultDataRootDirectory(context).getAbsolutePath());
    }

    private static String getDeviceRegion(Context context) {
        Locale locale;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String str = "";
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso == null) {
                simCountryIso = "";
            }
            if (simCountryIso.length() != 0 || telephonyManager.getPhoneType() == 2) {
                str = simCountryIso;
            } else {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (networkCountryIso != null) {
                    str = networkCountryIso;
                }
            }
        }
        if (str.length() == 0 && (locale = Locale.getDefault()) != null) {
            str = locale.getCountry();
        }
        return str.toUpperCase(Locale.US);
    }

    public static String getFirstActiveNetworkDnsResolver(Context context) {
        Collection<InetAddress> activeNetworkDnsResolvers = getActiveNetworkDnsResolvers(context);
        if (activeNetworkDnsResolvers.isEmpty()) {
            throw new C0326("no active network DNS resolver");
        }
        String inetAddress = activeNetworkDnsResolvers.iterator().next().toString();
        return inetAddress.startsWith("/") ? inetAddress.substring(1) : inetAddress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.net.NetworkInfo, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public String getNetworkID() {
        String str;
        ((PsiphonVPNService) this.mHostService).getClass();
        App app = App.f3759;
        ?? r2 = 0;
        try {
            r2 = ((ConnectivityManager) app.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
        }
        try {
            if (r2 != 0 && r2.getType() == 1) {
                WifiInfo connectionInfo = ((WifiManager) app.getSystemService("wifi")).getConnectionInfo();
                if (connectionInfo == null) {
                    return "WIFI";
                }
                String bssid = connectionInfo.getBSSID();
                if (bssid.equals("02:00:00:00:00:00")) {
                    bssid = String.valueOf(connectionInfo.getIpAddress());
                }
                str = "WIFI-" + bssid;
            } else {
                if (r2 == 0 || r2.getType() != 0) {
                    return "UNKNOWN";
                }
                TelephonyManager telephonyManager = (TelephonyManager) app.getSystemService("phone");
                if (telephonyManager == null) {
                    return "MOBILE";
                }
                str = "MOBILE-" + telephonyManager.getNetworkOperator();
            }
            return str;
        } catch (Exception unused2) {
            return r2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPrimaryDnsServer() {
        try {
            ((PsiphonVPNService) this.mHostService).getClass();
            return getFirstActiveNetworkDnsResolver(App.f3759);
        } catch (C0326 e) {
            InterfaceC0327 interfaceC0327 = this.mHostService;
            StringBuilder m4207 = C2098.m4207("failed to get active network DNS resolver: ");
            m4207.append(e.getMessage());
            ((PsiphonVPNService) interfaceC0327).m1691(m4207.toString());
            return DEFAULT_PRIMARY_DNS_SERVER;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSecondaryDnsServer() {
        return DEFAULT_SECONDARY_DNS_SERVER;
    }

    public static String getUpgradeDownloadFilePath(String str) {
        return Psi.upgradeDownloadFilePath(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0291 A[Catch: JSONException -> 0x02b4, TRY_LEAVE, TryCatch #0 {JSONException -> 0x02b4, blocks: (B:2:0x0000, B:5:0x0019, B:7:0x0025, B:9:0x002b, B:11:0x002f, B:12:0x0032, B:15:0x0291, B:20:0x003b, B:21:0x0044, B:23:0x004c, B:24:0x005b, B:26:0x0061, B:28:0x006b, B:29:0x0074, B:32:0x007e, B:33:0x0092, B:35:0x009a, B:36:0x00ae, B:38:0x00b6, B:39:0x00cd, B:41:0x00d5, B:42:0x00e9, B:44:0x00f1, B:45:0x0104, B:47:0x010c, B:48:0x011e, B:50:0x0126, B:51:0x012f, B:53:0x0137, B:54:0x0149, B:57:0x0153, B:58:0x0163, B:60:0x016b, B:61:0x017b, B:63:0x0183, B:64:0x0195, B:66:0x019d, B:67:0x01b6, B:69:0x01be, B:70:0x01cd, B:72:0x01d3, B:74:0x01dd, B:75:0x01e8, B:77:0x01ee, B:79:0x01f8, B:81:0x0200, B:82:0x0219, B:84:0x0221, B:85:0x0229, B:87:0x0231, B:89:0x0237, B:91:0x0243, B:92:0x0247, B:93:0x024b, B:95:0x0253, B:96:0x026d, B:98:0x0275), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void handlePsiphonNotice(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.handlePsiphonNotice(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long hasNetworkConnectivity() {
        ((PsiphonVPNService) this.mHostService).getClass();
        boolean hasNetworkConnectivity = hasNetworkConnectivity(App.f3759);
        boolean andSet = this.mIsWaitingForNetworkConnectivity.getAndSet(!hasNetworkConnectivity);
        if (!hasNetworkConnectivity && !andSet) {
            ((PsiphonVPNService) this.mHostService).getString(2131820626);
        } else if (hasNetworkConnectivity && andSet) {
            ((PsiphonVPNService) this.mHostService).getString(2131820626);
        }
        return hasNetworkConnectivity ? 1L : 0L;
    }

    private static boolean hasNetworkConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String iPv6Synthesize(String str) {
        return str;
    }

    private boolean isVpnMode() {
        return this.mVpnMode.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0157, code lost:
    
        if (java.lang.Boolean.parseBoolean(((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2744(((p034.p050.p053.C1216) team.dev.epro.apkcustom.App.m1604()).m2739())[15]) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String loadPsiphonConfig(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.loadPsiphonConfig(android.content.Context):java.lang.String");
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        ((PsiphonVPNService) mPsiphonTunnel.mHostService).m1691("tun2socks: " + str + "(" + str2 + "): " + str3);
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(InterfaceC0327 interfaceC0327) {
        PsiphonTunnel newPsiphonTunnelImpl;
        synchronized (PsiphonTunnel.class) {
            newPsiphonTunnelImpl = newPsiphonTunnelImpl(interfaceC0327, true);
        }
        return newPsiphonTunnelImpl;
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(InterfaceC0327 interfaceC0327, boolean z) {
        PsiphonTunnel newPsiphonTunnelImpl;
        synchronized (PsiphonTunnel.class) {
            newPsiphonTunnelImpl = newPsiphonTunnelImpl(interfaceC0327, z);
        }
        return newPsiphonTunnelImpl;
    }

    private static PsiphonTunnel newPsiphonTunnelImpl(InterfaceC0327 interfaceC0327, boolean z) {
        PsiphonTunnel psiphonTunnel = mPsiphonTunnel;
        if (psiphonTunnel != null) {
            psiphonTunnel.stop();
        }
        System.loadLibrary("psiphon");
        PsiphonTunnel psiphonTunnel2 = new PsiphonTunnel(interfaceC0327, z);
        mPsiphonTunnel = psiphonTunnel2;
        return psiphonTunnel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notice(String str) {
        handlePsiphonNotice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int runTun2Socks(int i, int i2, String str, String str2, String str3, String str4, int i3);

    private static C0330 selectPrivateAddress() {
        HashMap hashMap = new HashMap();
        hashMap.put("10", new C0330("10.0.0.1", "10.0.0.0", 8, "10.0.0.2"));
        hashMap.put("172", new C0330("172.16.0.1", "172.16.0.0", 12, "172.16.0.2"));
        hashMap.put("192", new C0330("192.168.0.1", "192.168.0.0", 16, "192.168.0.2"));
        hashMap.put("169", new C0330("169.254.1.1", "169.254.1.0", 24, "169.254.1.2"));
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (inetAddress instanceof Inet4Address) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.startsWith("10.")) {
                            hashMap.remove("10");
                        } else if (hostAddress.length() >= 6 && hostAddress.substring(0, 6).compareTo("172.16") >= 0 && hostAddress.substring(0, 6).compareTo("172.31") <= 0) {
                            hashMap.remove("172");
                        } else if (hostAddress.startsWith("192.168")) {
                            hashMap.remove("192");
                        }
                    }
                }
            }
            if (hashMap.size() > 0) {
                return (C0330) hashMap.values().iterator().next();
            }
            throw new C0326("no private address available");
        } catch (SocketException e) {
            throw new C0326("selectPrivateAddress failed", e);
        }
    }

    private void setLocalSocksProxyPort(int i) {
        this.mLocalSocksProxyPort.set(i);
    }

    private String setupTrustedCertificates(Context context) {
        PrintStream printStream;
        Throwable th;
        try {
            File file = new File(context.getDir("PsiphonCAStore", 0), "certs.dat");
            file.delete();
            try {
                printStream = new PrintStream(new FileOutputStream(file));
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                    keyStore.load(null, null);
                    Enumeration<String> aliases = keyStore.aliases();
                    while (aliases.hasMoreElements()) {
                        String str = new String(Base64.encode(((X509Certificate) keyStore.getCertificate(aliases.nextElement())).getEncoded(), 2), StandardStringDigester.MESSAGE_CHARSET);
                        int i = 0;
                        while (i < str.length()) {
                            int i2 = i + 64;
                            str.substring(i, Math.min(i2, str.length()));
                            i = i2;
                        }
                    }
                    ((PsiphonVPNService) this.mHostService).m1691("prepared PsiphonCAStore");
                    String absolutePath = file.getAbsolutePath();
                    printStream.close();
                    return absolutePath;
                } catch (Throwable th2) {
                    th = th2;
                    if (printStream == null) {
                        throw th;
                    }
                    printStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                printStream = null;
                th = th3;
            }
        } catch (IOException e) {
            throw new C0326("copy AndroidCAStore failed", e);
        } catch (KeyStoreException e2) {
            throw new C0326("copy AndroidCAStore failed", e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new C0326("copy AndroidCAStore failed", e3);
        } catch (CertificateException e4) {
            throw new C0326("copy AndroidCAStore failed", e4);
        }
    }

    @TargetApi(14)
    private ParcelFileDescriptor startDummyVpn(VpnService.Builder builder) {
        C0330 selectPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            try {
                try {
                    Locale.setDefault(new Locale("en"));
                    return builder.setSession(((PsiphonVPNService) this.mHostService).getString(2131820627)).setMtu(VPN_INTERFACE_MTU).addAddress(selectPrivateAddress.f1996, selectPrivateAddress.f1995).addRoute(selectPrivateAddress.f1994, selectPrivateAddress.f1995).addDnsServer(selectPrivateAddress.f1997).establish();
                } catch (IllegalArgumentException e) {
                    throw new C0326("startDummyVpn failed", e);
                }
            } catch (IllegalStateException e2) {
                throw new C0326("startDummyVpn failed", e2);
            } catch (SecurityException e3) {
                throw new C0326("startDummyVpn failed", e3);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void startPsiphon(String str) {
        stopPsiphon();
        this.mIsWaitingForNetworkConnectivity.set(false);
        ((PsiphonVPNService) this.mHostService).m1691("starting Psiphon library");
        try {
            ((PsiphonVPNService) this.mHostService).getClass();
            Psi.start(loadPsiphonConfig(App.f3759), str, "", new C0329(this, this), isVpnMode(), false);
            ((PsiphonVPNService) this.mHostService).m1691("Psiphon library started");
        } catch (Exception e) {
            throw new C0326("failed to start Psiphon library", e);
        }
    }

    @TargetApi(12)
    private void startTun2Socks(ParcelFileDescriptor parcelFileDescriptor, int i, String str, String str2, String str3, String str4, boolean z) {
        if (this.mTun2SocksThread != null) {
            return;
        }
        Thread thread = new Thread(new RunnableC0328(this, parcelFileDescriptor, i, str, str2, str3, str4, z));
        this.mTun2SocksThread = thread;
        thread.start();
        ((PsiphonVPNService) this.mHostService).m1691("tun2socks started");
    }

    @TargetApi(14)
    private boolean startVpn() {
        this.mVpnMode.set(true);
        this.mPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        try {
            try {
                try {
                    Locale.setDefault(new Locale("en"));
                    String str = this.mPrivateAddress.f1997;
                    VpnService.Builder mtu = ((VpnService.Builder) ((PsiphonVPNService) this.mHostService).m1693()).setSession(((PsiphonVPNService) this.mHostService).getString(2131820627)).setMtu(VPN_INTERFACE_MTU);
                    C0330 c0330 = this.mPrivateAddress;
                    VpnService.Builder addAddress = mtu.addAddress(c0330.f1996, c0330.f1995);
                    C0330 c03302 = this.mPrivateAddress;
                    ParcelFileDescriptor establish = addAddress.addRoute(c03302.f1994, c03302.f1995).addDnsServer(str).establish();
                    if (establish == null) {
                        return false;
                    }
                    this.mTunFd.set(establish);
                    this.mRoutingThroughTunnel.set(false);
                    ((PsiphonVPNService) this.mHostService).m1691("VPN established");
                    return true;
                } catch (IllegalArgumentException e) {
                    throw new C0326("startVpn failed", e);
                }
            } catch (IllegalStateException e2) {
                throw new C0326("startVpn failed", e2);
            } catch (SecurityException e3) {
                throw new C0326("startVpn failed", e3);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void stopPsiphon() {
        ((PsiphonVPNService) this.mHostService).m1691("stopping Psiphon library");
        Psi.stop();
        ((PsiphonVPNService) this.mHostService).m1691("Psiphon library stopped");
    }

    private void stopTun2Socks() {
        if (this.mTun2SocksThread != null) {
            try {
                terminateTun2Socks();
                this.mTun2SocksThread.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.mTun2SocksThread = null;
            ((PsiphonVPNService) this.mHostService).m1691("tun2socks stopped");
        }
    }

    private void stopVpn() {
        stopTun2Socks();
        ParcelFileDescriptor andSet = this.mTunFd.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (IOException unused) {
            }
        }
        this.mRoutingThroughTunnel.set(false);
    }

    private static native int terminateTun2Socks();

    public Object clone() {
        throw new CloneNotSupportedException();
    }

    public String exportExchangePayload() {
        return Psi.exportExchangePayload();
    }

    public boolean importExchangePayload(String str) {
        return Psi.importExchangePayload(str);
    }

    public synchronized void restartPsiphon() {
        stopPsiphon();
        startPsiphon("");
    }

    public void routeThroughTunnel() {
        ParcelFileDescriptor andSet;
        if (this.mRoutingThroughTunnel.compareAndSet(false, true) && (andSet = this.mTunFd.getAndSet(null)) != null) {
            StringBuilder m4207 = C2098.m4207("127.0.0.1:");
            m4207.append(Integer.toString(this.mLocalSocksProxyPort.get()));
            String sb = m4207.toString();
            StringBuilder m42072 = C2098.m4207("127.0.0.1:");
            m42072.append(Integer.toString(UDPGW_SERVER_PORT));
            startTun2Socks(andSet, VPN_INTERFACE_MTU, this.mPrivateAddress.f1997, VPN_INTERFACE_NETMASK, sb, m42072.toString(), true);
            ((PsiphonVPNService) this.mHostService).m1691("routing through tunnel");
        }
    }

    @TargetApi(14)
    public synchronized void seamlessVpnRestart(VpnService.Builder builder) {
        ParcelFileDescriptor startDummyVpn = startDummyVpn(builder);
        try {
            stopVpn();
            startVpn();
            if (startDummyVpn != null) {
                try {
                    startDummyVpn.close();
                } catch (IOException unused) {
                }
            }
            restartPsiphon();
        } catch (Throwable th) {
            if (startDummyVpn != null) {
                try {
                    startDummyVpn.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public void setClientPlatformAffixes(String str, String str2) {
        this.mClientPlatformPrefix.set(str);
        this.mClientPlatformSuffix.set(str2);
    }

    public synchronized boolean startRouting() {
        System.loadLibrary("socks2tun");
        return startVpn();
    }

    public synchronized void startTunneling(String str) {
        startPsiphon(str);
    }

    public synchronized void stop() {
        stopVpn();
        stopPsiphon();
        this.mVpnMode.set(false);
        this.mLocalSocksProxyPort.set(0);
    }

    public void writeRuntimeProfiles(String str, int i, int i2) {
        Psi.writeRuntimeProfiles(str, i, i2);
    }
}
