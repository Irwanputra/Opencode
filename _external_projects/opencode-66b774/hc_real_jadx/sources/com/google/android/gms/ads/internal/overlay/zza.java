package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzzv;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zza {
    public static boolean zza(Context context, zzc zzcVar, zzq zzqVar) {
        String str;
        int i = 0;
        if (zzcVar == null) {
            str = "No intent data for launcher overlay.";
        } else {
            zznh.initialize(context);
            Intent intent = zzcVar.intent;
            if (intent != null) {
                return m1213(context, intent, zzqVar);
            }
            Intent intent2 = new Intent();
            if (!TextUtils.isEmpty(zzcVar.url)) {
                if (TextUtils.isEmpty(zzcVar.mimeType)) {
                    intent2.setData(Uri.parse(zzcVar.url));
                } else {
                    intent2.setDataAndType(Uri.parse(zzcVar.url), zzcVar.mimeType);
                }
                intent2.setAction("android.intent.action.VIEW");
                if (!TextUtils.isEmpty(zzcVar.packageName)) {
                    intent2.setPackage(zzcVar.packageName);
                }
                if (!TextUtils.isEmpty(zzcVar.zzchu)) {
                    String[] split = zzcVar.zzchu.split("/", 2);
                    if (split.length < 2) {
                        String valueOf = String.valueOf(zzcVar.zzchu);
                        zzakb.zzcu(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                        return false;
                    }
                    intent2.setClassName(split[0], split[1]);
                }
                String str2 = zzcVar.zzchv;
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (NumberFormatException unused) {
                        zzakb.zzcu("Could not parse intent flags.");
                    }
                    intent2.addFlags(i);
                }
                if (((Boolean) zzkb.zzif().zzd(zznh.zzbqt)).booleanValue()) {
                    intent2.addFlags(268435456);
                    intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
                } else {
                    if (((Boolean) zzkb.zzif().zzd(zznh.zzbqs)).booleanValue()) {
                        zzbs.zzei();
                        zzahn.zzb(context, intent2);
                    }
                }
                return m1213(context, intent2, zzqVar);
            }
            str = "Open GMSG did not contain a URL.";
        }
        zzakb.zzcu(str);
        return false;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m1213(Context context, Intent intent, zzq zzqVar) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzagf.v(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            zzbs.zzei();
            zzahn.zza(context, intent);
            if (zzqVar == null) {
                return true;
            }
            zzqVar.zzbt();
            return true;
        } catch (ActivityNotFoundException e) {
            zzakb.zzcu(e.getMessage());
            return false;
        }
    }
}
