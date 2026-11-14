package ads_mobile_sdk;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import dev.epro.r0.P1789376955961125859;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class uu1 extends WebViewClient {
    public final /* synthetic */ xu1 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ uu1(xu1 xu1Var, byte b) {
        this.b = b;
        this.a = xu1Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        byte b = this.b;
        xu1 xu1Var = this.a;
        switch (b) {
            case 0:
                xu1Var.a(webView, renderProcessGoneDetail);
                break;
            default:
                xu1Var.a(webView, renderProcessGoneDetail);
                break;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.b) {
            case 0:
                return P1789376955961125859.e(webResourceRequest.getUrl().toString());
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.b) {
            case 0:
                return P1789376955961125859.e(str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
