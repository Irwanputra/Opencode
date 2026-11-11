package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabg extends zzeu implements zzabe {
    public zzabg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // com.google.android.gms.internal.zzabe
    public final void zza(zzaax zzaaxVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzaaxVar);
        zzb(1, zzbe);
    }
}
