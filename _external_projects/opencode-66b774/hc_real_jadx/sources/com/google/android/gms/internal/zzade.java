package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzade extends com.google.android.gms.ads.internal.zzd implements zzaef {
    private static zzade zzcuy;
    private static final zzuw zzcuz = new zzuw();
    private boolean zzaqg;
    private zzafe zzaqh;
    private final Map<String, zzael> zzcva;
    private boolean zzcvb;

    public zzade(Context context, com.google.android.gms.ads.internal.zzv zzvVar, zzjn zzjnVar, zzux zzuxVar, zzakd zzakdVar) {
        super(context, zzjnVar, null, zzuxVar, zzakdVar, zzvVar);
        this.zzcva = new HashMap();
        zzcuy = this;
        this.zzaqh = new zzafe(context, null);
    }

    private static zzafp zzc(zzafp zzafpVar) {
        zzagf.v("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            String jSONObject = zzacg.zzb(zzafpVar.zzcxy).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzafpVar.zzcqv.zzatw);
            return new zzafp(zzafpVar.zzcqv, zzafpVar.zzcxy, new zzui(Arrays.asList(new zzuh(jSONObject, null, Arrays.asList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L)), ((Long) zzkb.zzif().zzd(zznh.zzbnj)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false), zzafpVar.zzauc, zzafpVar.errorCode, zzafpVar.zzcxp, zzafpVar.zzcxq, zzafpVar.zzcxj, zzafpVar.zzcxw, null);
        } catch (JSONException e) {
            zzakb.zzb("Unable to generate ad state for non-mediated rewarded video.", e);
            return new zzafp(zzafpVar.zzcqv, zzafpVar.zzcxy, null, zzafpVar.zzauc, 0, zzafpVar.zzcxp, zzafpVar.zzcxq, zzafpVar.zzcxj, zzafpVar.zzcxw, null);
        }
    }

    public static zzade zzoa() {
        return zzcuy;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void destroy() {
        C1687.m3716("destroy must be called on the main UI thread.");
        for (String str : this.zzcva.keySet()) {
            try {
                zzael zzaelVar = this.zzcva.get(str);
                if (zzaelVar != null && zzaelVar.zzoi() != null) {
                    zzaelVar.zzoi().destroy();
                }
            } catch (RemoteException unused) {
                String valueOf = String.valueOf(str);
                zzakb.zzcu(valueOf.length() != 0 ? "Fail to destroy adapter: ".concat(valueOf) : new String("Fail to destroy adapter: "));
            }
        }
    }

    public final boolean isLoaded() {
        C1687.m3716("isLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzbt zzbtVar = this.zzano;
        return zzbtVar.zzaua == null && zzbtVar.zzaub == null && zzbtVar.zzaud != null && !this.zzcvb;
    }

    public final void onContextChanged(Context context) {
        Iterator<zzael> it = this.zzcva.values().iterator();
        while (it.hasNext()) {
            try {
                it.next().zzoi().zzg(new BinderC2454(context));
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzaef
    public final void onRewardedVideoAdClosed() {
        if (zzbs.zzfd().zzu(this.zzano.zzair)) {
            this.zzaqh.zzu(false);
        }
        zzbv();
    }

    @Override // com.google.android.gms.internal.zzaef
    public final void onRewardedVideoAdLeftApplication() {
        zzbw();
    }

    @Override // com.google.android.gms.internal.zzaef
    public final void onRewardedVideoAdOpened() {
        if (zzbs.zzfd().zzu(this.zzano.zzair)) {
            this.zzaqh.zzu(true);
        }
        zza(this.zzano.zzaud, false);
        zzbx();
    }

    @Override // com.google.android.gms.internal.zzaef
    public final void onRewardedVideoStarted() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar != null && zzafoVar.zzces != null) {
            zzbs.zzez();
            com.google.android.gms.ads.internal.zzbt zzbtVar = this.zzano;
            Context context = zzbtVar.zzair;
            String str = zzbtVar.zzaty.zzcv;
            zzafo zzafoVar2 = zzbtVar.zzaud;
            zzuq.zza(context, str, zzafoVar2, zzbtVar.zzatw, false, zzafoVar2.zzces.zzcda);
        }
        zzcb();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void pause() {
        C1687.m3716("pause must be called on the main UI thread.");
        for (String str : this.zzcva.keySet()) {
            try {
                zzael zzaelVar = this.zzcva.get(str);
                if (zzaelVar != null && zzaelVar.zzoi() != null) {
                    zzaelVar.zzoi().pause();
                }
            } catch (RemoteException unused) {
                String valueOf = String.valueOf(str);
                zzakb.zzcu(valueOf.length() != 0 ? "Fail to pause adapter: ".concat(valueOf) : new String("Fail to pause adapter: "));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void resume() {
        C1687.m3716("resume must be called on the main UI thread.");
        for (String str : this.zzcva.keySet()) {
            try {
                zzael zzaelVar = this.zzcva.get(str);
                if (zzaelVar != null && zzaelVar.zzoi() != null) {
                    zzaelVar.zzoi().resume();
                }
            } catch (RemoteException unused) {
                String valueOf = String.valueOf(str);
                zzakb.zzcu(valueOf.length() != 0 ? "Fail to resume adapter: ".concat(valueOf) : new String("Fail to resume adapter: "));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void setImmersiveMode(boolean z) {
        C1687.m3716("setImmersiveMode must be called on the main UI thread.");
        this.zzaqg = z;
    }

    public final void zza(zzadv zzadvVar) {
        C1687.m3716("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzadvVar.zzatw)) {
            zzakb.zzcu("Invalid ad unit id. Aborting.");
            zzahn.zzdaw.post(new zzadf(this));
            return;
        }
        this.zzcvb = false;
        com.google.android.gms.ads.internal.zzbt zzbtVar = this.zzano;
        String str = zzadvVar.zzatw;
        zzbtVar.zzatw = str;
        this.zzaqh.setAdUnitId(str);
        super.zzb(zzadvVar.zzcnd);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zza(zzafp zzafpVar, zznu zznuVar) {
        if (zzafpVar.errorCode != -2) {
            zzahn.zzdaw.post(new zzadg(this, zzafpVar));
            return;
        }
        com.google.android.gms.ads.internal.zzbt zzbtVar = this.zzano;
        zzbtVar.zzaue = zzafpVar;
        if (zzafpVar.zzcxl == null) {
            zzbtVar.zzaue = zzc(zzafpVar);
        }
        com.google.android.gms.ads.internal.zzbt zzbtVar2 = this.zzano;
        zzbtVar2.zzauz = 0;
        zzbs.zzeh();
        com.google.android.gms.ads.internal.zzbt zzbtVar3 = this.zzano;
        zzaei zzaeiVar = new zzaei(zzbtVar3.zzair, zzbtVar3.zzaue, this);
        String name = zzaei.class.getName();
        zzakb.zzbx(name.length() != 0 ? "AdRenderer: ".concat(name) : new String("AdRenderer: "));
        zzaeiVar.zznd();
        zzbtVar2.zzaub = zzaeiVar;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzafo zzafoVar, zzafo zzafoVar2) {
        return true;
    }

    @Override // com.google.android.gms.ads.internal.zzd
    public final boolean zza(zzjj zzjjVar, zzafo zzafoVar, boolean z) {
        return false;
    }

    public final zzael zzbq(String str) {
        zzael zzaelVar;
        zzael zzaelVar2 = this.zzcva.get(str);
        if (zzaelVar2 != null) {
            return zzaelVar2;
        }
        try {
            zzux zzuxVar = this.zzanw;
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzuxVar = zzcuz;
            }
            zzaelVar = new zzael(zzuxVar.zzbg(str), this);
        } catch (Exception e) {
            e = e;
        }
        try {
            this.zzcva.put(str, zzaelVar);
            return zzaelVar;
        } catch (Exception e2) {
            e = e2;
            zzaelVar2 = zzaelVar;
            String valueOf = String.valueOf(str);
            zzakb.zzc(valueOf.length() != 0 ? "Fail to instantiate adapter ".concat(valueOf) : new String("Fail to instantiate adapter "), e);
            return zzaelVar2;
        }
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zzbv() {
        this.zzano.zzaud = null;
        super.zzbv();
    }

    @Override // com.google.android.gms.internal.zzaef
    public final void zzc(zzaeq zzaeqVar) {
        zzui zzuiVar;
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar != null && (zzuiVar = zzafoVar.zzcxl) != null && !TextUtils.isEmpty(zzuiVar.zzcdr)) {
            zzui zzuiVar2 = this.zzano.zzaud.zzcxl;
            zzaeqVar = new zzaeq(zzuiVar2.zzcdr, zzuiVar2.zzcds);
        }
        zzafo zzafoVar2 = this.zzano.zzaud;
        if (zzafoVar2 != null && zzafoVar2.zzces != null) {
            zzbs.zzez();
            com.google.android.gms.ads.internal.zzbt zzbtVar = this.zzano;
            zzuq.zza(zzbtVar.zzair, zzbtVar.zzaty.zzcv, zzbtVar.zzaud.zzces.zzcdb, zzbtVar.zzauv, zzaeqVar);
        }
        if (zzbs.zzfd().zzu(this.zzano.zzair) && zzaeqVar != null) {
            zzbs.zzfd().zza(this.zzano.zzair, zzbs.zzfd().zzy(this.zzano.zzair), this.zzano.zzatw, zzaeqVar.type, zzaeqVar.zzcwd);
        }
        zza(zzaeqVar);
    }

    public final void zzob() {
        C1687.m3716("showAd must be called on the main UI thread.");
        if (!isLoaded()) {
            zzakb.zzcu("The reward video has not loaded.");
            return;
        }
        this.zzcvb = true;
        zzael zzbq = zzbq(this.zzano.zzaud.zzceu);
        if (zzbq == null || zzbq.zzoi() == null) {
            return;
        }
        try {
            zzbq.zzoi().setImmersiveMode(this.zzaqg);
            zzbq.zzoi().showVideo();
        } catch (RemoteException e) {
            zzakb.zzc("Could not call showVideo.", e);
        }
    }

    @Override // com.google.android.gms.internal.zzaef
    public final void zzoc() {
        onAdClicked();
    }
}
