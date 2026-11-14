package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class aa2 extends dev.epro.r0.S13562717617822485216 {
    public final /* synthetic */ ads_mobile_sdk.ea2 a;
    public final /* synthetic */ ads_mobile_sdk.od1 b;

    public aa2(ads_mobile_sdk.ea2 ea2Var, ads_mobile_sdk.od1 od1Var) {
        this.a = ea2Var;
        this.b = od1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.google.android.libraries.ads.mobile.sdk.common.AdActivity adActivity, android.widget.LinearLayout linearLayout) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(adActivity);
        frameLayout.setTag("layout");
        frameLayout.setBackgroundColor(-1);
        frameLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        ads_mobile_sdk.ea2 ea2Var = this.a;
        java.lang.String str = ea2Var.l;
        layoutParams.gravity = str.equals("TOP") ? 49 : str.equals("BOTTOM") ? 81 : 17;
        int i = ea2Var.f30o;
        if (i > 0) {
            layoutParams.width = (int) android.util.TypedValue.applyDimension(1, i, adActivity.getResources().getDisplayMetrics());
        }
        android.view.View view = this.b.m;
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        frameLayout.addView(view, layoutParams);
        linearLayout.setBackgroundColor(-1);
        linearLayout.addView(frameLayout);
    }

    public final void onDestroy() {
        this.b.destroy();
    }
}
