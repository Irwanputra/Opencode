package com.google.android.gms.internal;

import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzlh extends zzev implements zzlg {
    public zzlh() {
        attachInterface(this, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                initialize();
                parcel2.writeNoException();
                break;
            case 2:
                setAppVolume(parcel.readFloat());
                parcel2.writeNoException();
                break;
            case 3:
                zzu(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                setAppMuted(zzew.zza(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                zzb(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                zza(parcel.readString(), InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                float zzdn = zzdn();
                parcel2.writeNoException();
                parcel2.writeFloat(zzdn);
                break;
            case 8:
                boolean zzdo = zzdo();
                parcel2.writeNoException();
                zzew.zza(parcel2, zzdo);
                break;
        }
        return true;
    }
}
