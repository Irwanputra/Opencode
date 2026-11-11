package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzabm extends zzbfm {
    public static final Parcelable.Creator<zzabm> CREATOR = new zzabn();
    private ApplicationInfo applicationInfo;
    private String packageName;
    private PackageInfo zzcne;
    private List<String> zzcnr;
    private String zzcoa;
    private Bundle zzcqd;
    private zzakd zzcqe;
    private boolean zzcqf;
    private String zzcqg;

    public zzabm(Bundle bundle, zzakd zzakdVar, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, boolean z, String str3) {
        this.zzcqd = bundle;
        this.zzcqe = zzakdVar;
        this.packageName = str;
        this.applicationInfo = applicationInfo;
        this.zzcnr = list;
        this.zzcne = packageInfo;
        this.zzcoa = str2;
        this.zzcqf = z;
        this.zzcqg = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 1, this.zzcqd, false);
        zzbfp.zza(parcel, 2, (Parcelable) this.zzcqe, i, false);
        zzbfp.zza(parcel, 3, (Parcelable) this.applicationInfo, i, false);
        zzbfp.zza(parcel, 4, this.packageName, false);
        zzbfp.zzb(parcel, 5, this.zzcnr, false);
        zzbfp.zza(parcel, 6, (Parcelable) this.zzcne, i, false);
        zzbfp.zza(parcel, 7, this.zzcoa, false);
        zzbfp.zza(parcel, 8, this.zzcqf);
        zzbfp.zza(parcel, 9, this.zzcqg, false);
        zzbfp.zzai(parcel, zze);
    }
}
