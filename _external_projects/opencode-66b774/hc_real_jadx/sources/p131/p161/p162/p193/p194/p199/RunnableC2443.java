package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzqm;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ばおぢでぎか, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2443 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzqm f9788;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzq f9789;

    public RunnableC2443(zzq zzqVar, zzqm zzqmVar) {
        this.f9789 = zzqVar;
        this.f9788 = zzqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9789.zzano.f2785.get(this.f9788.getCustomTemplateId()).zzb(this.f9788);
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
