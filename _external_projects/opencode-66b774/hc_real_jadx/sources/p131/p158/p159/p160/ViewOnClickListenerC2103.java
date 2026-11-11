package p131.p158.p159.p160;

import android.animation.AnimatorSet;
import android.view.View;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

/* renamed from: なぎぱいぢぎ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC2103 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ FloatingActionMenu f8902;

    public ViewOnClickListenerC2103(FloatingActionMenu floatingActionMenu) {
        this.f8902 = floatingActionMenu;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        FloatingActionMenu floatingActionMenu = this.f8902;
        boolean z = floatingActionMenu.f2423;
        boolean z2 = floatingActionMenu.f2469;
        if (z2) {
            floatingActionMenu.m1188(z);
            return;
        }
        if (z2) {
            return;
        }
        int i = 0;
        if (floatingActionMenu.f2414 != 0) {
            floatingActionMenu.f2444.start();
        }
        if (floatingActionMenu.f2460) {
            AnimatorSet animatorSet = floatingActionMenu.f2462;
            if (animatorSet == null) {
                floatingActionMenu.f2434.cancel();
                animatorSet = floatingActionMenu.f2415;
            }
            animatorSet.start();
        }
        floatingActionMenu.f2449 = true;
        int i2 = 0;
        for (int childCount = floatingActionMenu.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = floatingActionMenu.getChildAt(childCount);
            if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                i++;
                floatingActionMenu.f2457.postDelayed(new RunnableC2107(floatingActionMenu, (FloatingActionButton) childAt, z), i2);
                i2 += floatingActionMenu.f2436;
            }
        }
        floatingActionMenu.f2457.postDelayed(new RunnableC2105(floatingActionMenu), (i + 1) * floatingActionMenu.f2436);
    }
}
