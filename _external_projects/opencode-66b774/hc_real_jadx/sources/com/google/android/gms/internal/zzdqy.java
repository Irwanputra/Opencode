package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqy implements zzdpw<zzdqa> {
    private static void zza(zzdsw zzdswVar) {
        if (zzdswVar.zzbok() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = zzdqz.zzltf[zzdswVar.zzboj().ordinal()];
        if (i == 1) {
            if (zzdswVar.zzbok() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (zzdswVar.zzbok() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzdswVar.zzbok() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzdpw
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzdqa zza(zzfes zzfesVar) {
        try {
            zzdss zzae = zzdss.zzae(zzfesVar);
            if (!(zzae instanceof zzdss)) {
                throw new GeneralSecurityException("expected HmacKey proto");
            }
            zzdvk.zzt(zzae.getVersion(), 0);
            if (zzae.zzbmj().size() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            zza(zzae.zzbod());
            zzdsq zzboj = zzae.zzbod().zzboj();
            SecretKeySpec secretKeySpec = new SecretKeySpec(zzae.zzbmj().toByteArray(), "HMAC");
            int zzbok = zzae.zzbod().zzbok();
            int i = zzdqz.zzltf[zzboj.ordinal()];
            if (i == 1) {
                return new zzdvg("HMACSHA1", secretKeySpec, zzbok);
            }
            if (i == 2) {
                return new zzdvg("HMACSHA256", secretKeySpec, zzbok);
            }
            if (i == 3) {
                return new zzdvg("HMACSHA512", secretKeySpec, zzbok);
            }
            throw new GeneralSecurityException("unknown hash");
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdqa zza(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdss)) {
            throw new GeneralSecurityException("expected HmacKey proto");
        }
        zzdss zzdssVar = (zzdss) zzfheVar;
        zzdvk.zzt(zzdssVar.getVersion(), 0);
        if (zzdssVar.zzbmj().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zza(zzdssVar.zzbod());
        zzdsq zzboj = zzdssVar.zzbod().zzboj();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzdssVar.zzbmj().toByteArray(), "HMAC");
        int zzbok = zzdssVar.zzbod().zzbok();
        int i = zzdqz.zzltf[zzboj.ordinal()];
        if (i == 1) {
            return new zzdvg("HMACSHA1", secretKeySpec, zzbok);
        }
        if (i == 2) {
            return new zzdvg("HMACSHA256", secretKeySpec, zzbok);
        }
        if (i == 3) {
            return new zzdvg("HMACSHA512", secretKeySpec, zzbok);
        }
        throw new GeneralSecurityException("unknown hash");
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        try {
            return zzb(zzdsu.zzag(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdsu)) {
            throw new GeneralSecurityException("expected HmacKeyFormat proto");
        }
        zzdsu zzdsuVar = (zzdsu) zzfheVar;
        if (zzdsuVar.getKeySize() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zza(zzdsuVar.zzbod());
        return zzdss.zzboe().zzfs(0).zzc(zzdsuVar.zzbod()).zzaf(zzfes.zzaz(zzdvi.zzgh(zzdsuVar.getKeySize()))).zzcxt();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.HmacKey").zzai(((zzdss) zzb(zzfesVar)).toByteString()).zzb(zzdsy.zzb.SYMMETRIC).zzcxt();
    }
}
