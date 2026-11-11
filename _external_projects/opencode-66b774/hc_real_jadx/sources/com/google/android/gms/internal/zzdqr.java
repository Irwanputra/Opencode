package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdqr implements zzdpq {
    @Override // com.google.android.gms.internal.zzdpq
    public final zzdpw zzd(String str, String str2, int i) {
        zzdpw zzdqpVar;
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals("hybriddecrypt")) {
            str.hashCode();
            if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", str));
            }
            zzdqpVar = new zzdqp();
        } else {
            if (!lowerCase.equals("hybridencrypt")) {
                throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
            }
            str.hashCode();
            if (!str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", str));
            }
            zzdqpVar = new zzdqq();
        }
        if (i <= 0) {
            return zzdqpVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
    }
}
