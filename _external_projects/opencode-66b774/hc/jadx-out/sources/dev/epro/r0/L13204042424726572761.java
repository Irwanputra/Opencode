package dev.epro.r0;

import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L13204042424726572761 implements WebViewNavigationClientBoundaryInterface {
    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{WebViewFeature.NAVIGATION_CALLBACK_BASIC};
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onFirstContentfulPaint(InvocationHandler invocationHandler) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationCompleted(InvocationHandler invocationHandler) {
        S4890787412264320098.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationRedirected(InvocationHandler invocationHandler) {
        S4890787412264320098.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onNavigationStarted(InvocationHandler invocationHandler) {
        S4890787412264320098.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageDOMContentLoadedEventFired(InvocationHandler invocationHandler) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageDeleted(InvocationHandler invocationHandler) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public final void onPageLoadEventFired(InvocationHandler invocationHandler) {
        R3641212640212235447.a(invocationHandler);
        throw null;
    }
}
