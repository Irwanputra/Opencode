package com.google.android.gms.internal;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbs;

@zzzv
@TargetApi(11)
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzaoi extends WebChromeClient {
    private final zzanh zzbyk;

    public zzaoi(zzanh zzanhVar) {
        this.zzbyk = zzanhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Context zza(WebView webView) {
        if (!(webView instanceof zzanh)) {
            return webView.getContext();
        }
        zzanh zzanhVar = (zzanh) webView;
        Activity zzsi = zzanhVar.zzsi();
        return zzsi != null ? zzsi : zzanhVar.getContext();
    }

    private final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzanh zzanhVar;
        AlertDialog create;
        com.google.android.gms.ads.internal.zzw zztm;
        try {
            zzanhVar = this.zzbyk;
        } catch (WindowManager.BadTokenException e) {
            zzakb.zzc("Fail to display Dialog.", e);
        }
        if (zzanhVar != null && zzanhVar.zzsz() != null && this.zzbyk.zzsz().zztm() != null && (zztm = this.zzbyk.zzsz().zztm()) != null && !zztm.zzda()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zztm.zzt(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            create = builder.setView(linearLayout).setPositiveButton(R.string.ok, new zzaoo(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zzaon(jsPromptResult)).setOnCancelListener(new zzaom(jsPromptResult)).create();
        } else {
            create = builder.setMessage(str3).setPositiveButton(R.string.ok, new zzaol(jsResult)).setNegativeButton(R.string.cancel, new zzaok(jsResult)).setOnCancelListener(new zzaoj(jsResult)).create();
        }
        create.show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof zzanh) {
            com.google.android.gms.ads.internal.overlay.zzd zzsv = ((zzanh) webView).zzsv();
            if (zzsv != null) {
                zzsv.close();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        zzakb.zzcu(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(sourceId).length() + String.valueOf(message).length() + 19);
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzaop.zzdnr[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzakb.e(sb2);
        } else if (i == 2) {
            zzakb.zzcu(sb2);
        } else if (i == 3 || i == 4 || i != 5) {
            zzakb.zzct(sb2);
        } else {
            zzakb.zzbx(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.zzbyk.zzsz());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(Math.min(131072L, j4) + j, 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzbs.zzei();
            if (!zzahn.zzd(this.zzbyk.getContext(), this.zzbyk.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzbs.zzei();
                if (!zzahn.zzd(this.zzbyk.getContext(), this.zzbyk.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzd zzsv = this.zzbyk.zzsv();
        if (zzsv == null) {
            zzakb.zzcu("Could not get ad overlay when hiding custom view.");
        } else {
            zzsv.zzms();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zza(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zza(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        zza(view, -1, customViewCallback);
    }

    public final void zza(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzd zzsv = this.zzbyk.zzsv();
        if (zzsv == null) {
            zzakb.zzcu("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            zzsv.zza(view, customViewCallback);
            zzsv.setRequestedOrientation(i);
        }
    }
}
