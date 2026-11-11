package com.google.android.gms.internal;

import android.util.Log;
import java.util.Locale;
import p131.p161.p162.p193.p205.p208.C2480;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbgg {
    private final String mTag;
    private final int zzdvo;
    private final String zzgaz;
    private final C2480 zzgbx;

    private zzbgg(String str, String str2) {
        this.zzgaz = str2;
        this.mTag = str;
        this.zzgbx = new C2480(str);
        this.zzdvo = getLogLevel();
    }

    public zzbgg(String str, String... strArr) {
        this(str, zzc(strArr));
    }

    private final String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzgaz.concat(str);
    }

    private final int getLogLevel() {
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.mTag, i)) {
            i++;
        }
        return i;
    }

    private final boolean zzae(int i) {
        return this.zzdvo <= i;
    }

    private static String zzc(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (String str : strArr) {
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(str);
        }
        sb.append(']');
        sb.append(' ');
        return sb.toString();
    }

    public final void zza(String str, Throwable th, Object... objArr) {
        format(str, objArr);
    }

    public final void zza(String str, Object... objArr) {
        if (zzae(2)) {
            format(str, objArr);
        }
    }

    public final void zzb(String str, Object... objArr) {
        if (zzae(3)) {
            format(str, objArr);
        }
    }

    public final void zze(String str, Object... objArr) {
        format(str, objArr);
    }

    public final void zze(Throwable th) {
    }

    public final void zzf(String str, Object... objArr) {
        format(str, objArr);
    }
}
