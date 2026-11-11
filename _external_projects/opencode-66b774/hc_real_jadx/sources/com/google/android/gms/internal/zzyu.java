package com.google.android.gms.internal;

import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyu implements Runnable {
    public final /* synthetic */ JSONObject zzcli;
    public final /* synthetic */ zzalf zzclj;
    public final /* synthetic */ zzyt zzclk;

    public zzyu(zzyt zzytVar, JSONObject jSONObject, zzalf zzalfVar) {
        this.zzclk = zzytVar;
        this.zzcli = jSONObject;
        this.zzclj = zzalfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzba zzbaVar;
        ViewTreeObserver.OnGlobalLayoutListener zza;
        ViewTreeObserver.OnScrollChangedListener zzb;
        try {
            zzanh zznj = this.zzclk.zznj();
            zznj.zza(zzapa.zzug());
            zzbaVar = this.zzclk.zzclf;
            zzbaVar.zze(zznj);
            WeakReference weakReference = new WeakReference(zznj);
            zzani zzsz = zznj.zzsz();
            zza = this.zzclk.zza((WeakReference<zzanh>) weakReference);
            zzb = this.zzclk.zzb(weakReference);
            zzsz.zza(zza, zzb);
            this.zzclk.zzf(zznj);
            zznj.zzsz().zza(new zzyv(this, zznj));
            zznj.zzsz().zza(new zzyw(this));
            zznj.loadUrl((String) zzkb.zzif().zzd(zznh.zzboo));
        } catch (Exception e) {
            zzakb.zzc("Exception occurred while getting video view", e);
            this.zzclj.set(null);
        }
    }
}
