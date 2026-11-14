package dev.epro.sock5tunnel;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Socks5Tunnel {
    public static final Socks5Tunnel INSTANCE = new Socks5Tunnel();

    static {
        System.loadLibrary("hev-socks5-tunnel");
    }

    private Socks5Tunnel() {
    }

    public static final native long[] tProxyGetStats();

    public static final native void tProxyStartService(String str, int i);

    public static final native void tProxyStartServiceFromConfig(String str, int i);

    public static final native void tProxyStopService();
}
