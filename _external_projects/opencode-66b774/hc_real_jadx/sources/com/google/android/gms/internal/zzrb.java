package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzrb extends zzeu implements zzqz {
    public zzrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.zzqz
    public final void zzb(zzqm zzqmVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzqmVar);
        zzb(1, zzbe);
    }
}
