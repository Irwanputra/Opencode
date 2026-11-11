package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqp implements zzdpw<zzdpu> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzdpw
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdpu zza(zzfes zzfesVar) {
        try {
            zzdsi zzx = zzdsi.zzx(zzfesVar);
            if (!(zzx instanceof zzdsi)) {
                throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
            }
            zzdvk.zzt(zzx.getVersion(), 0);
            zzdqv.zza(zzx.zzbnq().zzbnj());
            zzdsg zzbnj = zzx.zzbnq().zzbnj();
            zzdsm zzbnl = zzbnj.zzbnl();
            zzdur zza = zzdqv.zza(zzbnl.zzbny());
            byte[] byteArray = zzx.zzbmj().toByteArray();
            return new zzduk((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), zzdup.zza(zza))), zzbnl.zzboa().toByteArray(), zzdqv.zza(zzbnl.zzbnz()), zzdqv.zza(zzbnj.zzbnn()), new zzdqx(zzbnj.zzbnm().zzbng()));
        } catch (zzfge e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final /* synthetic */ zzdpu zza(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdsi)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        }
        zzdsi zzdsiVar = (zzdsi) zzfheVar;
        zzdvk.zzt(zzdsiVar.getVersion(), 0);
        zzdqv.zza(zzdsiVar.zzbnq().zzbnj());
        zzdsg zzbnj = zzdsiVar.zzbnq().zzbnj();
        zzdsm zzbnl = zzbnj.zzbnl();
        zzdur zza = zzdqv.zza(zzbnl.zzbny());
        byte[] byteArray = zzdsiVar.zzbmj().toByteArray();
        return new zzduk((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), zzdup.zza(zza))), zzbnl.zzboa().toByteArray(), zzdqv.zza(zzbnl.zzbnz()), zzdqv.zza(zzbnj.zzbnn()), new zzdqx(zzbnj.zzbnm().zzbng()));
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfes zzfesVar) {
        try {
            return zzb(zzdse.zzw(zzfesVar));
        } catch (zzfge e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzfhe zzb(zzfhe zzfheVar) {
        if (!(zzfheVar instanceof zzdse)) {
            throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
        }
        zzdse zzdseVar = (zzdse) zzfheVar;
        zzdqv.zza(zzdseVar.zzbnj());
        ECParameterSpec zza = zzdup.zza(zzdqv.zza(zzdseVar.zzbnj().zzbnl().zzbny()));
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(zza);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return zzdsi.zzbnr().zzfo(0).zzb(zzdsk.zzbnv().zzfp(0).zzc(zzdseVar.zzbnj()).zzac(zzfes.zzaz(w.getAffineX().toByteArray())).zzad(zzfes.zzaz(w.getAffineY().toByteArray())).zzcxt()).zzy(zzfes.zzaz(eCPrivateKey.getS().toByteArray())).zzcxt();
    }

    @Override // com.google.android.gms.internal.zzdpw
    public final zzdsy zzc(zzfes zzfesVar) {
        return zzdsy.zzboq().zzoj("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zzai(((zzdsi) zzb(zzfesVar)).toByteString()).zzb(zzdsy.zzb.ASYMMETRIC_PRIVATE).zzcxt();
    }
}
