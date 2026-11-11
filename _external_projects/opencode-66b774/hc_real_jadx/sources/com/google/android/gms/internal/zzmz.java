package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmz extends zzmx<Integer> {
    public zzmz(int i, String str, Integer num) {
        super(i, str, num, null);
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Integer zza(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(getKey(), zziv().intValue()));
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(getKey(), num.intValue());
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Integer zzc(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(getKey(), zziv().intValue()));
    }
}
