package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzq;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.internal.zzqt;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.えがぐせほち, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2394 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzol f9718;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzq f9719;

    public RunnableC2394(zzq zzqVar, zzol zzolVar) {
        this.f9719 = zzqVar;
        this.f9718 = zzolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zzqt zzqtVar = this.f9719.zzano.f2774;
            if (zzqtVar != null) {
                zzqtVar.zza(this.f9718);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
        }
    }
}
