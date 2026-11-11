package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzamv implements com.google.android.gms.ads.internal.gmsg.zzt<zzamp> {
    private boolean zzdjv;

    private static int zza(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            zzkb.zzia();
            return zzajr.zzc(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(str2.length() + String.valueOf(str).length() + 34);
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            zzakb.zzcu(sb.toString());
            return i;
        }
    }

    private static void zza(zzamd zzamdVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        if (str != null) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzakb.zzcu(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            Integer.parseInt(str2);
        }
        if (str3 != null) {
            Integer.parseInt(str3);
        }
        if (str4 != null) {
            Integer.parseInt(str4);
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzamp zzampVar, Map map) {
        int i;
        int i2;
        zzamp zzampVar2 = zzampVar;
        String str = (String) map.get("action");
        if (str == null) {
            zzakb.zzcu("Action missing from video GMSG.");
            return;
        }
        if (zzakb.zzae(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(jSONObject2).length() + str.length() + 13);
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            zzakb.zzbx(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzakb.zzcu("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                zzampVar2.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                zzakb.zzcu("Invalid color parameter in video GMSG.");
                return;
            }
        }
        if ("decoderProps".equals(str)) {
            String str3 = (String) map.get("mimeTypes");
            if (str3 == null) {
                zzakb.zzcu("No MIME types specified for decoder properties inspection.");
                zzamd.zza(zzampVar2, "missingMimeTypes");
                return;
            }
            if (Build.VERSION.SDK_INT < 16) {
                zzakb.zzcu("Video decoder properties available on API versions >= 16.");
                zzamd.zza(zzampVar2, "deficientApiVersion");
                return;
            }
            HashMap hashMap = new HashMap();
            for (String str4 : str3.split(",")) {
                hashMap.put(str4, zzajp.zzco(str4.trim()));
            }
            zzamd.zza(zzampVar2, hashMap);
            return;
        }
        zzamg zzsf = zzampVar2.zzsf();
        if (zzsf == null) {
            zzakb.zzcu("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = "new".equals(str);
        boolean equals2 = "position".equals(str);
        if (equals || equals2) {
            Context context = zzampVar2.getContext();
            int zza = zza(context, map, "x", 0);
            int zza2 = zza(context, map, "y", 0);
            int zza3 = zza(context, map, "w", -1);
            int zza4 = zza(context, map, "h", -1);
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbov)).booleanValue()) {
                zza3 = Math.min(zza3, zzampVar2.zzsm() - zza);
                i = Math.min(zza4, zzampVar2.zzsl() - zza2);
            } else {
                i = zza4;
            }
            try {
                i2 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused2) {
                i2 = 0;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzsf.zzsa() != null) {
                zzsf.zze(zza, zza2, zza3, i);
                return;
            }
            zzsf.zza(zza, zza2, zza3, i, i2, parseBoolean, new zzamo((String) map.get("flags")));
            zzamd zzsa = zzsf.zzsa();
            if (zzsa != null) {
                zza(zzsa, (Map<String, String>) map);
                return;
            }
            return;
        }
        zzamd zzsa2 = zzsf.zzsa();
        if (zzsa2 == null) {
            zzamd.zza(zzampVar2);
            return;
        }
        if ("click".equals(str)) {
            Context context2 = zzampVar2.getContext();
            int zza5 = zza(context2, map, "x", 0);
            int zza6 = zza(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zza5, zza6, 0);
            zzsa2.zzf(obtain);
            obtain.recycle();
            return;
        }
        if ("currentTime".equals(str)) {
            String str5 = (String) map.get("time");
            if (str5 == null) {
                zzakb.zzcu("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzsa2.seekTo((int) (Float.parseFloat(str5) * 1000.0f));
                return;
            } catch (NumberFormatException unused3) {
                zzakb.zzcu(str5.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str5) : new String("Could not parse time parameter from currentTime video GMSG: "));
                return;
            }
        }
        if ("hide".equals(str)) {
            zzsa2.setVisibility(4);
            return;
        }
        if ("load".equals(str)) {
            zzsa2.zzrt();
            return;
        }
        if ("loadControl".equals(str)) {
            zza(zzsa2, (Map<String, String>) map);
            return;
        }
        if ("muted".equals(str)) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzsa2.zzru();
                return;
            } else {
                zzsa2.zzrv();
                return;
            }
        }
        if ("pause".equals(str)) {
            zzsa2.pause();
            return;
        }
        if ("play".equals(str)) {
            zzsa2.play();
            return;
        }
        if ("show".equals(str)) {
            zzsa2.setVisibility(0);
            return;
        }
        if ("src".equals(str)) {
            zzsa2.zzcv((String) map.get("src"));
            return;
        }
        if ("touchMove".equals(str)) {
            Context context3 = zzampVar2.getContext();
            zzsa2.zza(zza(context3, map, "dx", 0), zza(context3, map, "dy", 0));
            if (this.zzdjv) {
                return;
            }
            zzampVar2.zzna();
            this.zzdjv = true;
            return;
        }
        if (!"volume".equals(str)) {
            if ("watermark".equals(str)) {
                zzsa2.zzrw();
                return;
            } else {
                zzakb.zzcu(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
                return;
            }
        }
        String str6 = (String) map.get("volume");
        if (str6 == null) {
            zzakb.zzcu("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzsa2.zzb(Float.parseFloat(str6));
        } catch (NumberFormatException unused4) {
            zzakb.zzcu(str6.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str6) : new String("Could not parse volume parameter from volume video GMSG: "));
        }
    }
}
