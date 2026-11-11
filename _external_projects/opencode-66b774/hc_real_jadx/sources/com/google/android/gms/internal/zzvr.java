package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvr extends zzvb {
    private final MediationAdapter zzcfn;
    private zzvs zzcfo;

    public zzvr(MediationAdapter mediationAdapter) {
        this.zzcfn = mediationAdapter;
    }

    private final Bundle zza(String str, zzjj zzjjVar, String str2) {
        String valueOf = String.valueOf(str);
        zzakb.zzcu(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zzcfn instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzjjVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzjjVar.zzbdj);
                }
            }
            return bundle;
        } catch (Throwable th) {
            throw C2098.m4180("Could not get Server Parameters Bundle.", th);
        }
    }

    private static boolean zzn(zzjj zzjjVar) {
        if (zzjjVar.zzbdi) {
            return true;
        }
        zzkb.zzia();
        return zzajr.zzqy();
    }

    @Override // com.google.android.gms.internal.zzva
    public final void destroy() {
        try {
            this.zzcfn.onDestroy();
        } catch (Throwable th) {
            throw C2098.m4180("Could not destroy adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle getInterstitialAdapterInfo() {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (mediationAdapter instanceof zzapc) {
            return ((zzapc) mediationAdapter).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a v2 MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a v2 MediationInterstitialAdapter: "));
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzll getVideoController() {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof com.google.android.gms.ads.mediation.zza)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zza) mediationAdapter).getVideoController();
        } catch (Throwable th) {
            zzakb.zzc("Could not get video controller.", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final InterfaceC2455 getView() {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (mediationAdapter instanceof MediationBannerAdapter) {
            try {
                return new BinderC2454(((MediationBannerAdapter) mediationAdapter).getBannerView());
            } catch (Throwable th) {
                throw C2098.m4180("Could not get banner view from adapter.", th);
            }
        }
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzva
    public final boolean isInitialized() {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Check if adapter is initialized.");
        try {
            return ((MediationRewardedVideoAdAdapter) this.zzcfn).isInitialized();
        } catch (Throwable th) {
            throw C2098.m4180("Could not check if adapter is initialized.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void pause() {
        try {
            this.zzcfn.onPause();
        } catch (Throwable th) {
            throw C2098.m4180("Could not pause adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void resume() {
        try {
            this.zzcfn.onResume();
        } catch (Throwable th) {
            throw C2098.m4180("Could not resume adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void setImmersiveMode(boolean z) {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof OnImmersiveModeUpdatedListener)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzct(valueOf.length() != 0 ? "MediationAdapter is not an OnImmersiveModeUpdatedListener: ".concat(valueOf) : new String("MediationAdapter is not an OnImmersiveModeUpdatedListener: "));
        } else {
            try {
                ((OnImmersiveModeUpdatedListener) mediationAdapter).onImmersiveModeUpdated(z);
            } catch (Throwable th) {
                zzakb.zzc("Could not set immersive mode.", th);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void showInterstitial() {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzcfn).showInterstitial();
        } catch (Throwable th) {
            throw C2098.m4180("Could not show interstitial from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void showVideo() {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Show rewarded video ad from adapter.");
        try {
            ((MediationRewardedVideoAdAdapter) this.zzcfn).showVideo();
        } catch (Throwable th) {
            throw C2098.m4180("Could not show rewarded video ad from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(zzjj zzjjVar, String str, String str2) {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Requesting rewarded video ad from adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzcfn;
            zzvq zzvqVar = new zzvq(zzjjVar.zzbdf == -1 ? null : new Date(zzjjVar.zzbdf), zzjjVar.zzbdg, zzjjVar.zzbdh != null ? new HashSet(zzjjVar.zzbdh) : null, zzjjVar.zzbdn, zzn(zzjjVar), zzjjVar.zzbdj, zzjjVar.zzbdu);
            Bundle bundle = zzjjVar.zzbdp;
            mediationRewardedVideoAdAdapter.loadAd(zzvqVar, zza(str, zzjjVar, str2), bundle != null ? bundle.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            throw C2098.m4180("Could not load rewarded video ad from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzaem zzaemVar, List<String> list) {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not an InitializableMediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.zzcfn;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zza(it.next(), (zzjj) null, (String) null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) BinderC2454.m4502(interfaceC2455), new zzaep(zzaemVar), arrayList);
        } catch (Throwable th) {
            throw C2098.m4180("Could not initialize rewarded video adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzaem zzaemVar, String str2) {
        zzvq zzvqVar;
        Bundle bundle;
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationRewardedVideoAdAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationRewardedVideoAdAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationRewardedVideoAdAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Initialize rewarded video adapter.");
        try {
            MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.zzcfn;
            Bundle zza = zza(str2, zzjjVar, (String) null);
            if (zzjjVar != null) {
                zzvq zzvqVar2 = new zzvq(zzjjVar.zzbdf == -1 ? null : new Date(zzjjVar.zzbdf), zzjjVar.zzbdg, zzjjVar.zzbdh != null ? new HashSet(zzjjVar.zzbdh) : null, zzjjVar.zzbdn, zzn(zzjjVar), zzjjVar.zzbdj, zzjjVar.zzbdu);
                Bundle bundle2 = zzjjVar.zzbdp;
                bundle = bundle2 != null ? bundle2.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                zzvqVar = zzvqVar2;
            } else {
                zzvqVar = null;
                bundle = null;
            }
            mediationRewardedVideoAdAdapter.initialize((Context) BinderC2454.m4502(interfaceC2455), zzvqVar, str, new zzaep(zzaemVar), zza, bundle);
        } catch (Throwable th) {
            throw C2098.m4180("Could not initialize rewarded video adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzvd zzvdVar) {
        zza(interfaceC2455, zzjjVar, str, (String) null, zzvdVar);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar) {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.zzcfn;
            zzvq zzvqVar = new zzvq(zzjjVar.zzbdf == -1 ? null : new Date(zzjjVar.zzbdf), zzjjVar.zzbdg, zzjjVar.zzbdh != null ? new HashSet(zzjjVar.zzbdh) : null, zzjjVar.zzbdn, zzn(zzjjVar), zzjjVar.zzbdj, zzjjVar.zzbdu);
            Bundle bundle = zzjjVar.zzbdp;
            mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC2454.m4502(interfaceC2455), new zzvs(zzvdVar), zza(str, zzjjVar, str2), zzvqVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            throw C2098.m4180("Could not request interstitial ad from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar, zzpe zzpeVar, List<String> list) {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationNativeAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationNativeAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationNativeAdapter: "));
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationAdapter;
            zzvv zzvvVar = new zzvv(zzjjVar.zzbdf == -1 ? null : new Date(zzjjVar.zzbdf), zzjjVar.zzbdg, zzjjVar.zzbdh != null ? new HashSet(zzjjVar.zzbdh) : null, zzjjVar.zzbdn, zzn(zzjjVar), zzjjVar.zzbdj, zzpeVar, list, zzjjVar.zzbdu);
            Bundle bundle = zzjjVar.zzbdp;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.zzcfo = new zzvs(zzvdVar);
            mediationNativeAdapter.requestNativeAd((Context) BinderC2454.m4502(interfaceC2455), this.zzcfo, zza(str, zzjjVar, str2), zzvvVar, bundle2);
        } catch (Throwable th) {
            throw C2098.m4180("Could not request native ad from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, zzvd zzvdVar) {
        zza(interfaceC2455, zzjnVar, zzjjVar, str, null, zzvdVar);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, String str2, zzvd zzvdVar) {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.zzcfn;
            zzvq zzvqVar = new zzvq(zzjjVar.zzbdf == -1 ? null : new Date(zzjjVar.zzbdf), zzjjVar.zzbdg, zzjjVar.zzbdh != null ? new HashSet(zzjjVar.zzbdh) : null, zzjjVar.zzbdn, zzn(zzjjVar), zzjjVar.zzbdj, zzjjVar.zzbdu);
            Bundle bundle = zzjjVar.zzbdp;
            mediationBannerAdapter.requestBannerAd((Context) BinderC2454.m4502(interfaceC2455), new zzvs(zzvdVar), zza(str, zzjjVar, str2), com.google.android.gms.ads.zzb.zza(zzjnVar.width, zzjnVar.height, zzjnVar.zzbek), zzvqVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            throw C2098.m4180("Could not request banner ad from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zzc(zzjj zzjjVar, String str) {
        zza(zzjjVar, str, (String) null);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zzg(InterfaceC2455 interfaceC2455) {
        try {
            ((OnContextChangedListener) this.zzcfn).onContextChanged((Context) BinderC2454.m4502(interfaceC2455));
        } catch (Throwable th) {
            zzakb.zza("Could not inform adapter of changed context", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzvj zzme() {
        NativeAdMapper zzmm = this.zzcfo.zzmm();
        if (zzmm instanceof NativeAppInstallAdMapper) {
            return new zzvt((NativeAppInstallAdMapper) zzmm);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzvm zzmf() {
        NativeAdMapper zzmm = this.zzcfo.zzmm();
        if (zzmm instanceof NativeContentAdMapper) {
            return new zzvu((NativeContentAdMapper) zzmm);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle zzmg() {
        MediationAdapter mediationAdapter = this.zzcfn;
        if (mediationAdapter instanceof zzapb) {
            return ((zzapb) mediationAdapter).zzmg();
        }
        String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
        zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a v2 MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a v2 MediationBannerAdapter: "));
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle zzmh() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.zzva
    public final boolean zzmi() {
        return this.zzcfn instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzqm zzmj() {
        NativeCustomTemplateAd zzmn = this.zzcfo.zzmn();
        if (zzmn instanceof zzqp) {
            return ((zzqp) zzmn).zzkm();
        }
        return null;
    }
}
