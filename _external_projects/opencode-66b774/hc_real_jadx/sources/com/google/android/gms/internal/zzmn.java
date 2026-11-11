package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmn extends zzbfm {
    public static final Parcelable.Creator<zzmn> CREATOR = new zzmo();
    public final String zzbgw;

    public zzmn(SearchAdRequest searchAdRequest) {
        this.zzbgw = searchAdRequest.getQuery();
    }

    public zzmn(String str) {
        this.zzbgw = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 15, this.zzbgw, false);
        zzbfp.zzai(parcel, zze);
    }
}
