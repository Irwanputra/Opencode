package dev.epro.r0;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q12598757537405990809 {
    public L9028203031476232898 a;

    public Q12598757537405990809(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new F994825664896018988(Q10109392975126564544.j(i, interpolator, j));
        } else {
            this.a = new V7994488537893142047(i, interpolator, j);
        }
    }

    public static void a(View view, F3160751278268780235 f3160751278268780235) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(f3160751278268780235 != null ? new N16051260170022852138(f3160751278268780235) : null);
            return;
        }
        PathInterpolator pathInterpolator = V7994488537893142047.e;
        View.OnApplyWindowInsetsListener f6507052717076293065 = f3160751278268780235 != null ? new F6507052717076293065(view, f3160751278268780235) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, f6507052717076293065);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(f6507052717076293065);
        }
    }
}
