package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdql implements zzdpw<zzdpp> {
    private static zzdry zzblz() {
        return zzdry.zzbne().zzfm(0).zzv(zzfes.zzaz(zzdvi.zzgh(32))).zzcxt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzdpw
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzdpp zza(zzfes zzfesVar) {
        try {
            zzdry zzu = zzdry.zzu(zzfesVar);
            if (!(zzu instanceof zzdry)) {
                throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
            }
            zzdvk.zzt(zzu.getVersion(), 0);
            if (zzu.zzbmj().size() == 32) {
                return zzdug.zzak(zzu.zzbmj().toByteArray());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        } catch (zzfge e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpp zza(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdry)) {
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        }
        zzdry zzdryVar = (zzdry) zzfheVar;
        zzdvk.zzt(zzdryVar.getVersion(), 0);
        if (zzdryVar.zzbmj().size() == 32) {
            return zzdug.zzak(zzdryVar.zzbmj().toByteArray());
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        return zzblz();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        return zzblz();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zzai(zzblz().toByteString()).zzb(zzdsy.zzb.SYMMETRIC).zzcxt();
    }
}
