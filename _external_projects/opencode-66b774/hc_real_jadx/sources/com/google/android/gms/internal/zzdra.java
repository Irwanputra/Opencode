package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdra implements zzdpq {
    @Override // com.google.android.gms.internal.zzdpq
    public final zzdpw zzd(String str, String str2, int i) {
        String lowerCase = str2.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("mac")) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        str.hashCode();
        if (!str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new GeneralSecurityException(String.format("No support for primitive 'Mac' with key type '%s'.", str));
        }
        zzdqy zzdqyVar = new zzdqy();
        if (i <= 0) {
            return zzdqyVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
    }
}
