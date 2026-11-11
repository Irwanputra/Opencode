package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqv {
    public static zzdur zza(zzdso zzdsoVar) {
        int i = zzdqw.zzltg[zzdsoVar.ordinal()];
        if (i == 1) {
            return zzdur.NIST_P256;
        }
        if (i == 2) {
            return zzdur.NIST_P384;
        }
        if (i == 3) {
            return zzdur.NIST_P521;
        }
        String valueOf = String.valueOf(zzdsoVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 20);
        sb.append("unknown curve type: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static zzdus zza(zzdsa zzdsaVar) {
        int i = zzdqw.zzlth[zzdsaVar.ordinal()];
        if (i == 1) {
            return zzdus.UNCOMPRESSED;
        }
        if (i == 2) {
            return zzdus.COMPRESSED;
        }
        String valueOf = String.valueOf(zzdsaVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("unknown point format: ");
        sb.append(valueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String zza(zzdsq zzdsqVar) {
        int i = zzdqw.zzltf[zzdsqVar.ordinal()];
        if (i == 1) {
            return "HmacSha1";
        }
        if (i == 2) {
            return "HmacSha256";
        }
        if (i == 3) {
            return "HmacSha512";
        }
        String valueOf = String.valueOf(zzdsqVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(valueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void zza(zzdsg zzdsgVar) {
        zzdup.zza(zza(zzdsgVar.zzbnl().zzbny()));
        zza(zzdsgVar.zzbnl().zzbnz());
        if (zzdsgVar.zzbnn() == zzdsa.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzdqe.zza(zzdsgVar.zzbnm().zzbng());
    }
}
