package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzqq;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ち〴みぎ〻び, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2432 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzoj f9770;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzq f9771;

    public RunnableC2432(zzq zzqVar, zzoj zzojVar) {
        this.f9771 = zzqVar;
        this.f9770 = zzojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzqq zzqqVar = this.f9771.zzano.f2796;
            if (zzqqVar != null) {
                zzqqVar.zza(this.f9770);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
        }
    }
}
