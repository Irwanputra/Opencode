package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzvi extends zzeu implements zzvg {
    public zzvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    @Override // com.google.android.gms.internal.zzvg
    public final int zzmc() {
        Parcel zza = zza(1, zzbe());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }
}
