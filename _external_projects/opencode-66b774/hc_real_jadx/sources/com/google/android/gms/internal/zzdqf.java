package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqf implements zzdpq {
    @Override // com.google.android.gms.internal.zzdpq
    public final zzdpw zzd(String str, String str2, int i) {
        zzdpw zzdqlVar;
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("aead")) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        str.hashCode();
        switch (str) {
            case "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key":
                zzdqlVar = new zzdql();
                break;
            case "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey":
                zzdqlVar = new zzdqh();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsAeadKey":
                zzdqlVar = new zzdqm();
                break;
            case "type.googleapis.com/google.crypto.tink.AesEaxKey":
                zzdqlVar = new zzdqj();
                break;
            case "type.googleapis.com/google.crypto.tink.AesGcmKey":
                zzdqlVar = new zzdqk();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey":
                zzdqlVar = new zzdqo();
                break;
            default:
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
        }
        if (i <= 0) {
            return zzdqlVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
    }
}
