package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzadb implements zzacf {
    private zztp<JSONObject, JSONObject> zzcup;
    private zztp<JSONObject, JSONObject> zzcuu;

    public zzadb(Context context) {
        zztx zzb = zzbs.zzev().zzb(context, zzakd.zzrd());
        zztt<JSONObject> zzttVar = zztu.zzccb;
        this.zzcuu = zzb.zza("google.afma.request.getAdDictionary", zzttVar, zzttVar);
        this.zzcup = zzbs.zzev().zzb(context, zzakd.zzrd()).zza("google.afma.sdkConstants.getSdkConstants", zzttVar, zzttVar);
    }

    @Override // com.google.android.gms.internal.zzacf
    public final zztp<JSONObject, JSONObject> zznq() {
        return this.zzcuu;
    }

    @Override // com.google.android.gms.internal.zzacf
    public final zztp<JSONObject, JSONObject> zznr() {
        return this.zzcup;
    }
}
