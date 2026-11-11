package com.google.android.gms.internal;

import android.view.View;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;
import p034.p080.C1493;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzze implements zzys<zzon> {
    private final boolean zzcln;

    public zzze(boolean z) {
        this.zzcln = z;
    }

    private static <K, V> C1493<K, V> zza(C1493<K, Future<V>> c1493) {
        C1493<K, V> c14932 = new C1493<>();
        for (int i = 0; i < c1493.f6910; i++) {
            c14932.put(c1493.m3246(i), c1493.m3255(i).get());
        }
        return c14932;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.zzys
    public final /* synthetic */ zzon zza(zzym zzymVar, JSONObject jSONObject) {
        C1493 c1493 = new C1493();
        C1493 c14932 = new C1493();
        zzakv<zzog> zzh = zzymVar.zzh(jSONObject);
        zzakv<zzanh> zzc = zzymVar.zzc(jSONObject, "video");
        JSONArray jSONArray = jSONObject.getJSONArray("custom_assets");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("type");
            if ("string".equals(string)) {
                c14932.put(jSONObject2.getString("name"), jSONObject2.getString("string_value"));
            } else if ("image".equals(string)) {
                c1493.put(jSONObject2.getString("name"), zzymVar.zza(jSONObject2, "image_value", this.zzcln));
            } else {
                String valueOf = String.valueOf(string);
                zzakb.zzcu(valueOf.length() != 0 ? "Unknown custom asset type: ".concat(valueOf) : new String("Unknown custom asset type: "));
            }
        }
        zzanh zzb = zzym.zzb(zzc);
        return new zzon(jSONObject.getString("custom_template_id"), zza(c1493), c14932, zzh.get(), zzb != 0 ? zzb.zzsg() : null, zzb != 0 ? (View) zzb : null);
    }
}
