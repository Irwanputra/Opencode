package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdvb implements zzduv<MessageDigest> {
    @Override // com.google.android.gms.internal.zzduv
    public final /* synthetic */ MessageDigest zzb(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
