package ads_mobile_sdk;

import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import dev.epro.r0.O14090912391717061492;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class xw0 extends WebChromeClient {
    public final iy0 a;
    public final w81 b;

    public xw0(iy0 iy0Var) {
        this.a = iy0Var;
        this.b = iy0Var.g;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        et0 et0Var;
        webView.getClass();
        if (!(webView instanceof tx0) || (et0Var = ((tx0) webView).f113o) == null) {
            return;
        }
        et0Var.a$1(3);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.getClass();
        if (consoleMessage.message() == null) {
            return true;
        }
        R7033599853981556291.E(this.a.c, null, null, new fb((Object) this, (Object) consoleMessage, (R4833348786910499294) null, (byte) 27), 3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        webView.getClass();
        message.getClass();
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new O14090912391717061492(this));
        Object obj = message.obj;
        obj.getClass();
        ((WebView.WebViewTransport) obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        xv.c("JavaScript alert() ignored: ".concat(str2), null);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        jsResult.getClass();
        xv.c("JavaScript confirm() ignored: ".concat(str2), null);
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        jsPromptResult.getClass();
        xv.c("JavaScript prompt() ignored: ".concat(str2), null);
        jsPromptResult.cancel();
        return true;
    }
}
