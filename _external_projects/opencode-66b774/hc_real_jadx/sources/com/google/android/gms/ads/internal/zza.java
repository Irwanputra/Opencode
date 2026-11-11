package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzadc;
import com.google.android.gms.internal.zzadp;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzafi;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzafq;
import com.google.android.gms.internal.zzafy;
import com.google.android.gms.internal.zzafz;
import com.google.android.gms.internal.zzagd;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzaim;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzapa;
import com.google.android.gms.internal.zzfs;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjk;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkt;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzuh;
import com.google.android.gms.internal.zzxl;
import com.google.android.gms.internal.zzxr;
import com.google.android.gms.internal.zzyb;
import com.google.android.gms.internal.zzzv;
import com.google.android.gms.internal.zzzx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.C2429;
import p131.p161.p162.p193.p194.p199.C2450;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zza extends zzkt implements zzb, com.google.android.gms.ads.internal.overlay.zzq, zzafy, zzje, zzyb, zzzx {
    public zznu zzanj;
    public zzns zzank;
    private zzns zzanl;
    public boolean zzanm = false;
    public final zzbi zzann = new zzbi(this);
    public final zzbt zzano;
    public transient zzjj zzanp;
    public final zzfs zzanq;
    public final zzv zzanr;

    public zza(zzbt zzbtVar, zzbi zzbiVar, zzv zzvVar) {
        this.zzano = zzbtVar;
        this.zzanr = zzvVar;
        zzbs.zzei().zzah(zzbtVar.zzair);
        zzbs.zzei().zzai(zzbtVar.zzair);
        zzagd.zzae(zzbtVar.zzair);
        zzbs.zzfe().initialize(zzbtVar.zzair);
        zzbs.zzem().zzc(zzbtVar.zzair, zzbtVar.zzaty);
        zzbs.zzen().initialize(zzbtVar.zzair);
        this.zzanq = zzbs.zzem().zzps();
        zzbs.zzel().initialize(zzbtVar.zzair);
        zzbs.zzfg().initialize(zzbtVar.zzair);
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbpb)).booleanValue()) {
            Timer timer = new Timer();
            timer.schedule(new C2429(this, new CountDownLatch(((Integer) zzkb.zzif().zzd(zznh.zzbpd)).intValue()), timer), 0L, ((Long) zzkb.zzif().zzd(zznh.zzbpc)).longValue());
        }
    }

    public static boolean zza(zzjj zzjjVar) {
        Bundle bundle = zzjjVar.zzbdp.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    private static long zzr(String str) {
        String str2;
        int indexOf = str.indexOf("ufe");
        int indexOf2 = str.indexOf(44, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(indexOf + 4, indexOf2));
        } catch (IndexOutOfBoundsException unused) {
            str2 = "Invalid index for Url fetch time in CSI latency info.";
            zzakb.zzcu(str2);
            return -1L;
        } catch (NumberFormatException unused2) {
            str2 = "Cannot find valid format of Url fetch time in CSI latency info.";
            zzakb.zzcu(str2);
            return -1L;
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public void destroy() {
        C1687.m3716("destroy must be called on the main UI thread.");
        this.zzann.cancel();
        this.zzanq.zzi(this.zzano.zzaud);
        zzbt zzbtVar = this.zzano;
        zzbu zzbuVar = zzbtVar.f2793;
        if (zzbuVar != null) {
            zzbuVar.zzfo();
        }
        zzbtVar.f2788 = null;
        zzbtVar.f2773 = null;
        zzbtVar.f2783 = null;
        zzbtVar.f2770 = null;
        zzbtVar.zzf(false);
        zzbu zzbuVar2 = zzbtVar.f2793;
        if (zzbuVar2 != null) {
            zzbuVar2.removeAllViews();
        }
        zzbtVar.zzfi();
        zzbtVar.zzfj();
        zzbtVar.zzaud = null;
    }

    @Override // com.google.android.gms.internal.zzks
    public String getAdUnitId() {
        return this.zzano.zzatw;
    }

    @Override // com.google.android.gms.internal.zzks
    public zzll getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isLoading() {
        return this.zzanm;
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isReady() {
        C1687.m3716("isLoaded must be called on the main UI thread.");
        zzbt zzbtVar = this.zzano;
        return zzbtVar.zzaua == null && zzbtVar.zzaub == null && zzbtVar.zzaud != null;
    }

    @Override // com.google.android.gms.internal.zzje
    public void onAdClicked() {
        if (this.zzano.zzaud == null) {
            zzakb.zzcu("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzakb.zzbx("Pinging click URLs.");
        zzafq zzafqVar = this.zzano.zzauf;
        if (zzafqVar != null) {
            zzafqVar.zzop();
        }
        if (this.zzano.zzaud.zzcdk != null) {
            zzbs.zzei();
            zzbt zzbtVar = this.zzano;
            zzahn.zza(zzbtVar.zzair, zzbtVar.zzaty.zzcv, zzc(zzbtVar.zzaud.zzcdk));
        }
        zzke zzkeVar = this.zzano.f2784;
        if (zzkeVar != null) {
            try {
                zzkeVar.onAdClicked();
            } catch (RemoteException e) {
                zzakb.zzc("Could not notify onAdClicked event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzb
    public final void onAppEvent(String str, String str2) {
        zzkx zzkxVar = this.zzano.f2773;
        if (zzkxVar != null) {
            try {
                zzkxVar.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzakb.zzc("Could not call the AppEventListener.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public void pause() {
        C1687.m3716("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.zzks
    public void resume() {
        C1687.m3716("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.zzks
    public void setImmersiveMode(boolean z) {
        throw new IllegalStateException("onImmersiveModeUpdated is not supported for current ad type");
    }

    @Override // com.google.android.gms.internal.zzks
    public void setManualImpressionsEnabled(boolean z) {
        zzakb.zzcu("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setUserId(String str) {
        C1687.m3716("setUserId must be called on the main UI thread.");
        this.zzano.zzauv = str;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void stopLoading() {
        C1687.m3716("stopLoading must be called on the main UI thread.");
        this.zzanm = false;
        this.zzano.zzf(true);
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzadp zzadpVar) {
        C1687.m3716("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzano.f2791 = zzadpVar;
    }

    public final void zza(zzaeq zzaeqVar) {
        zzadp zzadpVar = this.zzano.f2791;
        if (zzadpVar == null) {
            return;
        }
        String str = "";
        int i = 1;
        if (zzaeqVar != null) {
            try {
                str = zzaeqVar.type;
                i = zzaeqVar.zzcwd;
            } catch (RemoteException e) {
                zzakb.zzc("Could not call RewardedVideoAdListener.onRewarded().", e);
                return;
            }
        }
        zzadpVar.zza(new zzadc(str, i));
    }

    @Override // com.google.android.gms.internal.zzzx
    public final void zza(zzafp zzafpVar) {
        zzaax zzaaxVar = zzafpVar.zzcxy;
        if (zzaaxVar.zzcpa != -1 && !TextUtils.isEmpty(zzaaxVar.zzcpj)) {
            long zzr = zzr(zzafpVar.zzcxy.zzcpj);
            if (zzr != -1) {
                this.zzanj.zza(this.zzanj.zzd(zzafpVar.zzcxy.zzcpa + zzr), "stc");
            }
        }
        this.zzanj.zzao(zzafpVar.zzcxy.zzcpj);
        this.zzanj.zza(this.zzank, "arf");
        this.zzanl = this.zzanj.zzjf();
        this.zzanj.zzf("gqi", zzafpVar.zzcxy.zzcpk);
        zzbt zzbtVar = this.zzano;
        zzbtVar.zzaua = null;
        zzbtVar.zzaue = zzafpVar;
        zzafpVar.zzcxw.zza(new C2450(zzafpVar));
        zzafpVar.zzcxw.zza(zziu.zza.zzb.AD_LOADED);
        zza(zzafpVar, this.zzanj);
    }

    public abstract void zza(zzafp zzafpVar, zznu zznuVar);

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzjn zzjnVar) {
        zzanh zzanhVar;
        C1687.m3716("setAdSize must be called on the main UI thread.");
        zzbt zzbtVar = this.zzano;
        zzbtVar.zzauc = zzjnVar;
        zzafo zzafoVar = zzbtVar.zzaud;
        if (zzafoVar != null && (zzanhVar = zzafoVar.zzciy) != null && zzbtVar.zzauz == 0) {
            zzanhVar.zza(zzapa.zzc(zzjnVar));
        }
        zzbu zzbuVar = this.zzano.f2793;
        if (zzbuVar == null) {
            return;
        }
        if (zzbuVar.getChildCount() > 1) {
            zzbu zzbuVar2 = this.zzano.f2793;
            zzbuVar2.removeView(zzbuVar2.getNextView());
        }
        this.zzano.f2793.setMinimumWidth(zzjnVar.widthPixels);
        this.zzano.f2793.setMinimumHeight(zzjnVar.heightPixels);
        this.zzano.f2793.requestLayout();
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzke zzkeVar) {
        C1687.m3716("setAdListener must be called on the main UI thread.");
        this.zzano.f2784 = zzkeVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkh zzkhVar) {
        C1687.m3716("setAdListener must be called on the main UI thread.");
        this.zzano.f2788 = zzkhVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkx zzkxVar) {
        C1687.m3716("setAppEventListener must be called on the main UI thread.");
        this.zzano.f2773 = zzkxVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzld zzldVar) {
        C1687.m3716("setCorrelationIdProvider must be called on the main UI thread");
        this.zzano.f2770 = zzldVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzlr zzlrVar) {
        C1687.m3716("setIconAdOptions must be called on the main UI thread.");
        this.zzano.f2779 = zzlrVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzmr zzmrVar) {
        C1687.m3716("setVideoOptions must be called on the main UI thread.");
        this.zzano.f2795 = zzmrVar;
    }

    public final void zza(zzns zznsVar) {
        this.zzanj = new zznu(((Boolean) zzkb.zzif().zzd(zznh.zzbjl)).booleanValue(), "load_ad", this.zzano.zzauc.zzbek);
        this.zzanl = new zzns(-1L, null, null);
        if (zznsVar == null) {
            this.zzank = new zzns(-1L, null, null);
        } else {
            this.zzank = new zzns(zznsVar.getTime(), zznsVar.zzjc(), zznsVar.zzjd());
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public void zza(zzoa zzoaVar) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    @Override // com.google.android.gms.internal.zzks
    public void zza(zzxl zzxlVar) {
        zzakb.zzcu("setInAppPurchaseListener is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzxr zzxrVar, String str) {
        zzakb.zzcu("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.zzafy
    public final void zza(HashSet<zzafq> hashSet) {
        this.zzano.zza(hashSet);
    }

    public boolean zza(zzafo zzafoVar) {
        return false;
    }

    public abstract boolean zza(zzafo zzafoVar, zzafo zzafoVar2);

    public abstract boolean zza(zzjj zzjjVar, zznu zznuVar);

    @Override // com.google.android.gms.internal.zzyb
    public void zzb(zzafo zzafoVar) {
        zzis zzisVar;
        zziu.zza.zzb zzbVar;
        this.zzanj.zza(this.zzanl, "awr");
        zzbt zzbtVar = this.zzano;
        zzbtVar.zzaub = null;
        int i = zzafoVar.errorCode;
        if (i != -2 && i != 3 && zzbtVar.zzfh() != null) {
            zzbs.zzem().zzb(this.zzano.zzfh());
        }
        if (zzafoVar.errorCode == -1) {
            this.zzanm = false;
            return;
        }
        if (zza(zzafoVar)) {
            zzakb.zzbx("Ad refresh scheduled.");
        }
        int i2 = zzafoVar.errorCode;
        if (i2 != -2) {
            if (i2 == 3) {
                zzisVar = zzafoVar.zzcxw;
                zzbVar = zziu.zza.zzb.AD_FAILED_TO_LOAD_NO_FILL;
            } else {
                zzisVar = zzafoVar.zzcxw;
                zzbVar = zziu.zza.zzb.AD_FAILED_TO_LOAD;
            }
            zzisVar.zza(zzbVar);
            zzi(zzafoVar.errorCode);
            return;
        }
        zzbt zzbtVar2 = this.zzano;
        if (zzbtVar2.zzaux == null) {
            zzbtVar2.zzaux = new zzafz(zzbtVar2.zzatw);
        }
        zzbu zzbuVar = this.zzano.f2793;
        if (zzbuVar != null) {
            zzbuVar.zzfn().zzcn(zzafoVar.zzcps);
        }
        this.zzanq.zzh(this.zzano.zzaud);
        if (zza(this.zzano.zzaud, zzafoVar)) {
            zzbt zzbtVar3 = this.zzano;
            zzbtVar3.zzaud = zzafoVar;
            zzafq zzafqVar = zzbtVar3.zzauf;
            if (zzafqVar != null) {
                zzafqVar.zzh(zzafoVar.zzcxp);
                zzbtVar3.zzauf.zzi(zzbtVar3.zzaud.zzcxq);
                zzbtVar3.zzauf.zzw(zzbtVar3.zzaud.zzcow);
                zzbtVar3.zzauf.zzv(zzbtVar3.zzauc.zzbel);
            }
            this.zzanj.zzf("is_mraid", this.zzano.zzaud.zzfv() ? "1" : "0");
            this.zzanj.zzf("is_mediation", this.zzano.zzaud.zzcow ? "1" : "0");
            zzanh zzanhVar = this.zzano.zzaud.zzciy;
            if (zzanhVar != null && zzanhVar.zzsz() != null) {
                this.zzanj.zzf("is_delay_pl", this.zzano.zzaud.zzciy.zzsz().zztq() ? "1" : "0");
            }
            this.zzanj.zza(this.zzank, "ttc");
            if (zzbs.zzem().zzpc() != null) {
                zzbs.zzem().zzpc().zza(this.zzanj);
            }
            zzcc();
            if (this.zzano.zzfk()) {
                zzby();
            }
        }
        if (zzafoVar.zzcdn != null) {
            zzbs.zzei().zza(this.zzano.zzair, zzafoVar.zzcdn);
        }
    }

    @Override // com.google.android.gms.internal.zzks
    public boolean zzb(zzjj zzjjVar) {
        String sb;
        C1687.m3716("loadAd must be called on the main UI thread.");
        zzbs.zzen().zzhe();
        if (((Boolean) zzkb.zzif().zzd(zznh.zzblm)).booleanValue()) {
            zzjj.zzh(zzjjVar);
        }
        if (C1687.m3658(this.zzano.zzair) && zzjjVar.zzbdn != null) {
            zzjjVar = new zzjk(zzjjVar).zza(null).zzhr();
        }
        zzbt zzbtVar = this.zzano;
        if (zzbtVar.zzaua != null || zzbtVar.zzaub != null) {
            zzakb.zzcu(this.zzanp != null ? "Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes." : "Loading already in progress, saving this object for future refreshes.");
            this.zzanp = zzjjVar;
            return false;
        }
        zzakb.zzct("Starting ad request.");
        zza((zzns) null);
        this.zzank = this.zzanj.zzjf();
        if (zzjjVar.zzbdi) {
            sb = "This request is sent from a test device.";
        } else {
            zzkb.zzia();
            String zzbc = zzajr.zzbc(this.zzano.zzair);
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzbc).length() + 71);
            sb2.append("Use AdRequest.Builder.addTestDevice(\"");
            sb2.append(zzbc);
            sb2.append("\") to get test ads on this device.");
            sb = sb2.toString();
        }
        zzakb.zzct(sb);
        this.zzann.zzf(zzjjVar);
        boolean zza = zza(zzjjVar, this.zzanj);
        this.zzanm = zza;
        return zza;
    }

    public final zzv zzbq() {
        return this.zzanr;
    }

    @Override // com.google.android.gms.internal.zzks
    public final InterfaceC2455 zzbr() {
        C1687.m3716("getAdFrame must be called on the main UI thread.");
        return new BinderC2454(this.zzano.f2793);
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzjn zzbs() {
        C1687.m3716("getAdSize must be called on the main UI thread.");
        if (this.zzano.zzauc == null) {
            return null;
        }
        return new zzmp(this.zzano.zzauc);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzq
    public final void zzbt() {
        zzbw();
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zzbu() {
        List<String> list;
        C1687.m3716("recordManualImpression must be called on the main UI thread.");
        if (this.zzano.zzaud == null) {
            zzakb.zzcu("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zzakb.zzbx("Pinging manual tracking URLs.");
        if (this.zzano.zzaud.zzcxu) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list2 = this.zzano.zzaud.zzcoy;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        zzuh zzuhVar = this.zzano.zzaud.zzces;
        if (zzuhVar != null && (list = zzuhVar.zzccx) != null) {
            arrayList.addAll(list);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        zzbs.zzei();
        zzbt zzbtVar = this.zzano;
        zzahn.zza(zzbtVar.zzair, zzbtVar.zzaty.zzcv, arrayList);
        this.zzano.zzaud.zzcxu = true;
    }

    public void zzbv() {
        zzakb.zzct("Ad closing.");
        zzkh zzkhVar = this.zzano.f2788;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdClosed();
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdClosed().", e);
            }
        }
        zzadp zzadpVar = this.zzano.f2791;
        if (zzadpVar != null) {
            try {
                zzadpVar.onRewardedVideoAdClosed();
            } catch (RemoteException e2) {
                zzakb.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", e2);
            }
        }
    }

    public final void zzbw() {
        zzakb.zzct("Ad leaving application.");
        zzkh zzkhVar = this.zzano.f2788;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdLeftApplication();
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdLeftApplication().", e);
            }
        }
        zzadp zzadpVar = this.zzano.f2791;
        if (zzadpVar != null) {
            try {
                zzadpVar.onRewardedVideoAdLeftApplication();
            } catch (RemoteException e2) {
                zzakb.zzc("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", e2);
            }
        }
    }

    public final void zzbx() {
        zzakb.zzct("Ad opening.");
        zzkh zzkhVar = this.zzano.f2788;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdOpened();
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdOpened().", e);
            }
        }
        zzadp zzadpVar = this.zzano.f2791;
        if (zzadpVar != null) {
            try {
                zzadpVar.onRewardedVideoAdOpened();
            } catch (RemoteException e2) {
                zzakb.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", e2);
            }
        }
    }

    public void zzby() {
        zzc(false);
    }

    public final void zzbz() {
        zzakb.zzct("Ad impression.");
        zzkh zzkhVar = this.zzano.f2788;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdImpression();
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdImpression().", e);
            }
        }
    }

    public final List<String> zzc(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzafi.zzb(it.next(), this.zzano.zzair));
        }
        return arrayList;
    }

    public void zzc(int i, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        zzakb.zzcu(sb.toString());
        this.zzanm = z;
        zzkh zzkhVar = this.zzano.f2788;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdFailedToLoad().", e);
            }
        }
        zzadp zzadpVar = this.zzano.f2791;
        if (zzadpVar != null) {
            try {
                zzadpVar.onRewardedVideoAdFailedToLoad(i);
            } catch (RemoteException e2) {
                zzakb.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", e2);
            }
        }
    }

    public void zzc(boolean z) {
        zzakb.zzct("Ad finished loading.");
        this.zzanm = z;
        zzkh zzkhVar = this.zzano.f2788;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdLoaded();
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdLoaded().", e);
            }
        }
        zzadp zzadpVar = this.zzano.f2791;
        if (zzadpVar != null) {
            try {
                zzadpVar.onRewardedVideoAdLoaded();
            } catch (RemoteException e2) {
                zzakb.zzc("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", e2);
            }
        }
    }

    public boolean zzc(zzjj zzjjVar) {
        zzbu zzbuVar = this.zzano.f2793;
        if (zzbuVar == null) {
            return false;
        }
        Object parent = zzbuVar.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return zzbs.zzei().zza(view, view.getContext());
    }

    public final void zzca() {
        zzakb.zzct("Ad clicked.");
        zzkh zzkhVar = this.zzano.f2788;
        if (zzkhVar != null) {
            try {
                zzkhVar.onAdClicked();
            } catch (RemoteException e) {
                zzakb.zzc("Could not call AdListener.onAdClicked().", e);
            }
        }
    }

    public final void zzcb() {
        zzadp zzadpVar = this.zzano.f2791;
        if (zzadpVar == null) {
            return;
        }
        try {
            zzadpVar.onRewardedVideoStarted();
        } catch (RemoteException e) {
            zzakb.zzc("Could not call RewardedVideoAdListener.onVideoStarted().", e);
        }
    }

    public final void zzcc() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || TextUtils.isEmpty(zzafoVar.zzcps) || zzafoVar.zzcxv || !zzbs.zzer().zzqq()) {
            return;
        }
        zzakb.zzbx("Sending troubleshooting signals to the server.");
        zzaim zzer = zzbs.zzer();
        zzbt zzbtVar = this.zzano;
        zzer.zzb(zzbtVar.zzair, zzbtVar.zzaty.zzcv, zzafoVar.zzcps, zzbtVar.zzatw);
        zzafoVar.zzcxv = true;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkx zzcd() {
        return this.zzano.f2773;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkh zzce() {
        return this.zzano.f2788;
    }

    public final void zzg(View view) {
        zzbu zzbuVar = this.zzano.f2793;
        if (zzbuVar != null) {
            zzbuVar.addView(view, zzbs.zzek().zzqi());
        }
    }

    public void zzi(int i) {
        zzc(i, false);
    }
}
