package ads_mobile_sdk;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class iw1 {
    public static final ImageView.ScaleType i = ImageView.ScaleType.CENTER_INSIDE;
    public final W5797197595347441198 a;
    public final W5797197595347441198 b;
    public final it1 c;
    public final jr0 d;
    public final te1 e;
    public final iv1 f;
    public final U4857089234315512256 g;
    public final I16631908410500040363 h;

    public iw1(W5797197595347441198 w5797197595347441198, W5797197595347441198 w57971975953474411982, it1 it1Var, jr0 jr0Var, te1 te1Var, iv1 iv1Var, U4857089234315512256 u4857089234315512256, I16631908410500040363 i16631908410500040363) {
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

    public final boolean a(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        tx0 tx0Var;
        fs3 e;
        it1 it1Var = this.c;
        View view = it1Var.k;
        int i2 = 0;
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        ViewParent parent = view.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
        jr0 jr0Var = this.d;
        jr0Var.getClass();
        int i3 = 1;
        if (((Boolean) jr0Var.a("gads:native:disable_video_rect_for_fixed_size:enabled", Boolean.TRUE, ao.a$11)).booleanValue() && (((layoutParams = viewGroup.getLayoutParams()) == null || layoutParams.width != -2) && ((layoutParams2 = viewGroup.getLayoutParams()) == null || layoutParams2.height != -2))) {
            tx0 tx0Var2 = it1Var.j;
            if (((tx0Var2 == null || (e = tx0Var2.e()) == null) ? 0 : e.a) == 5 && (tx0Var = it1Var.j) != null) {
                tx0Var.a(new fs3(i3, i2, i2, 14));
            }
        }
        return true;
    }
}
