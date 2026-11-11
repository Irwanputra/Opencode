package com.google.android.gms.internal;

import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzabf extends zzev implements zzabe {
    public zzabf() {
        attachInterface(this, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        zza((zzaax) zzew.zza(parcel, zzaax.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
