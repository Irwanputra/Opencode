package dev.epro.r0;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S4890787412264320098 {
    public WebViewNavigationBoundaryInterface a;

    public static void a(InvocationHandler invocationHandler) {
        WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) K5751602218013079365.w(WebViewNavigationBoundaryInterface.class, invocationHandler);
        Object orCreatePeer = webViewNavigationBoundaryInterface.getOrCreatePeer(new J5800360223679855765(webViewNavigationBoundaryInterface, (byte) 1));
        Objects.requireNonNull(orCreatePeer);
    }
}
