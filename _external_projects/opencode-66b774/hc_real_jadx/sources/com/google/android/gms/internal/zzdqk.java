package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqk implements zzdpw<zzdpp> {
    private static zzdpp zzd(zzfes zzfesVar) {
        try {
            return new zzdtz(zzdrs.zzr(zzfesVar).zzbmj().toByteArray());
        } catch (zzfge unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpp zza(zzfes zzfesVar) {
        return zzd(zzfesVar);
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpp zza(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdrs)) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
        zzdrs zzdrsVar = (zzdrs) zzfheVar;
        zzdvk.zzt(zzdrsVar.getVersion(), 0);
        zzdvk.zzgi(zzdrsVar.zzbmj().size());
        return new zzdtz(zzdrsVar.zzbmj().toByteArray());
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        try {
            return zzb(zzdru.zzt(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdru)) {
            throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
        }
        zzdru zzdruVar = (zzdru) zzfheVar;
        zzdvk.zzgi(zzdruVar.getKeySize());
        return zzdrs.zzbmy().zzs(zzfes.zzaz(zzdvi.zzgh(zzdruVar.getKeySize()))).zzb(zzdruVar.zzbna()).zzfl(0).zzcxt();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.AesGcmKey").zzai(((zzdrs) zzb(zzfesVar)).toByteString()).zzb(zzdsy.zzb.SYMMETRIC).zzcxt();
    }
}
