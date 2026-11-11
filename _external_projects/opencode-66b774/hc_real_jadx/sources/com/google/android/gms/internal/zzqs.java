package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzqs extends zzeu implements zzqq {
    public zzqs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.zzqq
    public final void zza(zzqe zzqeVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzqeVar);
        zzb(1, zzbe);
    }
}
