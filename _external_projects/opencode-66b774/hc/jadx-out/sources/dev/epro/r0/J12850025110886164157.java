package dev.epro.r0;

import android.webkit.WebView;
import androidx.webkit.WebViewStartUpConfig;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J12850025110886164157 implements R14870407523536536272 {
    public final WebViewProviderFactoryBoundaryInterface a;

    public J12850025110886164157(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // dev.epro.r0.R14870407523536536272
    public final String[] a() {
        return this.a.getSupportedFeatures();
    }

    @Override // dev.epro.r0.R14870407523536536272
    public final void b(WebViewStartUpConfig webViewStartUpConfig, L4980660535418402690 l4980660535418402690) {
        this.a.startUpWebView(new J15503348699114933825(new M204440408817344908(webViewStartUpConfig, (byte) 5)), new J15503348699114933825(new Q7424593394344484332(l4980660535418402690)));
    }

    @Override // dev.epro.r0.R14870407523536536272
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) K5751602218013079365.w(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }

    @Override // dev.epro.r0.R14870407523536536272
    public final ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) K5751602218013079365.w(ProfileStoreBoundaryInterface.class, this.a.getProfileStore());
    }

    @Override // dev.epro.r0.R14870407523536536272
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) K5751602218013079365.w(StaticsBoundaryInterface.class, this.a.getStatics());
    }

    @Override // dev.epro.r0.R14870407523536536272
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) K5751602218013079365.w(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }
}
