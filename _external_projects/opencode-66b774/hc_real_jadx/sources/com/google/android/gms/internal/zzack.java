package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzack implements com.google.android.gms.ads.internal.gmsg.zzt<Object> {
    private /* synthetic */ zzach zzcrz;

    public zzack(zzach zzachVar) {
        this.zzcrz = zzachVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        Object obj2;
        zzalf zzalfVar;
        String str;
        zzalf zzalfVar2;
        obj2 = this.zzcrz.mLock;
        synchronized (obj2) {
            zzalfVar = this.zzcrz.zzcrv;
            if (zzalfVar.isDone()) {
                return;
            }
            zzacn zzacnVar = new zzacn(-2, map);
            str = this.zzcrz.zzcrt;
            if (str.equals(zzacnVar.getRequestId())) {
                zzalfVar2 = this.zzcrz.zzcrv;
                zzalfVar2.set(zzacnVar);
            }
        }
    }
}
