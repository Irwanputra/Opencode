package p131.p161.p162.p193.p194.p199;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.ads.internal.zzi;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanv;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zznv;
import com.google.android.gms.internal.zzya;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぇとしたべど, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2392 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ zzafp f9712;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ zzafb f9713;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final /* synthetic */ zzi f9714;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public /* synthetic */ zznu f9715;

    public RunnableC2392(zzi zziVar, zzafp zzafpVar, zzafb zzafbVar, zznu zznuVar) {
        this.f9714 = zziVar;
        this.f9712 = zzafpVar;
        this.f9713 = zzafbVar;
        this.f9715 = zznuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaax zzaaxVar = this.f9712.zzcxy;
        if (zzaaxVar.zzcpf && this.f9714.zzano.f2783 != null) {
            String str = null;
            if (zzaaxVar.zzcja != null) {
                zzbs.zzei();
                str = zzahn.zzcd(this.f9712.zzcxy.zzcja);
            }
            zznv zznvVar = new zznv(this.f9714, str, this.f9712.zzcxy.body);
            zzi zziVar = this.f9714;
            zzbt zzbtVar = zziVar.zzano;
            zzbtVar.zzauz = 1;
            try {
                zziVar.zzanm = false;
                zzbtVar.f2783.zza(zznvVar);
                return;
            } catch (RemoteException e) {
                zzakb.zzc("Could not call the onCustomRenderedAdLoadedListener.", e);
                this.f9714.zzanm = true;
            }
        }
        zzw zzwVar = new zzw(this.f9714.zzano.zzair, this.f9713, this.f9712.zzcxy.zzcpp);
        try {
            zzanh mo1225 = this.f9714.mo1225(this.f9712, zzwVar, this.f9713);
            mo1225.setOnTouchListener(new ViewOnTouchListenerC2438(this, zzwVar));
            mo1225.setOnClickListener(new ViewOnClickListenerC2388(this, zzwVar));
            zzbt zzbtVar2 = this.f9714.zzano;
            zzbtVar2.zzauz = 0;
            zzbs.zzeh();
            zzi zziVar2 = this.f9714;
            zzbt zzbtVar3 = zziVar2.zzano;
            zzbtVar2.zzaub = zzya.zza(zzbtVar3.zzair, zziVar2, this.f9712, zzbtVar3.f2780, mo1225, zziVar2.zzanw, zziVar2, this.f9715);
        } catch (zzanv e2) {
            zzakb.zzb("Could not obtain webview.", e2);
            zzahn.zzdaw.post(new RunnableC2408(this));
        }
    }
}
