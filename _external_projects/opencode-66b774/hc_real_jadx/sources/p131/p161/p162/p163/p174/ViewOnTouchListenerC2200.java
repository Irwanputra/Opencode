package p131.p161.p162.p163.p174;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.おかぷせ〱.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnTouchListenerC2200 implements View.OnTouchListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ AutoCompleteTextView f9182;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2190 f9183;

    public ViewOnTouchListenerC2200(C2190 c2190, AutoCompleteTextView autoCompleteTextView) {
        this.f9183 = c2190;
        this.f9182 = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f9183.m4305()) {
                this.f9183.f9168 = false;
            }
            C2190.m4298(this.f9183, this.f9182);
        }
        return false;
    }
}
