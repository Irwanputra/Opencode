package p131.p161.p162.p193.p194.p199;

import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzbi;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzjj;
import java.lang.ref.WeakReference;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぇ〳〲〺すっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2391 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ WeakReference f9710;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ zzbi f9711;

    public RunnableC2391(zzbi zzbiVar, WeakReference weakReference) {
        this.f9711 = zzbiVar;
        this.f9710 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9711.f2728 = false;
        zza zzaVar = (zza) this.f9710.get();
        if (zzaVar != null) {
            zzjj zzjjVar = this.f9711.f2724;
            if (zzaVar.zzc(zzjjVar)) {
                zzaVar.zzb(zzjjVar);
            } else {
                zzakb.zzct("Ad is not visible. Not refreshing ad.");
                zzaVar.zzann.zzg(zzjjVar);
            }
        }
    }
}
