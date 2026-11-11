package p034.p095;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: づざかべべ.は〲ぱなで.どぇぞほだ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1725 implements InterfaceC1695 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ViewGroupOverlay f7893;

    public C1725(ViewGroup viewGroup) {
        this.f7893 = viewGroup.getOverlay();
    }

    @Override // p034.p095.InterfaceC1695
    /* renamed from: 〺つふすそ */
    public void mo3745(View view) {
        this.f7893.remove(view);
    }

    @Override // p034.p095.InterfaceC1695
    /* renamed from: げつ〴ぬぐ */
    public void mo3746(View view) {
        this.f7893.add(view);
    }
}
