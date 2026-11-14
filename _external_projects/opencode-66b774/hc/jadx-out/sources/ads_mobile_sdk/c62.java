package ads_mobile_sdk;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class c62 implements Runnable {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ String b;

    public c62(d62 d62Var, WebView webView, String str) {
        this.a = webView;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d62.a(this.a, this.b);
    }
}
