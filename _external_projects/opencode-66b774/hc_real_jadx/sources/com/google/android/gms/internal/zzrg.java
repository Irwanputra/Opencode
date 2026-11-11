package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzrg extends zzev implements zzrf {
    public zzrg() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzrf zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzrf ? (zzrf) queryLocalInterface : new zzrh(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        zza(zzkt.zzf(parcel.readStrongBinder()), InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
