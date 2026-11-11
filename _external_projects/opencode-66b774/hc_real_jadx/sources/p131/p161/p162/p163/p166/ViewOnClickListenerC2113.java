package p131.p161.p162.p163.p166;

import android.view.View;
import p131.p161.p162.p163.p166.C2132;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC2113 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2132 f8915;

    public ViewOnClickListenerC2113(C2132 c2132) {
        this.f8915 = c2132;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C2132 c2132 = this.f8915;
        C2132.EnumC2136 enumC2136 = C2132.EnumC2136.DAY;
        C2132.EnumC2136 enumC21362 = c2132.f8967;
        C2132.EnumC2136 enumC21363 = C2132.EnumC2136.YEAR;
        if (enumC21362 == enumC21363) {
            c2132.m4223(enumC2136);
        } else if (enumC21362 == enumC2136) {
            c2132.m4223(enumC21363);
        }
    }
}
