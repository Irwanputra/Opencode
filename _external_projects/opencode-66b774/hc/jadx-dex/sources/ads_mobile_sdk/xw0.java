package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class xw0 extends android.webkit.WebChromeClient {
    public final ads_mobile_sdk.iy0 a;
    public final ads_mobile_sdk.w81 b;

    public xw0(ads_mobile_sdk.iy0 iy0Var) {
        this.a = iy0Var;
        this.b = iy0Var.g;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(android.webkit.WebView webView) {
        ads_mobile_sdk.et0 et0Var;
        webView.getClass();
        if (!(webView instanceof ads_mobile_sdk.tx0) || (et0Var = ((ads_mobile_sdk.tx0) webView).f113o) == null) {
            return;
        }
        et0Var.a$1(3);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        consoleMessage.getClass();
        if (consoleMessage.message() == null) {
            return true;
        }
        dev.epro.r0.R7033599853981556291.E(this.a.c, (dev.epro.r0.G8001132634698687269) null, (dev.epro.r0.L856869997670741194) null, new ads_mobile_sdk.fb(this, consoleMessage, (dev.epro.r0.R4833348786910499294) null, (byte) 27), 3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(android.webkit.WebView webView, boolean z, boolean z2, android.os.Message message) {
        webView.getClass();
        message.getClass();
        android.webkit.WebView webView2 = new android.webkit.WebView(webView.getContext());
        webView2.setWebViewClient(new dev.epro.r0.O14090912391717061492(this));
        java.lang.Object obj = message.obj;
        obj.getClass();
        ((android.webkit.WebView.WebViewTransport) obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        ads_mobile_sdk.xv.c("JavaScript alert() ignored: ".concat(str2), null);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        ads_mobile_sdk.xv.c("JavaScript confirm() ignored: ".concat(str2), null);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, android.webkit.JsPromptResult jsPromptResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        jsPromptResult.getClass();
        ads_mobile_sdk.xv.c("JavaScript prompt() ignored: ".concat(str2), null);
        jsPromptResult.cancel();
        return true;
    }
}
