package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaf implements zzt<Object> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final zzag f2611;

    public zzaf(zzag zzagVar) {
        this.f2611 = zzagVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.f2611.zzdl();
                return;
            }
            return;
        }
        zzaeq zzaeqVar = null;
        try {
            int parseInt = Integer.parseInt(map.get("amount"));
            String str2 = map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzaeqVar = new zzaeq(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            zzakb.zzc("Unable to parse reward amount.", e);
        }
        this.f2611.zzb(zzaeqVar);
    }
}
