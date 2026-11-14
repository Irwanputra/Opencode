package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class i6 extends ads_mobile_sdk.zj {
    public static final ads_mobile_sdk.i6 d = new ads_mobile_sdk.i6();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.zj
    public final void a(boolean z) {
        java.util.Iterator it = java.util.Collections.unmodifiableCollection(ads_mobile_sdk.n6.c.a).iterator();
        while (it.hasNext()) {
            ads_mobile_sdk.o6 o6Var = ((ads_mobile_sdk.m6) it.next()).d;
            if (o6Var.b.get() != 0) {
                ads_mobile_sdk.d62.a.a((android.webkit.WebView) o6Var.b.get(), "setState", z ? "foregrounded" : "backgrounded", o6Var.a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ads_mobile_sdk.zj
    public final boolean b() {
        java.util.Iterator it = java.util.Collections.unmodifiableCollection(ads_mobile_sdk.n6.c.b).iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) ((ads_mobile_sdk.m6) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
