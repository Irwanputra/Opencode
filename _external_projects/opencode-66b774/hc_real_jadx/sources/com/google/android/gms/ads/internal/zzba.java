package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzakv;
import com.google.android.gms.internal.zzalf;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzfs;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzoj;
import com.google.android.gms.internal.zzol;
import com.google.android.gms.internal.zzon;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.internal.zzor;
import com.google.android.gms.internal.zzos;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqm;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzui;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzva;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import com.google.android.gms.internal.zzxl;
import com.google.android.gms.internal.zzya;
import com.google.android.gms.internal.zzzb;
import com.google.android.gms.internal.zzzf;
import com.google.android.gms.internal.zzzv;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p034.p080.C1493;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.CallableC2426;
import p131.p161.p162.p193.p194.p199.RunnableC2386;
import p131.p161.p162.p193.p194.p199.RunnableC2395;
import p131.p161.p162.p193.p194.p199.RunnableC2428;
import p131.p161.p162.p193.p194.p199.RunnableC2436;
import p131.p161.p162.p193.p194.p199.RunnableC2442;
import p131.p161.p162.p193.p194.p199.RunnableC2446;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzba extends zzd implements zzot {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public zzzb f2715;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Object f2716;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2717;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2718;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public zzanh f2719;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f2720;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public zzalf<zzou> f2721;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final String f2722;

    public zzba(Context context, zzv zzvVar, zzjn zzjnVar, String str, zzux zzuxVar, zzakd zzakdVar) {
        this(context, zzvVar, zzjnVar, str, zzuxVar, zzakdVar, false);
    }

    public zzba(Context context, zzv zzvVar, zzjn zzjnVar, String str, zzux zzuxVar, zzakd zzakdVar, boolean z) {
        super(context, zzjnVar, str, zzuxVar, zzakdVar, zzvVar);
        this.f2716 = new Object();
        this.f2721 = new zzalf<>();
        this.f2717 = 1;
        this.f2722 = UUID.randomUUID().toString();
        this.f2718 = z;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final String getAdUnitId() {
        return this.zzano.zzatw;
    }

    public final String getUuid() {
        return this.f2722;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void pause() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void resume() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzks
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zza(zzafp zzafpVar, zznu zznuVar) {
        zzjn zzjnVar = zzafpVar.zzauc;
        if (zzjnVar != null) {
            this.zzano.zzauc = zzjnVar;
        }
        if (zzafpVar.errorCode != -2) {
            zzahn.zzdaw.post(new RunnableC2442(this, zzafpVar));
            return;
        }
        int i = zzafpVar.zzcqv.zzcoo;
        if (i == 1) {
            zzbt zzbtVar = this.zzano;
            zzbtVar.zzauz = 0;
            zzbs.zzeh();
            zzbt zzbtVar2 = this.zzano;
            zzbtVar.zzaub = zzya.zza(zzbtVar2.zzair, this, zzafpVar, zzbtVar2.f2780, null, this.zzanw, this, zznuVar);
            String name = this.zzano.zzaub.getClass().getName();
            zzakb.zzbx(name.length() != 0 ? "AdRenderer: ".concat(name) : new String("AdRenderer: "));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(zzafpVar.zzcxy.body).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArray3 = jSONArray2.getJSONObject(i2).getJSONArray("ads");
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    jSONArray.put(jSONArray3.get(i3));
                }
            }
            m1232();
            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(i);
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                arrayList.add(zzahh.zza(newFixedThreadPool, new CallableC2426(this, i4, jSONArray, i, zzafpVar)));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    zzahn.zzdaw.post(new RunnableC2428(this, (zzou) ((zzakv) arrayList.get(i5)).get(((Long) zzkb.zzif().zzd(zznh.zzbnj)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    zzakb.zzc("Exception occurred while getting an ad response", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException e2) {
                    e = e2;
                    zzakb.zzc("Exception occurred while getting an ad response", e);
                } catch (ExecutionException e3) {
                    e = e3;
                    zzakb.zzc("Exception occurred while getting an ad response", e);
                } catch (TimeoutException e4) {
                    e = e4;
                    zzakb.zzc("Exception occurred while getting an ad response", e);
                }
            }
        } catch (JSONException e5) {
            zzakb.zzc("Malformed native ad response", e5);
            zzi(0);
        }
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void zza(zzoa zzoaVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    @Override // com.google.android.gms.internal.zzot
    public final void zza(zzoq zzoqVar) {
        zzanh zzanhVar = this.f2719;
        if (zzanhVar != null) {
            zzanhVar.zzb(zzoqVar);
        }
    }

    @Override // com.google.android.gms.internal.zzot
    public final void zza(zzos zzosVar) {
        if (this.zzano.zzaud.zzcxj != null) {
            zzfs zzps = zzbs.zzem().zzps();
            zzbt zzbtVar = this.zzano;
            zzps.zza(zzbtVar.zzauc, zzbtVar.zzaud, new zzfv(zzosVar), (zzanh) null);
        }
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void zza(zzxl zzxlVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzafo zzafoVar, zzafo zzafoVar2) {
        C1493<String, zzqz> c1493;
        C1493<String, zzqz> c14932;
        zzd(null);
        if (!this.zzano.zzfk()) {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (zzafoVar2.zzcow) {
            m1232();
            try {
                zzva zzvaVar = zzafoVar2.zzcet;
                zzvj zzme = zzvaVar != null ? zzvaVar.zzme() : null;
                zzva zzvaVar2 = zzafoVar2.zzcet;
                zzvm zzmf = zzvaVar2 != null ? zzvaVar2.zzmf() : null;
                zzva zzvaVar3 = zzafoVar2.zzcet;
                zzqm zzmj = zzvaVar3 != null ? zzvaVar3.zzmj() : null;
                String zzc = zzd.zzc(zzafoVar2);
                if (zzme != null && this.zzano.f2796 != null) {
                    zzoj zzojVar = new zzoj(zzme.getHeadline(), zzme.getImages(), zzme.getBody(), zzme.zzjs() != null ? zzme.zzjs() : null, zzme.getCallToAction(), zzme.getStarRating(), zzme.getStore(), zzme.getPrice(), null, zzme.getExtras(), zzme.getVideoController(), zzme.zzml() != null ? (View) BinderC2454.m4502(zzme.zzml()) : null, zzme.zzjx(), zzc);
                    zzbt zzbtVar = this.zzano;
                    zzojVar.zzb(new zzor(zzbtVar.zzair, this, zzbtVar.f2780, zzme, zzojVar));
                    zzahn.zzdaw.post(new RunnableC2436(this, zzojVar));
                } else if (zzmf != null && this.zzano.f2774 != null) {
                    zzol zzolVar = new zzol(zzmf.getHeadline(), zzmf.getImages(), zzmf.getBody(), zzmf.zzjz() != null ? zzmf.zzjz() : null, zzmf.getCallToAction(), zzmf.getAdvertiser(), null, zzmf.getExtras(), zzmf.getVideoController(), zzmf.zzml() != null ? (View) BinderC2454.m4502(zzmf.zzml()) : null, zzmf.zzjx(), zzc);
                    zzbt zzbtVar2 = this.zzano;
                    zzolVar.zzb(new zzor(zzbtVar2.zzair, this, zzbtVar2.f2780, zzmf, zzolVar));
                    zzahn.zzdaw.post(new RunnableC2446(this, zzolVar));
                } else {
                    if (zzmj == null || (c14932 = this.zzano.f2785) == null || c14932.get(zzmj.getCustomTemplateId()) == null) {
                        zzakb.zzcu("No matching mapper/listener for retrieved native ad template.");
                        zzi(0);
                        return false;
                    }
                    zzahn.zzdaw.post(new RunnableC2395(this, zzmj));
                }
            } catch (RemoteException e) {
                zzakb.zzc("Failed to get native ad mapper", e);
            }
        } else {
            zzou zzouVar = zzafoVar2.zzcxr;
            if (this.f2718) {
                this.f2721.set(zzouVar);
            } else if ((zzouVar instanceof zzol) && this.zzano.f2774 != null) {
                zzahn.zzdaw.post(new RunnableC2446(this, (zzol) zzouVar));
            } else {
                if (!(zzouVar instanceof zzoj) || this.zzano.f2796 == null) {
                    if ((zzouVar instanceof zzon) && (c1493 = this.zzano.f2785) != null) {
                        zzon zzonVar = (zzon) zzouVar;
                        if (c1493.get(zzonVar.getCustomTemplateId()) != null) {
                            zzahn.zzdaw.post(new RunnableC2386(this, zzonVar.getCustomTemplateId(), zzafoVar2));
                        }
                    }
                    zzakb.zzcu("No matching listener for retrieved native ad template.");
                    zzi(0);
                    return false;
                }
                zzahn.zzdaw.post(new RunnableC2436(this, (zzoj) zzouVar));
            }
        }
        return super.zza(zzafoVar, zzafoVar2);
    }

    @Override // com.google.android.gms.ads.internal.zzd
    public final boolean zza(zzjj zzjjVar, zzafo zzafoVar, boolean z) {
        return this.zzann.zzdx();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzjj zzjjVar, zznu zznuVar) {
        try {
            m1233();
            return super.zza(zzjjVar, zznuVar, this.f2717);
        } catch (Exception unused) {
            zzakb.zzae(4);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zzby() {
        zzc(false);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zzc(int i, boolean z) {
        m1232();
        super.zzc(i, z);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zzc(boolean z) {
        super.zzc(z);
        if (this.f2720) {
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbow)).booleanValue()) {
                zzds();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzuj
    public final void zzci() {
        zzlo zzij;
        zzva zzvaVar = this.zzano.zzaud.zzcet;
        if (zzvaVar == null) {
            super.zzci();
            return;
        }
        zzll zzllVar = null;
        try {
            zzvj zzme = zzvaVar.zzme();
            if (zzme != null) {
                zzllVar = zzme.getVideoController();
            } else {
                zzvm zzmf = zzvaVar.zzmf();
                if (zzmf != null) {
                    zzllVar = zzmf.getVideoController();
                } else {
                    zzqm zzmj = zzvaVar.zzmj();
                    if (zzmj != null) {
                        zzllVar = zzmj.getVideoController();
                    }
                }
            }
            if (zzllVar == null || (zzij = zzllVar.zzij()) == null) {
                return;
            }
            zzij.onVideoEnd();
        } catch (RemoteException e) {
            zzakb.zzc("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzuj
    public final void zzcj() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(zzafoVar.zzceu)) {
            super.zzcj();
        } else {
            zzca();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzuj
    public final void zzco() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(zzafoVar.zzceu)) {
            super.zzco();
        } else {
            zzbz();
        }
    }

    @Override // com.google.android.gms.internal.zzot
    public final void zzcv() {
        zzanh zzanhVar = this.f2719;
        if (zzanhVar != null) {
            zzanhVar.destroy();
            this.f2719 = null;
        }
    }

    @Override // com.google.android.gms.internal.zzot
    public final boolean zzcw() {
        if (m1231() != null) {
            return m1231().zzcdw;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.zzot
    public final boolean zzcx() {
        if (m1231() != null) {
            return m1231().zzcdx;
        }
        return false;
    }

    public final void zzd(List<String> list) {
        C1687.m3716("setNativeTemplates must be called on the main UI thread.");
        this.zzano.f2781 = list;
    }

    public final zzzb zzdq() {
        zzzb zzzbVar;
        synchronized (this.f2716) {
            zzzbVar = this.f2715;
        }
        return zzzbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzds() {
        if (this.zzano.zzaud == null || this.f2719 == null) {
            this.f2720 = true;
            zzakb.zzcu("Request to enable ActiveView before adState is available.");
            return;
        }
        zzfs zzps = zzbs.zzem().zzps();
        zzbt zzbtVar = this.zzano;
        zzjn zzjnVar = zzbtVar.zzauc;
        zzafo zzafoVar = zzbtVar.zzaud;
        zzanh zzanhVar = this.f2719;
        zzanhVar.getClass();
        zzps.zza(zzjnVar, zzafoVar, (View) zzanhVar, zzanhVar);
        this.f2720 = false;
    }

    public final void zzdt() {
        this.f2720 = false;
        if (this.zzano.zzaud == null || this.f2719 == null) {
            zzakb.zzcu("Request to enable ActiveView before adState is available.");
        } else {
            zzbs.zzem().zzps().zzh(this.zzano.zzaud);
        }
    }

    public final C1493<String, zzqz> zzdu() {
        C1687.m3716("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.zzano.f2785;
    }

    public final void zzdv() {
        zzpe zzpeVar;
        zzanh zzanhVar = this.f2719;
        if (zzanhVar == null || zzanhVar.zzsg() == null || (zzpeVar = this.zzano.f2790) == null || zzpeVar.zzbvi == null) {
            return;
        }
        this.f2719.zzsg().zzb(this.zzano.f2790.zzbvi);
    }

    public final void zze(zzanh zzanhVar) {
        this.f2719 = zzanhVar;
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zzi(int i) {
        m1232();
        super.zzc(i, false);
    }

    public final void zzj(int i) {
        C1687.m3716("setMaxNumberOfAds must be called on the main UI thread.");
        this.f2717 = i;
    }

    @Override // com.google.android.gms.internal.zzot
    public final zzqw zzs(String str) {
        C1687.m3716("getOnCustomClickListener must be called on the main UI thread.");
        C1493<String, zzqw> c1493 = this.zzano.f2797;
        if (c1493 == null) {
            return null;
        }
        return c1493.getOrDefault(str, null);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzui m1231() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || !zzafoVar.zzcow) {
            return null;
        }
        return zzafoVar.zzcxl;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final void m1232() {
        zzzb zzdq = zzdq();
        if (zzdq != null) {
            zzdq.zzls();
        }
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m1233() {
        synchronized (this.f2716) {
            zzagf.v("Initializing webview native ads utills");
            zzbt zzbtVar = this.zzano;
            this.f2715 = new zzzf(zzbtVar.zzair, this, this.f2722, zzbtVar.f2780, zzbtVar.zzaty);
        }
    }
}
