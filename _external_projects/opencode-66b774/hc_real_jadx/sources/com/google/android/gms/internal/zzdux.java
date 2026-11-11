package com.google.android.gms.internal;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdux implements zzduv<KeyAgreement> {
    @Override // com.google.android.gms.internal.zzduv
    public final /* synthetic */ KeyAgreement zzb(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
