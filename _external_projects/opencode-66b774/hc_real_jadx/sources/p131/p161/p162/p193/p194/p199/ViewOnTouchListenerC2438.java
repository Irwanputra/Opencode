package p131.p161.p162.p193.p194.p199;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzafb;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ながふずは, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewOnTouchListenerC2438 implements View.OnTouchListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzw f9780;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ RunnableC2392 f9781;

    public ViewOnTouchListenerC2438(RunnableC2392 runnableC2392, zzw zzwVar) {
        this.f9781 = runnableC2392;
        this.f9780 = zzwVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f9780.recordClick();
        zzafb zzafbVar = this.f9781.f9713;
        if (zzafbVar == null) {
            return false;
        }
        zzafbVar.zzom();
        return false;
    }
}
