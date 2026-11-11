package com.google.android.gms.internal;

import java.util.HashMap;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdl extends zzbt<Integer, Long> {
    public Long zzaip;
    public Long zzaiq;

    public zzdl() {
    }

    public zzdl(String str) {
        zzj(str);
    }

    @Override // com.google.android.gms.internal.zzbt
    public final void zzj(String str) {
        HashMap zzk = zzbt.zzk(str);
        if (zzk != null) {
            this.zzaip = (Long) zzk.get(0);
            this.zzaiq = (Long) zzk.get(1);
        }
    }

    @Override // com.google.android.gms.internal.zzbt
    public final HashMap<Integer, Long> zzy() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.zzaip);
        hashMap.put(1, this.zzaiq);
        return hashMap;
    }
}
