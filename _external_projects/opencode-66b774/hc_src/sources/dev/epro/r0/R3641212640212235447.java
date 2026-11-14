package dev.epro.r0;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebViewPageBoundaryInterface;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R3641212640212235447 {
    private final WebViewPageBoundaryInterface mPageBoundaryInterface;

    public R3641212640212235447(WebViewPageBoundaryInterface webViewPageBoundaryInterface) {
        this.mPageBoundaryInterface = webViewPageBoundaryInterface;
    }

    public static void a(InvocationHandler invocationHandler) {
        WebViewPageBoundaryInterface webViewPageBoundaryInterface = (WebViewPageBoundaryInterface) K5751602218013079365.w(WebViewPageBoundaryInterface.class, invocationHandler);
        Object orCreatePeer = webViewPageBoundaryInterface.getOrCreatePeer(new J5800360223679855765(webViewPageBoundaryInterface, (byte) 2));
        Objects.requireNonNull(orCreatePeer);
    }
}
