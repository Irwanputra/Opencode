package com.google.android.gms.internal;

import android.location.Location;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzacg {
    private static final SimpleDateFormat zzcrs = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc A[Catch: JSONException -> 0x0235, TryCatch #0 {JSONException -> 0x0235, blocks: (B:3:0x0007, B:5:0x002a, B:8:0x0033, B:10:0x003b, B:12:0x0043, B:14:0x004b, B:16:0x0053, B:17:0x0057, B:19:0x006b, B:20:0x007c, B:22:0x008b, B:24:0x00a9, B:26:0x00af, B:28:0x00b5, B:31:0x00dc, B:34:0x00e2, B:38:0x00f0, B:39:0x00f5, B:43:0x0103, B:44:0x0108, B:48:0x0116, B:50:0x0121, B:53:0x0127, B:56:0x0133, B:58:0x0141, B:59:0x014c, B:64:0x0112, B:65:0x00ff, B:66:0x00ec, B:68:0x0096, B:70:0x009e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2 A[Catch: JSONException -> 0x0235, TryCatch #0 {JSONException -> 0x0235, blocks: (B:3:0x0007, B:5:0x002a, B:8:0x0033, B:10:0x003b, B:12:0x0043, B:14:0x004b, B:16:0x0053, B:17:0x0057, B:19:0x006b, B:20:0x007c, B:22:0x008b, B:24:0x00a9, B:26:0x00af, B:28:0x00b5, B:31:0x00dc, B:34:0x00e2, B:38:0x00f0, B:39:0x00f5, B:43:0x0103, B:44:0x0108, B:48:0x0116, B:50:0x0121, B:53:0x0127, B:56:0x0133, B:58:0x0141, B:59:0x014c, B:64:0x0112, B:65:0x00ff, B:66:0x00ec, B:68:0x0096, B:70:0x009e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141 A[Catch: JSONException -> 0x0235, TryCatch #0 {JSONException -> 0x0235, blocks: (B:3:0x0007, B:5:0x002a, B:8:0x0033, B:10:0x003b, B:12:0x0043, B:14:0x004b, B:16:0x0053, B:17:0x0057, B:19:0x006b, B:20:0x007c, B:22:0x008b, B:24:0x00a9, B:26:0x00af, B:28:0x00b5, B:31:0x00dc, B:34:0x00e2, B:38:0x00f0, B:39:0x00f5, B:43:0x0103, B:44:0x0108, B:48:0x0116, B:50:0x0121, B:53:0x0127, B:56:0x0133, B:58:0x0141, B:59:0x014c, B:64:0x0112, B:65:0x00ff, B:66:0x00ec, B:68:0x0096, B:70:0x009e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.zzaax zza(android.content.Context r50, com.google.android.gms.internal.zzaat r51, java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzacg.zza(android.content.Context, com.google.android.gms.internal.zzaat, java.lang.String):com.google.android.gms.internal.zzaax");
    }

    private static List<String> zza(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new LinkedList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:295:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x07a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zza(android.content.Context r23, com.google.android.gms.internal.zzabz r24) {
        /*
            Method dump skipped, instructions count: 2207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzacg.zza(android.content.Context, com.google.android.gms.internal.zzabz):org.json.JSONObject");
    }

    private static void zza(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zzb(com.google.android.gms.internal.zzaax r7) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzacg.zzb(com.google.android.gms.internal.zzaax):org.json.JSONObject");
    }

    private static JSONArray zzp(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    private static Integer zzt(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }
}
