package com.google.android.gms.internal;

import android.os.IBinder;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzkg extends zzeu implements zzke {
    public zzkg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.zzke
    public final void onAdClicked() {
        zzb(1, zzbe());
    }
}
