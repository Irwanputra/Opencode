package p131.p161.p162.p163.p191;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2143;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.へぬ〴づぞ.ぁごぐすすぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2341 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final int[] f9628 = {R.attr.stateListAnimator};

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m4498(View view, float f) {
        int integer = view.getResources().getInteger(C2143.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, C2111.state_liftable, -C2111.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
