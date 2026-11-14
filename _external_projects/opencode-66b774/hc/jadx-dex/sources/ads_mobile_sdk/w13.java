package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class w13 {
    public static final ads_mobile_sdk.w13 d;
    public java.lang.ref.WeakReference a;
    public boolean b;
    public boolean c;

    static {
        ads_mobile_sdk.w13 w13Var = new ads_mobile_sdk.w13();
        w13Var.b = false;
        w13Var.c = false;
        d = w13Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z, boolean z2) {
        if ((z2 || z) == (this.c || this.b)) {
            return;
        }
        java.util.Iterator it = java.util.Collections.unmodifiableCollection(ads_mobile_sdk.n6.c.a).iterator();
        while (it.hasNext()) {
            ads_mobile_sdk.o6 o6Var = ((ads_mobile_sdk.m6) it.next()).d;
            boolean z3 = z2 || z;
            if (o6Var.b.get() != 0) {
                ads_mobile_sdk.d62.a.a((android.webkit.WebView) o6Var.b.get(), "setDeviceLockState", z3 ? "locked" : "unlocked");
            }
        }
    }
}
