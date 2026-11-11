package p131.p161.p162.p163.p174;

import android.widget.AutoCompleteTextView;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.ぺふねづ〺, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2222 implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final /* synthetic */ C2190 f9237;

    public C2222(C2190 c2190) {
        this.f9237 = c2190;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        C2190 c2190 = this.f9237;
        c2190.f9168 = true;
        c2190.f9169 = System.currentTimeMillis();
        C2190.m4300(this.f9237, false);
    }
}
