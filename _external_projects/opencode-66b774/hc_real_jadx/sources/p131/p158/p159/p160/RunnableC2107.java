package p131.p158.p159.p160;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.github.clans.fab.Label;

/* renamed from: なぎぱいぢぎ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC2107 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ FloatingActionButton f8910;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8911;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ FloatingActionMenu f8912;

    public RunnableC2107(FloatingActionMenu floatingActionMenu, FloatingActionButton floatingActionButton, boolean z) {
        this.f8912 = floatingActionMenu;
        this.f8910 = floatingActionButton;
        this.f8911 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        FloatingActionMenu floatingActionMenu = this.f8912;
        if (floatingActionMenu.f2469) {
            return;
        }
        FloatingActionButton floatingActionButton = this.f8910;
        if (floatingActionButton != floatingActionMenu.f2454) {
            floatingActionButton.m1184(this.f8911);
        }
        Label label = (Label) this.f8910.getTag(C2102.fab_label);
        if (label == null || !label.f2483) {
            return;
        }
        if (this.f8911 && label.f2481 != null) {
            label.f2479.cancel();
            label.startAnimation(label.f2481);
        }
        label.setVisibility(0);
    }
}
