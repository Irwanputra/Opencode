package com.google.android.gms.internal;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzox implements com.google.android.gms.ads.internal.gmsg.zzt<Object> {
    private final WeakReference<zzot> zzaps;
    private final String zzaro;

    public zzox(zzot zzotVar, String str) {
        this.zzaps = new WeakReference<>(zzotVar);
        this.zzaro = str;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        zzot zzotVar;
        String str = map.get("ads_id");
        String str2 = map.get("eventName");
        if (TextUtils.isEmpty(str) || !this.zzaro.equals(str)) {
            return;
        }
        try {
            Integer.parseInt(map.get("eventType"));
        } catch (Exception e) {
            zzakb.zzb("Parse Scion log event type error", e);
        }
        if ("_ai".equals(str2)) {
            zzot zzotVar2 = this.zzaps.get();
            if (zzotVar2 != null) {
                zzotVar2.zzbz();
                return;
            }
            return;
        }
        if (!"_ac".equals(str2) || (zzotVar = this.zzaps.get()) == null) {
            return;
        }
        zzotVar.zzca();
    }
}
