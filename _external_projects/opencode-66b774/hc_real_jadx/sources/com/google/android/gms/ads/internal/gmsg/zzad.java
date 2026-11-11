package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzzv;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzad implements zzt<Object> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Object f2610 = new Object();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Map<String, zzae> f2609 = new HashMap();

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("result");
        synchronized (this.f2610) {
            zzae remove = this.f2609.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                zzakb.zzcu(valueOf.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                remove.zzau(str3);
                return;
            }
            if (str4 == null) {
                remove.zze(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str4);
                if (zzagf.zzpz()) {
                    String valueOf2 = String.valueOf(jSONObject.toString(2));
                    zzagf.v(valueOf2.length() != 0 ? "Result GMSG: ".concat(valueOf2) : new String("Result GMSG: "));
                }
                remove.zze(jSONObject);
            } catch (JSONException e) {
                remove.zzau(e.getMessage());
            }
        }
    }

    public final void zza(String str, zzae zzaeVar) {
        synchronized (this.f2610) {
            this.f2609.put(str, zzaeVar);
        }
    }
}
