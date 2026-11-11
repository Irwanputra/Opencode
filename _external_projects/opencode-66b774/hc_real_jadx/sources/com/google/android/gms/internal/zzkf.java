package com.google.android.gms.internal;

import android.os.Parcel;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzkf extends zzev implements zzke {
    public zzkf() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        onAdClicked();
        parcel2.writeNoException();
        return true;
    }
}
