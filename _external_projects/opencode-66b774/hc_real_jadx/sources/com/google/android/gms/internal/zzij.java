package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzij implements Parcelable.Creator<zzii> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzii createFromParcel(Parcel parcel) {
        int zzd = zzbfn.zzd(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                zzbfn.zzb(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) zzbfn.zza(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        zzbfn.zzaf(parcel, zzd);
        return new zzii(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzii[] newArray(int i) {
        return new zzii[i];
    }
}
