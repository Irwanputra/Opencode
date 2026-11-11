package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzna extends zzmx<Long> {
    public zzna(int i, String str, Long l) {
        super(i, str, l, null);
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Long zza(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(getKey(), zziv().longValue()));
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Long l) {
        editor.putLong(getKey(), l.longValue());
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Long zzc(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(getKey(), zziv().longValue()));
    }
}
