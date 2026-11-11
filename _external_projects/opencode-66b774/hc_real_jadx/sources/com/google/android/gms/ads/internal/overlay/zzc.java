package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzbfp;
import com.google.android.gms.internal.zzzv;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzc extends zzbfm {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    public final String zzchu;
    public final String zzchv;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f2633;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f2634;

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f2633 = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzchu = str5;
        this.zzchv = str6;
        this.f2634 = str7;
        this.intent = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 2, this.f2633, false);
        zzbfp.zza(parcel, 3, this.url, false);
        zzbfp.zza(parcel, 4, this.mimeType, false);
        zzbfp.zza(parcel, 5, this.packageName, false);
        zzbfp.zza(parcel, 6, this.zzchu, false);
        zzbfp.zza(parcel, 7, this.zzchv, false);
        zzbfp.zza(parcel, 8, this.f2634, false);
        zzbfp.zza(parcel, 9, (Parcelable) this.intent, i, false);
        zzbfp.zzai(parcel, zze);
    }
}
