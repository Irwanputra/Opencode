package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzpv extends zzev implements zzpu {
    public zzpv() {
        attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzpu zzl(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzpu ? (zzpu) queryLocalInterface : new zzpw(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            zzb(parcel.readString(), InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
        } else {
            if (i == 2) {
                InterfaceC2455 zzal = zzal(parcel.readString());
                parcel2.writeNoException();
                zzew.zza(parcel2, zzal);
                return true;
            }
            if (i == 3) {
                zza(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
            } else if (i == 4) {
                destroy();
            } else {
                if (i != 5) {
                    return false;
                }
                zzb(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), parcel.readInt());
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
