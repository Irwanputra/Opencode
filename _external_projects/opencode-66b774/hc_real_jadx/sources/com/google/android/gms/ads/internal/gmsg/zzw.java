package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzw implements zzt<Object> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzx f2612;

    public zzw(zzx zzxVar) {
        this.f2612 = zzxVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat(map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            zzakb.zzb("Fail to parse float", e);
        }
        this.f2612.zzd(equals);
        this.f2612.zza(equals2, f);
    }
}
