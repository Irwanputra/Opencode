package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzbfp;
import p131.p161.p162.p193.p205.C2468;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzc extends zzbfm {
    public static final Parcelable.Creator<zzc> CREATOR = new C2468();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f2869;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2870;

    public zzc(String str, int i) {
        this.f2869 = str;
        this.f2870 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 1, this.f2869, false);
        zzbfp.zzc(parcel, 2, this.f2870);
        zzbfp.zzai(parcel, zze);
    }
}
