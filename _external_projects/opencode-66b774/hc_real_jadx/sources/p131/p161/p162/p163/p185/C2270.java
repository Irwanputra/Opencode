package p131.p161.p162.p163.p185;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.なぶひせが.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2270 implements InterfaceC2285 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final ViewOverlay f9461;

    public C2270(View view) {
        this.f9461 = view.getOverlay();
    }

    @Override // p131.p161.p162.p163.p185.InterfaceC2285
    /* renamed from: 〺つふすそ */
    public void mo4436(Drawable drawable) {
        this.f9461.remove(drawable);
    }

    @Override // p131.p161.p162.p163.p185.InterfaceC2285
    /* renamed from: げつ〴ぬぐ */
    public void mo4437(Drawable drawable) {
        this.f9461.add(drawable);
    }
}
