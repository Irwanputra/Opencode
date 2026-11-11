package p131.p161.p162.p163.p170;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.InterfaceC1092;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぇぬぎばつ.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2155 implements InterfaceC1092 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ SwipeDismissBehavior f9022;

    public C2155(SwipeDismissBehavior swipeDismissBehavior) {
        this.f9022 = swipeDismissBehavior;
    }

    @Override // p034.p035.p045.p046.InterfaceC1092
    /* renamed from: げつ〴ぬぐ */
    public boolean mo1101(View view, InterfaceC1092.AbstractC1094 abstractC1094) {
        boolean z = false;
        if (!this.f9022.mo1310(view)) {
            return false;
        }
        boolean z2 = C1096.m2491(view) == 1;
        int i = this.f9022.f2992;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        C1096.m2483(view, width);
        view.setAlpha(0.0f);
        this.f9022.getClass();
        return true;
    }
}
