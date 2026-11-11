package com.google.android.gms.internal;

import p034.p095.C1687;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzadc extends zzadi {
    private final String zzcuv;
    private final int zzcuw;

    public zzadc(String str, int i) {
        this.zzcuv = str;
        this.zzcuw = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzadc)) {
            zzadc zzadcVar = (zzadc) obj;
            if (C1687.m3694(this.zzcuv, zzadcVar.zzcuv) && C1687.m3694(Integer.valueOf(this.zzcuw), Integer.valueOf(zzadcVar.zzcuw))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.zzadh
    public final int getAmount() {
        return this.zzcuw;
    }

    @Override // com.google.android.gms.internal.zzadh
    public final String getType() {
        return this.zzcuv;
    }
}
