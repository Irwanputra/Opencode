package dev.epro.relay;

import dev.epro.mobile.RetryHandler;
import dev.epro.xray.SocketProtector;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public interface RuntimeHost extends SocketProtector, RetryHandler, dev.epro.slowdns.SocketProtector {
    void onActive(String str);

    void onClientRegion(String str);

    void onDialing(String str);

    void onError(String str);

    void onListening(int i);

    void onReconnectLimitReached(int i);

    void onRetry(int i, int i2);

    void onState(String str);

    void onTrafficRateLimits(long j, long j2);

    @Override // dev.epro.xray.SocketProtector
    boolean protect(long j);
}
