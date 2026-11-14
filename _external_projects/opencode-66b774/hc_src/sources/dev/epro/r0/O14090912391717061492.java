package dev.epro.r0;

import ads_mobile_sdk.iy0;
import ads_mobile_sdk.xw0;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O14090912391717061492 extends WebViewClient {
    public final /* synthetic */ byte a = 2;
    public final Object b;

    public /* synthetic */ O14090912391717061492(A4716120536771319554 a4716120536771319554) {
        Objects.requireNonNull(a4716120536771319554);
        this.b = a4716120536771319554;
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).doUpdateVisitedHistory(webView, str, z);
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onFormResubmission(webView, message, message2);
                break;
            default:
                super.onFormResubmission(webView, message, message2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                A4716120536771319554 a4716120536771319554 = (A4716120536771319554) obj;
                int i = A4716120536771319554.d;
                if (str != null && str.startsWith("consent://")) {
                    a4716120536771319554.b.b(str);
                    break;
                }
                break;
            case 1:
                ((WebViewClient) obj).onLoadResource(webView, str);
                break;
            default:
                super.onLoadResource(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onPageCommitVisible(webView, str);
                break;
            default:
                super.onPageCommitVisible(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                A4716120536771319554 a4716120536771319554 = (A4716120536771319554) obj;
                if (!a4716120536771319554.c) {
                    a4716120536771319554.c = true;
                    break;
                }
                break;
            case 1:
                ((WebViewClient) obj).onPageFinished(webView, str);
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onPageStarted(webView, str, bitmap);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onReceivedClientCertRequest(webView, clientCertRequest);
                break;
            default:
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                C4341747165502163559 c4341747165502163559 = ((A4716120536771319554) obj).b;
                Locale locale = Locale.US;
                ((X17123927029532314696) c4341747165502163559.g).c(new I10210771329789820200(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
                break;
            case 1:
                ((WebViewClient) obj).onReceivedError(webView, i, str, str2);
                break;
            default:
                super.onReceivedError(webView, i, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
            default:
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onReceivedLoginRequest(webView, str, str2, str3);
                break;
            default:
                super.onReceivedLoginRequest(webView, str, str2, str3);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        switch (this.a) {
            case 0:
                if (webView == null) {
                    return true;
                }
                renderProcessGoneDetail.didCrash();
                renderProcessGoneDetail.rendererPriorityAtExit();
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                webView.destroy();
                return true;
            case 1:
                onRenderProcessGone = ((WebViewClient) this.b).onRenderProcessGone(webView, renderProcessGoneDetail);
                return onRenderProcessGone;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
            default:
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onScaleChanged(webView, f, f2);
                break;
            default:
                super.onScaleChanged(webView, f, f2);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onUnhandledKeyEvent(webView, keyEvent);
                break;
            default:
                super.onUnhandledKeyEvent(webView, keyEvent);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 1:
                return ((WebViewClient) this.b).shouldInterceptRequest(webView, webResourceRequest);
            default:
                return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (this.a) {
            case 1:
                return ((WebViewClient) this.b).shouldOverrideKeyEvent(webView, keyEvent);
            default:
                return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                String uri = webResourceRequest.getUrl().toString();
                A4716120536771319554 a4716120536771319554 = (A4716120536771319554) obj;
                int i = A4716120536771319554.d;
                if (uri == null || !uri.startsWith("consent://")) {
                    return false;
                }
                a4716120536771319554.b.b(uri);
                return true;
            case 1:
                if (P1789376955961125859.e(webResourceRequest.getUrl().toString())) {
                    return true;
                }
                return ((WebViewClient) obj).shouldOverrideUrlLoading(webView, webResourceRequest);
            default:
                webView.getClass();
                webResourceRequest.getClass();
                iy0 iy0Var = ((xw0) obj).a;
                Uri url = webResourceRequest.getUrl();
                url.getClass();
                iy0Var.a(url);
                return true;
        }
    }

    public O14090912391717061492(xw0 xw0Var) {
        this.b = xw0Var;
    }

    public O14090912391717061492(WebViewClient webViewClient) {
        this.b = webViewClient;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        switch (this.a) {
            case 1:
                return ((WebViewClient) this.b).shouldInterceptRequest(webView, str);
            default:
                return super.shouldInterceptRequest(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 1:
                ((WebViewClient) this.b).onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                A4716120536771319554 a4716120536771319554 = (A4716120536771319554) obj;
                int i = A4716120536771319554.d;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                a4716120536771319554.b.b(str);
                return true;
            case 1:
                if (P1789376955961125859.e(str)) {
                    return true;
                }
                return ((WebViewClient) obj).shouldOverrideUrlLoading(webView, str);
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
