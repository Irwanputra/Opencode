package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqi implements zzdpw<zzdvf> {
    private static void zza(zzdrk zzdrkVar) {
        if (zzdrkVar.zzbmp() < 12 || zzdrkVar.zzbmp() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzdpw
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdtx zza(zzfes zzfesVar) {
        try {
            zzdrg zzl = zzdrg.zzl(zzfesVar);
            if (!(zzl instanceof zzdrg)) {
                throw new GeneralSecurityException("expected AesCtrKey proto");
            }
            zzdvk.zzt(zzl.getVersion(), 0);
            zzdvk.zzgi(zzl.zzbmj().size());
            zza(zzl.zzbmi());
            return new zzdtx(zzl.zzbmj().toByteArray(), zzl.zzbmi().zzbmp());
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdvf zza(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdrg)) {
            throw new GeneralSecurityException("expected AesCtrKey proto");
        }
        zzdrg zzdrgVar = (zzdrg) zzfheVar;
        zzdvk.zzt(zzdrgVar.getVersion(), 0);
        zzdvk.zzgi(zzdrgVar.zzbmj().size());
        zza(zzdrgVar.zzbmi());
        return new zzdtx(zzdrgVar.zzbmj().toByteArray(), zzdrgVar.zzbmi().zzbmp());
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        try {
            return zzb(zzdri.zzn(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdri)) {
            throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
        }
        zzdri zzdriVar = (zzdri) zzfheVar;
        zzdvk.zzgi(zzdriVar.getKeySize());
        zza(zzdriVar.zzbmi());
        return zzdrg.zzbmk().zzc(zzdriVar.zzbmi()).zzm(zzfes.zzaz(zzdvi.zzgh(zzdriVar.getKeySize()))).zzfj(0).zzcxt();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.AesCtrKey").zzai(((zzdrg) zzb(zzfesVar)).toByteString()).zzb(zzdsy.zzb.SYMMETRIC).zzcxt();
    }
}
