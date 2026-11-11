package com.google.android.gms.internal;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzpd implements com.google.android.gms.ads.internal.gmsg.zzt<Object> {
    private /* synthetic */ zzzb zzbva;
    private /* synthetic */ zzoy zzbvb;

    public zzpd(zzoy zzoyVar, zzzb zzzbVar) {
        this.zzbvb = zzoyVar;
        this.zzbva = zzzbVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : map.keySet()) {
                jSONObject.put(str2, map.get(str2));
            }
            str = this.zzbvb.zzbuz;
            jSONObject.put("id", str);
            this.zzbva.zza("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            zzakb.zzb("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
