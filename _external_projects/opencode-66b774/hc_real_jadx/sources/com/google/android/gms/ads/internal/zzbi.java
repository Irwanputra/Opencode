package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzzv;
import java.lang.ref.WeakReference;
import p131.p161.p162.p193.p194.p199.RunnableC2391;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbi {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Runnable f2723;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public zzjj f2724;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzbk f2725;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f2726;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public long f2727;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f2728;

    public zzbi(zza zzaVar) {
        zzbk zzbkVar = new zzbk(zzahn.zzdaw);
        this.f2728 = false;
        this.f2726 = false;
        this.f2727 = 0L;
        this.f2725 = zzbkVar;
        this.f2723 = new RunnableC2391(this, new WeakReference(zzaVar));
    }

    public final void cancel() {
        this.f2728 = false;
        this.f2725.removeCallbacks(this.f2723);
    }

    public final void pause() {
        this.f2726 = true;
        if (this.f2728) {
            this.f2725.removeCallbacks(this.f2723);
        }
    }

    public final void resume() {
        this.f2726 = false;
        if (this.f2728) {
            this.f2728 = false;
            zza(this.f2724, this.f2727);
        }
    }

    public final void zza(zzjj zzjjVar, long j) {
        if (this.f2728) {
            zzakb.zzcu("An ad refresh is already scheduled.");
            return;
        }
        this.f2724 = zzjjVar;
        this.f2728 = true;
        this.f2727 = j;
        if (this.f2726) {
            return;
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Scheduling ad refresh ");
        sb.append(j);
        sb.append(" milliseconds from now.");
        zzakb.zzct(sb.toString());
        this.f2725.postDelayed(this.f2723, j);
    }

    public final boolean zzdx() {
        return this.f2728;
    }

    public final void zzf(zzjj zzjjVar) {
        this.f2724 = zzjjVar;
    }

    public final void zzg(zzjj zzjjVar) {
        zza(zzjjVar, 60000L);
    }
}
