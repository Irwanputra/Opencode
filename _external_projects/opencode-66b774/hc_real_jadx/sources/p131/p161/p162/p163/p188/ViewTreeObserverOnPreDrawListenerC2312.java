package p131.p161.p162.p163.p188;

import android.view.ViewTreeObserver;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.びえぁぜい.いいにぽつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewTreeObserverOnPreDrawListenerC2312 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2301 f9575;

    public ViewTreeObserverOnPreDrawListenerC2312(C2301 c2301) {
        this.f9575 = c2301;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        C2301 c2301 = this.f9575;
        float rotation = c2301.f9535.getRotation();
        if (c2301.f9542 == rotation) {
            return true;
        }
        c2301.f9542 = rotation;
        c2301.mo4477();
        return true;
    }
}
