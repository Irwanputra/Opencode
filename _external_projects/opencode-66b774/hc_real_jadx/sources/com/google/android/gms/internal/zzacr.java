package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import p131.p161.p162.p193.p205.p209.C2510;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzacr implements Callable<zzaco> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzacq zzcul;

    public zzacr(zzacq zzacqVar, Context context) {
        this.zzcul = zzacqVar;
        this.val$context = context;
    }

    @Override // java.util.concurrent.Callable
    public final zzaco call() {
        WeakHashMap weakHashMap;
        zzaco zzny;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzcul.zzcuk;
        zzacs zzacsVar = (zzacs) weakHashMap.get(this.val$context);
        if (zzacsVar != null) {
            long longValue = ((Long) zzkb.zzif().zzd(zznh.zzbms)).longValue() + zzacsVar.zzcum;
            ((C2510) zzbs.zzeo()).getClass();
            if (!(longValue < System.currentTimeMillis())) {
                if (((Boolean) zzkb.zzif().zzd(zznh.zzbmr)).booleanValue()) {
                    zzny = new zzacp(this.val$context, zzacsVar.zzcun).zzny();
                    weakHashMap2 = this.zzcul.zzcuk;
                    weakHashMap2.put(this.val$context, new zzacs(this.zzcul, zzny));
                    return zzny;
                }
            }
        }
        zzny = new zzacp(this.val$context).zzny();
        weakHashMap2 = this.zzcul.zzcuk;
        weakHashMap2.put(this.val$context, new zzacs(this.zzcul, zzny));
        return zzny;
    }
}
