package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqm implements zzdpw<zzdpp> {
    private static zzdpp zzc(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdtl)) {
            throw new GeneralSecurityException("expected KmsAeadKey proto");
        }
        zzdtl zzdtlVar = (zzdtl) zzfheVar;
        zzdvk.zzt(zzdtlVar.getVersion(), 0);
        String zzbpv = zzdtlVar.zzbps().zzbpv();
        return zzdpz.zzof(zzbpv).zzoe(zzbpv);
    }

    private static zzdpp zzd(zzfes zzfesVar) {
        try {
            return zzc(zzdtl.zzaj(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpp zza(zzfes zzfesVar) {
        return zzd(zzfesVar);
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpp zza(zzfhe zzfheVar) {
        return zzc(zzfheVar);
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        try {
            return zzb(zzdtn.zzak(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdtn)) {
            throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
        }
        return zzdtl.zzbpt().zzb((zzdtn) zzfheVar).zzgb(0).zzcxt();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.KmsAeadKey").zzai(((zzdtl) zzb(zzfesVar)).toByteString()).zzb(zzdsy.zzb.REMOTE).zzcxt();
    }
}
