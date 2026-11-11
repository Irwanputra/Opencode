package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzbs;
import java.util.List;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzil extends zzbfm {
    public static final Parcelable.Creator<zzil> CREATOR = new zzim();
    public final String url;
    private long zzbay;
    private String zzbaz;
    private String zzbba;
    private String zzbbb;
    private Bundle zzbbc;
    private boolean zzbbd;
    private long zzbbe;

    public zzil(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.url = str;
        this.zzbay = j;
        this.zzbaz = str2 == null ? "" : str2;
        this.zzbba = str3 == null ? "" : str3;
        this.zzbbb = str4 == null ? "" : str4;
        this.zzbbc = bundle == null ? new Bundle() : bundle;
        this.zzbbd = z;
        this.zzbbe = j2;
    }

    public static zzil zzab(String str) {
        return zzd(Uri.parse(str));
    }

    public static zzil zzd(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                zzakb.zzcu(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : zzbs.zzek().zzg(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzil(queryParameter, parseLong, host, str, str2, bundle, equals, 0L);
        } catch (NullPointerException | NumberFormatException e) {
            zzakb.zzc("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 2, this.url, false);
        zzbfp.zza(parcel, 3, this.zzbay);
        zzbfp.zza(parcel, 4, this.zzbaz, false);
        zzbfp.zza(parcel, 5, this.zzbba, false);
        zzbfp.zza(parcel, 6, this.zzbbb, false);
        zzbfp.zza(parcel, 7, this.zzbbc, false);
        zzbfp.zza(parcel, 8, this.zzbbd);
        zzbfp.zza(parcel, 9, this.zzbbe);
        zzbfp.zzai(parcel, zze);
    }
}
