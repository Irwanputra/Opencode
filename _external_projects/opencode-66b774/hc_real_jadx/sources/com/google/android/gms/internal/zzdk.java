package com.google.android.gms.internal;

import java.util.HashMap;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdk extends zzbt<Integer, Object> {
    public Long zzaim;
    public Boolean zzain;
    public Boolean zzaio;

    public zzdk() {
    }

    public zzdk(String str) {
        zzj(str);
    }

    @Override // com.google.android.gms.internal.zzbt
    public final void zzj(String str) {
        HashMap zzk = zzbt.zzk(str);
        if (zzk != null) {
            this.zzaim = (Long) zzk.get(0);
            this.zzain = (Boolean) zzk.get(1);
            this.zzaio = (Boolean) zzk.get(2);
        }
    }

    @Override // com.google.android.gms.internal.zzbt
    public final HashMap<Integer, Object> zzy() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.zzaim);
        hashMap.put(1, this.zzain);
        hashMap.put(2, this.zzaio);
        return hashMap;
    }
}
