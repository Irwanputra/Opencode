package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmr extends zzbfm {
    public static final Parcelable.Creator<zzmr> CREATOR = new zzms();
    public final boolean zzbgx;
    public final boolean zzbgy;
    public final boolean zzbgz;

    public zzmr(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    public zzmr(boolean z, boolean z2, boolean z3) {
        this.zzbgx = z;
        this.zzbgy = z2;
        this.zzbgz = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 2, this.zzbgx);
        zzbfp.zza(parcel, 3, this.zzbgy);
        zzbfp.zza(parcel, 4, this.zzbgz);
        zzbfp.zzai(parcel, zze);
    }
}
