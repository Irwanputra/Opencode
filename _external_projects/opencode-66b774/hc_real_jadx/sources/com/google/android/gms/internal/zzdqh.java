package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzdqh implements zzdpw<zzdpp> {
    private static final Logger logger = Logger.getLogger(zzdqh.class.getName());

    public zzdqh() {
        zzdqe.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", new zzdqi());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzdpw
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzdpp zza(zzfes zzfesVar) {
        try {
            zzdrc zzi = zzdrc.zzi(zzfesVar);
            if (!(zzi instanceof zzdrc)) {
                throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
            }
            zzdvk.zzt(zzi.getVersion(), 0);
            return new zzdut((zzdvf) zzdqe.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", zzi.zzbmb()), (zzdqa) zzdqe.zzb("type.googleapis.com/google.crypto.tink.HmacKey", zzi.zzbmc()), zzi.zzbmc().zzbod().zzbok());
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpp zza(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdrc)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        }
        zzdrc zzdrcVar = (zzdrc) zzfheVar;
        zzdvk.zzt(zzdrcVar.getVersion(), 0);
        return new zzdut((zzdvf) zzdqe.zzb("type.googleapis.com/google.crypto.tink.AesCtrKey", zzdrcVar.zzbmb()), (zzdqa) zzdqe.zzb("type.googleapis.com/google.crypto.tink.HmacKey", zzdrcVar.zzbmc()), zzdrcVar.zzbmc().zzbod().zzbok());
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        try {
            return zzb(zzdre.zzj(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdre)) {
            throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
        }
        zzdre zzdreVar = (zzdre) zzfheVar;
        zzdrg zzdrgVar = (zzdrg) zzdqe.zza("type.googleapis.com/google.crypto.tink.AesCtrKey", zzdreVar.zzbmf());
        return zzdrc.zzbmd().zzb(zzdrgVar).zzb((zzdss) zzdqe.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzdreVar.zzbmg())).zzfi(0).zzcxt();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zzai(((zzdrc) zzb(zzfesVar)).toByteString()).zzb(zzdsy.zzb.SYMMETRIC).zzcxt();
    }
}
