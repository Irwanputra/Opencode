package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzry extends zzalf<ParcelFileDescriptor> {
    private /* synthetic */ zzrx zzbyu;

    public zzry(zzrx zzrxVar) {
        this.zzbyu = zzrxVar;
    }

    @Override // com.google.android.gms.internal.zzalf, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zzbyu.disconnect();
        return super.cancel(z);
    }
}
