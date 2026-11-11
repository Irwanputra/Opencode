package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p131.p155.p156.p157.C2098;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvw<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzvb {
    private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzcfv;
    private final NETWORK_EXTRAS zzcfw;

    public zzvw(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter, NETWORK_EXTRAS network_extras) {
        this.zzcfv = mediationAdapter;
        this.zzcfw = network_extras;
    }

    private final SERVER_PARAMETERS zza(String str, int i, String str2) {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.zzcfv.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
            newInstance.load(hashMap);
            return newInstance;
        } catch (Throwable th) {
            throw C2098.m4180("Could not get MediationServerParameters.", th);
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
            this.zzcfv.destroy();
        } catch (Throwable th) {
            throw C2098.m4180("Could not destroy adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzll getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzva
    public final InterfaceC2455 getView() {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzcfv;
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
        return true;
    }

    @Override // com.google.android.gms.internal.zzva
    public final void pause() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzva
    public final void resume() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.zzva
    public final void setImmersiveMode(boolean z) {
    }

    @Override // com.google.android.gms.internal.zzva
    public final void showInterstitial() {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzcfv;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzcfv).showInterstitial();
        } catch (Throwable th) {
            throw C2098.m4180("Could not show interstitial from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(zzjj zzjjVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzaem zzaemVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzaem zzaemVar, String str2) {
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, zzvd zzvdVar) {
        zza(interfaceC2455, zzjjVar, str, (String) null, zzvdVar);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar) {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzcfv;
        if (!(mediationAdapter instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationInterstitialAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.zzcfv).requestInterstitialAd(new zzvx(zzvdVar), (Activity) BinderC2454.m4502(interfaceC2455), zza(str, zzjjVar.zzbdj, str2), zzwj.zza(zzjjVar, zzn(zzjjVar)), this.zzcfw);
        } catch (Throwable th) {
            throw C2098.m4180("Could not request interstitial ad from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjj zzjjVar, String str, String str2, zzvd zzvdVar, zzpe zzpeVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, zzvd zzvdVar) {
        zza(interfaceC2455, zzjnVar, zzjjVar, str, null, zzvdVar);
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zza(InterfaceC2455 interfaceC2455, zzjn zzjnVar, zzjj zzjjVar, String str, String str2, zzvd zzvdVar) {
        MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> mediationAdapter = this.zzcfv;
        if (!(mediationAdapter instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(mediationAdapter.getClass().getCanonicalName());
            zzakb.zzcu(valueOf.length() != 0 ? "MediationAdapter is not a MediationBannerAdapter: ".concat(valueOf) : new String("MediationAdapter is not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        zzakb.zzbx("Requesting banner ad from adapter.");
        try {
            ((MediationBannerAdapter) this.zzcfv).requestBannerAd(new zzvx(zzvdVar), (Activity) BinderC2454.m4502(interfaceC2455), zza(str, zzjjVar.zzbdj, str2), zzwj.zzb(zzjnVar), zzwj.zza(zzjjVar, zzn(zzjjVar)), this.zzcfw);
        } catch (Throwable th) {
            throw C2098.m4180("Could not request banner ad from adapter.", th);
        }
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zzc(zzjj zzjjVar, String str) {
    }

    @Override // com.google.android.gms.internal.zzva
    public final void zzg(InterfaceC2455 interfaceC2455) {
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzvj zzme() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzvm zzmf() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle zzmg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.zzva
    public final Bundle zzmh() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.zzva
    public final boolean zzmi() {
        return false;
    }

    @Override // com.google.android.gms.internal.zzva
    public final zzqm zzmj() {
        return null;
    }
}
