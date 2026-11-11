package com.google.android.gms.internal;

import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzkl extends zzev implements zzkk {
    public zzkl() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String mediationAdapterClassName;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            if (i == 2) {
                mediationAdapterClassName = getMediationAdapterClassName();
            } else {
                if (i == 3) {
                    boolean isLoading = isLoading();
                    parcel2.writeNoException();
                    zzew.zza(parcel2, isLoading);
                    return true;
                }
                if (i == 4) {
                    mediationAdapterClassName = zzcp();
                } else {
                    if (i != 5) {
                        return false;
                    }
                    zza((zzjj) zzew.zza(parcel, zzjj.CREATOR), parcel.readInt());
                }
            }
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
            return true;
        }
        zzd((zzjj) zzew.zza(parcel, zzjj.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
