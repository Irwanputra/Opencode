package p131.p161.p162.p193.p194.p199;

import android.view.View;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzafb;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぃぜぶの〸ぃ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class ViewOnClickListenerC2388 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzw f9705;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ RunnableC2392 f9706;

    public ViewOnClickListenerC2388(RunnableC2392 runnableC2392, zzw zzwVar) {
        this.f9706 = runnableC2392;
        this.f9705 = zzwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f9705.recordClick();
        zzafb zzafbVar = this.f9706.f9713;
        if (zzafbVar != null) {
            zzafbVar.zzom();
        }
    }
}
