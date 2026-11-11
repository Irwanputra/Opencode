package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzapa;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzzv;
import java.util.Map;
import org.json.JSONObject;
import p131.p161.p162.p193.p194.p199.p200.C2361;
import p131.p161.p162.p193.p194.p199.p200.C2378;
import p131.p161.p162.p193.p194.p199.p200.C2382;
import p131.p161.p162.p193.p194.p199.p200.RunnableC2365;
import p131.p161.p162.p193.p194.p199.p200.RunnableC2375;
import p131.p161.p162.p193.p194.p199.p200.RunnableC2383;
import p131.p161.p162.p193.p194.p199.p200.RunnableC2384;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zze implements zzc {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzanh f2624;

    /* JADX WARN: Multi-variable type inference failed */
    public zze(Context context, zzakd zzakdVar, zzcv zzcvVar, zzv zzvVar) {
        zzanh zza = zzbs.zzej().zza(context, zzapa.zzuf(), "", false, false, zzcvVar, zzakdVar, null, null, null, zzis.zzhl());
        this.f2624 = zza;
        zza.getClass();
        ((View) zza).setWillNotDraw(true);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m1211(Runnable runnable) {
        zzkb.zzia();
        if (zzajr.zzqz()) {
            runnable.run();
        } else {
            zzahn.zzdaw.post(runnable);
        }
    }

    @Override // com.google.android.gms.ads.internal.js.zzc
    public final void destroy() {
        this.f2624.destroy();
    }

    @Override // com.google.android.gms.ads.internal.js.zzc
    public final void zza(zzd zzdVar) {
        this.f2624.zzsz().zza(new C2378(zzdVar));
    }

    @Override // com.google.android.gms.ads.internal.js.zzaj
    public final void zza(String str, zzt<? super zzaj> zztVar) {
        this.f2624.zzsz().zza(str, new C2382(this, zztVar));
    }

    @Override // com.google.android.gms.ads.internal.js.zza
    public final void zza(String str, Map<String, ?> map) {
        this.f2624.zza(str, map);
    }

    @Override // com.google.android.gms.ads.internal.js.zza
    public final void zza(String str, JSONObject jSONObject) {
        this.f2624.zza(str, jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.js.zzaj
    public final void zzb(String str, zzt<? super zzaj> zztVar) {
        this.f2624.zzsz().zza(str, new C2361(zztVar));
    }

    @Override // com.google.android.gms.ads.internal.js.zzm
    public final void zzb(String str, JSONObject jSONObject) {
        m1211(new RunnableC2383(this, str, jSONObject));
    }

    @Override // com.google.android.gms.ads.internal.js.zzc
    public final void zzbb(String str) {
        m1211(new RunnableC2365(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str)));
    }

    @Override // com.google.android.gms.ads.internal.js.zzc
    public final void zzbc(String str) {
        m1211(new RunnableC2375(this, str));
    }

    @Override // com.google.android.gms.ads.internal.js.zzc
    public final void zzbd(String str) {
        m1211(new RunnableC2384(this, str));
    }

    @Override // com.google.android.gms.ads.internal.js.zzc
    public final zzak zzln() {
        return new zzal(this);
    }
}
