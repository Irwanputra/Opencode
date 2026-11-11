package p131.p161.p162.p163.p191;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p034.p035.p045.p046.InterfaceC1092;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.へぬ〴づぞ.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2346 implements InterfaceC1092 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9641;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ AppBarLayout f9642;

    public C2346(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.f9642 = appBarLayout;
        this.f9641 = z;
    }

    @Override // p034.p035.p045.p046.InterfaceC1092
    /* renamed from: げつ〴ぬぐ */
    public boolean mo1101(View view, InterfaceC1092.AbstractC1094 abstractC1094) {
        this.f9642.setExpanded(this.f9641);
        return true;
    }
}
