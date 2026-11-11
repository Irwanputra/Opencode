package p131.p161.p162.p163.p166;

import android.view.View;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p131.p161.p162.p163.C2144;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.なぎぱいぢぎ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2129 extends C1102 {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final /* synthetic */ C2132 f8955;

    public C2129(C2132 c2132) {
        this.f8955 = c2132;
    }

    @Override // p034.p035.p045.C1102
    /* renamed from: びぐびあび */
    public void mo431(View view, C1084 c1084) {
        C2132 c2132;
        int i;
        this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
        if (this.f8955.f8964.getVisibility() == 0) {
            c2132 = this.f8955;
            i = C2144.mtrl_picker_toggle_to_year_selection;
        } else {
            c2132 = this.f8955;
            i = C2144.mtrl_picker_toggle_to_day_selection;
        }
        c1084.m2461(c2132.m490(i));
    }
}
