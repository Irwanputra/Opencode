package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class jy0 extends android.widget.FrameLayout {
    public final ads_mobile_sdk.tx0 a;
    public ads_mobile_sdk.wf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy0(ads_mobile_sdk.tx0 tx0Var) {
        super(tx0Var.getContext());
        tx0Var.getClass();
        this.a = tx0Var;
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        addView(tx0Var);
        setBackgroundColor(0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        ads_mobile_sdk.wf0 wf0Var = this.b;
        if (wf0Var == null) {
            return false;
        }
        wf0Var.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        dev.epro.r0.M9197813449740923653 m9197813449740923653 = ads_mobile_sdk.xv.f4a;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        view.getClass();
        dev.epro.r0.M9197813449740923653 m9197813449740923653 = ads_mobile_sdk.xv.f4a;
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        dev.epro.r0.M9197813449740923653 m9197813449740923653 = ads_mobile_sdk.xv.f4a;
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        dev.epro.r0.M9197813449740923653 m9197813449740923653 = ads_mobile_sdk.xv.f4a;
        super.removeViews(i, i2);
    }
}
