package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzacg;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzafe;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzani;
import com.google.android.gms.internal.zzanr;
import com.google.android.gms.internal.zzapa;
import com.google.android.gms.internal.zzgp;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzuh;
import com.google.android.gms.internal.zzui;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.C2360;
import p131.p161.p162.p193.p194.p199.C2398;
import p131.p161.p162.p193.p194.p199.C2449;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzak extends zzi implements com.google.android.gms.ads.internal.gmsg.zzag, com.google.android.gms.ads.internal.gmsg.zzx {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public zzafe f2701;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f2702;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final String f2703;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public transient boolean f2704;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f2705;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public float f2706;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2707;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public String f2708;

    public zzak(Context context, zzjn zzjnVar, String str, zzux zzuxVar, zzakd zzakdVar, zzv zzvVar) {
        super(context, zzjnVar, str, zzuxVar, zzakdVar, zzvVar);
        this.f2707 = -1;
        this.f2704 = false;
        this.f2703 = (zzjnVar == null || !"reward_mb".equals(zzjnVar.zzbek)) ? "/Interstitial" : "/Rewarded";
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void setImmersiveMode(boolean z) {
        C1687.m3716("setImmersiveMode must be called on the main UI thread.");
        this.f2702 = z;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzks
    public final void showInterstitial() {
        Bitmap bitmap;
        C1687.m3716("showInterstitial must be called on the main UI thread.");
        if (zzbs.zzfd().zzt(this.zzano.zzair)) {
            String zzv = zzbs.zzfd().zzv(this.zzano.zzair);
            this.f2708 = zzv;
            String valueOf = String.valueOf(zzv);
            String valueOf2 = String.valueOf(this.f2703);
            this.f2708 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.zzano.zzaud == null) {
            zzakb.zzcu("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbmt)).booleanValue()) {
            String packageName = (this.zzano.zzair.getApplicationContext() != null ? this.zzano.zzair.getApplicationContext() : this.zzano.zzair).getPackageName();
            if (!this.f2704) {
                zzakb.zzcu("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                m1227(bundle);
            }
            zzbs.zzei();
            if (!zzahn.zzan(this.zzano.zzair)) {
                zzakb.zzcu("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                m1227(bundle2);
            }
        }
        if (this.zzano.zzfl()) {
            return;
        }
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar.zzcow && zzafoVar.zzcet != null) {
            try {
                if (((Boolean) zzkb.zzif().zzd(zznh.zzblo)).booleanValue()) {
                    this.zzano.zzaud.zzcet.setImmersiveMode(this.f2702);
                }
                this.zzano.zzaud.zzcet.showInterstitial();
                return;
            } catch (RemoteException e) {
                zzakb.zzc("Could not show interstitial.", e);
                zzdk();
                return;
            }
        }
        zzanh zzanhVar = zzafoVar.zzciy;
        if (zzanhVar == null) {
            zzakb.zzcu("The interstitial failed to load.");
            return;
        }
        if (zzanhVar.zztc()) {
            zzakb.zzcu("The interstitial is already showing.");
            return;
        }
        this.zzano.zzaud.zzciy.zzad(true);
        zzbt zzbtVar = this.zzano;
        Object obj = zzbtVar.zzaud.zzciy;
        obj.getClass();
        zzbtVar.m1237((View) obj);
        zzbt zzbtVar2 = this.zzano;
        zzafo zzafoVar2 = zzbtVar2.zzaud;
        if (zzafoVar2.zzcxj != null) {
            this.zzanq.zza(zzbtVar2.zzauc, zzafoVar2);
        }
        zzafo zzafoVar3 = this.zzano.zzaud;
        if (zzafoVar3.zzfv()) {
            Context context = this.zzano.zzair;
            Object obj2 = zzafoVar3.zzciy;
            obj2.getClass();
            new zzgp(context, (View) obj2).zza(zzafoVar3.zzciy);
        } else {
            zzafoVar3.zzciy.zzsz().zza(new C2360(this, zzafoVar3));
        }
        if (this.zzano.f2786) {
            zzbs.zzei();
            bitmap = zzahn.zzao(this.zzano.zzair);
        } else {
            bitmap = null;
        }
        this.f2707 = zzbs.zzfa().zzb(bitmap);
        if (((Boolean) zzkb.zzif().zzd(zznh.zzboc)).booleanValue() && bitmap != null) {
            new C2449(this, this.f2707).zzpy();
            return;
        }
        zzao zzaoVar = new zzao(this.zzano.f2786, m1226(), false, 0.0f, -1, this.f2702, this.zzano.zzaud.zzaqv);
        int requestedOrientation = this.zzano.zzaud.zzciy.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.zzano.zzaud.orientation;
        }
        zzbt zzbtVar3 = this.zzano;
        zzafo zzafoVar4 = zzbtVar3.zzaud;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, zzafoVar4.zzciy, requestedOrientation, zzbtVar3.zzaty, zzafoVar4.zzcpb, zzaoVar);
        zzbs.zzeg();
        zzl.zza(this.zzano.zzair, adOverlayInfoParcel, true);
    }

    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zza
    public final void zza(zzafp zzafpVar, zznu zznuVar) {
        zzafp zzafpVar2;
        if (!((Boolean) zzkb.zzif().zzd(zznh.zzblu)).booleanValue()) {
            super.zza(zzafpVar, zznuVar);
            return;
        }
        if (zzafpVar.errorCode != -2) {
            super.zza(zzafpVar, zznuVar);
            return;
        }
        boolean z = !zzafpVar.zzcxy.zzcow;
        if (zza.zza(zzafpVar.zzcqv.zzcnd) && z) {
            zzbt zzbtVar = this.zzano;
            try {
                String jSONObject = zzacg.zzb(zzafpVar.zzcxy).toString();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzafpVar.zzcqv.zzatw);
                zzuh zzuhVar = new zzuh(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L);
                zzaax zzaaxVar = zzafpVar.zzcxy;
                zzafpVar2 = new zzafp(zzafpVar.zzcqv, new zzaax(zzafpVar.zzcqv, zzaaxVar.zzcja, zzaaxVar.body, Collections.emptyList(), Collections.emptyList(), zzaaxVar.zzcov, true, zzaaxVar.zzcox, Collections.emptyList(), zzaaxVar.zzcdq, zzaaxVar.orientation, zzaaxVar.zzcoz, zzaaxVar.zzcpa, zzaaxVar.zzcpb, zzaaxVar.zzcpc, zzaaxVar.zzcpd, null, zzaaxVar.zzcpf, zzaaxVar.zzben, zzaaxVar.zzcnl, zzaaxVar.zzcpg, zzaaxVar.zzcph, zzaaxVar.zzcpk, zzaaxVar.zzbeo, zzaaxVar.zzbep, null, Collections.emptyList(), Collections.emptyList(), zzaaxVar.zzcpo, zzaaxVar.zzcpp, zzaaxVar.zzcnz, zzaaxVar.zzcoa, zzaaxVar.zzcdn, zzaaxVar.zzcdo, zzaaxVar.zzcpq, null, zzaaxVar.zzcps, zzaaxVar.zzcpt, zzaaxVar.zzcol, zzaaxVar.zzaqv, 0), new zzui(Collections.singletonList(zzuhVar), ((Long) zzkb.zzif().zzd(zznh.zzbnj)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaaxVar.zzcdn, zzaaxVar.zzcdo, "", -1L, 0, 1, null, 0, -1, -1L, false), zzafpVar.zzauc, zzafpVar.errorCode, zzafpVar.zzcxp, zzafpVar.zzcxq, null, zzafpVar.zzcxw, null);
            } catch (JSONException e) {
                zzakb.zzb("Unable to generate ad state for an interstitial ad with pooling.", e);
                zzafpVar2 = zzafpVar;
            }
            zzbtVar.zzaue = zzafpVar2;
        }
        super.zza(this.zzano.zzaue, zznuVar);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzx
    public final void zza(boolean z, float f) {
        this.f2705 = z;
        this.f2706 = f;
    }

    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzafo zzafoVar, zzafo zzafoVar2) {
        zzbt zzbtVar;
        View view;
        if (!super.zza(zzafoVar, zzafoVar2)) {
            return false;
        }
        if (this.zzano.zzfk() || (view = (zzbtVar = this.zzano).f2782) == null || zzafoVar2.zzcxj == null) {
            return true;
        }
        this.zzanq.zza(zzbtVar.zzauc, zzafoVar2, view);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.zzd
    public final boolean zza(zzjj zzjjVar, zzafo zzafoVar, boolean z) {
        if (this.zzano.zzfk() && zzafoVar.zzciy != null) {
            zzbs.zzek();
            zzaht.zzi(zzafoVar.zzciy);
        }
        return this.zzann.zzdx();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzjj zzjjVar, zznu zznuVar) {
        if (this.zzano.zzaud != null) {
            zzakb.zzcu("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.f2701 == null && zza.zza(zzjjVar) && zzbs.zzfd().zzt(this.zzano.zzair) && !TextUtils.isEmpty(this.zzano.zzatw)) {
            zzbt zzbtVar = this.zzano;
            this.f2701 = new zzafe(zzbtVar.zzair, zzbtVar.zzatw);
        }
        return super.zza(zzjjVar, zznuVar);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzag
    public final void zzb(zzaeq zzaeqVar) {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar != null) {
            if (zzafoVar.zzcpn != null) {
                zzbs.zzei();
                zzbt zzbtVar = this.zzano;
                zzahn.zza(zzbtVar.zzair, zzbtVar.zzaty.zzcv, zzbtVar.zzaud.zzcpn);
            }
            zzaeq zzaeqVar2 = this.zzano.zzaud.zzcpl;
            if (zzaeqVar2 != null) {
                zzaeqVar = zzaeqVar2;
            }
        }
        zza(zzaeqVar);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zzbv() {
        zzdk();
        super.zzbv();
    }

    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zza
    public final void zzby() {
        super.zzby();
        this.f2704 = true;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcg() {
        super.zzcg();
        this.zzanq.zzh(this.zzano.zzaud);
        zzafe zzafeVar = this.f2701;
        if (zzafeVar != null) {
            zzafeVar.zzu(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.overlay.zzn
    public final void zzch() {
        zzafo zzafoVar;
        zzanh zzanhVar;
        zzani zzsz;
        recordImpression();
        super.zzch();
        zzafo zzafoVar2 = this.zzano.zzaud;
        if (zzafoVar2 != null && (zzanhVar = zzafoVar2.zzciy) != null && (zzsz = zzanhVar.zzsz()) != null) {
            zzsz.zztt();
        }
        if (zzbs.zzfd().zzt(this.zzano.zzair) && (zzafoVar = this.zzano.zzaud) != null && zzafoVar.zzciy != null) {
            zzbs.zzfd().zzd(this.zzano.zzaud.zzciy.getContext(), this.f2708);
        }
        zzafe zzafeVar = this.f2701;
        if (zzafeVar != null) {
            zzafeVar.zzu(true);
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzx
    public final void zzd(boolean z) {
        this.zzano.f2786 = z;
    }

    public final void zzdk() {
        zzbs.zzfa().zzb(Integer.valueOf(this.f2707));
        if (this.zzano.zzfk()) {
            this.zzano.zzfi();
            zzbt zzbtVar = this.zzano;
            zzbtVar.zzaud = null;
            zzbtVar.f2786 = false;
            this.f2704 = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzag
    public final void zzdl() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar != null && zzafoVar.zzcxo != null) {
            zzbs.zzei();
            zzbt zzbtVar = this.zzano;
            zzahn.zza(zzbtVar.zzair, zzbtVar.zzaty.zzcv, zzbtVar.zzaud.zzcxo);
        }
        zzcb();
    }

    @Override // com.google.android.gms.ads.internal.zzi
    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzanh mo1225(zzafp zzafpVar, zzw zzwVar, zzafb zzafbVar) {
        zzanr zzej = zzbs.zzej();
        zzbt zzbtVar = this.zzano;
        Context context = zzbtVar.zzair;
        zzapa zzc = zzapa.zzc(zzbtVar.zzauc);
        zzbt zzbtVar2 = this.zzano;
        zzanh zza = zzej.zza(context, zzc, zzbtVar2.zzauc.zzbek, false, false, zzbtVar2.f2780, zzbtVar2.zzaty, this.zzanj, this, this.zzanr, zzafpVar.zzcxw);
        zza.zzsz().zza(this, null, this, this, ((Boolean) zzkb.zzif().zzd(zznh.zzbki)).booleanValue(), this, zzwVar, null, zzafbVar);
        zza.zza("/trackActiveViewUnit", new C2398(this));
        zza.zzda(zzafpVar.zzcqv.zzcnq);
        zza.zzsz().zza("/reward", new com.google.android.gms.ads.internal.gmsg.zzaf(this));
        return zza;
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final boolean m1226() {
        Window window;
        Context context = this.zzano.zzair;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final void m1227(Bundle bundle) {
        zzahn zzei = zzbs.zzei();
        zzbt zzbtVar = this.zzano;
        zzei.zzb(zzbtVar.zzair, zzbtVar.zzaty.zzcv, "gmob-apps", bundle, false);
    }
}
