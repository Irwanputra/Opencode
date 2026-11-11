package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabd extends zzeu implements zzabb {
    public zzabd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.zzabb
    public final void zza(zzaat zzaatVar, zzabe zzabeVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzaatVar);
        zzew.zza(zzbe, zzabeVar);
        zzb(2, zzbe);
    }

    @Override // com.google.android.gms.internal.zzabb
    public final void zza(zzabm zzabmVar, zzabh zzabhVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzabmVar);
        zzew.zza(zzbe, zzabhVar);
        zzb(4, zzbe);
    }

    @Override // com.google.android.gms.internal.zzabb
    public final zzaax zzb(zzaat zzaatVar) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzaatVar);
        Parcel zza = zza(1, zzbe);
        zzaax zzaaxVar = (zzaax) zzew.zza(zza, zzaax.CREATOR);
        zza.recycle();
        return zzaaxVar;
    }
}
