package dev.epro.r0;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B10406853994611364628 extends ProxySelector {
    public static final B10406853994611364628 a = new B10406853994611364628();

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return K5751602218013079365.U(Proxy.NO_PROXY);
        }
        S10973172697741180971.j("uri must not be null");
        return null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }
}
