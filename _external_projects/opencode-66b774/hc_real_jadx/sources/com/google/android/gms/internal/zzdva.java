package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdva implements zzduv<Mac> {
    @Override // com.google.android.gms.internal.zzduv
    public final /* synthetic */ Mac zzb(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
