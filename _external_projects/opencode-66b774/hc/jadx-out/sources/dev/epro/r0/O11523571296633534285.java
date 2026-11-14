package dev.epro.r0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O11523571296633534285 implements WebViewNavigationListenerBoundaryInterface {
    public static final String[] a = {"WEB_VIEW_NAVIGATION_LISTENER_V1"};

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof O11523571296633534285)) {
            throw null;
        }
        return false;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return a;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onFirstContentfulPaint(InvocationHandler invocationHandler, long j) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onNavigationCompleted(InvocationHandler invocationHandler) {
        S4890787412264320098.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onNavigationRedirected(InvocationHandler invocationHandler) {
        S4890787412264320098.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onNavigationStarted(InvocationHandler invocationHandler) {
        S4890787412264320098.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onPageDeleted(InvocationHandler invocationHandler) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationListenerBoundaryInterface
    public final void onPageLoadEventFired(InvocationHandler invocationHandler) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }
}
