package com.google.android.gms.internal;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzduz implements zzduv<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.zzduv
    public final /* synthetic */ KeyPairGenerator zzb(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
