package com.google.android.gms.ads.internal.gmsg;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzzv;
import java.util.Map;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzc implements zzt<zzanh> {
    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(zzanh zzanhVar, Map map) {
        zzanh zzanhVar2 = zzanhVar;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                zzakb.zzcu("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                zzakb.zzcu("No timestamp given for CSI tick.");
                return;
            }
            try {
                long parseLong = Long.parseLong(str4);
                ((C2510) zzbs.zzeo()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ((C2510) zzbs.zzeo()).getClass();
                long elapsedRealtime = (parseLong - currentTimeMillis) + SystemClock.elapsedRealtime();
                if (TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzanhVar2.zzsj().zza(str2, str3, elapsedRealtime);
                return;
            } catch (NumberFormatException e) {
                zzakb.zzc("Malformed timestamp for CSI tick.", e);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzakb.zzcu("No value given for CSI experiment.");
                return;
            }
            zznu zzje = zzanhVar2.zzsj().zzje();
            if (zzje == null) {
                zzakb.zzcu("No ticker for WebView, dropping experiment ID.");
                return;
            } else {
                zzje.zzf("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzakb.zzcu("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                zzakb.zzcu("No name given for CSI extra.");
                return;
            }
            zznu zzje2 = zzanhVar2.zzsj().zzje();
            if (zzje2 == null) {
                zzakb.zzcu("No ticker for WebView, dropping extra parameter.");
            } else {
                zzje2.zzf(str6, str7);
            }
        }
    }
}
