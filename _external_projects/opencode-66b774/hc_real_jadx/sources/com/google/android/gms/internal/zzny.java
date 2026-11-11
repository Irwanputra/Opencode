package com.google.android.gms.internal;

import android.os.Parcel;
import p131.p161.p162.p193.p203.InterfaceC2455;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzny extends zzev implements zznx {
    public zzny() {
        attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zzjj;
        if (zza(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i == 1) {
            zzjj = zzjj();
        } else {
            if (i != 2) {
                if (i == 3) {
                    zze(InterfaceC2455.AbstractBinderC2456.m4503(parcel.readStrongBinder()));
                } else if (i == 4) {
                    recordClick();
                } else {
                    if (i != 5) {
                        return false;
                    }
                    recordImpression();
                }
                parcel2.writeNoException();
                return true;
            }
            zzjj = getContent();
        }
        parcel2.writeNoException();
        parcel2.writeString(zzjj);
        return true;
    }
}
