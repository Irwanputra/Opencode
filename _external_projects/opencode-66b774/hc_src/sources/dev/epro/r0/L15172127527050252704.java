package dev.epro.r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L15172127527050252704 {
    public static final J3301701597851028733 b;
    public static final L15172127527050252704 c;
    public static final /* synthetic */ L15172127527050252704[] d;
    public static final /* synthetic */ M665231115116566295 e;
    public final byte a;

    static {
        L15172127527050252704 l15172127527050252704 = new L15172127527050252704("ProfileAccepted", 0, 1);
        L15172127527050252704 l151721275270502527042 = new L15172127527050252704("RuntimeReady", 1, 2);
        L15172127527050252704 l151721275270502527043 = new L15172127527050252704("Resolving", 2, 3);
        L15172127527050252704 l151721275270502527044 = new L15172127527050252704("WaitingRetry", 3, 4);
        c = l151721275270502527044;
        L15172127527050252704[] l15172127527050252704Arr = {l15172127527050252704, l151721275270502527042, l151721275270502527043, l151721275270502527044, new L15172127527050252704("TransportConnecting", 4, 5), new L15172127527050252704("TransportConnected", 5, 6), new L15172127527050252704("TlsHandshake", 6, 7), new L15172127527050252704("CertificateVerified", 7, 8), new L15172127527050252704("ControlChannelReady", 8, 9), new L15172127527050252704("AuthenticationPending", 9, 10), new L15172127527050252704("ConfigurationNegotiating", 10, 11), new L15172127527050252704("TunConfiguring", 11, 12), new L15172127527050252704("RoutesApplied", 12, 13), new L15172127527050252704("SocketProtected", 13, 14), new L15172127527050252704("ControlPacketRejected", 14, 15), new L15172127527050252704("TransportEof", 15, 16), new L15172127527050252704("ConnectionRefused", 16, 17), new L15172127527050252704("NetworkUnreachable", 17, 18), new L15172127527050252704("TransportTimeout", 18, 19), new L15172127527050252704("ConnectionReset", 19, 20), new L15172127527050252704("ResolveFailed", 20, 21), new L15172127527050252704("TransportError", 21, 22), new L15172127527050252704("TlsError", 22, 23), new L15172127527050252704("ProxyError", 23, 24), new L15172127527050252704("UnsupportedFeature", 24, 25), new L15172127527050252704("ClientRestart", 25, 26), new L15172127527050252704("TunError", 26, 27)};
        d = l15172127527050252704Arr;
        e = new M665231115116566295(l15172127527050252704Arr);
        b = new J3301701597851028733((byte) 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L15172127527050252704(String str, int i, int i2) {
        this.a = i2;
    }

    public static L15172127527050252704 valueOf(String str) {
        return (L15172127527050252704) Enum.valueOf(L15172127527050252704.class, str);
    }

    public static L15172127527050252704[] values() {
        return (L15172127527050252704[]) d.clone();
    }
}
