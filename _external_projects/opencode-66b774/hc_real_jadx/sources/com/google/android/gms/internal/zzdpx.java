package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdth;
import com.google.android.gms.internal.zzdtj;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdpx {
    private zzdth zzlsp;

    private zzdpx(zzdth zzdthVar) {
        this.zzlsp = zzdthVar;
    }

    public static final zzdpx zza(zzdth zzdthVar) {
        if (zzdthVar == null || zzdthVar.zzbpe() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzdpx(zzdthVar);
    }

    public final String toString() {
        zzdth zzdthVar = this.zzlsp;
        zzdtj.zza zzfy = zzdtj.zzbpn().zzfy(zzdthVar.zzbpc());
        for (zzdth.zzb zzbVar : zzdthVar.zzbpd()) {
            zzfy.zzb(zzdtj.zzb.zzbpp().zzop(zzbVar.zzbph().zzbon()).zzb(zzbVar.zzbpi()).zzb(zzbVar.zzbpk()).zzga(zzbVar.zzbpj()).zzcxt());
        }
        return zzfy.zzcxt().toString();
    }

    public final zzdth zzblu() {
        return this.zzlsp;
    }
}
