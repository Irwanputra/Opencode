package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p034.p095.C1687;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjj extends zzbfm {
    public static final Parcelable.Creator<zzjj> CREATOR = new zzjl();
    public final Bundle extras;
    public final int versionCode;
    public final long zzbdf;
    public final int zzbdg;
    public final List<String> zzbdh;
    public final boolean zzbdi;
    public final int zzbdj;
    public final boolean zzbdk;
    public final String zzbdl;
    public final zzmn zzbdm;
    public final Location zzbdn;
    public final String zzbdo;
    public final Bundle zzbdp;
    public final Bundle zzbdq;
    public final List<String> zzbdr;
    public final String zzbds;
    public final String zzbdt;
    public final boolean zzbdu;

    public zzjj(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzmn zzmnVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.versionCode = i;
        this.zzbdf = j;
        this.extras = bundle == null ? new Bundle() : bundle;
        this.zzbdg = i2;
        this.zzbdh = list;
        this.zzbdi = z;
        this.zzbdj = i3;
        this.zzbdk = z2;
        this.zzbdl = str;
        this.zzbdm = zzmnVar;
        this.zzbdn = location;
        this.zzbdo = str2;
        this.zzbdp = bundle2 == null ? new Bundle() : bundle2;
        this.zzbdq = bundle3;
        this.zzbdr = list2;
        this.zzbds = str3;
        this.zzbdt = str4;
        this.zzbdu = z3;
    }

    public static void zzh(zzjj zzjjVar) {
        zzjjVar.zzbdp.putBundle("com.google.ads.mediation.admob.AdMobAdapter", zzjjVar.extras);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjj)) {
            return false;
        }
        zzjj zzjjVar = (zzjj) obj;
        return this.versionCode == zzjjVar.versionCode && this.zzbdf == zzjjVar.zzbdf && C1687.m3694(this.extras, zzjjVar.extras) && this.zzbdg == zzjjVar.zzbdg && C1687.m3694(this.zzbdh, zzjjVar.zzbdh) && this.zzbdi == zzjjVar.zzbdi && this.zzbdj == zzjjVar.zzbdj && this.zzbdk == zzjjVar.zzbdk && C1687.m3694(this.zzbdl, zzjjVar.zzbdl) && C1687.m3694(this.zzbdm, zzjjVar.zzbdm) && C1687.m3694(this.zzbdn, zzjjVar.zzbdn) && C1687.m3694(this.zzbdo, zzjjVar.zzbdo) && C1687.m3694(this.zzbdp, zzjjVar.zzbdp) && C1687.m3694(this.zzbdq, zzjjVar.zzbdq) && C1687.m3694(this.zzbdr, zzjjVar.zzbdr) && C1687.m3694(this.zzbds, zzjjVar.zzbds) && C1687.m3694(this.zzbdt, zzjjVar.zzbdt) && this.zzbdu == zzjjVar.zzbdu;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.versionCode), Long.valueOf(this.zzbdf), this.extras, Integer.valueOf(this.zzbdg), this.zzbdh, Boolean.valueOf(this.zzbdi), Integer.valueOf(this.zzbdj), Boolean.valueOf(this.zzbdk), this.zzbdl, this.zzbdm, this.zzbdn, this.zzbdo, this.zzbdp, this.zzbdq, this.zzbdr, this.zzbds, this.zzbdt, Boolean.valueOf(this.zzbdu)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zzc(parcel, 1, this.versionCode);
        zzbfp.zza(parcel, 2, this.zzbdf);
        zzbfp.zza(parcel, 3, this.extras, false);
        zzbfp.zzc(parcel, 4, this.zzbdg);
        zzbfp.zzb(parcel, 5, this.zzbdh, false);
        zzbfp.zza(parcel, 6, this.zzbdi);
        zzbfp.zzc(parcel, 7, this.zzbdj);
        zzbfp.zza(parcel, 8, this.zzbdk);
        zzbfp.zza(parcel, 9, this.zzbdl, false);
        zzbfp.zza(parcel, 10, (Parcelable) this.zzbdm, i, false);
        zzbfp.zza(parcel, 11, (Parcelable) this.zzbdn, i, false);
        zzbfp.zza(parcel, 12, this.zzbdo, false);
        zzbfp.zza(parcel, 13, this.zzbdp, false);
        zzbfp.zza(parcel, 14, this.zzbdq, false);
        zzbfp.zzb(parcel, 15, this.zzbdr, false);
        zzbfp.zza(parcel, 16, this.zzbds, false);
        zzbfp.zza(parcel, 17, this.zzbdt, false);
        zzbfp.zza(parcel, 18, this.zzbdu);
        zzbfp.zzai(parcel, zze);
    }
}
