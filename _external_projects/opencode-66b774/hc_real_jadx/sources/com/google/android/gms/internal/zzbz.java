package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbz {
    public static zzdpv zzzb;

    public static boolean zzab() {
        zzdpv zza;
        if (zzzb != null) {
            return true;
        }
        String str = (String) zzkb.zzif().zzd(zznh.zzbnt);
        if (str.length() == 0) {
            return false;
        }
        try {
            zzdpx zzad = zzdqb.zzad(zzbu.zza(str, true));
            for (zzdtf zzdtfVar : zzdqs.zzlta.zzbqf()) {
                if (zzdtfVar.zzbon().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (zzdtfVar.zzbov().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (zzdtfVar.zzboy().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                zzdqe.zza(zzdtfVar.zzbon(), zzdqe.zzog(zzdtfVar.zzboy()).zzd(zzdtfVar.zzbon(), zzdtfVar.zzbov(), zzdtfVar.zzbow()), zzdtfVar.zzbox());
            }
            zza = zzdqt.zza(zzad);
            zzzb = zza;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return zza != null;
    }
}
