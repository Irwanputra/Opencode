package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzcv {
    private static final String[] zzaia = {"/aclk", "/pcs/click"};
    private String zzahw = "googleads.g.doubleclick.net";
    private String zzahx = "/pagead/ads";
    private String zzahy = "ad.doubleclick.net";
    private String[] zzahz = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private zzcr zzaib;

    public zzcv(zzcr zzcrVar) {
        this.zzaib = zzcrVar;
    }

    private final Uri zza(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        try {
            boolean zza = zza(uri);
            if (zza) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzcw("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzcw("Query parameter already exists: ms");
            }
            String zza2 = z ? this.zzaib.zza(context, str, view, activity) : this.zzaib.zza(context);
            if (!zza) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf("&adurl");
                if (indexOf == -1) {
                    indexOf = uri2.indexOf("?adurl");
                }
                if (indexOf == -1) {
                    return uri.buildUpon().appendQueryParameter("ms", zza2).build();
                }
                int i = indexOf + 1;
                return Uri.parse(uri2.substring(0, i) + "ms=" + zza2 + "&" + uri2.substring(i));
            }
            String uri3 = uri.toString();
            int indexOf2 = uri3.indexOf(";adurl");
            if (indexOf2 != -1) {
                int i2 = indexOf2 + 1;
                return Uri.parse(uri3.substring(0, i2) + "dc_ms=" + zza2 + ";" + uri3.substring(i2));
            }
            String encodedPath = uri.getEncodedPath();
            int indexOf3 = uri3.indexOf(encodedPath);
            return Uri.parse(uri3.substring(0, encodedPath.length() + indexOf3) + ";dc_ms=" + zza2 + ";" + uri3.substring(indexOf3 + encodedPath.length()));
        } catch (UnsupportedOperationException unused) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    private final boolean zza(Uri uri) {
        uri.getClass();
        try {
            return uri.getHost().equals(this.zzahy);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public final Uri zza(Uri uri, Context context) {
        return zza(uri, context, null, false, null, null);
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) {
        try {
            return zza(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    public final void zza(MotionEvent motionEvent) {
        this.zzaib.zza(motionEvent);
    }

    public final zzcr zzaf() {
        return this.zzaib;
    }

    public final boolean zzb(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            for (String str : this.zzahz) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final boolean zzc(Uri uri) {
        if (zzb(uri)) {
            for (String str : zzaia) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
