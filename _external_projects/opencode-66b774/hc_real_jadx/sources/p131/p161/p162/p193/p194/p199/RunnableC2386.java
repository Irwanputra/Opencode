package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzba;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzon;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2386 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ String f9699;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzafo f9700;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public /* synthetic */ zzba f9701;

    public RunnableC2386(zzba zzbaVar, String str, zzafo zzafoVar) {
        this.f9701 = zzbaVar;
        this.f9699 = str;
        this.f9700 = zzafoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f9701.zzano.f2785.get(this.f9699).zzb((zzon) this.f9700.zzcxr);
        } catch (RemoteException e) {
            zzakb.zzc("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
        }
    }
}
