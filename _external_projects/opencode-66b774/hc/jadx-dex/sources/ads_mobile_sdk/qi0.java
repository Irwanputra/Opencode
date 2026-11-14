package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class qi0 implements java.lang.Runnable {
    public final /* synthetic */ float a;
    public final /* synthetic */ ads_mobile_sdk.qj3 b;

    public qi0(ads_mobile_sdk.qj3 qj3Var, float f) {
        this.b = qj3Var;
        this.a = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ads_mobile_sdk.p72 p72Var = ((ads_mobile_sdk.si0) this.b.a).e;
        float f = this.a;
        p72Var.a = f;
        ads_mobile_sdk.n6 n6Var = p72Var.e;
        if (n6Var == null) {
            n6Var = ads_mobile_sdk.n6.c;
            p72Var.e = n6Var;
        }
        java.util.Iterator it = java.util.Collections.unmodifiableCollection(n6Var.b).iterator();
        while (it.hasNext()) {
            ads_mobile_sdk.o6 o6Var = ((ads_mobile_sdk.m6) it.next()).d;
            ads_mobile_sdk.d62.a.a((android.webkit.WebView) o6Var.b.get(), "setDeviceVolume", java.lang.Float.valueOf(f), o6Var.a);
        }
    }
}
