package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabx extends zzbfm {
    public static final Parcelable.Creator<zzabx> CREATOR = new zzaby();
    public String zzbsw;

    public zzabx(String str) {
        this.zzbsw = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 2, this.zzbsw, false);
        zzbfp.zzai(parcel, zze);
    }
}
