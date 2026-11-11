package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzduw implements zzduv<Cipher> {
    @Override // com.google.android.gms.internal.zzduv
    public final /* synthetic */ Cipher zzb(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
