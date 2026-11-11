package p131.p161.p162.p193.p194.p199;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzbm;
import com.google.android.gms.internal.zzcv;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.なぶひせが, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewOnTouchListenerC2440 implements View.OnTouchListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzbm f9784;

    public ViewOnTouchListenerC2440(zzbm zzbmVar) {
        this.f9784 = zzbmVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzcv zzcvVar = this.f9784.f2738;
        if (zzcvVar == null) {
            return false;
        }
        zzcvVar.zza(motionEvent);
        return false;
    }
}
