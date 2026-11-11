package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrg;
import com.google.android.gms.internal.zzdrs;
import com.google.android.gms.internal.zzdss;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqx implements zzduj {
    private final String zzlti;
    private final int zzltj;
    private zzdrs zzltk;
    private zzdrc zzltl;
    private int zzltm;

    public zzdqx(zzdtd zzdtdVar) {
        String zzbon = zzdtdVar.zzbon();
        this.zzlti = zzbon;
        if (zzbon.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzdru zzt = zzdru.zzt(zzdtdVar.zzboo());
                this.zzltk = (zzdrs) zzdqe.zzb(zzdtdVar);
                this.zzltj = zzt.getKeySize();
                return;
            } catch (zzfge e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (!zzbon.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            String valueOf = String.valueOf(zzbon);
            throw new GeneralSecurityException(valueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(valueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            zzdre zzj = zzdre.zzj(zzdtdVar.zzboo());
            this.zzltl = (zzdrc) zzdqe.zzb(zzdtdVar);
            this.zzltm = zzj.zzbmf().getKeySize();
            this.zzltj = this.zzltm + zzj.zzbmg().getKeySize();
        } catch (zzfge e2) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
        }
    }

    @Override // com.google.android.gms.internal.zzduj
    public final zzdpp zzae(byte[] bArr) {
        zzdrc zzcxt;
        if (this.zzlti.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            zzcxt = zzdrs.zzbmy().zza((zzdrs.zza) this.zzltk).zzs(zzfes.zzaz(bArr)).zzcxt();
        } else {
            if (!this.zzlti.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zzltm);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zzltm, this.zzltj);
            zzdrg zzcxt2 = zzdrg.zzbmk().zza((zzdrg.zza) this.zzltl.zzbmb()).zzm(zzfes.zzaz(copyOfRange)).zzcxt();
            zzcxt = zzdrc.zzbmd().zzfi(this.zzltl.getVersion()).zzb(zzcxt2).zzb(zzdss.zzboe().zza((zzdss.zza) this.zzltl.zzbmc()).zzaf(zzfes.zzaz(copyOfRange2)).zzcxt()).zzcxt();
        }
        return (zzdpp) zzdqe.zzb(this.zzlti, zzcxt);
    }

    @Override // com.google.android.gms.internal.zzduj
    public final int zzbma() {
        return this.zzltj;
    }
}
