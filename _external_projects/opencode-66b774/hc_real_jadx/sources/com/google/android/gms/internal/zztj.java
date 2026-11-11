package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import p131.p161.p162.p193.p205.p209.C2510;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zztj {
    public com.google.android.gms.ads.internal.zzak zzbzx;
    public zzjj zzbzy;
    public zzse zzbzz;
    public long zzcaa;
    public boolean zzcab;
    public boolean zzcac;
    private /* synthetic */ zzti zzcad;

    public zztj(zzti zztiVar, zzsd zzsdVar) {
        String str;
        this.zzcad = zztiVar;
        str = zztiVar.zzapq;
        this.zzbzx = zzsdVar.zzaw(str);
        zzse zzseVar = new zzse();
        this.zzbzz = zzseVar;
        com.google.android.gms.ads.internal.zzak zzakVar = this.zzbzx;
        zzakVar.zza(new zzsf(zzseVar));
        zzakVar.zza(new zzsn(zzseVar));
        zzakVar.zza(new zzsp(zzseVar));
        zzakVar.zza(new zzsr(zzseVar));
        zzakVar.zza(new zzst(zzseVar));
    }

    public zztj(zzti zztiVar, zzsd zzsdVar, zzjj zzjjVar) {
        this(zztiVar, zzsdVar);
        this.zzbzy = zzjjVar;
    }

    public final boolean load() {
        if (this.zzcab) {
            return false;
        }
        zzjj zzjjVar = this.zzbzy;
        if (zzjjVar == null) {
            zzjjVar = this.zzcad.zzbzu;
        }
        this.zzcac = this.zzbzx.zzb(zztg.zzj(zzjjVar));
        this.zzcab = true;
        ((C2510) zzbs.zzeo()).getClass();
        this.zzcaa = System.currentTimeMillis();
        return true;
    }
}
