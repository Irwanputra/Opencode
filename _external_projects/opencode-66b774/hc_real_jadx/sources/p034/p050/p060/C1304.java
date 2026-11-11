package p034.p050.p060;

import android.view.View;
import p034.p035.p045.C1096;
import p034.p035.p045.C1112;

/* renamed from: づざかべべ.〺つふすそ.ぺふねづ〺.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1304 extends C1112 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C1320 f6309;

    public C1304(LayoutInflaterFactory2C1320 layoutInflaterFactory2C1320) {
        this.f6309 = layoutInflaterFactory2C1320;
    }

    @Override // p034.p035.p045.InterfaceC1108
    /* renamed from: 〺つふすそ */
    public void mo2539(View view) {
        this.f6309.f6361.setAlpha(1.0f);
        this.f6309.f6389.m2538(null);
        this.f6309.f6389 = null;
    }

    @Override // p034.p035.p045.C1112, p034.p035.p045.InterfaceC1108
    /* renamed from: くし〴〺ぅ */
    public void mo2540(View view) {
        this.f6309.f6361.setVisibility(0);
        this.f6309.f6361.sendAccessibilityEvent(32);
        if (this.f6309.f6361.getParent() instanceof View) {
            C1096.m2518((View) this.f6309.f6361.getParent());
        }
    }
}
