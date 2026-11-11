package p034.p098.p100;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: づざかべべ.ぶでにく〼〳.くし〴〺ぅ.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1760 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final ViewGroup.MarginLayoutParams f7968;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public LinearLayoutManager f7969;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f7968 = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public C1760(LinearLayoutManager linearLayoutManager) {
        this.f7969 = linearLayoutManager;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m3810(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m3810(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
