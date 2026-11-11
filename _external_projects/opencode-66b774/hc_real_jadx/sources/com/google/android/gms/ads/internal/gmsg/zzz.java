package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzzv;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzz implements zzt<Object> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Context f2614;

    public zzz(Context context) {
        this.f2614 = context;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        if (zzbs.zzfd().zzq(this.f2614)) {
            zzbs.zzfd().zza(this.f2614, map.get("eventName"), map.get("eventId"));
        }
    }
}
