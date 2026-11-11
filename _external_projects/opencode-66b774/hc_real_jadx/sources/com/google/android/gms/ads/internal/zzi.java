package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzafc;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanr;
import com.google.android.gms.internal.zzapa;
import com.google.android.gms.internal.zzfs;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzxc;
import com.google.android.gms.internal.zzya;
import com.google.android.gms.internal.zzzv;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.C2398;
import p131.p161.p162.p193.p194.p199.RunnableC2385;
import p131.p161.p162.p193.p194.p199.RunnableC2392;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzi extends zzd implements zzae, zzxc {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f2801;

    public zzi(Context context, zzjn zzjnVar, String str, zzux zzuxVar, zzakd zzakdVar, zzv zzvVar) {
        super(context, zzjnVar, str, zzuxVar, zzakdVar, zzvVar);
    }

    @Override // com.google.android.gms.internal.zzxc
    public final void zza(int i, int i2, int i3, int i4) {
        zzbx();
    }

    @Override // com.google.android.gms.ads.internal.zza
    public void zza(zzafp zzafpVar, zznu zznuVar) {
        if (zzafpVar.errorCode != -2) {
            zzahn.zzdaw.post(new RunnableC2385(this, zzafpVar));
            return;
        }
        zzjn zzjnVar = zzafpVar.zzauc;
        if (zzjnVar != null) {
            this.zzano.zzauc = zzjnVar;
        }
        zzaax zzaaxVar = zzafpVar.zzcxy;
        if (!zzaaxVar.zzcow || zzaaxVar.zzbep) {
            zzafc zzafcVar = this.zzanr.zzaon;
            zzbt zzbtVar = this.zzano;
            zzahn.zzdaw.post(new RunnableC2392(this, zzafpVar, zzafcVar.zza(zzbtVar.zzair, zzbtVar.zzaty, zzaaxVar), zznuVar));
            return;
        }
        zzbt zzbtVar2 = this.zzano;
        zzbtVar2.zzauz = 0;
        zzbs.zzeh();
        zzbt zzbtVar3 = this.zzano;
        zzbtVar2.zzaub = zzya.zza(zzbtVar3.zzair, this, zzafpVar, zzbtVar3.f2780, null, this.zzanw, this, zznuVar);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void zza(zzoa zzoaVar) {
        C1687.m3716("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzano.f2783 = zzoaVar;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public boolean zza(zzafo zzafoVar, zzafo zzafoVar2) {
        boolean z;
        zzbu zzbuVar;
        if (this.zzano.zzfk() && (zzbuVar = this.zzano.f2793) != null) {
            zzbuVar.zzfn().zzcm(zzafoVar2.zzcpb);
        }
        try {
            if (zzafoVar2.zzciy != null && !zzafoVar2.zzcow && zzafoVar2.zzcxx) {
                if (((Boolean) zzkb.zzif().zzd(zznh.zzbrw)).booleanValue()) {
                    String str = zzafoVar2.zzcnd.zzbdt;
                    if (str != null && !"com.google.ads.mediation.AbstractAdViewAdapter".equals(str)) {
                        z = false;
                        if (z && !zzafoVar2.zzcnd.extras.containsKey("sdk_less_server_data")) {
                            try {
                                zzafoVar2.zzciy.zztl();
                            } catch (Throwable unused) {
                                zzagf.v("Could not render test Ad label.");
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        zzafoVar2.zzciy.zztl();
                    }
                }
            }
        } catch (RuntimeException unused2) {
            zzagf.v("Could not render test AdLabel.");
        }
        return super.zza(zzafoVar, zzafoVar2);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public void zzby() {
        super.zzby();
        if (this.f2801) {
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbow)).booleanValue()) {
                m1239(this.zzano.zzaud.zzciy);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzae
    public final void zzcs() {
        onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzae
    public final void zzct() {
        recordImpression();
        zzbu();
    }

    @Override // com.google.android.gms.internal.zzxc
    public final void zzcu() {
        zzbv();
    }

    @Override // com.google.android.gms.ads.internal.zzae
    public final void zzh(View view) {
        zzbt zzbtVar = this.zzano;
        zzbtVar.f2782 = view;
        zzb(new zzafo(zzbtVar.zzaue, null, null, null, null, null, null, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: 〺つふすそ */
    public zzanh mo1225(zzafp zzafpVar, zzw zzwVar, zzafb zzafbVar) {
        View nextView = this.zzano.f2793.getNextView();
        if (nextView instanceof zzanh) {
            ((zzanh) nextView).destroy();
        }
        if (nextView != 0) {
            this.zzano.f2793.removeView(nextView);
        }
        zzanr zzej = zzbs.zzej();
        zzbt zzbtVar = this.zzano;
        Context context = zzbtVar.zzair;
        zzapa zzc = zzapa.zzc(zzbtVar.zzauc);
        zzbt zzbtVar2 = this.zzano;
        zzanh zza = zzej.zza(context, zzc, zzbtVar2.zzauc.zzbek, false, false, zzbtVar2.f2780, zzbtVar2.zzaty, this.zzanj, this, this.zzanr, zzafpVar.zzcxw);
        if (this.zzano.zzauc.zzbem == null) {
            zza.getClass();
            zzg((View) zza);
        }
        zza.zzsz().zza(this, this, this, this, false, null, zzwVar, this, zzafbVar);
        zza.zza("/trackActiveViewUnit", new C2398(this));
        zza.zzda(zzafpVar.zzcqv.zzcnq);
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m1239(zzanh zzanhVar) {
        zzbt zzbtVar = this.zzano;
        zzafo zzafoVar = zzbtVar.zzaud;
        if (zzafoVar == null) {
            this.f2801 = true;
            zzakb.zzcu("Request to enable ActiveView before adState is available.");
            return;
        }
        zzfs zzfsVar = this.zzanq;
        zzjn zzjnVar = zzbtVar.zzauc;
        zzanhVar.getClass();
        zzfsVar.zza(zzjnVar, zzafoVar, (View) zzanhVar, zzanhVar);
        this.f2801 = false;
    }
}
