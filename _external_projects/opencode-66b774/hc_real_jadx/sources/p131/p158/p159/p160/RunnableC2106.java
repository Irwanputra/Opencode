package p131.p158.p159.p160;

import com.github.clans.fab.FloatingActionMenu;

/* renamed from: なぎぱいぢぎ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC2106 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8908;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ FloatingActionMenu f8909;

    public RunnableC2106(FloatingActionMenu floatingActionMenu, boolean z) {
        this.f8909 = floatingActionMenu;
        this.f8908 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8908) {
            FloatingActionMenu floatingActionMenu = this.f8909;
            floatingActionMenu.startAnimation(floatingActionMenu.f2467);
        }
        this.f8909.setVisibility(4);
        this.f8909.f2456 = false;
    }
}
