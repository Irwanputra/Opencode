package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import java.util.concurrent.atomic.AtomicBoolean;
import p034.p095.C1687;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzxu implements zzaif<Void>, zzanm {
    public final Context mContext;
    public final zzanh zzbyk;
    private zzyb zzcjj;
    private zzafp zzcjk;
    public zzaax zzcjl;
    private Runnable zzcjm;
    private Object zzcjn = new Object();
    private AtomicBoolean zzcjo = new AtomicBoolean(true);

    public zzxu(Context context, zzafp zzafpVar, zzanh zzanhVar, zzyb zzybVar) {
        this.mContext = context;
        this.zzcjk = zzafpVar;
        this.zzcjl = zzafpVar.zzcxy;
        this.zzbyk = zzanhVar;
        this.zzcjj = zzybVar;
    }

    @Override // com.google.android.gms.internal.zzaif
    public void cancel() {
        if (this.zzcjo.getAndSet(false)) {
            this.zzbyk.stopLoading();
            zzbs.zzek();
            zzaht.zzi(this.zzbyk);
            zzx(-1);
            zzahn.zzdaw.removeCallbacks(this.zzcjm);
        }
    }

    @Override // com.google.android.gms.internal.zzanm
    public final void zza(zzanh zzanhVar, boolean z) {
        zzakb.zzbx("WebView finished loading.");
        if (this.zzcjo.getAndSet(false)) {
            zzx(z ? -2 : 0);
            zzahn.zzdaw.removeCallbacks(this.zzcjm);
        }
    }

    public abstract void zznc();

    @Override // com.google.android.gms.internal.zzaif
    public final /* synthetic */ Void zznd() {
        C1687.m3716("Webview render task needs to be called on UI thread.");
        zzxv zzxvVar = new zzxv(this);
        this.zzcjm = zzxvVar;
        zzahn.zzdaw.postDelayed(zzxvVar, ((Long) zzkb.zzif().zzd(zznh.zzbnj)).longValue());
        zznc();
        return null;
    }

    public void zzx(int i) {
        if (i != -2) {
            this.zzcjl = new zzaax(i, this.zzcjl.zzcdq);
        }
        this.zzbyk.zzst();
        zzyb zzybVar = this.zzcjj;
        zzafp zzafpVar = this.zzcjk;
        zzaat zzaatVar = zzafpVar.zzcqv;
        zzjj zzjjVar = zzaatVar.zzcnd;
        zzanh zzanhVar = this.zzbyk;
        zzaax zzaaxVar = this.zzcjl;
        zzybVar.zzb(new zzafo(zzjjVar, zzanhVar, zzaaxVar.zzcdk, i, zzaaxVar.zzcdl, zzaaxVar.zzcoy, zzaaxVar.orientation, zzaaxVar.zzcdq, zzaatVar.zzcng, zzaaxVar.zzcow, null, null, null, null, null, zzaaxVar.zzcox, zzafpVar.zzauc, zzaaxVar.zzcov, zzafpVar.zzcxp, zzaaxVar.zzcpa, zzaaxVar.zzcpb, zzafpVar.zzcxj, null, zzaaxVar.zzcpl, zzaaxVar.zzcpm, zzaaxVar.zzcpn, zzaaxVar.zzcpo, zzaaxVar.zzcpp, null, zzaaxVar.zzcdn, zzaaxVar.zzcps, zzafpVar.zzcxw, zzafpVar.zzcxy.zzaqv, zzafpVar.zzcxx));
    }
}
