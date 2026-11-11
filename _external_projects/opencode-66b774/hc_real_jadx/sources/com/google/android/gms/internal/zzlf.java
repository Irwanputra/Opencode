package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlf extends zzeu implements zzld {
    public zzlf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    @Override // com.google.android.gms.internal.zzld
    public final long getValue() {
        Parcel zza = zza(1, zzbe());
        long readLong = zza.readLong();
        zza.recycle();
        return readLong;
    }
}
