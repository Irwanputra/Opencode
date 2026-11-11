package p131.p161.p162.p163.p166;

import android.view.View;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ぺぁあねじ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC2141 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2139 f8984;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2132 f8985;

    public ViewOnClickListenerC2141(C2132 c2132, C2139 c2139) {
        this.f8985 = c2132;
        this.f8984 = c2139;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m639 = this.f8985.m4225().m639() + 1;
        if (m639 < this.f8985.f8969.getAdapter().mo888()) {
            this.f8985.m4226(this.f8984.m4228(m639));
        }
    }
}
