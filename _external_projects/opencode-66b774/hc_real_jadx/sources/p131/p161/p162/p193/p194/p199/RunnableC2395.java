package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzba;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzqm;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぉ〲なぱぽた, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2395 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzqm f9720;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzba f9721;

    public RunnableC2395(zzba zzbaVar, zzqm zzqmVar) {
        this.f9721 = zzbaVar;
        this.f9720 = zzqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9721.zzano.f2785.get(this.f9720.getCustomTemplateId()).zzb(this.f9720);
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
