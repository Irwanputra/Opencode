package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlr extends zzbfm {
    public static final Parcelable.Creator<zzlr> CREATOR = new zzls();
    public final int zzbfr;

    public zzlr(int i) {
        this.zzbfr = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zzc(parcel, 2, this.zzbfr);
        zzbfp.zzai(parcel, zze);
    }
}
