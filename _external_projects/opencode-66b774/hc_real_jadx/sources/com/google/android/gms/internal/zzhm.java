package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhm implements Runnable {
    public final /* synthetic */ zzhk zzazn;
    private ValueCallback<String> zzazo = new zzhn(this);
    public final /* synthetic */ zzhe zzazp;
    public final /* synthetic */ WebView zzazq;
    public final /* synthetic */ boolean zzazr;

    public zzhm(zzhk zzhkVar, zzhe zzheVar, WebView webView, boolean z) {
        this.zzazn = zzhkVar;
        this.zzazp = zzheVar;
        this.zzazq = webView;
        this.zzazr = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzazq.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzazq.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzazo);
            } catch (Throwable unused) {
                this.zzazo.onReceiveValue("");
            }
        }
    }
}
