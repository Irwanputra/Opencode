package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzqy extends zzeu implements zzqw {
    public zzqy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.zzqw
    public final void zzb(zzqm zzqmVar, String str) {
        Parcel zzbe = zzbe();
        zzew.zza(zzbe, zzqmVar);
        zzbe.writeString(str);
        zzb(1, zzbe);
    }
}
