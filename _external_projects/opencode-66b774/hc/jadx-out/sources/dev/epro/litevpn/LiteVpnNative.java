package dev.epro.litevpn;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
final class LiteVpnNative {
    public static final LiteVpnNative a = new LiteVpnNative();

    static {
        System.loadLibrary("litevpn");
    }

    public final native long create(byte[] bArr, LiteVpnSession liteVpnSession, int i);

    public final native int destroy(long j);

    public final native int reconnect(long j, int i);

    public final native int setDestinationObserverV1(long j, boolean z);

    public final native int start(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public final native int stop(long j);

    public final native int submitPacket(long j, byte[] bArr, int i);
}
