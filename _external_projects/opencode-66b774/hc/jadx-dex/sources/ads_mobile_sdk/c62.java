package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class c62 implements java.lang.Runnable {
    public final /* synthetic */ android.webkit.WebView a;
    public final /* synthetic */ java.lang.String b;

    public c62(ads_mobile_sdk.d62 d62Var, android.webkit.WebView webView, java.lang.String str) {
        this.a = webView;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ads_mobile_sdk.d62.a(this.a, this.b);
    }
}
