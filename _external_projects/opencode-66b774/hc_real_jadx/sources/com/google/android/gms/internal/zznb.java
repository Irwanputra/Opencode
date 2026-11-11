package com.google.android.gms.internal;

import android.content.SharedPreferences;
import org.json.JSONObject;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznb extends zzmx<Float> {
    public zznb(int i, String str, Float f) {
        super(i, str, f, null);
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Float zza(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(getKey(), zziv().floatValue()));
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ void zza(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(getKey(), f.floatValue());
    }

    @Override // com.google.android.gms.internal.zzmx
    public final /* synthetic */ Float zzc(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(getKey(), zziv().floatValue()));
    }
}
