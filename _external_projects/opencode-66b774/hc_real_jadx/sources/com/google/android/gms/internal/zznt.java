package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznt {
    private final zznu zzanj;
    private final Map<String, zzns> zzbsp = new HashMap();

    public zznt(zznu zznuVar) {
        this.zzanj = zznuVar;
    }

    public final void zza(String str, zzns zznsVar) {
        this.zzbsp.put(str, zznsVar);
    }

    public final void zza(String str, String str2, long j) {
        zznu zznuVar = this.zzanj;
        zzns zznsVar = this.zzbsp.get(str2);
        String[] strArr = {str};
        if (zznuVar != null && zznsVar != null) {
            zznuVar.zza(zznsVar, j, strArr);
        }
        Map<String, zzns> map = this.zzbsp;
        zznu zznuVar2 = this.zzanj;
        map.put(str, zznuVar2 == null ? null : zznuVar2.zzd(j));
    }

    public final zznu zzje() {
        return this.zzanj;
    }
}
