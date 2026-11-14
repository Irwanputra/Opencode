package dev.epro.litevpn;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class LiteVpnNative {
    public static final dev.epro.litevpn.LiteVpnNative a = new dev.epro.litevpn.LiteVpnNative();

    static {
        java.lang.System.loadLibrary("litevpn");
    }

    public final native long create(byte[] bArr, dev.epro.litevpn.LiteVpnSession liteVpnSession, int i);

    public final native int destroy(long j);

    public final native int reconnect(long j, int i);

    public final native int setDestinationObserverV1(long j, boolean z);

    public final native int start(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public final native int stop(long j);

    public final native int submitPacket(long j, byte[] bArr, int i);
}
