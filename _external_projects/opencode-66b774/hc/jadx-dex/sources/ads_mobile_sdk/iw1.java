package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class iw1 {
    public static final android.widget.ImageView.ScaleType i = android.widget.ImageView.ScaleType.CENTER_INSIDE;
    public final dev.epro.r0.W5797197595347441198 a;
    public final dev.epro.r0.W5797197595347441198 b;
    public final ads_mobile_sdk.it1 c;
    public final ads_mobile_sdk.jr0 d;
    public final ads_mobile_sdk.te1 e;
    public final ads_mobile_sdk.iv1 f;
    public final dev.epro.r0.U4857089234315512256 g;
    public final dev.epro.r0.I16631908410500040363 h;

    public iw1(dev.epro.r0.W5797197595347441198 w5797197595347441198, dev.epro.r0.W5797197595347441198 w57971975953474411982, ads_mobile_sdk.it1 it1Var, ads_mobile_sdk.jr0 jr0Var, ads_mobile_sdk.te1 te1Var, ads_mobile_sdk.iv1 iv1Var, dev.epro.r0.U4857089234315512256 u4857089234315512256, dev.epro.r0.I16631908410500040363 i16631908410500040363) {
        w5797197595347441198.getClass();
        w57971975953474411982.getClass();
        it1Var.getClass();
        jr0Var.getClass();
        te1Var.getClass();
        iv1Var.getClass();
        u4857089234315512256.getClass();
        i16631908410500040363.getClass();
        this.a = w5797197595347441198;
        this.b = w57971975953474411982;
        this.c = it1Var;
        this.d = jr0Var;
        this.e = te1Var;
        this.f = iv1Var;
        this.g = u4857089234315512256;
        this.h = i16631908410500040363;
    }

    public final boolean a(android.view.ViewGroup viewGroup) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        ads_mobile_sdk.tx0 tx0Var;
        ads_mobile_sdk.fs3 fs3VarE;
        ads_mobile_sdk.it1 it1Var = this.c;
        android.view.View view = it1Var.k;
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        ads_mobile_sdk.jr0 jr0Var = this.d;
        jr0Var.getClass();
        if (((java.lang.Boolean) jr0Var.a("gads:native:disable_video_rect_for_fixed_size:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue() && (((layoutParams = viewGroup.getLayoutParams()) == null || layoutParams.width != -2) && ((layoutParams2 = viewGroup.getLayoutParams()) == null || layoutParams2.height != -2))) {
            ads_mobile_sdk.tx0 tx0Var2 = it1Var.j;
            if (((tx0Var2 == null || (fs3VarE = tx0Var2.e()) == null) ? 0 : fs3VarE.a) == 5 && (tx0Var = it1Var.j) != null) {
                tx0Var.a(new ads_mobile_sdk.fs3(1, 0, 0, 14));
            }
        }
        return true;
    }
}
