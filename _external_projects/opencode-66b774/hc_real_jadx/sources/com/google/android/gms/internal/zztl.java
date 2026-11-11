package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zztl extends zzkt {
    private final String zzapq;
    private boolean zzaqg;
    private final zzsd zzbzs;
    private com.google.android.gms.ads.internal.zzak zzbzx;
    private final zztd zzcak;

    public zztl(Context context, String str, zzux zzuxVar, zzakd zzakdVar, com.google.android.gms.ads.internal.zzv zzvVar) {
        this(str, new zzsd(context, zzuxVar, zzakdVar, zzvVar));
    }

    private zztl(String str, zzsd zzsdVar) {
        this.zzapq = str;
        this.zzbzs = zzsdVar;
        this.zzcak = new zztd();
        zzbs.zzeu().zza(zzsdVar);
    }

    private final void abort() {
        if (this.zzbzx != null) {
            return;
        }
        com.google.android.gms.ads.internal.zzak zzav = this.zzbzs.zzav(this.zzapq);
        this.zzbzx = zzav;
        this.zzcak.zzd(zzav);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void destroy() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.zzks
    public final String getMediationAdapterClassName() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            return zzakVar.getMediationAdapterClassName();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzll getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isLoading() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        return zzakVar != null && zzakVar.isLoading();
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isReady() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        return zzakVar != null && zzakVar.isReady();
    }

    @Override // com.google.android.gms.internal.zzks
    public final void pause() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.pause();
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void resume() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.resume();
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setImmersiveMode(boolean z) {
        this.zzaqg = z;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setManualImpressionsEnabled(boolean z) {
        abort();
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.setManualImpressionsEnabled(z);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setUserId(String str) {
    }

    @Override // com.google.android.gms.internal.zzks
    public final void showInterstitial() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar == null) {
            zzakb.zzcu("Interstitial ad must be loaded before showInterstitial().");
        } else {
            zzakVar.setImmersiveMode(this.zzaqg);
            this.zzbzx.showInterstitial();
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void stopLoading() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.stopLoading();
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzadp zzadpVar) {
        zztd zztdVar = this.zzcak;
        zztdVar.zzbzn = zzadpVar;
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zztdVar.zzd(zzakVar);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzjn zzjnVar) {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.zza(zzjnVar);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzke zzkeVar) {
        zztd zztdVar = this.zzcak;
        zztdVar.zzbzm = zzkeVar;
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zztdVar.zzd(zzakVar);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkh zzkhVar) {
        zztd zztdVar = this.zzcak;
        zztdVar.zzape = zzkhVar;
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zztdVar.zzd(zzakVar);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkx zzkxVar) {
        zztd zztdVar = this.zzcak;
        zztdVar.zzbzk = zzkxVar;
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zztdVar.zzd(zzakVar);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzld zzldVar) {
        abort();
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.zza(zzldVar);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzlr zzlrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzmr zzmrVar) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzoa zzoaVar) {
        zztd zztdVar = this.zzcak;
        zztdVar.zzbzl = zzoaVar;
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zztdVar.zzd(zzakVar);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzxl zzxlVar) {
        zzakb.zzcu("setInAppPurchaseListener is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzxr zzxrVar, String str) {
        zzakb.zzcu("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean zzb(zzjj zzjjVar) {
        if (!zztg.zzi(zzjjVar).contains("gw")) {
            abort();
        }
        if (zztg.zzi(zzjjVar).contains("_skipMediation")) {
            abort();
        }
        if (zzjjVar.zzbdm != null) {
            abort();
        }
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            return zzakVar.zzb(zzjjVar);
        }
        zztg zzeu = zzbs.zzeu();
        if (zztg.zzi(zzjjVar).contains("_ad")) {
            zzeu.zzb(zzjjVar, this.zzapq);
        }
        zztj zza = zzeu.zza(zzjjVar, this.zzapq);
        if (zza == null) {
            abort();
            zztk.zzlc().zzlg();
            return this.zzbzx.zzb(zzjjVar);
        }
        if (zza.zzcab) {
            zztk.zzlc().zzlf();
        } else {
            zza.load();
            zztk.zzlc().zzlg();
        }
        this.zzbzx = zza.zzbzx;
        zza.zzbzz.zza(this.zzcak);
        this.zzcak.zzd(this.zzbzx);
        return zza.zzcac;
    }

    @Override // com.google.android.gms.internal.zzks
    public final InterfaceC2455 zzbr() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            return zzakVar.zzbr();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzjn zzbs() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            return zzakVar.zzbs();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zzbu() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            zzakVar.zzbu();
        } else {
            zzakb.zzcu("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkx zzcd() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkh zzce() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.zzks
    public final String zzcp() {
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        if (zzakVar != null) {
            return zzakVar.zzcp();
        }
        return null;
    }
}
