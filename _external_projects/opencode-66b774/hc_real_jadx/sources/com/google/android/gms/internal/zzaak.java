package com.google.android.gms.internal;

import android.content.Context;
import p034.p095.C1687;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaak implements zzaam {
    private /* synthetic */ Context val$context;

    public zzaak(Context context) {
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.zzaam
    public final boolean zza(zzakd zzakdVar) {
        boolean zzd;
        zzkb.zzia();
        boolean zzbe = zzajr.zzbe(this.val$context);
        boolean z = ((Boolean) zzkb.zzif().zzd(zznh.zzbrg)).booleanValue() && zzakdVar.zzdel;
        zzd = zzaaj.zzd(this.val$context, zzakdVar.zzdel);
        if (zzd && zzbe && !z) {
            if (C1687.m3658(this.val$context)) {
                if (!((Boolean) zzkb.zzif().zzd(zznh.zzbjg)).booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }
}
