package com.google.android.gms.internal;

import android.content.Context;
import p034.p095.C1687;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzya {
    public static zzaif zza(Context context, com.google.android.gms.ads.internal.zza zzaVar, zzafp zzafpVar, zzcv zzcvVar, zzanh zzanhVar, zzux zzuxVar, zzyb zzybVar, zznu zznuVar) {
        zzaif zzyiVar;
        zzaax zzaaxVar = zzafpVar.zzcxy;
        if (zzaaxVar.zzcow) {
            zzyiVar = new zzyg(context, zzafpVar, zzuxVar, zzybVar, zznuVar, zzanhVar);
        } else {
            boolean z = zzaaxVar.zzben;
            if (z || (zzaVar instanceof com.google.android.gms.ads.internal.zzba)) {
                zzyiVar = (z && (zzaVar instanceof com.google.android.gms.ads.internal.zzba)) ? new zzyi(context, (com.google.android.gms.ads.internal.zzba) zzaVar, zzafpVar, zzcvVar, zzybVar, zznuVar) : new zzyd(zzafpVar, zzybVar);
            } else {
                zzyiVar = (((Boolean) zzkb.zzif().zzd(zznh.zzbkh)).booleanValue() && C1687.m3665() && !C1687.m3651() && zzanhVar != null && zzanhVar.zzsx().zzuh()) ? new zzyf(context, zzafpVar, zzanhVar, zzybVar) : new zzyc(context, zzafpVar, zzanhVar, zzybVar);
            }
        }
        String name = zzyiVar.getClass().getName();
        zzakb.zzbx(name.length() != 0 ? "AdRenderer: ".concat(name) : new String("AdRenderer: "));
        zzyiVar.zznd();
        return zzyiVar;
    }
}
