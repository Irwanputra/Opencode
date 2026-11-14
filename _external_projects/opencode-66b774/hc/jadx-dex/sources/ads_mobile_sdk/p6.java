package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class p6 implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ ads_mobile_sdk.r6 a;

    public p6(ads_mobile_sdk.r6 r6Var) {
        this.a = r6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.a.a(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        ads_mobile_sdk.r6 r6Var = this.a;
        if (((dev.epro.r0.N831923027797546281) r6Var.b) != null) {
            if (view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnWindowFocusChangeListener((dev.epro.r0.N831923027797546281) r6Var.b);
            }
            r6Var.b = null;
        }
    }
}
