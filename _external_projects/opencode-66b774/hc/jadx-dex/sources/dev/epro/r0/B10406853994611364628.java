package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B10406853994611364628 extends java.net.ProxySelector {
    public static final dev.epro.r0.B10406853994611364628 a = new dev.epro.r0.B10406853994611364628();

    @Override // java.net.ProxySelector
    public final java.util.List select(java.net.URI uri) {
        if (uri != null) {
            return dev.epro.r0.K5751602218013079365.U(java.net.Proxy.NO_PROXY);
        }
        dev.epro.r0.S10973172697741180971.j("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
    }
}
