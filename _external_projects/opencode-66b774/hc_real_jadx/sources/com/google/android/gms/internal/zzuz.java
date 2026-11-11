package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzuz extends zzeu implements zzux {
    public zzuz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.zzux
    public final zzva zzbg(String str) {
        zzva zzvcVar;
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        Parcel zza = zza(1, zzbe);
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            zzvcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzvcVar = queryLocalInterface instanceof zzva ? (zzva) queryLocalInterface : new zzvc(readStrongBinder);
        }
        zza.recycle();
        return zzvcVar;
    }

    @Override // com.google.android.gms.internal.zzux
    public final boolean zzbh(String str) {
        Parcel zzbe = zzbe();
        zzbe.writeString(str);
        Parcel zza = zza(2, zzbe);
        boolean zza2 = zzew.zza(zza);
        zza.recycle();
        return zza2;
    }
}
