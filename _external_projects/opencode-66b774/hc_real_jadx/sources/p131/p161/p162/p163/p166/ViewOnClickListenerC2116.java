package p131.p161.p162.p163.p166;

import android.view.View;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC2116 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2139 f8927;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2132 f8928;

    public ViewOnClickListenerC2116(C2132 c2132, C2139 c2139) {
        this.f8928 = c2132;
        this.f8927 = c2139;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m669 = this.f8928.m4225().m669() - 1;
        if (m669 >= 0) {
            this.f8928.m4226(this.f8927.m4228(m669));
        }
    }
}
