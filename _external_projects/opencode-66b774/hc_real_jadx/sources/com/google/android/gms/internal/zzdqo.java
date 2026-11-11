package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqo implements zzdpw<zzdpp> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzdpw
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzdpp zza(zzfes zzfesVar) {
        try {
            zzdtp zzal = zzdtp.zzal(zzfesVar);
            if (!(zzal instanceof zzdtp)) {
                throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
            }
            zzdvk.zzt(zzal.getVersion(), 0);
            String zzbqb = zzal.zzbpy().zzbqb();
            return new zzdqn(zzal.zzbpy().zzbqc(), zzdpz.zzof(zzbqb).zzoe(zzbqb));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpp zza(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdtp)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        }
        zzdtp zzdtpVar = (zzdtp) zzfheVar;
        zzdvk.zzt(zzdtpVar.getVersion(), 0);
        String zzbqb = zzdtpVar.zzbpy().zzbqb();
        return new zzdqn(zzdtpVar.zzbpy().zzbqc(), zzdpz.zzof(zzbqb).zzoe(zzbqb));
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        try {
            return zzb(zzdtr.zzam(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdtr)) {
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
        }
        return zzdtp.zzbpz().zzb((zzdtr) zzfheVar).zzgc(0).zzcxt();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zzai(((zzdtp) zzb(zzfesVar)).toByteString()).zzb(zzdsy.zzb.REMOTE).zzcxt();
    }
}
