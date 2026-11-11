package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.JsonWriter;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p131.p161.p162.p193.p205.p209.C2510;
import p131.p161.p162.p193.p205.p209.InterfaceC2512;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzajv {
    private static boolean zzddx;
    private static boolean zzddy;
    private final List<String> zzdeb;
    private static Object sLock = new Object();
    private static InterfaceC2512 zzddz = C2510.f9852;
    private static final Set<String> zzdea = new HashSet(Arrays.asList(new String[0]));

    public zzajv() {
        this(null);
    }

    public zzajv(String str) {
        List<String> asList;
        if (isEnabled()) {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
                asList = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                strArr2[0] = str.length() != 0 ? "ad_request_".concat(str) : new String("ad_request_");
                String valueOf2 = String.valueOf(uuid);
                strArr2[1] = valueOf2.length() != 0 ? "network_request_".concat(valueOf2) : new String("network_request_");
                asList = Arrays.asList(strArr2);
            }
        } else {
            asList = new ArrayList<>();
        }
        this.zzdeb = asList;
    }

    public static boolean isEnabled() {
        boolean z;
        synchronized (sLock) {
            z = zzddx && zzddy;
        }
        return z;
    }

    private static synchronized void log(String str) {
        synchronized (zzajv.class) {
            zzakb.zzct("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzakb.zzct(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzakb.zzct("GMA Debug FINISH");
        }
    }

    public static final /* synthetic */ void zza(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    private static void zza(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!zzdea.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        zzakb.e("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public static final /* synthetic */ void zza(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void zza(String str, zzaka zzakaVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            JsonWriter name = jsonWriter.name("timestamp");
            ((C2510) zzddz).getClass();
            name.value(System.currentTimeMillis());
            jsonWriter.name(NotificationCompat.CATEGORY_EVENT).value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.zzdeb.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            zzakaVar.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzakb.zzb("unable to log", e);
        }
        log(stringWriter.toString());
    }

    public static void zzaa(boolean z) {
        synchronized (sLock) {
            zzddx = true;
            zzddy = z;
        }
    }

    private final void zzb(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) {
        zza("onNetworkRequest", new zzaka(str, str2, map, bArr) { // from class: com.google.android.gms.internal.zzajw
            private final String zzdec;
            private final String zzded;
            private final Map zzdee;
            private final byte[] zzdef;

            {
                this.zzdec = str;
                this.zzded = str2;
                this.zzdee = map;
                this.zzdef = bArr;
            }

            @Override // com.google.android.gms.internal.zzaka
            public final void zza(JsonWriter jsonWriter) {
                zzajv.zza(this.zzdec, this.zzded, this.zzdee, this.zzdef, jsonWriter);
            }
        });
    }

    private final void zzb(final Map<String, ?> map, final int i) {
        zza("onNetworkResponse", new zzaka(i, map) { // from class: com.google.android.gms.internal.zzajx
            private final int zzdeg;
            private final Map zzdeh;

            {
                this.zzdeg = i;
                this.zzdeh = map;
            }

            @Override // com.google.android.gms.internal.zzaka
            public final void zza(JsonWriter jsonWriter) {
                zzajv.zza(this.zzdeg, this.zzdeh, jsonWriter);
            }
        });
    }

    public static boolean zzbj(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((Boolean) zzkb.zzif().zzd(zznh.zzbmi)).booleanValue() && Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    private final void zzcs(final String str) {
        zza("onNetworkRequestError", new zzaka(str) { // from class: com.google.android.gms.internal.zzajz
            private final String zzdec;

            {
                this.zzdec = str;
            }

            @Override // com.google.android.gms.internal.zzaka
            public final void zza(JsonWriter jsonWriter) {
                zzajv.zza(this.zzdec, jsonWriter);
            }
        });
    }

    public static void zzrb() {
        synchronized (sLock) {
            zzddx = false;
            zzddy = false;
            zzakb.zzcu("Ad debug logging enablement is out of date.");
        }
    }

    public static boolean zzrc() {
        boolean z;
        synchronized (sLock) {
            z = zzddx;
        }
        return z;
    }

    public final void zza(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (isEnabled()) {
            zzb(str, str2, map, bArr);
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, int i) {
        if (isEnabled()) {
            String str = null;
            zzb(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzakb.zzcu(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                zzcs(str);
            }
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (isEnabled()) {
            zzb(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zza(Map<String, ?> map, int i) {
        if (isEnabled()) {
            zzb(map, i);
            if (i < 200 || i >= 300) {
                zzcs(null);
            }
        }
    }

    public final void zzcr(String str) {
        if (isEnabled() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(final byte[] bArr) {
        zza("onNetworkResponseBody", new zzaka(bArr) { // from class: com.google.android.gms.internal.zzajy
            private final byte[] zzdei;

            {
                this.zzdei = bArr;
            }

            @Override // com.google.android.gms.internal.zzaka
            public final void zza(JsonWriter jsonWriter) {
                zzajv.zza(this.zzdei, jsonWriter);
            }
        });
    }

    public static final void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zza(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public static final void zza(byte[] bArr, JsonWriter jsonWriter) {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length >= 10000) {
            encodeToString = zzajr.zzcp(encodeToString);
            str = encodeToString != null ? "bodydigest" : "body";
            jsonWriter.name("bodylength").value(length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(encodeToString);
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }
}
