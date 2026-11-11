package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzmy extends zzmx<Boolean> {
    public zzmy(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Boolean zza(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(getKey(), zziv().booleanValue()));
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(getKey(), bool.booleanValue());
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Boolean zzc(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(getKey(), zziv().booleanValue()));
    }
}
