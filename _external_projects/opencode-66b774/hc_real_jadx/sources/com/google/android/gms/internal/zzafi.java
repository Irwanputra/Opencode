package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzafi {
    public static String zzb(String str, Context context) {
        String zzy;
        if (!zzbs.zzfd().zzq(context) || TextUtils.isEmpty(str) || (zzy = zzbs.zzfd().zzy(context)) == null) {
            return str;
        }
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbkv)).booleanValue()) {
            CharSequence charSequence = (String) zzkb.zzif().zzd(zznh.zzbkw);
            if (!str.contains(charSequence)) {
                return str;
            }
            if (zzbs.zzei().zzcg(str)) {
                zzbs.zzfd().zze(context, zzy);
                return str.replace(charSequence, zzy);
            }
            if (!zzbs.zzei().zzch(str)) {
                return str;
            }
            zzbs.zzfd().zzf(context, zzy);
            return str.replace(charSequence, zzy);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (zzbs.zzei().zzcg(str)) {
            zzbs.zzfd().zze(context, zzy);
            zzbs.zzei();
            return zzahn.zzb(str, "fbs_aeid", zzy).toString();
        }
        if (!zzbs.zzei().zzch(str)) {
            return str;
        }
        zzbs.zzfd().zzf(context, zzy);
        zzbs.zzei();
        return zzahn.zzb(str, "fbs_aeid", zzy).toString();
    }
}
