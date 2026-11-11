package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzms implements Parcelable.Creator<zzmr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmr createFromParcel(Parcel parcel) {
        int zzd = zzbfn.zzd(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                z = zzbfn.zzc(parcel, readInt);
            } else if (i == 3) {
                z2 = zzbfn.zzc(parcel, readInt);
            } else if (i != 4) {
                zzbfn.zzb(parcel, readInt);
            } else {
                z3 = zzbfn.zzc(parcel, readInt);
            }
        }
        zzbfn.zzaf(parcel, zzd);
        return new zzmr(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzmr[] newArray(int i) {
        return new zzmr[i];
    }
}
