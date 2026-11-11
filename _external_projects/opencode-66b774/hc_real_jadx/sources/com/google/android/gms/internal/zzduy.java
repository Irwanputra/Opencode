package com.google.android.gms.internal;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzduy implements zzduv<KeyFactory> {
    @Override // com.google.android.gms.internal.zzduv
    public final /* synthetic */ KeyFactory zzb(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
