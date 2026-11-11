package p131.p158.p159.p160;

import com.github.clans.fab.FloatingActionMenu;
import team.dev.epro.apkcustom.MainActivity;

/* renamed from: なぎぱいぢぎ.づざかべべ.げつ〴ぬぐ.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC2105 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ FloatingActionMenu f8907;

    public RunnableC2105(FloatingActionMenu floatingActionMenu) {
        this.f8907 = floatingActionMenu;
    }

    @Override // java.lang.Runnable
    public void run() {
        FloatingActionMenu floatingActionMenu = this.f8907;
        floatingActionMenu.f2469 = true;
        FloatingActionMenu.InterfaceC0361 interfaceC0361 = floatingActionMenu.f2433;
        if (interfaceC0361 != null) {
            ((MainActivity.C0516) interfaceC0361).m1634(true);
        }
    }
}
