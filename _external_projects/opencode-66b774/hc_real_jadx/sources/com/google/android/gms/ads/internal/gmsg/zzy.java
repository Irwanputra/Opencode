package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzalf;
import com.google.android.gms.internal.zzzv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzy implements zzt<Object> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public HashMap<String, zzalf<JSONObject>> f2613 = new HashMap<>();

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String str2 = map.get("fetched_ad");
        zzakb.zzbx("Received ad from the cache.");
        zzalf<JSONObject> zzalfVar = this.f2613.get(str);
        try {
            if (zzalfVar == null) {
                zzakb.e("Could not find the ad request for the corresponding ad response.");
            } else {
                zzalfVar.set(new JSONObject(str2));
            }
        } catch (JSONException e) {
            zzakb.zzb("Failed constructing JSON object from value passed from javascript", e);
            zzalfVar.set(null);
        } finally {
            this.f2613.remove(str);
        }
    }

    public final Future<JSONObject> zzas(String str) {
        zzalf<JSONObject> zzalfVar = new zzalf<>();
        this.f2613.put(str, zzalfVar);
        return zzalfVar;
    }

    public final void zzat(String str) {
        zzalf<JSONObject> zzalfVar = this.f2613.get(str);
        if (zzalfVar == null) {
            zzakb.e("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!zzalfVar.isDone()) {
            zzalfVar.cancel(true);
        }
        this.f2613.remove(str);
    }
}
